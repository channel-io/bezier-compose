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

val BezierIcon.ScreenshareFilled: ImageVector
    get() {
        return _screenshareFilled ?: ImageVector.Builder(
                name = "ScreenshareFilled",
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
                moveTo(6.0f, 4.0f)
                curveTo(3.7909f, 4.0f, 2.0f, 5.7909f, 2.0f, 8.0f)
                lineTo(2.0f, 16.0f)
                curveTo(2.0f, 18.2091f, 3.7909f, 20.0f, 6.0f, 20.0f)
                lineTo(18.0f, 20.0f)
                curveTo(20.2091f, 20.0f, 22.0f, 18.2091f, 22.0f, 16.0f)
                lineTo(22.0f, 8.0f)
                curveTo(22.0f, 5.7909f, 20.2091f, 4.0f, 18.0f, 4.0f)
                lineTo(6.0f, 4.0f)
                close()
                moveTo(7.2929f, 12.7071f)
                curveTo(6.9024f, 12.3166f, 6.9024f, 11.6834f, 7.2929f, 11.2929f)
                lineTo(10.5858f, 8.0f)
                curveTo(11.3668f, 7.2189f, 12.6332f, 7.2189f, 13.4142f, 8.0f)
                lineTo(16.7071f, 11.2929f)
                curveTo(17.0976f, 11.6834f, 17.0976f, 12.3166f, 16.7071f, 12.7071f)
                curveTo(16.3166f, 13.0976f, 15.6834f, 13.0976f, 15.2929f, 12.7071f)
                lineTo(13.0f, 10.4142f)
                lineTo(13.0f, 17.0f)
                curveTo(13.0f, 17.5523f, 12.5523f, 18.0f, 12.0f, 18.0f)
                curveTo(11.4477f, 18.0f, 11.0f, 17.5523f, 11.0f, 17.0f)
                lineTo(11.0f, 10.4142f)
                lineTo(8.7071f, 12.7071f)
                curveTo(8.3166f, 13.0976f, 7.6834f, 13.0976f, 7.2929f, 12.7071f)
                close()
            }
        }.build().also {
            _screenshareFilled = it
        }
    }

private var _screenshareFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ScreenshareFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.ScreenshareFilled,
            contentDescription = null,
    )
}
