# Bezier-Compose
[![](https://jitpack.io/v/channel-io/bezier-compose.svg)](https://jitpack.io/#channel-io/bezier-compose) <br>
ChannelTalk의 Bezier DesignSystem을 Jetpack Compose로 구현한 레포지토리입니다.

## 요구 사항

minSdk = 21

## 코딩 컨벤션
[컨벤션 문서](./CONVENTIONS.md)를 참고 해주세요.

## 설치하기

jitpack 저장소에 배포되어 있어, 저장소를 추가해야합니다.

```
// build.gradle (:project)
allprojects {
    repositories {
        // ...
        mavenCentral()
        maven { url "https://jitpack.io" }
    }
}

```

만약 kts라면 다음과 같이 설정해주세요.

```
// build.gradle.kts (:project)
allprojects {
    repositories {
        // ...
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}

```

모듈 단위의 build.gradle에 의존성을 추가합니다.

```
// build.gradle (:app)
dependencies {
    implementation 'com.github.channel-io:bezier-compose:bezier_compose_version'
}
```

만약 kts라면 다음과 같이 설정해주세요.

```
// build.gradle.kts (:app)
dependencies {
    implementation("com.github.channel-io:bezier-compose:$bezier_compose_version")
}
```
