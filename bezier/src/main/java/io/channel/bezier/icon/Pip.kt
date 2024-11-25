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

val BezierIcons.Pip: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_pip
        override val imageVector: ImageVector
            get() = _pip ?: ImageVector.Builder(
                    name = "Pip",
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
                    moveTo(12.0f, 21.0f)
                    lineTo(13.643f, 21.0f)
                    curveTo(14.727f, 21.0f, 15.601f, 21.0f, 16.309f, 20.942f)
                    curveTo(17.038f, 20.882f, 17.678f, 20.757f, 18.27f, 20.455000000000002f)
                    arcTo(5.0f, 5.0f, 62.999317372831996f, isMoreThanHalf = false, isPositiveArc = false, 20.455f, 18.270000000000003f)
                    curveTo(20.756999999999998f, 17.678000000000004f, 20.883f, 17.038000000000004f, 20.941999999999997f, 16.309000000000005f)
                    curveTo(21.0f, 15.6f, 21.0f, 14.727f, 21.0f, 13.643f)
                    lineTo(21.0f, 10.357000000000001f)
                    curveTo(21.0f, 9.273000000000001f, 21.0f, 8.399000000000001f, 20.942f, 7.691000000000001f)
                    curveTo(20.882f, 6.963000000000001f, 20.757f, 6.322000000000001f, 20.455000000000002f, 5.731000000000001f)
                    arcTo(5.0f, 5.0f, 333.01668597633756f, isMoreThanHalf = false, isPositiveArc = false, 18.270000000000003f, 3.545000000000001f)
                    curveTo(17.678000000000004f, 3.2430000000000008f, 17.038000000000004f, 3.117000000000001f, 16.309000000000005f, 3.0580000000000007f)
                    curveTo(15.6f, 3.0f, 14.727f, 3.0f, 13.643f, 3.0f)
                    lineTo(10.357000000000001f, 3.0f)
                    curveTo(9.273f, 3.0f, 8.4f, 3.0f, 7.691f, 3.058f)
                    curveTo(6.963f, 3.118f, 6.322f, 3.243f, 5.731f, 3.545f)
                    arcTo(5.0f, 5.0f, 243.03404965920066f, isMoreThanHalf = false, isPositiveArc = false, 3.544f, 5.73f)
                    curveTo(3.242f, 6.322f, 3.116f, 6.963000000000001f, 3.057f, 7.691000000000001f)
                    curveTo(3.0f, 8.4f, 3.0f, 9.273f, 3.0f, 10.357f)
                    lineTo(3.0f, 12.0f)
                    lineTo(5.0f, 12.0f)
                    lineTo(5.0f, 10.4f)
                    curveTo(5.0f, 9.263f, 5.0f, 8.471f, 5.051f, 7.854000000000001f)
                    curveTo(5.101f, 7.2490000000000006f, 5.1930000000000005f, 6.901000000000001f, 5.327f, 6.638000000000001f)
                    arcTo(3.0f, 3.0f, 207.00068262716798f, isMoreThanHalf = false, isPositiveArc = true, 6.638f, 5.327000000000001f)
                    curveTo(6.901f, 5.1930000000000005f, 7.249f, 5.101000000000001f, 7.854f, 5.051000000000001f)
                    curveTo(8.471f, 5.001f, 9.264f, 5.0f, 10.4f, 5.0f)
                    lineTo(13.600000000000001f, 5.0f)
                    curveTo(14.737000000000002f, 5.0f, 15.529000000000002f, 5.0f, 16.146f, 5.051f)
                    curveTo(16.751f, 5.101f, 17.099f, 5.1930000000000005f, 17.362000000000002f, 5.327f)
                    arcTo(3.0f, 3.0f, 297.000682627168f, isMoreThanHalf = false, isPositiveArc = true, 18.673000000000002f, 6.638f)
                    curveTo(18.807000000000002f, 6.901f, 18.899f, 7.249f, 18.949f, 7.854f)
                    curveTo(18.999000000000002f, 8.471f, 19.0f, 9.264f, 19.0f, 10.4f)
                    lineTo(19.0f, 13.600000000000001f)
                    curveTo(19.0f, 14.737000000000002f, 19.0f, 15.529000000000002f, 18.949f, 16.146f)
                    curveTo(18.899f, 16.751f, 18.807000000000002f, 17.099f, 18.673000000000002f, 17.362000000000002f)
                    arcTo(3.0f, 3.0f, 27.00068262716798f, isMoreThanHalf = false, isPositiveArc = true, 17.362000000000002f, 18.673000000000002f)
                    curveTo(17.099f, 18.807000000000002f, 16.751f, 18.899f, 16.146f, 18.949f)
                    curveTo(15.529f, 18.999000000000002f, 14.736f, 19.0f, 13.600000000000001f, 19.0f)
                    lineTo(12.0f, 19.0f)
                    close()
                    moveTo(5.0f, 15.0f)
                    lineTo(9.0f, 15.0f)
                    lineTo(9.0f, 19.0f)
                    lineTo(5.0f, 19.0f)
                    close()
                    moveTo(3.0f, 15.0f)
                    arcTo(2.0f, 2.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 5.0f, 13.0f)
                    lineTo(9.0f, 13.0f)
                    arcTo(2.0f, 2.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 11.0f, 15.0f)
                    lineTo(11.0f, 19.0f)
                    arcTo(2.0f, 2.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 9.0f, 21.0f)
                    lineTo(5.0f, 21.0f)
                    arcTo(2.0f, 2.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 3.0f, 19.0f)
                    close()
                }
            }.build().also {
                _pip = it
            }
    }


private var _pip: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun PipIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Pip.imageVector,
            contentDescription = null,
    )
}
