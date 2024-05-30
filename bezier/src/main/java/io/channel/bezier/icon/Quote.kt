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

val BezierIcons.Quote: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _quote ?: ImageVector.Builder(
                    name = "Quote",
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
                    moveTo(11.4963f, 5.06703f)
                    curveTo(11.4963f, 5.69269f, 10.9846f, 6.18911f, 10.3692f, 6.30157f)
                    curveTo(8.28157f, 6.68302f, 6.55728f, 8.10483f, 5.75333f, 10.01f)
                    curveTo(5.83468f, 10.0034f, 5.91694f, 10.0f, 6.0f, 10.0f)
                    lineTo(8.0f, 10.0f)
                    curveTo(9.65685f, 10.0f, 11.0f, 11.3431f, 11.0f, 13.0f)
                    lineTo(11.0f, 15.0f)
                    curveTo(11.0f, 16.6569f, 9.65685f, 18.0f, 8.0f, 18.0f)
                    lineTo(6.0f, 18.0f)
                    curveTo(4.34315f, 18.0f, 3.0f, 16.6569f, 3.0f, 15.0f)
                    lineTo(3.0f, 14.2411f)
                    lineTo(3.0f, 13.0f)
                    lineTo(3.0f, 12.4305f)
                    curveTo(3.0f, 8.12129f, 6.20806f, 4.56135f, 10.3662f, 4.0087f)
                    curveTo(10.9864f, 3.92626f, 11.4963f, 4.44138f, 11.4963f, 5.06703f)
                    close()
                    moveTo(20.9963f, 5.06703f)
                    curveTo(20.9963f, 5.69269f, 20.4846f, 6.18911f, 19.8692f, 6.30157f)
                    curveTo(17.7816f, 6.68302f, 16.0573f, 8.10483f, 15.2533f, 10.01f)
                    curveTo(15.3347f, 10.0034f, 15.4169f, 9.99999f, 15.5f, 9.99999f)
                    lineTo(17.5f, 9.99999f)
                    curveTo(19.1569f, 9.99999f, 20.5f, 11.3431f, 20.5f, 13.0f)
                    lineTo(20.5f, 15.0f)
                    curveTo(20.5f, 16.6568f, 19.1569f, 18.0f, 17.5f, 18.0f)
                    lineTo(15.5f, 18.0f)
                    curveTo(13.8431f, 18.0f, 12.5f, 16.6568f, 12.5f, 15.0f)
                    lineTo(12.5f, 14.2411f)
                    lineTo(12.5f, 13.0f)
                    lineTo(12.5f, 12.4305f)
                    curveTo(12.5f, 8.12129f, 15.7081f, 4.56135f, 19.8662f, 4.0087f)
                    curveTo(20.4864f, 3.92626f, 20.9963f, 4.44138f, 20.9963f, 5.06703f)
                    close()
                }
            }.build().also {
                _quote = it
            }
    }


private var _quote: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun QuoteIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Quote.imageVector,
            contentDescription = null,
    )
}