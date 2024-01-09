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

val BezierIcon.Cart: ImageVector
    get() {
        return _cart ?: ImageVector.Builder(
                name = "Cart",
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
                moveTo(2.0f, 5.0f)
                lineTo(4.7747f, 5.0f)
                lineTo(5.7102f, 13.4406f)
                curveTo(5.9348f, 15.4668f, 7.6473f, 17.0f, 9.6859f, 17.0f)
                lineTo(16.3149f, 17.0f)
                curveTo(18.3531f, 17.0f, 20.0653f, 15.4675f, 20.2904f, 13.4417f)
                lineTo(20.8705f, 8.2209f)
                curveTo(21.0021f, 7.0361f, 20.0748f, 6.0f, 18.8827f, 6.0f)
                lineTo(6.8978f, 6.0f)
                lineTo(6.7625f, 4.7797f)
                curveTo(6.6502f, 3.7666f, 5.794f, 3.0f, 4.7747f, 3.0f)
                lineTo(2.0f, 3.0f)
                lineTo(2.0f, 5.0f)
                close()
                moveTo(7.698f, 13.2203f)
                lineTo(7.1195f, 8.0f)
                lineTo(18.8827f, 8.0f)
                lineTo(18.3026f, 13.2209f)
                curveTo(18.1901f, 14.2337f, 17.334f, 15.0f, 16.3149f, 15.0f)
                lineTo(9.6859f, 15.0f)
                curveTo(8.6666f, 15.0f, 7.8103f, 14.2334f, 7.698f, 13.2203f)
                close()
                moveTo(8.0002f, 18.0001f)
                curveTo(6.9002f, 18.0001f, 6.0002f, 18.9001f, 6.0002f, 20.0001f)
                curveTo(6.0002f, 21.1001f, 6.9002f, 22.0001f, 8.0002f, 22.0001f)
                curveTo(9.1002f, 22.0001f, 10.0002f, 21.1001f, 10.0002f, 20.0001f)
                curveTo(10.0002f, 18.9001f, 9.1002f, 18.0001f, 8.0002f, 18.0001f)
                close()
                moveTo(18.0002f, 18.0001f)
                curveTo(16.9002f, 18.0001f, 16.0002f, 18.9001f, 16.0002f, 20.0001f)
                curveTo(16.0002f, 21.1001f, 16.9002f, 22.0001f, 18.0002f, 22.0001f)
                curveTo(19.1002f, 22.0001f, 20.0002f, 21.1001f, 20.0002f, 20.0001f)
                curveTo(20.0002f, 18.9001f, 19.1002f, 18.0001f, 18.0002f, 18.0001f)
                close()
            }
        }.build().also {
            _cart = it
        }
    }

private var _cart: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CartIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Cart,
            contentDescription = null,
    )
}
