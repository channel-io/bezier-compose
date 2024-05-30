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

val BezierIcons.HandThumbdownFilled: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _handThumbdownFilled ?: ImageVector.Builder(
                    name = "HandThumbdownFilled",
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
                    moveTo(16.7772f, 20.9756f)
                    curveTo(16.4066f, 21.3461f, 15.9663f, 21.49f, 15.537f, 21.49f)
                    curveTo(15.1092f, 21.49f, 14.6668f, 21.3446f, 14.3001f, 20.9779f)
                    lineTo(8.8302f, 15.509f)
                    lineTo(8.62772f, 15.2969f)
                    curveTo(7.57725f, 14.1449f, 7.0f, 12.6584f, 7.0f, 11.089f)
                    lineTo(7.0f, 10.313f)
                    lineTo(7.00512f, 10.0572f)
                    curveTo(7.10392f, 7.5946f, 8.62428f, 5.43168f, 10.9286f, 4.50949f)
                    curveTo(11.7753f, 4.17175f, 12.6656f, 4.0f, 13.573f, 4.0f)
                    lineTo(16.25f, 4.0f)
                    lineTo(16.4418f, 4.0057f)
                    curveTo(17.7139f, 4.08139f, 18.8406f, 4.90481f, 19.2922f, 6.1076f)
                    lineTo(21.5422f, 12.1085f)
                    lineTo(21.611f, 12.3111f)
                    curveTo(21.9002f, 13.2618f, 21.7429f, 14.2764f, 21.1702f, 15.1023f)
                    lineTo(21.0433f, 15.2739f)
                    curveTo(20.4284f, 16.0516f, 19.504f, 16.5f, 18.5f, 16.5f)
                    lineTo(14.7708f, 16.5007f)
                    lineTo(16.7749f, 18.5031f)
                    lineTo(16.8881f, 18.6282f)
                    curveTo(17.4539f, 19.3166f, 17.4163f, 20.3331f, 16.7772f, 20.9756f)
                    close()
                    moveTo(3.0543f, 14.727f)
                    curveTo(2.9998f, 14.62f, 2.9998f, 14.48f, 2.9998f, 14.2f)
                    lineTo(2.9998f, 5.80001f)
                    curveTo(2.9998f, 5.51998f, 2.9998f, 5.37997f, 3.0543f, 5.27301f)
                    curveTo(3.10224f, 5.17893f, 3.17873f, 5.10244f, 3.27281f, 5.05451f)
                    curveTo(3.37976f, 5.00001f, 3.51978f, 5.00001f, 3.7998f, 5.00001f)
                    lineTo(5.1998f, 5.00001f)
                    curveTo(5.47983f, 5.00001f, 5.61984f, 5.00001f, 5.7268f, 5.05451f)
                    curveTo(5.82088f, 5.10244f, 5.89737f, 5.17893f, 5.9453f, 5.27301f)
                    curveTo(5.9998f, 5.37997f, 5.9998f, 5.51998f, 5.9998f, 5.80001f)
                    lineTo(5.9998f, 14.2f)
                    curveTo(5.9998f, 14.48f, 5.9998f, 14.62f, 5.9453f, 14.727f)
                    curveTo(5.89737f, 14.8211f, 5.82088f, 14.8976f, 5.7268f, 14.9455f)
                    curveTo(5.61984f, 15.0f, 5.47983f, 15.0f, 5.1998f, 15.0f)
                    lineTo(3.7998f, 15.0f)
                    curveTo(3.51978f, 15.0f, 3.37976f, 15.0f, 3.27281f, 14.9455f)
                    curveTo(3.17873f, 14.8976f, 3.10224f, 14.8211f, 3.0543f, 14.727f)
                    close()
                }
            }.build().also {
                _handThumbdownFilled = it
            }
    }


private var _handThumbdownFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun HandThumbdownFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.HandThumbdownFilled.imageVector,
            contentDescription = null,
    )
}
