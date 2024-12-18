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

val BezierIcons.SmsFilled: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_sms_filled
        override val imageVector: ImageVector
            get() = _smsFilled ?: ImageVector.Builder(
                    name = "SmsFilled",
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
                    moveTo(21.5f, 12.0f)
                    curveTo(21.5f, 16.418f, 17.247f, 20.0f, 12.0f, 20.0f)
                    quadTo(10.965f, 19.998f, 9.992f, 19.821f)
                    curveTo(8.576f, 21.032f, 6.939000000000001f, 21.612000000000002f, 5.8790000000000004f, 21.881f)
                    curveTo(5.457000000000001f, 21.987000000000002f, 5.1610000000000005f, 21.517f, 5.382000000000001f, 21.142f)
                    curveTo(5.7700000000000005f, 20.483f, 6.247000000000001f, 19.547f, 6.525f, 18.538f)
                    curveTo(4.09f, 17.09f, 2.5f, 14.701f, 2.5f, 12.0f)
                    curveTo(2.5f, 7.582f, 6.753f, 4.0f, 12.0f, 4.0f)
                    curveTo(17.247f, 4.0f, 21.5f, 7.582f, 21.5f, 12.0f)
                    moveTo(6.0f, 12.0f)
                    curveTo(6.0f, 12.825f, 6.676f, 13.5f, 7.5f, 13.5f)
                    curveTo(8.326f, 13.5f, 9.001f, 12.825f, 9.001f, 12.0f)
                    curveTo(9.001f, 11.175f, 8.325999999999999f, 10.5f, 7.5009999999999994f, 10.5f)
                    curveTo(6.676f, 10.5f, 6.0f, 11.175f, 6.0f, 12.0f)
                    moveTo(10.5f, 12.0f)
                    curveTo(10.5f, 12.825f, 11.176f, 13.5f, 12.0f, 13.5f)
                    curveTo(12.826f, 13.5f, 13.501f, 12.825f, 13.501f, 12.0f)
                    curveTo(13.501f, 11.175f, 12.825999999999999f, 10.5f, 12.001f, 10.5f)
                    curveTo(11.176f, 10.5f, 10.5f, 11.175f, 10.5f, 12.0f)
                    moveTo(16.5f, 13.5f)
                    curveTo(15.676f, 13.5f, 15.0f, 12.825f, 15.0f, 12.0f)
                    curveTo(15.0f, 11.175f, 15.676f, 10.5f, 16.5f, 10.5f)
                    curveTo(17.326f, 10.5f, 18.001f, 11.175f, 18.001f, 12.0f)
                    curveTo(18.001f, 12.825f, 17.326f, 13.5f, 16.501f, 13.5f)
                }
            }.build().also {
                _smsFilled = it
            }
    }


private var _smsFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun SmsFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.SmsFilled.imageVector,
            contentDescription = null,
    )
}
