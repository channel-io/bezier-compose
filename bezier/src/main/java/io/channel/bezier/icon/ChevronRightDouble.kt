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

val BezierIcons.ChevronRightDouble: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_chevron_right_double
        override val imageVector: ImageVector
            get() = _chevronRightDouble ?: ImageVector.Builder(
                    name = "ChevronRightDouble",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(6.76f, 4.35f)
                    arcTo(1.0f, 1.0f, 319.4608491122048f, isMoreThanHalf = true, isPositiveArc = false, 5.24f, 5.6499999999999995f)
                    lineTo(10.684f, 12.0f)
                    lineTo(5.24f, 18.35f)
                    arcTo(1.0f, 1.0f, 218.4175977866867f, isMoreThanHalf = false, isPositiveArc = false, 6.758f, 19.650000000000002f)
                    lineTo(12.758f, 12.650000000000002f)
                    arcTo(1.0f, 1.0f, 40.541601873504554f, isMoreThanHalf = false, isPositiveArc = false, 12.758f, 11.350000000000001f)
                    close()
                    moveTo(14.76f, 4.35f)
                    arcTo(1.0f, 1.0f, 319.46084740482826f, isMoreThanHalf = false, isPositiveArc = false, 13.24f, 5.6499999999999995f)
                    lineTo(18.684f, 12.0f)
                    lineTo(13.242f, 18.35f)
                    arcTo(1.0f, 1.0f, 218.4175977866872f, isMoreThanHalf = false, isPositiveArc = false, 14.760000000000002f, 19.650000000000002f)
                    lineTo(20.76f, 12.650000000000002f)
                    arcTo(1.0f, 1.0f, 40.541601873504554f, isMoreThanHalf = false, isPositiveArc = false, 20.76f, 11.350000000000001f)
                    close()
                }
            }.build().also {
                _chevronRightDouble = it
            }
    }


private var _chevronRightDouble: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChevronRightDoubleIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ChevronRightDouble.imageVector,
            contentDescription = null,
    )
}
