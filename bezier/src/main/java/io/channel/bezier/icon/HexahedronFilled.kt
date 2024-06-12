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

val BezierIcons.HexahedronFilled: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _hexahedronFilled ?: ImageVector.Builder(
                    name = "HexahedronFilled",
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
                    moveTo(13.0f, 2.57734f)
                    curveTo(12.3812f, 2.22007f, 11.6188f, 2.22007f, 11.0f, 2.57734f)
                    lineTo(4.0f, 6.61879f)
                    curveTo(3.3812f, 6.97605f, 3.0f, 7.63631f, 3.0f, 8.35084f)
                    lineTo(3.0f, 16.4337f)
                    curveTo(3.0f, 17.1483f, 3.3812f, 17.8085f, 4.0f, 18.1658f)
                    lineTo(11.0f, 22.2072f)
                    curveTo(11.6188f, 22.5645f, 12.3812f, 22.5645f, 13.0f, 22.2072f)
                    lineTo(20.0f, 18.1658f)
                    curveTo(20.6188f, 17.8085f, 21.0f, 17.1483f, 21.0f, 16.4337f)
                    lineTo(21.0f, 8.35084f)
                    curveTo(21.0f, 7.63631f, 20.6188f, 6.97605f, 20.0f, 6.61879f)
                    lineTo(13.0f, 2.57734f)
                    close()
                    moveTo(10.4935f, 12.8952f)
                    curveTo(10.8067f, 13.0728f, 11.0002f, 13.405f, 11.0002f, 13.765f)
                    lineTo(11.0002f, 19.0003f)
                    curveTo(11.0002f, 19.5526f, 11.4479f, 20.0003f, 12.0002f, 20.0003f)
                    curveTo(12.5525f, 20.0003f, 13.0002f, 19.5526f, 13.0002f, 19.0003f)
                    lineTo(13.0002f, 13.7649f)
                    curveTo(13.0002f, 13.4048f, 13.1937f, 13.0726f, 13.5069f, 12.895f)
                    lineTo(18.5262f, 10.0485f)
                    curveTo(19.0103f, 9.77398f, 19.177f, 9.15705f, 18.8972f, 8.67606f)
                    curveTo(18.6217f, 8.20254f, 18.0164f, 8.03894f, 17.5399f, 8.30919f)
                    lineTo(12.4934f, 11.1711f)
                    curveTo(12.1874f, 11.3446f, 11.8127f, 11.3446f, 11.5067f, 11.1711f)
                    lineTo(6.45537f, 8.30622f)
                    curveTo(5.97882f, 8.03595f, 5.37352f, 8.19955f, 5.09801f, 8.6731f)
                    curveTo(4.81817f, 9.15408f, 4.98491f, 9.77098f, 5.46894f, 10.0455f)
                    lineTo(10.4935f, 12.8952f)
                    close()
                }
            }.build().also {
                _hexahedronFilled = it
            }
    }


private var _hexahedronFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun HexahedronFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.HexahedronFilled.imageVector,
            contentDescription = null,
    )
}
