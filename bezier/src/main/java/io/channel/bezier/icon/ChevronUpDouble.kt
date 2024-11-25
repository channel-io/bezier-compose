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

val BezierIcons.ChevronUpDouble: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_chevron_up_double
        override val imageVector: ImageVector
            get() = _chevronUpDouble ?: ImageVector.Builder(
                    name = "ChevronUpDouble",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(4.35f, 17.24f)
                    arcTo(1.0f, 1.0f, 229.46084911220484f, isMoreThanHalf = true, isPositiveArc = false, 5.6499999999999995f, 18.759999999999998f)
                    lineTo(12.0f, 13.316f)
                    lineTo(18.35f, 18.758000000000003f)
                    arcTo(1.0f, 1.0f, 132.73523939138175f, isMoreThanHalf = true, isPositiveArc = false, 19.650000000000002f, 17.240000000000002f)
                    lineTo(12.650000000000002f, 11.240000000000002f)
                    arcTo(1.0f, 1.0f, 310.54160187350453f, isMoreThanHalf = false, isPositiveArc = false, 11.350000000000001f, 11.240000000000002f)
                    close()
                    moveTo(4.35f, 9.24f)
                    arcTo(1.0f, 1.0f, 229.46084911220484f, isMoreThanHalf = true, isPositiveArc = false, 5.6499999999999995f, 10.76f)
                    lineTo(12.0f, 5.316f)
                    lineTo(18.35f, 10.758f)
                    arcTo(1.0f, 1.0f, 132.73523939138175f, isMoreThanHalf = true, isPositiveArc = false, 19.650000000000002f, 9.239999999999998f)
                    lineTo(12.650000000000002f, 3.2399999999999984f)
                    arcTo(1.0f, 1.0f, 310.54160187350453f, isMoreThanHalf = false, isPositiveArc = false, 11.350000000000001f, 3.2399999999999984f)
                    close()
                }
            }.build().also {
                _chevronUpDouble = it
            }
    }


private var _chevronUpDouble: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChevronUpDoubleIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ChevronUpDouble.imageVector,
            contentDescription = null,
    )
}
