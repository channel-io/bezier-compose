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

val BezierIcon.BookCover: ImageVector
    get() {
        return _bookCover ?: ImageVector.Builder(
                name = "BookCover",
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
                moveTo(3.0f, 6.0f)
                curveTo(3.0f, 3.7909f, 4.7909f, 2.0f, 7.0f, 2.0f)
                lineTo(17.0f, 2.0f)
                curveTo(19.2091f, 2.0f, 21.0f, 3.7909f, 21.0f, 6.0f)
                lineTo(21.0f, 18.0f)
                curveTo(21.0f, 20.2091f, 19.2091f, 22.0f, 17.0f, 22.0f)
                lineTo(7.0f, 22.0f)
                curveTo(4.7909f, 22.0f, 3.0f, 20.2091f, 3.0f, 18.0f)
                lineTo(3.0f, 6.0f)
                close()
                moveTo(7.0f, 4.0f)
                curveTo(5.8954f, 4.0f, 5.0f, 4.8954f, 5.0f, 6.0f)
                lineTo(5.0f, 18.0f)
                curveTo(5.0f, 19.1046f, 5.8954f, 20.0f, 7.0f, 20.0f)
                lineTo(7.0f, 4.0f)
                close()
                moveTo(17.0f, 20.0f)
                lineTo(9.0f, 20.0f)
                lineTo(9.0f, 4.0f)
                lineTo(17.0f, 4.0f)
                curveTo(18.1046f, 4.0f, 19.0f, 4.8954f, 19.0f, 6.0f)
                lineTo(19.0f, 18.0f)
                curveTo(19.0f, 19.1046f, 18.1046f, 20.0f, 17.0f, 20.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(11.4477f, 7.0f, 11.0f, 7.4477f, 11.0f, 8.0f)
                curveTo(11.0f, 8.5523f, 11.4477f, 9.0f, 12.0f, 9.0f)
                lineTo(16.0f, 9.0f)
                curveTo(16.5523f, 9.0f, 17.0f, 8.5523f, 17.0f, 8.0f)
                curveTo(17.0f, 7.4477f, 16.5523f, 7.0f, 16.0f, 7.0f)
                lineTo(12.0f, 7.0f)
                close()
            }
        }.build().also {
            _bookCover = it
        }
    }

private var _bookCover: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun BookCoverIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.BookCover,
            contentDescription = null,
    )
}
