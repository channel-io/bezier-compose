@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

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

val BezierIcons.Keypad: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _keypad ?: ImageVector.Builder(
                    name = "Keypad",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                        pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(7.5f, 5.25f)
                    arcTo(2.25f, 2.25f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 3.0f, 5.25f)
                    arcTo(2.25f, 2.25f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 5.25f)
                    moveTo(7.5f, 18.75f)
                    arcTo(2.25f, 2.25f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 3.0f, 18.75f)
                    arcTo(2.25f, 2.25f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 18.75f)
                    moveTo(5.25f, 14.25f)
                    arcTo(2.25f, 2.25f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 5.25f, 9.75f)
                    arcTo(2.25f, 2.25f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 5.25f, 14.25f)
                    moveTo(14.25f, 5.25f)
                    arcTo(2.25f, 2.25f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 9.75f, 5.25f)
                    arcTo(2.25f, 2.25f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 14.25f, 5.25f)
                    moveTo(12.0f, 21.0f)
                    arcTo(2.25f, 2.25f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 12.0f, 16.5f)
                    arcTo(2.25f, 2.25f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 12.0f, 21.0f)
                    moveTo(14.25f, 12.0f)
                    arcTo(2.25f, 2.25f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 9.75f, 12.0f)
                    arcTo(2.25f, 2.25f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 14.25f, 12.0f)
                    moveTo(18.75f, 7.5f)
                    arcTo(2.25f, 2.25f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 18.75f, 3.0f)
                    arcTo(2.25f, 2.25f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 18.75f, 7.5f)
                    moveTo(21.0f, 18.75f)
                    arcTo(2.25f, 2.25f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 16.5f, 18.75f)
                    arcTo(2.25f, 2.25f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 21.0f, 18.75f)
                    moveTo(18.75f, 14.25f)
                    arcTo(2.25f, 2.25f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 18.75f, 9.75f)
                    arcTo(2.25f, 2.25f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 18.75f, 14.25f)
                }
            }.build().also {
                _keypad = it
            }
    }


private var _keypad: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun KeypadIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Keypad.imageVector,
            contentDescription = null,
    )
}
