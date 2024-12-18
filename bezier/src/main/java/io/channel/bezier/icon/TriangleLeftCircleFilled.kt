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

val BezierIcons.TriangleLeftCircleFilled: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_triangle_left_circle_filled
        override val imageVector: ImageVector
            get() = _triangleLeftCircleFilled ?: ImageVector.Builder(
                    name = "TriangleLeftCircleFilled",
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
                    moveTo(13.808f, 7.356f)
                    curveTo(13.823f, 7.356f, 13.836f, 7.362f, 13.850999999999999f, 7.364f)
                    arcTo(0.3f, 0.3f, 276.26133941529577f, isMoreThanHalf = false, isPositiveArc = true, 13.998f, 7.422f)
                    quadTo(14.020999999999999f, 7.436f, 14.039f, 7.457f)
                    arcTo(0.28f, 0.28f, 314.7060068789848f, isMoreThanHalf = false, isPositiveArc = true, 14.122f, 7.652f)
                    lineTo(14.122f, 16.371f)
                    curveTo(14.122f, 16.450999999999997f, 14.086f, 16.514999999999997f, 14.039f, 16.566f)
                    quadTo(14.020999999999999f, 16.584999999999997f, 13.999f, 16.601f)
                    arcTo(0.3f, 0.3f, 53.237286093726254f, isMoreThanHalf = false, isPositiveArc = true, 13.851f, 16.659f)
                    curveTo(13.836f, 16.660999999999998f, 13.823f, 16.668f, 13.808000000000002f, 16.666999999999998f)
                    arcTo(0.3f, 0.3f, 91.6498062746004f, isMoreThanHalf = false, isPositiveArc = true, 13.63f, 16.601999999999997f)
                    lineTo(8.4f, 12.241999999999997f)
                    arcTo(0.3f, 0.3f, 129.79554135618025f, isMoreThanHalf = false, isPositiveArc = true, 8.4f, 11.780999999999997f)
                    lineTo(13.63f, 7.420999999999997f)
                    arcTo(0.3f, 0.3f, 231.52860023375789f, isMoreThanHalf = false, isPositiveArc = true, 13.808000000000002f, 7.355999999999996f)
                    moveTo(12.0f, 2.0f)
                    curveTo(6.477f, 2.0f, 2.0f, 6.478f, 2.0f, 12.0f)
                    curveTo(2.0f, 17.522f, 6.477f, 22.0f, 12.0f, 22.0f)
                    curveTo(17.523f, 22.0f, 22.0f, 17.522f, 22.0f, 12.0f)
                    curveTo(22.0f, 6.4780000000000015f, 17.522f, 2.0f, 12.0f, 2.0f)
                }
            }.build().also {
                _triangleLeftCircleFilled = it
            }
    }


private var _triangleLeftCircleFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TriangleLeftCircleFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.TriangleLeftCircleFilled.imageVector,
            contentDescription = null,
    )
}
