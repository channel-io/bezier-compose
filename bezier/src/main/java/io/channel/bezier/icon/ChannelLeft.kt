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

val BezierIcon.ChannelLeft: ImageVector
    get() {
        return _channelLeft ?: ImageVector.Builder(
                name = "ChannelLeft",
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
                moveTo(11.9977f, 4.0001f)
                curveTo(9.8767f, 4.0001f, 7.8717f, 4.8181f, 6.3487f, 6.3371f)
                curveTo(4.5077f, 8.1751f, 3.6897f, 10.7231f, 4.1057f, 13.3271f)
                curveTo(4.6477f, 16.7131f, 7.4087f, 19.4221f, 10.8217f, 19.9151f)
                curveTo(12.5327f, 20.1621f, 14.2377f, 19.8671f, 15.7477f, 19.0601f)
                curveTo(16.3897f, 18.7181f, 17.1057f, 18.6481f, 17.7627f, 18.8671f)
                lineTo(19.4187f, 19.4181f)
                lineTo(18.8667f, 17.7631f)
                curveTo(18.6487f, 17.1071f, 18.7167f, 16.3921f, 19.0597f, 15.7481f)
                curveTo(19.9437f, 14.0931f, 20.2107f, 12.2281f, 19.8337f, 10.3541f)
                curveTo(19.1867f, 7.1421f, 16.5797f, 4.6321f, 13.3447f, 4.1091f)
                curveTo(12.8927f, 4.0361f, 12.4427f, 4.0001f, 11.9977f, 4.0001f)
                close()
                moveTo(11.9997f, 22.0001f)
                curveTo(11.5137f, 22.0001f, 11.0247f, 21.9651f, 10.5357f, 21.8941f)
                curveTo(6.2657f, 21.2771f, 2.8097f, 17.8841f, 2.1317f, 13.6431f)
                curveTo(1.6127f, 10.3971f, 2.6347f, 7.2181f, 4.9357f, 4.9221f)
                curveTo(7.2377f, 2.6251f, 10.4197f, 1.6101f, 13.6637f, 2.1351f)
                curveTo(17.7167f, 2.7911f, 20.9847f, 5.9351f, 21.7947f, 9.9591f)
                curveTo(22.2647f, 12.2941f, 21.9287f, 14.6211f, 20.8247f, 16.6891f)
                curveTo(20.7767f, 16.7781f, 20.7057f, 16.9551f, 20.7647f, 17.1311f)
                lineTo(21.6327f, 19.7351f)
                curveTo(21.8127f, 20.2771f, 21.6747f, 20.8651f, 21.2697f, 21.2701f)
                curveTo(20.8657f, 21.6741f, 20.2747f, 21.8121f, 19.7347f, 21.6321f)
                lineTo(17.1297f, 20.7641f)
                curveTo(16.9547f, 20.7061f, 16.7797f, 20.7771f, 16.6907f, 20.8241f)
                curveTo(15.2337f, 21.6021f, 13.6347f, 22.0001f, 11.9997f, 22.0001f)
                close()
                moveTo(6.7712f, 14.065f)
                curveTo(5.9262f, 14.065f, 5.5732f, 13.455f, 5.5732f, 11.96f)
                curveTo(5.5732f, 10.465f, 5.9262f, 9.855f, 6.7712f, 9.855f)
                curveTo(7.6162f, 9.855f, 7.9702f, 10.465f, 7.9702f, 11.96f)
                curveTo(7.9702f, 13.455f, 7.6162f, 14.065f, 6.7712f, 14.065f)
                close()
                moveTo(11.9994f, 11.96f)
                curveTo(11.9994f, 13.455f, 12.3534f, 14.065f, 13.1984f, 14.065f)
                curveTo(14.0434f, 14.065f, 14.3964f, 13.455f, 14.3964f, 11.96f)
                curveTo(14.3964f, 10.465f, 14.0434f, 9.855f, 13.1984f, 9.855f)
                curveTo(12.3534f, 9.855f, 11.9994f, 10.465f, 11.9994f, 11.96f)
                close()
            }
        }.build().also {
            _channelLeft = it
        }
    }

private var _channelLeft: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChannelLeftIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.ChannelLeft,
            contentDescription = null,
    )
}