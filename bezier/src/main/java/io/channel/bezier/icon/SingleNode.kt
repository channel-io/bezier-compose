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

val BezierIcons.SingleNode: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _singleNode ?: ImageVector.Builder(
                    name = "SingleNode",
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
                    moveTo(2.0f, 5.0f)
                    arcTo(3.0f, 3.0f, 179.91464053166388f, isMoreThanHalf = false, isPositiveArc = true, 7.83f, 4.0f)
                    lineTo(10.0f, 4.0f)
                    arcTo(3.0f, 3.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 13.0f, 7.0f)
                    lineTo(13.0f, 17.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 14.0f, 18.0f)
                    lineTo(16.17f, 18.0f)
                    arcTo(3.001f, 3.001f, 199.4644706527195f, isMoreThanHalf = true, isPositiveArc = true, 16.17f, 20.0f)
                    lineTo(14.0f, 20.0f)
                    arcTo(3.0f, 3.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 11.0f, 17.0f)
                    lineTo(11.0f, 7.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 10.0f, 6.0f)
                    lineTo(7.83f, 6.0f)
                    arcTo(3.001f, 3.001f, 19.492380040902418f, isMoreThanHalf = false, isPositiveArc = true, 2.0f, 5.0f)
                }
            }.build().also {
                _singleNode = it
            }
    }


private var _singleNode: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun SingleNodeIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.SingleNode.imageVector,
            contentDescription = null,
    )
}
