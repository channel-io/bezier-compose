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

val BezierIcons.PageDownload: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _pageDownload ?: ImageVector.Builder(
                    name = "PageDownload",
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
                    moveTo(6.0f, 5.0f)
                    curveTo(6.0f, 4.44772f, 6.44772f, 4.0f, 7.0f, 4.0f)
                    lineTo(11.0f, 4.0f)
                    lineTo(11.0f, 9.0f)
                    curveTo(11.0f, 10.1046f, 11.8954f, 11.0f, 13.0f, 11.0f)
                    lineTo(20.0f, 11.0f)
                    lineTo(20.0f, 10.0f)
                    curveTo(20.0f, 9.73478f, 19.8946f, 9.48043f, 19.7071f, 9.29289f)
                    lineTo(12.7071f, 2.29289f)
                    curveTo(12.5196f, 2.10536f, 12.2652f, 2.0f, 12.0f, 2.0f)
                    lineTo(7.0f, 2.0f)
                    curveTo(5.34315f, 2.0f, 4.0f, 3.34315f, 4.0f, 5.0f)
                    lineTo(4.0f, 19.0f)
                    curveTo(4.0f, 20.6569f, 5.34315f, 22.0f, 7.0f, 22.0f)
                    lineTo(13.0f, 22.0f)
                    lineTo(13.0f, 20.0f)
                    lineTo(7.0f, 20.0f)
                    curveTo(6.44772f, 20.0f, 6.0f, 19.5523f, 6.0f, 19.0f)
                    lineTo(6.0f, 5.0f)
                    close()
                    moveTo(16.5858f, 9.0f)
                    lineTo(13.0f, 5.41421f)
                    lineTo(13.0f, 9.0f)
                    lineTo(16.5858f, 9.0f)
                    close()
                }

                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                ) {
                    moveTo(21.793f, 16.7929f)
                    lineTo(20.0001f, 18.5858f)
                    lineTo(20.0001f, 13.0f)
                    lineTo(18.0001f, 13.0f)
                    lineTo(18.0001f, 18.5858f)
                    lineTo(16.2072f, 16.7929f)
                    lineTo(14.793f, 18.2071f)
                    lineTo(18.293f, 21.7071f)
                    curveTo(18.6835f, 22.0976f, 19.3167f, 22.0976f, 19.7072f, 21.7071f)
                    lineTo(23.2072f, 18.2071f)
                    lineTo(21.793f, 16.7929f)
                    close()
                }
            }.build().also {
                _pageDownload = it
            }
    }


private var _pageDownload: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun PageDownloadIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.PageDownload.imageVector,
            contentDescription = null,
    )
}
