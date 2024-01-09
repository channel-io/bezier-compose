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

val BezierIcon.ChatBubbleAlt: ImageVector
    get() {
        return _chatBubbleAlt ?: ImageVector.Builder(
                name = "ChatBubbleAlt",
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
                moveTo(12.0f, 3.0f)
                curveTo(6.3689f, 3.0f, 1.5f, 6.8753f, 1.5f, 12.0f)
                curveTo(1.5f, 14.8483f, 3.0311f, 17.3352f, 5.3352f, 18.9584f)
                curveTo(5.0952f, 19.592f, 4.7899f, 20.1768f, 4.5203f, 20.6348f)
                curveTo(4.2088f, 21.1639f, 4.254f, 21.7844f, 4.5536f, 22.2407f)
                curveTo(4.8646f, 22.7145f, 5.4626f, 23.017f, 6.1243f, 22.8496f)
                curveTo(7.1768f, 22.5834f, 8.7919f, 22.0248f, 10.2749f, 20.8793f)
                curveTo(10.8368f, 20.9588f, 11.4131f, 21.0f, 12.0f, 21.0f)
                curveTo(17.6311f, 21.0f, 22.5f, 17.1247f, 22.5f, 12.0f)
                curveTo(22.5f, 6.8753f, 17.6311f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(3.5f, 12.0f)
                curveTo(3.5f, 8.2881f, 7.1377f, 5.0f, 12.0f, 5.0f)
                curveTo(16.8623f, 5.0f, 20.5f, 8.2881f, 20.5f, 12.0f)
                curveTo(20.5f, 15.7118f, 16.8623f, 19.0f, 12.0f, 19.0f)
                curveTo(11.3709f, 19.0f, 10.7588f, 18.9436f, 10.1704f, 18.837f)
                lineTo(9.7031f, 18.7523f)
                lineTo(9.3422f, 19.0609f)
                curveTo(8.5352f, 19.751f, 7.6379f, 20.2159f, 6.8396f, 20.5258f)
                curveTo(7.0843f, 20.0074f, 7.3186f, 19.4215f, 7.4887f, 18.804f)
                lineTo(7.6912f, 18.0688f)
                lineTo(7.0359f, 17.679f)
                curveTo(4.8434f, 16.3746f, 3.5f, 14.2833f, 3.5f, 12.0f)
                close()
            }
        }.build().also {
            _chatBubbleAlt = it
        }
    }

private var _chatBubbleAlt: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChatBubbleAltIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.ChatBubbleAlt,
            contentDescription = null,
    )
}
