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

val BezierIcons.Power: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_power
        override val imageVector: ImageVector
            get() = _power ?: ImageVector.Builder(
                    name = "Power",
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
                    moveTo(12.0f, 12.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 11.0f, 11.0f)
                    lineTo(11.0f, 3.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = true, 13.0f, 3.0f)
                    lineTo(13.0f, 11.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 12.0f, 12.0f)
                    moveTo(2.0f, 12.0f)
                    curveTo(2.0f, 17.514f, 6.486f, 22.0f, 12.0f, 22.0f)
                    curveTo(17.514f, 22.0f, 22.0f, 17.514f, 22.0f, 12.0f)
                    curveTo(22.0f, 8.514f, 20.152f, 5.273f, 17.212f, 3.4700000000000006f)
                    curveTo(16.698999999999998f, 3.154000000000001f, 16.044999999999998f, 3.3930000000000007f, 15.788f, 3.9370000000000007f)
                    curveTo(15.574f, 4.391000000000001f, 15.772f, 4.929f, 16.198f, 5.1930000000000005f)
                    arcTo(8.05f, 8.05f, 301.8498117018271f, isMoreThanHalf = false, isPositiveArc = true, 20.0f, 12.0f)
                    curveTo(20.0f, 16.411f, 16.411f, 20.0f, 12.0f, 20.0f)
                    curveTo(7.588999999999999f, 20.0f, 4.0f, 16.411f, 4.0f, 12.0f)
                    arcTo(8.05f, 8.05f, 180.22025616838383f, isMoreThanHalf = false, isPositiveArc = true, 7.802f, 5.193f)
                    curveTo(8.229f, 4.928999999999999f, 8.426f, 4.391f, 8.212f, 3.9369999999999994f)
                    curveTo(7.955f, 3.3919999999999995f, 7.301f, 3.1539999999999995f, 6.788f, 3.4699999999999993f)
                    curveTo(3.848f, 5.274f, 2.0f, 8.514f, 2.0f, 12.0f)
                }
            }.build().also {
                _power = it
            }
    }


private var _power: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun PowerIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Power.imageVector,
            contentDescription = null,
    )
}
