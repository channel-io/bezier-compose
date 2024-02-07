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

val BezierIcon.Typography: ImageVector
    get() {
        return _typography ?: ImageVector.Builder(
                name = "Typography",
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
                moveTo(4.0002f, 3.0001f)
                curveTo(3.448f, 3.0001f, 3.0002f, 3.4478f, 3.0002f, 4.0001f)
                lineTo(3.0002f, 7.0001f)
                curveTo(3.0002f, 7.5524f, 3.448f, 8.0001f, 4.0002f, 8.0001f)
                curveTo(4.5525f, 8.0001f, 5.0002f, 7.5524f, 5.0002f, 7.0001f)
                lineTo(5.0002f, 6.0001f)
                curveTo(5.0002f, 5.4471f, 5.4482f, 5.0001f, 6.0002f, 5.0001f)
                lineTo(9.0002f, 5.0001f)
                curveTo(9.5522f, 5.0001f, 10.0002f, 5.4471f, 10.0002f, 6.0001f)
                lineTo(10.0002f, 18.0001f)
                curveTo(10.0002f, 18.5531f, 9.5522f, 19.0001f, 9.0002f, 19.0001f)
                lineTo(8.0002f, 19.0001f)
                curveTo(7.448f, 19.0001f, 7.0002f, 19.4478f, 7.0002f, 20.0001f)
                curveTo(7.0002f, 20.5524f, 7.448f, 21.0001f, 8.0002f, 21.0001f)
                lineTo(16.0002f, 21.0001f)
                curveTo(16.5525f, 21.0001f, 17.0002f, 20.5524f, 17.0002f, 20.0001f)
                curveTo(17.0002f, 19.4478f, 16.5525f, 19.0001f, 16.0002f, 19.0001f)
                lineTo(15.0002f, 19.0001f)
                curveTo(14.4482f, 19.0001f, 14.0002f, 18.5531f, 14.0002f, 18.0001f)
                lineTo(14.0002f, 6.0001f)
                curveTo(14.0002f, 5.4471f, 14.4482f, 5.0001f, 15.0002f, 5.0001f)
                lineTo(18.0002f, 5.0001f)
                curveTo(18.5522f, 5.0001f, 19.0002f, 5.4471f, 19.0002f, 6.0001f)
                lineTo(19.0002f, 7.0001f)
                curveTo(19.0002f, 7.5524f, 19.448f, 8.0001f, 20.0002f, 8.0001f)
                curveTo(20.5525f, 8.0001f, 21.0002f, 7.5524f, 21.0002f, 7.0001f)
                lineTo(21.0002f, 4.0001f)
                curveTo(21.0002f, 3.4478f, 20.5525f, 3.0001f, 20.0002f, 3.0001f)
                lineTo(4.0002f, 3.0001f)
                close()
            }
        }.build().also {
            _typography = it
        }
    }

private var _typography: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TypographyIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Typography,
            contentDescription = null,
    )
}
