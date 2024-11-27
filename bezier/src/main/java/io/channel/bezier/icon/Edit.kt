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

val BezierIcons.Edit: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_edit
        override val imageVector: ImageVector
            get() = _edit ?: ImageVector.Builder(
                    name = "Edit",
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
                    moveTo(11.419f, 16.0f)
                    arcTo(2.0f, 2.0f, 89.98776339474541f, isMoreThanHalf = false, isPositiveArc = false, 12.833f, 15.414f)
                    lineTo(20.62f, 7.627f)
                    arcTo(3.003f, 3.003f, 44.99999924264724f, isMoreThanHalf = false, isPositiveArc = false, 16.373f, 3.38f)
                    lineTo(8.586000000000002f, 11.167f)
                    arcTo(2.0f, 2.0f, 225.00867230219973f, isMoreThanHalf = false, isPositiveArc = false, 8.0f, 12.58f)
                    lineTo(8.0f, 15.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 9.0f, 16.0f)
                    close()
                    moveTo(10.002f, 13.998f)
                    lineTo(11.418000000000001f, 13.998f)
                    lineTo(19.205000000000002f, 6.210999999999999f)
                    arcTo(1.001f, 1.001f, 45.000000851620726f, isMoreThanHalf = true, isPositiveArc = false, 17.789f, 4.795f)
                    lineTo(10.002000000000002f, 12.582f)
                    close()
                    moveTo(11.0f, 4.0f)
                    lineTo(9.357f, 4.0f)
                    curveTo(8.273f, 4.0f, 7.4f, 4.0f, 6.691f, 4.058f)
                    curveTo(5.963f, 4.117999999999999f, 5.322f, 4.242999999999999f, 4.731f, 4.545f)
                    arcTo(5.0f, 5.0f, 243.03404965920066f, isMoreThanHalf = false, isPositiveArc = false, 2.544f, 6.73f)
                    curveTo(2.242f, 7.322f, 2.116f, 7.963000000000001f, 2.057f, 8.691f)
                    curveTo(2.0f, 9.4f, 2.0f, 10.273f, 2.0f, 11.357f)
                    lineTo(2.0f, 14.642999999999999f)
                    curveTo(2.0f, 15.726999999999999f, 2.0f, 16.601f, 2.058f, 17.308999999999997f)
                    curveTo(2.118f, 18.037999999999997f, 2.243f, 18.677999999999997f, 2.545f, 19.269999999999996f)
                    arcTo(5.0f, 5.0f, 152.999317372832f, isMoreThanHalf = false, isPositiveArc = false, 4.73f, 21.454999999999995f)
                    curveTo(5.322f, 21.756999999999994f, 5.963000000000001f, 21.882999999999996f, 6.691000000000001f, 21.941999999999993f)
                    curveTo(7.4f, 22.0f, 8.273f, 22.0f, 9.357f, 22.0f)
                    lineTo(12.642999999999999f, 22.0f)
                    curveTo(13.726999999999999f, 22.0f, 14.600999999999999f, 22.0f, 15.309f, 21.942f)
                    curveTo(16.038f, 21.882f, 16.678f, 21.757f, 17.27f, 21.455000000000002f)
                    arcTo(5.0f, 5.0f, 62.999317372831996f, isMoreThanHalf = false, isPositiveArc = false, 19.455f, 19.270000000000003f)
                    curveTo(19.756999999999998f, 18.678000000000004f, 19.883f, 18.038000000000004f, 19.941999999999997f, 17.309000000000005f)
                    curveTo(20.0f, 16.6f, 20.0f, 15.727f, 20.0f, 14.643f)
                    lineTo(20.0f, 13.0f)
                    lineTo(18.0f, 13.0f)
                    lineTo(18.0f, 14.6f)
                    curveTo(18.0f, 15.737f, 18.0f, 16.529f, 17.949f, 17.146f)
                    curveTo(17.899f, 17.751f, 17.807000000000002f, 18.099f, 17.673000000000002f, 18.362000000000002f)
                    arcTo(3.0f, 3.0f, 27.00068262716798f, isMoreThanHalf = false, isPositiveArc = true, 16.362000000000002f, 19.673000000000002f)
                    curveTo(16.099f, 19.807000000000002f, 15.751000000000001f, 19.899f, 15.146000000000003f, 19.949f)
                    curveTo(14.529000000000003f, 19.999000000000002f, 13.736000000000002f, 20.0f, 12.600000000000003f, 20.0f)
                    lineTo(9.4f, 20.0f)
                    curveTo(8.263f, 20.0f, 7.471f, 20.0f, 6.854000000000001f, 19.949f)
                    curveTo(6.2490000000000006f, 19.899f, 5.901000000000001f, 19.807000000000002f, 5.638000000000001f, 19.673000000000002f)
                    arcTo(3.0f, 3.0f, 117.00068262716798f, isMoreThanHalf = false, isPositiveArc = true, 4.327000000000001f, 18.362000000000002f)
                    curveTo(4.1930000000000005f, 18.099f, 4.101000000000001f, 17.751f, 4.051000000000001f, 17.146f)
                    curveTo(4.001f, 16.529f, 4.0f, 15.736f, 4.0f, 14.6f)
                    lineTo(4.0f, 11.399999999999999f)
                    curveTo(4.0f, 10.262999999999998f, 4.0f, 9.470999999999998f, 4.051f, 8.854f)
                    curveTo(4.101f, 8.248999999999999f, 4.1930000000000005f, 7.900999999999999f, 4.327f, 7.637999999999999f)
                    arcTo(3.0f, 3.0f, 207.00068262716798f, isMoreThanHalf = false, isPositiveArc = true, 5.638f, 6.326999999999999f)
                    curveTo(5.901f, 6.192999999999999f, 6.249f, 6.100999999999999f, 6.854f, 6.050999999999999f)
                    curveTo(7.471f, 6.001f, 8.264f, 6.0f, 9.4f, 6.0f)
                    lineTo(11.0f, 6.0f)
                    close()
                }
            }.build().also {
                _edit = it
            }
    }


private var _edit: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun EditIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Edit.imageVector,
            contentDescription = null,
    )
}
