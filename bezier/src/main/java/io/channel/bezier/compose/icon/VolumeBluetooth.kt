@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.compose.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.compose.BezierIcon

val BezierIcon.VolumeBluetooth: ImageVector
    get() {
        return _volumeBluetooth ?: ImageVector.Builder(
                name = "VolumeBluetooth",
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
                moveTo(12.9601f, 1.9995f)
                lineTo(12.8286f, 2.0082f)
                curveTo(12.6119f, 2.0369f, 12.4093f, 2.1361f, 12.253f, 2.2924f)
                lineTo(7.545f, 6.9989f)
                lineTo(2.9601f, 6.9995f)
                curveTo(2.4078f, 6.9995f, 1.9601f, 7.4472f, 1.9601f, 7.9995f)
                lineTo(1.9601f, 15.9995f)
                lineTo(1.9668f, 16.1161f)
                curveTo(2.0246f, 16.6135f, 2.4472f, 16.9995f, 2.9601f, 16.9995f)
                lineTo(7.545f, 16.9989f)
                lineTo(12.253f, 21.7066f)
                curveTo(12.4405f, 21.8942f, 12.6949f, 21.9995f, 12.9601f, 21.9995f)
                lineTo(13.9601f, 21.9995f)
                curveTo(14.5124f, 21.9995f, 14.9601f, 21.5518f, 14.9601f, 20.9995f)
                lineTo(14.9601f, 2.9995f)
                curveTo(14.9601f, 2.4472f, 14.5124f, 1.9995f, 13.9601f, 1.9995f)
                lineTo(12.9601f, 1.9995f)
                close()
                moveTo(12.96f, 4.4129f)
                lineTo(12.96f, 19.5849f)
                lineTo(8.6672f, 15.2924f)
                lineTo(8.5681f, 15.2056f)
                curveTo(8.3946f, 15.0727f, 8.1811f, 14.9995f, 7.9601f, 14.9995f)
                lineTo(3.96f, 14.9989f)
                lineTo(3.96f, 8.9989f)
                lineTo(7.9601f, 8.9995f)
                curveTo(8.2253f, 8.9995f, 8.4797f, 8.8941f, 8.6672f, 8.7066f)
                lineTo(12.96f, 4.4129f)
                close()
                moveTo(20.1271f, 6.408f)
                curveTo(19.901f, 6.2321f, 19.5945f, 6.2004f, 19.3372f, 6.3263f)
                curveTo(19.0798f, 6.4521f, 18.9167f, 6.7136f, 18.9167f, 7.0f)
                lineTo(18.9167f, 10.4773f)
                lineTo(17.444f, 9.3956f)
                curveTo(17.1102f, 9.1503f, 16.6408f, 9.2222f, 16.3956f, 9.556f)
                curveTo(16.1503f, 9.8898f, 16.2222f, 10.3592f, 16.556f, 10.6045f)
                lineTo(18.4558f, 12.0f)
                lineTo(16.556f, 13.3956f)
                curveTo(16.2222f, 13.6408f, 16.1503f, 14.1102f, 16.3956f, 14.444f)
                curveTo(16.6408f, 14.7778f, 17.1102f, 14.8497f, 17.444f, 14.6045f)
                lineTo(18.9167f, 13.5227f)
                lineTo(18.9167f, 17.0f)
                curveTo(18.9167f, 17.2865f, 19.0798f, 17.5479f, 19.3372f, 17.6737f)
                curveTo(19.5945f, 17.7996f, 19.901f, 17.7679f, 20.1271f, 17.592f)
                lineTo(23.4605f, 14.9994f)
                curveTo(23.646f, 14.8551f, 23.7532f, 14.6321f, 23.7499f, 14.3971f)
                curveTo(23.7467f, 14.1621f, 23.6335f, 13.9421f, 23.444f, 13.803f)
                lineTo(20.9896f, 12.0f)
                lineTo(23.444f, 10.197f)
                curveTo(23.6335f, 10.0579f, 23.7467f, 9.8379f, 23.7499f, 9.6029f)
                curveTo(23.7532f, 9.3679f, 23.646f, 9.1449f, 23.4605f, 9.0006f)
                lineTo(20.1271f, 6.408f)
                close()
                moveTo(21.7564f, 14.4245f)
                lineTo(20.4167f, 13.4404f)
                lineTo(20.4167f, 15.4665f)
                lineTo(21.7564f, 14.4245f)
                close()
                moveTo(20.4167f, 8.5335f)
                lineTo(20.4167f, 10.5596f)
                lineTo(21.7564f, 9.5755f)
                lineTo(20.4167f, 8.5335f)
                close()
            }
        }.build().also {
            _volumeBluetooth = it
        }
    }

private var _volumeBluetooth: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun VolumeBluetoothIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.VolumeBluetooth,
            contentDescription = null,
    )
}
