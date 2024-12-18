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

val BezierIcons.IntoPageAlt: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_into_page_alt
        override val imageVector: ImageVector
            get() = _intoPageAlt ?: ImageVector.Builder(
                    name = "IntoPageAlt",
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
                    moveTo(10.357f, 3.0f)
                    lineTo(12.0f, 3.0f)
                    lineTo(12.0f, 5.0f)
                    lineTo(10.4f, 5.0f)
                    curveTo(9.263f, 5.0f, 8.471f, 5.0f, 7.854000000000001f, 5.051f)
                    curveTo(7.2490000000000006f, 5.101f, 6.901000000000001f, 5.1930000000000005f, 6.638000000000001f, 5.327f)
                    arcTo(3.0f, 3.0f, 242.99931737283202f, isMoreThanHalf = false, isPositiveArc = false, 5.327000000000001f, 6.638f)
                    curveTo(5.1930000000000005f, 6.901f, 5.101000000000001f, 7.249f, 5.051000000000001f, 7.854f)
                    curveTo(5.001f, 8.471f, 5.0f, 9.264f, 5.0f, 10.4f)
                    lineTo(5.0f, 13.600000000000001f)
                    curveTo(5.0f, 14.737000000000002f, 5.0f, 15.529000000000002f, 5.051f, 16.146f)
                    curveTo(5.101f, 16.751f, 5.1930000000000005f, 17.099f, 5.327f, 17.362000000000002f)
                    arcTo(3.0f, 3.0f, 152.99931737283202f, isMoreThanHalf = false, isPositiveArc = false, 6.638f, 18.673000000000002f)
                    curveTo(6.901f, 18.807000000000002f, 7.249f, 18.899f, 7.854f, 18.949f)
                    curveTo(8.471f, 18.999000000000002f, 9.264f, 19.0f, 10.4f, 19.0f)
                    lineTo(13.600000000000001f, 19.0f)
                    curveTo(14.737000000000002f, 19.0f, 15.529000000000002f, 19.0f, 16.146f, 18.949f)
                    curveTo(16.751f, 18.899f, 17.099f, 18.807000000000002f, 17.362000000000002f, 18.673000000000002f)
                    arcTo(3.0f, 3.0f, 62.99931737283202f, isMoreThanHalf = false, isPositiveArc = false, 18.673000000000002f, 17.362000000000002f)
                    curveTo(18.807000000000002f, 17.099f, 18.899f, 16.751f, 18.949f, 16.146f)
                    curveTo(18.999000000000002f, 15.529f, 19.0f, 14.736f, 19.0f, 13.600000000000001f)
                    lineTo(19.0f, 12.0f)
                    lineTo(21.0f, 12.0f)
                    lineTo(21.0f, 13.643f)
                    curveTo(21.0f, 14.727f, 21.0f, 15.601f, 20.942f, 16.309f)
                    curveTo(20.882f, 17.038f, 20.757f, 17.678f, 20.455000000000002f, 18.27f)
                    arcTo(5.0f, 5.0f, 27.000682627167993f, isMoreThanHalf = false, isPositiveArc = true, 18.270000000000003f, 20.455f)
                    curveTo(17.678000000000004f, 20.756999999999998f, 17.038000000000004f, 20.883f, 16.309000000000005f, 20.941999999999997f)
                    curveTo(15.6f, 21.0f, 14.727f, 21.0f, 13.643f, 21.0f)
                    lineTo(10.357000000000001f, 21.0f)
                    curveTo(9.273000000000001f, 21.0f, 8.399000000000001f, 21.0f, 7.691000000000001f, 20.942f)
                    curveTo(6.963000000000001f, 20.882f, 6.322000000000001f, 20.757f, 5.731000000000001f, 20.455000000000002f)
                    arcTo(5.0f, 5.0f, 116.98331402366246f, isMoreThanHalf = false, isPositiveArc = true, 3.545000000000001f, 18.270000000000003f)
                    curveTo(3.2430000000000008f, 17.678000000000004f, 3.117000000000001f, 17.038000000000004f, 3.0580000000000007f, 16.309000000000005f)
                    curveTo(3.0f, 15.6f, 3.0f, 14.727f, 3.0f, 13.643f)
                    lineTo(3.0f, 10.357000000000001f)
                    curveTo(3.0f, 9.273000000000001f, 3.0f, 8.399000000000001f, 3.058f, 7.691000000000001f)
                    curveTo(3.118f, 6.963000000000001f, 3.243f, 6.322000000000001f, 3.545f, 5.731000000000001f)
                    arcTo(5.0f, 5.0f, 206.96595034079928f, isMoreThanHalf = false, isPositiveArc = true, 5.73f, 3.544f)
                    curveTo(6.322f, 3.242f, 6.963000000000001f, 3.116f, 7.691000000000001f, 3.057f)
                    curveTo(8.4f, 3.0f, 9.273f, 3.0f, 10.357f, 3.0f)
                }

                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(10.192f, 8.412f)
                    curveTo(10.0f, 8.636f, 10.0f, 9.12f, 10.0f, 10.09f)
                    lineTo(10.0f, 12.4f)
                    curveTo(10.0f, 12.96f, 10.0f, 13.24f, 10.109f, 13.454f)
                    arcTo(1.0f, 1.0f, 152.999317372832f, isMoreThanHalf = false, isPositiveArc = false, 10.546f, 13.891f)
                    curveTo(10.76f, 14.0f, 11.04f, 14.0f, 11.6f, 14.0f)
                    lineTo(13.91f, 14.0f)
                    curveTo(14.88f, 14.0f, 15.364f, 14.0f, 15.588000000000001f, 13.808f)
                    arcTo(0.8f, 0.8f, 49.494643892665174f, isMoreThanHalf = false, isPositiveArc = false, 15.866000000000001f, 13.138f)
                    curveTo(15.843000000000002f, 12.843f, 15.500000000000002f, 12.5f, 14.815000000000001f, 11.815f)
                    lineTo(14.207f, 11.206999999999999f)
                    lineTo(19.207f, 6.206999999999999f)
                    arcTo(1.0f, 1.0f, 44.004255386422344f, isMoreThanHalf = false, isPositiveArc = false, 17.793f, 4.792999999999999f)
                    lineTo(12.793f, 9.793f)
                    lineTo(12.184999999999999f, 9.184999999999999f)
                    curveTo(11.499999999999998f, 8.499999999999998f, 11.156999999999998f, 8.156999999999998f, 10.863f, 8.133999999999999f)
                    arcTo(0.8f, 0.8f, 274.49239053789677f, isMoreThanHalf = false, isPositiveArc = false, 10.192f, 8.411999999999999f)
                }
            }.build().also {
                _intoPageAlt = it
            }
    }


private var _intoPageAlt: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun IntoPageAltIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.IntoPageAlt.imageVector,
            contentDescription = null,
    )
}
