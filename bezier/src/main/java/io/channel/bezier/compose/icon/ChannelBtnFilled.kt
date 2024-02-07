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

val BezierIcon.ChannelBtnFilled: ImageVector
    get() {
        return _channelBtnFilled ?: ImageVector.Builder(
                name = "ChannelBtnFilled",
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
                moveTo(12.0f, 1.0f)
                curveTo(5.9587f, 1.0f, 1.0538f, 5.872f, 1.0f, 11.9004f)
                lineTo(1.0f, 12.0996f)
                curveTo(1.0538f, 18.1285f, 5.9587f, 23.0f, 12.0f, 23.0f)
                curveTo(18.0752f, 23.0f, 23.0f, 18.0747f, 23.0f, 12.0f)
                curveTo(23.0f, 5.9253f, 18.0752f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(17.8042f, 16.212f)
                curveTo(17.665f, 15.7962f, 17.7008f, 15.3436f, 17.8977f, 14.952f)
                curveTo(18.4609f, 13.8349f, 18.7183f, 12.5386f, 18.5483f, 11.1669f)
                curveTo(18.1804f, 8.2057f, 15.7923f, 5.8121f, 12.83f, 5.4508f)
                curveTo(8.5351f, 4.9266f, 4.9271f, 8.5341f, 5.4507f, 12.8295f)
                curveTo(5.812f, 15.7913f, 8.2051f, 18.1794f, 11.1657f, 18.5479f)
                curveTo(12.5374f, 18.7184f, 13.8343f, 18.461f, 14.9519f, 17.8983f)
                curveTo(15.3435f, 17.7009f, 15.7961f, 17.6651f, 16.2125f, 17.8043f)
                lineTo(17.5561f, 18.252f)
                curveTo(17.9862f, 18.3955f, 18.3949f, 17.9863f, 18.2524f, 17.5568f)
                lineTo(17.8042f, 16.212f)
                close()
                moveTo(8.9722f, 11.9447f)
                curveTo(8.9722f, 13.0763f, 9.2392f, 13.5389f, 9.8791f, 13.5389f)
                curveTo(10.5196f, 13.5389f, 10.7872f, 13.0763f, 10.7872f, 11.9447f)
                curveTo(10.7872f, 10.8126f, 10.5196f, 10.35f, 9.8791f, 10.35f)
                curveTo(9.2392f, 10.35f, 8.9722f, 10.8126f, 8.9722f, 11.9447f)
                close()
                moveTo(13.2138f, 11.9453f)
                curveTo(13.2138f, 13.0772f, 13.4808f, 13.54f, 14.1216f, 13.54f)
                curveTo(14.7618f, 13.54f, 15.0288f, 13.0772f, 15.0288f, 11.9453f)
                curveTo(15.0288f, 10.8127f, 14.7618f, 10.35f, 14.1216f, 10.35f)
                curveTo(13.4808f, 10.35f, 13.2138f, 10.8127f, 13.2138f, 11.9453f)
                close()
            }
        }.build().also {
            _channelBtnFilled = it
        }
    }

private var _channelBtnFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChannelBtnFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.ChannelBtnFilled,
            contentDescription = null,
    )
}
