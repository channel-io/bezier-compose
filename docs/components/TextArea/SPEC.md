# TextArea Spec

> Figma: [🚧 Mobile-Components](https://www.figma.com/design/46idSffz5wpiLD5ykWUFZY/%F0%9F%9A%A7-Mobile-Components?node-id=1850-13&m=dev)
> Design spec doc: https://github.com/channel-io/team-design/blob/main/bezier-v3/components/TextArea-spec.md

여러 줄 텍스트를 작성하는 입력 영역. 설명, 메모, 답변 템플릿 등에 사용.

- **모양**: 사각형 (radius 12)
- **Accessibility**: hasError 사용 시 반드시 에러 메시지를 함께 표시할 것 (빨간 테두리만 표시 금지)
- **인접 배치**: 한 줄 입력(이름·이메일 등)에는 TextInput을 사용

---

## 1. Component Properties

| Property | 값 | 비고 |
|---|---|---|
| **state** | `default` / `focused` / `error` / `readOnly` / `disabled` | Figma 설계용 |
| **hasValue** | `false` / `true` | 값 유무 상태 시각 확인용 |

총 instance: `5 × 2 = 10개`

---

## 2. Layout Spec

| 항목 | 값 |
|---|---|
| width | fill (min-width 40) |
| min-height | 64 |
| max-height | 160 |
| padding horizontal | 10 |
| padding vertical | 8 |
| corner radius | 12 |
| border width | 1.5 (inset) |
| overflow | clip |

- 단위는 Android 관용에 따라 `dp`
- min-height 64 = 2행, max-height 160 = 6행 (line-height 24 기준)
- border는 inset stroke (inner shadow spread 1.5px)

---

## 3. State 별 컬러 토큰

### Background

| State | Background | Figma Variable | Raw |
|---|---|---|---|
| `default` | `fillGrey` | `color/fill/grey` | `#fbfbfb` |
| `focused` | `fillGreyLight` | `color/fill/grey/light` | `#fdfdfd` |
| `error` | `fillGreyLight` | `color/fill/grey/light` | `#fdfdfd` |
| `readOnly` | `fillGreyHeavy` | `color/fill/grey/heavy` | `#f7f7f8` |
| `disabled` | `fillGrey` | `color/fill/grey` | `#fbfbfb` |

### Border

| State | Border | Figma Variable | Raw |
|---|---|---|---|
| `default` | `stateDefault` | `color/state/default` | `#00000026` |
| `focused` | `stateActive` | `color/state/active` | `#000000d9` |
| `error` | `stateWarning` | `color/state/warning` | `#e67f2b` |
| `readOnly` | `stateDefault` | `color/state/default` | `#00000026` |
| `disabled` | `stateDefault` | `color/state/default` | `#00000026` |

### Text color

| State | hasValue | Text | Figma Variable | Raw |
|---|---|---|---|---|
| 전체 | `false` (placeholder) | `textNeutralLighter` | `color/text/neutral/lighter` | `#00000066` |
| `default` · `focused` · `error` · `disabled` | `true` | `textNeutral` | `color/text/neutral` | `#000000d9` |
| `readOnly` | `true` | `textNeutralLight` | `color/text/neutral/light` | `#00000099` |

---

## 4. Typography

### Case A — Typography Token 사용

| 위치 | Token | Figma Style 이름 |
|---|---|---|
| placeholder / value | `BezierTypo.TextXLarge` | `Typography/text/xlarge` |

`text/xlarge`: Inter / size 16 / weight regular(400) / line-height 24 / letter-spacing tight(-0.1)

---

## 5. State 별 시각 동작

| State | Background | Border | Value Text | Interaction |
|---|---|---|---|---|
| `default` | `fillGrey` | `stateDefault` | `textNeutral` | 입력 가능 |
| `focused` | `fillGreyLight` | `stateActive` | `textNeutral` | 포커스 (입력 중) |
| `error` | `fillGreyLight` | `stateWarning` | `textNeutral` | 입력 가능 |
| `readOnly` | `fillGreyHeavy` | `stateDefault` | `textNeutralLight` | 읽기 전용 |
| `disabled` | `fillGrey` | `stateDefault` | `textNeutral` | 비활성 (opacity 0.4) |

- placeholder(hasValue=false) 텍스트는 state와 무관하게 `textNeutralLighter`
- `disabled`는 컨테이너 전체 opacity 0.4

---

## 6. 디자이너 가이드라인 (Figma 컴포넌트 description 인용)

- width: 기본 fill(부모 폭 채움). 최소 너비 40px
- 모바일 기본 높이 64px(2행) / 최대 160px(6행) (line-height 24px 기준)
- hasError 사용 시 반드시 에러 메시지를 함께 표시할 것 (빨간 테두리만 표시 금지)
- 한 줄 입력(이름·이메일 등)에는 TextInput을 사용

---

## 7. 매핑되는 코드 심볼

| 정의 | 파일 |
|---|---|
| Compose 구현 | `bezier/src/main/java/io/channel/bezier/v3/component/TextArea.kt` (`@Composable fun TextArea(...)`) |
| 컬러 토큰 | `BezierTheme.colorsV3.tokenName` (`BezierSemanticColorV3` 멤버) |
| 신규 컬러 토큰 | `stateActive` (`BezierSemanticColorV3` 신규 추가 대상) |
| Typography 토큰 | `BezierTypo.TextXLarge` |

---

## 8. Variant 매트릭스

총 instance: `5 × 2 = 10개`

```
state=default,  hasValue=false = 1850:3
state=focused,  hasValue=false = 1850:5
state=error,    hasValue=false = 1850:7
state=readOnly, hasValue=false = 1850:9
state=disabled, hasValue=false = 1850:11
state=default,  hasValue=true  = 4542:66
state=focused,  hasValue=true  = 4542:68
state=error,    hasValue=true  = 4542:70
state=readOnly, hasValue=true  = 4542:72
state=disabled, hasValue=true  = 4542:74
```
