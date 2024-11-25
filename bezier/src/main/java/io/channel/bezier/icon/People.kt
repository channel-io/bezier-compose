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

val BezierIcons.People: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_people
        override val imageVector: ImageVector
            get() = _people ?: ImageVector.Builder(
                    name = "People",
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
                    moveTo(8.0f, 5.0f)
                    arcTo(2.0f, 2.0f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 4.0f, 5.0f)
                    arcTo(2.0f, 2.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 8.0f, 5.0f)
                    moveTo(4.0f, 16.0f)
                    lineTo(5.0f, 16.0f)
                    lineTo(5.0f, 20.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = false, 7.0f, 20.0f)
                    lineTo(7.0f, 16.0f)
                    lineTo(8.0f, 16.0f)
                    lineTo(8.0f, 9.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 7.0f, 8.0f)
                    lineTo(5.0f, 8.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 4.0f, 9.0f)
                    close()
                    moveTo(10.0f, 16.0f)
                    lineTo(11.0f, 16.0f)
                    lineTo(11.0f, 20.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = false, 13.0f, 20.0f)
                    lineTo(13.0f, 16.0f)
                    lineTo(14.0f, 16.0f)
                    lineTo(14.0f, 9.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 13.0f, 8.0f)
                    lineTo(11.0f, 8.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 10.0f, 9.0f)
                    close()
                    moveTo(17.0f, 16.0f)
                    lineTo(16.0f, 16.0f)
                    lineTo(16.0f, 9.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 17.0f, 8.0f)
                    lineTo(19.0f, 8.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 20.0f, 9.0f)
                    lineTo(20.0f, 16.0f)
                    lineTo(19.0f, 16.0f)
                    lineTo(19.0f, 20.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 17.0f, 20.0f)
                    close()
                    moveTo(12.0f, 7.0f)
                    arcTo(2.0f, 2.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 12.0f, 3.0f)
                    arcTo(2.0f, 2.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 12.0f, 7.0f)
                    moveTo(20.0f, 5.0f)
                    arcTo(2.0f, 2.0f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 16.0f, 5.0f)
                    arcTo(2.0f, 2.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 20.0f, 5.0f)
                }
            }.build().also {
                _people = it
            }
    }


private var _people: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun PeopleIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.People.imageVector,
            contentDescription = null,
    )
}
