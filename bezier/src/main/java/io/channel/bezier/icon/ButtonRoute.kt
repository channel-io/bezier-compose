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

val BezierIcons.ButtonRoute: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_button_route
        override val imageVector: ImageVector
            get() = _buttonRoute ?: ImageVector.Builder(
                    name = "ButtonRoute",
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
                    moveTo(4.0f, 4.0f)
                    lineTo(4.0f, 3.0f)
                    lineTo(2.0f, 3.0f)
                    lineTo(2.0f, 15.0f)
                    arcTo(3.0f, 3.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 5.0f, 18.0f)
                    lineTo(8.0f, 18.0f)
                    lineTo(8.0f, 16.0f)
                    lineTo(5.0f, 16.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 4.0f, 15.0f)
                    lineTo(4.0f, 9.83f)
                    curveTo(4.313f, 9.94f, 4.65f, 10.0f, 5.0f, 10.0f)
                    lineTo(8.0f, 10.0f)
                    lineTo(8.0f, 8.0f)
                    lineTo(5.0f, 8.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 4.0f, 7.0f)
                    close()
                    moveTo(9.0f, 8.0f)
                    arcTo(2.0f, 2.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 11.0f, 6.0f)
                    lineTo(20.0f, 6.0f)
                    arcTo(2.0f, 2.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 22.0f, 8.0f)
                    lineTo(22.0f, 10.0f)
                    arcTo(2.0f, 2.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 20.0f, 12.0f)
                    lineTo(11.0f, 12.0f)
                    arcTo(2.0f, 2.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 9.0f, 10.0f)
                    close()
                    moveTo(11.0f, 14.0f)
                    arcTo(2.0f, 2.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 9.0f, 16.0f)
                    lineTo(9.0f, 18.0f)
                    arcTo(2.0f, 2.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 11.0f, 20.0f)
                    lineTo(20.0f, 20.0f)
                    arcTo(2.0f, 2.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 22.0f, 18.0f)
                    lineTo(22.0f, 16.0f)
                    arcTo(2.0f, 2.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 20.0f, 14.0f)
                    close()
                }
            }.build().also {
                _buttonRoute = it
            }
    }


private var _buttonRoute: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ButtonRouteIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ButtonRoute.imageVector,
            contentDescription = null,
    )
}
