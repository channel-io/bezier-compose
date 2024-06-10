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

val BezierIcons.StarFilled: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _starFilled ?: ImageVector.Builder(
                    name = "StarFilled",
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
                    moveTo(12.0002f, 17.7598f)
                    lineTo(16.7852f, 21.2358f)
                    curveTo(17.8922f, 22.0398f, 19.3802f, 20.9578f, 18.9582f, 19.6568f)
                    lineTo(17.1302f, 14.0318f)
                    lineTo(21.9152f, 10.5558f)
                    curveTo(23.0212f, 9.75177f, 22.4532f, 8.00077f, 21.0852f, 8.00077f)
                    lineTo(15.1712f, 8.00077f)
                    lineTo(13.3432f, 2.37577f)
                    curveTo(12.9202f, 1.07477f, 11.0802f, 1.07477f, 10.6572f, 2.37577f)
                    lineTo(8.82921f, 8.00077f)
                    lineTo(2.91521f, 8.00077f)
                    curveTo(1.54721f, 8.00077f, 0.978212f, 9.75177f, 2.08421f, 10.5558f)
                    lineTo(6.86921f, 14.0318f)
                    lineTo(5.04221f, 19.6568f)
                    curveTo(4.61921f, 20.9578f, 6.10821f, 22.0398f, 7.21521f, 21.2358f)
                    lineTo(12.0002f, 17.7598f)
                    close()
                }
            }.build().also {
                _starFilled = it
            }
    }


private var _starFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun StarFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.StarFilled.imageVector,
            contentDescription = null,
    )
}
