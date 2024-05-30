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

val BezierIcons.MicrophoneFilled: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _microphoneFilled ?: ImageVector.Builder(
                    name = "MicrophoneFilled",
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
                    moveTo(12.0f, 2.0f)
                    curveTo(9.79086f, 2.0f, 7.99999f, 3.79086f, 7.99999f, 6.0f)
                    lineTo(7.99999f, 13.0f)
                    curveTo(7.99999f, 15.2091f, 9.79086f, 17.0f, 12.0f, 17.0f)
                    curveTo(14.2091f, 17.0f, 16.0f, 15.2091f, 16.0f, 13.0f)
                    lineTo(16.0f, 6.0f)
                    curveTo(16.0f, 3.79086f, 14.2091f, 2.0f, 12.0f, 2.0f)
                    close()
                    moveTo(11.0f, 20.9381f)
                    curveTo(7.38061f, 20.4868f, 4.51209f, 17.6177f, 4.06164f, 13.998f)
                    curveTo(3.99344f, 13.45f, 4.44771f, 13.0f, 4.99999f, 13.0f)
                    curveTo(5.55228f, 13.0f, 5.99126f, 13.4511f, 6.08225f, 13.9958f)
                    curveTo(6.5566f, 16.8356f, 9.02554f, 19.0f, 12.0f, 19.0f)
                    curveTo(14.9745f, 19.0f, 17.4434f, 16.8356f, 17.9177f, 13.9958f)
                    curveTo(18.0087f, 13.4511f, 18.4477f, 13.0f, 19.0f, 13.0f)
                    curveTo(19.5523f, 13.0f, 20.0066f, 13.45f, 19.9383f, 13.998f)
                    curveTo(19.4879f, 17.6177f, 16.6194f, 20.4868f, 13.0f, 20.9381f)
                    lineTo(13.0f, 23.0f)
                    lineTo(11.0f, 23.0f)
                    lineTo(11.0f, 20.9381f)
                    close()
                }
            }.build().also {
                _microphoneFilled = it
            }
    }


private var _microphoneFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun MicrophoneFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.MicrophoneFilled.imageVector,
            contentDescription = null,
    )
}
