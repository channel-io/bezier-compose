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

val BezierIcons.Skip: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_skip
        override val imageVector: ImageVector
            get() = _skip ?: ImageVector.Builder(
                    name = "Skip",
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
                    moveTo(15.3f, 4.2f)
                    arcTo(1.6f, 1.6f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 16.900000000000002f, 2.6f)
                    lineTo(19.1f, 2.6f)
                    arcTo(1.6f, 1.6f, 269.99999999999994f, isMoreThanHalf = false, isPositiveArc = true, 20.700000000000003f, 4.2f)
                    lineTo(20.700000000000003f, 19.8f)
                    arcTo(1.6f, 1.6f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 19.1f, 21.400000000000002f)
                    lineTo(16.900000000000002f, 21.400000000000002f)
                    arcTo(1.6f, 1.6f, 90.00000000000003f, isMoreThanHalf = false, isPositiveArc = true, 15.300000000000002f, 19.8f)
                    lineTo(15.3f, 14.0f)
                    lineTo(7.300000000000001f, 20.0f)
                    curveTo(5.652000000000001f, 21.236f, 3.3000000000000007f, 20.06f, 3.3000000000000007f, 18.0f)
                    lineTo(3.3f, 6.0f)
                    curveTo(3.3f, 3.94f, 5.651999999999999f, 2.764f, 7.3f, 4.0f)
                    lineTo(15.3f, 10.0f)
                    close()
                    moveTo(17.3f, 4.6f)
                    lineTo(17.3f, 19.4f)
                    lineTo(18.7f, 19.4f)
                    lineTo(18.7f, 4.6f)
                    close()
                    moveTo(6.1f, 5.6f)
                    arcTo(0.5f, 0.5f, 306.869897645844f, isMoreThanHalf = false, isPositiveArc = false, 5.3f, 6.0f)
                    lineTo(5.3f, 18.0f)
                    arcTo(0.5f, 0.5f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 6.1f, 18.4f)
                    lineTo(14.1f, 12.399999999999999f)
                    arcTo(0.5f, 0.5f, 53.13010235415605f, isMoreThanHalf = false, isPositiveArc = false, 14.1f, 11.599999999999998f)
                    close()
                }
            }.build().also {
                _skip = it
            }
    }


private var _skip: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun SkipIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Skip.imageVector,
            contentDescription = null,
    )
}
