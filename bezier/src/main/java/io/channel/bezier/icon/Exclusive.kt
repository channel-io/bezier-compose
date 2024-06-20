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

val BezierIcons.Exclusive: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _exclusive ?: ImageVector.Builder(
                    name = "Exclusive",
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
                    moveTo(8.366f, 10.505f)
                    lineTo(11.293f, 7.577000000000001f)
                    arcTo(1.0f, 1.0f, 44.991348337162f, isMoreThanHalf = false, isPositiveArc = false, 11.293f, 6.163000000000001f)
                    lineTo(8.366f, 3.236f)
                    arcTo(0.8f, 0.8f, 315.0318958890256f, isMoreThanHalf = false, isPositiveArc = false, 7.0f, 3.802f)
                    lineTo(7.0f, 6.0f)
                    arcTo(6.0f, 6.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = false, 7.0f, 18.0f)
                    lineTo(9.0f, 18.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 9.0f, 16.0f)
                    lineTo(7.0f, 16.0f)
                    arcTo(4.0f, 4.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 7.0f, 8.0f)
                    lineTo(7.0f, 9.939f)
                    arcTo(0.8f, 0.8f, 180.0450898590568f, isMoreThanHalf = false, isPositiveArc = false, 8.366f, 10.505f)
                    moveTo(13.016f, 7.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 14.016f, 8.0f)
                    lineTo(22.016f, 8.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 22.016f, 6.0f)
                    lineTo(14.015999999999998f, 6.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 13.015999999999998f, 7.0f)
                    moveTo(13.0f, 12.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 14.0f, 13.0f)
                    lineTo(22.0f, 13.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 22.0f, 11.0f)
                    lineTo(14.0f, 11.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 13.0f, 12.0f)
                    moveTo(22.016f, 18.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 22.016f, 16.0f)
                    lineTo(14.015999999999998f, 16.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = false, 14.015999999999998f, 18.0f)
                    close()
                }
            }.build().also {
                _exclusive = it
            }
    }


private var _exclusive: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ExclusiveIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Exclusive.imageVector,
            contentDescription = null,
    )
}
