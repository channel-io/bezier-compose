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

val BezierIcons.ChatSuggestion: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _chatSuggestion ?: ImageVector.Builder(
                    name = "ChatSuggestion",
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
                    moveTo(1.5f, 12.0f)
                    curveTo(1.5f, 6.875f, 6.369f, 3.0f, 12.0f, 3.0f)
                    curveTo(17.631f, 3.0f, 22.5f, 6.875f, 22.5f, 12.0f)
                    curveTo(22.5f, 17.125f, 17.631f, 21.0f, 12.0f, 21.0f)
                    quadTo(11.119f, 21.0f, 10.275f, 20.88f)
                    curveTo(8.792f, 22.025f, 7.1770000000000005f, 22.583f, 6.125f, 22.849999999999998f)
                    arcTo(1.44f, 1.44f, 75.40601595157139f, isMoreThanHalf = false, isPositiveArc = true, 4.554f, 22.24f)
                    arcTo(1.52f, 1.52f, 146.91068856921098f, isMoreThanHalf = false, isPositiveArc = true, 4.5200000000000005f, 20.634999999999998f)
                    curveTo(4.790000000000001f, 20.177f, 5.095000000000001f, 19.592f, 5.335000000000001f, 18.958f)
                    curveTo(3.031f, 17.335f, 1.5f, 14.848f, 1.5f, 12.0f)
                    moveTo(12.0f, 5.0f)
                    curveTo(7.138f, 5.0f, 3.5f, 8.288f, 3.5f, 12.0f)
                    curveTo(3.5f, 14.283f, 4.843f, 16.375f, 7.036f, 17.679000000000002f)
                    lineTo(7.691f, 18.069000000000003f)
                    lineTo(7.489f, 18.804000000000002f)
                    arcTo(11.0f, 11.0f, 15.880754073958554f, isMoreThanHalf = false, isPositiveArc = true, 6.8389999999999995f, 20.526000000000003f)
                    curveTo(7.638f, 20.216000000000005f, 8.535f, 19.751000000000005f, 9.341999999999999f, 19.061000000000003f)
                    lineTo(9.703f, 18.752000000000002f)
                    lineTo(10.17f, 18.837000000000003f)
                    quadTo(11.054f, 18.999000000000002f, 12.0f, 19.000000000000004f)
                    curveTo(16.862000000000002f, 19.000000000000004f, 20.5f, 15.712000000000003f, 20.5f, 12.000000000000004f)
                    curveTo(20.5f, 8.288000000000004f, 16.862f, 5.0f, 12.0f, 5.0f)
                    moveTo(10.996f, 14.58f)
                    lineTo(11.749f, 16.334f)
                    curveTo(11.843f, 16.555f, 12.157f, 16.555f, 12.251000000000001f, 16.334f)
                    lineTo(13.004000000000001f, 14.579f)
                    arcTo(3.0f, 3.0f, 203.20844000379213f, isMoreThanHalf = false, isPositiveArc = true, 14.579f, 13.004000000000001f)
                    lineTo(16.334f, 12.251000000000001f)
                    arcTo(0.273f, 0.273f, 66.84055079622206f, isMoreThanHalf = false, isPositiveArc = false, 16.334f, 11.749f)
                    lineTo(14.579f, 10.996f)
                    arcTo(3.0f, 3.0f, 113.20844000379216f, isMoreThanHalf = false, isPositiveArc = true, 13.004000000000001f, 9.421000000000001f)
                    lineTo(12.251000000000001f, 7.666000000000001f)
                    arcTo(0.273f, 0.273f, 336.8405507962221f, isMoreThanHalf = false, isPositiveArc = false, 11.749f, 7.666000000000001f)
                    lineTo(10.996f, 9.421000000000001f)
                    arcTo(3.0f, 3.0f, 23.182983274355266f, isMoreThanHalf = false, isPositiveArc = true, 9.421000000000001f, 10.997000000000002f)
                    lineTo(7.666000000000001f, 11.749000000000002f)
                    arcTo(0.273f, 0.273f, 246.84055079622206f, isMoreThanHalf = false, isPositiveArc = false, 7.666000000000001f, 12.251000000000003f)
                    lineTo(9.421000000000001f, 13.004000000000003f)
                    arcTo(3.0f, 3.0f, 293.18298327435525f, isMoreThanHalf = false, isPositiveArc = true, 10.997000000000002f, 14.579000000000002f)
                }
            }.build().also {
                _chatSuggestion = it
            }
    }


private var _chatSuggestion: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChatSuggestionIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ChatSuggestion.imageVector,
            contentDescription = null,
    )
}
