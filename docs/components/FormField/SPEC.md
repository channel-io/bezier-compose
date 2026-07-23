# FormField Spec

> Figma: [🚧 Mobile Components — Form](https://www.figma.com/design/46idSffz5wpiLD5ykWUFZY/%F0%9F%9A%A7-Mobile-Components?node-id=5042-2942&m=dev)
> Figma node ID: `5042:2942` (Form 예시) → 컴포넌트 정의 `Internal/FormField` `2920:46` · `Internal/FormFieldErrorMessage` `5042:3035`

`Form` 안에서 레이블 · 컨트롤 · 보조텍스트 · 에러 메시지를 하나의 필드로 묶는 래퍼(`FormField`)와, 그 필드의 에러 표시 요소(`FormFieldErrorMessage`)를 정의한다.

- 진입 node `5042:2942` "Form"은 `Internal/FormField` 인스턴스 3개(TextArea stacked+error / TextInput stacked / Button inline+customContent)를 담은 예시다.
- 두 컴포넌트 모두 Figma 이름에 **`Internal/`** 접두가 있다: "Used within Form only. Do not place standalone." → v3 관례상 `internal` 접근 제어자로 구현.
- control(TextArea / TextInput / Button 등)은 slot 에 주입되는 **독립 컴포넌트**이며 이 SPEC 범위 밖이다.

---

# A. Internal/FormField (`2920:46`)

## A-1. Component Properties

component set 이며 variant 축은 `labelPosition` 하나다.

| Property | 타입 | 기본값 | 효과 |
|---|---|---|---|
| `labelPosition` | variant | `top` | `top`=라벨 위·컨트롤 아래(stacked) / `left`=라벨 좌측·컨트롤 우측(inline) |
| `label` | text | `"Label"` | 라벨 텍스트 |
| `hasLabel` | boolean | `true` | `labelPosition=top`에서 false면 LabelArea 전체 미렌더 (left는 항상 렌더) |
| `description` | text | `"Description text"` | 라벨 부제 |
| `hasDescription` | boolean | `true` | false면 description 만 미렌더 |
| `required` | boolean | `false` | true면 라벨 우측에 `*` |
| `hasCustomContent` | boolean | `false` | true면 customContent slot 노출 |
| `customContent` | slot | (빈 슬롯) | 필드 관련 복합 콘텐츠. FILL width |
| `hasError` | boolean | `false` | true면 하단에 `FormFieldErrorMessage` 표시 |
| `stackedControl` | slot | (빈 슬롯) | `labelPosition=top`의 컨트롤 슬롯 |
| `inlineControl` | slot | (빈 슬롯) | `labelPosition=left`의 컨트롤 슬롯 |

> `hasError=true`의 부수 효과 중 "컨트롤 orange stroke"는 **컨트롤 컴포넌트(TextArea 등)가 그린다** (이 SPEC 범위 밖). `FormField` 는 `FormFieldErrorMessage` 표시만 담당한다.

## A-2. Layout

단위 `dp`. Root 공통: column · gap 6 · padding-bottom 24 · overflow-clip · items-start.

### labelPosition = top (`2920:45`, w 240)

| 노드 | node ID | 방향 | Gap | Padding | Size | 비고 |
|---|---|---|---|---|---|---|
| Root | `2920:45` | column | 6 | pb 24 | w 240 | overflow-clip |
| Content | `2920:41` | column | 8 | — | w-full | |
| LabelArea | `2920:36` | column | 2 | pl 2 | w-full | overflow-clip · `hasLabel` 시 |
| LabelRow | `2920:37` | row | 2 | — | hug | overflow-clip |
| label | `2920:38` | text | — | — | hug | |
| required * | `5082:15086` | text | — | — | hug | `required` 시 |
| description | `2920:40` | text | — | — | hug | `hasDescription` 시 |
| ControlGroup | `2920:42` | column | — | — | w-full | |
| stackedControl | `2920:43` | slot | — | — | h 36 · w-full | 고정 높이 36 (placeholder) |

### labelPosition = left (`2920:23`, w 320)

| 노드 | node ID | 방향 | Gap | Padding | Size | 비고 |
|---|---|---|---|---|---|---|
| Root | `2920:23` | column | 6 | pb 24 | w 320 | overflow-clip |
| Content | `2920:19` | row | — | — | w-full | justify-between · items-start |
| LabelArea | `2920:14` | column | 2 | pl 2 | flex-1 (min-w 0) | overflow-clip · 항상 렌더 |
| LabelRow | `2920:15` | row | 2 | — | hug | overflow-clip |
| label | `2920:16` | text | — | — | hug | |
| required * | `5082:15085` | text | — | — | hug | `required` 시 |
| description | `2920:18` | text | — | — | hug | `hasDescription` 시 |
| ControlGroup | `2920:20` | column | — | — | max-w 200 · min-w 120 | items-end |
| inlineControl | `2920:21` | slot | — | — | h 36 · w 120 | control 은 hug(우측 정렬), w 120 은 placeholder |

### 공통 하단 (top · left 동일)

| 노드 | node ID | 방향 | Gap | Padding | Size | 비고 |
|---|---|---|---|---|---|---|
| customContentWrapper | `5082:676` | column | — | — | w-full | overflow-clip · `hasCustomContent` 시 |
| customContent | `5082:677` | slot | — | — | h 100 · w-full | 고정 높이 100 (placeholder) |
| FormFieldErrorMessage | `5042:3073` | (하위 컴포넌트) | — | pl 2 | w-full | `hasError` 시. 상세는 B 참조 |

- Root gap 6 은 Content ↔ customContent ↔ ErrorMessage 사이 간격.
- (구현 가정, Figma 외부) slot 고정 높이(36 · 100)는 placeholder 이며 실제 배치 컴포넌트가 높이를 결정한다.

## A-3. Color 토큰

| 위치 | Variable | Raw |
|---|---|---|
| `label` | `color/text/neutral` | `#000000d9` |
| `required *` | `color/text/accent/orange` | `#e67f2b` |
| `description` | `color/text/neutral/lighter` | `#00000066` |

Border · Background 사용 없음.

## A-4. Typography

| 위치 | Token | 구성 |
|---|---|---|
| `label` · `required *` | `Typography/label/large` | Inter · style Medium · weight 700 · size 15 · lh 20 · ls 0 |
| `description` | `Typography/text/xsmall` | Inter · Regular · size 12 · lh 16 · ls 0 |

Custom typography 없음.

---

# B. Internal/FormFieldErrorMessage (`5042:3035`)

## B-1. Component Properties

| Property | 타입 | 기본값 | 효과 |
|---|---|---|---|
| `errorText` | text | `"Error message"` | 에러 메시지 텍스트 (Figma property명은 `errorTtext` 오타) |

> "Used within FormField only." `FormField` 의 `hasError=true`에서 자동 표시. 다중 에러는 ErrorMessageStack(별도 컴포넌트, 범위 밖)에 수직 스택.

## B-2. Layout

| 노드 | node ID | 방향 | Gap | Padding | Size | 비고 |
|---|---|---|---|---|---|---|
| Root | `5042:3035` | row | 4 | — | hug (w 98 기준) | rounded 8 · items-start |
| iconBox | `5042:3027` | row | — | — | h 16 | items-center · justify-center · overflow-clip |
| icon | `5042:3028` | asset | — | — | 10 × 10 | `icon/error-diamond-filled` |
| text | `5042:3029` | text | — | — | flex-1 (min-w 0) | |

- `rounded 8` 은 배경 없는 상태의 컨테이너 radius (시각 영향 없음, 기록만).
- `FormField` 안에서는 이 컴포넌트가 `pl 2` · `w-full` 로 배치된다 (A-2 공통 하단 참조).

## B-3. Color 토큰

| 위치 | Variable | Raw |
|---|---|---|
| `icon` | `color/icon/accent/orange` | `#e67f2b` |
| `text` | `color/text/accent/orange` | `#e67f2b` |

## B-4. Typography

| 위치 | Token | 구성 |
|---|---|---|
| `text` | `Typography/caption/medium` | Inter · Regular · size 12 · lh 16 · ls 0 |

## B-5. 아이콘 자산

| 항목 | 값 |
|---|---|
| Figma asset 이름 | `icon/error-diamond-filled` |
| 크기 | 10 × 10 dp |
| tint | `color/icon/accent/orange` (`#e67f2b`) |
