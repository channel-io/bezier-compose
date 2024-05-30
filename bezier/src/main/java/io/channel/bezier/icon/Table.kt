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

val BezierIcons.Table: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _table ?: ImageVector.Builder(
                    name = "Table",
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
                    moveTo(16.0f, 6.0f)
                    lineTo(19.0f, 6.0f)
                    curveTo(19.5523f, 6.0f, 20.0f, 6.44771f, 20.0f, 7.0f)
                    lineTo(20.0f, 9.0f)
                    lineTo(16.0f, 9.0f)
                    lineTo(16.0f, 6.0f)
                    close()
                    moveTo(14.0f, 6.0f)
                    lineTo(10.0f, 6.0f)
                    lineTo(10.0f, 9.0f)
                    lineTo(14.0f, 9.0f)
                    lineTo(14.0f, 6.0f)
                    close()
                    moveTo(14.0f, 11.0f)
                    lineTo(10.0f, 11.0f)
                    lineTo(10.0f, 18.0f)
                    lineTo(14.0f, 18.0f)
                    lineTo(14.0f, 11.0f)
                    close()
                    moveTo(16.0f, 18.0f)
                    lineTo(19.0f, 18.0f)
                    curveTo(19.5523f, 18.0f, 20.0f, 17.5523f, 20.0f, 17.0f)
                    lineTo(20.0f, 11.0f)
                    lineTo(16.0f, 11.0f)
                    lineTo(16.0f, 18.0f)
                    close()
                    moveTo(8.0f, 6.0f)
                    lineTo(8.0f, 9.0f)
                    lineTo(4.0f, 9.0f)
                    lineTo(4.0f, 7.0f)
                    curveTo(4.0f, 6.44772f, 4.44772f, 6.0f, 5.0f, 6.0f)
                    lineTo(8.0f, 6.0f)
                    close()
                    moveTo(8.0f, 11.0f)
                    lineTo(4.0f, 11.0f)
                    lineTo(4.0f, 17.0f)
                    curveTo(4.0f, 17.5523f, 4.44772f, 18.0f, 5.0f, 18.0f)
                    lineTo(8.0f, 18.0f)
                    lineTo(8.0f, 11.0f)
                    close()
                    moveTo(2.0f, 7.0f)
                    curveTo(2.0f, 5.34315f, 3.34315f, 4.0f, 5.0f, 4.0f)
                    lineTo(19.0f, 4.0f)
                    curveTo(20.6569f, 4.0f, 22.0f, 5.34315f, 22.0f, 7.0f)
                    lineTo(22.0f, 17.0f)
                    curveTo(22.0f, 18.6569f, 20.6569f, 20.0f, 19.0f, 20.0f)
                    lineTo(5.0f, 20.0f)
                    curveTo(3.34315f, 20.0f, 2.0f, 18.6569f, 2.0f, 17.0f)
                    lineTo(2.0f, 7.0f)
                    close()
                }
            }.build().also {
                _table = it
            }
    }


private var _table: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TableIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Table.imageVector,
            contentDescription = null,
    )
}