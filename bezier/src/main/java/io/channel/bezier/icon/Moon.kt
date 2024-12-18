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

val BezierIcons.Moon: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_moon
        override val imageVector: ImageVector
            get() = _moon ?: ImageVector.Builder(
                    name = "Moon",
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
                    moveTo(9.778f, 2.899f)
                    arcTo(1.56f, 1.56f, 319.390354385399f, isMoreThanHalf = false, isPositiveArc = true, 10.038f, 4.504f)
                    arcTo(7.255f, 7.255f, 202.2082730690864f, isMoreThanHalf = false, isPositiveArc = false, 19.497f, 13.963f)
                    arcTo(1.56f, 1.56f, 247.78910676708904f, isMoreThanHalf = false, isPositiveArc = true, 21.101f, 14.222f)
                    curveTo(21.531f, 14.591999999999999f, 21.782999999999998f, 15.245999999999999f, 21.491f, 15.911999999999999f)
                    arcTo(10.17f, 10.17f, 23.6642564408692f, isMoreThanHalf = false, isPositiveArc = true, 12.171f, 22.0f)
                    curveTo(6.554f, 22.0f, 2.0f, 17.446f, 2.0f, 11.828f)
                    curveTo(2.0f, 7.661f, 4.505f, 4.082f, 8.087f, 2.51f)
                    arcTo(1.444f, 1.444f, 246.02641549804866f, isMoreThanHalf = false, isPositiveArc = true, 9.778f, 2.899f)
                    moveTo(7.796f, 4.925f)
                    arcTo(8.172f, 8.172f, 237.5686982654472f, isMoreThanHalf = true, isPositiveArc = false, 19.076f, 16.205f)
                    arcTo(9.255f, 9.255f, 75.47820043393098f, isMoreThanHalf = false, isPositiveArc = true, 7.796000000000001f, 4.924999999999999f)
                }
            }.build().also {
                _moon = it
            }
    }


private var _moon: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun MoonIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Moon.imageVector,
            contentDescription = null,
    )
}
