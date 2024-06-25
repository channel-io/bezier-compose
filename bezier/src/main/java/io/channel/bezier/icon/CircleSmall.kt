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

val BezierIcons.CircleSmall: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _circleSmall ?: ImageVector.Builder(
                    name = "CircleSmall",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(12.0f, 12.0f)
                    moveTo(5.0f, 12.0f)
                    arcTo(7.0f, 7.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = true, 19.0f, 12.0f)
                    arcTo(7.0f, 7.0f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 5.0f, 12.0f)
                }
            }.build().also {
                _circleSmall = it
            }
    }


private var _circleSmall: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CircleSmallIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.CircleSmall.imageVector,
            contentDescription = null,
    )
}
