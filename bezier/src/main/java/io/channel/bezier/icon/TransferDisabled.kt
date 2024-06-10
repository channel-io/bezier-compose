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

val BezierIcons.TransferDisabled: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _transferDisabled ?: ImageVector.Builder(
                    name = "TransferDisabled",
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
                    moveTo(2.8077f, 4.21482f)
                    curveTo(2.4237f, 3.8238f, 2.42587f, 3.19552f, 2.81421f, 2.80718f)
                    curveTo(3.20473f, 2.41665f, 3.8379f, 2.41665f, 4.22842f, 2.80718f)
                    lineTo(7.42128f, 6.00003f)
                    lineTo(17.0f, 6.00003f)
                    lineTo(17.0f, 3.9314f)
                    curveTo(17.0f, 3.21867f, 17.8617f, 2.86174f, 18.3657f, 3.36571f)
                    lineTo(21.2929f, 6.29292f)
                    curveTo(21.6834f, 6.68344f, 21.6834f, 7.31661f, 21.2929f, 7.70713f)
                    lineTo(18.3657f, 10.6343f)
                    curveTo(17.8617f, 11.1383f, 17.0f, 10.7814f, 17.0f, 10.0687f)
                    lineTo(17.0f, 8.00003f)
                    lineTo(9.42128f, 8.00003f)
                    lineTo(21.199f, 19.7777f)
                    curveTo(21.5895f, 20.1683f, 21.5895f, 20.8014f, 21.199f, 21.192f)
                    curveTo(20.8106f, 21.5803f, 20.1824f, 21.5825f, 19.7913f, 21.1985f)
                    lineTo(2.8077f, 4.21482f)
                    close()
                    moveTo(13.1787f, 16.0f)
                    lineTo(7.0f, 16.0f)
                    lineTo(7.0f, 13.9312f)
                    curveTo(7.0f, 13.2184f, 6.13829f, 12.8615f, 5.63432f, 13.3655f)
                    lineTo(2.70711f, 16.2927f)
                    curveTo(2.31658f, 16.6832f, 2.31658f, 17.3164f, 2.70711f, 17.7069f)
                    lineTo(5.63432f, 20.6341f)
                    curveTo(6.13829f, 21.1381f, 7.0f, 20.7812f, 7.0f, 20.0684f)
                    lineTo(7.0f, 18.0f)
                    lineTo(15.1787f, 18.0f)
                    lineTo(13.1787f, 16.0f)
                    close()
                }
            }.build().also {
                _transferDisabled = it
            }
    }


private var _transferDisabled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TransferDisabledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.TransferDisabled.imageVector,
            contentDescription = null,
    )
}
