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

val BezierIcons.AppCheck: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_app_check
        override val imageVector: ImageVector
            get() = _appCheck ?: ImageVector.Builder(
                    name = "AppCheck",
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
                    moveTo(12.0f, 3.0f)
                    lineTo(10.357f, 3.0f)
                    curveTo(9.273f, 3.0f, 8.4f, 3.0f, 7.691f, 3.058f)
                    curveTo(6.963f, 3.118f, 6.322f, 3.243f, 5.731f, 3.545f)
                    arcTo(5.0f, 5.0f, 243.03404965920066f, isMoreThanHalf = false, isPositiveArc = false, 3.544f, 5.73f)
                    curveTo(3.242f, 6.322f, 3.116f, 6.963000000000001f, 3.057f, 7.691000000000001f)
                    curveTo(3.0f, 8.4f, 3.0f, 9.273f, 3.0f, 10.357f)
                    lineTo(3.0f, 13.642999999999999f)
                    curveTo(3.0f, 14.726999999999999f, 3.0f, 15.600999999999999f, 3.058f, 16.308999999999997f)
                    curveTo(3.118f, 17.037999999999997f, 3.243f, 17.677999999999997f, 3.545f, 18.269999999999996f)
                    arcTo(5.0f, 5.0f, 152.999317372832f, isMoreThanHalf = false, isPositiveArc = false, 5.73f, 20.454999999999995f)
                    curveTo(6.322f, 20.756999999999994f, 6.963000000000001f, 20.882999999999996f, 7.691000000000001f, 20.941999999999993f)
                    curveTo(8.4f, 21.0f, 9.273f, 21.0f, 10.357f, 21.0f)
                    lineTo(13.642999999999999f, 21.0f)
                    curveTo(14.726999999999999f, 21.0f, 15.600999999999999f, 21.0f, 16.308999999999997f, 20.942f)
                    curveTo(17.037999999999997f, 20.882f, 17.677999999999997f, 20.757f, 18.269999999999996f, 20.455000000000002f)
                    arcTo(5.0f, 5.0f, 62.999317372831996f, isMoreThanHalf = false, isPositiveArc = false, 20.454999999999995f, 18.270000000000003f)
                    curveTo(20.756999999999994f, 17.678000000000004f, 20.882999999999996f, 17.038000000000004f, 20.941999999999993f, 16.309000000000005f)
                    curveTo(21.0f, 15.6f, 21.0f, 14.727f, 21.0f, 13.643f)
                    lineTo(21.0f, 13.0f)
                    lineTo(19.0f, 13.0f)
                    lineTo(19.0f, 13.6f)
                    curveTo(19.0f, 14.737f, 19.0f, 15.529f, 18.949f, 16.146f)
                    curveTo(18.899f, 16.751f, 18.807000000000002f, 17.099f, 18.673000000000002f, 17.362000000000002f)
                    arcTo(3.0f, 3.0f, 27.00068262716798f, isMoreThanHalf = false, isPositiveArc = true, 17.362000000000002f, 18.673000000000002f)
                    curveTo(17.099f, 18.807000000000002f, 16.751f, 18.899f, 16.146f, 18.949f)
                    curveTo(15.529f, 18.999000000000002f, 14.736f, 19.0f, 13.600000000000001f, 19.0f)
                    lineTo(10.400000000000002f, 19.0f)
                    curveTo(9.263000000000002f, 19.0f, 8.471000000000002f, 19.0f, 7.854000000000003f, 18.949f)
                    curveTo(7.249000000000002f, 18.899f, 6.9010000000000025f, 18.807000000000002f, 6.638000000000003f, 18.673000000000002f)
                    arcTo(3.0f, 3.0f, 117.00068262716798f, isMoreThanHalf = false, isPositiveArc = true, 5.327000000000003f, 17.362000000000002f)
                    curveTo(5.193000000000002f, 17.099f, 5.101000000000003f, 16.751f, 5.051000000000003f, 16.146f)
                    curveTo(5.001f, 15.529f, 5.0f, 14.736f, 5.0f, 13.6f)
                    lineTo(5.0f, 10.399999999999999f)
                    curveTo(5.0f, 9.262999999999998f, 5.0f, 8.470999999999998f, 5.051f, 7.853999999999999f)
                    curveTo(5.101f, 7.248999999999999f, 5.1930000000000005f, 6.900999999999999f, 5.327f, 6.637999999999999f)
                    arcTo(3.0f, 3.0f, 207.00068262716798f, isMoreThanHalf = false, isPositiveArc = true, 6.638f, 5.326999999999999f)
                    curveTo(6.901f, 5.192999999999999f, 7.249f, 5.100999999999999f, 7.854f, 5.050999999999999f)
                    curveTo(8.471f, 5.001f, 9.264f, 5.0f, 10.4f, 5.0f)
                    lineTo(12.0f, 5.0f)
                    close()
                    moveTo(19.469f, 5.293f)
                    lineTo(14.754f, 10.007f)
                    lineTo(12.707f, 7.96f)
                    arcTo(1.0f, 1.0f, 315.9957446135786f, isMoreThanHalf = true, isPositiveArc = false, 11.293000000000001f, 9.374f)
                    lineTo(14.446000000000002f, 12.527000000000001f)
                    curveTo(14.616000000000001f, 12.697000000000001f, 14.893f, 12.697000000000001f, 15.063000000000002f, 12.527000000000001f)
                    lineTo(20.883000000000003f, 6.707000000000001f)
                    arcTo(1.0f, 1.0f, 44.004255386422344f, isMoreThanHalf = false, isPositiveArc = false, 19.469f, 5.293000000000001f)
                }
            }.build().also {
                _appCheck = it
            }
    }


private var _appCheck: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun AppCheckIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.AppCheck.imageVector,
            contentDescription = null,
    )
}
