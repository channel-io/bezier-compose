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

val BezierIcons.AsteriskSmall: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _asteriskSmall ?: ImageVector.Builder(
                    name = "AsteriskSmall",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                ) {
                    moveTo(12.0f, 5.5f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 13.0f, 6.5f)
                    lineTo(13.0f, 10.268f)
                    lineTo(16.262999999999998f, 8.384f)
                    arcTo(1.0f, 1.0f, 239.61921222659703f, isMoreThanHalf = true, isPositiveArc = true, 17.262999999999998f, 10.116f)
                    lineTo(14.0f, 12.0f)
                    lineTo(17.262999999999998f, 13.884f)
                    arcTo(1.0f, 1.0f, 299.6206677882518f, isMoreThanHalf = true, isPositiveArc = true, 16.262999999999998f, 15.616f)
                    lineTo(13.0f, 13.732f)
                    lineTo(13.0f, 17.5f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 11.0f, 17.5f)
                    lineTo(11.0f, 13.732f)
                    lineTo(7.737f, 15.616f)
                    arcTo(1.0f, 1.0f, 59.61921222659702f, isMoreThanHalf = true, isPositiveArc = true, 6.737f, 13.884f)
                    lineTo(10.0f, 12.0f)
                    lineTo(6.737f, 10.116f)
                    arcTo(1.0f, 1.0f, 119.62066778825178f, isMoreThanHalf = true, isPositiveArc = true, 7.737f, 8.384f)
                    lineTo(11.0f, 10.268f)
                    lineTo(11.0f, 6.5f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 12.0f, 5.5f)
                }
            }.build().also {
                _asteriskSmall = it
            }
    }


private var _asteriskSmall: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun AsteriskSmallIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.AsteriskSmall.imageVector,
            contentDescription = null,
    )
}
