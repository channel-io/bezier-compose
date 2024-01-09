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

val BezierIcon.Code: ImageVector
    get() {
        return _code ?: ImageVector.Builder(
                name = "Code",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(15.3939f, 4.0809f)
                curveTo(15.9015f, 4.2984f, 16.1367f, 4.8863f, 15.9191f, 5.3939f)
                lineTo(9.9191f, 19.3939f)
                curveTo(9.7015f, 19.9016f, 9.1137f, 20.1367f, 8.606f, 19.9192f)
                curveTo(8.0984f, 19.7016f, 7.8632f, 19.1137f, 8.0808f, 18.6061f)
                lineTo(14.0808f, 4.6061f)
                curveTo(14.2984f, 4.0985f, 14.8862f, 3.8633f, 15.3939f, 4.0809f)
                close()
                moveTo(8.207f, 4.2929f)
                curveTo(8.5975f, 4.6834f, 8.5975f, 5.3166f, 8.207f, 5.7071f)
                lineTo(4.9141f, 9.0f)
                lineTo(8.207f, 12.2929f)
                curveTo(8.5975f, 12.6834f, 8.5975f, 13.3166f, 8.207f, 13.7071f)
                curveTo(7.8165f, 14.0976f, 7.1833f, 14.0976f, 6.7928f, 13.7071f)
                lineTo(2.7928f, 9.7071f)
                curveTo(2.4023f, 9.3166f, 2.4023f, 8.6834f, 2.7928f, 8.2929f)
                lineTo(6.7928f, 4.2929f)
                curveTo(7.1833f, 3.9024f, 7.8165f, 3.9024f, 8.207f, 4.2929f)
                close()
                moveTo(17.207f, 10.2929f)
                curveTo(16.8165f, 9.9024f, 16.1834f, 9.9024f, 15.7928f, 10.2929f)
                curveTo(15.4023f, 10.6834f, 15.4023f, 11.3166f, 15.7928f, 11.7071f)
                lineTo(19.0857f, 15.0f)
                lineTo(15.7928f, 18.2929f)
                curveTo(15.4023f, 18.6834f, 15.4023f, 19.3166f, 15.7928f, 19.7071f)
                curveTo(16.1834f, 20.0976f, 16.8165f, 20.0976f, 17.207f, 19.7071f)
                lineTo(21.207f, 15.7071f)
                curveTo(21.3946f, 15.5196f, 21.4999f, 15.2652f, 21.4999f, 15.0f)
                curveTo(21.4999f, 14.7348f, 21.3946f, 14.4804f, 21.207f, 14.2929f)
                lineTo(17.207f, 10.2929f)
                close()
            }
        }.build().also {
            _code = it
        }
    }

private var _code: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CodeIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Code,
            contentDescription = null,
    )
}
