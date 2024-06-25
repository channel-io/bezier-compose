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

val BezierIcons.ChevronLeftDouble: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _chevronLeftDouble ?: ImageVector.Builder(
                    name = "ChevronLeftDouble",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(17.24f, 19.65f)
                    arcTo(1.0f, 1.0f, 139.46084825851653f, isMoreThanHalf = true, isPositiveArc = false, 18.759999999999998f, 18.349999999999998f)
                    lineTo(13.316f, 12.0f)
                    lineTo(18.758000000000003f, 5.65f)
                    arcTo(1.0f, 1.0f, 42.73523939138219f, isMoreThanHalf = true, isPositiveArc = false, 17.240000000000002f, 4.3500000000000005f)
                    lineTo(11.240000000000002f, 11.350000000000001f)
                    arcTo(1.0f, 1.0f, 220.54160187350456f, isMoreThanHalf = false, isPositiveArc = false, 11.240000000000002f, 12.650000000000002f)
                    close()
                    moveTo(9.24f, 19.65f)
                    arcTo(1.0f, 1.0f, 139.46084825851653f, isMoreThanHalf = true, isPositiveArc = false, 10.76f, 18.349999999999998f)
                    lineTo(5.316f, 12.0f)
                    lineTo(10.758f, 5.65f)
                    arcTo(1.0f, 1.0f, 42.73523939138219f, isMoreThanHalf = true, isPositiveArc = false, 9.239999999999998f, 4.3500000000000005f)
                    lineTo(3.2399999999999984f, 11.350000000000001f)
                    arcTo(1.0f, 1.0f, 220.54160187350456f, isMoreThanHalf = false, isPositiveArc = false, 3.2399999999999984f, 12.650000000000002f)
                    close()
                }
            }.build().also {
                _chevronLeftDouble = it
            }
    }


private var _chevronLeftDouble: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChevronLeftDoubleIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ChevronLeftDouble.imageVector,
            contentDescription = null,
    )
}
