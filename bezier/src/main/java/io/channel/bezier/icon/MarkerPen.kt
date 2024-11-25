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

val BezierIcons.MarkerPen: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_marker_pen
        override val imageVector: ImageVector
            get() = _markerPen ?: ImageVector.Builder(
                    name = "MarkerPen",
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
                    moveTo(11.948f, 13.505f)
                    lineTo(18.013f, 3.0f)
                    lineTo(20.323f, 3.0f)
                    lineTo(13.68f, 14.505f)
                    arcTo(2.79f, 2.79f, 29.76157739935114f, isMoreThanHalf = false, isPositiveArc = true, 11.046f, 15.902000000000001f)
                    curveTo(10.751999999999999f, 15.882000000000001f, 10.475999999999999f, 16.053f, 10.328999999999999f, 16.308f)
                    lineTo(8.887999999999998f, 18.804f)
                    lineTo(8.486999999999998f, 19.5f)
                    curveTo(8.306999999999999f, 19.81f, 7.9769999999999985f, 20.0f, 7.619999999999998f, 20.0f)
                    lineTo(3.002f, 20.0f)
                    arcTo(1.0f, 1.0f, 90.00145551895827f, isMoreThanHalf = false, isPositiveArc = true, 2.1359999999999997f, 18.5f)
                    lineTo(4.192f, 14.938f)
                    lineTo(5.134f, 13.308f)
                    arcTo(0.8f, 0.8f, 30.356429049600404f, isMoreThanHalf = false, isPositiveArc = false, 5.132000000000001f, 12.496f)
                    curveTo(4.6080000000000005f, 11.599f, 4.415000000000001f, 10.552f, 4.9350000000000005f, 9.652000000000001f)
                    lineTo(8.775f, 3.0f)
                    lineTo(11.085f, 3.0f)
                    lineTo(6.752000000000001f, 10.504999999999999f)
                    arcTo(0.8f, 0.8f, 210.4558983272568f, isMoreThanHalf = false, isPositiveArc = false, 6.752000000000001f, 11.315999999999999f)
                    curveTo(7.275f, 12.216999999999999f, 7.466000000000001f, 13.267999999999999f, 6.945f, 14.169999999999998f)
                    lineTo(6.425000000000001f, 15.071999999999997f)
                    lineTo(8.157f, 16.071999999999996f)
                    lineTo(8.597f, 15.307999999999996f)
                    arcTo(2.79f, 2.79f, 209.75984612363516f, isMoreThanHalf = false, isPositiveArc = true, 11.232f, 13.910999999999996f)
                    curveTo(11.526f, 13.931999999999997f, 11.799999999999999f, 13.760999999999996f, 11.947999999999999f, 13.504999999999995f)
                    moveTo(9.344f, 20.0f)
                    lineTo(10.5f, 18.0f)
                    lineTo(19.0f, 18.0f)
                    lineTo(19.0f, 20.0f)
                    close()
                }
            }.build().also {
                _markerPen = it
            }
    }


private var _markerPen: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun MarkerPenIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.MarkerPen.imageVector,
            contentDescription = null,
    )
}
