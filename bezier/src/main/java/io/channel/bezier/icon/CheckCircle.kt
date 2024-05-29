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

val BezierIcon.CheckCircle: ImageVector
    get() {
        return _checkCircle ?: ImageVector.Builder(
                name = "CheckCircle",
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
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.5226f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4767f, 22.0f, 2.0f, 17.5233f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4767f, 6.4767f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5226f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                close()
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 7.5816f, 16.4181f, 4.0f, 12.0f, 4.0f)
                curveTo(7.5813f, 4.0f, 4.0f, 7.5813f, 4.0f, 12.0f)
                curveTo(4.0f, 16.4187f, 7.5813f, 20.0f, 12.0f, 20.0f)
                curveTo(16.4181f, 20.0f, 20.0f, 16.4184f, 20.0f, 12.0f)
                close()
                moveTo(7.9711f, 11.2241f)
                lineTo(10.7544f, 13.8959f)
                lineTo(16.405f, 8.5865f)
                lineTo(17.7745f, 10.044f)
                lineTo(10.7396f, 16.6541f)
                lineTo(6.5861f, 12.6669f)
                lineTo(7.9711f, 11.2241f)
                close()
            }
        }.build().also {
            _checkCircle = it
        }
    }

private var _checkCircle: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CheckCircleIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.CheckCircle,
            contentDescription = null,
    )
}