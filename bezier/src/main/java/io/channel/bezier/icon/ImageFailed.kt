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

val BezierIcons.ImageFailed: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_image_failed
        override val imageVector: ImageVector
            get() = _imageFailed ?: ImageVector.Builder(
                    name = "ImageFailed",
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
                    moveTo(18.986f, 19.0f)
                    lineTo(7.109f, 19.0f)
                    lineTo(8.109f, 18.0f)
                    lineTo(17.986f, 18.0f)
                    lineTo(17.986f, 12.0f)
                    lineTo(15.403f, 10.706f)
                    lineTo(18.986f, 7.122f)
                    close()
                    moveTo(20.825f, 2.454f)
                    lineTo(20.13f, 3.15f)
                    lineTo(20.128f, 3.15f)
                    lineTo(18.278f, 5.0f)
                    lineTo(18.279999999999998f, 5.0f)
                    lineTo(16.572f, 6.707f)
                    lineTo(12.57f, 10.71f)
                    lineTo(12.565f, 10.712000000000002f)
                    lineTo(5.986f, 17.292f)
                    lineTo(5.986f, 17.294f)
                    lineTo(4.986f, 18.294f)
                    lineTo(4.986f, 18.291f)
                    lineTo(3.1359999999999997f, 20.141000000000002f)
                    lineTo(3.1369999999999996f, 20.143f)
                    lineTo(2.441f, 20.839000000000002f)
                    lineTo(3.8549999999999995f, 22.253000000000004f)
                    lineTo(5.109f, 21.0f)
                    lineTo(19.486f, 21.0f)
                    curveTo(20.313000000000002f, 21.0f, 20.986f, 20.326999999999998f, 20.986f, 19.5f)
                    lineTo(20.986f, 5.122f)
                    lineTo(22.240000000000002f, 3.868f)
                    close()
                    moveTo(7.986f, 10.0f)
                    arcTo(2.0f, 2.0f, 89.98568030549897f, isMoreThanHalf = true, isPositiveArc = false, 7.984999999999999f, 5.999f)
                    arcTo(2.0f, 2.0f, 269.9856789655233f, isMoreThanHalf = false, isPositiveArc = false, 7.986f, 10.0f)
                    moveTo(16.864f, 5.0f)
                    lineTo(4.986f, 5.0f)
                    lineTo(4.986f, 16.878f)
                    lineTo(2.9859999999999998f, 18.878f)
                    lineTo(2.986f, 4.5f)
                    curveTo(2.986f, 3.673f, 3.6590000000000003f, 3.0f, 4.486000000000001f, 3.0f)
                    lineTo(18.864f, 3.0f)
                    close()
                }
            }.build().also {
                _imageFailed = it
            }
    }


private var _imageFailed: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ImageFailedIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ImageFailed.imageVector,
            contentDescription = null,
    )
}
