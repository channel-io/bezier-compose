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

val BezierIcons.ChatLightning: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_chat_lightning
        override val imageVector: ImageVector
            get() = _chatLightning ?: ImageVector.Builder(
                    name = "ChatLightning",
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
                    moveTo(18.868f, 17.764f)
                    curveTo(18.648999999999997f, 17.107f, 18.718f, 16.391f, 19.061f, 15.747f)
                    curveTo(19.944f, 14.094f, 20.212f, 12.229f, 19.834f, 10.354f)
                    arcTo(7.945f, 7.945f, 348.42745829569816f, isMoreThanHalf = false, isPositiveArc = false, 13.344999999999999f, 4.108999999999999f)
                    arcTo(8.4f, 8.4f, 279.2402500039708f, isMoreThanHalf = false, isPositiveArc = false, 12.0f, 4.0f)
                    arcTo(7.93f, 7.93f, 270.19711608050943f, isMoreThanHalf = false, isPositiveArc = false, 6.35f, 6.338f)
                    curveTo(4.507999999999999f, 8.175f, 3.691f, 10.722999999999999f, 4.106999999999999f, 13.328f)
                    curveTo(4.648f, 16.713f, 7.409999999999999f, 19.422f, 10.822f, 19.915f)
                    arcTo(7.97f, 7.97f, 98.43293407719125f, isMoreThanHalf = false, isPositiveArc = false, 15.748f, 19.06f)
                    curveTo(16.392f, 18.717f, 17.105999999999998f, 18.648f, 17.764f, 18.866999999999997f)
                    lineTo(19.419f, 19.418999999999997f)
                    close()
                    moveTo(20.825f, 16.689f)
                    curveTo(20.778f, 16.779f, 20.707f, 16.955f, 20.765f, 17.132f)
                    lineTo(21.633f, 19.735000000000003f)
                    arcTo(1.49f, 1.49f, 341.3161450609965f, isMoreThanHalf = false, isPositiveArc = true, 21.271f, 21.270000000000003f)
                    arcTo(1.5f, 1.5f, 44.97428822193103f, isMoreThanHalf = false, isPositiveArc = true, 19.736f, 21.633000000000003f)
                    lineTo(17.131f, 20.765000000000004f)
                    curveTo(16.957f, 20.707000000000004f, 16.781f, 20.777000000000005f, 16.691f, 20.825000000000003f)
                    arcTo(9.9f, 9.9f, 61.80108582664976f, isMoreThanHalf = false, isPositiveArc = true, 12.001f, 22.0f)
                    quadTo(11.270999999999999f, 22.0f, 10.536f, 21.894f)
                    curveTo(6.266f, 21.278f, 2.8099999999999996f, 17.884f, 2.1319999999999997f, 13.643999999999998f)
                    curveTo(1.6129999999999995f, 10.396999999999998f, 2.6359999999999997f, 7.217999999999998f, 4.936f, 4.921999999999999f)
                    curveTo(7.2379999999999995f, 2.6249999999999987f, 10.421f, 1.6119999999999988f, 13.664f, 2.134999999999999f)
                    curveTo(17.718f, 2.790999999999999f, 20.985f, 5.934999999999999f, 21.795f, 9.959999999999999f)
                    curveTo(22.265f, 12.294999999999998f, 21.930000000000003f, 14.622f, 20.825000000000003f, 16.689999999999998f)
                    moveTo(13.427000000000003f, 10.547999999999998f)
                    lineTo(15.969000000000003f, 11.135999999999997f)
                    arcTo(0.295f, 0.295f, 283.2052101538468f, isMoreThanHalf = false, isPositiveArc = true, 16.111000000000004f, 11.630999999999997f)
                    lineTo(10.035000000000004f, 17.723999999999997f)
                    curveTo(9.820000000000004f, 17.939999999999998f, 9.459000000000003f, 17.725999999999996f, 9.545000000000003f, 17.432999999999996f)
                    lineTo(10.770000000000003f, 13.264999999999997f)
                    lineTo(8.228000000000003f, 12.676999999999998f)
                    arcTo(0.295f, 0.295f, 103.20521015384708f, isMoreThanHalf = false, isPositiveArc = true, 8.086000000000004f, 12.181999999999999f)
                    lineTo(14.162000000000003f, 6.088999999999999f)
                    curveTo(14.377000000000002f, 5.872999999999998f, 14.739000000000003f, 6.086999999999999f, 14.653000000000002f, 6.379999999999999f)
                    close()
                }
            }.build().also {
                _chatLightning = it
            }
    }


private var _chatLightning: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChatLightningIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ChatLightning.imageVector,
            contentDescription = null,
    )
}
