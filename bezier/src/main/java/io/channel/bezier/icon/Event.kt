@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

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

val BezierIcon.Event: ImageVector
    get() {
        return io.channel.bezier.icon._event ?: ImageVector.Builder(
                name = "Event",
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
                moveTo(6.2432f, 5.332f)
                curveTo(9.2842f, 0.889f, 15.7162f, 0.889f, 18.7562f, 5.332f)
                curveTo(20.5182f, 7.905f, 20.3532f, 11.345f, 18.6102f, 13.931f)
                lineTo(12.9442f, 22.339f)
                curveTo(12.7322f, 22.655f, 12.2682f, 22.655f, 12.0562f, 22.339f)
                lineTo(6.3892f, 13.931f)
                curveTo(4.6462f, 11.345f, 4.4822f, 7.905f, 6.2432f, 5.332f)
                close()
                moveTo(14.7788f, 13.9457f)
                lineTo(12.5002f, 12.2905f)
                lineTo(10.2216f, 13.9457f)
                curveTo(9.6944f, 14.3286f, 8.9854f, 13.8133f, 9.1868f, 13.1938f)
                lineTo(10.0568f, 10.5152f)
                lineTo(7.7782f, 8.8599f)
                curveTo(7.2515f, 8.4771f, 7.5225f, 7.6433f, 8.1739f, 7.6433f)
                lineTo(10.9901f, 7.6433f)
                lineTo(11.8606f, 4.9647f)
                curveTo(12.0621f, 4.3451f, 12.9383f, 4.3451f, 13.1397f, 4.9647f)
                lineTo(14.0102f, 7.6433f)
                lineTo(16.8264f, 7.6433f)
                curveTo(17.4778f, 7.6433f, 17.7483f, 8.4771f, 17.2217f, 8.8599f)
                lineTo(14.9431f, 10.5152f)
                lineTo(15.8135f, 13.1938f)
                curveTo(16.0145f, 13.8133f, 15.3059f, 14.3286f, 14.7788f, 13.9457f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._event = it
        }
    }

private var _event: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun EventIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Event,
            contentDescription = null,
    )
}