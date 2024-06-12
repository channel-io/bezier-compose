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

val BezierIcons.PinOff: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _pinOff ?: ImageVector.Builder(
                    name = "PinOff",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                ) {
                    moveTo(3.0f, 2.5f)
                    arcTo(1.0f, 1.0f, 224.99134833716198f, isMoreThanHalf = false, isPositiveArc = false, 3.0f, 3.9139999999999997f)
                    lineTo(20.086f, 21.0f)
                    arcTo(1.0f, 1.0f, 134.00425538642457f, isMoreThanHalf = false, isPositiveArc = false, 21.5f, 19.586f)
                    lineTo(15.463000000000001f, 13.549f)
                    arcTo(2.0f, 2.0f, 219.7200963310611f, isMoreThanHalf = false, isPositiveArc = true, 15.586f, 13.414f)
                    lineTo(17.154f, 11.846f)
                    arcTo(2.0f, 2.0f, 225.0167306003742f, isMoreThanHalf = false, isPositiveArc = true, 17.967f, 11.353f)
                    lineTo(19.706999999999997f, 10.805f)
                    curveTo(21.139999999999997f, 10.354f, 21.581999999999997f, 8.545f, 20.520999999999997f, 7.483f)
                    lineTo(16.528f, 3.49f)
                    curveTo(15.470999999999998f, 2.4330000000000003f, 13.668f, 2.8680000000000003f, 13.209999999999999f, 4.292f)
                    lineTo(12.648f, 6.04f)
                    arcTo(2.0f, 2.0f, 17.834483397919865f, isMoreThanHalf = false, isPositiveArc = true, 12.158f, 6.8420000000000005f)
                    lineTo(10.585999999999999f, 8.414000000000001f)
                    arcTo(2.0f, 2.0f, 45.0460978631956f, isMoreThanHalf = false, isPositiveArc = true, 10.450999999999999f, 8.537f)
                    lineTo(4.414f, 2.5f)
                    arcTo(1.0f, 1.0f, 314.991348337162f, isMoreThanHalf = false, isPositiveArc = false, 3.0f, 2.5f)
                    moveTo(5.397f, 9.0f)
                    lineTo(6.086f, 9.0f)
                    lineTo(15.0f, 17.914f)
                    lineTo(15.0f, 18.71f)
                    arcTo(2.0f, 2.0f, 359.99697171674836f, isMoreThanHalf = false, isPositiveArc = true, 14.46f, 20.077f)
                    lineTo(14.347000000000001f, 20.197000000000003f)
                    arcTo(1.0f, 1.0f, 43.18520469988963f, isMoreThanHalf = false, isPositiveArc = true, 12.911000000000001f, 20.220000000000002f)
                    lineTo(9.066f, 16.376f)
                    lineTo(3.8530000000000006f, 21.588f)
                    arcTo(1.0f, 1.0f, 45.99574461357758f, isMoreThanHalf = false, isPositiveArc = true, 2.439000000000001f, 20.174f)
                    lineTo(7.652000000000001f, 14.960999999999999f)
                    lineTo(3.844000000000001f, 11.152999999999999f)
                    arcTo(1.0f, 1.0f, 134.9927823298888f, isMoreThanHalf = false, isPositiveArc = true, 3.804000000000001f, 9.780999999999999f)
                    lineTo(3.9040000000000012f, 9.671f)
                    arcTo(2.0f, 2.0f, 221.6439144884379f, isMoreThanHalf = false, isPositiveArc = true, 5.396f, 9.0f)
                }
            }.build().also {
                _pinOff = it
            }
    }


private var _pinOff: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun PinOffIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.PinOff.imageVector,
            contentDescription = null,
    )
}
