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

val BezierIcons.PersonAddFilled: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_person_add_filled
        override val imageVector: ImageVector
            get() = _personAddFilled ?: ImageVector.Builder(
                    name = "PersonAddFilled",
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
                    moveTo(17.998f, 4.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = true, 19.998f, 4.0f)
                    lineTo(19.998f, 6.0f)
                    lineTo(21.998f, 6.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 21.998f, 8.0f)
                    lineTo(19.998f, 8.0f)
                    lineTo(19.998f, 10.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 17.998f, 10.0f)
                    lineTo(17.998f, 8.0f)
                    lineTo(15.998000000000001f, 8.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = true, 15.998000000000001f, 6.0f)
                    lineTo(17.998f, 6.0f)
                    close()
                    moveTo(14.614f, 8.6f)
                    arcTo(3.6f, 3.6f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 7.414000000000001f, 8.6f)
                    arcTo(3.6f, 3.6f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 14.614f, 8.6f)
                    moveTo(3.031f, 20.476f)
                    arcTo(8.0f, 8.0f, 183.7358895991468f, isMoreThanHalf = false, isPositiveArc = true, 18.997f, 20.476f)
                    arcTo(0.504f, 0.504f, 357.72511219747304f, isMoreThanHalf = false, isPositiveArc = true, 18.491f, 21.0f)
                    lineTo(3.537f, 21.0f)
                    arcTo(0.504f, 0.504f, 89.72747930682033f, isMoreThanHalf = false, isPositiveArc = true, 3.0309999999999997f, 20.476f)
                }
            }.build().also {
                _personAddFilled = it
            }
    }


private var _personAddFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun PersonAddFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.PersonAddFilled.imageVector,
            contentDescription = null,
    )
}
