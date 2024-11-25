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

val BezierIcons.ArrowTurnRightUp: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_arrow_turn_right_up
        override val imageVector: ImageVector
            get() = _arrowTurnRightUp ?: ImageVector.Builder(
                    name = "ArrowTurnRightUp",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(17.207f, 14.207f)
                    arcTo(1.0f, 1.0f, 45.99574461357973f, isMoreThanHalf = false, isPositiveArc = true, 15.793000000000001f, 12.793000000000001f)
                    lineTo(18.586f, 10.0f)
                    lineTo(10.0f, 10.0f)
                    arcTo(5.0f, 5.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 5.0f, 15.0f)
                    lineTo(5.0f, 19.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 3.0f, 19.0f)
                    lineTo(3.0f, 15.0f)
                    arcTo(7.0f, 7.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 10.0f, 8.0f)
                    lineTo(18.586f, 8.0f)
                    lineTo(15.793f, 5.207f)
                    arcTo(1.0f, 1.0f, 135.99574461357767f, isMoreThanHalf = false, isPositiveArc = true, 17.207f, 3.793f)
                    lineTo(21.707f, 8.293f)
                    arcTo(1.0f, 1.0f, 315.008651662838f, isMoreThanHalf = false, isPositiveArc = true, 21.707f, 9.706999999999999f)
                    close()
                }
            }.build().also {
                _arrowTurnRightUp = it
            }
    }


private var _arrowTurnRightUp: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ArrowTurnRightUpIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ArrowTurnRightUp.imageVector,
            contentDescription = null,
    )
}
