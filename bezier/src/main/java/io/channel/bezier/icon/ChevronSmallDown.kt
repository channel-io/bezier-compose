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

val BezierIcons.ChevronSmallDown: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_chevron_small_down
        override val imageVector: ImageVector
            get() = _chevronSmallDown ?: ImageVector.Builder(
                    name = "ChevronSmallDown",
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
                    moveTo(17.207f, 9.793f)
                    arcTo(1.0f, 1.0f, 315.008651662838f, isMoreThanHalf = false, isPositiveArc = true, 17.207f, 11.206999999999999f)
                    lineTo(12.707f, 15.706999999999999f)
                    arcTo(1.0f, 1.0f, 45.008651662838f, isMoreThanHalf = false, isPositiveArc = true, 11.293000000000001f, 15.706999999999999f)
                    lineTo(6.793000000000001f, 11.206999999999999f)
                    arcTo(1.0f, 1.0f, 135.99574461357975f, isMoreThanHalf = false, isPositiveArc = true, 8.207f, 9.793f)
                    lineTo(12.0f, 13.586f)
                    lineTo(15.793f, 9.793f)
                    arcTo(1.0f, 1.0f, 225.0086516628379f, isMoreThanHalf = false, isPositiveArc = true, 17.207f, 9.793f)
                }
            }.build().also {
                _chevronSmallDown = it
            }
    }


private var _chevronSmallDown: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChevronSmallDownIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ChevronSmallDown.imageVector,
            contentDescription = null,
    )
}
