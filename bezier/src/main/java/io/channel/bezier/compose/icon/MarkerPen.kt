@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.compose.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.compose.BezierIcon

val BezierIcon.MarkerPen: ImageVector
    get() {
        return _markerPen ?: ImageVector.Builder(
                name = "MarkerPen",
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
                moveTo(11.9478f, 13.5051f)
                lineTo(18.0128f, 3.0001f)
                lineTo(20.3228f, 3.0001f)
                lineTo(13.6798f, 14.5051f)
                curveTo(13.1388f, 15.4421f, 12.1268f, 15.9801f, 11.0458f, 15.9021f)
                curveTo(10.7518f, 15.8811f, 10.4768f, 16.0531f, 10.3288f, 16.3081f)
                lineTo(8.8878f, 18.8041f)
                lineTo(8.4868f, 19.5001f)
                curveTo(8.3078f, 19.8091f, 7.9778f, 20.0001f, 7.6198f, 20.0001f)
                lineTo(3.0018f, 20.0001f)
                curveTo(2.2318f, 20.0001f, 1.7508f, 19.1671f, 2.1358f, 18.5001f)
                lineTo(4.1918f, 14.9381f)
                lineTo(4.1928f, 14.9381f)
                lineTo(5.1338f, 13.3081f)
                curveTo(5.2798f, 13.0541f, 5.2788f, 12.7471f, 5.1318f, 12.4961f)
                curveTo(4.6078f, 11.5991f, 4.4148f, 10.5521f, 4.9348f, 9.6521f)
                lineTo(8.7748f, 3.0001f)
                lineTo(11.0848f, 3.0001f)
                lineTo(6.7518f, 10.5051f)
                curveTo(6.6048f, 10.7591f, 6.6058f, 11.0651f, 6.7518f, 11.3161f)
                curveTo(7.2748f, 12.2171f, 7.4658f, 13.2681f, 6.9448f, 14.1701f)
                lineTo(6.4248f, 15.0721f)
                lineTo(8.1568f, 16.0721f)
                lineTo(8.5968f, 15.3081f)
                curveTo(9.1378f, 14.3711f, 10.1498f, 13.8331f, 11.2318f, 13.9111f)
                curveTo(11.5258f, 13.9321f, 11.7998f, 13.7611f, 11.9478f, 13.5051f)
                close()
                moveTo(9.3444f, 20.0003f)
                lineTo(10.5f, 18.0001f)
                lineTo(19.0f, 18.0001f)
                lineTo(19.0f, 20.0003f)
                lineTo(9.3444f, 20.0003f)
                close()
            }
        }.build().also {
            _markerPen = it
        }
    }

private var _markerPen: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun MarkerPenIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.MarkerPen,
            contentDescription = null,
    )
}
