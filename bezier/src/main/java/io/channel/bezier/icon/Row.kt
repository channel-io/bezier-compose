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

val BezierIcon.Row: ImageVector
    get() {
        return io.channel.bezier.icon._row ?: ImageVector.Builder(
                name = "Row",
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
                moveTo(19.0f, 9.0f)
                lineTo(5.0f, 9.0f)
                lineTo(5.0f, 5.0f)
                lineTo(19.0f, 5.0f)
                lineTo(19.0f, 9.0f)
                close()
                moveTo(4.5f, 11.0f)
                lineTo(19.5f, 11.0f)
                curveTo(20.327f, 11.0f, 21.0f, 10.327f, 21.0f, 9.5f)
                lineTo(21.0f, 4.5f)
                curveTo(21.0f, 3.673f, 20.327f, 3.0f, 19.5f, 3.0f)
                lineTo(4.5f, 3.0f)
                curveTo(3.673f, 3.0f, 3.0f, 3.673f, 3.0f, 4.5f)
                lineTo(3.0f, 9.5f)
                curveTo(3.0f, 10.327f, 3.673f, 11.0f, 4.5f, 11.0f)
                close()
                moveTo(19.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                lineTo(5.0f, 15.0f)
                lineTo(19.0f, 15.0f)
                lineTo(19.0f, 19.0f)
                close()
                moveTo(4.5f, 21.0f)
                lineTo(19.5f, 21.0f)
                curveTo(20.327f, 21.0f, 21.0f, 20.327f, 21.0f, 19.5f)
                lineTo(21.0f, 14.5f)
                curveTo(21.0f, 13.673f, 20.327f, 13.0f, 19.5f, 13.0f)
                lineTo(4.5f, 13.0f)
                curveTo(3.673f, 13.0f, 3.0f, 13.673f, 3.0f, 14.5f)
                lineTo(3.0f, 19.5f)
                curveTo(3.0f, 20.327f, 3.673f, 21.0f, 4.5f, 21.0f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._row = it
        }
    }

private var _row: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun RowIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Row,
            contentDescription = null,
    )
}