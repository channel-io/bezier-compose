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

val BezierIcons.VideocamOffFilled: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_videocam_off_filled
        override val imageVector: ImageVector
            get() = _videocamOffFilled ?: ImageVector.Builder(
                    name = "VideocamOffFilled",
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
                    moveTo(15.998f, 8.0f)
                    lineTo(15.998f, 13.876999999999999f)
                    lineTo(22.253f, 20.131999999999998f)
                    lineTo(20.839f, 21.546f)
                    lineTo(2.454f, 3.161f)
                    lineTo(3.8680000000000003f, 1.747f)
                    lineTo(8.121f, 6.0f)
                    lineTo(13.998000000000001f, 6.0f)
                    arcTo(2.0f, 2.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 15.998000000000001f, 8.0f)
                    moveTo(2.002f, 8.0f)
                    lineTo(2.002f, 16.0f)
                    arcTo(2.0f, 2.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 4.002f, 18.0f)
                    lineTo(13.998000000000001f, 18.0f)
                    curveTo(14.520000000000001f, 18.0f, 14.991000000000001f, 17.795f, 15.348f, 17.468f)
                    lineTo(3.89f, 6.011f)
                    arcTo(1.994f, 1.994f, 266.9527599307834f, isMoreThanHalf = false, isPositiveArc = false, 2.0020000000000002f, 8.001f)
                    moveTo(21.188f, 17.351f)
                    arcTo(0.5f, 0.5f, 128.60890198710987f, isMoreThanHalf = false, isPositiveArc = false, 22.0f, 16.961f)
                    lineTo(22.0f, 7.04f)
                    arcTo(0.5f, 0.5f, 359.9184376285513f, isMoreThanHalf = false, isPositiveArc = false, 21.188f, 6.65f)
                    lineTo(17.188f, 9.850000000000001f)
                    arcTo(0.5f, 0.5f, 231.24437865893233f, isMoreThanHalf = false, isPositiveArc = false, 17.000999999999998f, 10.240000000000002f)
                    lineTo(17.000999999999998f, 13.760000000000002f)
                    arcTo(0.5f, 0.5f, 180.01013737566106f, isMoreThanHalf = false, isPositiveArc = false, 17.188f, 14.150000000000002f)
                    close()
                }
            }.build().also {
                _videocamOffFilled = it
            }
    }


private var _videocamOffFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun VideocamOffFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.VideocamOffFilled.imageVector,
            contentDescription = null,
    )
}
