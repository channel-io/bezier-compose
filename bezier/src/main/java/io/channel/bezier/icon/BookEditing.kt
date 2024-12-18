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

val BezierIcons.BookEditing: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_book_editing
        override val imageVector: ImageVector
            get() = _bookEditing ?: ImageVector.Builder(
                    name = "BookEditing",
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
                    moveTo(7.0f, 2.0f)
                    arcTo(4.0f, 4.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 3.0f, 6.0f)
                    lineTo(3.0f, 18.0f)
                    arcTo(4.0f, 4.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 7.0f, 22.0f)
                    lineTo(9.0f, 22.0f)
                    lineTo(9.0f, 4.0f)
                    lineTo(17.0f, 4.0f)
                    arcTo(2.0f, 2.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 19.0f, 6.0f)
                    lineTo(19.0f, 9.0f)
                    lineTo(21.0f, 9.0f)
                    lineTo(21.0f, 6.0f)
                    arcTo(4.0f, 4.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 17.0f, 2.0f)
                    close()
                    moveTo(7.0f, 4.0f)
                    arcTo(2.0f, 2.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 5.0f, 6.0f)
                    lineTo(5.0f, 18.0f)
                    arcTo(2.0f, 2.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 7.0f, 20.0f)
                    close()
                    moveTo(11.0f, 8.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 12.0f, 7.0f)
                    lineTo(16.0f, 7.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = true, 16.0f, 9.0f)
                    lineTo(12.0f, 9.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 11.0f, 8.0f)
                    moveTo(21.198f, 13.296f)
                    lineTo(19.704f, 11.802999999999999f)
                    lineTo(21.198f, 10.309f)
                    arcTo(1.056f, 1.056f, 226.37965484278146f, isMoreThanHalf = false, isPositiveArc = true, 22.69f, 11.802999999999999f)
                    close()
                    moveTo(12.493f, 22.0f)
                    lineTo(11.0f, 22.0f)
                    lineTo(11.0f, 20.507f)
                    lineTo(18.958f, 12.549000000000001f)
                    lineTo(20.450999999999997f, 14.042000000000002f)
                    close()
                }
            }.build().also {
                _bookEditing = it
            }
    }


private var _bookEditing: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun BookEditingIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.BookEditing.imageVector,
            contentDescription = null,
    )
}
