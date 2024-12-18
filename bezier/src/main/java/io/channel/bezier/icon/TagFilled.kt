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

val BezierIcons.TagFilled: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_tag_filled
        override val imageVector: ImageVector
            get() = _tagFilled ?: ImageVector.Builder(
                    name = "TagFilled",
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
                    moveTo(13.0f, 2.515f)
                    arcTo(1.0f, 1.0f, 269.98776339474546f, isMoreThanHalf = false, isPositiveArc = false, 12.293f, 2.8080000000000003f)
                    lineTo(3.392999999999999f, 11.708f)
                    arcTo(3.0f, 3.0f, 224.99134833716198f, isMoreThanHalf = false, isPositiveArc = false, 3.392999999999999f, 15.95f)
                    lineTo(9.049999999999999f, 21.607f)
                    arcTo(3.0f, 3.0f, 135.0048526342381f, isMoreThanHalf = false, isPositiveArc = false, 13.293f, 21.607f)
                    lineTo(22.192999999999998f, 12.706999999999999f)
                    arcTo(1.0f, 1.0f, 44.92760319898687f, isMoreThanHalf = false, isPositiveArc = false, 22.485f, 11.999999999999998f)
                    lineTo(22.485f, 4.515f)
                    arcTo(2.0f, 2.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 20.485f, 2.5149999999999997f)
                    close()
                    moveTo(19.0f, 8.0f)
                    arcTo(1.999f, 1.999f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 15.0f, 8.0f)
                    arcTo(2.0f, 2.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = true, 19.0f, 8.0f)
                }
            }.build().also {
                _tagFilled = it
            }
    }


private var _tagFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TagFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.TagFilled.imageVector,
            contentDescription = null,
    )
}
