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

val BezierIcons.TrendingLeft: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _trendingLeft ?: ImageVector.Builder(
                    name = "TrendingLeft",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                        pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(6.151f, 11.635f)
                    lineTo(11.317f, 6.468999999999999f)
                    arcTo(0.4f, 0.4f, 224.9681041109744f, isMoreThanHalf = false, isPositiveArc = true, 12.0f, 6.752f)
                    lineTo(12.0f, 9.998999999999999f)
                    lineTo(17.5f, 9.998999999999999f)
                    arcTo(0.5f, 0.5f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 18.0f, 10.498999999999999f)
                    lineTo(18.0f, 13.498999999999999f)
                    arcTo(0.5f, 0.5f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 13.998999999999999f)
                    lineTo(12.0f, 13.998999999999999f)
                    lineTo(12.0f, 17.249f)
                    arcTo(0.4f, 0.4f, 359.9549101409432f, isMoreThanHalf = false, isPositiveArc = true, 11.317f, 17.532f)
                    lineTo(6.151f, 12.367f)
                    arcTo(0.52f, 0.52f, 135.18599010267613f, isMoreThanHalf = false, isPositiveArc = true, 6.151f, 11.634f)
                }
            }.build().also {
                _trendingLeft = it
            }
    }


private var _trendingLeft: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TrendingLeftIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.TrendingLeft.imageVector,
            contentDescription = null,
    )
}
