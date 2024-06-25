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

val BezierIcons.NotificationOff: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _notificationOff ?: ImageVector.Builder(
                    name = "NotificationOff",
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
                    moveTo(17.385f, 13.605f)
                    lineTo(18.879f, 16.003f)
                    lineTo(17.801000000000002f, 16.003f)
                    lineTo(8.028f, 6.23f)
                    curveTo(8.723f, 4.913f, 10.09f, 4.003f, 11.68f, 4.003f)
                    arcTo(4.15f, 4.15f, 270.06898954136136f, isMoreThanHalf = false, isPositiveArc = true, 15.825f, 8.148f)
                    curveTo(15.825f, 10.078f, 16.364f, 11.965f, 17.384999999999998f, 13.605f)
                    moveTo(4.255f, 2.457f)
                    arcTo(1.0f, 1.0f, 315.02025301418405f, isMoreThanHalf = false, isPositiveArc = false, 2.84f, 3.871f)
                    lineTo(19.81f, 20.840999999999998f)
                    arcTo(1.0f, 1.0f, 135.02025216075623f, isMoreThanHalf = false, isPositiveArc = false, 21.224999999999998f, 19.426999999999996f)
                    lineTo(19.8f, 18.003f)
                    lineTo(20.499000000000002f, 18.003f)
                    arcTo(1.1f, 1.1f, 89.97803945911116f, isMoreThanHalf = false, isPositiveArc = false, 21.432000000000002f, 16.321f)
                    lineTo(19.082f, 12.547f)
                    arcTo(8.3f, 8.3f, 148.04169386920208f, isMoreThanHalf = false, isPositiveArc = true, 17.824f, 8.148f)
                    arcTo(6.15f, 6.15f, 359.9534369806823f, isMoreThanHalf = false, isPositiveArc = false, 11.679000000000002f, 2.003f)
                    arcTo(6.13f, 6.13f, 269.9080350979691f, isMoreThanHalf = false, isPositiveArc = false, 6.565000000000002f, 4.768000000000001f)
                    close()
                    moveTo(13.68f, 18.003f)
                    curveTo(13.68f, 19.106f, 12.783f, 20.003f, 11.68f, 20.003f)
                    curveTo(10.577f, 20.003f, 9.68f, 19.106f, 9.68f, 18.003f)
                    close()
                    moveTo(4.277f, 12.547f)
                    lineTo(1.927f, 16.321f)
                    arcTo(1.1f, 1.1f, 211.94405673453898f, isMoreThanHalf = false, isPositiveArc = false, 2.8600000000000003f, 18.003f)
                    lineTo(7.680000000000001f, 18.003f)
                    curveTo(7.680000000000001f, 20.209f, 9.474f, 22.003f, 11.68f, 22.003f)
                    arcTo(4.0f, 4.0f, 89.86410110955407f, isMoreThanHalf = false, isPositiveArc = false, 15.669f, 18.113f)
                    lineTo(13.559000000000001f, 16.003f)
                    lineTo(4.48f, 16.003f)
                    lineTo(5.973000000000001f, 13.605f)
                    arcTo(10.3f, 10.3f, 31.757354153368972f, isMoreThanHalf = false, isPositiveArc = false, 7.383000000000001f, 9.828f)
                    lineTo(5.543000000000001f, 7.9879999999999995f)
                    lineTo(5.5390000000000015f, 8.054f)
                    quadTo(5.534000000000002f, 8.1f, 5.534000000000002f, 8.148f)
                    arcTo(8.3f, 8.3f, 359.95311300689656f, isMoreThanHalf = false, isPositiveArc = true, 4.276000000000002f, 12.548f)
                }
            }.build().also {
                _notificationOff = it
            }
    }


private var _notificationOff: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun NotificationOffIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.NotificationOff.imageVector,
            contentDescription = null,
    )
}
