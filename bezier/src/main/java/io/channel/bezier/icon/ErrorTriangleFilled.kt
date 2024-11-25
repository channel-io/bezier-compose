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

val BezierIcons.ErrorTriangleFilled: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_error_triangle_filled
        override val imageVector: ImageVector
            get() = _errorTriangleFilled ?: ImageVector.Builder(
                    name = "ErrorTriangleFilled",
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
                    moveTo(8.987f, 4.1f)
                    curveTo(10.341000000000001f, 1.8069999999999995f, 13.658999999999999f, 1.8069999999999995f, 15.013f, 4.1f)
                    lineTo(21.88f, 15.719999999999999f)
                    curveTo(23.258f, 18.052999999999997f, 21.576999999999998f, 21.0f, 18.866f, 21.0f)
                    lineTo(5.134f, 21.0f)
                    curveTo(2.4240000000000004f, 21.0f, 0.742f, 18.053f, 2.1200000000000006f, 15.719999999999999f)
                    close()
                    moveTo(12.0f, 18.8f)
                    arcTo(1.4f, 1.4f, 90.0f, isMoreThanHalf = true, isPositiveArc = true, 12.0f, 15.999f)
                    arcTo(1.4f, 1.4f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 12.0f, 18.8f)
                    moveTo(12.0f, 6.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 11.0f, 7.0f)
                    lineTo(11.0f, 13.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = false, 13.0f, 13.0f)
                    lineTo(13.0f, 7.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 12.0f, 6.0f)
                }
            }.build().also {
                _errorTriangleFilled = it
            }
    }


private var _errorTriangleFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ErrorTriangleFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ErrorTriangleFilled.imageVector,
            contentDescription = null,
    )
}
