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

val BezierIcons.MinusCircle: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_minus_circle
        override val imageVector: ImageVector
            get() = _minusCircle ?: ImageVector.Builder(
                    name = "MinusCircle",
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
                    moveTo(8.0f, 11.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = false, 8.0f, 13.0f)
                    lineTo(16.0f, 13.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 16.0f, 11.0f)
                    close()
                }
            }.build().also {
                _minusCircle = it
            }
    }


private var _minusCircle: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun MinusCircleIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.MinusCircle.imageVector,
            contentDescription = null,
    )
}
