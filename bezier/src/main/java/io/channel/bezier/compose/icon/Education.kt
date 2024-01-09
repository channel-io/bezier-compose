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

val BezierIcon.Education: ImageVector
    get() {
        return _education ?: ImageVector.Builder(
                name = "Education",
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
                moveTo(11.1056f, 2.2111f)
                curveTo(11.6686f, 1.9296f, 12.3314f, 1.9296f, 12.8944f, 2.2111f)
                lineTo(22.0161f, 6.772f)
                curveTo(22.7497f, 7.1388f, 23.0777f, 7.8816f, 23.0f, 8.5846f)
                lineTo(23.0f, 14.0f)
                curveTo(23.0f, 14.5523f, 22.5523f, 15.0f, 22.0f, 15.0f)
                curveTo(21.4477f, 15.0f, 21.0f, 14.5523f, 21.0f, 14.0f)
                lineTo(21.0f, 10.5f)
                lineTo(20.0f, 11.0f)
                lineTo(20.0f, 16.9387f)
                curveTo(20.0f, 17.6906f, 19.5783f, 18.379f, 18.9084f, 18.7205f)
                lineTo(12.9084f, 21.7794f)
                curveTo(12.3377f, 22.0703f, 11.6623f, 22.0703f, 11.0916f, 21.7794f)
                lineTo(5.0916f, 18.7205f)
                curveTo(4.4217f, 18.379f, 4.0f, 17.6906f, 4.0f, 16.9387f)
                lineTo(4.0f, 11.0f)
                lineTo(1.9839f, 9.9919f)
                curveTo(0.6572f, 9.3286f, 0.6572f, 7.4353f, 1.9839f, 6.772f)
                lineTo(11.1056f, 2.2111f)
                close()
                moveTo(12.8944f, 14.5528f)
                lineTo(18.0f, 12.0f)
                lineTo(18.0f, 16.9387f)
                lineTo(12.0f, 19.9975f)
                lineTo(6.0f, 16.9387f)
                lineTo(6.0f, 12.0f)
                lineTo(11.1056f, 14.5528f)
                curveTo(11.6686f, 14.8343f, 12.3314f, 14.8343f, 12.8944f, 14.5528f)
                close()
                moveTo(20.7639f, 8.382f)
                lineTo(12.0f, 4.0f)
                lineTo(3.2361f, 8.382f)
                lineTo(12.0f, 12.7639f)
                lineTo(20.7639f, 8.382f)
                close()
            }
        }.build().also {
            _education = it
        }
    }

private var _education: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun EducationIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Education,
            contentDescription = null,
    )
}
