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

val BezierIcons.ShippingFilled: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_shipping_filled
        override val imageVector: ImageVector
            get() = _shippingFilled ?: ImageVector.Builder(
                    name = "ShippingFilled",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(3.0f, 9.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 3.0f, 7.0f)
                    lineTo(4.5760000000000005f, 7.0f)
                    arcTo(5.0f, 5.0f, 191.5369578148437f, isMoreThanHalf = false, isPositiveArc = true, 9.476f, 3.0f)
                    lineTo(17.414f, 3.0f)
                    arcTo(5.0f, 5.0f, 269.9935391192417f, isMoreThanHalf = false, isPositiveArc = true, 22.384f, 8.552f)
                    lineTo(21.494f, 16.552f)
                    arcTo(5.0f, 5.0f, 6.338373955706382f, isMoreThanHalf = false, isPositiveArc = true, 16.524f, 21.0f)
                    lineTo(8.587f, 21.0f)
                    arcTo(5.0f, 5.0f, 89.98830600951716f, isMoreThanHalf = false, isPositiveArc = true, 3.6869999999999994f, 17.0f)
                    lineTo(2.0f, 17.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = true, 2.0f, 15.0f)
                    lineTo(9.0f, 15.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 9.0f, 13.0f)
                    lineTo(2.5f, 13.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = true, 2.5f, 11.0f)
                    lineTo(12.0f, 11.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 12.0f, 9.0f)
                    close()
                }
            }.build().also {
                _shippingFilled = it
            }
    }


private var _shippingFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ShippingFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ShippingFilled.imageVector,
            contentDescription = null,
    )
}
