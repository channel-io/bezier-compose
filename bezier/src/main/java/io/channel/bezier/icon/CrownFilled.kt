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

val BezierIcons.CrownFilled: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_crown_filled
        override val imageVector: ImageVector
            get() = _crownFilled ?: ImageVector.Builder(
                    name = "CrownFilled",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(2.27f, 7.89f)
                    lineTo(3.632f, 17.424f)
                    arcTo(3.0f, 3.0f, 171.87499219878157f, isMoreThanHalf = false, isPositiveArc = false, 6.602f, 20.0f)
                    lineTo(17.398f, 20.0f)
                    arcTo(3.0f, 3.0f, 90.00217354568849f, isMoreThanHalf = false, isPositiveArc = false, 20.368f, 17.424f)
                    lineTo(21.73f, 7.89f)
                    arcTo(1.0f, 1.0f, 8.072154456011598f, isMoreThanHalf = false, isPositiveArc = false, 20.293f, 6.8549999999999995f)
                    lineTo(16.79f, 8.605f)
                    arcTo(1.0f, 1.0f, 63.408318466963834f, isMoreThanHalf = false, isPositiveArc = true, 15.51f, 8.265f)
                    lineTo(12.832f, 4.248f)
                    arcTo(1.0f, 1.0f, 326.304737852883f, isMoreThanHalf = false, isPositiveArc = false, 11.168000000000001f, 4.248f)
                    lineTo(8.49f, 8.265f)
                    arcTo(1.0f, 1.0f, 33.65695446368622f, isMoreThanHalf = false, isPositiveArc = true, 7.21f, 8.605f)
                    lineTo(3.707f, 6.854f)
                    arcTo(1.0f, 1.0f, 296.54547564832257f, isMoreThanHalf = false, isPositiveArc = false, 2.27f, 7.889f)
                }
            }.build().also {
                _crownFilled = it
            }
    }


private var _crownFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CrownFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.CrownFilled.imageVector,
            contentDescription = null,
    )
}
