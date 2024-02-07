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

val BezierIcon.Pause: ImageVector
    get() {
        return _pause ?: ImageVector.Builder(
                name = "Pause",
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
                moveTo(5.5002f, 21.0001f)
                lineTo(9.5002f, 21.0001f)
                curveTo(9.7762f, 21.0001f, 10.0002f, 20.7761f, 10.0002f, 20.5001f)
                lineTo(10.0002f, 3.5001f)
                curveTo(10.0002f, 3.2241f, 9.7762f, 3.0001f, 9.5002f, 3.0001f)
                lineTo(5.5002f, 3.0001f)
                curveTo(5.2242f, 3.0001f, 5.0002f, 3.2241f, 5.0002f, 3.5001f)
                lineTo(5.0002f, 20.5001f)
                curveTo(5.0002f, 20.7761f, 5.2242f, 21.0001f, 5.5002f, 21.0001f)
                close()
                moveTo(14.5002f, 21.0001f)
                lineTo(18.5002f, 21.0001f)
                curveTo(18.7762f, 21.0001f, 19.0002f, 20.7761f, 19.0002f, 20.5001f)
                lineTo(19.0002f, 3.5001f)
                curveTo(19.0002f, 3.2241f, 18.7762f, 3.0001f, 18.5002f, 3.0001f)
                lineTo(14.5002f, 3.0001f)
                curveTo(14.2242f, 3.0001f, 14.0002f, 3.2241f, 14.0002f, 3.5001f)
                lineTo(14.0002f, 20.5001f)
                curveTo(14.0002f, 20.7761f, 14.2242f, 21.0001f, 14.5002f, 21.0001f)
                close()
            }
        }.build().also {
            _pause = it
        }
    }

private var _pause: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun PauseIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Pause,
            contentDescription = null,
    )
}
