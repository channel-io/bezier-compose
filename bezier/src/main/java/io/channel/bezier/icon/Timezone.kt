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

val BezierIcons.Timezone: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_timezone
        override val imageVector: ImageVector
            get() = _timezone ?: ImageVector.Builder(
                    name = "Timezone",
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
                    moveTo(18.756f, 5.332f)
                    arcTo(7.54f, 7.54f, 326.07558434306037f, isMoreThanHalf = false, isPositiveArc = false, 6.243f, 5.332f)
                    curveTo(4.4830000000000005f, 7.904999999999999f, 4.646000000000001f, 11.344999999999999f, 6.389f, 13.931000000000001f)
                    lineTo(12.056000000000001f, 22.339f)
                    arcTo(0.534f, 0.534f, 146.2490782230518f, isMoreThanHalf = false, isPositiveArc = false, 12.944f, 22.339f)
                    lineTo(18.61f, 13.931f)
                    curveTo(20.352999999999998f, 11.344999999999999f, 20.518f, 7.904999999999999f, 18.756f, 5.331999999999999f)
                    moveTo(18.0f, 9.5f)
                    arcTo(5.5f, 5.5f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 7.0f, 9.5f)
                    arcTo(5.5f, 5.5f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 18.0f, 9.5f)
                    moveTo(13.5f, 6.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = true, isPositiveArc = false, 11.5f, 6.0f)
                    lineTo(11.5f, 9.5f)
                    arcTo(1.0f, 1.0f, 179.95471505575156f, isMoreThanHalf = false, isPositiveArc = false, 11.986f, 10.357f)
                    lineTo(14.486f, 11.857f)
                    arcTo(1.0f, 1.0f, 118.84437088824265f, isMoreThanHalf = false, isPositiveArc = false, 15.514000000000001f, 10.142999999999999f)
                    lineTo(13.5f, 8.933f)
                    close()
                }
            }.build().also {
                _timezone = it
            }
    }


private var _timezone: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TimezoneIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Timezone.imageVector,
            contentDescription = null,
    )
}
