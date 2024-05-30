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

val BezierIcons.CenterFocus: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _centerFocus ?: ImageVector.Builder(
                    name = "CenterFocus",
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
                    moveTo(21.0002f, 10.0001f)
                    lineTo(19.0002f, 10.0001f)
                    lineTo(19.0002f, 5.00009f)
                    lineTo(14.0002f, 5.00009f)
                    lineTo(14.0002f, 3.00009f)
                    lineTo(19.5002f, 3.00009f)
                    curveTo(20.3272f, 3.00009f, 21.0002f, 3.67309f, 21.0002f, 4.50009f)
                    lineTo(21.0002f, 10.0001f)
                    close()
                    moveTo(19.5002f, 21.0001f)
                    lineTo(14.0002f, 21.0001f)
                    lineTo(14.0002f, 19.0001f)
                    lineTo(19.0002f, 19.0001f)
                    lineTo(19.0002f, 14.0001f)
                    lineTo(21.0002f, 14.0001f)
                    lineTo(21.0002f, 19.5001f)
                    curveTo(21.0002f, 20.3271f, 20.3272f, 21.0001f, 19.5002f, 21.0001f)
                    close()
                    moveTo(4.50018f, 21.0001f)
                    lineTo(10.0002f, 21.0001f)
                    lineTo(10.0002f, 19.0001f)
                    lineTo(5.00018f, 19.0001f)
                    lineTo(5.00018f, 14.0001f)
                    lineTo(3.00018f, 14.0001f)
                    lineTo(3.00018f, 19.5001f)
                    curveTo(3.00018f, 20.3271f, 3.67318f, 21.0001f, 4.50018f, 21.0001f)
                    close()
                    moveTo(5.00018f, 10.0001f)
                    lineTo(3.00018f, 10.0001f)
                    lineTo(3.00018f, 4.50009f)
                    curveTo(3.00018f, 3.67309f, 3.67318f, 3.00009f, 4.50018f, 3.00009f)
                    lineTo(10.0002f, 3.00009f)
                    lineTo(10.0002f, 5.00009f)
                    lineTo(5.00018f, 5.00009f)
                    lineTo(5.00018f, 10.0001f)
                    close()
                    moveTo(12.0f, 16.0f)
                    curveTo(14.2091f, 16.0f, 16.0f, 14.2091f, 16.0f, 12.0f)
                    curveTo(16.0f, 9.79086f, 14.2091f, 8.0f, 12.0f, 8.0f)
                    curveTo(9.79086f, 8.0f, 8.0f, 9.79086f, 8.0f, 12.0f)
                    curveTo(8.0f, 14.2091f, 9.79086f, 16.0f, 12.0f, 16.0f)
                    close()
                }
            }.build().also {
                _centerFocus = it
            }
    }


private var _centerFocus: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CenterFocusIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.CenterFocus.imageVector,
            contentDescription = null,
    )
}