package io.channel.bezier.compose.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.IntrinsicMeasurable
import androidx.compose.ui.layout.IntrinsicMeasureScope
import androidx.compose.ui.layout.Layout
import androidx.compose.ui.layout.LayoutIdParentData
import androidx.compose.ui.layout.Measurable
import androidx.compose.ui.layout.MeasurePolicy
import androidx.compose.ui.layout.MeasureResult
import androidx.compose.ui.layout.MeasureScope
import androidx.compose.ui.layout.Placeable
import androidx.compose.ui.layout.layoutId
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.channel.bezier.compose.R
import kotlin.math.max

@Composable
fun ListItemContainer(
        modifier: Modifier = Modifier,
        size: ListItemContainerSize = ListItemContainerSize.M,
        buttonType: ListItemContainerButtonType = ListItemContainerButtonType.NonButton,
        leftContent: (@Composable () -> Unit)? = null,
        centerContent: (@Composable () -> Unit)? = null,
        rightContent: (@Composable () -> Unit)? = null,
        bottomContent: (@Composable ColumnScope.() -> Unit)? = null,
) {
    Column(
            modifier = modifier
                    .fillMaxWidth()
                    .heightIn(min = size.minHeight)
                    .padding(start = 6.dp)
                    .padding(vertical = size.basePadding),
            verticalArrangement = Arrangement.SpaceEvenly,
    ) {
        ListItemContainerRowLayout(modifier = Modifier.fillMaxWidth()) {
            if (leftContent != null) {
                leftContent()
                Spacer(modifier = Modifier.width(12.dp))
            }

            if (centerContent != null) {
                Box(modifier = Modifier.layoutId(ListItemWidthOppressionTarget.Center)) {
                    centerContent()
                }

                Spacer(modifier = Modifier.width(6.dp))
            }

            if (rightContent != null) {
                Spacer(modifier = Modifier.width(10.dp))
                Box(modifier = Modifier.layoutId(ListItemWidthOppressionTarget.Right)) {
                    rightContent()
                }
                Spacer(modifier = Modifier.width(buttonType.endPadding))
            }
        }

        if (bottomContent != null) {
            Spacer(modifier = Modifier.height(4.dp))
            bottomContent()
        }
    }
}

enum class ListItemContainerSize(
        val minHeight: Dp,
        val basePadding: Dp,
) {
    S(40.dp, 6.dp),
    M(48.dp, 8.dp),
    L(52.dp, 6.dp),
}

enum class ListItemContainerButtonType(val endPadding: Dp) {
    NonButton(6.dp),
    Button(0.dp),
}

fun Modifier.listItemPadding() =
        padding(horizontal = 10.dp)

@Composable
private fun ListItemContainerRowLayout(
        modifier: Modifier = Modifier,
        children: @Composable () -> Unit,
) {
    Layout(
            content = children,
            modifier = modifier,
            measurePolicy = listItemRowMeasurePolicy(),
    )
}

/**
 * [ListItemContainerRowLayout]의 [MeasurePolicy]를 제공합니다.
 *
 * 모든 자식이 합리적인 수준으로 잘 보이도록 최선을 다 합니다. 구체적으로, 각 자식은 사용하고자 한다면 가용 너비의 1/n은 보장 받습니다.
 * 만약 자식이 1/n보다 작은 너비를 사용하고자 한다면 1/n보다 더 큰 너비를 사용하고자 하는 자식에게 공간을 양보합니다. 1/n 이상을
 * 사용하고자 하는 자식에 대해서는 그 자식들은 각자 넘치는 공간에 비례해서 1/n보다 적게 쓰는 자식들의 남는 공간을 나눠가집니다.
 */
