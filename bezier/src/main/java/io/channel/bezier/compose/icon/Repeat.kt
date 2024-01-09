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

val BezierIcon.Repeat: ImageVector
    get() {
        return _repeat ?: ImageVector.Builder(
                name = "Repeat",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(14.0f, 3.9314f)
                lineTo(14.0f, 6.0f)
                lineTo(7.0f, 6.0f)
                curveTo(4.2386f, 6.0f, 2.0f, 8.2386f, 2.0f, 11.0f)
                lineTo(2.0f, 15.0f)
                curveTo(2.0f, 15.5523f, 2.4477f, 16.0f, 3.0f, 16.0f)
                curveTo(3.5523f, 16.0f, 4.0f, 15.5523f, 4.0f, 15.0f)
                lineTo(4.0f, 11.0f)
                curveTo(4.0f, 9.3432f, 5.3432f, 8.0f, 7.0f, 8.0f)
                lineTo(14.0f, 8.0f)
                lineTo(14.0f, 10.0686f)
                curveTo(14.0f, 10.7813f, 14.8617f, 11.1383f, 15.3657f, 10.6343f)
                lineTo(18.2929f, 7.7071f)
                curveTo(18.6834f, 7.3166f, 18.6834f, 6.6834f, 18.2929f, 6.2929f)
                lineTo(15.3657f, 3.3657f)
                curveTo(14.8617f, 2.8617f, 14.0f, 3.2186f, 14.0f, 3.9314f)
                close()
                moveTo(10.0f, 16.0f)
                lineTo(10.0f, 13.9311f)
                curveTo(10.0f, 13.2184f, 9.1383f, 12.8615f, 8.6343f, 13.3654f)
                lineTo(5.7071f, 16.2927f)
                curveTo(5.3166f, 16.6832f, 5.3166f, 17.3163f, 5.7071f, 17.7069f)
                lineTo(8.6343f, 20.6341f)
                curveTo(9.1383f, 21.138f, 10.0f, 20.7811f, 10.0f, 20.0684f)
                lineTo(10.0f, 18.0f)
                lineTo(17.0f, 18.0f)
                curveTo(19.7614f, 18.0f, 22.0f, 15.7614f, 22.0f, 13.0f)
                lineTo(22.0f, 9.0f)
                curveTo(22.0f, 8.4477f, 21.5523f, 8.0f, 21.0f, 8.0f)
                curveTo(20.4477f, 8.0f, 20.0f, 8.4477f, 20.0f, 9.0f)
                lineTo(20.0f, 13.0f)
                curveTo(20.0f, 14.6569f, 18.6569f, 16.0f, 17.0f, 16.0f)
                lineTo(10.0f, 16.0f)
                close()
            }
        }.build().also {
            _repeat = it
        }
    }

private var _repeat: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun RepeatIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Repeat,
            contentDescription = null,
    )
}
