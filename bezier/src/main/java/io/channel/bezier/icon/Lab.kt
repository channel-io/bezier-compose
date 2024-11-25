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

val BezierIcons.Lab: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_lab
        override val imageVector: ImageVector
            get() = _lab ?: ImageVector.Builder(
                    name = "Lab",
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
                    moveTo(9.0f, 2.0f)
                    lineTo(15.0f, 2.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 16.0f, 3.0f)
                    lineTo(16.0f, 9.426f)
                    curveTo(16.0f, 9.801f, 16.105f, 10.168f, 16.304f, 10.486f)
                    lineTo(20.392f, 17.027f)
                    curveTo(20.788999999999998f, 17.663f, 21.0f, 18.397000000000002f, 21.0f, 19.147000000000002f)
                    lineTo(21.0f, 21.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 20.0f, 22.0f)
                    lineTo(4.0f, 22.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 3.0f, 21.0f)
                    lineTo(3.0f, 19.147f)
                    curveTo(3.0f, 18.397f, 3.21f, 17.662999999999997f, 3.608f, 17.026999999999997f)
                    lineTo(7.696f, 10.486999999999998f)
                    curveTo(7.896f, 10.167999999999997f, 8.0f, 9.800999999999998f, 8.0f, 9.426999999999998f)
                    lineTo(8.0f, 3.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 9.0f, 2.0f)
                    moveTo(14.0f, 9.426f)
                    lineTo(14.0f, 4.0f)
                    lineTo(10.0f, 4.0f)
                    lineTo(10.0f, 9.426f)
                    curveTo(10.0f, 10.177f, 9.79f, 10.91f, 9.392f, 11.546f)
                    lineTo(5.303999999999999f, 18.087f)
                    arcTo(2.0f, 2.0f, 212.0051998620727f, isMoreThanHalf = false, isPositiveArc = false, 5.0f, 19.147f)
                    lineTo(5.0f, 20.0f)
                    lineTo(19.0f, 20.0f)
                    lineTo(19.0f, 19.147f)
                    curveTo(19.0f, 18.772f, 18.895f, 18.404999999999998f, 18.696f, 18.087f)
                    lineTo(14.608f, 11.547f)
                    arcTo(4.0f, 4.0f, 147.99479665903996f, isMoreThanHalf = false, isPositiveArc = true, 14.0f, 9.426f)
                    moveTo(13.713f, 12.0f)
                    lineTo(17.881f, 18.669f)
                    arcTo(0.8f, 0.8f, 328.3571220755816f, isMoreThanHalf = false, isPositiveArc = true, 17.995f, 19.0f)
                    lineTo(6.006f, 19.0f)
                    arcTo(0.8f, 0.8f, 186.50825337331645f, isMoreThanHalf = false, isPositiveArc = true, 6.121f, 18.669f)
                    lineTo(10.287f, 12.0f)
                    close()
                }
            }.build().also {
                _lab = it
            }
    }


private var _lab: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun LabIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Lab.imageVector,
            contentDescription = null,
    )
}
