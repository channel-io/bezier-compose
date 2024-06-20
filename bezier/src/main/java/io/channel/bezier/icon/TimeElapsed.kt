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

val BezierIcons.TimeElapsed: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _timeElapsed ?: ImageVector.Builder(
                    name = "TimeElapsed",
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
                    moveTo(12.0f, 2.0f)
                    lineTo(11.0f, 2.0f)
                    lineTo(11.0f, 6.0f)
                    lineTo(13.0f, 6.0f)
                    lineTo(13.0f, 4.062f)
                    curveTo(16.941f, 4.556f, 20.0f, 7.928000000000001f, 20.0f, 12.0f)
                    curveTo(20.0f, 16.411f, 16.411f, 20.0f, 12.0f, 20.0f)
                    curveTo(7.588999999999999f, 20.0f, 4.0f, 16.411f, 4.0f, 12.0f)
                    curveTo(4.0f, 10.2f, 4.59f, 8.491f, 5.68f, 7.094f)
                    lineTo(10.074f, 11.488f)
                    arcTo(2.0f, 2.0f, 195.6549586833663f, isMoreThanHalf = false, isPositiveArc = false, 10.0f, 12.0f)
                    arcTo(2.0f, 2.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = false, 12.0f, 10.0f)
                    curveTo(11.822f, 10.0f, 11.653f, 10.031f, 11.49f, 10.074f)
                    lineTo(5.635f, 4.221f)
                    lineTo(4.928f, 4.929f)
                    arcTo(9.93f, 9.93f, 225.1598371244827f, isMoreThanHalf = false, isPositiveArc = false, 2.0f, 12.0f)
                    curveTo(2.0f, 17.514f, 6.486f, 22.0f, 12.0f, 22.0f)
                    curveTo(17.514f, 22.0f, 22.0f, 17.514f, 22.0f, 12.0f)
                    curveTo(22.0f, 6.486000000000001f, 17.514f, 2.0f, 12.0f, 2.0f)
                }
            }.build().also {
                _timeElapsed = it
            }
    }


private var _timeElapsed: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TimeElapsedIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.TimeElapsed.imageVector,
            contentDescription = null,
    )
}
