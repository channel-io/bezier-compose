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

val BezierIcons.List: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_list
        override val imageVector: ImageVector
            get() = _list ?: ImageVector.Builder(
                    name = "List",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(4.5f, 6.5f)
                    arcTo(1.5f, 1.5f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 4.5f, 3.5f)
                    arcTo(1.5f, 1.5f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 6.5f)
                    moveTo(4.5f, 13.5f)
                    arcTo(1.5f, 1.5f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 4.5f, 10.5f)
                    arcTo(1.5f, 1.5f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 13.5f)
                    moveTo(6.0f, 19.0f)
                    arcTo(1.5f, 1.5f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 3.0f, 19.0f)
                    arcTo(1.5f, 1.5f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 6.0f, 19.0f)
                    moveTo(9.0f, 6.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 9.0f, 4.0f)
                    lineTo(20.0f, 4.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = true, 20.0f, 6.0f)
                    close()
                    moveTo(8.0f, 12.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 9.0f, 13.0f)
                    lineTo(20.0f, 13.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 20.0f, 11.0f)
                    lineTo(9.0f, 11.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 8.0f, 12.0f)
                    moveTo(9.0f, 20.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = true, 9.0f, 18.0f)
                    lineTo(20.0f, 18.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = true, 20.0f, 20.0f)
                    close()
                }
            }.build().also {
                _list = it
            }
    }


private var _list: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ListIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.List.imageVector,
            contentDescription = null,
    )
}
