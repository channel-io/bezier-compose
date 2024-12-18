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

val BezierIcons.TriangleDownCircle: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_triangle_down_circle
        override val imageVector: ImageVector
            get() = _triangleDownCircle ?: ImageVector.Builder(
                    name = "TriangleDownCircle",
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
                    moveTo(4.0f, 12.0f)
                    curveTo(4.0f, 16.411f, 7.59f, 20.0f, 12.0f, 20.0f)
                    curveTo(16.41f, 20.0f, 20.0f, 16.411f, 20.0f, 12.0f)
                    curveTo(20.0f, 7.588999999999999f, 16.411f, 4.0f, 12.0f, 4.0f)
                    curveTo(7.588999999999999f, 4.0f, 4.0f, 7.59f, 4.0f, 12.0f)
                    moveTo(2.0f, 12.0f)
                    curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                    curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                    curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                    curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                    moveTo(7.852f, 10.0f)
                    lineTo(16.572000000000003f, 10.0f)
                    arcTo(0.3f, 0.3f, 270.0978055629088f, isMoreThanHalf = false, isPositiveArc = true, 16.802000000000003f, 10.492f)
                    lineTo(12.442000000000004f, 15.723f)
                    arcTo(0.3f, 0.3f, 39.94450518981475f, isMoreThanHalf = false, isPositiveArc = true, 11.982000000000003f, 15.723f)
                    lineTo(7.6220000000000026f, 10.493f)
                    arcTo(0.3f, 0.3f, 139.95912703212358f, isMoreThanHalf = false, isPositiveArc = true, 7.852000000000003f, 10.0f)
                }
            }.build().also {
                _triangleDownCircle = it
            }
    }


private var _triangleDownCircle: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TriangleDownCircleIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.TriangleDownCircle.imageVector,
            contentDescription = null,
    )
}
