@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.compose.icon

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
import io.channel.bezier.compose.BezierIcon

val BezierIcon.Help: ImageVector
    get() {
        return _help ?: ImageVector.Builder(
                name = "Help",
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
                moveTo(21.9999f, 11.9998f)
                curveTo(21.9999f, 17.5227f, 17.5225f, 21.9998f, 11.9999f, 21.9998f)
                curveTo(6.4766f, 21.9998f, 1.9999f, 17.5231f, 1.9999f, 11.9998f)
                curveTo(1.9999f, 6.4765f, 6.4766f, 1.9998f, 11.9999f, 1.9998f)
                curveTo(17.5225f, 1.9998f, 21.9999f, 6.4768f, 21.9999f, 11.9998f)
                close()
                moveTo(19.9999f, 11.9998f)
                curveTo(19.9999f, 7.5814f, 16.418f, 3.9998f, 11.9999f, 3.9998f)
                curveTo(7.5812f, 3.9998f, 3.9999f, 7.5811f, 3.9999f, 11.9998f)
                curveTo(3.9999f, 16.4185f, 7.5812f, 19.9998f, 11.9999f, 19.9998f)
                curveTo(16.418f, 19.9998f, 19.9999f, 16.4181f, 19.9999f, 11.9998f)
                close()
                moveTo(10.9332f, 14.4922f)
                lineTo(12.834f, 14.4922f)
                lineTo(12.834f, 13.7839f)
                curveTo(12.834f, 13.0655f, 13.3822f, 12.6413f, 13.6184f, 12.4923f)
                curveTo(14.4507f, 11.969f, 15.8433f, 11.0907f, 15.8433f, 9.4369f)
                curveTo(15.8433f, 7.496f, 14.1556f, 5.9754f, 12.0016f, 5.9754f)
                curveTo(9.9187f, 5.9754f, 8.1599f, 7.5611f, 8.1599f, 9.4369f)
                lineTo(10.0608f, 9.4369f)
                curveTo(10.0608f, 8.6055f, 10.9672f, 7.8762f, 12.0016f, 7.8762f)
                curveTo(12.942f, 7.8762f, 13.9425f, 8.4235f, 13.9425f, 9.4369f)
                curveTo(13.9425f, 9.9452f, 13.4723f, 10.3383f, 12.6049f, 10.8846f)
                curveTo(11.5584f, 11.5449f, 10.9332f, 12.6283f, 10.9332f, 13.7839f)
                lineTo(10.9332f, 14.4922f)
                close()
                moveTo(11.9445f, 18.1236f)
                curveTo(12.6318f, 18.1236f, 13.188f, 17.5674f, 13.188f, 16.8801f)
                curveTo(13.188f, 16.1928f, 12.6318f, 15.6365f, 11.9445f, 15.6365f)
                curveTo(11.2582f, 15.6365f, 10.7009f, 16.1928f, 10.7009f, 16.8801f)
                curveTo(10.7009f, 17.5674f, 11.2582f, 18.1236f, 11.9445f, 18.1236f)
                close()
            }
        }.build().also {
            _help = it
        }
    }

private var _help: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun HelpIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Help,
            contentDescription = null,
    )
}
