@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

import androidx.annotation.DrawableRes
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
import io.channel.bezier.compose.R

val BezierIcons.ChatBubbleAltPushFilled: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_chat_bubble_alt_push_filled
        override val imageVector: ImageVector
            get() = _chatBubbleAltPushFilled ?: ImageVector.Builder(
                    name = "ChatBubbleAltPushFilled",
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
                    moveTo(18.5f, 10.0f)
                    arcTo(3.5f, 3.5f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 18.5f, 3.0f)
                    arcTo(3.5f, 3.5f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 10.0f)
                    moveTo(12.0f, 4.0f)
                    quadTo(12.791f, 4.0f, 13.547f, 4.106f)
                    arcTo(5.5f, 5.5f, 205.85325746313455f, isMoreThanHalf = false, isPositiveArc = false, 21.447000000000003f, 11.146f)
                    quadTo(21.500000000000004f, 11.566f, 21.500000000000004f, 12.0f)
                    curveTo(21.500000000000004f, 16.418f, 17.247000000000003f, 20.0f, 12.000000000000004f, 20.0f)
                    quadTo(10.965000000000003f, 19.998f, 9.992000000000004f, 19.821f)
                    curveTo(8.576000000000004f, 21.032f, 6.9390000000000045f, 21.612000000000002f, 5.879000000000004f, 21.881f)
                    curveTo(5.457000000000004f, 21.987000000000002f, 5.161000000000004f, 21.517f, 5.382000000000004f, 21.142f)
                    curveTo(5.770000000000004f, 20.483f, 6.247000000000004f, 19.547f, 6.525000000000004f, 18.538f)
                    curveTo(4.09f, 17.09f, 2.5f, 14.701f, 2.5f, 12.0f)
                    curveTo(2.5f, 7.582f, 6.753f, 4.0f, 12.0f, 4.0f)
                }
            }.build().also {
                _chatBubbleAltPushFilled = it
            }
    }


private var _chatBubbleAltPushFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChatBubbleAltPushFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ChatBubbleAltPushFilled.imageVector,
            contentDescription = null,
    )
}
