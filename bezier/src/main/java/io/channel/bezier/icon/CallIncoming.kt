@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

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

val BezierIcon.CallIncoming: ImageVector
    get() {
        return _callIncoming ?: ImageVector.Builder(
                name = "CallIncoming",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(18.2932f, 11.7081f)
                lineTo(13.7932f, 11.7081f)
                curveTo(12.9662f, 11.7081f, 12.2932f, 11.0351f, 12.2932f, 10.2081f)
                lineTo(12.2932f, 5.7081f)
                curveTo(12.2932f, 5.1558f, 12.7409f, 4.7081f, 13.2932f, 4.7081f)
                curveTo(13.8455f, 4.7081f, 14.2932f, 5.1558f, 14.2932f, 5.7081f)
                lineTo(14.2932f, 8.2901f)
                lineTo(18.8786f, 3.7073f)
                curveTo(19.2693f, 3.3168f, 19.9031f, 3.3174f, 20.2934f, 3.7083f)
                curveTo(20.6836f, 4.0991f, 20.6836f, 4.7324f, 20.2929f, 5.1227f)
                lineTo(15.7032f, 9.7081f)
                lineTo(18.2932f, 9.7081f)
                curveTo(18.8455f, 9.7081f, 19.2932f, 10.1558f, 19.2932f, 10.7081f)
                curveTo(19.2932f, 11.2604f, 18.8455f, 11.7081f, 18.2932f, 11.7081f)
                close()
                moveTo(7.7509f, 16.2532f)
                curveTo(2.5859f, 11.0883f, 2.5859f, 6.569f, 4.2f, 4.9549f)
                curveTo(5.1684f, 3.9865f, 6.5842f, 3.7237f, 7.4281f, 4.3093f)
                curveTo(8.2028f, 4.8258f, 9.3649f, 6.2835f, 9.3649f, 7.5374f)
                curveTo(9.3649f, 8.2936f, 8.807f, 8.9439f, 8.3472f, 9.4799f)
                curveTo(8.0219f, 9.859f, 7.7457f, 10.181f, 7.7509f, 10.4427f)
                curveTo(7.7634f, 11.0743f, 8.458f, 12.7177f, 9.8722f, 14.1319f)
                curveTo(11.2864f, 15.5461f, 12.9298f, 16.2407f, 13.5615f, 16.2532f)
                curveTo(13.8232f, 16.2584f, 14.1451f, 15.9822f, 14.5243f, 15.6569f)
                curveTo(15.0602f, 15.1971f, 15.7105f, 14.6392f, 16.4667f, 14.6392f)
                curveTo(17.7207f, 14.6392f, 19.1783f, 15.8013f, 19.6948f, 16.5761f)
                curveTo(20.2804f, 17.4199f, 20.0176f, 18.8357f, 19.0492f, 19.8042f)
                curveTo(17.4352f, 21.4182f, 12.9158f, 21.4182f, 7.7509f, 16.2532f)
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
            imageVector = BezierIcon.CallIncoming,
            contentDescription = null,
    )
}