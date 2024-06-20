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
import io.channel.bezier.BezierIcons

val BezierIcons.CallInProgress: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _callInProgress ?: ImageVector.Builder(
                    name = "CallInProgress",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                        pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(14.0f, 2.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = false, 14.0f, 4.0f)
                    arcTo(6.0f, 6.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 20.0f, 10.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = false, 22.0f, 10.0f)
                    arcTo(8.0f, 8.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 14.0f, 2.0f)
                    moveTo(4.2f, 4.955f)
                    curveTo(2.5860000000000003f, 6.569f, 2.5860000000000003f, 11.088000000000001f, 7.75f, 16.253f)
                    curveTo(12.916f, 21.418f, 17.435000000000002f, 21.418f, 19.05f, 19.804000000000002f)
                    curveTo(20.018f, 18.836000000000002f, 20.28f, 17.42f, 19.695f, 16.576f)
                    curveTo(19.178f, 15.801f, 17.721f, 14.639000000000001f, 16.467f, 14.639000000000001f)
                    curveTo(15.710999999999999f, 14.639000000000001f, 15.059999999999999f, 15.197000000000001f, 14.524f, 15.657000000000002f)
                    curveTo(14.145f, 15.982000000000001f, 13.824f, 16.258000000000003f, 13.562f, 16.253f)
                    curveTo(12.93f, 16.241f, 11.286f, 15.546f, 9.872f, 14.132f)
                    curveTo(8.458f, 12.718f, 7.763f, 11.074f, 7.7509999999999994f, 10.442f)
                    curveTo(7.7459999999999996f, 10.181000000000001f, 8.020999999999999f, 9.859f, 8.347f, 9.48f)
                    curveTo(8.807f, 8.944f, 9.365f, 8.294f, 9.365f, 7.537000000000001f)
                    curveTo(9.365f, 6.283000000000001f, 8.203f, 4.8260000000000005f, 7.428f, 4.309000000000001f)
                    curveTo(6.584f, 3.724000000000001f, 5.168f, 3.986000000000001f, 4.199999999999999f, 4.955000000000001f)
                    moveTo(13.0f, 7.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 14.0f, 6.0f)
                    arcTo(4.0f, 4.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 18.0f, 10.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 16.0f, 10.0f)
                    arcTo(2.0f, 2.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 14.0f, 8.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 13.0f, 7.0f)
                }
            }.build().also {
                _callInProgress = it
            }
    }


private var _callInProgress: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CallInProgressIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.CallInProgress.imageVector,
            contentDescription = null,
    )
}
