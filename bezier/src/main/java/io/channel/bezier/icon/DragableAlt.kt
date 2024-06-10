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

val BezierIcons.DragableAlt: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _dragableAlt ?: ImageVector.Builder(
                    name = "DragableAlt",
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
                    moveTo(17.0001f, 8.24994f)
                    curveTo(17.0001f, 9.49194f, 18.0072f, 10.4999f, 19.2501f, 10.4999f)
                    curveTo(20.493f, 10.4999f, 21.5001f, 9.49194f, 21.5001f, 8.24994f)
                    curveTo(21.5001f, 7.00704f, 20.493f, 5.99994f, 19.2501f, 5.99994f)
                    curveTo(18.0072f, 5.99994f, 17.0001f, 7.00704f, 17.0001f, 8.24994f)
                    close()
                    moveTo(17.0001f, 15.7501f)
                    curveTo(17.0001f, 16.9921f, 18.0072f, 18.0001f, 19.2501f, 18.0001f)
                    curveTo(20.493f, 18.0001f, 21.5001f, 16.9921f, 21.5001f, 15.7501f)
                    curveTo(21.5001f, 14.5072f, 20.493f, 13.5001f, 19.2501f, 13.5001f)
                    curveTo(18.0072f, 13.5001f, 17.0001f, 14.5072f, 17.0001f, 15.7501f)
                    close()
                    moveTo(12.0001f, 10.4999f)
                    curveTo(10.7572f, 10.4999f, 9.75015f, 9.49194f, 9.75015f, 8.24994f)
                    curveTo(9.75015f, 7.00704f, 10.7572f, 5.99994f, 12.0001f, 5.99994f)
                    curveTo(13.243f, 5.99994f, 14.2501f, 7.00704f, 14.2501f, 8.24994f)
                    curveTo(14.2501f, 9.49194f, 13.243f, 10.4999f, 12.0001f, 10.4999f)
                    close()
                    moveTo(9.75014f, 15.7501f)
                    curveTo(9.75014f, 16.9921f, 10.7572f, 18.0001f, 12.0001f, 18.0001f)
                    curveTo(13.243f, 18.0001f, 14.2501f, 16.9921f, 14.2501f, 15.7501f)
                    curveTo(14.2501f, 14.5072f, 13.243f, 13.5001f, 12.0001f, 13.5001f)
                    curveTo(10.7572f, 13.5001f, 9.75014f, 14.5072f, 9.75014f, 15.7501f)
                    close()
                    moveTo(4.75005f, 10.4999f)
                    curveTo(3.50715f, 10.4999f, 2.50005f, 9.49194f, 2.50005f, 8.24994f)
                    curveTo(2.50005f, 7.00704f, 3.50715f, 5.99994f, 4.75005f, 5.99994f)
                    curveTo(5.99295f, 5.99994f, 7.00005f, 7.00704f, 7.00005f, 8.24994f)
                    curveTo(7.00005f, 9.49194f, 5.99295f, 10.4999f, 4.75005f, 10.4999f)
                    close()
                    moveTo(2.50005f, 15.7501f)
                    curveTo(2.50005f, 16.9921f, 3.50715f, 18.0001f, 4.75005f, 18.0001f)
                    curveTo(5.99295f, 18.0001f, 7.00005f, 16.9921f, 7.00005f, 15.7501f)
                    curveTo(7.00005f, 14.5072f, 5.99295f, 13.5001f, 4.75005f, 13.5001f)
                    curveTo(3.50715f, 13.5001f, 2.50005f, 14.5072f, 2.50005f, 15.7501f)
                    close()
                }
            }.build().also {
                _dragableAlt = it
            }
    }


private var _dragableAlt: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun DragableAltIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.DragableAlt.imageVector,
            contentDescription = null,
    )
}
