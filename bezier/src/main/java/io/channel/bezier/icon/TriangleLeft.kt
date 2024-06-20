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

val BezierIcons.TriangleLeft: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _triangleLeft ?: ImageVector.Builder(
                    name = "TriangleLeft",
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
                    moveTo(7.63f, 11.923f)
                    lineTo(14.365f, 17.535f)
                    curveTo(14.618f, 17.745f, 15.0f, 17.566f, 15.0f, 17.239f)
                    lineTo(15.0f, 6.013f)
                    arcTo(0.388f, 0.388f, 359.81948745583014f, isMoreThanHalf = false, isPositiveArc = false, 14.365f, 5.715f)
                    lineTo(7.63f, 11.33f)
                    arcTo(0.386f, 0.386f, 230.30273555775844f, isMoreThanHalf = false, isPositiveArc = false, 7.63f, 11.924f)
                }
            }.build().also {
                _triangleLeft = it
            }
    }


private var _triangleLeft: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TriangleLeftIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.TriangleLeft.imageVector,
            contentDescription = null,
    )
}
