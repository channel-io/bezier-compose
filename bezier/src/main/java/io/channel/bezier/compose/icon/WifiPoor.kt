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

val BezierIcon.WifiPoor: ImageVector
    get() {
        return _wifiPoor ?: ImageVector.Builder(
                name = "WifiPoor",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0x4C313234)),
                    strokeLineWidth = 1f,
                    strokeAlpha = 0.3f,
            ) {
                moveTo(16.4393f, 14.5875f)
                curveTo(16.6528f, 14.7628f, 16.9682f, 14.7558f, 17.1582f, 14.5553f)
                lineTo(18.4993f, 13.1397f)
                curveTo(18.7082f, 12.9192f, 18.6997f, 12.5698f, 18.4682f, 12.3733f)
                curveTo(16.7245f, 10.893f, 14.4665f, 10.0f, 12.0f, 10.0f)
                curveTo(9.5335f, 10.0f, 7.2755f, 10.893f, 5.5318f, 12.3733f)
                curveTo(5.3003f, 12.5698f, 5.2919f, 12.9192f, 5.5007f, 13.1397f)
                lineTo(6.8419f, 14.5553f)
                curveTo(7.0318f, 14.7558f, 7.3472f, 14.7628f, 7.5607f, 14.5875f)
                curveTo(8.7688f, 13.5955f, 10.3148f, 13.0f, 12.0f, 13.0f)
                curveTo(13.6852f, 13.0f, 15.2313f, 13.5955f, 16.4393f, 14.5875f)
                close()
                moveTo(19.883f, 10.9522f)
                curveTo(20.0911f, 11.1337f, 20.407f, 11.126f, 20.5969f, 10.9255f)
                lineTo(21.938f, 9.5099f)
                curveTo(22.1469f, 9.2894f, 22.1382f, 8.9405f, 21.9103f, 8.7398f)
                curveTo(19.2675f, 6.412f, 15.7986f, 5.0f, 12.0f, 5.0f)
                curveTo(8.2014f, 5.0f, 4.7326f, 6.412f, 2.0898f, 8.7398f)
                curveTo(1.8619f, 8.9405f, 1.8531f, 9.2894f, 2.062f, 9.5099f)
                lineTo(3.4031f, 10.9255f)
                curveTo(3.5931f, 11.126f, 3.9089f, 11.1337f, 4.1171f, 10.9522f)
                curveTo(6.2256f, 9.1136f, 8.9827f, 8.0f, 12.0f, 8.0f)
                curveTo(15.0173f, 8.0f, 17.7744f, 9.1136f, 19.883f, 10.9522f)
                close()
            }

            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(8.9803f, 16.0145f)
                curveTo(8.7383f, 16.1981f, 8.7306f, 16.5489f, 8.9395f, 16.7694f)
                lineTo(11.637f, 19.6169f)
                curveTo(11.8342f, 19.825f, 12.1658f, 19.825f, 12.363f, 19.6169f)
                lineTo(15.0605f, 16.7694f)
                curveTo(15.2694f, 16.5489f, 15.2617f, 16.1981f, 15.0197f, 16.0145f)
                curveTo(14.1807f, 15.3778f, 13.1345f, 15.0f, 12.0f, 15.0f)
                curveTo(10.8655f, 15.0f, 9.8193f, 15.3778f, 8.9803f, 16.0145f)
                close()
            }
        }.build().also {
            _wifiPoor = it
        }
    }

private var _wifiPoor: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun WifiPoorIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.WifiPoor,
            contentDescription = null,
    )
}
