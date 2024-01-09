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

val BezierIcon.Spotify: ImageVector
    get() {
        return _spotify ?: ImageVector.Builder(
                name = "Spotify",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(17.9155f, 10.8654f)
                curveTo(14.692f, 8.951f, 9.3752f, 8.7752f, 6.2979f, 9.7089f)
                curveTo(5.8036f, 9.8589f, 5.2813f, 9.5799f, 5.1316f, 9.0857f)
                curveTo(4.982f, 8.591f, 5.2607f, 8.069f, 5.7549f, 7.9187f)
                curveTo(9.2874f, 6.8465f, 15.1592f, 7.0535f, 18.8702f, 9.2563f)
                curveTo(19.315f, 9.5203f, 19.4605f, 10.094f, 19.1969f, 10.5381f)
                curveTo(18.9332f, 10.9824f, 18.3587f, 11.1291f, 17.9151f, 10.8651f)
                moveTo(17.8097f, 13.7004f)
                curveTo(17.5836f, 14.0676f, 17.1036f, 14.1827f, 16.7372f, 13.9573f)
                curveTo(14.0499f, 12.3054f, 9.9519f, 11.8269f, 6.7726f, 12.7918f)
                curveTo(6.3605f, 12.9163f, 5.9248f, 12.6838f, 5.7995f, 12.2724f)
                curveTo(5.6754f, 11.8603f, 5.9079f, 11.4257f, 6.3193f, 11.3001f)
                curveTo(9.9512f, 10.1979f, 14.4662f, 10.7316f, 17.5528f, 12.6283f)
                curveTo(17.9192f, 12.8541f, 18.0347f, 13.3341f, 17.8093f, 13.7001f)
                moveTo(16.5857f, 16.423f)
                curveTo(16.4068f, 16.7166f, 16.0236f, 16.81f, 15.73f, 16.6311f)
                curveTo(15.7296f, 16.6311f, 15.7292f, 16.6307f, 15.7288f, 16.6303f)
                curveTo(13.3806f, 15.1952f, 10.4248f, 14.8712f, 6.944f, 15.6662f)
                curveTo(6.6088f, 15.7431f, 6.2747f, 15.5331f, 6.1978f, 15.1978f)
                curveTo(6.1209f, 14.863f, 6.3298f, 14.5288f, 6.665f, 14.452f)
                curveTo(6.6654f, 14.452f, 6.6662f, 14.452f, 6.6665f, 14.452f)
                curveTo(10.4758f, 13.5812f, 13.7432f, 13.9558f, 16.3791f, 15.5665f)
                curveTo(16.6727f, 15.7461f, 16.7657f, 16.1297f, 16.5861f, 16.4233f)
                moveTo(11.9998f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 11.9998f)
                curveTo(2.0f, 17.5225f, 6.4771f, 22.0f, 11.9998f, 22.0f)
                curveTo(17.5225f, 22.0f, 22.0f, 17.5232f, 22.0f, 11.9998f)
                curveTo(22.0f, 6.4764f, 17.5228f, 2.0f, 11.9998f, 2.0f)
                close()
            }
        }.build().also {
            _spotify = it
        }
    }

private var _spotify: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun SpotifyIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Spotify,
            contentDescription = null,
    )
}
