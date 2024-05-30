@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons

val BezierIcons.VolumeDown: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _volumeDown ?: ImageVector.Builder(
                    name = "VolumeDown",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                ) {
                    moveTo(13.0002f, 2.00012f)
                    lineTo(12.8687f, 2.00879f)
                    curveTo(12.652f, 2.03752f, 12.4494f, 2.13673f, 12.2931f, 2.29302f)
                    lineTo(7.58498f, 7.00002f)
                    lineTo(3.00018f, 7.00012f)
                    curveTo(2.4479f, 7.00012f, 2.00018f, 7.44784f, 2.00018f, 8.00012f)
                    lineTo(2.00018f, 16.0001f)
                    lineTo(2.00691f, 16.1167f)
                    curveTo(2.06468f, 16.6141f, 2.48735f, 17.0001f, 3.00018f, 17.0001f)
                    lineTo(7.58598f, 17.0f)
                    lineTo(12.2931f, 21.7072f)
                    curveTo(12.4806f, 21.8948f, 12.735f, 22.0001f, 13.0002f, 22.0001f)
                    lineTo(14.0002f, 22.0001f)
                    curveTo(14.5525f, 22.0001f, 15.0002f, 21.5524f, 15.0002f, 21.0001f)
                    lineTo(15.0002f, 3.00012f)
                    curveTo(15.0002f, 2.44784f, 14.5525f, 2.00012f, 14.0002f, 2.00012f)
                    lineTo(13.0002f, 2.00012f)
                    close()
                    moveTo(13.0f, 4.414f)
                    lineTo(13.0f, 19.585f)
                    lineTo(8.70731f, 15.293f)
                    lineTo(8.60823f, 15.2062f)
                    curveTo(8.43468f, 15.0733f, 8.22121f, 15.0001f, 8.0002f, 15.0001f)
                    lineTo(4.0f, 15.0f)
                    lineTo(4.0f, 9.0f)
                    lineTo(8.0002f, 9.0001f)
                    curveTo(8.26542f, 9.0001f, 8.51977f, 8.89474f, 8.70731f, 8.70721f)
                    lineTo(13.0f, 4.414f)
                    close()
                    moveTo(19.8814f, 8.52216f)
                    curveTo(19.5672f, 8.06798f, 18.9248f, 8.07171f, 18.5343f, 8.46223f)
                    lineTo(18.4971f, 8.49944f)
                    curveTo(18.1214f, 8.87512f, 18.1173f, 9.47544f, 18.3741f, 9.94055f)
                    curveTo(19.0741f, 11.2082f, 19.1223f, 12.8098f, 18.4179f, 14.0538f)
                    curveTo(18.1515f, 14.5244f, 18.1372f, 15.1411f, 18.5196f, 15.5235f)
                    curveTo(18.9133f, 15.9172f, 19.5629f, 15.9064f, 19.8672f, 15.4401f)
                    curveTo(21.2254f, 13.3595f, 21.2874f, 10.5544f, 19.8814f, 8.52216f)
                    close()
                }
            }.build().also {
                _volumeDown = it
            }
    }


private var _volumeDown: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun VolumeDownIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.VolumeDown.imageVector,
            contentDescription = null,
    )
}
