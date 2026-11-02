# Bezier KMP 빌드 기반 — MOB-8410

## 이번 변경의 범위

`:bezier`에 Android·Wasm·iOS 타깃과 공통 소스 구성을 추가합니다.
실제 Bezier API 중 `SmoothRoundedCornerShape` 하나를 `commonMain`으로 이동해
각 타깃에서 공유 코드를 컴파일할 수 있는지 확인합니다.
기존 Android sample은 프로젝트 의존성으로 라이브러리를 소비합니다.
테마·아이콘·컴포넌트의 공통화는 MOB-8411~8414에서 진행합니다.

## 도구와 의존성

| 도구 | 버전 |
| --- | --- |
| JDK / Android JVM target | 17 |
| Gradle | 8.13 |
| AGP | 8.13.2 |
| Kotlin / Compose compiler | 2.3.20 |
| Compose Multiplatform | 1.10.3 |
| Android Jetpack Compose | 1.10.5 |
| Android compileSdk / minSdk | 36 / 23 |

AGP·Gradle을 유지하고 Kotlin을 해당 조합의 호환 범위로 올립니다.
공통 코드는 `org.jetbrains.compose.*` 의존성을 사용하며 Android 직접 의존성은
해당 Compose Multiplatform 릴리스에 대응하는 버전으로 고정합니다.
Android Compose BOM을 공통 source set에 적용하지 않습니다.

현재 라이브러리는 Kotlin metadata 2.3.0을 사용하므로 Kotlin 2.1.20 소비자에서는
컴파일할 수 없습니다. 기존 Kotlin 소비자 지원 범위는 이번 변경을 검토할 때 확정해야 하며,
배포 전 소비자 도구 요구 사항에 반영해야 합니다.

근거: [KMP 호환성 표](https://kotlinlang.org/docs/multiplatform/multiplatform-compatibility-guide.html),
[Compose 버전 대응표](https://kotlinlang.org/docs/multiplatform/compose-compatibility-and-versioning.html),
[Android KMP 플러그인](https://developer.android.com/kotlin/multiplatform/plugin).

## 소스와 Android 경계

* `commonMain`: `SmoothRoundedCornerShape` 구현입니다. JVM `Math.PI`를
  `kotlin.math.PI`로 바꾸고 Android preview를 별도 Android 파일로 분리합니다.
* `androidMain`: 기존 `bezier/src/main/java`를 연결합니다.
  테마·컴포넌트·생성 아이콘은 후속 티켓에서 순서대로 이동합니다.
* Android 리소스는 기존 `bezier/src/main/res`를 연결합니다.
  아이콘 생성기와 기존 XML 소비자의 경로를 유지합니다.
* `androidHostTest`와 `androidDeviceTest`는 각각 기존 `src/test/java`와
  `src/androidTest/java`를 사용합니다.

새 Android KMP 플러그인은 build type을 나누지 않는 단일 Android variant를 제공합니다.
`:bezier:assembleDebug` 대신 `:bezier:assembleAndroidMain`을 사용합니다.
기존 Android 전용 `release` publication 등록은 KMP의 자동 publication으로 대체됩니다.
배포 저장소와 좌표를 확정하는 작업은 MOB-8416에서 진행합니다.
Kotlin/Wasm 플러그인의 Node·Yarn용 Ivy 저장소 추가를 허용하기 위해
`FAIL_ON_PROJECT_REPOS`는 사용하지 않습니다.

## 컴파일 검증

JDK 17과 Android SDK가 필요하며 iOS 명령은 macOS + Xcode에서 실행합니다.

```sh
export JAVA_HOME="$(/usr/libexec/java_home -v 17)"
./gradlew :sample:assembleDebug :bezier:testAndroidHostTest :bezier:assembleAndroidDeviceTest
./gradlew :bezier:compileKotlinWasmJs
./gradlew :bezier:compileKotlinIosArm64 :bezier:compileKotlinIosSimulatorArm64
```

Android sample 빌드는 기존 playground가 변경된 라이브러리를 소비하는지 확인합니다.
Wasm·iOS 컴파일 성공만으로 해당 플랫폼의 UI 실행을 보장하지 않습니다.
기존 host test는 단순 예제이므로 UI 회귀 검증을 대체하지 않습니다.
Device test APK 빌드와 instrumented test 실행도 구분합니다.

## 후속 티켓

* MOB-8415: 공유 갤러리, Android·Wasm host, 가능한 iOS simulator host와 상호작용 검증.
* MOB-8416: 로컬 Maven 배포와 산출물 소비, KMP metadata, 실제 배포 저장소 및 CI.
  기존 Android 좌표·바이너리 호환성과 확정된 Kotlin 소비자 도구 요구 사항도 여기서 확인합니다.

이번 변경에는 샘플 host 추가, 배포 소비자 전환 옵션 및 검증용 저장소를 포함하지 않습니다.
