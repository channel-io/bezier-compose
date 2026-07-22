# TextInput Spec

> Figma: [🚧 Mobile Components — TextInput](https://www.figma.com/design/46idSffz5wpiLD5ykWUFZY/%F0%9F%9A%A7-Mobile-Components?node-id=3612-2&m=dev)
> Figma node ID: `3612:2`
> Design spec doc: [channel-io/team-design — TextInput-spec.md](https://github.com/channel-io/team-design/blob/main/bezier-v3/components/TextInput-spec.md)

단일 행 텍스트 입력 필드.

- **모양**: 사각형. 모서리 반경 size별 12 / 14.
- **width**: 기본 fill(부모 폭 채움). 최소 너비 40. (Figma auto-layout 한계로 비율 지정은 FILL/FIXED/HUG로만 표현)
- **금지 조합**: `secondary` + `error` (Figma description 명시). Figma 매트릭스에는 해당 variant가 존재하나 사용을 금지한다.

---

## 1. Component Properties

Figma 컴포넌트가 정의하는 property는 다음이 전부다.

| Property | 값 | 비고 |
|---|---|---|
| **variant** | `primary` / `secondary` | 배경·테두리 표현 방식 |
| **size** | `small` / `medium` | 크기 축 |
| **state** | `default` / `focused` / `error` / `readOnly` / `disabled` | 시각 상태 축 |
| **hasValue** | `false` / `true` | placeholder 표시(false) / 입력값 표시(true) |

총 instance: `2 (variant) × 2 (size) × 5 (state) × 2 (hasValue) = 40개` (Figma 노출 인스턴스 수와 일치)

추가 인스턴스 토글 / 슬롯 props (Figma component property 기준):

| Toggle/Slot | 기본값 | 효과 |
|---|---|---|
| `hasLeadingContent` | `false` | true 면 leading 위치에 슬롯 표시 (아이콘 또는 TextInputAffix 배치) |
| `hasTrailingContent` | `false` | true 면 trailing 위치에 20 슬롯 표시 |
| `allowClear` | `false` | 시스템 자동 요소. 입력값 삭제(X) 버튼 |
| `passwordToggle` | `false` | 시스템 자동 요소. 비밀번호 표시/숨김(눈) 버튼 |
| `placeholder` | `"placeholder"` | 미입력 시 표시 텍스트 |
| `leadingContent` / `trailingContent` | (없음) | 슬롯 콘텐츠 |

---

## 2. Size 별 Spec

단위는 Android 관용에 따라 `dp` (텍스트는 `sp`로 해석).

| Size | Height | Horizontal Padding | Vertical Padding | Item Gap | Corner Radius | Min Height | Min Width |
|---|---|---|---|---|---|---|---|
| `small` | 40 | 10 | 5 | 6 | 12 | 20 | 40 |
| `medium` | 48 | 10 | 7 | 6 | 14 | 20 | 40 |

### 슬롯 크기

| 슬롯 | small | medium |
|---|---|---|
| `leadingContent` | 26 × 20 | 30 × 24 |
| `trailingContent` | 20 × 20 | 20 × 20 |
| `allowClear` (시스템) | 20 × 20 | 20 × 20 |
| `passwordToggle` (시스템) | 20 × 20 | 20 × 20 |

- Corner radius는 Variable `radius/12`(small) / `radius/14`(medium).
- `leadingContent` / `trailingContent`는 콘텐츠 슬롯 — 위 수치는 Figma placeholder 콘텐츠 기준 크기이며, 실제 콘텐츠는 슬롯에 세로 중앙 정렬한다.
- `allowClear` / `passwordToggle`는 20 아이콘 슬롯이다. 내부 shape inset은 §7 참조 (allowClear `8.33%`, passwordToggle 비대칭).

---

## 3. Variant × State 별 컬러 토큰

### Background (fill)

| variant | state | Variable | Raw |
|---|---|---|---|
| `primary` | `default` | `color/fill/grey` | `#fbfbfb` |
| `primary` | `focused` | `color/fill/grey/light` | `#fdfdfd` |
| `primary` | `error` | `color/fill/grey/light` | `#fdfdfd` |
| `primary` | `readOnly` | `color/fill/grey/heavy` | `#f7f7f8` |
| `primary` | `disabled` | `color/fill/grey` | `#fbfbfb` |
| `secondary` | `default` | `color/fill/neutral/light` | `#0000000d` |
| `secondary` | `focused` | `color/fill/neutral/light` | `#0000000d` |
| `secondary` | `error` | `color/fill/neutral/light` | `#0000000d` |
| `secondary` | `readOnly` | `color/fill/neutral/light` | `#0000000d` |
| `secondary` | `disabled` | `color/fill/neutral/light` | `#0000000d` |

> `secondary`의 fill은 모든 state에서 `color/fill/neutral/light`로 동일하다.

### Border (inner shadow, inset 1.5 spread)

| variant | state | Variable | Raw |
|---|---|---|---|
| `primary` | `default` | `color/state/default` | `#00000026` |
| `primary` | `focused` | `color/state/active` | `#000000d9` |
| `primary` | `error` | `color/state/warning` | `#e67f2b` |
| `primary` | `readOnly` | `color/state/default` | `#00000026` |
| `primary` | `disabled` | `color/state/default` | `#00000026` |
| `secondary` | `default` | — *(border 없음)* | — |
| `secondary` | `focused` | `color/state/active` | `#000000d9` |
| `secondary` | `error` | `color/state/warning` | `#e67f2b` |
| `secondary` | `readOnly` | — *(border 없음)* | — |
| `secondary` | `disabled` | — *(border 없음)* | — |

> Border effect: `INNER_SHADOW`, offset `(0,0)`, radius `0`, spread `1.5` → inset 1.5 테두리.
> `secondary`는 `focused` / `error`에서만 border를 가진다 (default / readOnly / disabled는 border 없음).

### Text color

| hasValue | state | Variable | Raw |
|---|---|---|---|
| `false` (placeholder) | 모든 state | `color/text/neutral/lighter` | `#00000066` |
| `true` (value) | `default` / `focused` / `error` / `disabled` | `color/text/neutral` | `#000000d9` |
| `true` (value) | `readOnly` | `color/text/neutral/light` | `#00000099` |

> placeholder 텍스트 색은 모든 state에서 `color/text/neutral/lighter`로 동일하다.
> value 텍스트는 `readOnly`에서만 한 단계 옅은 `color/text/neutral/light`를 쓴다.

### Icon color (시스템 요소 `allowClear` / `passwordToggle`)

`allowClear` / `passwordToggle` 아이콘은 Figma에서 raw SVG(fill `black`, opacity `0.4`)로 인라인되어 있어 변수(`variable_defs`)에 노출되지 않는다. 렌더 색은 `black @ 0.4` = `#00000066`.

| 슬롯 | Raw | 비고 |
|---|---|---|
| `allowClear` / `passwordToggle` | `#00000066` (black @ 0.4) | 시스템 아이콘. `leadingContent`/`trailingContent`는 caller 콘텐츠라 색 미지정 |

---

## 4. Disabled

| Property | 값 |
|---|---|
| opacity | Variable `opacity/disabled` = `40` (0.4) |

`disabled` state는 해당 variant의 `default` 시각(fill·border)에 컨테이너 전체 opacity `0.4`를 적용한다 (별도 색 토큰 변경 없음).

---

## 5. State 별 시각 동작

| State | primary | secondary | 인터랙션 |
|---|---|---|---|
| `default` | fill `grey` + border `default` | fill `neutral/light` (border 없음) | 편집 가능 |
| `focused` | fill `grey/light` + border `active` | fill `neutral/light` + border `active` | 키보드 포커스 시. 런타임 파생 |
| `error` | fill `grey/light` + border `warning` | fill `neutral/light` + border `warning` (사용 금지) | 편집 가능 |
| `readOnly` | fill `grey/heavy` + border `default` | fill `neutral/light` (border 없음) | 편집 불가·선택 가능 |
| `disabled` | `default` 시각 + opacity 0.4 | `default` 시각 + opacity 0.4 | 비활성 |

### State 별 구현 가이드

- `focused`는 caller가 주입하는 값이 아니라 키보드 포커스에서 런타임 파생한다.
- `error` / `readOnly` / `disabled`는 caller 주입 값이다.
- `disabled`는 `default` 시각 위에 opacity 0.4만 적용한다 (readOnly / error / focused 시각과 결합하지 않음).
- `readOnly`는 배타적 시각 상태다 (active / warning border를 표시하지 않음).

---

## 6. Typography

이 컴포넌트의 텍스트 노드(placeholder / value)를 두 케이스로 분리해 기재한다.

### Case A — Typography Token 사용

| 위치 | Token | Figma Style 이름 | 구성 |
|---|---|---|---|
| placeholder / value | `Typography/text/xlarge` | `Typography/text/xlarge` | family=`text/font-family`(Inter) · weight=`text/weight/regular`(400) · size=`text/size/xlarge`(16) · line-height=`text/line-height/xlarge`(24) · letter-spacing=`text/letter-spacing/tight`(-0.1) |

### Case B — Custom Typography (토큰 미적용)

없음. 모든 텍스트가 `Typography/text/xlarge` 토큰을 사용한다.

---

## 7. 아이콘 자산 (시스템 요소)

| 항목 | allowClear | passwordToggle |
|---|---|---|
| Figma asset | raw SVG (`944dd209…svg`) | raw SVG (`fda3ae70…svg`) |
| 형태 | 채워진 원 + X (cancel-circle-filled) | 눈 (view) |
| 슬롯 크기 | 20 × 20 | 20 × 20 |
| 내부 shape inset | `8.33%` | `top 25% / bottom 26.62% / left 10.33% / right 8.49%` |
| 색상 | black @ 0.4 (`#00000066`) | black @ 0.4 (`#00000066`) |

> `allowClear`는 입력값이 있을 때 노출되어 값을 삭제한다. `passwordToggle`은 비밀번호 표시/숨김을 토글한다.

---

## 8. 매핑되는 코드 심볼

| 정의 | 파일 |
|---|---|
| Compose 구현 | `bezier/src/main/java/io/channel/bezier/v3/component/TextInput.kt` (`@Composable fun TextInput(...)`) |
| variant / size 정의 | 같은 파일 안 `enum class TextInputVariant`, `enum class TextInputSize` |
| 컬러 토큰 | `BezierTheme.colorsV3.<token>` (`BezierSemanticColorV3` 멤버) |
| Typography | `io.channel.bezier.typography.BezierTypo.TextXLarge` |
| allowClear 아이콘 | `BezierIcons.CancelCircleFilled` |
| passwordToggle 아이콘 | `BezierIcons.View` / `BezierIcons.ViewOff` |

### 컬러 토큰 → V3 매핑 (`BezierSemanticColorV3`)

| Figma Variable | Raw | V3 프로퍼티 | Light 매핑 |
|---|---|---|---|
| `color/fill/grey` | `#fbfbfb` | `fillGrey` | `Grey50` |
| `color/fill/grey/light` | `#fdfdfd` | `fillGreyLight` | `Grey25` |
| `color/fill/grey/heavy` | `#f7f7f8` | `fillGreyHeavy` | `Grey100` |
| `color/fill/neutral/light` | `#0000000d` | `fillNeutralLight` | `Black5` |
| `color/text/neutral` | `#000000d9` | `textNeutral` | `Black85` |
| `color/text/neutral/light` | `#00000099` | `textNeutralLight` | `Black60` |
| `color/text/neutral/lighter` | `#00000066` | `textNeutralLighter` | `Black40` |
| `color/state/default` | `#00000026` | `stateDefault` | `Black15` |
| `color/state/active` | `#000000d9` | `fillNeutralHeaviest` | `Black85` |
| `color/state/warning` | `#e67f2b` | `stateWarning` | `Orange400` |
| 시스템 아이콘 (black @ 0.4) | `#00000066` | `iconNeutral` | `Black40` |

> `color/state/active`(#000000d9 = Black85)에 정확히 대응하는 `stateActive` 프로퍼티가 V3에 없다. 동일 raw 값(Black85)을 갖고, Switch의 active(on) 트랙이 사용하는 `fillNeutralHeaviest`로 매핑한다.

---

## 9. Variant 매트릭스

총 instance: `2 (variant) × 2 (size) × 5 (state) × 2 (hasValue) = 40개`

```
variant × size × state × hasValue = Node ID

primary  small  default  false → 1105:3     true → 2451:146
primary  small  focused  false → 1105:5     true → 2451:154
primary  small  error    false → 1105:7     true → 2451:162
primary  small  readOnly false → 4548:925   true → 4548:931
primary  small  disabled false → 1105:9     true → 2451:170

primary  medium default  false → 1105:11    true → 2451:178
primary  medium focused  false → 1105:13    true → 2451:186
primary  medium error    false → 1105:15    true → 2451:194
primary  medium readOnly false → 4548:937   true → 4548:943
primary  medium disabled false → 1105:17    true → 2451:202

secondary small  default  false → 1105:27   true → 2451:242
secondary small  focused  false → 1105:29   true → 2451:250
secondary small  error    false → 1105:31   true → 2451:258
secondary small  readOnly false → 4548:949  true → 4548:955
secondary small  disabled false → 1105:33   true → 2451:266

secondary medium default  false → 1105:35   true → 2451:274
secondary medium focused  false → 1105:37   true → 2451:282
secondary medium error    false → 1105:39   true → 2451:290
secondary medium readOnly false → 4548:961  true → 4548:967
secondary medium disabled false → 1105:41   true → 2451:298
```
