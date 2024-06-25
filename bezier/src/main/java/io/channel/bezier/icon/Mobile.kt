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

val BezierIcons.Mobile: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _mobile ?: ImageVector.Builder(
                    name = "Mobile",
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
                    moveTo(8.0f, 2.0f)
                    arcTo(2.0f, 2.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 6.0f, 4.0f)
                    lineTo(6.0f, 20.0f)
                    arcTo(2.0f, 2.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 8.0f, 22.0f)
                    lineTo(16.0f, 22.0f)
                    arcTo(2.0f, 2.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 18.0f, 20.0f)
                    lineTo(18.0f, 4.0f)
                    arcTo(2.0f, 2.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 16.0f, 2.0f)
                    close()
                    moveTo(16.0f, 5.0f)
                    lineTo(8.0f, 5.0f)
                    lineTo(8.0f, 19.0f)
                    lineTo(16.0f, 19.0f)
                    close()
                }
            }.build().also {
                _mobile = it
            }
    }


private var _mobile: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun MobileIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Mobile.imageVector,
            contentDescription = null,
    )
}
