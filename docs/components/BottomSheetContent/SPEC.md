# BottomSheetContent Spec

> Figma: [🚧 Mobile Components — BottomSheet](https://www.figma.com/design/46idSffz5wpiLD5ykWUFZY/%F0%9F%9A%A7-Mobile-Components?node-id=5105-11844&m=dev)
> Figma component node ID: `1306:200` (BottomSheet) / 예시 instance `5105:11844`
> Design spec doc: [channel-io/design-team — BottomSheet-spec.md](https://github.com/channel-io/design-team/blob/main/docs/bezier-v3/component-spec/BottomSheet-spec.md)

바텀시트 Surface 내부에 들어가는 컨텐츠 래퍼. Grabber + Header + content 슬롯으로 구성.

- **스코프**: 이 컴포넌트는 `BottomSheetContent` — Surface 내부 컨텐츠만 담당한다. Backdrop, Surface 컨테이너(배경/모서리/그림자), 하단 정렬, 드래그, 슬라이드 애니메이션은 실제 바텀시트 컴포넌트가 담당하며 별도로 래핑한다.
- **Figma → 스코프 매핑**: Figma `BottomSheet`(1306:200) = `Backdrop` + `Surface(Grabber + Header + contentWrapper)`. 이 중 `Surface` 내부(`Grabber`, `Header`, `contentWrapper`)만 구현. `Backdrop`, `Surface` 자체 스타일은 제외.

---

## 1. Component Properties

Figma `BottomSheet`(1306:200) component property는 다음이 전부다.

| Property | 값 | 기본값 | 비고 |
|---|---|---|---|
| **hasHeader** | boolean | `false` | Header(타이틀 + Divider) 표시 여부 |
| **showGrabber** | boolean | `false` | 최상단 Grabber 표시 여부. content가 스크롤될 만큼 길 때만 true |

Header 내부 nested property (`Internal/BottomSheetHeader` 1293:121):

| Property | 값 | 기본값 | 비고 |
|---|---|---|---|
| **title** | text | `"Title"` | 타이틀 텍스트 |
| **hasDescription** | boolean | `false` | 보조 설명 표시 여부. Figma `Internal/BottomSheetHeader`(1293:121) description: "true(보조 설명 추가 - 확인성 시트에서만 사용)" |
| **description** | text | `"Description"` | `hasDescription = true`일 때 표시할 설명 텍스트 |

content 슬롯: `contentWrapper > content` (1306:204) — 임의 UI 배치.

---

## 2. Layout / 구조

단위는 Android 관용에 따라 `dp` (텍스트는 `sp`).

Root: `Column`, `fillMaxWidth`. 배경/모서리/그림자 없음 (Surface = 시트 담당).

배치 순서 (위 → 아래):

1. **Grabber** — `showGrabber = true`일 때만
2. **Header** — `hasHeader = true`일 때만
3. **contentWrapper** — 항상

### 2-1. Grabber (`showGrabber`)

| 요소 | 값 |
|---|---|
| Wrapper | `Column`, 가로 중앙 정렬, `paddingTop = 5`, `fillMaxWidth` |
| Bar | `width = 36`, `height = 5`, corner radius `100` (완전 알약형), bg `color/fill/neutral/heavy` |

### 2-2. Header (`hasHeader`)

**contentArea** (`1293:122`):

| 속성 | 값 |
|---|---|
| Layout | `Column`, 가로 중앙 정렬 |
| Item gap | `4` |
| Padding | top `18`, bottom `16`, horizontal `24` |
| Width | `fillMaxWidth` |

- **Title** (`1293:123`): 항상 표시.
- **Description** (`1293:124`): `hasDescription = true`일 때만 표시.

**Divider** (`4709:751`): contentArea 하단. full-width 1px, 좌우·상하 indent 없음 (`_indent-col` padding 0). 구현은 v3 `Divider` 컴포넌트 재사용 — 이때 Divider의 Figma property `sideIndent`/`parallelIndent`를 모두 `false`로.

### 2-3. contentWrapper (`5160:10861`)

| 속성 | 값 |
|---|---|
| Layout | `Column`, `fillMaxWidth` |
| Padding | top `12`, horizontal `10` |
| 내부 | content 슬롯 (`content()`) |

---

## 3. Color 토큰 (v3)

| 요소 | Figma 토큰 | `BezierTheme.colorsV3` 필드 | Light |
|---|---|---|---|
| Grabber bar | `color/fill/neutral/heavy` | `fillNeutralHeavy` | `#00000026` |
| Title | `color/text/neutral` | `textNeutral` | `#000000d9` |
| Description | `color/text/neutral/lighter` | `textNeutralLighter` | `#00000066` |
| Divider line | `color/border/neutral` | `borderNeutral` (Divider 컴포넌트가 처리) | `#00000014` |

**스코프 제외 토큰** (Surface/Backdrop = 시트 담당, content 아님): `color/surface`, `color/dim/absolute/black`, `color/elevation/large` (Elevation/Mobile/3).

---

## 4. Typography

| 요소 | Figma 스타일 | `BezierTypo` | size / lineHeight / letterSpacing / weight | 정렬 | overflow |
|---|---|---|---|---|---|
| Title | `Typography/heading/small` | `HeadingSmall` | 17 / 24 / -0.1 / Bold | Center | ellipsis + word-break(긴 단어 강제 개행), 2줄에서 잘림 |
| Description | `Typography/caption/medium` | `CaptionMedium` | 12 / 16 / 0 / Regular | Center | 줄 수 제한 없음 (자유 개행) |

- **Title overflow 출처**: `get_design_context` CSS는 `overflow-hidden` + `text-ellipsis` + `word-break:break-word`만 노출(줄 수 미인코딩). "2줄에서 잘림"은 `get_screenshot`(instance `5105:11844`, header `5620:9964`) 렌더 근거 — Title은 2줄에서 `…`로 잘리고 Description은 전체 노출됨.

- Family: `Inter` (`font-family/sans` / `caption/font-family`).
