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

val BezierIcons.Hourglass3: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_hourglass_3
        override val imageVector: ImageVector
            get() = _hourglass3 ?: ImageVector.Builder(
                    name = "Hourglass3",
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
                    moveTo(17.0f, 6.553f)
                    curveTo(17.0f, 6.933f, 16.855f, 7.307f, 16.582f, 7.631f)
                    lineTo(13.688f, 11.068f)
                    arcTo(1.44f, 1.44f, 220.33249525735715f, isMoreThanHalf = false, isPositiveArc = false, 13.688f, 12.932f)
                    lineTo(16.582f, 16.369f)
                    curveTo(16.855f, 16.694f, 17.0f, 17.067f, 17.0f, 17.448f)
                    lineTo(17.0f, 20.0f)
                    lineTo(7.0f, 20.0f)
                    lineTo(7.0f, 17.448f)
                    curveTo(7.0f, 17.067f, 7.145f, 16.694f, 7.418f, 16.368000000000002f)
                    lineTo(10.313f, 12.931000000000003f)
                    arcTo(1.44f, 1.44f, 40.280319875445535f, isMoreThanHalf = false, isPositiveArc = false, 10.313f, 11.069000000000003f)
                    lineTo(7.418f, 7.632f)
                    curveTo(7.145f, 7.307f, 7.0f, 6.934f, 7.0f, 6.552f)
                    lineTo(7.0f, 4.0f)
                    lineTo(17.0f, 4.0f)
                    close()
                    moveTo(19.0f, 6.553f)
                    lineTo(19.0f, 4.0f)
                    curveTo(19.0f, 2.8979999999999997f, 18.103f, 2.0f, 17.0f, 2.0f)
                    lineTo(7.0f, 2.0f)
                    curveTo(5.897f, 2.0f, 5.0f, 2.898f, 5.0f, 4.0f)
                    lineTo(5.0f, 6.552f)
                    curveTo(5.0f, 7.409999999999999f, 5.307f, 8.23f, 5.888f, 8.92f)
                    lineTo(8.482f, 12.0f)
                    lineTo(5.89f, 15.08f)
                    curveTo(5.307f, 15.77f, 5.0f, 16.589f, 5.0f, 17.448f)
                    lineTo(5.0f, 20.0f)
                    curveTo(5.0f, 21.103f, 5.897f, 22.0f, 7.0f, 22.0f)
                    lineTo(17.0f, 22.0f)
                    curveTo(18.103f, 22.0f, 19.0f, 21.103f, 19.0f, 20.0f)
                    lineTo(19.0f, 17.448f)
                    curveTo(19.0f, 16.601f, 18.685f, 15.76f, 18.112f, 15.08f)
                    lineTo(15.518f, 12.0f)
                    lineTo(18.112000000000002f, 8.919f)
                    curveTo(18.693f, 8.229000000000001f, 19.000000000000004f, 7.409000000000001f, 19.000000000000004f, 6.553000000000001f)
                    moveTo(12.000000000000004f, 13.035f)
                    arcTo(1.0f, 1.0f, 270.01692097620617f, isMoreThanHalf = false, isPositiveArc = false, 11.233000000000004f, 13.393f)
                    curveTo(8.145000000000003f, 17.087f, 8.007000000000005f, 17.253f, 8.000000000000004f, 17.423000000000002f)
                    lineTo(8.0f, 19.0f)
                    lineTo(16.0f, 19.0f)
                    lineTo(16.0f, 17.423000000000002f)
                    curveTo(15.994f, 17.253f, 15.855f, 17.087000000000003f, 12.766f, 13.393f)
                    arcTo(1.0f, 1.0f, 320.0589019218899f, isMoreThanHalf = false, isPositiveArc = false, 12.0f, 13.035f)
                    moveTo(9.307f, 8.322f)
                    lineTo(9.036f, 8.0f)
                    lineTo(14.963999999999999f, 8.0f)
                    lineTo(14.692999999999998f, 8.322f)
                    lineTo(12.764999999999997f, 10.610999999999999f)
                    arcTo(1.0f, 1.0f, 40.090740224788426f, isMoreThanHalf = false, isPositiveArc = true, 11.999999999999996f, 10.966999999999999f)
                    arcTo(1.0f, 1.0f, 90.0014604719923f, isMoreThanHalf = false, isPositiveArc = true, 11.234999999999996f, 10.610999999999999f)
                    close()
                }
            }.build().also {
                _hourglass3 = it
            }
    }


private var _hourglass3: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun Hourglass3IconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Hourglass3.imageVector,
            contentDescription = null,
    )
}
