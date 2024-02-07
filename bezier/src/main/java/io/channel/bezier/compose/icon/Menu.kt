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

val BezierIcon.Menu: ImageVector
    get() {
        return _menu ?: ImageVector.Builder(
                name = "Menu",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(3.0f, 5.0f)
                curveTo(3.0f, 5.5523f, 3.4477f, 6.0f, 4.0f, 6.0f)
                lineTo(20.0f, 6.0f)
                curveTo(20.5523f, 6.0f, 21.0f, 5.5523f, 21.0f, 5.0f)
                curveTo(21.0f, 4.4477f, 20.5523f, 4.0f, 20.0f, 4.0f)
                lineTo(4.0f, 4.0f)
                curveTo(3.4477f, 4.0f, 3.0f, 4.4477f, 3.0f, 5.0f)
                close()
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 12.5523f, 3.4477f, 13.0f, 4.0f, 13.0f)
                lineTo(20.0f, 13.0f)
                curveTo(20.5523f, 13.0f, 21.0f, 12.5523f, 21.0f, 12.0f)
                curveTo(21.0f, 11.4477f, 20.5523f, 11.0f, 20.0f, 11.0f)
                lineTo(4.0f, 11.0f)
                curveTo(3.4477f, 11.0f, 3.0f, 11.4477f, 3.0f, 12.0f)
                close()
                moveTo(21.0f, 19.0f)
                curveTo(21.0f, 19.5523f, 20.5523f, 20.0f, 20.0f, 20.0f)
                lineTo(4.0f, 20.0f)
                curveTo(3.4477f, 20.0f, 3.0f, 19.5523f, 3.0f, 19.0f)
                curveTo(3.0f, 18.4477f, 3.4477f, 18.0f, 4.0f, 18.0f)
                lineTo(20.0f, 18.0f)
                curveTo(20.5523f, 18.0f, 21.0f, 18.4477f, 21.0f, 19.0f)
                close()
            }
        }.build().also {
            _menu = it
        }
    }

private var _menu: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun MenuIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Menu,
            contentDescription = null,
    )
}
