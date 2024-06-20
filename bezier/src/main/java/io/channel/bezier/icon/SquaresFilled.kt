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

val BezierIcons.SquaresFilled: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _squaresFilled ?: ImageVector.Builder(
                    name = "SquaresFilled",
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
                    moveTo(6.0f, 7.0f)
                    arcTo(3.0f, 3.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 3.0f, 10.0f)
                    lineTo(3.0f, 18.0f)
                    arcTo(3.0f, 3.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 6.0f, 21.0f)
                    lineTo(14.0f, 21.0f)
                    arcTo(3.0f, 3.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 17.0f, 18.0f)
                    lineTo(10.0f, 18.0f)
                    arcTo(4.0f, 4.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 6.0f, 14.0f)
                    close()
                    moveTo(7.0f, 6.0f)
                    arcTo(3.0f, 3.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 10.0f, 3.0f)
                    lineTo(18.0f, 3.0f)
                    arcTo(3.0f, 3.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 21.0f, 6.0f)
                    lineTo(21.0f, 14.0f)
                    arcTo(3.0f, 3.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 18.0f, 17.0f)
                    lineTo(10.0f, 17.0f)
                    arcTo(3.0f, 3.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 7.0f, 14.0f)
                    close()
                }
            }.build().also {
                _squaresFilled = it
            }
    }


private var _squaresFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun SquaresFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.SquaresFilled.imageVector,
            contentDescription = null,
    )
}
