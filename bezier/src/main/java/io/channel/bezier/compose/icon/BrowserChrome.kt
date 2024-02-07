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

val BezierIcon.BrowserChrome: ImageVector
    get() {
        return _browserChrome ?: ImageVector.Builder(
                name = "BrowserChrome",
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
                moveTo(11.9998f, 6.6478f)
                curveTo(9.5528f, 6.6478f, 7.5058f, 8.3088f, 6.8708f, 10.5558f)
                lineTo(4.1438f, 5.8328f)
                curveTo(5.9768f, 3.5038f, 8.8138f, 1.9998f, 11.9998f, 1.9998f)
                curveTo(15.5438f, 1.9998f, 18.6568f, 3.8588f, 20.4328f, 6.6478f)
                lineTo(12.0568f, 6.6478f)
                lineTo(12.0378f, 6.6518f)
                curveTo(12.0313f, 6.6518f, 12.025f, 6.6508f, 12.0188f, 6.6498f)
                lineTo(12.0188f, 6.6498f)
                curveTo(12.0125f, 6.6488f, 12.0063f, 6.6478f, 11.9998f, 6.6478f)
                close()
                moveTo(12.0f, 15.721f)
                curveTo(9.949f, 15.721f, 8.28f, 14.051f, 8.28f, 12.0f)
                curveTo(8.28f, 9.948f, 9.949f, 8.28f, 12.0f, 8.28f)
                curveTo(14.052f, 8.28f, 15.721f, 9.948f, 15.721f, 12.0f)
                curveTo(15.721f, 14.051f, 14.052f, 15.721f, 12.0f, 15.721f)
                close()
                moveTo(21.2746f, 8.2803f)
                lineTo(15.8356f, 8.2803f)
                curveTo(16.7716f, 9.2443f, 17.3536f, 10.5533f, 17.3536f, 12.0003f)
                curveTo(17.3536f, 12.9503f, 17.0836f, 13.8313f, 16.6466f, 14.6053f)
                curveTo(16.64f, 14.6217f, 16.6358f, 14.6386f, 16.6316f, 14.6555f)
                curveTo(16.6256f, 14.6797f, 16.6196f, 14.7039f, 16.6066f, 14.7263f)
                lineTo(12.4196f, 21.9783f)
                curveTo(17.7376f, 21.7573f, 22.0006f, 17.3733f, 22.0006f, 12.0003f)
                curveTo(22.0006f, 10.6843f, 21.7386f, 9.4313f, 21.2746f, 8.2803f)
                close()
                moveTo(12.0002f, 17.353f)
                curveTo(12.4542f, 17.353f, 12.8882f, 17.278f, 13.3092f, 17.172f)
                lineTo(10.5862f, 21.888f)
                curveTo(5.7412f, 21.197f, 2.0002f, 17.033f, 2.0002f, 12.0f)
                curveTo(2.0002f, 10.328f, 2.4172f, 8.754f, 3.1452f, 7.368f)
                lineTo(7.3362f, 14.627f)
                curveTo(7.3474f, 14.6454f, 7.3623f, 14.6601f, 7.3772f, 14.6748f)
                curveTo(7.3891f, 14.6865f, 7.401f, 14.6983f, 7.4112f, 14.712f)
                curveTo(8.3442f, 16.284f, 10.0412f, 17.353f, 12.0002f, 17.353f)
                close()
            }
        }.build().also {
            _browserChrome = it
        }
    }

private var _browserChrome: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun BrowserChromeIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.BrowserChrome,
            contentDescription = null,
    )
}
