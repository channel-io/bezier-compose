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

val BezierIcon.WindowsMaximize: ImageVector
    get() {
        return _windowsMaximize ?: ImageVector.Builder(
                name = "WindowsMaximize",
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
                moveTo(16.0f, 8.0f)
                lineTo(8.0f, 8.0f)
                lineTo(8.0f, 16.0f)
                lineTo(16.0f, 16.0f)
                lineTo(16.0f, 8.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(7.0f, 17.0f)
                lineTo(17.0f, 17.0f)
                lineTo(17.0f, 7.0f)
                lineTo(7.0f, 7.0f)
                close()
            }
        }.build().also {
            _windowsMaximize = it
        }
    }

private var _windowsMaximize: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun WindowsMaximizeIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.WindowsMaximize,
            contentDescription = null,
    )
}
