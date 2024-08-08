# Bezier DesignSystem Conventions

_마지막 수정 일 - (2024.08.07)_

베지어 컴포넌트를 제작할 때의 컨벤션을 명시합니다.<br>
컨벤션의 수정은 충분한 토의 후 이루어져야 합니다.

컨벤션이 생겨난 이유는 각 항목별 옆 [참고] 로 링크합니다.<br>
토론없이 추가된 컨벤션의 경우 링크가 없을 수 있습니다.

## 컴포넌트

**편의 함수 [[참고]](https://github.com/channel-io/bezier-compose/pull/43#discussion_r1706514577)**

- 자주 사용될 것으로 예상되거나 주로 사용하는 옵션이라는 정의가 있을 때 추가합니다.
    - 2024.08.07 현재 명확한 기준은 없습니다.
- 여러 쌍을 만드려면 편의 함수가 기하급수적으로 증가합니다. 4개 쯤은 괜찮다고 판단하고
  너무 많아지는 경우가 생겨난다면 재논의 후 다른 방식을 채택합니다.

```kotlin
@Composable
fun BezierAvatar(url: String) {
     BezierAvatar(
         painter = rememberAsyncPainter(url)
     )
}

@Composable
fun BezierAvatar(painter: Painter) {
    // ...
}
```

**컴포넌트의 Size [[참고]](https://github.com/channel-io/bezier-compose/pull/42#discussion_r1699412100)**

- 외부로부터 modifier를 전달받는 Composable의 size는 requiredSize로 사이즈를 설정합니다.
- 가로로 가변적이거나 접근성을 위해 text가 들어가는 경우에는 제외입니다.

```kotlin
// Do
fun BezierStatusBadge(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.requiredSize(...)
    ) {
        Box(modifier = Modifier.size(...)
    }
}

// Don't
fun BezierStatusBadge(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.size(...)
    )
}
```

**네이밍 [[참고]](https://desk.channel.io/root/threads/groups/(Unit)Mobile디자인시스템-331277/664d9da776dbf8caf231/664da68b72f65d0db7b2) [[참고2]](https://desk.channel.io/root/groups/(Unit)Mobile디자인시스템-331277/66542f16c1c099455ee6)**

- 컴포넌트 이름과 프로퍼티 이름 앞에는 항상 Bezier를 붙입니다.

```kotlin
// Do
enum class BezierButtonColor

@Composable
fun BezierButton()

// Don't
enum class ButtonColor

@Composable
fun Button()
```

**Property 네이밍 [[참고]](https://github.com/channel-io/bezier-compose/pull/42#discussion_r1698643383)**

- 컴포넌트의 파라미터로 프로퍼티에는 prefix 없이 옵션 명만 넣습니다.

```kotlin
// Do
@Composable
fun BezierButton(
   size: BezierButtonSize,
)

// Don't
@Composable
fun BezierButton(
   bezierButtonSize: BezierButtonSize,
)
```

**Optional Modifier [[참고]](https://github.com/channel-io/bezier-compose/pull/42#discussion_r1699368350) [[참고2]](https://github.com/androidx/androidx/blob/androidx-main/compose/docs/compose-component-api-guidelines.md#modifier-parameter)**

- 제공하는 모든 디자인 컴포넌트에는 optional Modifier를 제공합니다.

```kotlin
// Do
fun BezierButton(
    size: BezierButtonSize,
    modifier: Modifier = Modifier,
)

// Don't
fun BezierButton(
    size: BezierButtonSize,
)

fun BezierButton(
    size: BezierButtonSize,
    modifier: Modifier,
)
```

**Bezier[Color, Icon]**

- 의도하지 않은 색상과 아이콘을 방지하기 위해 모든 컴포넌트는 Bezier[Color, Icon]을 사용합니다.

```kotlin
// Do
fun SomeComponent(
     color: BezierColor,
     icon: BezierIcon,
)

// Don't
fun SomeComponent(
     color: Color,
     icon: imageVector,
)
```

## 프로퍼티

**Enum [[참고]](https://github.com/channel-io/bezier-compose/pull/16#discussion_r1680534727)**

- when(this) 를 사용하지 않습니다.

```kotlin
// Do
enum class BezierButtonColor(
    internal val backgroundColor: @Composable () -> BezierColor
) {
    Blue({...}),
    Red({...}),
}

// Don't
enum class BezierButtonColor {
    Blue,
    Red;
    
    @Composable
    internal fun backgroundColor(): BezierColor {
        return when(this) {
            Blue -> ...
            Red -> ...
        }
    }
}
```

- 의존적인 속성이 있으면 함수로 만들고 매개변수를 통해 표현합니다.

```kotlin
// Do
enum class BezierButtonColor(
    private val primaryBackgroundColor: @Composable () -> BezierColor,
    private val secondaryBackgroundColor: @Composable () -> BezierColor,
) {
    Blue({...}),
    Red({...});
    
    internal fun getBackgroundColor(variant: BezierButtonVariant): BezierColor {
        return when (variant) {
            primary -> primaryBackgroundColor()
            secondary -> secondaryBackgroundColor()
        }
    }
}

// Don't
internal fun getBackgroundColor(color: BezierButtonColor, variant: BezierButtonVariant): BezierColor {
    return when (variant) {
        primary -> when(color) {
            Blue -> ...
            Red -> ...
        }
       secondary -> when(color) {
            Blue -> ...
            Red -> ...
        }
    }
}
```

특정 타입에만 속성이 없는 경우 [[구두 논의, 참고 PR]](https://github.com/channel-io/bezier-compose/pull/47)

- 해당 디자인이 표시될 경우는 없다는 전제하에, 아예 안보이지만 않도록 작업자의 재량으로 적당한 값을 채웁니다.

접근 제한

- 디자인 시스템에서 사용하는 property는 전부 internal 접근 제한자를 붙입니다.
- Preview는 private 접근 제한자를 붙입니다.

```kotlin
// Do
enum class BezierButtonColor(
    internal val backgroundColor: @Composable () -> BezierColor,
)

// Don't
enum class BezierButtonColor(
    val backgroundColor: @Composable () -> BezierColor,
)

enum class BezierButtonColor(
    private val backgroundColor: @Composable () -> BezierColor,
)
```

Properties에서 값을 반환할 때 Color와 Icon은 BezierColor와 BezierIcon으로 반환하도록 합니다.

- Molecules 이상의 단위의 컴포넌트에서 조합된 컴포넌트에 값을 넘길 수 없을 수 있습니다.
- Atoms인 경우에도 통일성을 위해 BezierColor와 BezierIcon을 반환합니다.

```kotlin
// Do
enum class BezierButtonColor(
    internal val backgroundColor: @Composable () -> BezierColor,
)

// Don't
enum class BezierButtonColor(
    internal val backgroundColor: @Composable () -> Color,
)
```

## 패키지

폴더 [[참고]](https://github.com/channel-io/bezier-compose/pull/16#issuecomment-2222027811)

- 모든 컴포넌트는 component 폴더 하위에 properties 패키지와 컴포넌트 파일로 생성합니다.
- bezier prefix를 제외하고 생성합니다.

```kotlin
component
ㄴ button
    ㄴ properties
        ㄴ BezierButtonColor.kt
    BezierButton.kt
```
