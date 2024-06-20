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

val BezierIcons.Heart: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _heart ?: ImageVector.Builder(
                    name = "Heart",
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
                    moveTo(7.895f, 5.003f)
                    arcTo(3.95f, 3.95f, 270.28165616954004f, isMoreThanHalf = false, isPositiveArc = false, 6.279f, 5.34f)
                    quadTo(5.586f, 5.654f, 5.209f, 6.029f)
                    curveTo(3.6689999999999996f, 7.568f, 3.6079999999999997f, 9.954f, 5.061f, 11.699f)
                    curveTo(6.916f, 13.929f, 10.078f, 16.881999999999998f, 12.004f, 18.624f)
                    curveTo(13.93f, 16.881f, 17.094f, 13.927f, 18.945999999999998f, 11.7f)
                    curveTo(20.398999999999997f, 9.953999999999999f, 20.336f, 7.568999999999999f, 18.798f, 6.029999999999999f)
                    curveTo(18.548f, 5.779999999999999f, 18.188f, 5.547999999999999f, 17.727999999999998f, 5.34f)
                    curveTo(16.156999999999996f, 4.629f, 13.859999999999998f, 5.0f, 12.887999999999998f, 6.839f)
                    curveTo(12.887999999999998f, 6.839f, 12.382999999999997f, 7.789000000000001f, 12.217999999999998f, 8.096f)
                    curveTo(12.119999999999997f, 8.282f, 11.883999999999999f, 8.282f, 11.783999999999999f, 8.096f)
                    curveTo(11.573999999999998f, 7.706f, 11.12f, 6.839f, 11.12f, 6.839f)
                    curveTo(10.45f, 5.573f, 9.149999999999999f, 5.003f, 7.895f, 5.003f)
                    moveTo(12.003f, 20.799f)
                    curveTo(11.645f, 20.799f, 11.288f, 20.671f, 11.003f, 20.415f)
                    curveTo(9.089f, 18.694f, 5.571f, 15.440999999999999f, 3.5229999999999997f, 12.98f)
                    curveTo(1.3929999999999998f, 10.42f, 1.5079999999999996f, 6.902f, 3.795f, 4.615f)
                    curveTo(4.215f, 4.194f, 4.774f, 3.825f, 5.455f, 3.5180000000000002f)
                    curveTo(7.718f, 2.494f, 10.379999999999999f, 3.0420000000000003f, 12.004000000000001f, 4.697f)
                    curveTo(13.628000000000002f, 3.043f, 16.29f, 2.496f, 18.553f, 3.5170000000000003f)
                    curveTo(19.233f, 3.825f, 19.791f, 4.194000000000001f, 20.212f, 4.615f)
                    curveTo(22.499f, 6.902f, 22.612f, 10.42f, 20.482f, 12.98f)
                    curveTo(18.438f, 15.438f, 14.919999999999998f, 18.693f, 13.004f, 20.415f)
                    arcTo(1.5f, 1.5f, 48.0732475261469f, isMoreThanHalf = false, isPositiveArc = true, 12.003f, 20.799f)
                }
            }.build().also {
                _heart = it
            }
    }


private var _heart: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun HeartIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Heart.imageVector,
            contentDescription = null,
    )
}
