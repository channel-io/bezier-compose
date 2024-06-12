@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

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
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons

val BezierIcons.Hashtag: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _hashtag ?: ImageVector.Builder(
                    name = "Hashtag",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                ) {
                    moveTo(10.6789f, 5.51612f)
                    curveTo(11.2223f, 5.61492f, 11.5827f, 6.1355f, 11.4839f, 6.67888f)
                    lineTo(11.2437f, 8.0f)
                    lineTo(14.2109f, 8.0f)
                    lineTo(14.5161f, 6.3211f)
                    curveTo(14.6149f, 5.77773f, 15.1355f, 5.41732f, 15.6789f, 5.51612f)
                    curveTo(16.2223f, 5.61492f, 16.5827f, 6.1355f, 16.4839f, 6.67888f)
                    lineTo(16.2437f, 8.0f)
                    lineTo(17.5f, 8.0f)
                    curveTo(18.0523f, 8.0f, 18.5f, 8.44772f, 18.5f, 9.0f)
                    curveTo(18.5f, 9.55228f, 18.0523f, 10.0f, 17.5f, 10.0f)
                    lineTo(15.88f, 10.0f)
                    lineTo(15.1527f, 14.0f)
                    lineTo(16.5f, 14.0f)
                    curveTo(17.0523f, 14.0f, 17.5f, 14.4477f, 17.5f, 15.0f)
                    curveTo(17.5f, 15.5523f, 17.0523f, 16.0f, 16.5f, 16.0f)
                    lineTo(14.7891f, 16.0f)
                    lineTo(14.4839f, 17.6789f)
                    curveTo(14.3851f, 18.2223f, 13.8645f, 18.5827f, 13.3211f, 18.4839f)
                    curveTo(12.7777f, 18.3851f, 12.4173f, 17.8645f, 12.5161f, 17.3211f)
                    lineTo(12.7563f, 16.0f)
                    lineTo(9.78911f, 16.0f)
                    lineTo(9.48386f, 17.6789f)
                    curveTo(9.38506f, 18.2223f, 8.86448f, 18.5827f, 8.3211f, 18.4839f)
                    curveTo(7.77773f, 18.3851f, 7.41732f, 17.8645f, 7.51612f, 17.3211f)
                    lineTo(7.75632f, 16.0f)
                    lineTo(6.5f, 16.0f)
                    curveTo(5.94772f, 16.0f, 5.5f, 15.5523f, 5.5f, 15.0f)
                    curveTo(5.5f, 14.4477f, 5.94772f, 14.0f, 6.5f, 14.0f)
                    lineTo(8.11996f, 14.0f)
                    lineTo(8.84723f, 10.0f)
                    lineTo(7.5f, 10.0f)
                    curveTo(6.94772f, 10.0f, 6.5f, 9.55228f, 6.5f, 9.0f)
                    curveTo(6.5f, 8.44772f, 6.94772f, 8.0f, 7.5f, 8.0f)
                    lineTo(9.21087f, 8.0f)
                    lineTo(9.51612f, 6.3211f)
                    curveTo(9.61492f, 5.77773f, 10.1355f, 5.41732f, 10.6789f, 5.51612f)
                    close()
                    moveTo(13.12f, 14.0f)
                    lineTo(13.8472f, 10.0f)
                    lineTo(10.88f, 10.0f)
                    lineTo(10.1527f, 14.0f)
                    lineTo(13.12f, 14.0f)
                    close()
                }
            }.build().also {
                _hashtag = it
            }
    }


private var _hashtag: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun HashtagIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Hashtag.imageVector,
            contentDescription = null,
    )
}
