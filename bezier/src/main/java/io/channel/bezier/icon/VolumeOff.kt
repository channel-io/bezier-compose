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

val BezierIcon.VolumeOff: ImageVector
    get() {
        return io.channel.bezier.icon._volumeOff ?: ImageVector.Builder(
                name = "VolumeOff",
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
                moveTo(9.7682f, 7.647f)
                lineTo(13.0002f, 10.8791f)
                lineTo(13.0002f, 4.4141f)
                lineTo(9.7682f, 7.647f)
                close()
                moveTo(21.5458f, 19.4246f)
                curveTo(21.9365f, 19.8153f, 21.9362f, 20.4488f, 21.5455f, 20.8392f)
                curveTo(21.1549f, 21.2295f, 20.5218f, 21.2296f, 20.1313f, 20.8391f)
                lineTo(3.1612f, 3.868f)
                curveTo(2.7707f, 3.4775f, 2.7707f, 2.8445f, 3.1612f, 2.454f)
                curveTo(3.5517f, 2.0635f, 4.1847f, 2.0635f, 4.5752f, 2.454f)
                lineTo(8.3542f, 6.233f)
                lineTo(12.2932f, 2.293f)
                curveTo(12.4802f, 2.106f, 12.7352f, 2.0f, 13.0002f, 2.0f)
                lineTo(14.0002f, 2.0f)
                curveTo(14.5522f, 2.0f, 15.0002f, 2.448f, 15.0002f, 3.0f)
                lineTo(15.0002f, 12.879f)
                lineTo(21.5458f, 19.4246f)
                close()
                moveTo(8.7072f, 15.2931f)
                lineTo(13.0002f, 19.5861f)
                lineTo(13.0002f, 15.1211f)
                lineTo(15.0002f, 17.1211f)
                lineTo(15.0002f, 21.0001f)
                curveTo(15.0002f, 21.5521f, 14.5522f, 22.0001f, 14.0002f, 22.0001f)
                lineTo(13.0002f, 22.0001f)
                curveTo(12.7352f, 22.0001f, 12.4802f, 21.8951f, 12.2932f, 21.7071f)
                lineTo(7.5862f, 17.0001f)
                lineTo(3.0002f, 17.0001f)
                curveTo(2.4482f, 17.0001f, 2.0002f, 16.5521f, 2.0002f, 16.0001f)
                lineTo(2.0002f, 8.0f)
                curveTo(2.0002f, 7.4481f, 2.4482f, 7.0001f, 3.0002f, 7.0001f)
                lineTo(4.8792f, 7.0001f)
                lineTo(6.8792f, 9.0f)
                lineTo(4.0002f, 9.0f)
                lineTo(4.0002f, 15.0001f)
                lineTo(8.0002f, 15.0001f)
                curveTo(8.2652f, 15.0001f, 8.5202f, 15.1061f, 8.7072f, 15.2931f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._volumeOff = it
        }
    }

private var _volumeOff: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun VolumeOffIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.VolumeOff,
            contentDescription = null,
    )
}