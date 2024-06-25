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

val BezierIcons.SendForwardFailedFilled: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _sendForwardFailedFilled ?: ImageVector.Builder(
                    name = "SendForwardFailedFilled",
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
                    moveTo(20.919f, 5.01f)
                    lineTo(2.9190000000000005f, 5.01f)
                    arcTo(1.0f, 1.0f, 269.94630457259603f, isMoreThanHalf = false, isPositiveArc = false, 2.1990000000000007f, 6.702999999999999f)
                    lineTo(7.748000000000001f, 12.475999999999999f)
                    lineTo(17.718000000000004f, 7.454999999999999f)
                    lineTo(18.068000000000005f, 8.062f)
                    lineTo(8.745000000000005f, 14.209999999999999f)
                    lineTo(10.921000000000005f, 21.930999999999997f)
                    arcTo(0.998f, 0.998f, 164.43539605599003f, isMoreThanHalf = false, isPositiveArc = false, 12.384000000000004f, 22.525999999999996f)
                    curveTo(12.517000000000003f, 22.447999999999997f, 12.634000000000004f, 22.339999999999996f, 12.722000000000003f, 22.205999999999996f)
                    arcTo(6.0f, 6.0f, 135.45986739358298f, isMoreThanHalf = false, isPositiveArc = true, 18.506000000000004f, 12.189999999999996f)
                    lineTo(21.785000000000004f, 6.509999999999996f)
                    arcTo(1.0f, 1.0f, 30.00000002134776f, isMoreThanHalf = false, isPositiveArc = false, 20.919000000000004f, 5.009999999999996f)
                    moveTo(15.715f, 20.7f)
                    curveTo(16.106f, 20.886f, 16.538f, 21.0f, 17.0f, 21.0f)
                    curveTo(18.654f, 21.0f, 20.0f, 19.654f, 20.0f, 18.0f)
                    curveTo(20.0f, 17.538f, 19.886f, 17.106f, 19.7f, 16.715f)
                    close()
                    moveTo(18.285f, 15.301f)
                    arcTo(2.95f, 2.95f, 296.0647735311907f, isMoreThanHalf = false, isPositiveArc = false, 17.0f, 15.001f)
                    curveTo(15.346f, 15.001f, 14.0f, 16.346f, 14.0f, 18.000999999999998f)
                    curveTo(14.0f, 18.461999999999996f, 14.113f, 18.894f, 14.301f, 19.284999999999997f)
                    close()
                    moveTo(12.0f, 18.001f)
                    arcTo(5.0f, 5.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = true, 22.0f, 18.001f)
                    arcTo(5.0f, 5.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 12.0f, 18.001f)
                }
            }.build().also {
                _sendForwardFailedFilled = it
            }
    }


private var _sendForwardFailedFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun SendForwardFailedFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.SendForwardFailedFilled.imageVector,
            contentDescription = null,
    )
}
