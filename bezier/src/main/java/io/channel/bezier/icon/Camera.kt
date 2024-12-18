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

val BezierIcons.Camera: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_camera
        override val imageVector: ImageVector
            get() = _camera ?: ImageVector.Builder(
                    name = "Camera",
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
                    moveTo(9.236f, 3.0f)
                    arcTo(3.0f, 3.0f, 269.99805314558586f, isMoreThanHalf = false, isPositiveArc = false, 6.553000000000001f, 4.6579999999999995f)
                    lineTo(6.382f, 5.0f)
                    lineTo(5.0f, 5.0f)
                    arcTo(3.0f, 3.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 2.0f, 8.0f)
                    lineTo(2.0f, 17.0f)
                    arcTo(3.0f, 3.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 5.0f, 20.0f)
                    lineTo(19.0f, 20.0f)
                    arcTo(3.0f, 3.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 22.0f, 17.0f)
                    lineTo(22.0f, 8.0f)
                    arcTo(3.0f, 3.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 19.0f, 5.0f)
                    lineTo(17.618f, 5.0f)
                    lineTo(17.447999999999997f, 4.658f)
                    arcTo(3.0f, 3.0f, 333.4272911426881f, isMoreThanHalf = false, isPositiveArc = false, 14.763f, 3.0f)
                    close()
                    moveTo(8.342f, 5.553f)
                    arcTo(1.0f, 1.0f, 206.5513602256362f, isMoreThanHalf = false, isPositiveArc = true, 9.236f, 5.0f)
                    lineTo(14.764f, 5.0f)
                    arcTo(1.0f, 1.0f, 270.03059755930576f, isMoreThanHalf = false, isPositiveArc = true, 15.658f, 5.553f)
                    lineTo(16.105999999999998f, 6.447f)
                    arcTo(1.0f, 1.0f, 153.4486397743638f, isMoreThanHalf = false, isPositiveArc = false, 17.0f, 7.0f)
                    lineTo(19.0f, 7.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 20.0f, 8.0f)
                    lineTo(20.0f, 17.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 19.0f, 18.0f)
                    lineTo(5.0f, 18.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 4.0f, 17.0f)
                    lineTo(4.0f, 8.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 5.0f, 7.0f)
                    lineTo(7.0f, 7.0f)
                    arcTo(1.0f, 1.0f, 89.96940244069424f, isMoreThanHalf = false, isPositiveArc = false, 7.894f, 6.447f)
                    close()
                    moveTo(7.0f, 12.0f)
                    curveTo(7.0f, 14.756f, 9.243f, 17.0f, 12.0f, 17.0f)
                    curveTo(14.757f, 17.0f, 17.0f, 14.756f, 17.0f, 12.0f)
                    curveTo(17.0f, 9.243f, 14.757f, 7.0f, 12.0f, 7.0f)
                    curveTo(9.243f, 7.0f, 7.0f, 9.243f, 7.0f, 12.0f)
                    moveTo(9.0f, 12.0f)
                    arcTo(3.0f, 3.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = true, 15.0f, 12.0f)
                    arcTo(3.0f, 3.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 9.0f, 12.0f)
                }
            }.build().also {
                _camera = it
            }
    }


private var _camera: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CameraIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Camera.imageVector,
            contentDescription = null,
    )
}
