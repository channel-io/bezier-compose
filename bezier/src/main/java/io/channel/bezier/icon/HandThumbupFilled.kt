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

val BezierIcons.HandThumbupFilled: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_hand_thumbup_filled
        override val imageVector: ImageVector
            get() = _handThumbupFilled ?: ImageVector.Builder(
                    name = "HandThumbupFilled",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(16.777f, 2.564f)
                    curveTo(16.407f, 2.194f, 15.967f, 2.05f, 15.537f, 2.05f)
                    curveTo(15.109f, 2.05f, 14.667000000000002f, 2.195f, 14.3f, 2.562f)
                    lineTo(8.83f, 8.031f)
                    lineTo(8.628f, 8.243f)
                    arcTo(6.22f, 6.22f, 222.41645626256025f, isMoreThanHalf = false, isPositiveArc = false, 7.0f, 12.451f)
                    lineTo(7.0f, 13.227f)
                    lineTo(7.005f, 13.483f)
                    arcTo(6.23f, 6.23f, 177.77026783432802f, isMoreThanHalf = false, isPositiveArc = false, 10.929f, 19.03f)
                    arcTo(7.1f, 7.1f, 111.84883111300248f, isMoreThanHalf = false, isPositiveArc = false, 13.573f, 19.540000000000003f)
                    lineTo(16.25f, 19.540000000000003f)
                    lineTo(16.442f, 19.534000000000002f)
                    arcTo(3.26f, 3.26f, 86.48767690539593f, isMoreThanHalf = false, isPositiveArc = false, 19.292f, 17.432000000000002f)
                    lineTo(21.542f, 11.432000000000002f)
                    lineTo(21.611f, 11.229000000000003f)
                    arcTo(3.22f, 3.22f, 17.064440064133667f, isMoreThanHalf = false, isPositiveArc = false, 21.171f, 8.438000000000002f)
                    lineTo(21.043f, 8.266000000000002f)
                    arcTo(3.22f, 3.22f, 321.7390303012644f, isMoreThanHalf = false, isPositiveArc = false, 18.5f, 7.04f)
                    lineTo(14.77f, 7.04f)
                    lineTo(16.775f, 5.037f)
                    lineTo(16.887999999999998f, 4.912f)
                    arcTo(1.753f, 1.753f, 39.41905763620491f, isMoreThanHalf = false, isPositiveArc = false, 16.778f, 2.564f)
                    moveTo(3.054f, 9.273f)
                    curveTo(3.0f, 9.38f, 3.0f, 9.52f, 3.0f, 9.8f)
                    lineTo(3.0f, 18.200000000000003f)
                    curveTo(3.0f, 18.480000000000004f, 3.0f, 18.620000000000005f, 3.054f, 18.727000000000004f)
                    arcTo(0.5f, 0.5f, 152.86825471832742f, isMoreThanHalf = false, isPositiveArc = false, 3.2729999999999997f, 18.945000000000004f)
                    curveTo(3.38f, 19.0f, 3.52f, 19.0f, 3.8f, 19.0f)
                    lineTo(5.199999999999999f, 19.0f)
                    curveTo(5.4799999999999995f, 19.0f, 5.619999999999999f, 19.0f, 5.726999999999999f, 18.945f)
                    arcTo(0.5f, 0.5f, 62.95672349096944f, isMoreThanHalf = false, isPositiveArc = false, 5.944999999999999f, 18.727f)
                    curveTo(6.0f, 18.62f, 6.0f, 18.48f, 6.0f, 18.2f)
                    lineTo(6.0f, 9.8f)
                    curveTo(6.0f, 9.520000000000001f, 6.0f, 9.38f, 5.945f, 9.273000000000001f)
                    arcTo(0.5f, 0.5f, 332.95672349096947f, isMoreThanHalf = false, isPositiveArc = false, 5.727f, 9.055000000000001f)
                    curveTo(5.62f, 9.0f, 5.48f, 9.0f, 5.2f, 9.0f)
                    lineTo(3.8f, 9.0f)
                    curveTo(3.5199999999999996f, 9.0f, 3.38f, 9.0f, 3.2729999999999997f, 9.055f)
                    arcTo(0.5f, 0.5f, 243.1304775078218f, isMoreThanHalf = false, isPositiveArc = false, 3.054f, 9.273f)
                }
            }.build().also {
                _handThumbupFilled = it
            }
    }


private var _handThumbupFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun HandThumbupFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.HandThumbupFilled.imageVector,
            contentDescription = null,
    )
}
