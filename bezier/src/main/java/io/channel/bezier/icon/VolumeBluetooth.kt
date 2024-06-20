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
import io.channel.bezier.BezierIcons

val BezierIcons.VolumeBluetooth: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _volumeBluetooth ?: ImageVector.Builder(
                    name = "VolumeBluetooth",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                        pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(12.96f, 2.0f)
                    lineTo(12.829f, 2.008f)
                    arcTo(1.0f, 1.0f, 262.4838661647403f, isMoreThanHalf = false, isPositiveArc = false, 12.253f, 2.292f)
                    lineTo(7.545f, 7.0f)
                    lineTo(2.96f, 7.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 1.96f, 8.0f)
                    lineTo(1.96f, 16.0f)
                    lineTo(1.9669999999999999f, 16.117f)
                    arcTo(1.0f, 1.0f, 173.28100503297742f, isMoreThanHalf = false, isPositiveArc = false, 2.96f, 17.0f)
                    lineTo(7.545f, 16.999f)
                    lineTo(12.253f, 21.707f)
                    arcTo(1.0f, 1.0f, 135.0086535104836f, isMoreThanHalf = false, isPositiveArc = false, 12.96f, 22.0f)
                    lineTo(13.96f, 22.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 14.96f, 21.0f)
                    lineTo(14.96f, 3.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 13.96f, 2.0f)
                    close()
                    moveTo(12.96f, 4.413f)
                    lineTo(12.96f, 19.585f)
                    lineTo(8.667000000000002f, 15.292000000000002f)
                    lineTo(8.568000000000001f, 15.206000000000001f)
                    arcTo(1.0f, 1.0f, 307.5333136202617f, isMoreThanHalf = false, isPositiveArc = false, 7.960000000000002f, 14.999f)
                    lineTo(3.9600000000000017f, 14.999f)
                    lineTo(3.9600000000000017f, 8.999f)
                    lineTo(7.960000000000002f, 8.999f)
                    arcTo(1.0f, 1.0f, 90.04510649096176f, isMoreThanHalf = false, isPositiveArc = false, 8.667000000000002f, 8.707f)
                    close()
                    moveTo(20.127000000000002f, 6.408f)
                    arcTo(0.75f, 0.75f, 307.83092563112524f, isMoreThanHalf = false, isPositiveArc = false, 18.917f, 7.0f)
                    lineTo(18.917f, 10.477f)
                    lineTo(17.444000000000003f, 9.396f)
                    arcTo(0.75f, 0.75f, 308.1082184910414f, isMoreThanHalf = true, isPositiveArc = false, 16.556f, 10.604000000000001f)
                    lineTo(18.456f, 12.0f)
                    lineTo(16.556f, 13.396f)
                    arcTo(0.75f, 0.75f, 235.46905534118383f, isMoreThanHalf = true, isPositiveArc = false, 17.444000000000003f, 14.604000000000001f)
                    lineTo(18.917f, 13.523000000000001f)
                    lineTo(18.917f, 17.0f)
                    arcTo(0.75f, 0.75f, 179.97188238889774f, isMoreThanHalf = false, isPositiveArc = false, 20.127000000000002f, 17.592f)
                    lineTo(23.461000000000002f, 14.998999999999999f)
                    arcTo(0.75f, 0.75f, 52.06950042540911f, isMoreThanHalf = false, isPositiveArc = false, 23.444000000000003f, 13.802999999999999f)
                    lineTo(20.99f, 12.0f)
                    lineTo(23.444f, 10.197f)
                    arcTo(0.75f, 0.75f, 53.698200529757905f, isMoreThanHalf = false, isPositiveArc = false, 23.461f, 9.001f)
                    close()
                    moveTo(21.757f, 14.425f)
                    lineTo(20.417f, 13.440000000000001f)
                    lineTo(20.417f, 15.467000000000002f)
                    close()
                    moveTo(20.417f, 8.533000000000001f)
                    lineTo(20.417f, 10.560000000000002f)
                    lineTo(21.757f, 9.575000000000003f)
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
            imageVector = BezierIcons.VolumeBluetooth.imageVector,
            contentDescription = null,
    )
}
