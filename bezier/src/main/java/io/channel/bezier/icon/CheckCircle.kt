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

val BezierIcons.CheckCircle: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _checkCircle ?: ImageVector.Builder(
                    name = "CheckCircle",
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
                    moveTo(22.0f, 12.0f)
                    curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                    curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                    curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                    curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                    moveTo(20.0f, 12.0f)
                    arcTo(8.0f, 8.0f, 0.0f, isMoreThanHalf = true, isPositiveArc = false, 4.0f, 12.0f)
                    arcTo(8.0f, 8.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 20.0f, 12.0f)
                    moveTo(8.084f, 11.67f)
                    lineTo(10.404f, 13.898f)
                    lineTo(15.852f, 8.777999999999999f)
                    arcTo(1.0f, 1.0f, 227.21657521144041f, isMoreThanHalf = false, isPositiveArc = true, 17.222f, 10.235f)
                    lineTo(11.1f, 15.989f)
                    arcTo(1.03f, 1.03f, 46.8998740059744f, isMoreThanHalf = false, isPositiveArc = true, 9.684f, 15.981000000000002f)
                    lineTo(6.7f, 13.113f)
                    arcTo(1.0f, 1.0f, 135.25172610641144f, isMoreThanHalf = false, isPositiveArc = true, 8.085f, 11.671f)
                }
            }.build().also {
                _checkCircle = it
            }
    }


private var _checkCircle: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CheckCircleIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.CheckCircle.imageVector,
            contentDescription = null,
    )
}
