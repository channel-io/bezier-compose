@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

import androidx.annotation.DrawableRes
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
import io.channel.bezier.compose.R

val BezierIcons.Shipping: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_shipping
        override val imageVector: ImageVector
            get() = _shipping ?: ImageVector.Builder(
                    name = "Shipping",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(6.702f, 7.0f)
                    lineTo(11.0f, 7.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = true, 11.0f, 9.0f)
                    lineTo(3.0f, 9.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 3.0f, 7.0f)
                    lineTo(4.632f, 7.0f)
                    arcTo(5.0f, 5.0f, 191.5369578148437f, isMoreThanHalf = false, isPositiveArc = true, 9.532f, 3.0f)
                    lineTo(17.469f, 3.0f)
                    arcTo(5.0f, 5.0f, 270.0047107156153f, isMoreThanHalf = false, isPositiveArc = true, 22.43f, 8.620000000000001f)
                    lineTo(21.43f, 16.62f)
                    arcTo(5.0f, 5.0f, 7.12300842063334f, isMoreThanHalf = false, isPositiveArc = true, 16.47f, 21.0f)
                    lineTo(8.53f, 21.0f)
                    arcTo(5.0f, 5.0f, 89.98830600951716f, isMoreThanHalf = false, isPositiveArc = true, 3.629999999999999f, 17.0f)
                    lineTo(2.0f, 17.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = true, 2.0f, 15.0f)
                    lineTo(6.0f, 15.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = true, 6.0f, 17.0f)
                    lineTo(5.701f, 17.0f)
                    curveTo(6.111f, 18.154f, 7.212f, 19.0f, 8.530999999999999f, 19.0f)
                    lineTo(16.468999999999998f, 19.0f)
                    arcTo(3.0f, 3.0f, 90.0029286881065f, isMoreThanHalf = false, isPositiveArc = false, 19.445999999999998f, 16.372f)
                    lineTo(20.445999999999998f, 8.372f)
                    arcTo(3.0f, 3.0f, 7.1230107956118065f, isMoreThanHalf = false, isPositiveArc = false, 17.469f, 5.0f)
                    lineTo(9.53f, 5.0f)
                    arcTo(3.0f, 3.0f, 270.01094074216263f, isMoreThanHalf = false, isPositiveArc = false, 6.700999999999999f, 7.0f)
                    moveTo(8.0f, 13.0f)
                    lineTo(2.5f, 13.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = true, 2.5f, 11.0f)
                    lineTo(8.0f, 11.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = true, 8.0f, 13.0f)
                }
            }.build().also {
                _shipping = it
            }
    }


private var _shipping: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ShippingIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Shipping.imageVector,
            contentDescription = null,
    )
}
