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

val BezierIcon.Page: ImageVector
    get() {
        return _page ?: ImageVector.Builder(
                name = "Page",
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
                moveTo(7.0f, 2.0f)
                curveTo(5.3432f, 2.0f, 4.0f, 3.3431f, 4.0f, 5.0f)
                lineTo(4.0f, 19.0f)
                curveTo(4.0f, 20.6569f, 5.3432f, 22.0f, 7.0f, 22.0f)
                lineTo(17.0f, 22.0f)
                curveTo(18.6569f, 22.0f, 20.0f, 20.6569f, 20.0f, 19.0f)
                lineTo(20.0f, 10.0f)
                curveTo(20.0f, 9.7348f, 19.8946f, 9.4804f, 19.7071f, 9.2929f)
                lineTo(12.7071f, 2.2929f)
                curveTo(12.5196f, 2.1054f, 12.2652f, 2.0f, 12.0f, 2.0f)
                lineTo(7.0f, 2.0f)
                close()
                moveTo(6.0f, 5.0f)
                curveTo(6.0f, 4.4477f, 6.4477f, 4.0f, 7.0f, 4.0f)
                lineTo(11.0f, 4.0f)
                lineTo(11.0f, 9.0f)
                curveTo(11.0f, 10.1046f, 11.8954f, 11.0f, 13.0f, 11.0f)
                lineTo(18.0f, 11.0f)
                lineTo(18.0f, 19.0f)
                curveTo(18.0f, 19.5523f, 17.5523f, 20.0f, 17.0f, 20.0f)
                lineTo(7.0f, 20.0f)
                curveTo(6.4477f, 20.0f, 6.0f, 19.5523f, 6.0f, 19.0f)
                lineTo(6.0f, 5.0f)
                close()
                moveTo(16.5858f, 9.0f)
                lineTo(13.0f, 5.4142f)
                lineTo(13.0f, 9.0f)
                lineTo(16.5858f, 9.0f)
                close()
            }
        }.build().also {
            _page = it
        }
    }

private var _page: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun PageIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Page,
            contentDescription = null,
    )
}
