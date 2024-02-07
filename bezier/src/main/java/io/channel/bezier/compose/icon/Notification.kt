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

val BezierIcon.Notification: ImageVector
    get() {
        return _notification ?: ImageVector.Builder(
                name = "Notification",
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
                moveTo(4.5991f, 12.5451f)
                curveTo(5.4213f, 11.2233f, 5.8572f, 9.6991f, 5.8572f, 8.1442f)
                curveTo(5.8572f, 4.7508f, 8.6081f, 2.0002f, 12.0022f, 2.0002f)
                curveTo(15.3955f, 2.0002f, 18.1462f, 4.751f, 18.1462f, 8.1442f)
                curveTo(18.1462f, 9.6994f, 18.5824f, 11.2234f, 19.405f, 12.5445f)
                lineTo(21.7567f, 16.3196f)
                curveTo(22.2111f, 17.0511f, 21.6851f, 18.0002f, 20.8222f, 18.0002f)
                lineTo(16.002f, 18.0002f)
                curveTo(16.0019f, 20.2094f, 14.2113f, 22.0001f, 12.002f, 22.0001f)
                curveTo(9.7928f, 22.0001f, 8.0021f, 20.2094f, 8.002f, 18.0002f)
                lineTo(3.1812f, 18.0002f)
                curveTo(2.3168f, 18.0002f, 1.7905f, 17.0475f, 2.2499f, 16.3162f)
                lineTo(4.5991f, 12.5451f)
                close()
                moveTo(10.002f, 18.0002f)
                curveTo(10.0021f, 19.1049f, 10.8974f, 20.0001f, 12.002f, 20.0001f)
                curveTo(13.1067f, 20.0001f, 14.0019f, 19.1049f, 14.002f, 18.0002f)
                lineTo(10.002f, 18.0002f)
                close()
                moveTo(19.2014f, 16.0002f)
                lineTo(17.7074f, 13.6018f)
                curveTo(16.6872f, 11.9635f, 16.1462f, 10.0733f, 16.1462f, 8.1442f)
                curveTo(16.1462f, 5.8555f, 14.291f, 4.0002f, 12.0022f, 4.0002f)
                curveTo(9.7127f, 4.0002f, 7.8572f, 5.8554f, 7.8572f, 8.1442f)
                curveTo(7.8572f, 10.0727f, 7.3166f, 11.9629f, 6.297f, 13.602f)
                lineTo(4.803f, 16.0002f)
                lineTo(19.2014f, 16.0002f)
                close()
            }
        }.build().also {
            _notification = it
        }
    }

private var _notification: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun NotificationIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Notification,
            contentDescription = null,
    )
}
