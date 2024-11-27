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

val BezierIcons.ChevronSmallRight: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_chevron_small_right
        override val imageVector: ImageVector
            get() = _chevronSmallRight ?: ImageVector.Builder(
                    name = "ChevronSmallRight",
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
                    moveTo(9.793f, 6.793f)
                    arcTo(1.0f, 1.0f, 225.008651662838f, isMoreThanHalf = false, isPositiveArc = true, 11.206999999999999f, 6.793f)
                    lineTo(15.706999999999999f, 11.293f)
                    arcTo(1.0f, 1.0f, 315.008651662838f, isMoreThanHalf = false, isPositiveArc = true, 15.706999999999999f, 12.706999999999999f)
                    lineTo(11.206999999999999f, 17.207f)
                    arcTo(1.0f, 1.0f, 45.99574461357973f, isMoreThanHalf = false, isPositiveArc = true, 9.793f, 15.793000000000001f)
                    lineTo(13.586f, 12.0f)
                    lineTo(9.793f, 8.207f)
                    arcTo(1.0f, 1.0f, 135.00865166283802f, isMoreThanHalf = false, isPositiveArc = true, 9.793f, 6.793000000000001f)
                }
            }.build().also {
                _chevronSmallRight = it
            }
    }


private var _chevronSmallRight: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChevronSmallRightIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ChevronSmallRight.imageVector,
            contentDescription = null,
    )
}
