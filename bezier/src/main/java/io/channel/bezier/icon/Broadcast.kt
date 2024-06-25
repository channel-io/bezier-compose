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

val BezierIcons.Broadcast: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _broadcast ?: ImageVector.Builder(
                    name = "Broadcast",
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
                    moveTo(17.657f, 6.343f)
                    arcTo(8.0f, 8.0f, 315.0f, isMoreThanHalf = false, isPositiveArc = false, 6.343f, 17.657f)
                    arcTo(1.0f, 1.0f, 312.6262102850577f, isMoreThanHalf = true, isPositiveArc = true, 4.93f, 19.07f)
                    curveTo(1.025f, 15.165000000000001f, 1.025f, 8.833f, 4.93f, 4.928000000000001f)
                    curveTo(8.834999999999999f, 1.0230000000000015f, 15.167f, 1.023000000000001f, 19.072f, 4.928000000000001f)
                    curveTo(22.976999999999997f, 8.833f, 22.977f, 15.165000000000001f, 19.072f, 19.07f)
                    arcTo(1.0f, 1.0f, 45.99574461357543f, isMoreThanHalf = false, isPositiveArc = true, 17.657999999999998f, 17.656f)
                    arcTo(8.0f, 8.0f, 45.00147626156967f, isMoreThanHalf = false, isPositiveArc = false, 17.657999999999998f, 6.341999999999999f)
                    moveTo(9.172f, 9.172f)
                    arcTo(4.0f, 4.0f, 224.00425538642025f, isMoreThanHalf = true, isPositiveArc = true, 14.828f, 14.828f)
                    arcTo(1.0f, 1.0f, 224.9999991471751f, isMoreThanHalf = false, isPositiveArc = false, 16.243f, 16.243f)
                    arcTo(6.0f, 6.0f, 44.99514736576191f, isMoreThanHalf = true, isPositiveArc = false, 7.756999999999998f, 16.243f)
                    arcTo(1.0f, 1.0f, 135.0000008528249f, isMoreThanHalf = true, isPositiveArc = false, 9.171999999999997f, 14.828f)
                    arcTo(4.0f, 4.0f, 135.00865166283802f, isMoreThanHalf = false, isPositiveArc = true, 9.171999999999997f, 9.172f)
                    moveTo(11.0f, 13.732f)
                    arcTo(2.0f, 2.0f, 120.00000000000001f, isMoreThanHalf = true, isPositiveArc = true, 13.0f, 13.732f)
                    lineTo(13.0f, 21.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 11.0f, 21.0f)
                    close()
                }
            }.build().also {
                _broadcast = it
            }
    }


private var _broadcast: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun BroadcastIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Broadcast.imageVector,
            contentDescription = null,
    )
}
