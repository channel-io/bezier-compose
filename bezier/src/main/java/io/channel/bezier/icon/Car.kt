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

val BezierIcons.Car: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_car
        override val imageVector: ImageVector
            get() = _car ?: ImageVector.Builder(
                    name = "Car",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(5.0f, 13.5f)
                    arcTo(1.5f, 1.5f, 180.0f, isMoreThanHalf = true, isPositiveArc = true, 8.0f, 13.5f)
                    arcTo(1.5f, 1.5f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 5.0f, 13.5f)
                    moveTo(17.5f, 12.0f)
                    arcTo(1.5f, 1.5f, 270.0f, isMoreThanHalf = true, isPositiveArc = false, 17.5f, 15.0f)
                    arcTo(1.5f, 1.5f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 17.5f, 12.0f)
                }

                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(14.962f, 3.0f)
                    arcTo(5.0f, 5.0f, 269.9905826251062f, isMoreThanHalf = false, isPositiveArc = true, 19.776f, 6.646f)
                    lineTo(20.744f, 10.089f)
                    arcTo(4.0f, 4.0f, 313.314301446972f, isMoreThanHalf = false, isPositiveArc = true, 22.0f, 13.0f)
                    lineTo(22.0f, 17.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 21.0f, 18.0f)
                    lineTo(21.0f, 20.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 20.0f, 21.0f)
                    lineTo(18.0f, 21.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 17.0f, 20.0f)
                    lineTo(17.0f, 18.0f)
                    lineTo(7.0f, 18.0f)
                    lineTo(7.0f, 20.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 6.0f, 21.0f)
                    lineTo(4.0f, 21.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 3.0f, 20.0f)
                    lineTo(3.0f, 18.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 2.0f, 17.0f)
                    lineTo(2.0f, 13.0f)
                    curveTo(2.0f, 11.853f, 2.483f, 10.818999999999999f, 3.2560000000000002f, 10.09f)
                    lineTo(4.224f, 6.646f)
                    arcTo(5.0f, 5.0f, 195.7118762445211f, isMoreThanHalf = false, isPositiveArc = true, 9.038f, 3.0f)
                    close()
                    moveTo(18.36f, 9.0f)
                    lineTo(17.85f, 7.188f)
                    arcTo(3.0f, 3.0f, 344.30669417310423f, isMoreThanHalf = false, isPositiveArc = false, 15.144000000000002f, 5.005f)
                    lineTo(14.963f, 5.0f)
                    lineTo(9.038f, 5.0f)
                    arcTo(3.0f, 3.0f, 270.0126435323481f, isMoreThanHalf = false, isPositiveArc = false, 6.204000000000001f, 7.013999999999999f)
                    lineTo(6.15f, 7.188f)
                    lineTo(5.639f, 9.0f)
                    close()
                    moveTo(6.0f, 11.0f)
                    arcTo(2.0f, 2.0f, 270.0181319644869f, isMoreThanHalf = false, isPositiveArc = false, 4.005f, 12.85f)
                    lineTo(4.0f, 13.0f)
                    lineTo(4.0f, 16.0f)
                    lineTo(20.0f, 16.0f)
                    lineTo(20.0f, 13.0f)
                    arcTo(2.0f, 2.0f, 0.018131964495591554f, isMoreThanHalf = false, isPositiveArc = false, 18.15f, 11.004999999999999f)
                    lineTo(18.0f, 11.0f)
                    close()
                }
            }.build().also {
                _car = it
            }
    }


private var _car: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CarIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Car.imageVector,
            contentDescription = null,
    )
}
