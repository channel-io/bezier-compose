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

val BezierIcons.ChannelBtnFilled: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _channelBtnFilled ?: ImageVector.Builder(
                    name = "ChannelBtnFilled",
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
                    moveTo(14.7206f, 2.0f)
                    lineTo(9.27942f, 2.0f)
                    curveTo(5.25911f, 2.0f, 2.0f, 5.25911f, 2.0f, 9.27942f)
                    lineTo(2.0f, 14.7206f)
                    curveTo(2.0f, 18.7409f, 5.25911f, 22.0f, 9.27942f, 22.0f)
                    lineTo(14.7206f, 22.0f)
                    curveTo(18.7409f, 22.0f, 22.0f, 18.7409f, 22.0f, 14.7206f)
                    lineTo(22.0f, 9.27942f)
                    curveTo(22.0f, 5.25911f, 18.7409f, 2.0f, 14.7206f, 2.0f)
                    close()
                    moveTo(17.5378f, 14.3209f)
                    curveTo(17.8377f, 13.607f, 18.0033f, 12.8249f, 18.0033f, 12.0024f)
                    curveTo(18.0033f, 8.69942f, 15.3094f, 6.0f, 12.0065f, 6.0f)
                    curveTo(8.6906f, 6.0f, 6.00222f, 8.68654f, 6.00406f, 12.0024f)
                    curveTo(6.00406f, 15.3054f, 8.70348f, 18.0011f, 12.0065f, 18.0011f)
                    curveTo(12.829f, 18.0011f, 13.611f, 17.8355f, 14.325f, 17.5356f)
                    curveTo(14.7684f, 17.3497f, 15.2616f, 17.3166f, 15.729f, 17.4325f)
                    lineTo(17.0336f, 17.7582f)
                    curveTo(17.4734f, 17.8686f, 17.8708f, 17.4693f, 17.7604f, 17.0314f)
                    lineTo(17.4347f, 15.7267f)
                    curveTo(17.3188f, 15.2594f, 17.3519f, 14.7662f, 17.5378f, 14.3227f)
                    lineTo(17.5378f, 14.3209f)
                    close()
                    moveTo(15.5227f, 13.2324f)
                    curveTo(14.8474f, 14.4855f, 13.5225f, 15.3357f, 12.0007f, 15.3357f)
                    lineTo(11.997f, 15.3357f)
                    curveTo(10.4753f, 15.3357f, 9.15042f, 14.4837f, 8.4751f, 13.2324f)
                    curveTo(8.39966f, 13.0926f, 8.45118f, 12.9178f, 8.58735f, 12.835f)
                    lineTo(9.66196f, 12.1909f)
                    curveTo(9.81469f, 12.1008f, 10.0061f, 12.1615f, 10.087f, 12.3179f)
                    curveTo(10.444f, 13.0116f, 11.1653f, 13.4864f, 11.9989f, 13.4864f)
                    curveTo(12.8324f, 13.4864f, 13.5538f, 13.0116f, 13.9107f, 12.3179f)
                    curveTo(13.9917f, 12.1615f, 14.1849f, 12.1008f, 14.3358f, 12.1909f)
                    lineTo(15.4104f, 12.835f)
                    curveTo(15.5484f, 12.9178f, 15.5981f, 13.0926f, 15.5227f, 13.2324f)
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
            imageVector = BezierIcons.ChannelBtnFilled.imageVector,
            contentDescription = null,
    )
}
