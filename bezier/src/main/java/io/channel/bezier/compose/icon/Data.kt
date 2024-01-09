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

val BezierIcon.Data: ImageVector
    get() {
        return _data ?: ImageVector.Builder(
                name = "Data",
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
                moveTo(18.0f, 5.0f)
                lineTo(6.0f, 5.0f)
                curveTo(5.4477f, 5.0f, 5.0f, 5.4477f, 5.0f, 6.0f)
                lineTo(5.0f, 7.0f)
                lineTo(19.0f, 7.0f)
                lineTo(19.0f, 6.0f)
                curveTo(19.0f, 5.4477f, 18.5523f, 5.0f, 18.0f, 5.0f)
                close()
                moveTo(3.0f, 7.0f)
                lineTo(3.0f, 9.0f)
                lineTo(3.0f, 13.0f)
                lineTo(3.0f, 15.0f)
                lineTo(3.0f, 18.0f)
                curveTo(3.0f, 19.6569f, 4.3432f, 21.0f, 6.0f, 21.0f)
                lineTo(18.0f, 21.0f)
                curveTo(19.6569f, 21.0f, 21.0f, 19.6569f, 21.0f, 18.0f)
                lineTo(21.0f, 15.0f)
                lineTo(21.0f, 13.0f)
                lineTo(21.0f, 9.0f)
                lineTo(21.0f, 7.0f)
                lineTo(21.0f, 6.0f)
                curveTo(21.0f, 4.3432f, 19.6569f, 3.0f, 18.0f, 3.0f)
                lineTo(6.0f, 3.0f)
                curveTo(4.3432f, 3.0f, 3.0f, 4.3432f, 3.0f, 6.0f)
                lineTo(3.0f, 7.0f)
                close()
                moveTo(19.0f, 9.0f)
                lineTo(5.0f, 9.0f)
                lineTo(5.0f, 13.0f)
                lineTo(19.0f, 13.0f)
                lineTo(19.0f, 9.0f)
                close()
                moveTo(5.0f, 15.0f)
                lineTo(5.0f, 18.0f)
                curveTo(5.0f, 18.5523f, 5.4477f, 19.0f, 6.0f, 19.0f)
                lineTo(18.0f, 19.0f)
                curveTo(18.5523f, 19.0f, 19.0f, 18.5523f, 19.0f, 18.0f)
                lineTo(19.0f, 15.0f)
                lineTo(5.0f, 15.0f)
                close()
                moveTo(6.0f, 11.0f)
                curveTo(6.0f, 10.4477f, 6.4477f, 10.0f, 7.0f, 10.0f)
                curveTo(7.5523f, 10.0f, 8.0f, 10.4477f, 8.0f, 11.0f)
                curveTo(8.0f, 11.5523f, 7.5523f, 12.0f, 7.0f, 12.0f)
                curveTo(6.4477f, 12.0f, 6.0f, 11.5523f, 6.0f, 11.0f)
                close()
                moveTo(7.0f, 16.0f)
                curveTo(6.4477f, 16.0f, 6.0f, 16.4477f, 6.0f, 17.0f)
                curveTo(6.0f, 17.5523f, 6.4477f, 18.0f, 7.0f, 18.0f)
                curveTo(7.5523f, 18.0f, 8.0f, 17.5523f, 8.0f, 17.0f)
                curveTo(8.0f, 16.4477f, 7.5523f, 16.0f, 7.0f, 16.0f)
                close()
            }
        }.build().also {
            _data = it
        }
    }

private var _data: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun DataIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Data,
            contentDescription = null,
    )
}
