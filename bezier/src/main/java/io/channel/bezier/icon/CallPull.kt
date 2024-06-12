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

val BezierIcons.CallPull: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _callPull ?: ImageVector.Builder(
                    name = "CallPull",
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
                    moveTo(12.4142f, 8.36396f)
                    curveTo(11.6686f, 7.61841f, 11.6348f, 6.4307f, 12.3125f, 5.64496f)
                    lineTo(12.4142f, 5.53553f)
                    lineTo(15.2426f, 2.70711f)
                    curveTo(15.6331f, 2.31658f, 16.2663f, 2.31658f, 16.6568f, 2.70711f)
                    curveTo(17.0474f, 3.09763f, 17.0474f, 3.7308f, 16.6568f, 4.12132f)
                    lineTo(14.7782f, 6.0f)
                    lineTo(19.0f, 6.0f)
                    curveTo(20.5977f, 6.0f, 21.9036f, 7.24892f, 21.9949f, 8.82373f)
                    lineTo(22.0f, 9.0f)
                    lineTo(22.0f, 11.5f)
                    curveTo(22.0f, 12.0523f, 21.5523f, 12.5f, 21.0f, 12.5f)
                    curveTo(20.4477f, 12.5f, 20.0f, 12.0523f, 20.0f, 11.5f)
                    lineTo(20.0f, 9.0f)
                    curveTo(20.0f, 8.48716f, 19.6139f, 8.06449f, 19.1166f, 8.00673f)
                    lineTo(19.0f, 8.0f)
                    lineTo(14.8787f, 8.0f)
                    lineTo(16.6568f, 9.77817f)
                    curveTo(17.0474f, 10.1687f, 17.0474f, 10.8019f, 16.6568f, 11.1924f)
                    curveTo(16.2663f, 11.5829f, 15.6331f, 11.5829f, 15.2426f, 11.1924f)
                    lineTo(12.4142f, 8.36396f)
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
                _callPull = it
            }
    }


private var _callPull: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CallPullIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.CallPull.imageVector,
            contentDescription = null,
    )
}
