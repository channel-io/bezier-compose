@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons
import io.channel.bezier.compose.R

val BezierIcons.VoiceWave: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_voice_wave
        override val imageVector: ImageVector
            get() = _voiceWave ?: ImageVector.Builder(
                    name = "VoiceWave",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(13.0f, 7.5f)
                    arcTo(1.5f, 1.5f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 16.0f, 7.5f)
                    lineTo(16.0f, 16.5f)
                    arcTo(1.5f, 1.5f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 13.0f, 16.5f)
                    close()
                    moveTo(8.0f, 4.5f)
                    arcTo(1.5f, 1.5f, 180.0f, isMoreThanHalf = true, isPositiveArc = true, 11.0f, 4.5f)
                    lineTo(11.0f, 19.5f)
                    arcTo(1.5f, 1.5f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 8.0f, 19.5f)
                    close()
                    moveTo(3.0f, 9.5f)
                    arcTo(1.5f, 1.5f, 180.0f, isMoreThanHalf = true, isPositiveArc = true, 6.0f, 9.5f)
                    lineTo(6.0f, 14.5f)
                    arcTo(1.5f, 1.5f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 3.0f, 14.5f)
                    close()
                    moveTo(18.0f, 10.5f)
                    arcTo(1.5f, 1.5f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 21.0f, 10.5f)
                    lineTo(21.0f, 13.5f)
                    arcTo(1.5f, 1.5f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 18.0f, 13.5f)
                    close()
                }
            }.build().also {
                _voiceWave = it
            }
    }


private var _voiceWave: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun VoiceWaveIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.VoiceWave.imageVector,
            contentDescription = null,
    )
}
