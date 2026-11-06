import org.gradle.api.component.ComponentWithVariants
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidMultiplatformLibrary)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    `maven-publish`
}

kotlin {
    android {
        namespace = "io.channel.bezier.compose"
        compileSdk = 36
        minSdk = 23
        compilerOptions { jvmTarget.set(JvmTarget.JVM_17) }
        androidResources.enable = true
        withHostTest {}
        withDeviceTest {
            instrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        }
    }
    @OptIn(org.jetbrains.kotlin.gradle.ExperimentalWasmDsl::class)
    wasmJs { browser() }
    iosArm64()
    iosSimulatorArm64()

    sourceSets {
        commonMain.dependencies {
            api(libs.multiplatform.foundation)
            api(libs.multiplatform.ui)
        }
        commonTest.dependencies { implementation(kotlin("test")) }
        androidMain {
            // MOB-8411..8414에서 점진적으로 이동할 기존 Android 구현입니다.
            kotlin.srcDir("src/main/java")
            dependencies {
                implementation(libs.core.ktx)
                implementation(libs.material)
                implementation(libs.ui.tooling.preview)
                implementation(libs.coil)
                implementation(libs.coil.gif)
            }
        }
        getByName("androidHostTest") {
            kotlin.srcDir("src/test/java")
            dependencies { implementation(libs.junit) }
        }
        getByName("androidDeviceTest") {
            kotlin.srcDir("src/androidTest/java")
            dependencies {
                implementation(libs.androidx.test.ext.junit)
                implementation(libs.espresso.core)
                implementation(libs.ui.test.junit4)
            }
        }
    }
}

androidComponents {
    onVariants { variant ->
        // 아이콘 생성기와 기존 XML 소비자의 경로를 유지합니다.
        variant.sources.res?.addStaticSourceDirectory("src/main/res")
    }
}

composeCompiler {
    reportsDestination = layout.buildDirectory.dir("compose_compiler")
}

gradle.projectsEvaluated {
    publishing.publications.withType<MavenPublication>().configureEach {
        groupId = "com.github.channel-io.bezier-compose"
    }
    publishing.publications.create<MavenPublication>("androidCompatibility") {
        // 기존 Android 소비자의 com.github.channel-io:bezier-compose 좌표 호환성을 유지합니다.
        groupId = "com.github.channel-io"
        artifactId = "bezier-compose"
        val multiplatform = components["kotlin"] as ComponentWithVariants
        from(multiplatform.variants.single { it.name == "android" })
    }
}
