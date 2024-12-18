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

val BezierIcons.Ios: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_ios
        override val imageVector: ImageVector
            get() = _ios ?: ImageVector.Builder(
                    name = "Ios",
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
                    moveTo(5.0f, 2.0f)
                    arcTo(2.0f, 2.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 3.0f, 4.0f)
                    lineTo(3.0f, 20.0f)
                    arcTo(2.0f, 2.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 5.0f, 22.0f)
                    lineTo(13.0f, 22.0f)
                    quadTo(13.116f, 22.0f, 13.228f, 21.987f)
                    quadTo(13.322f, 22.000999999999998f, 13.414f, 22.000999999999998f)
                    curveTo(13.695f, 22.000999999999998f, 14.044f, 21.874f, 14.429f, 21.735f)
                    curveTo(14.909f, 21.561f, 15.447000000000001f, 21.365f, 15.988f, 21.365f)
                    curveTo(16.473f, 21.365f, 16.893f, 21.523f, 17.308f, 21.677999999999997f)
                    curveTo(17.712f, 21.827999999999996f, 18.111f, 21.977999999999998f, 18.558f, 21.977999999999998f)
                    curveTo(20.536f, 21.977999999999998f, 22.0f, 17.855999999999998f, 22.0f, 17.855999999999998f)
                    curveTo(22.0f, 17.855999999999998f, 19.906f, 17.046f, 19.906f, 14.692999999999998f)
                    curveTo(19.906f, 12.607999999999997f, 21.586f, 11.748999999999999f, 21.586f, 11.748999999999999f)
                    curveTo(21.586f, 11.748999999999999f, 20.726f, 10.192999999999998f, 18.541999999999998f, 10.192999999999998f)
                    curveTo(17.77f, 10.192999999999998f, 17.105999999999998f, 10.460999999999999f, 16.586999999999996f, 10.669999999999998f)
                    curveTo(16.252999999999997f, 10.804999999999998f, 15.977999999999996f, 10.914999999999997f, 15.772999999999996f, 10.914999999999997f)
                    curveTo(15.515999999999996f, 10.914999999999997f, 15.205999999999996f, 10.795999999999998f, 14.846999999999996f, 10.657999999999998f)
                    curveTo(14.347999999999995f, 10.465999999999998f, 13.753999999999996f, 10.236999999999998f, 13.069999999999997f, 10.236999999999998f)
                    curveTo(11.258999999999997f, 10.236999999999998f, 9.326999999999996f, 11.857999999999999f, 9.326999999999996f, 14.95f)
                    curveTo(9.326999999999996f, 16.28f, 9.736999999999997f, 17.749f, 10.345999999999997f, 19.0f)
                    lineTo(5.0f, 19.0f)
                    lineTo(5.0f, 5.0f)
                    lineTo(13.0f, 5.0f)
                    lineTo(13.0f, 9.0f)
                    lineTo(15.0f, 9.0f)
                    lineTo(15.0f, 4.0f)
                    arcTo(2.0f, 2.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 13.0f, 2.0f)
                    close()
                    moveTo(17.957f, 8.94f)
                    curveTo(18.972f, 7.72f, 18.761f, 6.4559999999999995f, 18.761f, 6.4559999999999995f)
                    curveTo(18.761f, 6.4559999999999995f, 17.341f, 6.462f, 16.319f, 7.808f)
                    curveTo(15.411f, 9.004999999999999f, 15.642999999999999f, 10.03f, 15.642999999999999f, 10.03f)
                    curveTo(15.642999999999999f, 10.03f, 16.874f, 10.242999999999999f, 17.957f, 8.94f)
                }
            }.build().also {
                _ios = it
            }
    }


private var _ios: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun IosIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Ios.imageVector,
            contentDescription = null,
    )
}
