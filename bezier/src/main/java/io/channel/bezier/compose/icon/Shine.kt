@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.compose.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.compose.BezierIcon

val BezierIcon.Shine: ImageVector
    get() {
        return _shine ?: ImageVector.Builder(
                name = "Shine",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(17.7298f, 10.4638f)
                curveTo(17.6432f, 10.6659f, 17.3568f, 10.6659f, 17.2702f, 10.4638f)
                lineTo(16.15f, 7.85f)
                lineTo(13.5362f, 6.7298f)
                curveTo(13.3341f, 6.6432f, 13.3341f, 6.3568f, 13.5362f, 6.2702f)
                lineTo(16.15f, 5.15f)
                lineTo(17.2702f, 2.5362f)
                curveTo(17.3568f, 2.3341f, 17.6432f, 2.3341f, 17.7298f, 2.5362f)
                lineTo(18.85f, 5.15f)
                lineTo(21.4638f, 6.2702f)
                curveTo(21.6659f, 6.3568f, 21.6659f, 6.6432f, 21.4638f, 6.7298f)
                lineTo(18.85f, 7.85f)
                lineTo(17.7298f, 10.4638f)
                close()
                moveTo(10.2276f, 21.4993f)
                curveTo(10.1388f, 21.6947f, 9.8612f, 21.6947f, 9.7724f, 21.4993f)
                lineTo(7.5f, 16.5f)
                lineTo(2.5007f, 14.2276f)
                curveTo(2.3053f, 14.1388f, 2.3053f, 13.8612f, 2.5007f, 13.7724f)
                lineTo(7.5f, 11.5f)
                lineTo(9.7724f, 6.5007f)
                curveTo(9.8612f, 6.3053f, 10.1388f, 6.3053f, 10.2276f, 6.5007f)
                lineTo(12.5f, 11.5f)
                lineTo(17.4993f, 13.7724f)
                curveTo(17.6947f, 13.8612f, 17.6947f, 14.1388f, 17.4993f, 14.2276f)
                lineTo(12.5f, 16.5f)
                lineTo(10.2276f, 21.4993f)
                close()
            }
        }.build().also {
            _shine = it
        }
    }

private var _shine: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ShineIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Shine,
            contentDescription = null,
    )
}
