# Badge Spec

> Figma: [🚧 Mobile Components — Badge](https://www.figma.com/design/46idSffz5wpiLD5ykWUFZY/%F0%9F%9A%A7-Mobile-Components?node-id=1729-170&m=dev)
> Figma node ID: `1729:170`
> Design spec doc: [channel-io/design-team — Badge-spec.md](https://github.com/channel-io/design-team/blob/main/specs/components/Badge-spec.md)

목록·카드 UI에서 항목의 상태나 속성을 색상과 텍스트로 즉각 전달하는 인라인 레이블.

- **모양**: 알약형(pill). 모서리 반경 32.
- **인터랙션**: 읽기 전용. 사용자가 제거할 수 있어야 한다면 Tag 컴포넌트 사용.
- **State**: Figma에 state property 없음 (default만 존재). pressed/active/disabled/loading 없음.

---

## 1. Component Properties

Figma 컴포넌트가 정의하는 property는 다음이 전부다.

| Property | 값 | 비고 |
|---|---|---|
| **size** | `xsmall` / `small` / `medium` / `large` | 크기 축 |
| **color** | `default` / `monochrome-light` / `monochrome-dark` / `blue` / `cobalt` / `teal` / `green` / `olive` / `pink` / `navy` / `yellow` / `orange` / `red` / `purple` | 의미 색상 축 — green=성공·활성 / red=오류·긴급 / orange=경고 / blue=정보·진행 / monochrome-light=비활성·초안 |

총 instance: `4 × 14 = 56개` (Figma 노출 인스턴스 수와 일치)

추가 인스턴스 토글 props (Figma component property 기준):

| Toggle/Slot | 기본값 | 효과 |
|---|---|---|
| `hasIcon` | `false` | true 면 leading 위치에 16dp 아이콘 슬롯 표시 |
| `iconSource` | (없음) | `hasIcon = true`일 때 표시할 아이콘 소스. 기본 placeholder는 Figma asset `icon/plus` |
| `label` | `"Badge"` | 본문 텍스트 |

---

## 2. Size 별 Spec

단위는 Android 관용에 따라 `dp` (텍스트는 `sp`로 해석).

| Size | Height | Horizontal Padding | Vertical Padding | BadgeText Inner H-Padding | Icon ↔ Text Gap | Icon Length | Corner Radius |
|---|---|---|---|---|---|---|---|
| `xsmall` | 18 | 4 | 1 | 4 | 0 | 16 | 32 (full pill) |
| `small`  | 22 | 4 | 2 | 4 | 0 | 16 | 32 (full pill) |
| `medium` | 22 | 4 | 2 | 4 | 0 | 16 | 32 (full pill) |
| `large`  | 26 | 4 | 3 | 4 | 0 | 16 | 32 (full pill) |

- `Icon Length`는 모든 size에서 16으로 고정.
- `Icon ↔ Text Gap`은 컨테이너 auto-layout에 명시적 `gap` 없음(0).
- Corner radius는 Variable `radius/32` (32 dp).

### 폰트 (공통)

- Family: `Inter` (Variable `text/font-family`)
- Weight: `Regular` (Variable `text/weight/regular` = 400)
- Style: not italic

---

## 3. Color 별 컬러 토큰

이 컴포넌트는 모든 size에서 동일한 color 토큰을 사용한다 (Figma 확인). Border 사용 없음.

### Background

| Color | Variable | Raw |
|---|---|---|
| `default` | `color/fill/neutral/light` | `#0000000d` |
| `monochrome-light` | `color/fill/neutral/light` | `#0000000d` |
| `monochrome-dark` | `color/fill/neutral/heavier` | `#00000066` |
| `blue` | `color/fill/accent/blue/heavy` | `#6157ea33` |
| `cobalt` | `color/fill/accent/cobalt/heavy` | `#3292e333` |
| `teal` | `color/fill/accent/teal/heavy` | `#09b2ac33` |
| `green` | `color/fill/accent/green/heavy` | `#20ab5533` |
| `olive` | `color/fill/accent/olive/heavy` | `#a9b11033` |
| `pink` | `color/fill/accent/pink/heavy` | `#d64bb533` |
| `navy` | `color/fill/accent/navy/heavy` | `#424fab33` |
| `yellow` | `color/fill/accent/yellow/heavy` | `#edae0d33` |
| `orange` | `color/fill/accent/orange/heavy` | `#e67f2b33` |
| `red` | `color/fill/accent/red/heavy` | `#e1535d33` |
| `purple` | `color/fill/accent/purple/heavy` | `#8e57e733` |

> `default`와 `monochrome-light`의 Background 토큰은 동일하다. 두 색상의 차이는 텍스트 색상에서 발생한다.

### Text color

| Color | Variable | Raw |
|---|---|---|
| `default` | `color/text/neutral` | `#000000d9` |
| `monochrome-light` | `color/text/neutral/lighter` | `#00000066` |
| `monochrome-dark` | `color/text/absolute/white` | `#ffffff` |
| `blue` | `color/text/accent/blue` | `#6157ea` |
| `cobalt` | `color/text/accent/cobalt` | `#3292e3` |
| `teal` | `color/text/accent/teal` | `#09b2ac` |
| `green` | `color/text/accent/green` | `#20ab55` |
| `olive` | `color/text/accent/olive` | `#a9b110` |
| `pink` | `color/text/accent/pink` | `#d64bb5` |
| `navy` | `color/text/accent/navy` | `#424fab` |
| `yellow` | `color/text/accent/yellow` | `#edae0d` |
| `orange` | `color/text/accent/orange` | `#e67f2b` |
| `red` | `color/text/accent/red` | `#e1535d` |
| `purple` | `color/text/accent/purple` | `#8e57e7` |

### Icon color

`hasIcon=true` 인스턴스에서만 노출되는 토큰. text와 icon이 서로 다른 토큰을 쓰는 경우가 있어 분리 표로 명시한다.

| Color | Variable | Raw | 텍스트와의 차이 |
|---|---|---|---|
| `default` | `color/text/neutral/light` | `#00000099` | text는 `color/text/neutral` (#000000d9). icon이 alpha 0.6, text가 alpha 0.85 — 다름 |
| `monochrome-light` | `color/icon/neutral` | `#00000066` | text는 `color/text/neutral/lighter` (#00000066). hex 동일, 토큰 이름 다름 |
| `monochrome-dark` | `color/icon/absolute/white` | `#ffffff` | text는 `color/text/absolute/white` (#ffffff). hex 동일, 토큰 이름 다름 |
| `blue` | `color/icon/accent/blue` | `#6157ea` | text는 `color/text/accent/blue` (#6157ea). hex 동일, 토큰 이름 다름 |
| `cobalt` | `color/icon/accent/cobalt` | `#3292e3` | text와 hex 동일, 토큰 이름 다름 |
| `teal` | `color/icon/accent/teal` | `#09b2ac` | text와 hex 동일, 토큰 이름 다름 |
| `green` | `color/icon/accent/green` | `#20ab55` | text와 hex 동일, 토큰 이름 다름 |
| `olive` | `color/icon/accent/olive` | `#a9b110` | text와 hex 동일, 토큰 이름 다름 |
| `pink` | `color/icon/accent/pink` | `#d64bb5` | text와 hex 동일, 토큰 이름 다름 |
| `navy` | `color/icon/accent/navy` | `#424fab` | text와 hex 동일, 토큰 이름 다름 |
| `yellow` | `color/icon/accent/yellow` | `#edae0d` | text와 hex 동일, 토큰 이름 다름 |
| `orange` | `color/icon/accent/orange` | `#e67f2b` | text와 hex 동일, 토큰 이름 다름 |
| `red` | `color/icon/accent/red` | `#e1535d` | text와 hex 동일, 토큰 이름 다름 |
| `purple` | `color/icon/accent/purple` | `#8e57e7` | text와 hex 동일, 토큰 이름 다름 |

### Border

Badge는 모든 color/size에서 border를 사용하지 않는다 (Figma 노드에 border 정의 없음).

---

## 4. Typography

이 컴포넌트의 텍스트 노드를 두 케이스로 분리해 기재한다.

### Case A — Typography Token 사용

Figma text style이 design system token으로 등록된 케이스.

| 위치 | Token | Figma Style 이름 | 구성 |
|---|---|---|---|
| BadgeText (size=xsmall) | `Typography/text/xsmall` | `Typography/text/xsmall` | family=`text/font-family` · weight=`text/weight/regular` (400) · size=`text/size/xsmall` (12) · line-height=`text/line-height/xsmall` (16) · letter-spacing=`text/letter-spacing` (0) |
| BadgeText (size=small) | `Typography/text/medium` | `Typography/text/medium` | family=`text/font-family` · weight=`text/weight/regular` (400) · size=`text/size/medium` (14) · line-height=`text/line-height/medium` (18) · letter-spacing=`text/letter-spacing` (0) |

### Case B — Custom Typography (토큰 미적용)

Figma text style이 token 없이 raw 값으로 직접 지정된 케이스. 5요소 모두 명시.

| 위치 | Font | Size | Weight | Line Height | Letter Spacing | Custom 사유 |
|---|---|---|---|---|---|---|
| BadgeText (size=medium) | Inter | 15 | 400 | 18 | -0.1 | Figma description에 토큰 미적용 사유 명시 없음. Variable 단위로는 모두 토큰(`text/size/large` · `text/line-height/medium` · `text/letter-spacing/tight`)이지만 조합으로서의 Typography 토큰이 등록되어 있지 않음. 디자이너 확인 필요 |
| BadgeText (size=large)  | Inter | 16 | 400 | 20 | -0.1 | Figma description에 토큰 미적용 사유 명시 없음. Variable 단위로는 모두 토큰(`text/size/xlarge` · `text/line-height/large` · `text/letter-spacing/tight`)이지만 조합으로서의 Typography 토큰이 등록되어 있지 않음. 디자이너 확인 필요 |

> 회색 지대: medium/large 폰트 조합은 Variable 토큰으로는 정의되어 있으나 묶음 Typography 스타일로는 미등록 상태. 디자이너에게 Typography 토큰 등록 여부 확인 필요.

---

## 5. 아이콘 자산 (hasIcon = true 시)

| 항목 | 값 |
|---|---|
| Figma asset 이름 | `icon/plus` (Figma 노드의 `data-name`) |
| 크기 | 16 × 16 dp |
| 내부 shape inset | `inset[12.5%]` (실제 visible content는 16의 75% = 12 dp 정사각형) |
| 색상 적용 방식 | Figma 노드에서는 image asset으로 인라인 |

> Figma의 placeholder asset이 `icon/plus`인 것이지, 실제 사용 시에는 임의 아이콘 소스를 `iconSource`로 전달한다.

---

## 6. 디자이너 가이드라인 (Figma 컴포넌트 description 인용)

Figma component description에 적힌 그대로:

- 목록·카드 UI에서 항목의 상태나 속성을 색상과 텍스트로 즉각 전달하는 인라인 레이블.
- color 의미: green=성공·활성 / red=오류·긴급 / orange=경고 / blue=정보·진행 / monochrome-light=비활성·초안
- size: large / medium / small / xsmall
- hasIcon(옵션): true 시 leadingIconSource 아이콘 표시
- 사용자가 제거할 수 있으면 Tag 사용. Badge는 항상 읽기 전용.

---

## 7. Variant 매트릭스

총 instance: `4 (size) × 14 (color) = 56개` (hasIcon은 별도 toggle, state 축 없음)

### 컴포넌트 정의 노드 ID (56개, hasIcon=false 기본 상태)

Color 가로 정렬 순서 (Figma 캔버스 x좌표 기준):
`default → monochrome-light → monochrome-dark → blue → cobalt → teal → green → olive → pink → navy → yellow → orange → red → purple`

```
xsmall × default          → 1729:2
xsmall × monochrome-light → 1729:41
xsmall × monochrome-dark  → 1729:38
xsmall × blue             → 1729:5
xsmall × cobalt           → 1729:8
xsmall × teal             → 1729:11
xsmall × green            → 1729:14
xsmall × olive            → 1729:17
xsmall × pink             → 1729:20
xsmall × navy             → 1729:23
xsmall × yellow           → 1729:26
xsmall × orange           → 1729:29
xsmall × red              → 1729:32
xsmall × purple           → 1729:35

small  × default          → 1729:44
small  × monochrome-light → 1729:83
small  × monochrome-dark  → 1729:80
small  × blue             → 1729:47
small  × cobalt           → 1729:50
small  × teal             → 1729:53
small  × green            → 1729:56
small  × olive            → 1729:59
small  × pink             → 1729:62
small  × navy             → 1729:65
small  × yellow           → 1729:68
small  × orange           → 1729:71
small  × red              → 1729:74
small  × purple           → 1729:77

medium × default          → 1729:86
medium × monochrome-light → 1729:125
medium × monochrome-dark  → 1729:122
medium × blue             → 1729:89
medium × cobalt           → 1729:92
medium × teal             → 1729:95
medium × green            → 1729:98
medium × olive            → 1729:101
medium × pink             → 1729:104
medium × navy             → 1729:107
medium × yellow           → 1729:110
medium × orange           → 1729:113
medium × red              → 1729:116
medium × purple           → 1729:119

large  × default          → 1729:128
large  × monochrome-light → 1729:167
large  × monochrome-dark  → 1729:164
large  × blue             → 1729:131
large  × cobalt           → 1729:134
large  × teal             → 1729:137
large  × green            → 1729:140
large  × olive            → 1729:143
large  × pink             → 1729:146
large  × navy             → 1729:149
large  × yellow           → 1729:152
large  × orange           → 1729:155
large  × red              → 1729:158
large  × purple           → 1729:161
```
