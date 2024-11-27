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

val BezierIcons.Gift: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_gift
        override val imageVector: ImageVector
            get() = _gift ?: ImageVector.Builder(
                    name = "Gift",
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
                    moveTo(15.5f, 2.0f)
                    arcTo(3.5f, 3.5f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 12.0f, 5.5f)
                    arcTo(3.5f, 3.5f, 359.9750440078873f, isMoreThanHalf = true, isPositiveArc = false, 5.337f, 7.0f)
                    lineTo(5.0f, 7.0f)
                    arcTo(2.0f, 2.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 3.0f, 9.0f)
                    lineTo(3.0f, 19.0f)
                    arcTo(2.0f, 2.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 5.0f, 21.0f)
                    lineTo(19.0f, 21.0f)
                    arcTo(2.0f, 2.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 21.0f, 19.0f)
                    lineTo(21.0f, 9.0f)
                    arcTo(2.0f, 2.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 19.0f, 7.0f)
                    lineTo(18.663f, 7.0f)
                    arcTo(3.5f, 3.5f, 25.376934875825384f, isMoreThanHalf = false, isPositiveArc = false, 15.5f, 2.0f)
                    moveTo(15.5f, 7.0f)
                    arcTo(1.5f, 1.5f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 14.0f, 5.5f)
                    lineTo(14.0f, 7.0f)
                    close()
                    moveTo(8.5f, 7.0f)
                    lineTo(10.0f, 7.0f)
                    lineTo(10.0f, 5.5f)
                    arcTo(1.5f, 1.5f, 0.0f, isMoreThanHalf = true, isPositiveArc = false, 8.5f, 7.0f)
                    moveTo(5.0f, 9.0f)
                    lineTo(5.0f, 19.0f)
                    lineTo(10.0f, 19.0f)
                    lineTo(10.0f, 9.0f)
                    close()
                    moveTo(14.0f, 9.0f)
                    lineTo(19.0f, 9.0f)
                    lineTo(19.0f, 19.0f)
                    lineTo(14.0f, 19.0f)
                    close()
                }
            }.build().also {
                _gift = it
            }
    }


private var _gift: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun GiftIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Gift.imageVector,
            contentDescription = null,
    )
}
