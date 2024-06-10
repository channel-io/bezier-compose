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

val BezierIcons.Trash: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _trash ?: ImageVector.Builder(
                    name = "Trash",
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
                    moveTo(14.0002f, 4.00009f)
                    lineTo(10.0002f, 4.00009f)
                    lineTo(10.0002f, 5.00009f)
                    lineTo(14.0002f, 5.00009f)
                    lineTo(14.0002f, 4.00009f)
                    close()
                    moveTo(16.0002f, 5.00009f)
                    lineTo(20.0002f, 5.00009f)
                    lineTo(20.0002f, 7.00009f)
                    lineTo(19.0f, 7.00009f)
                    lineTo(19.0f, 18.0f)
                    curveTo(19.0f, 20.2091f, 17.2091f, 22.0f, 15.0f, 22.0f)
                    lineTo(9.0f, 22.0f)
                    curveTo(6.79086f, 22.0f, 5.0f, 20.2091f, 5.0f, 18.0f)
                    lineTo(5.0f, 7.00009f)
                    lineTo(4.00021f, 7.00009f)
                    lineTo(4.00021f, 5.00009f)
                    lineTo(8.00021f, 5.00009f)
                    lineTo(8.00021f, 3.50009f)
                    curveTo(8.00021f, 2.67181f, 8.67193f, 2.00009f, 9.50021f, 2.00009f)
                    lineTo(14.5002f, 2.00009f)
                    curveTo(15.3285f, 2.00009f, 16.0002f, 2.67181f, 16.0002f, 3.50009f)
                    lineTo(16.0002f, 5.00009f)
                    close()
                    moveTo(7.0f, 18.0f)
                    lineTo(7.0f, 7.00009f)
                    lineTo(17.0f, 7.00009f)
                    lineTo(17.0f, 18.0f)
                    curveTo(17.0f, 19.1046f, 16.1046f, 20.0f, 15.0f, 20.0f)
                    lineTo(9.0f, 20.0f)
                    curveTo(7.89543f, 20.0f, 7.0f, 19.1046f, 7.0f, 18.0f)
                    close()
                    moveTo(9.00021f, 10.0001f)
                    lineTo(9.00021f, 17.0001f)
                    lineTo(11.0002f, 17.0001f)
                    lineTo(11.0002f, 10.0001f)
                    lineTo(9.00021f, 10.0001f)
                    close()
                    moveTo(13.0002f, 17.0001f)
                    lineTo(13.0002f, 10.0001f)
                    lineTo(15.0002f, 10.0001f)
                    lineTo(15.0002f, 17.0001f)
                    lineTo(13.0002f, 17.0001f)
                    close()
                }
            }.build().also {
                _trash = it
            }
    }


private var _trash: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TrashIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Trash.imageVector,
            contentDescription = null,
    )
}
