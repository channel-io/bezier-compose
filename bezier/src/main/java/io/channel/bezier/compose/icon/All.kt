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

val BezierIcon.All: ImageVector
    get() {
        return _all ?: ImageVector.Builder(
                name = "All",
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
                moveTo(19.5002f, 17.0001f)
                curveTo(19.7762f, 17.0001f, 20.0002f, 16.7761f, 20.0002f, 16.5001f)
                lineTo(20.0002f, 15.5001f)
                curveTo(20.0002f, 15.2241f, 19.7762f, 15.0001f, 19.5002f, 15.0001f)
                lineTo(18.0002f, 15.0001f)
                lineTo(18.0002f, 7.5001f)
                curveTo(18.0002f, 7.2241f, 17.7762f, 7.0001f, 17.5002f, 7.0001f)
                lineTo(16.5002f, 7.0001f)
                curveTo(16.2242f, 7.0001f, 16.0002f, 7.2241f, 16.0002f, 7.5001f)
                lineTo(16.0002f, 16.5001f)
                curveTo(16.0002f, 16.7761f, 16.2242f, 17.0001f, 16.5002f, 17.0001f)
                lineTo(19.5002f, 17.0001f)
                close()
                moveTo(14.5002f, 17.0001f)
                curveTo(14.7762f, 17.0001f, 15.0002f, 16.7761f, 15.0002f, 16.5001f)
                lineTo(15.0002f, 15.5001f)
                curveTo(15.0002f, 15.2241f, 14.7762f, 15.0001f, 14.5002f, 15.0001f)
                lineTo(13.0002f, 15.0001f)
                lineTo(13.0002f, 7.5001f)
                curveTo(13.0002f, 7.2241f, 12.7762f, 7.0001f, 12.5002f, 7.0001f)
                lineTo(11.5002f, 7.0001f)
                curveTo(11.2242f, 7.0001f, 11.0002f, 7.2241f, 11.0002f, 7.5001f)
                lineTo(11.0002f, 16.5001f)
                curveTo(11.0002f, 16.7761f, 11.2242f, 17.0001f, 11.5002f, 17.0001f)
                lineTo(14.5002f, 17.0001f)
                close()
                moveTo(9.5002f, 17.0001f)
                curveTo(9.7762f, 17.0001f, 10.0002f, 16.7761f, 10.0002f, 16.5001f)
                lineTo(10.0002f, 9.0001f)
                curveTo(10.0002f, 7.8961f, 9.1042f, 7.0001f, 8.0002f, 7.0001f)
                lineTo(6.0002f, 7.0001f)
                curveTo(4.8962f, 7.0001f, 4.0002f, 7.8961f, 4.0002f, 9.0001f)
                lineTo(4.0002f, 16.5001f)
                curveTo(4.0002f, 16.7761f, 4.2242f, 17.0001f, 4.5002f, 17.0001f)
                lineTo(5.5002f, 17.0001f)
                curveTo(5.7762f, 17.0001f, 6.0002f, 16.7761f, 6.0002f, 16.5001f)
                lineTo(6.0002f, 14.0001f)
                lineTo(8.0002f, 14.0001f)
                lineTo(8.0002f, 16.5001f)
                curveTo(8.0002f, 16.7761f, 8.2242f, 17.0001f, 8.5002f, 17.0001f)
                lineTo(9.5002f, 17.0001f)
                close()
                moveTo(4.0002f, 5.0001f)
                lineTo(20.0002f, 5.0001f)
                curveTo(21.1042f, 5.0001f, 22.0002f, 5.8961f, 22.0002f, 7.0001f)
                lineTo(22.0002f, 17.0001f)
                curveTo(22.0002f, 18.1041f, 21.1042f, 19.0001f, 20.0002f, 19.0001f)
                lineTo(4.0002f, 19.0001f)
                curveTo(2.8962f, 19.0001f, 2.0002f, 18.1041f, 2.0002f, 17.0001f)
                lineTo(2.0002f, 7.0001f)
                curveTo(2.0002f, 5.8961f, 2.8962f, 5.0001f, 4.0002f, 5.0001f)
                close()
                moveTo(6.5002f, 9.0001f)
                lineTo(7.5002f, 9.0001f)
                curveTo(7.7762f, 9.0001f, 8.0002f, 9.2241f, 8.0002f, 9.5001f)
                lineTo(8.0002f, 12.0001f)
                lineTo(6.0002f, 12.0001f)
                lineTo(6.0002f, 9.5001f)
                curveTo(6.0002f, 9.2241f, 6.2242f, 9.0001f, 6.5002f, 9.0001f)
                close()
            }
        }.build().also {
            _all = it
        }
    }

private var _all: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun AllIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.All,
            contentDescription = null,
    )
}
