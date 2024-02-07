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

val BezierIcon.Headset: ImageVector
    get() {
        return _headset ?: ImageVector.Builder(
                name = "Headset",
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
                moveTo(12.0f, 2.0f)
                curveTo(16.411f, 2.0f, 20.0f, 5.589f, 20.0f, 10.0f)
                lineTo(20.0f, 17.0f)
                curveTo(20.0f, 17.552f, 19.552f, 18.0f, 19.0f, 18.0f)
                lineTo(16.5f, 18.0f)
                curveTo(15.673f, 18.0f, 15.0f, 17.327f, 15.0f, 16.5f)
                lineTo(15.0f, 11.5f)
                curveTo(15.0f, 10.673f, 15.673f, 10.0f, 16.5f, 10.0f)
                lineTo(18.0f, 10.0f)
                curveTo(18.0f, 6.691f, 15.309f, 4.0f, 12.0f, 4.0f)
                curveTo(8.691f, 4.0f, 6.0f, 6.691f, 6.0f, 10.0f)
                lineTo(7.5f, 10.0f)
                curveTo(8.327f, 10.0f, 9.0f, 10.673f, 9.0f, 11.5f)
                lineTo(9.0f, 16.5f)
                curveTo(9.0f, 17.327f, 8.327f, 18.0f, 7.5f, 18.0f)
                lineTo(6.0f, 18.0f)
                lineTo(6.0f, 19.0f)
                curveTo(6.0f, 19.551f, 6.449f, 20.0f, 7.0f, 20.0f)
                lineTo(11.0f, 20.0f)
                curveTo(11.5523f, 20.0f, 12.0f, 20.4477f, 12.0f, 21.0f)
                curveTo(12.0f, 21.5523f, 11.5523f, 22.0f, 11.0f, 22.0f)
                lineTo(7.0f, 22.0f)
                curveTo(5.346f, 22.0f, 4.0f, 20.654f, 4.0f, 19.0f)
                lineTo(4.0f, 10.0f)
                curveTo(4.0f, 5.589f, 7.589f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }.build().also {
            _headset = it
        }
    }

private var _headset: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun HeadsetIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Headset,
            contentDescription = null,
    )
}
