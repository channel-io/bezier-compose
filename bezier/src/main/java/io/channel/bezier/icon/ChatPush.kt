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

val BezierIcons.ChatPush: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_chat_push
        override val imageVector: ImageVector
            get() = _chatPush ?: ImageVector.Builder(
                    name = "ChatPush",
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
                    moveTo(18.5f, 9.0f)
                    arcTo(3.5f, 3.5f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 18.5f, 2.0f)
                    arcTo(3.5f, 3.5f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 9.0f)
                    moveTo(19.06f, 15.748000000000001f)
                    arcTo(7.95f, 7.95f, 28.17264907504307f, isMoreThanHalf = false, isPositiveArc = false, 19.913999999999998f, 10.816f)
                    arcTo(5.5f, 5.5f, 75.07815864822543f, isMoreThanHalf = false, isPositiveArc = false, 21.784999999999997f, 9.911000000000001f)
                    lineTo(21.794999999999998f, 9.961000000000002f)
                    curveTo(22.264999999999997f, 12.294000000000002f, 21.93f, 14.621000000000002f, 20.825f, 16.689f)
                    curveTo(20.777f, 16.779f, 20.706f, 16.956f, 20.765f, 17.132f)
                    lineTo(21.633f, 19.735000000000003f)
                    curveTo(21.813f, 20.278000000000002f, 21.675f, 20.866000000000003f, 21.27f, 21.270000000000003f)
                    arcTo(1.5f, 1.5f, 44.97428822193103f, isMoreThanHalf = false, isPositiveArc = true, 19.735f, 21.633000000000003f)
                    lineTo(17.13f, 20.765000000000004f)
                    curveTo(16.956f, 20.706000000000003f, 16.779999999999998f, 20.776000000000003f, 16.689999999999998f, 20.825000000000003f)
                    arcTo(9.9f, 9.9f, 61.80108582664976f, isMoreThanHalf = false, isPositiveArc = true, 12.0f, 22.0f)
                    quadTo(11.27f, 22.0f, 10.536f, 21.894f)
                    curveTo(6.266f, 21.278f, 2.8099999999999996f, 17.884f, 2.1319999999999997f, 13.643999999999998f)
                    curveTo(1.6129999999999995f, 10.396999999999998f, 2.635f, 7.2189999999999985f, 4.936f, 4.921999999999999f)
                    curveTo(7.237f, 2.624999999999999f, 10.416f, 1.6119999999999988f, 13.664f, 2.134999999999999f)
                    quadTo(13.879f, 2.169999999999999f, 14.089f, 2.213999999999999f)
                    arcTo(5.5f, 5.5f, 216.71136717727038f, isMoreThanHalf = false, isPositiveArc = false, 13.184000000000001f, 4.084f)
                    arcTo(8.4f, 8.4f, 278.1096175315442f, isMoreThanHalf = false, isPositiveArc = false, 11.998f, 4.0f)
                    arcTo(7.93f, 7.93f, 270.18271309498596f, isMoreThanHalf = false, isPositiveArc = false, 6.35f, 6.338f)
                    curveTo(4.51f, 8.175f, 3.691f, 10.722999999999999f, 4.106999999999999f, 13.328f)
                    curveTo(4.648999999999999f, 16.713f, 7.409999999999999f, 19.422f, 10.823f, 19.915f)
                    arcTo(7.98f, 7.98f, 98.41986416713209f, isMoreThanHalf = false, isPositiveArc = false, 15.749f, 19.061f)
                    curveTo(16.391000000000002f, 18.717f, 17.106f, 18.648f, 17.764f, 18.867f)
                    lineTo(19.419999999999998f, 19.419f)
                    lineTo(18.868f, 17.764f)
                    curveTo(18.65f, 17.108f, 18.718f, 16.392f, 19.061f, 15.748f)
                }
            }.build().also {
                _chatPush = it
            }
    }


private var _chatPush: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChatPushIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ChatPush.imageVector,
            contentDescription = null,
    )
}
