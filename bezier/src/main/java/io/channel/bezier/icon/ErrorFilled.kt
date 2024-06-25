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

val BezierIcons.ErrorFilled: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _errorFilled ?: ImageVector.Builder(
                    name = "ErrorFilled",
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
                    moveTo(12.0f, 2.0f)
                    curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                    curveTo(2.0f, 17.514f, 6.486f, 22.0f, 12.0f, 22.0f)
                    curveTo(17.514f, 22.0f, 22.0f, 17.514f, 22.0f, 12.0f)
                    curveTo(22.0f, 6.486000000000001f, 17.515f, 2.0f, 12.0f, 2.0f)
                    moveTo(11.933f, 15.595f)
                    arcTo(1.322f, 1.322f, 269.9783386612739f, isMoreThanHalf = true, isPositiveArc = false, 11.934f, 18.240000000000002f)
                    arcTo(1.322f, 1.322f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 11.934f, 15.595000000000002f)
                    moveTo(13.148f, 5.980000000000002f)
                    lineTo(13.015f, 13.987000000000002f)
                    lineTo(10.853000000000002f, 13.987000000000002f)
                    lineTo(10.72f, 5.98f)
                    close()
                }
            }.build().also {
                _errorFilled = it
            }
    }


private var _errorFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ErrorFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ErrorFilled.imageVector,
            contentDescription = null,
    )
}
