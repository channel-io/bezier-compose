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

val BezierIcons.Funnel: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_funnel
        override val imageVector: ImageVector
            get() = _funnel ?: ImageVector.Builder(
                    name = "Funnel",
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
                    moveTo(20.0f, 2.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 21.0f, 3.0f)
                    lineTo(21.0f, 5.172000000000001f)
                    arcTo(2.0f, 2.0f, 0.01223660524386911f, isMoreThanHalf = false, isPositiveArc = true, 20.414f, 6.586f)
                    lineTo(15.586000000000002f, 11.414000000000001f)
                    arcTo(2.0f, 2.0f, 225.00865351048375f, isMoreThanHalf = false, isPositiveArc = false, 15.0f, 12.828f)
                    lineTo(15.0f, 19.381999999999998f)
                    arcTo(1.0f, 1.0f, 0.0305975592968951f, isMoreThanHalf = false, isPositiveArc = true, 14.447f, 20.275999999999996f)
                    lineTo(10.447f, 22.275999999999996f)
                    arcTo(1.0f, 1.0f, 63.44862151278873f, isMoreThanHalf = false, isPositiveArc = true, 9.0f, 21.382f)
                    lineTo(9.0f, 12.828000000000001f)
                    arcTo(2.0f, 2.0f, 359.98776339472636f, isMoreThanHalf = false, isPositiveArc = false, 8.414f, 11.414000000000001f)
                    lineTo(3.586f, 6.586f)
                    arcTo(2.0f, 2.0f, 134.99134648951636f, isMoreThanHalf = false, isPositiveArc = true, 3.0f, 5.172f)
                    lineTo(3.0f, 3.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 4.0f, 2.0f)
                    close()
                    moveTo(19.0f, 4.0f)
                    lineTo(5.0f, 4.0f)
                    lineTo(5.0f, 5.172f)
                    lineTo(9.828f, 10.0f)
                    curveTo(10.125f, 10.296f, 10.37f, 10.634f, 10.558f, 11.0f)
                    lineTo(13.442f, 11.0f)
                    quadTo(13.674f, 10.549f, 14.016f, 10.165f)
                    lineTo(14.172f, 10.0f)
                    lineTo(19.0f, 5.172f)
                    close()
                    moveTo(13.0f, 13.0f)
                    lineTo(11.0f, 13.0f)
                    lineTo(11.0f, 19.762999999999998f)
                    lineTo(13.0f, 18.762999999999998f)
                    close()
                }
            }.build().also {
                _funnel = it
            }
    }


private var _funnel: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun FunnelIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Funnel.imageVector,
            contentDescription = null,
    )
}
