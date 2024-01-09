@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.compose.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.compose.BezierIcon

val BezierIcon.CheckAll: ImageVector
    get() {
        return _checkAll ?: ImageVector.Builder(
                name = "CheckAll",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(23.2975f, 5.7028f)
                curveTo(22.9092f, 5.3145f, 22.2798f, 5.3145f, 21.8915f, 5.7028f)
                lineTo(11.3665f, 16.2278f)
                lineTo(7.0725f, 11.9338f)
                curveTo(6.6848f, 11.5461f, 6.0561f, 11.546f, 5.6682f, 11.9336f)
                curveTo(5.2802f, 12.3214f, 5.28f, 12.9504f, 5.6679f, 13.3383f)
                lineTo(10.6595f, 18.3306f)
                curveTo(11.05f, 18.7212f, 11.6831f, 18.7212f, 12.0737f, 18.3307f)
                lineTo(23.2974f, 7.1088f)
                curveTo(23.6857f, 6.7205f, 23.6857f, 6.091f, 23.2975f, 5.7028f)
                close()
                moveTo(18.3322f, 5.7028f)
                curveTo(17.944f, 5.3145f, 17.3145f, 5.3146f, 16.9263f, 5.7028f)
                lineTo(10.6617f, 11.9683f)
                curveTo(10.2737f, 12.3563f, 10.2737f, 12.9853f, 10.6617f, 13.3733f)
                curveTo(11.0497f, 13.7613f, 11.6787f, 13.7613f, 12.0668f, 13.3733f)
                lineTo(18.3322f, 7.1087f)
                curveTo(18.7204f, 6.7205f, 18.7205f, 6.0911f, 18.3322f, 5.7028f)
                close()
                moveTo(0.7025f, 13.3388f)
                curveTo(0.3145f, 12.9508f, 0.3145f, 12.3218f, 0.7025f, 11.9338f)
                curveTo(1.0905f, 11.5458f, 1.7195f, 11.5458f, 2.1075f, 11.9338f)
                lineTo(7.1045f, 16.9308f)
                curveTo(7.4925f, 17.3188f, 7.4925f, 17.9478f, 7.1045f, 18.3358f)
                curveTo(6.7165f, 18.7238f, 6.0875f, 18.7238f, 5.6995f, 18.3358f)
                lineTo(0.7025f, 13.3388f)
                close()
            }
        }.build().also {
            _checkAll = it
        }
    }

private var _checkAll: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CheckAllIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.CheckAll,
            contentDescription = null,
    )
}
