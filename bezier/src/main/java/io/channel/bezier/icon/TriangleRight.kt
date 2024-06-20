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

val BezierIcons.TriangleRight: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _triangleRight ?: ImageVector.Builder(
                    name = "TriangleRight",
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
                    moveTo(16.37f, 11.923f)
                    lineTo(9.635000000000002f, 17.535f)
                    arcTo(0.387f, 0.387f, 50.145407038469266f, isMoreThanHalf = false, isPositiveArc = true, 9.0f, 17.24f)
                    lineTo(9.0f, 6.013f)
                    curveTo(9.0f, 5.686f, 9.382f, 5.507f, 9.635f, 5.715f)
                    lineTo(16.37f, 11.329f)
                    arcTo(0.386f, 0.386f, 309.6972644422416f, isMoreThanHalf = false, isPositiveArc = true, 16.37f, 11.923f)
                }
            }.build().also {
                _triangleRight = it
            }
    }


private var _triangleRight: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TriangleRightIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.TriangleRight.imageVector,
            contentDescription = null,
    )
}
