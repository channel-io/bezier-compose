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

val BezierIcons.ChatBubbleAltAdd: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_chat_bubble_alt_add
        override val imageVector: ImageVector
            get() = _chatBubbleAltAdd ?: ImageVector.Builder(
                    name = "ChatBubbleAltAdd",
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
                    curveTo(6.369f, 3.0f, 1.5f, 6.875f, 1.5f, 12.0f)
                    curveTo(1.5f, 14.847999999999999f, 3.0309999999999997f, 17.335f, 5.335f, 18.958f)
                    curveTo(5.095f, 19.592f, 4.79f, 20.177f, 4.52f, 20.634999999999998f)
                    curveTo(4.209f, 21.163999999999998f, 4.254f, 21.784999999999997f, 4.553999999999999f, 22.241f)
                    arcTo(1.44f, 1.44f, 146.98400051664183f, isMoreThanHalf = false, isPositiveArc = false, 6.124f, 22.85f)
                    curveTo(7.177f, 22.583000000000002f, 8.792f, 22.025000000000002f, 10.274000000000001f, 20.880000000000003f)
                    quadTo(11.12f, 21.0f, 12.0f, 21.0f)
                    curveTo(15.09f, 21.0f, 17.951f, 19.833f, 19.904f, 17.932f)
                    arcTo(6.05f, 6.05f, 81.4291562106358f, isMoreThanHalf = false, isPositiveArc = true, 17.004f, 17.66f)
                    curveTo(15.62f, 18.496f, 13.903f, 19.0f, 12.0f, 19.0f)
                    quadTo(11.054f, 18.999f, 10.17f, 18.837f)
                    lineTo(9.703f, 18.752f)
                    lineTo(9.343f, 19.061f)
                    curveTo(8.535f, 19.751f, 7.638f, 20.216f, 6.84f, 20.526f)
                    arcTo(11.0f, 11.0f, 25.44903457214267f, isMoreThanHalf = false, isPositiveArc = false, 7.489f, 18.804f)
                    lineTo(7.691f, 18.069f)
                    lineTo(7.036f, 17.679f)
                    curveTo(4.843f, 16.375f, 3.5f, 14.283f, 3.5f, 12.0f)
                    curveTo(3.5f, 8.288f, 7.138f, 5.0f, 12.0f, 5.0f)
                    curveTo(13.904f, 5.0f, 15.620000000000001f, 5.504f, 17.003f, 6.34f)
                    arcTo(6.0f, 6.0f, 250.59416130327742f, isMoreThanHalf = false, isPositiveArc = true, 19.903f, 6.068f)
                    curveTo(17.952f, 4.168f, 15.09f, 3.0f, 12.0f, 3.0f)
                    moveTo(18.0f, 9.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = true, 20.0f, 9.0f)
                    lineTo(20.0f, 11.0f)
                    lineTo(22.0f, 11.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = true, 22.0f, 13.0f)
                    lineTo(20.0f, 13.0f)
                    lineTo(20.0f, 15.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 18.0f, 15.0f)
                    lineTo(18.0f, 13.0f)
                    lineTo(16.0f, 13.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = true, 16.0f, 11.0f)
                    lineTo(18.0f, 11.0f)
                    close()
                }
            }.build().also {
                _chatBubbleAltAdd = it
            }
    }


private var _chatBubbleAltAdd: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChatBubbleAltAddIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ChatBubbleAltAdd.imageVector,
            contentDescription = null,
    )
}
