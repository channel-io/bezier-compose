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

val BezierIcons.Coupon: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _coupon ?: ImageVector.Builder(
                    name = "Coupon",
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
                    moveTo(20.5f, 5.0f)
                    arcTo(1.5f, 1.5f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 22.0f, 6.5f)
                    lineTo(22.0f, 10.5f)
                    arcTo(0.5f, 0.5f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 21.5f, 11.0f)
                    lineTo(21.0f, 11.0f)
                    arcTo(1.0f, 1.0f, 269.93644867091155f, isMoreThanHalf = false, isPositiveArc = false, 20.883f, 12.993f)
                    lineTo(21.0f, 13.0f)
                    lineTo(21.5f, 13.0f)
                    arcTo(0.5f, 0.5f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 22.0f, 13.5f)
                    lineTo(22.0f, 17.5f)
                    arcTo(1.5f, 1.5f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 20.5f, 19.0f)
                    lineTo(3.5f, 19.0f)
                    arcTo(1.5f, 1.5f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 2.0f, 17.5f)
                    lineTo(2.0f, 13.5f)
                    arcTo(0.5f, 0.5f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 2.5f, 13.0f)
                    lineTo(3.0f, 13.0f)
                    arcTo(1.0f, 1.0f, 89.93644867091149f, isMoreThanHalf = false, isPositiveArc = false, 3.117f, 11.007f)
                    lineTo(3.0f, 11.0f)
                    lineTo(2.5f, 11.0f)
                    arcTo(0.5f, 0.5f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 2.0f, 10.5f)
                    lineTo(2.0f, 6.5f)
                    arcTo(1.5f, 1.5f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 5.0f)
                    close()
                    moveTo(8.0f, 7.0f)
                    lineTo(4.0f, 7.0f)
                    lineTo(4.0f, 9.172f)
                    lineTo(4.04f, 9.185f)
                    arcTo(3.0f, 3.0f, 290.27392535028054f, isMoreThanHalf = false, isPositiveArc = true, 5.995f, 11.818000000000001f)
                    lineTo(6.0f, 12.0f)
                    arcTo(3.0f, 3.0f, 359.9790395722204f, isMoreThanHalf = false, isPositiveArc = true, 4.183f, 14.758f)
                    lineTo(4.0f, 14.829f)
                    lineTo(4.0f, 17.0f)
                    lineTo(8.0f, 17.0f)
                    lineTo(8.0f, 15.0f)
                    lineTo(10.0f, 15.0f)
                    lineTo(10.0f, 17.0f)
                    lineTo(20.0f, 17.0f)
                    lineTo(20.0f, 14.827f)
                    lineTo(19.96f, 14.815f)
                    arcTo(3.0f, 3.0f, 110.27392535028054f, isMoreThanHalf = false, isPositiveArc = true, 18.005000000000003f, 12.181999999999999f)
                    lineTo(18.0f, 12.0f)
                    arcTo(3.0f, 3.0f, 179.97903957222042f, isMoreThanHalf = false, isPositiveArc = true, 19.817f, 9.242f)
                    lineTo(20.0f, 9.17f)
                    lineTo(20.0f, 7.0f)
                    lineTo(10.0f, 7.0f)
                    lineTo(10.0f, 9.0f)
                    lineTo(8.0f, 9.0f)
                    close()
                    moveTo(10.0f, 11.0f)
                    lineTo(8.0f, 11.0f)
                    lineTo(8.0f, 13.0f)
                    lineTo(10.0f, 13.0f)
                    close()
                }
            }.build().also {
                _coupon = it
            }
    }


private var _coupon: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CouponIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Coupon.imageVector,
            contentDescription = null,
    )
}
