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

val BezierIcons.Lock: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _lock ?: ImageVector.Builder(
                    name = "Lock",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(11.998f, 18.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 10.998f, 17.0f)
                    lineTo(10.998f, 14.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = true, 12.998f, 14.0f)
                    lineTo(12.998f, 17.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 11.998f, 18.0f)
                }

                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(5.5f, 9.0f)
                    lineTo(6.0f, 9.0f)
                    lineTo(6.0f, 7.0f)
                    arcTo(6.0f, 6.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = true, 18.0f, 7.0f)
                    lineTo(18.0f, 9.0f)
                    lineTo(18.5f, 9.0f)
                    arcTo(1.5f, 1.5f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 20.0f, 10.5f)
                    lineTo(20.0f, 20.5f)
                    arcTo(1.5f, 1.5f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 18.5f, 22.0f)
                    lineTo(5.5f, 22.0f)
                    arcTo(1.5f, 1.5f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 4.0f, 20.5f)
                    lineTo(4.0f, 10.5f)
                    arcTo(1.5f, 1.5f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 5.5f, 9.0f)
                    moveTo(16.0f, 7.0f)
                    lineTo(16.0f, 9.0f)
                    lineTo(8.0f, 9.0f)
                    lineTo(8.0f, 7.0f)
                    arcTo(4.0f, 4.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = true, 16.0f, 7.0f)
                    moveTo(18.0f, 11.0f)
                    lineTo(18.0f, 20.0f)
                    lineTo(6.0f, 20.0f)
                    lineTo(6.0f, 11.0f)
                    close()
                }
            }.build().also {
                _lock = it
            }
    }


private var _lock: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun LockIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Lock.imageVector,
            contentDescription = null,
    )
}
