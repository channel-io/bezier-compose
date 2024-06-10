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

val BezierIcons.Signal: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _signal ?: ImageVector.Builder(
                    name = "Signal",
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
                    moveTo(6.34315f, 17.6568f)
                    curveTo(3.21895f, 14.5326f, 3.21895f, 9.46729f, 6.34315f, 6.34309f)
                    curveTo(6.73367f, 5.95257f, 6.73367f, 5.3194f, 6.34315f, 4.92888f)
                    curveTo(5.95262f, 4.53836f, 5.31946f, 4.53836f, 4.92893f, 4.92888f)
                    curveTo(1.02369f, 8.83412f, 1.02369f, 15.1658f, 4.92893f, 19.071f)
                    curveTo(5.31946f, 19.4615f, 5.95262f, 19.4615f, 6.34315f, 19.071f)
                    curveTo(6.73367f, 18.6805f, 6.73367f, 18.0473f, 6.34315f, 17.6568f)
                    close()
                    moveTo(19.0711f, 4.92888f)
                    curveTo(18.6805f, 4.53836f, 18.0474f, 4.53836f, 17.6569f, 4.92888f)
                    curveTo(17.2663f, 5.3194f, 17.2663f, 5.95257f, 17.6569f, 6.34309f)
                    curveTo(20.781f, 9.46729f, 20.781f, 14.5326f, 17.6569f, 17.6568f)
                    curveTo(17.2663f, 18.0473f, 17.2663f, 18.6805f, 17.6569f, 19.071f)
                    curveTo(18.0474f, 19.4615f, 18.6805f, 19.4615f, 19.0711f, 19.071f)
                    curveTo(22.9763f, 15.1658f, 22.9763f, 8.83412f, 19.0711f, 4.92888f)
                    close()
                    moveTo(9.17156f, 9.17152f)
                    curveTo(7.60947f, 10.7336f, 7.60947f, 13.2663f, 9.17156f, 14.8284f)
                    curveTo(9.56209f, 15.2189f, 9.56209f, 15.8521f, 9.17156f, 16.2426f)
                    curveTo(8.78104f, 16.6331f, 8.14787f, 16.6331f, 7.75735f, 16.2426f)
                    curveTo(5.4142f, 13.8994f, 5.4142f, 10.1005f, 7.75735f, 7.75731f)
                    curveTo(8.14787f, 7.36678f, 8.78104f, 7.36678f, 9.17156f, 7.75731f)
                    curveTo(9.56209f, 8.14783f, 9.56209f, 8.781f, 9.17156f, 9.17152f)
                    close()
                    moveTo(14.8284f, 7.75731f)
                    curveTo(15.2189f, 7.36678f, 15.8521f, 7.36678f, 16.2426f, 7.75731f)
                    curveTo(18.5858f, 10.1005f, 18.5858f, 13.8994f, 16.2426f, 16.2426f)
                    curveTo(15.8521f, 16.6331f, 15.2189f, 16.6331f, 14.8284f, 16.2426f)
                    curveTo(14.4379f, 15.8521f, 14.4379f, 15.2189f, 14.8284f, 14.8284f)
                    curveTo(16.3905f, 13.2663f, 16.3905f, 10.7336f, 14.8284f, 9.17152f)
                    curveTo(14.4379f, 8.781f, 14.4379f, 8.14783f, 14.8284f, 7.75731f)
                    close()
                    moveTo(14.0f, 11.9999f)
                    curveTo(14.0f, 13.1045f, 13.1046f, 13.9999f, 12.0f, 13.9999f)
                    curveTo(10.8954f, 13.9999f, 10.0f, 13.1045f, 10.0f, 11.9999f)
                    curveTo(10.0f, 10.8954f, 10.8954f, 9.99995f, 12.0f, 9.99995f)
                    curveTo(13.1046f, 9.99995f, 14.0f, 10.8954f, 14.0f, 11.9999f)
                    close()
                }
            }.build().also {
                _signal = it
            }
    }


private var _signal: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun SignalIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Signal.imageVector,
            contentDescription = null,
    )
}
