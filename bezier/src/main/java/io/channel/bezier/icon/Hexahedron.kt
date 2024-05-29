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

val BezierIcon.Hexahedron: ImageVector
    get() {
        return io.channel.bezier.icon._hexahedron ?: ImageVector.Builder(
                name = "Hexahedron",
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
                moveTo(13.0f, 2.5773f)
                curveTo(12.3812f, 2.2201f, 11.6188f, 2.2201f, 11.0f, 2.5773f)
                lineTo(4.0f, 6.6188f)
                curveTo(3.3812f, 6.9761f, 3.0f, 7.6363f, 3.0f, 8.3509f)
                lineTo(3.0f, 16.4338f)
                curveTo(3.0f, 17.1483f, 3.3812f, 17.8085f, 4.0f, 18.1658f)
                lineTo(11.0f, 22.2073f)
                curveTo(11.6188f, 22.5645f, 12.3812f, 22.5645f, 13.0f, 22.2073f)
                lineTo(20.0f, 18.1658f)
                curveTo(20.6188f, 17.8085f, 21.0f, 17.1483f, 21.0f, 16.4338f)
                lineTo(21.0f, 8.3509f)
                curveTo(21.0f, 7.6363f, 20.6188f, 6.9761f, 20.0f, 6.6188f)
                lineTo(13.0f, 2.5773f)
                close()
                moveTo(5.6958f, 7.8215f)
                lineTo(12.0f, 4.1818f)
                lineTo(18.3042f, 7.8215f)
                lineTo(12.0f, 11.4465f)
                lineTo(5.6958f, 7.8215f)
                close()
                moveTo(4.8895f, 9.665f)
                lineTo(4.8895f, 16.4975f)
                lineTo(11.0002f, 20.0255f)
                lineTo(11.0002f, 13.1786f)
                lineTo(4.8895f, 9.665f)
                close()
                moveTo(13.0002f, 20.0253f)
                lineTo(19.1105f, 16.4975f)
                lineTo(19.1105f, 9.665f)
                lineTo(13.0002f, 13.1784f)
                lineTo(13.0002f, 20.0253f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._hexahedron = it
        }
    }

private var _hexahedron: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun HexahedronIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Hexahedron,
            contentDescription = null,
    )
}