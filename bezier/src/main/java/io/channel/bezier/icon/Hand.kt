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

val BezierIcons.Hand: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_hand
        override val imageVector: ImageVector
            get() = _hand ?: ImageVector.Builder(
                    name = "Hand",
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
                    moveTo(18.58f, 16.858f)
                    arcTo(4.98f, 4.98f, 21.658397559148376f, isMoreThanHalf = false, isPositiveArc = true, 13.937f, 20.0f)
                    lineTo(13.158f, 20.0f)
                    arcTo(4.97f, 4.97f, 89.85757151413468f, isMoreThanHalf = false, isPositiveArc = true, 9.625f, 18.538f)
                    lineTo(4.125f, 13.044f)
                    arcTo(0.46f, 0.46f, 134.77683846526966f, isMoreThanHalf = false, isPositiveArc = true, 3.989f, 12.717f)
                    curveTo(3.989f, 12.645000000000001f, 4.006f, 12.508000000000001f, 4.1499999999999995f, 12.364f)
                    arcTo(0.5f, 0.5f, 223.87394520981005f, isMoreThanHalf = false, isPositiveArc = true, 4.864999999999999f, 12.358f)
                    lineTo(7.124999999999999f, 14.623000000000001f)
                    arcTo(1.1f, 1.1f, 134.79302233208094f, isMoreThanHalf = false, isPositiveArc = false, 9.0f, 13.84f)
                    lineTo(9.0f, 4.5f)
                    arcTo(0.5f, 0.5f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 10.0f, 4.5f)
                    lineTo(10.0f, 12.0f)
                    lineTo(12.0f, 12.0f)
                    lineTo(12.0f, 3.504f)
                    curveTo(12.0f, 3.226f, 12.224f, 3.0f, 12.5f, 3.0f)
                    curveTo(12.776f, 3.0f, 13.0f, 3.226f, 13.0f, 3.504f)
                    lineTo(13.0f, 12.001f)
                    lineTo(15.0f, 12.001f)
                    lineTo(15.0f, 4.504f)
                    curveTo(15.0f, 4.225999999999999f, 15.224f, 3.9999999999999996f, 15.5f, 3.9999999999999996f)
                    curveTo(15.776f, 3.9999999999999996f, 16.0f, 4.226f, 16.0f, 4.504f)
                    lineTo(16.0f, 12.001f)
                    lineTo(18.0f, 12.001f)
                    lineTo(18.0f, 10.995999999999999f)
                    lineTo(18.007f, 7.469999999999999f)
                    arcTo(0.48f, 0.48f, 180.35810094244047f, isMoreThanHalf = false, isPositiveArc = true, 18.487000000000002f, 6.9929999999999986f)
                    curveTo(18.768f, 6.9929999999999986f, 18.998f, 7.220999999999998f, 18.998f, 7.502999999999998f)
                    lineTo(19.0f, 14.678f)
                    curveTo(19.0f, 15.427000000000001f, 18.858f, 16.16f, 18.58f, 16.858f)
                    moveTo(20.997999999999998f, 7.503f)
                    arcTo(2.513f, 2.513f, 359.8688340365566f, isMoreThanHalf = false, isPositiveArc = false, 18.0f, 5.043f)
                    lineTo(18.0f, 4.5040000000000004f)
                    arcTo(2.506f, 2.506f, 359.9544372955912f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 2.0f)
                    curveTo(15.185f, 2.0f, 14.886f, 2.065f, 14.608f, 2.171f)
                    arcTo(2.49f, 2.49f, 327.9864646862969f, isMoreThanHalf = false, isPositiveArc = false, 12.5f, 1.001f)
                    curveTo(11.612f, 1.001f, 10.835f, 1.4689999999999999f, 10.392f, 2.171f)
                    arcTo(2.5f, 2.5f, 291.2538118240545f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 2.001f)
                    arcTo(2.503f, 2.503f, 269.9314005525639f, isMoreThanHalf = false, isPositiveArc = false, 7.0f, 4.5f)
                    lineTo(7.0f, 11.665f)
                    lineTo(6.281f, 10.944999999999999f)
                    arcTo(2.48f, 2.48f, 315.28132764749597f, isMoreThanHalf = false, isPositiveArc = false, 4.513f, 10.209999999999999f)
                    lineTo(4.508f, 10.209999999999999f)
                    arcTo(2.52f, 2.52f, 269.7626584050513f, isMoreThanHalf = false, isPositiveArc = false, 2.71f, 10.975f)
                    arcTo(2.45f, 2.45f, 225.07996030827607f, isMoreThanHalf = false, isPositiveArc = false, 1.99f, 12.716f)
                    curveTo(1.99f, 13.376f, 2.246f, 13.992999999999999f, 2.711f, 14.457999999999998f)
                    lineTo(8.211f, 19.951999999999998f)
                    arcTo(6.96f, 6.96f, 135.11028075011518f, isMoreThanHalf = false, isPositiveArc = false, 13.158f, 22.0f)
                    lineTo(13.937999999999999f, 22.0f)
                    arcTo(6.97f, 6.97f, 90.15701549560494f, isMoreThanHalf = false, isPositiveArc = false, 20.436f, 17.6f)
                    arcTo(7.8f, 7.8f, 21.922279450507293f, isMoreThanHalf = false, isPositiveArc = false, 21.0f, 14.676f)
                    close()
                }
            }.build().also {
                _hand = it
            }
    }


private var _hand: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun HandIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Hand.imageVector,
            contentDescription = null,
    )
}
