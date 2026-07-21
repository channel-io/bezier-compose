# BaseItem Spec

> Figma: [🚧 Mobile Components — _BaseItem](https://www.figma.com/design/46idSffz5wpiLD5ykWUFZY/%F0%9F%9A%A7-Mobile-Components?node-id=4404-11875&m=dev)
> Figma node ID: `4404:11875`
> Design spec doc: [channel-io/team-design — BaseItem.md](https://github.com/channel-io/team-design/blob/main/bezier-v3/components/BaseItem.md)

`*Item` 계열 컴포넌트(NavigationItem, SelectItem 등)가 공유하는 공통 레이아웃 base(anatomy). 단독 배치 금지 — base 레퍼런스 전용.

- **모양**: 가로 배치 컨테이너. 모서리 반경 8.
- **State**: Figma에 state property 없음 (default만 존재). pressed/active/disabled/loading 없음.
- **인접 배치**: `*Item` 계열 컴포넌트 내부에서만 사용.

---

## 1. Component Properties

Figma 컴포넌트가 정의하는 property는 다음이 전부다.

| Property | 값 | 비고 |
|---|---|---|
| **size** | `small` / `medium` / `large` | 크기·밀도 축 |

총 size instance: `3개` (Figma 노출 인스턴스 수와 일치)

추가 인스턴스 토글 / 슬롯 props (Figma component property 기준):

| Toggle/Slot | 기본값 | 효과 |
|---|---|---|
| `hasLeadingContent` | `true` | 대표 UI 슬롯 표시 (정방형 — small/medium 24×24 / large 36×36, 단일 요소) |
| `hasCenterSlot` | `true` | label 우측 인라인 보조 슬롯 표시 |
| `hasTrailingContent` | `true` | 부가 메타 슬롯 표시 (1~2개 요소) |
| `hasDescription` | `false` | label 하단 보조 텍스트 표시. **size=small 미지원** (small 노드에 descriptionWrapper 없음) |
| `label` | `"Label"` | 본문 텍스트 (단일 라인) |
| `description` | `"Description text"` | 보조 텍스트 (medium/large 전용) |
| `leadingContent` | (슬롯) | leadingContent 위치에 들어가는 콘텐츠 |
| `centerSlot` | (슬롯) | label 우측 인라인 콘텐츠 |
| `trailingContent` | (슬롯) | trailingContent 위치에 들어가는 콘텐츠 |

> `leadingContent` / `centerSlot` / `trailingContent`는 Figma에서 instance-swap 슬롯이며, 실제로는 임의 콘텐츠가 들어가는 자리다.

---

## 2. Size 별 Spec

단위는 Android 관용에 따라 `dp`.

| Size | Min Height | Horizontal Padding | Vertical Padding | Leading Content | Trailing Content | Description | Corner Radius |
|---|---|---|---|---|---|---|---|
| `small`  | 40 | 6 | 6 | 24 × 24 | (hug) | 미지원 | 8 |
| `medium` | 48 | 6 | 6 | 24 × 24 | (hug) | 지원 | 8 |
| `large`  | 52 | 6 | 8 | 36 × 36 | (hug) | 지원 | 8 |

### 공통 레이아웃 수치

| 항목 | 값 | Figma Variable |
|---|---|---|
| 컨테이너 gap (leading ↔ center ↔ trailing) | 10 | (auto-layout gap) |
| titleRow gap (label ↔ centerSlot) | 4 | `dimension/4` |
| centerContent 좌측 padding | 2 | (`pl-[2px]`) |
| 컨테이너 정렬 | 세로 중앙 (`items-center`) | |
| centerContent 정렬 | 세로 배치, 좌측 정렬, 가로 채움 (`flex-1`) | |

- 컨테이너는 높이를 `min-height`로 잡고 콘텐츠에 따라 늘어난다 (고정 높이 아님).
- `leadingContent`는 size별 정방형(24 또는 36)으로 고정된 슬롯 박스.
- `trailingContent`는 콘텐츠에 맞춰 hug (1~2개 요소 자유 배치).
- Figma 프레임 폭은 `328`이나 이는 데모 프레임 폭이며, 실제 폭은 부모 컨테이너를 따른다.
- **label truncation**: label은 단일 라인, 공간 부족 시 ellipsis로 truncate. (⚠️ Figma에서는 label이 HUG로 설정되어 있으나 — centerSlot 병치 편의 목적 — 구현에서는 truncate가 정답. Figma description에 명시된 Figma vs 구현 차이.)

---

## 3. 컬러 토큰

이 컴포넌트가 실제로 칠하는 색은 **텍스트 2종뿐**이다. leadingContent / centerSlot / trailingContent 슬롯 영역은 콘텐츠 자리이며 base가 배경을 칠하지 않는다.

### Text color

| 위치 | Variable | Raw |
|---|---|---|
| label | `color/text/neutral` | `#000000d9` |
| description | `color/text/neutral/lighter` | `#00000066` *(rgba(0,0,0,0.4))* |

### Background / Border

base 컨테이너는 배경·border를 사용하지 않는다 (투명). 컨테이너에 `rounded 8` + `overflow clip` 적용.

> ⚠️ Figma 노드의 `leadingContent`(`color/fill/accent/red`), `centerSlot`(`color/fill/accent/green/heavier`), `trailingContent`(`color/fill/accent/blue`) 배경색은 **슬롯 위치를 시각화하기 위한 Figma placeholder**다. base 컴포넌트의 실제 컬러가 아니므로 구현에 반영하지 않는다.

---

## 4. Typography

이 컴포넌트의 텍스트 노드는 label, description 2종.

### Case A — Typography Token 사용

| 위치 | Token | Figma Style 이름 | 구성 |
|---|---|---|---|
| label | `Typography/text/xlarge` | `text/xlarge` | family=`text/font-family`(Inter) · weight=`text/weight/regular`(400) · size=`text/size/xlarge`(16) · line-height=`text/line-height/xlarge`(24) · letter-spacing=`text/letter-spacing/tight`(-0.1) |
| description | `Typography/caption/medium` | `caption/medium` | family=Inter · weight=400 · size=`caption/size/medium`(12) · line-height=`caption/line-height/medium`(16) · letter-spacing=`caption/letter-spacing`(0) |

### Case B — Custom Typography (토큰 미적용)

없음. label·description 모두 Typography Token 사용.

---

## 5. State 별 시각 동작

Figma에 state property 없음. 단일 상태(default)만 존재하며 pressed/active/disabled/loading 없음. base는 상호작용을 정의하지 않는다 (상호작용은 이 base를 사용하는 `*Item` 컴포넌트가 부여).

---

## 6. 디자이너 가이드라인 (Figma 컴포넌트 description 인용)

Figma component description에 적힌 그대로:

- `*Item` 계열 컴포넌트의 공유 레이아웃 anatomy 패턴. 단독 배치 금지 — base 레퍼런스 전용.
- size: small(minHeight 40) / medium(minHeight 48) / large(minHeight 52)
- 사이즈 정책: small=밀도 우선(description 미지원) / medium=기본 / large=leadingContent 커질 때(예: 멤버 목록)
- showLeadingContent: 대표 UI 슬롯 (정방형 — small/medium 24×24 / large 36×36, 단일)
- showTrailingContent: 부가 메타 슬롯 (1~2개 요소, 꼭 필요할 때만)
- showDescription: label 하단 보조 텍스트 (size=small 미지원)
- showCenterSlot: label 우측 인라인 보조 슬롯
- gap(leading ↔ center ↔ trailing): 10
- ⚠️ Figma vs 구현 차이: label은 Figma에서 HUG로 설정. 실제 구현에서는 공간 부족 시 ellipsis로 truncate. centerSlot과 함께 배치할 때의 편의를 위해 Figma에서 HUG 유지.

---

## 7. 매핑되는 코드 심볼

| 정의 | 파일 |
|---|---|
| Compose 구현 | `bezier/src/main/java/io/channel/bezier/v3/component/BaseItem.kt` (`fun BaseItem(...)`) |
| size 정의 | 같은 파일 안 `enum class BaseItemSize` |
| 컬러 토큰 | `BezierTheme.colorsV3.textNeutral` · `BezierTheme.colorsV3.textNeutralLighter` (`BezierSemanticColorV3`) |
| 타이포 토큰 | `BezierTypo.TextXLarge` (label) · `BezierTypo.CaptionMedium` (description) |
| 텍스트 렌더 | `io.channel.bezier.component.BezierText` |

> `_BaseItem`의 `_` prefix는 Figma상 base 레퍼런스 의도를 뜻한다. 다만 향후 어떤 `*Item` 콘텐츠가 들어올지 알 수 없어 `public` 가시성으로 노출한다 (외부에서도 조합 가능).

---

## 8. Variant 매트릭스

총 size instance: `3개`

```
size=small  → 4404:2
size=medium → 4404:3
size=large  → 4404:4
```

### 내부 노드 (anatomy)

```
small  (4404:2):  leadingContent 4404:6 · centerContent 4404:7 · titleRow 4404:8 · label 4404:9 · centerSlot 4404:10 · trailingContent 4404:14
medium (4404:3):  centerContent 4404:16 · titleRow 4404:17 · descriptionWrapper 4404:20 · description 4404:21
large  (4404:4):  leadingContent 4404:24 · centerContent 4404:25 · titleRow 4404:26 · label 4404:27 · centerSlot 4404:28 · descriptionWrapper 4404:29 · description 4404:30 · trailingContent 4404:32
```
