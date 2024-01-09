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

val BezierIcon.VideocamFilled: ImageVector
    get() {
        return _videocamFilled ?: ImageVector.Builder(
                name = "VideocamFilled",
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
                moveTo(13.9981f, 6.0001f)
                lineTo(4.0021f, 6.0001f)
                curveTo(2.8971f, 6.0001f, 2.0021f, 6.8961f, 2.0021f, 8.0001f)
                lineTo(2.0021f, 16.0001f)
                curveTo(2.0021f, 17.1041f, 2.8971f, 18.0001f, 4.0021f, 18.0001f)
                lineTo(13.9981f, 18.0001f)
                curveTo(15.1031f, 18.0001f, 15.9981f, 17.1041f, 15.9981f, 16.0001f)
                lineTo(15.9981f, 8.0001f)
                curveTo(15.9981f, 6.8961f, 15.1031f, 6.0001f, 13.9981f, 6.0001f)
                close()
                moveTo(21.1877f, 17.3495f)
                lineTo(17.1877f, 14.1505f)
                curveTo(17.0687f, 14.0545f, 17.0007f, 13.9115f, 17.0007f, 13.7595f)
                lineTo(17.0007f, 10.2405f)
                curveTo(17.0007f, 10.0885f, 17.0687f, 9.9445f, 17.1877f, 9.8495f)
                lineTo(21.1877f, 6.6495f)
                curveTo(21.5147f, 6.3875f, 21.9997f, 6.6215f, 21.9997f, 7.0405f)
                lineTo(21.9997f, 16.9605f)
                curveTo(21.9997f, 17.3795f, 21.5147f, 17.6125f, 21.1877f, 17.3495f)
                close()
            }
        }.build().also {
            _videocamFilled = it
        }
    }

private var _videocamFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun VideocamFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.VideocamFilled,
            contentDescription = null,
    )
}
