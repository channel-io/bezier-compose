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

val BezierIcons.TrendingUp: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_trending_up
        override val imageVector: ImageVector
            get() = _trendingUp ?: ImageVector.Builder(
                    name = "TrendingUp",
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
                    moveTo(11.634f, 6.152f)
                    lineTo(6.468f, 11.318000000000001f)
                    arcTo(0.4f, 0.4f, 225.03189588902558f, isMoreThanHalf = false, isPositiveArc = false, 6.751f, 12.001000000000001f)
                    lineTo(10.0f, 12.001000000000001f)
                    lineTo(10.0f, 17.5f)
                    arcTo(0.5f, 0.5f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 10.5f, 18.0f)
                    lineTo(13.5f, 18.0f)
                    arcTo(0.5f, 0.5f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 14.0f, 17.5f)
                    lineTo(14.0f, 12.0f)
                    lineTo(17.25f, 12.0f)
                    arcTo(0.4f, 0.4f, 89.75944054344441f, isMoreThanHalf = false, isPositiveArc = false, 17.532f, 11.318f)
                    lineTo(12.367f, 6.151999999999999f)
                    arcTo(0.52f, 0.52f, 314.7364017918737f, isMoreThanHalf = false, isPositiveArc = false, 11.635000000000002f, 6.151999999999999f)
                }
            }.build().also {
                _trendingUp = it
            }
    }


private var _trendingUp: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TrendingUpIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.TrendingUp.imageVector,
            contentDescription = null,
    )
}
