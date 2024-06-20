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

val BezierIcons.FastRewind: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _fastRewind ?: ImageVector.Builder(
                    name = "FastRewind",
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
                    moveTo(10.279f, 4.25f)
                    curveTo(11.440999999999999f, 3.474f, 12.999f, 4.308f, 12.999f, 5.7059999999999995f)
                    lineTo(12.999f, 9.099f)
                    lineTo(20.279f, 4.2490000000000006f)
                    curveTo(21.442f, 3.4740000000000006f, 22.999f, 4.309f, 22.999f, 5.706f)
                    lineTo(22.999f, 18.294f)
                    curveTo(22.999f, 19.692f, 21.442f, 20.526f, 20.279f, 19.751f)
                    lineTo(12.998999999999999f, 14.901000000000002f)
                    lineTo(12.998999999999999f, 18.294f)
                    curveTo(12.998999999999999f, 19.692f, 11.440999999999999f, 20.526f, 10.278999999999998f, 19.751f)
                    lineTo(0.8289999999999988f, 13.456000000000001f)
                    arcTo(1.75f, 1.75f, 123.69526214711692f, isMoreThanHalf = false, isPositiveArc = true, 0.8289999999999988f, 10.544f)
                    close()
                    moveTo(10.999f, 6.173f)
                    lineTo(2.25f, 12.0f)
                    lineTo(10.998f, 17.828f)
                    close()
                    moveTo(12.25f, 12.0f)
                    lineTo(20.997999999999998f, 17.828f)
                    lineTo(20.997999999999998f, 6.173f)
                    close()
                }
            }.build().also {
                _fastRewind = it
            }
    }


private var _fastRewind: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun FastRewindIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.FastRewind.imageVector,
            contentDescription = null,
    )
}
