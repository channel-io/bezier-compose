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

val BezierIcon.AsteriskSmall: ImageVector
    get() {
        return _asteriskSmall ?: ImageVector.Builder(
                name = "AsteriskSmall",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(12.0f, 5.5f)
                curveTo(12.5523f, 5.5f, 13.0f, 5.9477f, 13.0f, 6.5f)
                lineTo(13.0f, 10.268f)
                lineTo(16.2632f, 8.384f)
                curveTo(16.7415f, 8.1078f, 17.3531f, 8.2717f, 17.6292f, 8.75f)
                curveTo(17.9053f, 9.2283f, 17.7415f, 9.8399f, 17.2632f, 10.116f)
                lineTo(14.0f, 12.0f)
                lineTo(17.2631f, 13.884f)
                curveTo(17.7414f, 14.1601f, 17.9053f, 14.7717f, 17.6292f, 15.25f)
                curveTo(17.353f, 15.7283f, 16.7414f, 15.8922f, 16.2631f, 15.616f)
                lineTo(13.0f, 13.7321f)
                lineTo(13.0f, 17.5f)
                curveTo(13.0f, 18.0523f, 12.5523f, 18.5f, 12.0f, 18.5f)
                curveTo(11.4477f, 18.5f, 11.0f, 18.0523f, 11.0f, 17.5f)
                lineTo(11.0f, 13.7321f)
                lineTo(7.7369f, 15.616f)
                curveTo(7.2586f, 15.8922f, 6.647f, 15.7283f, 6.3709f, 15.25f)
                curveTo(6.0947f, 14.7717f, 6.2586f, 14.1601f, 6.7369f, 13.884f)
                lineTo(10.0f, 12.0f)
                lineTo(6.7369f, 10.116f)
                curveTo(6.2586f, 9.8399f, 6.0947f, 9.2283f, 6.3708f, 8.75f)
                curveTo(6.647f, 8.2717f, 7.2586f, 8.1078f, 7.7369f, 8.384f)
                lineTo(11.0f, 10.268f)
                lineTo(11.0f, 6.5f)
                curveTo(11.0f, 5.9477f, 11.4477f, 5.5f, 12.0f, 5.5f)
                close()
            }
        }.build().also {
            _asteriskSmall = it
        }
    }

private var _asteriskSmall: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun AsteriskSmallIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.AsteriskSmall,
            contentDescription = null,
    )
}
