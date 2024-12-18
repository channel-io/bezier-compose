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

val BezierIcons.Heading2: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_heading_2
        override val imageVector: ImageVector
            get() = _heading2 ?: ImageVector.Builder(
                    name = "Heading2",
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
                    moveTo(4.5f, 5.0f)
                    arcTo(0.5f, 0.5f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 4.0f, 5.5f)
                    lineTo(4.0f, 17.5f)
                    arcTo(0.5f, 0.5f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 18.0f)
                    lineTo(6.0f, 18.0f)
                    arcTo(0.5f, 0.5f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 17.5f)
                    lineTo(6.5f, 13.0f)
                    lineTo(11.5f, 13.0f)
                    lineTo(11.5f, 17.5f)
                    arcTo(0.5f, 0.5f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 12.0f, 18.0f)
                    lineTo(13.5f, 18.0f)
                    arcTo(0.5f, 0.5f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 14.0f, 17.5f)
                    lineTo(14.0f, 5.5f)
                    arcTo(0.5f, 0.5f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 5.0f)
                    lineTo(12.0f, 5.0f)
                    arcTo(0.5f, 0.5f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 11.5f, 5.5f)
                    lineTo(11.5f, 10.5f)
                    lineTo(6.5f, 10.5f)
                    lineTo(6.5f, 5.5f)
                    arcTo(0.5f, 0.5f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 6.0f, 5.0f)
                    close()
                    moveTo(20.893f, 12.448f)
                    curveTo(19.69f, 10.901f, 17.307000000000002f, 11.052f, 16.308f, 12.738f)
                    lineTo(15.895f, 13.434999999999999f)
                    arcTo(0.5f, 0.5f, 210.66033228265906f, isMoreThanHalf = false, isPositiveArc = false, 16.07f, 14.12f)
                    lineTo(16.93f, 14.629999999999999f)
                    arcTo(0.5f, 0.5f, 120.66033228265889f, isMoreThanHalf = false, isPositiveArc = false, 17.615f, 14.454999999999998f)
                    lineTo(18.028f, 13.756999999999998f)
                    arcTo(0.78f, 0.78f, 210.68505017437587f, isMoreThanHalf = true, isPositiveArc = true, 19.288999999999998f, 14.664999999999997f)
                    lineTo(15.957999999999998f, 18.519f)
                    curveTo(15.117999999999999f, 19.491f, 15.807999999999998f, 21.0f, 17.093f, 21.0f)
                    lineTo(21.0f, 21.0f)
                    arcTo(0.5f, 0.5f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 21.5f, 20.5f)
                    lineTo(21.5f, 19.5f)
                    arcTo(0.5f, 0.5f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 21.0f, 19.0f)
                    lineTo(18.186f, 19.0f)
                    lineTo(20.802f, 15.972f)
                    arcTo(2.78f, 2.78f, 40.82686740951906f, isMoreThanHalf = false, isPositiveArc = false, 20.893f, 12.448f)
                }
            }.build().also {
                _heading2 = it
            }
    }


private var _heading2: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun Heading2IconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Heading2.imageVector,
            contentDescription = null,
    )
}
