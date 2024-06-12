@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons

val BezierIcons.Shuffle: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _shuffle ?: ImageVector.Builder(
                    name = "Shuffle",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                ) {
                    moveTo(17.0f, 10.0686f)
                    lineTo(17.0f, 8.0f)
                    lineTo(16.0826f, 8.0f)
                    curveTo(15.1037f, 8.0f, 14.1863f, 8.47763f, 13.6249f, 9.27961f)
                    lineTo(9.01354f, 15.8673f)
                    curveTo(8.07789f, 17.2039f, 6.54895f, 18.0f, 4.91738f, 18.0f)
                    lineTo(3.0f, 18.0f)
                    curveTo(2.44772f, 18.0f, 2.0f, 17.5523f, 2.0f, 17.0f)
                    curveTo(2.0f, 16.4477f, 2.44772f, 16.0f, 3.0f, 16.0f)
                    lineTo(4.91738f, 16.0f)
                    curveTo(5.89632f, 16.0f, 6.81369f, 15.5224f, 7.37507f, 14.7204f)
                    lineTo(11.9865f, 8.13269f)
                    curveTo(12.9221f, 6.79606f, 14.4511f, 6.0f, 16.0826f, 6.0f)
                    lineTo(17.0f, 6.0f)
                    lineTo(17.0f, 3.93137f)
                    curveTo(17.0f, 3.21864f, 17.8617f, 2.86171f, 18.3657f, 3.36568f)
                    lineTo(21.2929f, 6.29289f)
                    curveTo(21.6834f, 6.68341f, 21.6834f, 7.31658f, 21.2929f, 7.7071f)
                    lineTo(18.3657f, 10.6343f)
                    curveTo(17.8617f, 11.1383f, 17.0f, 10.7813f, 17.0f, 10.0686f)
                    close()
                    moveTo(9.01354f, 8.13269f)
                    lineTo(9.88967f, 9.38431f)
                    lineTo(8.66902f, 11.1281f)
                    lineTo(7.37507f, 9.27961f)
                    curveTo(6.81369f, 8.47763f, 5.89632f, 8.0f, 4.91738f, 8.0f)
                    lineTo(3.0f, 8.0f)
                    curveTo(2.44772f, 8.0f, 2.0f, 7.55229f, 2.0f, 7.0f)
                    curveTo(2.0f, 6.44771f, 2.44772f, 6.0f, 3.0f, 6.0f)
                    lineTo(4.91738f, 6.0f)
                    curveTo(6.54895f, 6.0f, 8.07789f, 6.79605f, 9.01354f, 8.13269f)
                    close()
                    moveTo(11.9865f, 15.8673f)
                    lineTo(11.1103f, 14.6157f)
                    lineTo(12.331f, 12.8719f)
                    lineTo(13.6249f, 14.7204f)
                    curveTo(14.1863f, 15.5224f, 15.1037f, 16.0f, 16.0826f, 16.0f)
                    lineTo(17.0f, 16.0f)
                    lineTo(17.0f, 13.9316f)
                    curveTo(17.0f, 13.2189f, 17.8617f, 12.862f, 18.3657f, 13.3659f)
                    lineTo(21.2929f, 16.2931f)
                    curveTo(21.6834f, 16.6837f, 21.6834f, 17.3168f, 21.2929f, 17.7073f)
                    lineTo(18.3657f, 20.6346f)
                    curveTo(17.8617f, 21.1385f, 17.0f, 20.7816f, 17.0f, 20.0689f)
                    lineTo(17.0f, 18.0f)
                    lineTo(16.0826f, 18.0f)
                    curveTo(14.4511f, 18.0f, 12.9221f, 17.2039f, 11.9865f, 15.8673f)
                    close()
                }
            }.build().also {
                _shuffle = it
            }
    }


private var _shuffle: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ShuffleIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Shuffle.imageVector,
            contentDescription = null,
    )
}
