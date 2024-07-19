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

val BezierIcons.BreaktimeFilled: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _breaktimeFilled ?: ImageVector.Builder(
                    name = "BreaktimeFilled",
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
                    moveTo(14.997f, 5.0f)
                    curveTo(14.467f, 5.0f, 14.0f, 5.323f, 14.0f, 5.692f)
                    lineTo(14.0f, 6.0f)
                    lineTo(12.0f, 6.0f)
                    lineTo(12.0f, 5.692f)
                    curveTo(12.0f, 4.208f, 13.344f, 3.0f, 14.997f, 3.0f)
                    curveTo(15.528f, 3.0f, 15.994f, 2.676f, 15.994f, 2.307f)
                    lineTo(15.994f, 2.0f)
                    lineTo(17.994f, 2.0f)
                    lineTo(17.994f, 2.307f)
                    curveTo(17.994f, 3.792f, 16.65f, 5.0f, 14.997f, 5.0f)
                    moveTo(20.0f, 12.822f)
                    curveTo(20.59f, 12.537999999999998f, 21.0f, 11.94f, 21.0f, 11.244f)
                    lineTo(21.0f, 9.0f)
                    lineTo(20.0f, 9.0f)
                    close()
                    moveTo(20.0f, 6.996f)
                    lineTo(20.0f, 7.0f)
                    lineTo(22.0f, 7.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 23.0f, 8.0f)
                    lineTo(23.0f, 11.244f)
                    arcTo(3.76f, 3.76f, 0.1394105199602423f, isMoreThanHalf = false, isPositiveArc = true, 19.93f, 14.931f)
                    arcTo(6.98f, 6.98f, 7.643902567439534f, isMoreThanHalf = false, isPositiveArc = true, 17.885f, 19.0f)
                    lineTo(20.0f, 19.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = true, 20.0f, 21.0f)
                    lineTo(4.0f, 21.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = true, 4.0f, 19.0f)
                    lineTo(6.115f, 19.0f)
                    arcTo(6.98f, 6.98f, 134.18611834432693f, isMoreThanHalf = false, isPositiveArc = true, 4.0f, 13.996f)
                    lineTo(4.0f, 7.996f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 5.0f, 6.996f)
                    close()
                }
            }.build().also {
                _breaktimeFilled = it
            }
    }


private var _breaktimeFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun BreaktimeFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.BreaktimeFilled.imageVector,
            contentDescription = null,
    )
}
