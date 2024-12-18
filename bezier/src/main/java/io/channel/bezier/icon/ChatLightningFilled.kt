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

val BezierIcons.ChatLightningFilled: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_chat_lightning_filled
        override val imageVector: ImageVector
            get() = _chatLightningFilled ?: ImageVector.Builder(
                    name = "ChatLightningFilled",
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
                    moveTo(20.723f, 18.19f)
                    curveTo(20.557f, 17.694000000000003f, 20.576f, 17.144000000000002f, 20.823f, 16.683f)
                    curveTo(21.861f, 14.734f, 22.281f, 12.408999999999999f, 21.787f, 9.954f)
                    curveTo(20.982f, 5.954000000000001f, 17.692999999999998f, 2.7890000000000006f, 13.664f, 2.1370000000000005f)
                    arcTo(10.013f, 10.013f, 279.5437585211548f, isMoreThanHalf = false, isPositiveArc = false, 2.13f, 13.675f)
                    curveTo(2.783f, 17.703f, 5.947f, 20.991f, 9.948f, 21.796f)
                    curveTo(12.404f, 22.29f, 14.73f, 21.868f, 16.679000000000002f, 20.829f)
                    curveTo(17.139000000000003f, 20.584f, 17.682000000000002f, 20.565f, 18.175f, 20.729f)
                    lineTo(20.098f, 21.369999999999997f)
                    arcTo(1.0f, 1.0f, 108.37508707447735f, isMoreThanHalf = false, isPositiveArc = false, 21.362f, 20.104999999999997f)
                    close()
                    moveTo(15.969f, 11.135f)
                    lineTo(13.427f, 10.547f)
                    lineTo(14.653f, 6.379f)
                    curveTo(14.739f, 6.085999999999999f, 14.377f, 5.872f, 14.163f, 6.087999999999999f)
                    lineTo(8.086f, 12.181f)
                    arcTo(0.295f, 0.295f, 224.78173449078037f, isMoreThanHalf = false, isPositiveArc = false, 8.228f, 12.675999999999998f)
                    lineTo(10.77f, 13.263999999999998f)
                    lineTo(9.545f, 17.432f)
                    curveTo(9.459f, 17.724999999999998f, 9.82f, 17.939f, 10.035f, 17.723f)
                    lineTo(16.111f, 11.629999999999999f)
                    arcTo(0.295f, 0.295f, 44.78173449078037f, isMoreThanHalf = false, isPositiveArc = false, 15.969000000000001f, 11.135f)
                }
            }.build().also {
                _chatLightningFilled = it
            }
    }


private var _chatLightningFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChatLightningFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ChatLightningFilled.imageVector,
            contentDescription = null,
    )
}
