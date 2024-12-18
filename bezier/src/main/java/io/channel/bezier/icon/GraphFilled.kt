@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons
import io.channel.bezier.compose.R

val BezierIcons.GraphFilled: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_graph_filled
        override val imageVector: ImageVector
            get() = _graphFilled ?: ImageVector.Builder(
                    name = "GraphFilled",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(13.776f, 21.0f)
                    lineTo(10.225f, 21.0f)
                    arcTo(0.475f, 0.475f, 90.12062278267386f, isMoreThanHalf = false, isPositiveArc = true, 9.751f, 20.525f)
                    lineTo(9.751f, 3.475f)
                    curveTo(9.751f, 3.212f, 9.963f, 3.0f, 10.225f, 3.0f)
                    lineTo(13.774999999999999f, 3.0f)
                    curveTo(14.037999999999998f, 3.0f, 14.250999999999998f, 3.212f, 14.250999999999998f, 3.475f)
                    lineTo(14.250999999999998f, 20.525000000000002f)
                    arcTo(0.475f, 0.475f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 13.775999999999998f, 21.000000000000004f)
                    moveTo(20.525999999999996f, 21.000000000000004f)
                    lineTo(16.974999999999994f, 21.000000000000004f)
                    arcTo(0.475f, 0.475f, 90.12062278267386f, isMoreThanHalf = false, isPositiveArc = true, 16.500999999999994f, 20.525000000000002f)
                    lineTo(16.500999999999994f, 8.475f)
                    curveTo(16.500999999999994f, 8.212f, 16.712999999999994f, 8.0f, 16.974999999999994f, 8.0f)
                    lineTo(20.524999999999995f, 8.0f)
                    curveTo(20.787999999999997f, 8.0f, 21.000999999999994f, 8.212f, 21.000999999999994f, 8.475f)
                    lineTo(21.000999999999994f, 20.525f)
                    arcTo(0.475f, 0.475f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 20.525999999999993f, 21.0f)
                    moveTo(3.52f, 21.0f)
                    lineTo(6.98f, 21.0f)
                    arcTo(0.52f, 0.52f, 89.99999999999994f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 20.48f)
                    lineTo(7.5f, 15.52f)
                    arcTo(0.52f, 0.52f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 6.98f, 15.0f)
                    lineTo(3.52f, 15.0f)
                    arcTo(0.52f, 0.52f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 3.0f, 15.52f)
                    lineTo(3.0f, 20.48f)
                    curveTo(3.0f, 20.768f, 3.232f, 21.0f, 3.52f, 21.0f)
                }
            }.build().also {
                _graphFilled = it
            }
    }


private var _graphFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun GraphFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.GraphFilled.imageVector,
            contentDescription = null,
    )
}
