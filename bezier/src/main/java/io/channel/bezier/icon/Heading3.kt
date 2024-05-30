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

val BezierIcons.Heading3: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _heading3 ?: ImageVector.Builder(
                    name = "Heading3",
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
                    moveTo(16.977f, 15.4077f)
                    curveTo(16.977f, 15.1812f, 17.1582f, 15.0041f, 17.3843f, 14.9896f)
                    curveTo(17.5451f, 14.9793f, 17.6553f, 14.9649f, 17.6939f, 14.9565f)
                    curveTo(18.6629f, 14.746f, 19.0485f, 14.0138f, 18.9937f, 13.6307f)
                    curveTo(18.9524f, 13.3425f, 18.5224f, 12.8362f, 17.5649f, 13.0442f)
                    curveTo(17.3208f, 13.0972f, 17.0995f, 13.1922f, 16.9112f, 13.3133f)
                    curveTo(16.7719f, 13.403f, 16.5829f, 13.3963f, 16.4713f, 13.2738f)
                    lineTo(15.6633f, 12.3865f)
                    curveTo(15.4774f, 12.1824f, 15.4907f, 11.8632f, 15.7177f, 11.7058f)
                    curveTo(16.1327f, 11.418f, 16.616f, 11.2037f, 17.1404f, 11.0898f)
                    curveTo(18.7833f, 10.7329f, 20.7091f, 11.4999f, 20.9735f, 13.3473f)
                    curveTo(21.1234f, 14.3945f, 20.6572f, 15.3361f, 19.9096f, 16.0f)
                    curveTo(20.6572f, 16.6639f, 21.1234f, 17.6055f, 20.9735f, 18.6527f)
                    curveTo(20.7091f, 20.5001f, 18.7833f, 21.2671f, 17.1404f, 20.9102f)
                    curveTo(16.616f, 20.7963f, 16.1327f, 20.582f, 15.7177f, 20.2942f)
                    curveTo(15.4907f, 20.1368f, 15.4774f, 19.8176f, 15.6633f, 19.6135f)
                    lineTo(16.4713f, 18.7263f)
                    curveTo(16.5829f, 18.6038f, 16.7719f, 18.597f, 16.9112f, 18.6867f)
                    curveTo(17.0995f, 18.8079f, 17.3208f, 18.9028f, 17.5649f, 18.9558f)
                    curveTo(18.5224f, 19.1638f, 18.9524f, 18.6575f, 18.9937f, 18.3693f)
                    curveTo(19.0485f, 17.9862f, 18.6629f, 17.254f, 17.6939f, 17.0435f)
                    curveTo(17.6553f, 17.0351f, 17.5452f, 17.0208f, 17.3843f, 17.0104f)
                    curveTo(17.1582f, 16.9959f, 16.977f, 16.8188f, 16.977f, 16.5923f)
                    lineTo(16.977f, 15.4077f)
                    close()
                }
            }.build().also {
                _heading3 = it
            }
    }


private var _heading3: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun Heading3IconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Heading3.imageVector,
            contentDescription = null,
    )
}
