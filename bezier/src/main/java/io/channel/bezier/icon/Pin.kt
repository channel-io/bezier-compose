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

val BezierIcons.Pin: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_pin
        override val imageVector: ImageVector
            get() = _pin ?: ImageVector.Builder(
                    name = "Pin",
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
                    moveTo(20.52f, 7.483f)
                    curveTo(21.583f, 8.544f, 21.14f, 10.353f, 19.708f, 10.805f)
                    lineTo(17.968f, 11.353f)
                    arcTo(2.0f, 2.0f, 252.56218356475864f, isMoreThanHalf = false, isPositiveArc = false, 17.154f, 11.846f)
                    lineTo(15.586f, 13.414f)
                    arcTo(2.0f, 2.0f, 225.00865351048367f, isMoreThanHalf = false, isPositiveArc = false, 15.0f, 14.828f)
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
                    lineTo(9.171f, 9.0f)
                    arcTo(2.0f, 2.0f, 89.98776339474541f, isMoreThanHalf = false, isPositiveArc = false, 10.584999999999999f, 8.414f)
                    lineTo(12.157f, 6.842f)
                    arcTo(2.0f, 2.0f, 45.013088106281764f, isMoreThanHalf = false, isPositiveArc = false, 12.647f, 6.039999999999999f)
                    lineTo(13.209f, 4.291999999999999f)
                    curveTo(13.667f, 2.867999999999999f, 15.469f, 2.4319999999999986f, 16.528f, 3.489999999999999f)
                    close()
                    moveTo(19.107f, 8.897f)
                    lineTo(15.114f, 4.905f)
                    lineTo(14.552f, 6.653f)
                    arcTo(4.0f, 4.0f, 17.85666957685778f, isMoreThanHalf = false, isPositiveArc = true, 13.572f, 8.256f)
                    lineTo(12.0f, 9.828f)
                    arcTo(4.0f, 4.0f, 44.99134648951631f, isMoreThanHalf = false, isPositiveArc = true, 9.172f, 11.0f)
                    lineTo(6.519f, 11.0f)
                    lineTo(13.0f, 17.482f)
                    lineTo(13.0f, 14.828f)
                    arcTo(4.0f, 4.0f, 180.01223660527364f, isMoreThanHalf = false, isPositiveArc = true, 14.172f, 12.0f)
                    lineTo(15.739f, 10.432f)
                    arcTo(4.0f, 4.0f, 224.9964690031476f, isMoreThanHalf = false, isPositiveArc = true, 17.366f, 9.445f)
                    close()
                }
            }.build().also {
                _pin = it
            }
    }


private var _pin: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun PinIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Pin.imageVector,
            contentDescription = null,
    )
}
