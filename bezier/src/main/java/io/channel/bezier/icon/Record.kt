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

val BezierIcons.Record: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _record ?: ImageVector.Builder(
                    name = "Record",
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
                    moveTo(17.0f, 12.0f)
                    curveTo(17.0f, 14.7614f, 14.7614f, 17.0f, 12.0f, 17.0f)
                    curveTo(9.23858f, 17.0f, 7.0f, 14.7614f, 7.0f, 12.0f)
                    curveTo(7.0f, 9.23858f, 9.23858f, 7.0f, 12.0f, 7.0f)
                    curveTo(14.7614f, 7.0f, 17.0f, 9.23858f, 17.0f, 12.0f)
                    close()
                }

                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                ) {
                    moveTo(16.0f, 5.0f)
                    lineTo(8.0f, 5.0f)
                    curveTo(6.34315f, 5.0f, 5.0f, 6.34315f, 5.0f, 8.0f)
                    lineTo(5.0f, 16.0f)
                    curveTo(5.0f, 17.6569f, 6.34315f, 19.0f, 8.0f, 19.0f)
                    lineTo(16.0f, 19.0f)
                    curveTo(17.6569f, 19.0f, 19.0f, 17.6569f, 19.0f, 16.0f)
                    lineTo(19.0f, 8.0f)
                    curveTo(19.0f, 6.34315f, 17.6569f, 5.0f, 16.0f, 5.0f)
                    close()
                    moveTo(8.0f, 3.0f)
                    curveTo(5.23858f, 3.0f, 3.0f, 5.23858f, 3.0f, 8.0f)
                    lineTo(3.0f, 16.0f)
                    curveTo(3.0f, 18.7614f, 5.23858f, 21.0f, 8.0f, 21.0f)
                    lineTo(16.0f, 21.0f)
                    curveTo(18.7614f, 21.0f, 21.0f, 18.7614f, 21.0f, 16.0f)
                    lineTo(21.0f, 8.0f)
                    curveTo(21.0f, 5.23858f, 18.7614f, 3.0f, 16.0f, 3.0f)
                    lineTo(8.0f, 3.0f)
                    close()
                }
            }.build().also {
                _record = it
            }
    }


private var _record: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun RecordIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Record.imageVector,
            contentDescription = null,
    )
}
