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

val BezierIcons.Education: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _education ?: ImageVector.Builder(
                    name = "Education",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                        pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(11.106f, 2.211f)
                    arcTo(2.0f, 2.0f, 243.4486306411403f, isMoreThanHalf = false, isPositiveArc = true, 12.894f, 2.211f)
                    lineTo(22.016f, 6.772f)
                    arcTo(1.79f, 1.79f, 296.3250676368974f, isMoreThanHalf = false, isPositiveArc = true, 23.0f, 8.585f)
                    lineTo(23.0f, 14.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 21.0f, 14.0f)
                    lineTo(21.0f, 10.5f)
                    lineTo(20.0f, 11.0f)
                    lineTo(20.0f, 16.939f)
                    arcTo(2.0f, 2.0f, 9.645753137950855e-05f, isMoreThanHalf = false, isPositiveArc = true, 18.908f, 18.721f)
                    lineTo(12.908000000000001f, 21.779f)
                    arcTo(2.0f, 2.0f, 62.999389088303964f, isMoreThanHalf = false, isPositiveArc = true, 11.092f, 21.779f)
                    lineTo(5.0920000000000005f, 18.721f)
                    arcTo(2.0f, 2.0f, 117.00061091160488f, isMoreThanHalf = false, isPositiveArc = true, 4.0f, 16.939f)
                    lineTo(4.0f, 11.0f)
                    lineTo(1.984f, 9.992f)
                    curveTo(0.657f, 9.329f, 0.657f, 7.4350000000000005f, 1.984f, 6.772f)
                    close()
                    moveTo(12.894f, 14.553f)
                    lineTo(18.0f, 12.0f)
                    lineTo(18.0f, 16.939f)
                    lineTo(12.0f, 19.997f)
                    lineTo(6.0f, 16.939f)
                    lineTo(6.0f, 12.0f)
                    lineTo(11.106f, 14.553f)
                    arcTo(2.0f, 2.0f, 116.55136935885969f, isMoreThanHalf = false, isPositiveArc = false, 12.894f, 14.553f)
                    moveTo(20.764f, 8.382000000000001f)
                    lineTo(12.0f, 4.0f)
                    lineTo(3.236f, 8.382f)
                    lineTo(12.0f, 12.764f)
                    close()
                }
            }.build().also {
                _education = it
            }
    }


private var _education: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun EducationIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Education.imageVector,
            contentDescription = null,
    )
}
