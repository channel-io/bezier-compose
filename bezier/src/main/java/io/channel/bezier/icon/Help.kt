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

val BezierIcons.Help: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_help
        override val imageVector: ImageVector
            get() = _help ?: ImageVector.Builder(
                    name = "Help",
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
                    moveTo(22.0f, 12.0f)
                    curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                    curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                    curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                    curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                    moveTo(20.0f, 12.0f)
                    arcTo(8.0f, 8.0f, 0.0f, isMoreThanHalf = true, isPositiveArc = false, 4.0f, 12.0f)
                    arcTo(8.0f, 8.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 20.0f, 12.0f)
                    moveTo(10.933f, 14.492f)
                    lineTo(12.834f, 14.492f)
                    lineTo(12.834f, 13.784f)
                    curveTo(12.834f, 13.065000000000001f, 13.382f, 12.641f, 13.618f, 12.492f)
                    curveTo(14.451f, 11.969000000000001f, 15.843f, 11.091000000000001f, 15.843f, 9.437000000000001f)
                    curveTo(15.843f, 7.497000000000002f, 14.156f, 5.975000000000001f, 12.001999999999999f, 5.975000000000001f)
                    curveTo(9.918999999999999f, 5.975000000000001f, 8.159999999999998f, 7.561000000000002f, 8.159999999999998f, 9.437000000000001f)
                    lineTo(10.059999999999999f, 9.437000000000001f)
                    curveTo(10.059999999999999f, 8.606000000000002f, 10.966999999999999f, 7.877000000000001f, 12.001999999999999f, 7.877000000000001f)
                    curveTo(12.941999999999998f, 7.877000000000001f, 13.941999999999998f, 8.423f, 13.941999999999998f, 9.437000000000001f)
                    curveTo(13.941999999999998f, 9.945f, 13.471999999999998f, 10.338000000000001f, 12.604999999999999f, 10.885000000000002f)
                    curveTo(11.557999999999998f, 11.545000000000002f, 10.932999999999998f, 12.628000000000002f, 10.932999999999998f, 13.784000000000002f)
                    close()
                    moveTo(11.944f, 18.124f)
                    arcTo(1.243f, 1.243f, 90.04609503324244f, isMoreThanHalf = true, isPositiveArc = false, 11.946000000000002f, 15.637999999999998f)
                    arcTo(1.243f, 1.243f, 270.04609445533674f, isMoreThanHalf = false, isPositiveArc = false, 11.944f, 18.124f)
                }
            }.build().also {
                _help = it
            }
    }


private var _help: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun HelpIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Help.imageVector,
            contentDescription = null,
    )
}
