@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.compose.icon

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
import io.channel.bezier.compose.BezierIcon

val BezierIcon.WeatherRain: ImageVector
    get() {
        return _weatherRain ?: ImageVector.Builder(
                name = "WeatherRain",
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
                moveTo(6.0189f, 15.007f)
                lineTo(16.9209f, 15.007f)
                curveTo(19.1699f, 15.007f, 20.9999f, 13.177f, 20.9999f, 10.927f)
                curveTo(20.9999f, 8.677f, 19.1699f, 6.847f, 16.9209f, 6.847f)
                lineTo(15.7219f, 6.847f)
                lineTo(15.4329f, 6.353f)
                curveTo(14.7129f, 5.123f, 13.4479f, 4.39f, 12.0489f, 4.39f)
                curveTo(10.1159f, 4.39f, 8.4499f, 5.841f, 8.1719f, 7.765f)
                lineTo(8.0489f, 8.622f)
                lineTo(6.0189f, 8.622f)
                curveTo(4.3549f, 8.622f, 2.9999f, 9.977f, 2.9999f, 11.642f)
                lineTo(2.9999f, 11.986f)
                curveTo(2.9999f, 13.652f, 4.3549f, 15.007f, 6.0189f, 15.007f)
                close()
                moveTo(16.9209f, 4.847f)
                curveTo(20.2729f, 4.847f, 22.9999f, 7.574f, 22.9999f, 10.927f)
                curveTo(22.9999f, 14.153f, 20.4729f, 16.793f, 17.2949f, 16.988f)
                lineTo(14.7099f, 23.002f)
                lineTo(12.8719f, 22.213f)
                lineTo(15.1089f, 17.007f)
                lineTo(8.5579f, 17.007f)
                lineTo(5.9819f, 23.002f)
                lineTo(4.1439f, 22.213f)
                lineTo(6.3809f, 17.007f)
                lineTo(6.0189f, 17.007f)
                curveTo(3.2519f, 17.007f, 0.9999f, 14.755f, 0.9999f, 11.986f)
                lineTo(0.9999f, 11.642f)
                curveTo(0.9999f, 8.874f, 3.2519f, 6.622f, 6.0189f, 6.622f)
                lineTo(6.3819f, 6.622f)
                curveTo(7.1249f, 4.157f, 9.4239f, 2.39f, 12.0489f, 2.39f)
                curveTo(13.9379f, 2.39f, 15.7229f, 3.319f, 16.8349f, 4.847f)
                lineTo(16.9209f, 4.847f)
                close()
                moveTo(8.5082f, 22.2132f)
                lineTo(10.7452f, 17.0072f)
                lineTo(12.9222f, 17.0072f)
                lineTo(10.3452f, 23.0022f)
                lineTo(8.5082f, 22.2132f)
                close()
            }
        }.build().also {
            _weatherRain = it
        }
    }

private var _weatherRain: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun WeatherRainIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.WeatherRain,
            contentDescription = null,
    )
}
