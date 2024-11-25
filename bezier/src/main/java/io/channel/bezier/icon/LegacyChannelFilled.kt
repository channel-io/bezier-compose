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

val BezierIcons.LegacyChannelFilled: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_legacy_channel_filled
        override val imageVector: ImageVector
            get() = _legacyChannelFilled ?: ImageVector.Builder(
                    name = "LegacyChannelFilled",
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
                    moveTo(21.997f, 12.006f)
                    curveTo(21.997f, 13.376000000000001f, 21.721f, 14.68f, 21.221f, 15.870000000000001f)
                    lineTo(21.221f, 15.873000000000001f)
                    arcTo(3.73f, 3.73f, 202.53571213903382f, isMoreThanHalf = false, isPositiveArc = false, 21.049f, 18.213f)
                    lineTo(21.592f, 20.387f)
                    arcTo(0.998f, 0.998f, 345.9047468611427f, isMoreThanHalf = false, isPositiveArc = true, 20.381f, 21.598f)
                    lineTo(18.207f, 21.055f)
                    arcTo(3.73f, 3.73f, 284.1278632827351f, isMoreThanHalf = false, isPositiveArc = false, 15.867f, 21.227f)
                    curveTo(14.677000000000001f, 21.727f, 13.374f, 22.003f, 12.003f, 22.003f)
                    curveTo(6.5f, 22.003f, 2.0f, 17.51f, 2.0f, 12.006f)
                    curveTo(1.997f, 6.48f, 6.477f, 2.003f, 12.003f, 2.003f)
                    curveTo(17.508f, 2.003f, 21.997f, 6.502f, 21.997f, 12.006f)
                    moveTo(17.863f, 14.055f)
                    arcTo(6.66f, 6.66f, 28.276267997628807f, isMoreThanHalf = false, isPositiveArc = true, 11.992999999999999f, 17.56f)
                    lineTo(11.987999999999998f, 17.56f)
                    arcTo(6.67f, 6.67f, 90.01081015027373f, isMoreThanHalf = false, isPositiveArc = true, 6.117999999999998f, 14.055f)
                    arcTo(0.5f, 0.5f, 152.21067007295218f, isMoreThanHalf = false, isPositiveArc = true, 6.304999999999998f, 13.392f)
                    lineTo(8.095999999999998f, 12.318999999999999f)
                    arcTo(0.506f, 0.506f, 239.7078053939179f, isMoreThanHalf = false, isPositiveArc = true, 8.803999999999998f, 12.53f)
                    arcTo(3.58f, 3.58f, 152.88377889938914f, isMoreThanHalf = false, isPositiveArc = false, 15.177f, 12.53f)
                    arcTo(0.507f, 0.507f, 206.6378898499879f, isMoreThanHalf = false, isPositiveArc = true, 15.885f, 12.318999999999999f)
                    lineTo(17.676f, 13.392f)
                    curveTo(17.906f, 13.53f, 17.988999999999997f, 13.822f, 17.863f, 14.055f)
                }
            }.build().also {
                _legacyChannelFilled = it
            }
    }


private var _legacyChannelFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun LegacyChannelFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.LegacyChannelFilled.imageVector,
            contentDescription = null,
    )
}
