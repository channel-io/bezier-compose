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

val BezierIcons.ArrowLeftUpSmall: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _arrowLeftUpSmall ?: ImageVector.Builder(
                    name = "ArrowLeftUpSmall",
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
                    moveTo(16.9497f, 16.9498f)
                    curveTo(17.3403f, 16.5592f, 17.3403f, 15.9261f, 16.9497f, 15.5356f)
                    lineTo(10.1716f, 8.75738f)
                    lineTo(15.5355f, 8.75739f)
                    curveTo(16.0878f, 8.75739f, 16.5355f, 8.30967f, 16.5355f, 7.75738f)
                    curveTo(16.5355f, 7.2051f, 16.0878f, 6.75738f, 15.5355f, 6.75739f)
                    lineTo(7.75735f, 6.75739f)
                    curveTo(7.20507f, 6.75738f, 6.75735f, 7.2051f, 6.75735f, 7.75739f)
                    lineTo(6.75735f, 15.5356f)
                    curveTo(6.75735f, 16.0878f, 7.20507f, 16.5356f, 7.75735f, 16.5356f)
                    curveTo(8.30964f, 16.5356f, 8.75735f, 16.0878f, 8.75735f, 15.5356f)
                    lineTo(8.75735f, 10.1716f)
                    lineTo(15.5355f, 16.9498f)
                    curveTo(15.9261f, 17.3403f, 16.5592f, 17.3403f, 16.9497f, 16.9498f)
                    close()
                }
            }.build().also {
                _arrowLeftUpSmall = it
            }
    }


private var _arrowLeftUpSmall: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ArrowLeftUpSmallIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ArrowLeftUpSmall.imageVector,
            contentDescription = null,
    )
}
