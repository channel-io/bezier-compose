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

val BezierIcon.Timezone: ImageVector
    get() {
        return _timezone ?: ImageVector.Builder(
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
                moveTo(18.7562f, 5.332f)
                curveTo(15.7162f, 0.889f, 9.2842f, 0.889f, 6.2432f, 5.332f)
                curveTo(4.4822f, 7.905f, 4.6462f, 11.345f, 6.3892f, 13.931f)
                lineTo(12.0562f, 22.339f)
                curveTo(12.2682f, 22.655f, 12.7322f, 22.655f, 12.9442f, 22.339f)
                lineTo(18.6102f, 13.931f)
                curveTo(20.3532f, 11.345f, 20.5182f, 7.905f, 18.7562f, 5.332f)
                close()
                moveTo(18.0f, 9.5f)
                curveTo(18.0f, 12.5376f, 15.5376f, 15.0f, 12.5f, 15.0f)
                curveTo(9.4624f, 15.0f, 7.0f, 12.5376f, 7.0f, 9.5f)
                curveTo(7.0f, 6.4624f, 9.4624f, 4.0f, 12.5f, 4.0f)
                curveTo(15.5376f, 4.0f, 18.0f, 6.4624f, 18.0f, 9.5f)
                close()
                moveTo(13.5f, 6.0f)
                curveTo(13.5f, 5.4477f, 13.0523f, 5.0f, 12.5f, 5.0f)
                curveTo(11.9477f, 5.0f, 11.5f, 5.4477f, 11.5f, 6.0f)
                lineTo(11.5f, 9.5f)
                curveTo(11.5f, 9.8513f, 11.6843f, 10.1768f, 11.9855f, 10.3575f)
                lineTo(14.4855f, 11.8575f)
                curveTo(14.9591f, 12.1416f, 15.5733f, 11.9881f, 15.8575f, 11.5145f)
                curveTo(16.1416f, 11.0409f, 15.9881f, 10.4267f, 15.5145f, 10.1425f)
                lineTo(13.5f, 8.9338f)
                lineTo(13.5f, 6.0f)
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
            imageVector = BezierIcon.Timezone,
            contentDescription = null,
    )
}
