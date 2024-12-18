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

val BezierIcons.TrendingRight: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_trending_right
        override val imageVector: ImageVector
            get() = _trendingRight ?: ImageVector.Builder(
                    name = "TrendingRight",
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
                    moveTo(17.849f, 11.634f)
                    lineTo(12.682f, 6.468f)
                    arcTo(0.4f, 0.4f, 315.0318958890256f, isMoreThanHalf = false, isPositiveArc = false, 11.999f, 6.751f)
                    lineTo(11.999f, 9.999f)
                    lineTo(6.5f, 9.999f)
                    arcTo(0.5f, 0.5f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 6.0f, 10.499f)
                    lineTo(6.0f, 13.499f)
                    arcTo(0.5f, 0.5f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 13.999f)
                    lineTo(12.0f, 13.999f)
                    lineTo(12.0f, 17.248f)
                    arcTo(0.4f, 0.4f, 179.90226151056643f, isMoreThanHalf = false, isPositiveArc = false, 12.682f, 17.531000000000002f)
                    lineTo(17.849f, 12.366000000000003f)
                    arcTo(0.52f, 0.52f, 44.73640179187366f, isMoreThanHalf = false, isPositiveArc = false, 17.849f, 11.634000000000004f)
                }
            }.build().also {
                _trendingRight = it
            }
    }


private var _trendingRight: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TrendingRightIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.TrendingRight.imageVector,
            contentDescription = null,
    )
}
