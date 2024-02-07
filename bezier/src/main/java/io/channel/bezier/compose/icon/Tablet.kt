@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.compose.icon

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
import io.channel.bezier.compose.BezierIcon

val BezierIcon.Tablet: ImageVector
    get() {
        return _tablet ?: ImageVector.Builder(
                name = "Tablet",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(7.0f, 2.0f)
                curveTo(5.8954f, 2.0f, 5.0f, 2.8954f, 5.0f, 4.0f)
                lineTo(5.0f, 20.0f)
                curveTo(5.0f, 21.1046f, 5.8954f, 22.0f, 7.0f, 22.0f)
                lineTo(17.0f, 22.0f)
                curveTo(18.1046f, 22.0f, 19.0f, 21.1046f, 19.0f, 20.0f)
                lineTo(19.0f, 12.0f)
                lineTo(17.0f, 14.0f)
                lineTo(17.0f, 19.0f)
                lineTo(7.0f, 19.0f)
                lineTo(7.0f, 5.0f)
                lineTo(19.0f, 5.0f)
                lineTo(19.0f, 4.0f)
                curveTo(19.0f, 2.8954f, 18.1046f, 2.0f, 17.0f, 2.0f)
                lineTo(7.0f, 2.0f)
                close()
                moveTo(10.4124f, 16.9995f)
                lineTo(9.0f, 16.9995f)
                lineTo(9.0f, 15.5871f)
                lineTo(16.4754f, 8.1117f)
                lineTo(17.8878f, 9.5241f)
                lineTo(10.4124f, 16.9995f)
                close()
                moveTo(17.182f, 7.4046f)
                lineTo(18.5944f, 8.818f)
                lineTo(20.0078f, 7.4046f)
                curveTo(20.3974f, 7.015f, 20.3974f, 6.3827f, 20.0078f, 5.9922f)
                curveTo(19.6183f, 5.6026f, 18.985f, 5.6026f, 18.5944f, 5.9922f)
                lineTo(17.182f, 7.4046f)
                close()
            }
        }.build().also {
            _tablet = it
        }
    }

private var _tablet: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TabletIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Tablet,
            contentDescription = null,
    )
}
