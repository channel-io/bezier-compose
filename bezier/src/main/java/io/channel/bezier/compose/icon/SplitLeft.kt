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

val BezierIcon.SplitLeft: ImageVector
    get() {
        return _splitLeft ?: ImageVector.Builder(
                name = "SplitLeft",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(5.5f, 7.0f)
                curveTo(5.2239f, 7.0f, 5.0f, 7.2239f, 5.0f, 7.5f)
                lineTo(5.0f, 16.5f)
                curveTo(5.0f, 16.7761f, 5.2239f, 17.0f, 5.5f, 17.0f)
                lineTo(12.5f, 17.0f)
                curveTo(12.7761f, 17.0f, 13.0f, 16.7761f, 13.0f, 16.5f)
                lineTo(13.0f, 7.5f)
                curveTo(13.0f, 7.2239f, 12.7761f, 7.0f, 12.5f, 7.0f)
                lineTo(5.5f, 7.0f)
                close()
            }

            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(2.0f, 7.0f)
                curveTo(2.0f, 5.3432f, 3.3431f, 4.0f, 5.0f, 4.0f)
                lineTo(19.0f, 4.0f)
                curveTo(20.6569f, 4.0f, 22.0f, 5.3432f, 22.0f, 7.0f)
                lineTo(22.0f, 17.0f)
                curveTo(22.0f, 18.6569f, 20.6569f, 20.0f, 19.0f, 20.0f)
                lineTo(5.0f, 20.0f)
                curveTo(3.3431f, 20.0f, 2.0f, 18.6569f, 2.0f, 17.0f)
                lineTo(2.0f, 7.0f)
                close()
                moveTo(5.0f, 6.0f)
                lineTo(19.0f, 6.0f)
                curveTo(19.5523f, 6.0f, 20.0f, 6.4477f, 20.0f, 7.0f)
                lineTo(20.0f, 17.0f)
                curveTo(20.0f, 17.5523f, 19.5523f, 18.0f, 19.0f, 18.0f)
                lineTo(5.0f, 18.0f)
                curveTo(4.4477f, 18.0f, 4.0f, 17.5523f, 4.0f, 17.0f)
                lineTo(4.0f, 7.0f)
                curveTo(4.0f, 6.4477f, 4.4477f, 6.0f, 5.0f, 6.0f)
                close()
            }
        }.build().also {
            _splitLeft = it
        }
    }

private var _splitLeft: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun SplitLeftIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.SplitLeft,
            contentDescription = null,
    )
}
