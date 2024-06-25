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

val BezierIcons.ViewOff: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _viewOff ?: ImageVector.Builder(
                    name = "ViewOff",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(16.416f, 13.547f)
                    arcTo(4.107f, 4.107f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 12.309000000000001f, 9.440000000000001f)
                    curveTo(12.075000000000001f, 9.440000000000001f, 11.847000000000001f, 9.464f, 11.624f, 9.503000000000002f)
                    lineTo(10.394f, 8.273000000000001f)
                    arcTo(8.4f, 8.4f, 256.5588174612012f, isMoreThanHalf = false, isPositiveArc = true, 12.309000000000001f, 8.043000000000001f)
                    curveTo(15.432000000000002f, 8.043000000000001f, 18.298000000000002f, 9.713000000000001f, 20.14f, 12.560000000000002f)
                    curveTo(20.44f, 13.023000000000001f, 21.042f, 13.210000000000003f, 21.529f, 12.951000000000002f)
                    curveTo(22.017f, 12.691000000000003f, 22.204f, 12.083000000000002f, 21.91f, 11.616000000000003f)
                    curveTo(19.704f, 8.108000000000004f, 16.178f, 6.043000000000003f, 12.309f, 6.043000000000003f)
                    curveTo(11.088999999999999f, 6.043000000000003f, 9.914f, 6.277000000000003f, 8.795f, 6.674000000000003f)
                    lineTo(4.575f, 2.4540000000000033f)
                    arcTo(1.0f, 1.0f, 316.7997999659956f, isMoreThanHalf = true, isPositiveArc = false, 3.162f, 3.868000000000003f)
                    lineTo(20.131999999999998f, 20.839000000000002f)
                    arcTo(1.0f, 1.0f, 135.99574461357543f, isMoreThanHalf = true, isPositiveArc = false, 21.546f, 19.425f)
                    lineTo(16.353f, 14.232000000000001f)
                    curveTo(16.392000000000003f, 14.009f, 16.416f, 13.781f, 16.416f, 13.547f)
                    moveTo(8.201f, 13.547f)
                    arcTo(4.107f, 4.107f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 12.308f, 17.654f)
                    arcTo(4.07f, 4.07f, 89.8927418284636f, isMoreThanHalf = false, isPositiveArc = false, 14.729f, 16.85f)
                    lineTo(9.004999999999999f, 11.127000000000002f)
                    curveTo(8.504999999999999f, 11.807000000000002f, 8.200999999999999f, 12.638000000000002f, 8.200999999999999f, 13.547000000000002f)
                    moveTo(3.089f, 12.95f)
                    curveTo(2.601f, 12.690999999999999f, 2.413f, 12.082999999999998f, 2.709f, 11.616f)
                    curveTo(3.608f, 10.196f, 4.73f, 9.024999999999999f, 5.997f, 8.119f)
                    lineTo(7.425f, 9.546f)
                    arcTo(10.4f, 10.4f, 236.04859513391696f, isMoreThanHalf = false, isPositiveArc = false, 4.478f, 12.559999999999999f)
                    curveTo(4.178f, 13.022999999999998f, 3.5759999999999996f, 13.209999999999999f, 3.088f, 12.95f)
                }
            }.build().also {
                _viewOff = it
            }
    }


private var _viewOff: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ViewOffIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ViewOff.imageVector,
            contentDescription = null,
    )
}
