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

val BezierIcons.CallOutgoing: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_call_outgoing
        override val imageVector: ImageVector
            get() = _callOutgoing ?: ImageVector.Builder(
                    name = "CallOutgoing",
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
                    moveTo(15.0f, 3.0f)
                    lineTo(19.5f, 3.0f)
                    curveTo(20.326999999999998f, 3.0f, 21.0f, 3.673f, 21.0f, 4.5f)
                    lineTo(21.0f, 9.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 19.0f, 9.0f)
                    lineTo(19.0f, 6.418f)
                    lineTo(14.415f, 11.001000000000001f)
                    arcTo(1.0f, 1.0f, 45.02023930876911f, isMoreThanHalf = false, isPositiveArc = true, 13.0f, 9.585f)
                    lineTo(17.59f, 5.0f)
                    lineTo(15.0f, 5.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = true, 15.0f, 3.0f)
                    moveTo(7.75f, 16.253f)
                    curveTo(2.587f, 11.088f, 2.587f, 6.57f, 4.2f, 4.955f)
                    curveTo(5.168f, 3.986f, 6.584f, 3.724f, 7.428000000000001f, 4.309f)
                    curveTo(8.203000000000001f, 4.8260000000000005f, 9.365f, 6.283f, 9.365f, 7.537000000000001f)
                    curveTo(9.365f, 8.294f, 8.807f, 8.944f, 8.347f, 9.48f)
                    curveTo(8.022f, 9.859f, 7.7459999999999996f, 10.181000000000001f, 7.7509999999999994f, 10.443f)
                    curveTo(7.762999999999999f, 11.074f, 8.458f, 12.718f, 9.872f, 14.132f)
                    curveTo(11.286f, 15.546f, 12.93f, 16.241f, 13.562f, 16.253f)
                    curveTo(13.822999999999999f, 16.258f, 14.145f, 15.983f, 14.524f, 15.657f)
                    curveTo(15.059999999999999f, 15.197f, 15.710999999999999f, 14.639f, 16.467f, 14.639f)
                    curveTo(17.721f, 14.639f, 19.177999999999997f, 15.800999999999998f, 19.695f, 16.576f)
                    curveTo(20.28f, 17.42f, 20.018f, 18.836f, 19.049f, 19.804000000000002f)
                    curveTo(17.435f, 21.418000000000003f, 12.916f, 21.418000000000003f, 7.7509999999999994f, 16.254f)
                }
            }.build().also {
                _callOutgoing = it
            }
    }


private var _callOutgoing: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CallOutgoingIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.CallOutgoing.imageVector,
            contentDescription = null,
    )
}
