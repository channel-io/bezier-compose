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
import io.channel.bezier.BezierIcons

val BezierIcons.ChatBubbleAltFilled: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _chatBubbleAltFilled ?: ImageVector.Builder(
                    name = "ChatBubbleAltFilled",
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
                    moveTo(12.0f, 20.0f)
                    curveTo(17.247f, 20.0f, 21.5f, 16.418f, 21.5f, 12.0f)
                    curveTo(21.5f, 7.582000000000001f, 17.247f, 4.0f, 12.0f, 4.0f)
                    curveTo(6.753f, 4.0f, 2.5f, 7.582f, 2.5f, 12.0f)
                    curveTo(2.5f, 14.701f, 4.09f, 17.09f, 6.525f, 18.538f)
                    curveTo(6.247f, 19.547f, 5.7700000000000005f, 20.483f, 5.382000000000001f, 21.142f)
                    curveTo(5.162000000000001f, 21.517f, 5.457000000000001f, 21.987f, 5.8790000000000004f, 21.88f)
                    curveTo(6.939f, 21.612f, 8.576f, 21.032f, 9.992f, 19.820999999999998f)
                    curveTo(10.639000000000001f, 19.938f, 11.312000000000001f, 19.999999999999996f, 12.0f, 19.999999999999996f)
                }
            }.build().also {
                _chatBubbleAltFilled = it
            }
    }


private var _chatBubbleAltFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChatBubbleAltFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ChatBubbleAltFilled.imageVector,
            contentDescription = null,
    )
}
