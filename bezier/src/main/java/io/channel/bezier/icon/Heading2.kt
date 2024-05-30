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

val BezierIcons.Heading2: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _heading2 ?: ImageVector.Builder(
                    name = "Heading2",
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
                    moveTo(4.5f, 5.0f)
                    curveTo(4.22386f, 5.0f, 4.0f, 5.22386f, 4.0f, 5.5f)
                    lineTo(4.0f, 17.5f)
                    curveTo(4.0f, 17.7761f, 4.22386f, 18.0f, 4.5f, 18.0f)
                    lineTo(6.0f, 18.0f)
                    curveTo(6.27614f, 18.0f, 6.5f, 17.7761f, 6.5f, 17.5f)
                    lineTo(6.5f, 13.0f)
                    lineTo(11.5f, 13.0f)
                    lineTo(11.5f, 17.5f)
                    curveTo(11.5f, 17.7761f, 11.7239f, 18.0f, 12.0f, 18.0f)
                    lineTo(13.5f, 18.0f)
                    curveTo(13.7761f, 18.0f, 14.0f, 17.7761f, 14.0f, 17.5f)
                    lineTo(14.0f, 5.5f)
                    curveTo(14.0f, 5.22386f, 13.7761f, 5.0f, 13.5f, 5.0f)
                    lineTo(12.0f, 5.0f)
                    curveTo(11.7239f, 5.0f, 11.5f, 5.22386f, 11.5f, 5.5f)
                    lineTo(11.5f, 10.5f)
                    lineTo(6.5f, 10.5f)
                    lineTo(6.5f, 5.5f)
                    curveTo(6.5f, 5.22386f, 6.27614f, 5.0f, 6.0f, 5.0f)
                    lineTo(4.5f, 5.0f)
                    close()
                    moveTo(20.8933f, 12.4483f)
                    curveTo(19.6901f, 10.9014f, 17.3069f, 11.0518f, 16.3078f, 12.7378f)
                    lineTo(15.8946f, 13.4351f)
                    curveTo(15.7538f, 13.6726f, 15.8323f, 13.9793f, 16.0698f, 14.1201f)
                    lineTo(16.9301f, 14.6299f)
                    curveTo(17.1677f, 14.7707f, 17.4744f, 14.6922f, 17.6152f, 14.4547f)
                    lineTo(18.0284f, 13.7574f)
                    curveTo(18.3086f, 13.2845f, 18.9771f, 13.2423f, 19.3146f, 13.6762f)
                    curveTo(19.5428f, 13.9696f, 19.5322f, 14.3834f, 19.2891f, 14.6647f)
                    lineTo(15.958f, 18.5192f)
                    curveTo(15.1182f, 19.491f, 15.8085f, 21.0f, 17.0929f, 21.0f)
                    lineTo(21.0f, 21.0f)
                    curveTo(21.2761f, 21.0f, 21.5f, 20.7761f, 21.5f, 20.5f)
                    lineTo(21.5f, 19.5f)
                    curveTo(21.5f, 19.2239f, 21.2761f, 19.0f, 21.0f, 19.0f)
                    lineTo(18.1859f, 19.0f)
                    lineTo(20.8023f, 15.9724f)
                    curveTo(21.6689f, 14.9696f, 21.707f, 13.4945f, 20.8933f, 12.4483f)
                    close()
                }
            }.build().also {
                _heading2 = it
            }
    }


private var _heading2: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun Heading2IconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Heading2.imageVector,
            contentDescription = null,
    )
}