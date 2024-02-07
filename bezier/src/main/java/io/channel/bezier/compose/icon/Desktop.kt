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

val BezierIcon.Desktop: ImageVector
    get() {
        return _desktop ?: ImageVector.Builder(
                name = "Desktop",
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
                moveTo(4.0f, 14.0f)
                lineTo(20.0f, 14.0f)
                lineTo(20.0f, 6.0f)
                lineTo(4.0f, 6.0f)
                lineTo(4.0f, 14.0f)
                close()
                moveTo(20.5f, 4.0f)
                lineTo(3.5f, 4.0f)
                curveTo(2.673f, 4.0f, 2.0f, 4.673f, 2.0f, 5.5f)
                lineTo(2.0f, 14.5f)
                curveTo(2.0f, 15.327f, 2.673f, 16.0f, 3.5f, 16.0f)
                lineTo(11.0f, 16.0f)
                lineTo(11.0f, 18.0f)
                lineTo(9.0f, 18.0f)
                curveTo(8.4477f, 18.0f, 8.0f, 18.4477f, 8.0f, 19.0f)
                curveTo(8.0f, 19.5523f, 8.4477f, 20.0f, 9.0f, 20.0f)
                lineTo(15.0f, 20.0f)
                curveTo(15.5523f, 20.0f, 16.0f, 19.5523f, 16.0f, 19.0f)
                curveTo(16.0f, 18.4477f, 15.5523f, 18.0f, 15.0f, 18.0f)
                lineTo(13.0f, 18.0f)
                lineTo(13.0f, 16.0f)
                lineTo(20.5f, 16.0f)
                curveTo(21.327f, 16.0f, 22.0f, 15.327f, 22.0f, 14.5f)
                lineTo(22.0f, 5.5f)
                curveTo(22.0f, 4.673f, 21.327f, 4.0f, 20.5f, 4.0f)
                close()
            }
        }.build().also {
            _desktop = it
        }
    }

private var _desktop: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun DesktopIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Desktop,
            contentDescription = null,
    )
}
