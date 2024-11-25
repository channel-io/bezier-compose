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

val BezierIcons.BlockSmall: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_block_small
        override val imageVector: ImageVector
            get() = _blockSmall ?: ImageVector.Builder(
                    name = "BlockSmall",
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
                    moveTo(17.0f, 12.0f)
                    arcTo(5.0f, 5.0f, 359.99088928344105f, isMoreThanHalf = false, isPositiveArc = true, 9.243f, 16.172f)
                    lineTo(16.172f, 9.242f)
                    curveTo(16.695f, 10.033000000000001f, 17.0f, 10.981000000000002f, 17.0f, 12.0f)
                    moveTo(7.827999999999999f, 14.758f)
                    lineTo(14.758f, 7.827999999999999f)
                    arcTo(5.0f, 5.0f, 303.49536615611447f, isMoreThanHalf = false, isPositiveArc = false, 7.828999999999999f, 14.757f)
                    moveTo(19.0f, 12.0f)
                    arcTo(7.0f, 7.0f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 5.0f, 12.0f)
                    arcTo(7.0f, 7.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 19.0f, 12.0f)
                }
            }.build().also {
                _blockSmall = it
            }
    }


private var _blockSmall: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun BlockSmallIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.BlockSmall.imageVector,
            contentDescription = null,
    )
}
