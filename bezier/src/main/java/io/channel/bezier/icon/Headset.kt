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

val BezierIcons.Headset: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_headset
        override val imageVector: ImageVector
            get() = _headset ?: ImageVector.Builder(
                    name = "Headset",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(17.657f, 6.343f)
                    arcTo(8.0f, 8.0f, 315.0014762615697f, isMoreThanHalf = false, isPositiveArc = false, 6.343f, 6.343f)
                    curveTo(4.818f, 7.87f, 4.0f, 10.246f, 4.0f, 12.707f)
                    curveTo(4.0f, 13.264000000000001f, 4.042f, 13.817f, 4.125f, 14.357000000000001f)
                    arcTo(3.0f, 3.0f, 239.7703348386156f, isMoreThanHalf = false, isPositiveArc = true, 7.757f, 14.828000000000001f)
                    lineTo(9.172f, 16.243000000000002f)
                    arcTo(3.0f, 3.0f, 315.47330710524955f, isMoreThanHalf = false, isPositiveArc = true, 4.929f, 20.485000000000003f)
                    curveTo(2.939f, 18.496f, 2.0f, 15.56f, 2.0f, 12.707f)
                    curveTo(2.0f, 9.854000000000001f, 2.94f, 6.918000000000001f, 4.929f, 4.929000000000001f)
                    curveTo(8.834f, 1.0240000000000014f, 15.166f, 1.0240000000000014f, 19.070999999999998f, 4.929000000000001f)
                    curveTo(21.061f, 6.919f, 22.0f, 9.855f, 22.0f, 12.707f)
                    curveTo(22.0f, 15.559000000000001f, 21.06f, 18.497f, 19.071f, 20.485f)
                    arcTo(3.0f, 3.0f, 45.45980191273386f, isMoreThanHalf = false, isPositiveArc = true, 14.828000000000001f, 16.243f)
                    lineTo(16.243000000000002f, 14.828f)
                    arcTo(3.0f, 3.0f, 224.99961652534338f, isMoreThanHalf = false, isPositiveArc = true, 19.876f, 14.357999999999999f)
                    curveTo(19.958000000000002f, 13.817999999999998f, 20.0f, 13.264f, 20.0f, 12.707999999999998f)
                    curveTo(20.0f, 10.244999999999997f, 19.182f, 7.8679999999999986f, 17.657f, 6.342999999999998f)
                }
            }.build().also {
                _headset = it
            }
    }


private var _headset: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun HeadsetIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Headset.imageVector,
            contentDescription = null,
    )
}
