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

val BezierIcons.TrendingDown: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_trending_down
        override val imageVector: ImageVector
            get() = _trendingDown ?: ImageVector.Builder(
                    name = "TrendingDown",
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
                    moveTo(11.634f, 17.849f)
                    lineTo(6.468f, 12.682f)
                    arcTo(0.4f, 0.4f, 135.17033840439095f, isMoreThanHalf = false, isPositiveArc = true, 6.751f, 12.0f)
                    lineTo(10.0f, 12.0f)
                    lineTo(10.0f, 6.5f)
                    arcTo(0.5f, 0.5f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 6.0f)
                    lineTo(13.5f, 6.0f)
                    arcTo(0.5f, 0.5f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 14.0f, 6.5f)
                    lineTo(14.0f, 12.0f)
                    lineTo(17.25f, 12.0f)
                    arcTo(0.4f, 0.4f, 270.2405594565556f, isMoreThanHalf = false, isPositiveArc = true, 17.532f, 12.682f)
                    lineTo(12.367f, 17.849f)
                    arcTo(0.52f, 0.52f, 45.26359820812633f, isMoreThanHalf = false, isPositiveArc = true, 11.635000000000002f, 17.849f)
                }
            }.build().also {
                _trendingDown = it
            }
    }


private var _trendingDown: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TrendingDownIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.TrendingDown.imageVector,
            contentDescription = null,
    )
}
