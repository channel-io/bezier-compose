@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.compose.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.compose.BezierIcon

val BezierIcon.Shuffle: ImageVector
    get() {
        return _shuffle ?: ImageVector.Builder(
                name = "Shuffle",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(17.0f, 10.0686f)
                lineTo(17.0f, 8.0f)
                lineTo(16.0826f, 8.0f)
                curveTo(15.1037f, 8.0f, 14.1863f, 8.4776f, 13.6249f, 9.2796f)
                lineTo(9.0135f, 15.8673f)
                curveTo(8.0779f, 17.2039f, 6.549f, 18.0f, 4.9174f, 18.0f)
                lineTo(3.0f, 18.0f)
                curveTo(2.4477f, 18.0f, 2.0f, 17.5523f, 2.0f, 17.0f)
                curveTo(2.0f, 16.4477f, 2.4477f, 16.0f, 3.0f, 16.0f)
                lineTo(4.9174f, 16.0f)
                curveTo(5.8963f, 16.0f, 6.8137f, 15.5224f, 7.3751f, 14.7204f)
                lineTo(11.9865f, 8.1327f)
                curveTo(12.9221f, 6.7961f, 14.4511f, 6.0f, 16.0826f, 6.0f)
                lineTo(17.0f, 6.0f)
                lineTo(17.0f, 3.9314f)
                curveTo(17.0f, 3.2186f, 17.8617f, 2.8617f, 18.3657f, 3.3657f)
                lineTo(21.2929f, 6.2929f)
                curveTo(21.6834f, 6.6834f, 21.6834f, 7.3166f, 21.2929f, 7.7071f)
                lineTo(18.3657f, 10.6343f)
                curveTo(17.8617f, 11.1383f, 17.0f, 10.7813f, 17.0f, 10.0686f)
                close()
                moveTo(9.0135f, 8.1327f)
                lineTo(9.8897f, 9.3843f)
                lineTo(8.669f, 11.1281f)
                lineTo(7.3751f, 9.2796f)
                curveTo(6.8137f, 8.4776f, 5.8963f, 8.0f, 4.9174f, 8.0f)
                lineTo(3.0f, 8.0f)
                curveTo(2.4477f, 8.0f, 2.0f, 7.5523f, 2.0f, 7.0f)
                curveTo(2.0f, 6.4477f, 2.4477f, 6.0f, 3.0f, 6.0f)
                lineTo(4.9174f, 6.0f)
                curveTo(6.549f, 6.0f, 8.0779f, 6.7961f, 9.0135f, 8.1327f)
                close()
                moveTo(11.9865f, 15.8673f)
                lineTo(11.1103f, 14.6157f)
                lineTo(12.331f, 12.8719f)
                lineTo(13.6249f, 14.7204f)
                curveTo(14.1863f, 15.5224f, 15.1037f, 16.0f, 16.0826f, 16.0f)
                lineTo(17.0f, 16.0f)
                lineTo(17.0f, 13.9316f)
                curveTo(17.0f, 13.2189f, 17.8617f, 12.862f, 18.3657f, 13.3659f)
                lineTo(21.2929f, 16.2931f)
                curveTo(21.6834f, 16.6837f, 21.6834f, 17.3168f, 21.2929f, 17.7073f)
                lineTo(18.3657f, 20.6346f)
                curveTo(17.8617f, 21.1385f, 17.0f, 20.7816f, 17.0f, 20.0689f)
                lineTo(17.0f, 18.0f)
                lineTo(16.0826f, 18.0f)
                curveTo(14.4511f, 18.0f, 12.9221f, 17.2039f, 11.9865f, 15.8673f)
                close()
            }
        }.build().also {
            _shuffle = it
        }
    }

private var _shuffle: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ShuffleIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Shuffle,
            contentDescription = null,
    )
}
