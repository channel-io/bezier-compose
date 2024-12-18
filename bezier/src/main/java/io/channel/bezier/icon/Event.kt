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

val BezierIcons.Event: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_event
        override val imageVector: ImageVector
            get() = _event ?: ImageVector.Builder(
                    name = "Event",
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
                    moveTo(6.243f, 5.332f)
                    arcTo(7.54f, 7.54f, 213.92441565693963f, isMoreThanHalf = false, isPositiveArc = true, 18.756f, 5.332f)
                    curveTo(20.518f, 7.904999999999999f, 20.353f, 11.344999999999999f, 18.61f, 13.931000000000001f)
                    lineTo(12.943999999999999f, 22.339f)
                    arcTo(0.534f, 0.534f, 33.750921776948175f, isMoreThanHalf = false, isPositiveArc = true, 12.056f, 22.339f)
                    lineTo(6.39f, 13.931f)
                    curveTo(4.646999999999999f, 11.344999999999999f, 4.483f, 7.904999999999999f, 6.244f, 5.331999999999999f)
                    moveTo(14.78f, 13.946f)
                    lineTo(12.5f, 12.29f)
                    lineTo(10.222f, 13.944999999999999f)
                    curveTo(9.693999999999999f, 14.328f, 8.985f, 13.811999999999998f, 9.187f, 13.192999999999998f)
                    lineTo(10.056999999999999f, 10.513999999999998f)
                    lineTo(7.778f, 8.86f)
                    curveTo(7.252f, 8.477f, 7.521999999999999f, 7.642999999999999f, 8.174f, 7.642999999999999f)
                    lineTo(10.989999999999998f, 7.642999999999999f)
                    lineTo(11.859999999999998f, 4.964999999999999f)
                    curveTo(12.061999999999998f, 4.344999999999999f, 12.937999999999997f, 4.344999999999999f, 13.139999999999997f, 4.964999999999999f)
                    lineTo(14.009999999999996f, 7.642999999999999f)
                    lineTo(16.825999999999997f, 7.642999999999999f)
                    curveTo(17.477999999999998f, 7.642999999999999f, 17.747999999999998f, 8.476999999999999f, 17.221999999999998f, 8.86f)
                    lineTo(14.942999999999998f, 10.514999999999999f)
                    lineTo(15.812999999999997f, 13.193999999999999f)
                    curveTo(16.014999999999997f, 13.813999999999998f, 15.305999999999997f, 14.328999999999999f, 14.778999999999996f, 13.946f)
                }
            }.build().also {
                _event = it
            }
    }


private var _event: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun EventIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Event.imageVector,
            contentDescription = null,
    )
}
