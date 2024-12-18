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

val BezierIcons.CallPull: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_call_pull
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
                        pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(12.414f, 8.364f)
                    arcTo(2.0f, 2.0f, 135.01192477739772f, isMoreThanHalf = false, isPositiveArc = true, 12.312999999999999f, 5.645000000000001f)
                    lineTo(12.414f, 5.535000000000001f)
                    lineTo(15.243f, 2.707000000000001f)
                    arcTo(1.0f, 1.0f, 224.00425538642082f, isMoreThanHalf = true, isPositiveArc = true, 16.657f, 4.121000000000001f)
                    lineTo(14.778f, 6.0f)
                    lineTo(19.0f, 6.0f)
                    arcTo(3.0f, 3.0f, 269.99680831488064f, isMoreThanHalf = false, isPositiveArc = true, 21.995f, 8.824f)
                    lineTo(22.0f, 9.0f)
                    lineTo(22.0f, 11.5f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 20.0f, 11.5f)
                    lineTo(20.0f, 9.0f)
                    arcTo(1.0f, 1.0f, 359.9924417856093f, isMoreThanHalf = false, isPositiveArc = false, 19.117f, 8.007f)
                    lineTo(19.0f, 8.0f)
                    lineTo(14.879f, 8.0f)
                    lineTo(16.657f, 9.778f)
                    arcTo(1.0f, 1.0f, 314.00425538642025f, isMoreThanHalf = true, isPositiveArc = true, 15.243f, 11.192f)
                    close()
                    moveTo(7.751f, 16.254f)
                    curveTo(2.586f, 11.087f, 2.586f, 6.568f, 4.2f, 4.953f)
                    curveTo(5.168f, 3.9850000000000003f, 6.584f, 3.7230000000000003f, 7.428000000000001f, 4.308f)
                    curveTo(8.203000000000001f, 4.825f, 9.365f, 6.282f, 9.365f, 7.536f)
                    curveTo(9.365f, 8.293f, 8.807f, 8.943f, 8.347f, 9.479f)
                    curveTo(8.022f, 9.857999999999999f, 7.7459999999999996f, 10.18f, 7.7509999999999994f, 10.441999999999998f)
                    curveTo(7.762999999999999f, 11.072999999999999f, 8.458f, 12.716999999999999f, 9.872f, 14.130999999999998f)
                    curveTo(11.286f, 15.544999999999998f, 12.93f, 16.24f, 13.562f, 16.252f)
                    curveTo(13.822999999999999f, 16.256999999999998f, 14.145f, 15.982f, 14.524f, 15.655999999999999f)
                    curveTo(15.059999999999999f, 15.195999999999998f, 15.710999999999999f, 14.637999999999998f, 16.467f, 14.637999999999998f)
                    curveTo(17.721f, 14.637999999999998f, 19.177999999999997f, 15.799999999999997f, 19.695f, 16.575f)
                    curveTo(20.28f, 17.419f, 20.018f, 18.835f, 19.049f, 19.803f)
                    curveTo(17.435f, 21.417f, 12.916f, 21.417f, 7.7509999999999994f, 16.253f)
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
