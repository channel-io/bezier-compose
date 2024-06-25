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

val BezierIcons.CheckBold: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _checkBold ?: ImageVector.Builder(
                    name = "CheckBold",
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
                    moveTo(10.0f, 14.063f)
                    lineTo(17.070999999999998f, 6.993f)
                    arcTo(1.5f, 1.5f, 223.39306813950847f, isMoreThanHalf = true, isPositiveArc = true, 19.191999999999997f, 9.113f)
                    lineTo(10.462999999999997f, 17.843f)
                    arcTo(0.655f, 0.655f, 45.01916425610011f, isMoreThanHalf = false, isPositiveArc = true, 9.536999999999997f, 17.843f)
                    lineTo(4.806999999999997f, 13.113f)
                    arcTo(1.5f, 1.5f, 134.0316354095093f, isMoreThanHalf = true, isPositiveArc = true, 6.928999999999997f, 10.992999999999999f)
                    close()
                }
            }.build().also {
                _checkBold = it
            }
    }


private var _checkBold: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CheckBoldIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.CheckBold.imageVector,
            contentDescription = null,
    )
}
