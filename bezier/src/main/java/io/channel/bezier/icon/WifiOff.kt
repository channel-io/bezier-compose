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

val BezierIcons.WifiOff: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _wifiOff ?: ImageVector.Builder(
                    name = "WifiOff",
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
                    moveTo(3.81424f, 1.80718f)
                    curveTo(3.42372f, 2.1977f, 3.42372f, 2.83087f, 3.81424f, 3.22139f)
                    lineTo(19.7848f, 19.192f)
                    curveTo(20.1753f, 19.5825f, 20.8085f, 19.5825f, 21.199f, 19.192f)
                    curveTo(21.5895f, 18.8014f, 21.5895f, 18.1683f, 21.199f, 17.7777f)
                    lineTo(17.5563f, 14.135f)
                    lineTo(18.4993f, 13.1397f)
                    curveTo(18.7082f, 12.9192f, 18.6997f, 12.5698f, 18.4682f, 12.3733f)
                    curveTo(17.0945f, 11.2071f, 15.4016f, 10.4054f, 13.539f, 10.1177f)
                    lineTo(11.4344f, 8.0131f)
                    curveTo(11.6218f, 8.0044f, 11.8104f, 8.0f, 12.0f, 8.0f)
                    curveTo(15.0173f, 8.0f, 17.7744f, 9.11358f, 19.883f, 10.9522f)
                    curveTo(20.0911f, 11.1337f, 20.407f, 11.126f, 20.5969f, 10.9255f)
                    lineTo(21.938f, 9.50989f)
                    curveTo(22.1469f, 9.28941f, 22.1382f, 8.94053f, 21.9103f, 8.73978f)
                    curveTo(19.2675f, 6.412f, 15.7986f, 5.0f, 12.0f, 5.0f)
                    curveTo(10.8911f, 5.0f, 9.81029f, 5.12033f, 8.76993f, 5.34865f)
                    lineTo(5.22845f, 1.80718f)
                    curveTo(4.83793f, 1.41665f, 4.20476f, 1.41665f, 3.81424f, 1.80718f)
                    close()
                    moveTo(2.08976f, 8.73978f)
                    curveTo(3.14143f, 7.81347f, 4.3239f, 7.03218f, 5.6059f, 6.42718f)
                    lineTo(7.89809f, 8.71937f)
                    curveTo(6.49761f, 9.22874f, 5.21879f, 9.99148f, 4.11706f, 10.9522f)
                    curveTo(3.90891f, 11.1337f, 3.59306f, 11.126f, 3.40313f, 10.9255f)
                    lineTo(2.06201f, 9.50989f)
                    curveTo(1.85313f, 9.28941f, 1.86185f, 8.94053f, 2.08976f, 8.73978f)
                    close()
                    moveTo(5.53183f, 12.3733f)
                    curveTo(6.66401f, 11.4121f, 8.01297f, 10.6986f, 9.49505f, 10.3163f)
                    lineTo(12.181f, 13.0023f)
                    curveTo(12.1209f, 13.0008f, 12.0605f, 13.0f, 12.0f, 13.0f)
                    curveTo(10.3148f, 13.0f, 8.76875f, 13.5955f, 7.56068f, 14.5875f)
                    curveTo(7.34724f, 14.7628f, 7.0318f, 14.7558f, 6.84186f, 14.5553f)
                    lineTo(5.50074f, 13.1397f)
                    curveTo(5.29186f, 12.9192f, 5.30029f, 12.5698f, 5.53183f, 12.3733f)
                    close()
                    moveTo(8.93948f, 16.7694f)
                    curveTo(8.73059f, 16.5489f, 8.73835f, 16.1981f, 8.9803f, 16.0145f)
                    curveTo(9.81931f, 15.3778f, 10.8655f, 15.0f, 12.0f, 15.0f)
                    curveTo(13.1345f, 15.0f, 14.1807f, 15.3778f, 15.0197f, 16.0145f)
                    curveTo(15.2617f, 16.1981f, 15.2694f, 16.5489f, 15.0605f, 16.7694f)
                    lineTo(12.363f, 19.6169f)
                    curveTo(12.1658f, 19.825f, 11.8342f, 19.825f, 11.637f, 19.6169f)
                    lineTo(8.93948f, 16.7694f)
                    close()
                }
            }.build().also {
                _wifiOff = it
            }
    }


private var _wifiOff: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun WifiOffIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.WifiOff.imageVector,
            contentDescription = null,
    )
}
