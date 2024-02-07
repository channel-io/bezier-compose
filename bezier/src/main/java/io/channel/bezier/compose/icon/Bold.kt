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

val BezierIcon.Bold: ImageVector
    get() {
        return _bold ?: ImageVector.Builder(
                name = "Bold",
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
                moveTo(6.0f, 3.0f)
                curveTo(5.4477f, 3.0f, 5.0f, 3.4477f, 5.0f, 4.0f)
                lineTo(5.0f, 20.0f)
                curveTo(5.0f, 20.5523f, 5.4477f, 21.0f, 6.0f, 21.0f)
                lineTo(14.0f, 21.0f)
                curveTo(17.0376f, 21.0f, 19.5f, 18.5376f, 19.5f, 15.5f)
                curveTo(19.5f, 13.7352f, 18.6688f, 12.1646f, 17.3766f, 11.1581f)
                curveTo(18.0788f, 10.2971f, 18.5f, 9.1978f, 18.5f, 8.0f)
                curveTo(18.5f, 5.2386f, 16.2614f, 3.0f, 13.5f, 3.0f)
                lineTo(6.0f, 3.0f)
                close()
                moveTo(13.5f, 10.0f)
                curveTo(14.6046f, 10.0f, 15.5f, 9.1046f, 15.5f, 8.0f)
                curveTo(15.5f, 6.8954f, 14.6046f, 6.0f, 13.5f, 6.0f)
                lineTo(8.0f, 6.0f)
                lineTo(8.0f, 10.0f)
                lineTo(13.5f, 10.0f)
                close()
                moveTo(8.0f, 13.0f)
                lineTo(8.0f, 18.0f)
                lineTo(14.0f, 18.0f)
                curveTo(15.3807f, 18.0f, 16.5f, 16.8807f, 16.5f, 15.5f)
                curveTo(16.5f, 14.1193f, 15.3807f, 13.0f, 14.0f, 13.0f)
                lineTo(8.0f, 13.0f)
                close()
            }
        }.build().also {
            _bold = it
        }
    }

private var _bold: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun BoldIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Bold,
            contentDescription = null,
    )
}
