pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    // Kotlin/Wasm의 Node·Yarn 설치 작업은 프로젝트에 배포용 Ivy 저장소를 추가합니다.
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "BezierCompose"
include(":sample")
include(":bezier")
