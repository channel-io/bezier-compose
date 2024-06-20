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

val BezierIcons.Sorting: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _sorting ?: ImageVector.Builder(
                    name = "Sorting",
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
                    moveTo(3.016f, 5.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 4.016f, 6.0f)
                    lineTo(20.016f, 6.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 20.016f, 4.0f)
                    lineTo(4.015999999999998f, 4.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 3.0159999999999982f, 5.0f)
                    moveTo(3.0f, 12.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 4.0f, 13.0f)
                    lineTo(13.0f, 13.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 13.0f, 11.0f)
                    lineTo(4.0f, 11.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 3.0f, 12.0f)
                    moveTo(4.016f, 20.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = true, 4.016f, 18.0f)
                    lineTo(9.016f, 18.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = true, 9.016f, 20.0f)
                    close()
                    moveTo(19.015f, 17.792f)
                    lineTo(21.55f, 15.257000000000001f)
                    lineTo(22.964000000000002f, 16.671000000000003f)
                    lineTo(19.074f, 20.561000000000003f)
                    arcTo(1.5f, 1.5f, 45.07241357642326f, isMoreThanHalf = false, isPositiveArc = true, 18.014000000000003f, 20.999000000000002f)
                    curveTo(17.630000000000003f, 20.999000000000002f, 17.246000000000002f, 20.853f, 16.954000000000004f, 20.560000000000002f)
                    lineTo(13.064000000000004f, 16.671000000000003f)
                    lineTo(14.479000000000003f, 15.257000000000003f)
                    lineTo(17.015000000000004f, 17.794000000000004f)
                    lineTo(17.019000000000005f, 9.999000000000004f)
                    lineTo(19.019000000000005f, 10.000000000000004f)
                    close()
                }
            }.build().also {
                _sorting = it
            }
    }


private var _sorting: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun SortingIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Sorting.imageVector,
            contentDescription = null,
    )
}
