@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.compose.icon

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
import io.channel.bezier.compose.BezierIcon

val BezierIcon.ChevronRight: ImageVector
    get() {
        return _chevronRight ?: ImageVector.Builder(
                name = "ChevronRight",
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
                moveTo(8.7929f, 4.2929f)
                curveTo(9.1834f, 3.9024f, 9.8166f, 3.9024f, 10.2071f, 4.2929f)
                lineTo(17.2071f, 11.2929f)
                curveTo(17.5976f, 11.6834f, 17.5976f, 12.3166f, 17.2071f, 12.7071f)
                lineTo(10.2071f, 19.7071f)
                curveTo(9.8166f, 20.0976f, 9.1834f, 20.0976f, 8.7929f, 19.7071f)
                curveTo(8.4024f, 19.3166f, 8.4024f, 18.6834f, 8.7929f, 18.2929f)
                lineTo(15.0858f, 12.0f)
                lineTo(8.7929f, 5.7071f)
                curveTo(8.4024f, 5.3166f, 8.4024f, 4.6834f, 8.7929f, 4.2929f)
                close()
            }
        }.build().also {
            _chevronRight = it
        }
    }

private var _chevronRight: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChevronRightIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.ChevronRight,
            contentDescription = null,
    )
}
