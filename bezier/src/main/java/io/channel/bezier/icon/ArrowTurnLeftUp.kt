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

val BezierIcons.ArrowTurnLeftUp: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _arrowTurnLeftUp ?: ImageVector.Builder(
                    name = "ArrowTurnLeftUp",
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
                    moveTo(6.793f, 14.207f)
                    arcTo(1.0f, 1.0f, 134.0042553864214f, isMoreThanHalf = false, isPositiveArc = false, 8.207f, 12.793000000000001f)
                    lineTo(5.414f, 10.0f)
                    lineTo(14.0f, 10.0f)
                    arcTo(5.0f, 5.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 19.0f, 15.0f)
                    lineTo(19.0f, 19.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = false, 21.0f, 19.0f)
                    lineTo(21.0f, 15.0f)
                    arcTo(7.0f, 7.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 14.0f, 8.0f)
                    lineTo(5.414f, 8.0f)
                    lineTo(8.207f, 5.207f)
                    arcTo(1.0f, 1.0f, 44.00425538642027f, isMoreThanHalf = false, isPositiveArc = false, 6.793000000000001f, 3.793f)
                    lineTo(2.293000000000001f, 8.293f)
                    arcTo(1.0f, 1.0f, 224.99134833716198f, isMoreThanHalf = false, isPositiveArc = false, 2.293000000000001f, 9.706999999999999f)
                    close()
                }
            }.build().also {
                _arrowTurnLeftUp = it
            }
    }


private var _arrowTurnLeftUp: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ArrowTurnLeftUpIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ArrowTurnLeftUp.imageVector,
            contentDescription = null,
    )
}
