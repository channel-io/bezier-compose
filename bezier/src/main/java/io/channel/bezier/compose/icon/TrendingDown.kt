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

val BezierIcon.TrendingDown: ImageVector
    get() {
        return _trendingDown ?: ImageVector.Builder(
                name = "TrendingDown",
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
                moveTo(11.6341f, 17.8485f)
                lineTo(6.4681f, 12.6825f)
                curveTo(6.2161f, 12.4305f, 6.3941f, 11.9995f, 6.7511f, 11.9995f)
                lineTo(9.9989f, 11.9995f)
                lineTo(9.9989f, 6.5f)
                curveTo(9.9989f, 6.224f, 10.2229f, 6.0f, 10.4989f, 6.0f)
                lineTo(13.4989f, 6.0f)
                curveTo(13.7749f, 6.0f, 13.9989f, 6.224f, 13.9989f, 6.5f)
                lineTo(13.9989f, 11.9995f)
                lineTo(17.2481f, 11.9995f)
                curveTo(17.6051f, 11.9995f, 17.7831f, 12.4305f, 17.5311f, 12.6825f)
                lineTo(12.3661f, 17.8485f)
                curveTo(12.1631f, 18.0505f, 11.8361f, 18.0505f, 11.6341f, 17.8485f)
                close()
            }
        }.build().also {
            _trendingDown = it
        }
    }

private var _trendingDown: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TrendingDownIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.TrendingDown,
            contentDescription = null,
    )
}
