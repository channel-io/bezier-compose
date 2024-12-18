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

val BezierIcons.Apple: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_apple
        override val imageVector: ImageVector
            get() = _apple ?: ImageVector.Builder(
                    name = "Apple",
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
                    moveTo(15.832f, 1.0f)
                    curveTo(15.832f, 1.0f, 16.104f, 2.628f, 14.799000000000001f, 4.197f)
                    curveTo(13.405000000000001f, 5.872f, 11.82f, 5.5969999999999995f, 11.82f, 5.5969999999999995f)
                    curveTo(11.82f, 5.5969999999999995f, 11.523f, 4.279999999999999f, 12.692f, 2.7399999999999993f)
                    curveTo(14.006f, 1.01f, 15.832f, 1.0f, 15.832f, 1.0f)
                    moveTo(19.469f, 7.81f)
                    curveTo(19.469f, 7.81f, 17.306f, 8.915f, 17.306f, 11.599f)
                    curveTo(17.306f, 14.626000000000001f, 20.0f, 15.669f, 20.0f, 15.669f)
                    curveTo(20.0f, 15.669f, 18.117f, 20.971f, 15.573f, 20.971f)
                    curveTo(14.996f, 20.971f, 14.483f, 20.779f, 13.962f, 20.584f)
                    curveTo(13.427999999999999f, 20.384f, 12.887f, 20.183f, 12.264f, 20.183f)
                    curveTo(11.568999999999999f, 20.183f, 10.876f, 20.433f, 10.259f, 20.658f)
                    curveTo(9.762f, 20.838f, 9.314f, 21.0f, 8.953f, 21.0f)
                    curveTo(6.630999999999999f, 21.0f, 3.6959999999999997f, 15.969999999999999f, 3.6959999999999997f, 11.929f)
                    curveTo(3.6959999999999997f, 7.952f, 6.18f, 5.8660000000000005f, 8.51f, 5.8660000000000005f)
                    curveTo(9.39f, 5.8660000000000005f, 10.155999999999999f, 6.1610000000000005f, 10.798f, 6.408f)
                    curveTo(11.26f, 6.586f, 11.658f, 6.738f, 11.988f, 6.738f)
                    curveTo(12.251999999999999f, 6.738f, 12.606f, 6.596f, 13.035f, 6.423f)
                    curveTo(13.704f, 6.1530000000000005f, 14.557f, 5.8100000000000005f, 15.552f, 5.8100000000000005f)
                    curveTo(18.362f, 5.8100000000000005f, 19.469f, 7.8100000000000005f, 19.469f, 7.8100000000000005f)
                }
            }.build().also {
                _apple = it
            }
    }


private var _apple: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun AppleIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Apple.imageVector,
            contentDescription = null,
    )
}