private fun listItemRowMeasurePolicy(): MeasurePolicy {
    return object : MeasurePolicy {
        override fun IntrinsicMeasureScope.maxIntrinsicHeight(measurables: List<IntrinsicMeasurable>, width: Int): Int {
            return measurables.maxOfOrNull {
                it.maxIntrinsicHeight(width)
            } ?: 0
        }

        override fun IntrinsicMeasureScope.maxIntrinsicWidth(measurables: List<IntrinsicMeasurable>, height: Int): Int {
            return measurables.sumOf {
                it.maxIntrinsicWidth(height)
            }
        }

        override fun IntrinsicMeasureScope.minIntrinsicHeight(measurables: List<IntrinsicMeasurable>, width: Int): Int {
            return measurables.maxOfOrNull {
                it.minIntrinsicHeight(width)
            } ?: 0
        }

        override fun IntrinsicMeasureScope.minIntrinsicWidth(measurables: List<IntrinsicMeasurable>, height: Int): Int {
            return measurables.sumOf {
                it.minIntrinsicWidth(height)
            }
        }

        override fun MeasureScope.measure(measurables: List<Measurable>, constraints: Constraints): MeasureResult {
            check(constraints.hasBoundedWidth) { "ListItemContainer should have bounded width" }

            // Step 1. 늘어나는 데 제한이 없는 measurable들을 측정한다
            val placeables = Array(measurables.size) {
                when (measurables[it].layoutId) {
                    is ListItemWidthOppressionTarget -> null
                    else -> measurables[it].measure(constraints.copy(minWidth = 0, minHeight = 0))
                }
            }

            val totalFixedChildrenWidth = placeables.sumOf { it?.width ?: 0 }
            val remainingWidth = max(0, constraints.maxWidth - totalFixedChildrenWidth)

            // Step 2. 길이를 제한해야 하는 measurable들을 측정한다
            data class OppressedMeasurable(
                    val placeableIndex: Int,
                    val measurable: Measurable,
                    val desiredWidth: Int,
            )

            val oppressedMeasurables = measurables.mapIndexedNotNull { index, measurable ->
                if (placeables[index] == null) {
                    OppressedMeasurable(
                            placeableIndex = index,
                            measurable = measurable,
                            desiredWidth = measurable.maxIntrinsicWidth(constraints.maxHeight),
                    )
                } else {
                    null
                }
            }

            val totalDesiredWidthOfOppressed = oppressedMeasurables.sumOf { it.desiredWidth }

            if (remainingWidth < totalDesiredWidthOfOppressed) {
                // 남아있는 공간이 작을 경우, 작게 쓰는 자식들의 공간을 다른 자식에게 배분한다
                val guaranteedWidth = remainingWidth / oppressedMeasurables.size

                val underflowWidth = oppressedMeasurables.sumOf { max(0, guaranteedWidth - it.desiredWidth) }
                val overflowedWidth = oppressedMeasurables.sumOf { max(0, it.desiredWidth - guaranteedWidth) }

                oppressedMeasurables.forEach { oppressed ->
                    val childConstraints = if (oppressed.desiredWidth > guaranteedWidth) {
                        constraints.copy(
                                minWidth = 0,
                                minHeight = 0,
                                maxWidth = guaranteedWidth + (oppressed.desiredWidth - guaranteedWidth) * underflowWidth / overflowedWidth,
                        )
                    } else {
                        constraints.copy(
                                minWidth = 0,
                                minHeight = 0,
                                maxWidth = oppressed.desiredWidth,
                        )
                    }

                    placeables[oppressed.placeableIndex] = oppressed.measurable.measure(childConstraints)
                }
            } else {
                // 남아있는 공간이 크다면 원하는 크기를 가질 수 있게 한다
                oppressedMeasurables.forEach { oppressed ->
                    placeables[oppressed.placeableIndex] = oppressed.measurable.measure(
                            constraints.copy(
                                    minWidth = 0,
                                    minHeight = 0,
                                    maxWidth = oppressed.desiredWidth,
                            )
                    )
                }
            }

            // 이 아래부터는 `placeables` 배열에 `null`이 있을 수 없음.
            // `placeables[x]?.width ?: 0` 같이 접근하는 건 방어적인 코드지 유효한 것은 아님. `placeables[x]!!.width`로 해도 문제 없어야 함.

            val layoutHeight = placeables.maxOf { it?.height ?: 0 }
            val centerSpacing = max(0, constraints.maxWidth - placeables.sumOf { it?.width ?: 0 })

            return layout(constraints.maxWidth, layoutHeight) {
                var x = 0

                placeables.forEach { placeable ->
                    // Right 자식이 오른쪽에 붙을 수 있도록 Center 뒤에 공간을 만들어준다.
                    if (placeable?.layoutId == ListItemWidthOppressionTarget.Right) {
                        x += centerSpacing
                    }

                    placeable?.placeRelative(x, layoutHeight / 2 - placeable.height / 2)
                    x += placeable?.width ?: 0
                }
            }
        }
    }
}

private enum class ListItemWidthOppressionTarget {
    Center, Right,
}

@Preview(showBackground = true)
@Composable
private fun ListItemContainerPreview() {
    ListItemContainer(
            modifier = Modifier.fillMaxWidth(),
            leftContent = { Icon(painter = rememberVectorPainter(image = Icons.Default.Check), contentDescription = null) },
            centerContent = {
                Text("Hello World puasdlfkjasldkfjasldkfj", maxLines = 1, overflow = TextOverflow.Ellipsis)
            },
            rightContent = {
                Text("Good asdfasdfasdfasdfasdfasdfa asdf asd asdfasdfasdf", maxLines = 1, overflow = TextOverflow.Ellipsis)
            }
    )
}

@Preview
@Composable
fun ProfileEmailListItemPreview() {
    Column(
            // SectionGroup
            modifier = Modifier
                    .padding(16.dp)
                    .shadow(elevation = 3.dp, shape = RoundedCornerShape(16.dp))
                    .clip(RoundedCornerShape(16.dp))
                    .background(Color.White)
                    .padding(vertical = 10.dp),
    ) {
        ListItemContainer(
                modifier = Modifier
                        .fillMaxWidth()
                        .clickable { }
                        .listItemPadding(),
                leftContent = { Icon(painter = rememberVectorPainter(image = Icons.Default.Email), contentDescription = null) },
                centerContent = {
                    Text(
                            "Email",
                            color = colorResource(id = R.color.txt_black_darkest),
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                            fontSize = 16.sp,
                    )
                },
                rightContent = {
                    Text(
                            "longemailaddress@example.com",
                            color = colorResource(id = R.color.bgtxt_cobalt_normal),
                            fontSize = 16.sp,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                    )
                },
        )

        ListItemContainer(
                modifier = Modifier
                        .fillMaxWidth()
                        .clickable { }
                        .listItemPadding(),
                leftContent = { Icon(painter = rememberVectorPainter(image = Icons.Default.Call), contentDescription = null) },
                centerContent = {
                    Text(
                            "Call",
                            color = colorResource(id = R.color.txt_black_darkest),
                            fontSize = 16.sp,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                    )
                },
                rightContent = {
                    Text(
                            "010-1234-5678",
                            color = colorResource(id = R.color.bgtxt_cobalt_normal),
                            fontSize = 16.sp,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                    )
                },
        )
    }
}

private val Placeable.layoutId: Any?
    get() = (parentData as? LayoutIdParentData)?.layoutId
