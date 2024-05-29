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

val BezierIcon.BookmarkFilled: ImageVector
    get() {
        return io.channel.bezier.icon._bookmarkFilled ?: ImageVector.Builder(
                name = "BookmarkFilled",
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
                moveTo(19.0072f, 3.9929f)
                curveTo(19.0032f, 2.8911f, 18.109f, 2.0001f, 17.0073f, 2.0001f)
                lineTo(6.9996f, 2.0001f)
                curveTo(5.895f, 2.0001f, 4.9996f, 2.8956f, 4.9996f, 4.0001f)
                lineTo(4.9996f, 19.5774f)
                curveTo(4.9996f, 20.4257f, 5.9894f, 20.8887f, 6.6405f, 20.345f)
                lineTo(12.0356f, 15.8401f)
                lineTo(17.4229f, 20.3384f)
                curveTo(18.0753f, 20.8832f, 19.0669f, 20.4172f, 19.0638f, 19.5672f)
                lineTo(19.0072f, 3.9929f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._bookmarkFilled = it
        }
    }

private var _bookmarkFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun BookmarkFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.BookmarkFilled,
            contentDescription = null,
    )
}