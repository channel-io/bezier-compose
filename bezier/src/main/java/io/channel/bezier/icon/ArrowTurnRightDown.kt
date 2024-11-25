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

val BezierIcons.ArrowTurnRightDown: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_arrow_turn_right_down
        override val imageVector: ImageVector
            get() = _arrowTurnRightDown ?: ImageVector.Builder(
                    name = "ArrowTurnRightDown",
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
                    moveTo(16.207f, 9.793f)
                    arcTo(1.0f, 1.0f, 315.99574461357975f, isMoreThanHalf = true, isPositiveArc = false, 14.793000000000001f, 11.206999999999999f)
                    lineTo(17.586f, 14.0f)
                    lineTo(9.0f, 14.0f)
                    arcTo(5.0f, 5.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 4.0f, 9.0f)
                    lineTo(4.0f, 5.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = true, isPositiveArc = false, 2.0f, 5.0f)
                    lineTo(2.0f, 9.0f)
                    arcTo(7.0f, 7.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 9.0f, 16.0f)
                    lineTo(17.586f, 16.0f)
                    lineTo(14.793f, 18.793f)
                    arcTo(1.0f, 1.0f, 224.00425538642457f, isMoreThanHalf = false, isPositiveArc = false, 16.207f, 20.207f)
                    lineTo(20.707f, 15.707f)
                    arcTo(1.0f, 1.0f, 44.991348337162f, isMoreThanHalf = false, isPositiveArc = false, 20.707f, 14.293000000000001f)
                    close()
                }
            }.build().also {
                _arrowTurnRightDown = it
            }
    }


private var _arrowTurnRightDown: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ArrowTurnRightDownIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ArrowTurnRightDown.imageVector,
            contentDescription = null,
    )
}
