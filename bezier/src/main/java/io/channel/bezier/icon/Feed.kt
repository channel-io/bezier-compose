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

val BezierIcons.Feed: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _feed ?: ImageVector.Builder(
                    name = "Feed",
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
                    moveTo(5.0f, 3.0f)
                    arcTo(3.0f, 3.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 2.0f, 6.0f)
                    lineTo(2.0f, 12.0f)
                    arcTo(3.0f, 3.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 5.0f, 15.0f)
                    lineTo(19.0f, 15.0f)
                    arcTo(3.0f, 3.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 22.0f, 12.0f)
                    lineTo(22.0f, 6.0f)
                    arcTo(3.0f, 3.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 19.0f, 3.0f)
                    close()
                    moveTo(19.0f, 5.0f)
                    lineTo(5.0f, 5.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 4.0f, 6.0f)
                    lineTo(4.0f, 12.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 5.0f, 13.0f)
                    lineTo(19.0f, 13.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 20.0f, 12.0f)
                    lineTo(20.0f, 6.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 19.0f, 5.0f)
                }

                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(4.0f, 16.0f)
                    arcTo(2.0f, 2.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 6.0f, 18.0f)
                    lineTo(18.0f, 18.0f)
                    arcTo(2.0f, 2.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 20.0f, 16.0f)
                    close()
                    moveTo(18.0f, 19.0f)
                    arcTo(2.0f, 2.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 16.0f, 21.0f)
                    lineTo(8.0f, 21.0f)
                    arcTo(2.0f, 2.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 6.0f, 19.0f)
                    close()
                }
            }.build().also {
                _feed = it
            }
    }


private var _feed: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun FeedIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Feed.imageVector,
            contentDescription = null,
    )
}
