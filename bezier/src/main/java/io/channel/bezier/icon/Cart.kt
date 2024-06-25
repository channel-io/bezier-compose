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
import io.channel.bezier.BezierIcons

val BezierIcons.Cart: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _cart ?: ImageVector.Builder(
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
                    lineTo(4.775f, 5.0f)
                    lineTo(5.710000000000001f, 13.44f)
                    arcTo(4.0f, 4.0f, 173.68468456554137f, isMoreThanHalf = false, isPositiveArc = false, 9.686f, 17.0f)
                    lineTo(16.314999999999998f, 17.0f)
                    arcTo(4.0f, 4.0f, 89.99277357230432f, isMoreThanHalf = false, isPositiveArc = false, 20.29f, 13.442f)
                    lineTo(20.869999999999997f, 8.221f)
                    arcTo(2.0f, 2.0f, 6.344143248947644f, isMoreThanHalf = false, isPositiveArc = false, 18.883f, 6.0f)
                    lineTo(6.898f, 6.0f)
                    lineTo(6.763f, 4.78f)
                    arcTo(2.0f, 2.0f, 353.6846845655414f, isMoreThanHalf = false, isPositiveArc = false, 4.775f, 3.0f)
                    lineTo(2.0f, 3.0f)
                    close()
                    moveTo(7.698f, 13.22f)
                    lineTo(7.119f, 8.0f)
                    lineTo(18.883f, 8.0f)
                    lineTo(18.303f, 13.219999999999999f)
                    arcTo(2.0f, 2.0f, 6.315315434458628f, isMoreThanHalf = false, isPositiveArc = true, 16.315f, 15.0f)
                    lineTo(9.685000000000002f, 15.0f)
                    arcTo(2.0f, 2.0f, 90.02472871543272f, isMoreThanHalf = false, isPositiveArc = true, 7.698000000000002f, 13.22f)
                    moveTo(8.0f, 18.0f)
                    curveTo(6.9f, 18.0f, 6.0f, 18.9f, 6.0f, 20.0f)
                    curveTo(6.0f, 21.1f, 6.9f, 22.0f, 8.0f, 22.0f)
                    curveTo(9.1f, 22.0f, 10.0f, 21.1f, 10.0f, 20.0f)
                    curveTo(10.0f, 18.9f, 9.1f, 18.0f, 8.0f, 18.0f)
                    moveTo(18.0f, 18.0f)
                    curveTo(16.9f, 18.0f, 16.0f, 18.9f, 16.0f, 20.0f)
                    curveTo(16.0f, 21.1f, 16.9f, 22.0f, 18.0f, 22.0f)
                    curveTo(19.1f, 22.0f, 20.0f, 21.1f, 20.0f, 20.0f)
                    curveTo(20.0f, 18.9f, 19.1f, 18.0f, 18.0f, 18.0f)
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
            imageVector = BezierIcons.Cart.imageVector,
            contentDescription = null,
    )
}
