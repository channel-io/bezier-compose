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

val BezierIcons.ErrorDiamondFilled: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_error_diamond_filled
        override val imageVector: ImageVector
            get() = _errorDiamondFilled ?: ImageVector.Builder(
                    name = "ErrorDiamondFilled",
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
                    moveTo(6.343f, 4.657f)
                    curveTo(8.323f, 2.677f, 9.313f, 1.6869999999999998f, 10.455f, 1.3159999999999998f)
                    arcTo(5.0f, 5.0f, 252.00102381206236f, isMoreThanHalf = false, isPositiveArc = true, 13.545f, 1.3159999999999998f)
                    curveTo(14.687f, 1.686f, 15.677f, 2.676f, 17.657f, 4.656f)
                    lineTo(19.343f, 6.343f)
                    curveTo(21.323f, 8.323f, 22.313f, 9.313f, 22.684f, 10.455f)
                    arcTo(5.0f, 5.0f, 342.0010238120624f, isMoreThanHalf = false, isPositiveArc = true, 22.684f, 13.545f)
                    curveTo(22.314f, 14.687f, 21.324f, 15.677f, 19.344f, 17.657f)
                    lineTo(17.657f, 19.343f)
                    curveTo(15.677f, 21.323f, 14.687f, 22.313f, 13.545f, 22.684f)
                    arcTo(5.0f, 5.0f, 72.00102381206236f, isMoreThanHalf = false, isPositiveArc = true, 10.455f, 22.684f)
                    curveTo(9.313f, 22.314f, 8.323f, 21.324f, 6.343f, 19.344f)
                    lineTo(4.657f, 17.657f)
                    curveTo(2.677f, 15.677f, 1.6869999999999998f, 14.687f, 1.3159999999999998f, 13.545f)
                    arcTo(5.0f, 5.0f, 162.00102381206239f, isMoreThanHalf = false, isPositiveArc = true, 1.3159999999999998f, 10.455f)
                    curveTo(1.686f, 9.313f, 2.676f, 8.323f, 4.656f, 6.343f)
                    close()
                    moveTo(12.001f, 18.8f)
                    arcTo(1.4f, 1.4f, 90.0f, isMoreThanHalf = true, isPositiveArc = true, 12.001f, 15.999f)
                    arcTo(1.4f, 1.4f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 12.001f, 18.8f)
                    moveTo(12.0f, 6.0f)
                    arcTo(1.41f, 1.41f, 269.9466312037831f, isMoreThanHalf = false, isPositiveArc = false, 10.594f, 7.497f)
                    lineTo(10.937999999999999f, 13.001999999999999f)
                    arcTo(1.064f, 1.064f, 176.48641983994528f, isMoreThanHalf = false, isPositiveArc = false, 13.062f, 13.001999999999999f)
                    lineTo(13.405999999999999f, 7.496999999999999f)
                    arcTo(1.41f, 1.41f, 3.5375434763154434f, isMoreThanHalf = false, isPositiveArc = false, 12.0f, 6.0f)
                }
            }.build().also {
                _errorDiamondFilled = it
            }
    }


private var _errorDiamondFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ErrorDiamondFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ErrorDiamondFilled.imageVector,
            contentDescription = null,
    )
}
