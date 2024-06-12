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

val BezierIcons.CallIncoming: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _callIncoming ?: ImageVector.Builder(
                    name = "CallIncoming",
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
                    moveTo(18.2932f, 11.7081f)
                    lineTo(13.7932f, 11.7081f)
                    curveTo(12.9662f, 11.7081f, 12.2932f, 11.0351f, 12.2932f, 10.2081f)
                    lineTo(12.2932f, 5.7081f)
                    curveTo(12.2932f, 5.15581f, 12.7409f, 4.7081f, 13.2932f, 4.7081f)
                    curveTo(13.8455f, 4.7081f, 14.2932f, 5.15581f, 14.2932f, 5.7081f)
                    lineTo(14.2932f, 8.2901f)
                    lineTo(18.8786f, 3.7073f)
                    curveTo(19.2693f, 3.31677f, 19.9031f, 3.31741f, 20.2934f, 3.70833f)
                    curveTo(20.6836f, 4.09907f, 20.6836f, 4.73243f, 20.2929f, 5.12271f)
                    lineTo(15.7032f, 9.7081f)
                    lineTo(18.2932f, 9.7081f)
                    curveTo(18.8455f, 9.7081f, 19.2932f, 10.1558f, 19.2932f, 10.7081f)
                    curveTo(19.2932f, 11.2604f, 18.8455f, 11.7081f, 18.2932f, 11.7081f)
                    close()
                    moveTo(7.75088f, 16.2532f)
                    curveTo(2.58593f, 11.0883f, 2.58593f, 6.56896f, 4.19998f, 4.95491f)
                    curveTo(5.16841f, 3.98648f, 6.58425f, 3.72371f, 7.42807f, 4.30928f)
                    curveTo(8.20282f, 4.82579f, 9.36494f, 6.28347f, 9.36493f, 7.53739f)
                    curveTo(9.36493f, 8.29362f, 8.80701f, 8.94392f, 8.34719f, 9.47987f)
                    curveTo(8.0219f, 9.85903f, 7.7457f, 10.181f, 7.75088f, 10.4427f)
                    curveTo(7.76339f, 11.0743f, 8.45799f, 12.7177f, 9.8722f, 14.1319f)
                    curveTo(11.2864f, 15.5461f, 12.9298f, 16.2407f, 13.5615f, 16.2532f)
                    curveTo(13.8232f, 16.2584f, 14.1451f, 15.9822f, 14.5243f, 15.6569f)
                    curveTo(15.0602f, 15.1971f, 15.7105f, 14.6392f, 16.4667f, 14.6392f)
                    curveTo(17.7207f, 14.6392f, 19.1783f, 15.8013f, 19.6948f, 16.5761f)
                    curveTo(20.2804f, 17.4199f, 20.0176f, 18.8357f, 19.0492f, 19.8042f)
                    curveTo(17.4352f, 21.4182f, 12.9158f, 21.4182f, 7.75088f, 16.2532f)
                    close()
                }
            }.build().also {
                _callIncoming = it
            }
    }


private var _callIncoming: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CallIncomingIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.CallIncoming.imageVector,
            contentDescription = null,
    )
}
