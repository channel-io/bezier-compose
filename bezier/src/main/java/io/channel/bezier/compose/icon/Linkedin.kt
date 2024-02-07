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

val BezierIcon.Linkedin: ImageVector
    get() {
        return _linkedin ?: ImageVector.Builder(
                name = "Linkedin",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(19.6032f, 3.0f)
                lineTo(4.3981f, 3.0f)
                curveTo(3.6258f, 3.0f, 3.0f, 3.6258f, 3.0f, 4.3981f)
                lineTo(3.0f, 19.6032f)
                curveTo(3.0f, 20.3757f, 3.6258f, 21.0014f, 4.3981f, 21.0014f)
                lineTo(19.6032f, 21.0014f)
                curveTo(20.3757f, 21.0014f, 21.0014f, 20.3757f, 21.0014f, 19.6032f)
                lineTo(21.0014f, 4.3981f)
                curveTo(21.0f, 3.6258f, 20.3743f, 3.0f, 19.6032f, 3.0f)
                close()
                moveTo(8.4599f, 18.2987f)
                lineTo(5.7837f, 18.2987f)
                lineTo(5.7837f, 9.7491f)
                lineTo(8.4599f, 9.7491f)
                lineTo(8.4599f, 18.2987f)
                close()
                moveTo(7.1162f, 8.5703f)
                curveTo(6.2614f, 8.5703f, 5.5686f, 7.8775f, 5.5686f, 7.0227f)
                curveTo(5.5686f, 6.1678f, 6.2614f, 5.475f, 7.1162f, 5.475f)
                curveTo(7.9711f, 5.475f, 8.6638f, 6.1678f, 8.6638f, 7.0227f)
                curveTo(8.6638f, 7.8775f, 7.9711f, 8.5703f, 7.1162f, 8.5703f)
                close()
                moveTo(18.4314f, 14.561f)
                curveTo(18.4286f, 15.8069f, 18.43f, 17.0528f, 18.43f, 18.2987f)
                lineTo(15.7622f, 18.2987f)
                curveTo(15.7622f, 18.2987f, 15.7622f, 17.5137f, 15.7622f, 17.469f)
                curveTo(15.7622f, 16.522f, 15.7622f, 15.5764f, 15.7622f, 14.6294f)
                curveTo(15.7622f, 13.7969f, 15.8655f, 12.4756f, 15.061f, 12.037f)
                curveTo(14.5302f, 11.7479f, 13.7802f, 11.8177f, 13.336f, 12.2437f)
                curveTo(13.0133f, 12.5524f, 12.8918f, 13.0022f, 12.8388f, 13.4449f)
                curveTo(12.8108f, 13.6712f, 12.8024f, 13.9003f, 12.8024f, 14.128f)
                curveTo(12.8024f, 14.1964f, 12.8024f, 14.262f, 12.8024f, 14.3263f)
                lineTo(12.8024f, 18.3001f)
                lineTo(12.7899f, 18.3001f)
                lineTo(11.9337f, 18.3001f)
                lineTo(10.1221f, 18.3001f)
                lineTo(10.1221f, 9.7491f)
                lineTo(12.6656f, 9.7491f)
                lineTo(12.6642f, 10.9112f)
                lineTo(12.6739f, 10.9112f)
                curveTo(12.7103f, 10.8498f, 12.7633f, 10.7981f, 12.7913f, 10.7324f)
                curveTo(13.5064f, 9.0507f, 16.6589f, 8.9809f, 17.7553f, 10.6151f)
                curveTo(17.9942f, 10.9727f, 18.1394f, 11.3861f, 18.2372f, 11.8024f)
                curveTo(18.3685f, 12.3625f, 18.4118f, 12.9323f, 18.4258f, 13.5036f)
                curveTo(18.4342f, 13.8556f, 18.4314f, 14.209f, 18.4314f, 14.561f)
                close()
            }
        }.build().also {
            _linkedin = it
        }
    }

private var _linkedin: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun LinkedinIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Linkedin,
            contentDescription = null,
    )
}
