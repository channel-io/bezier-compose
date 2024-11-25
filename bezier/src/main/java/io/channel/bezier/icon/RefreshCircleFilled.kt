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

val BezierIcons.RefreshCircleFilled: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_refresh_circle_filled
        override val imageVector: ImageVector
            get() = _refreshCircleFilled ?: ImageVector.Builder(
                    name = "RefreshCircleFilled",
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
                    moveTo(18.275f, 10.097f)
                    arcTo(0.313f, 0.313f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 17.962f, 10.41f)
                    lineTo(14.43f, 10.41f)
                    arcTo(0.313f, 0.313f, 90.1182720449555f, isMoreThanHalf = false, isPositiveArc = true, 14.209999999999999f, 9.875f)
                    lineTo(15.523f, 8.561f)
                    arcTo(4.99f, 4.99f, 314.76359020523216f, isMoreThanHalf = false, isPositiveArc = false, 12.0f, 7.114f)
                    arcTo(5.03f, 5.03f, 269.92031970209234f, isMoreThanHalf = false, isPositiveArc = false, 6.977f, 12.137f)
                    arcTo(5.03f, 5.03f, 179.92031970208996f, isMoreThanHalf = false, isPositiveArc = false, 12.0f, 17.16f)
                    arcTo(5.03f, 5.03f, 89.92033667546097f, isMoreThanHalf = false, isPositiveArc = false, 17.023f, 12.138f)
                    lineTo(18.273f, 12.138f)
                    arcTo(6.28f, 6.28f, 0.07295273220389978f, isMoreThanHalf = false, isPositiveArc = true, 12.0f, 18.41f)
                    arcTo(6.28f, 6.28f, 90.0638182914954f, isMoreThanHalf = false, isPositiveArc = true, 5.727f, 12.138f)
                    arcTo(6.28f, 6.28f, 180.05470563462498f, isMoreThanHalf = false, isPositiveArc = true, 12.0f, 5.864f)
                    arcTo(6.23f, 6.23f, 269.8577531243173f, isMoreThanHalf = false, isPositiveArc = true, 16.408f, 7.676f)
                    lineTo(17.739f, 6.344f)
                    arcTo(0.314f, 0.314f, 225.00813400038328f, isMoreThanHalf = false, isPositiveArc = true, 18.275000000000002f, 6.566000000000001f)
                    close()
                    moveTo(12.0f, 2.0f)
                    curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                    curveTo(2.0f, 17.523f, 6.477f, 22.0f, 12.0f, 22.0f)
                    curveTo(17.523f, 22.0f, 22.0f, 17.522f, 22.0f, 12.0f)
                    curveTo(22.0f, 6.4780000000000015f, 17.523f, 2.0f, 12.0f, 2.0f)
                }
            }.build().also {
                _refreshCircleFilled = it
            }
    }


private var _refreshCircleFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun RefreshCircleFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.RefreshCircleFilled.imageVector,
            contentDescription = null,
    )
}
