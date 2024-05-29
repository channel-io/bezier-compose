@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

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
import io.channel.bezier.BezierIcon

val BezierIcon.WindowsClose: ImageVector
    get() {
        return io.channel.bezier.icon._windowsClose ?: ImageVector.Builder(
                name = "WindowsClose",
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
                moveTo(7.4038f, 6.6967f)
                lineTo(6.6967f, 7.4038f)
                lineTo(11.2929f, 12.0f)
                lineTo(6.6967f, 16.5962f)
                lineTo(7.4038f, 17.3033f)
                lineTo(12.0f, 12.7071f)
                lineTo(16.5962f, 17.3033f)
                lineTo(17.3033f, 16.5962f)
                lineTo(12.7071f, 12.0f)
                lineTo(17.3033f, 7.4038f)
                lineTo(16.5962f, 6.6967f)
                lineTo(12.0f, 11.2929f)
                lineTo(7.4038f, 6.6967f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._windowsClose = it
        }
    }

private var _windowsClose: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun WindowsCloseIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.WindowsClose,
            contentDescription = null,
    )
}