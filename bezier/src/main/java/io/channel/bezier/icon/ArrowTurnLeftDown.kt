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

val BezierIcons.ArrowTurnLeftDown: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _arrowTurnLeftDown ?: ImageVector.Builder(
                    name = "ArrowTurnLeftDown",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(7.793f, 9.793f)
                    arcTo(1.0f, 1.0f, 225.9957446135786f, isMoreThanHalf = false, isPositiveArc = true, 9.207f, 11.206999999999999f)
                    lineTo(6.414f, 14.0f)
                    lineTo(15.0f, 14.0f)
                    arcTo(5.0f, 5.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 20.0f, 9.0f)
                    lineTo(20.0f, 5.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = true, 22.0f, 5.0f)
                    lineTo(22.0f, 9.0f)
                    arcTo(7.0f, 7.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 15.0f, 16.0f)
                    lineTo(6.414f, 16.0f)
                    lineTo(9.207f, 18.793f)
                    arcTo(1.0f, 1.0f, 314.0042553864224f, isMoreThanHalf = true, isPositiveArc = true, 7.793000000000001f, 20.207f)
                    lineTo(3.293000000000001f, 15.707f)
                    arcTo(1.0f, 1.0f, 135.00865166283802f, isMoreThanHalf = false, isPositiveArc = true, 3.293000000000001f, 14.293000000000001f)
                    close()
                }
            }.build().also {
                _arrowTurnLeftDown = it
            }
    }


private var _arrowTurnLeftDown: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ArrowTurnLeftDownIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ArrowTurnLeftDown.imageVector,
            contentDescription = null,
    )
}
