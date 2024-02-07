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

val BezierIcon.ChevronSmallRight: ImageVector
    get() {
        return _chevronSmallRight ?: ImageVector.Builder(
                name = "ChevronSmallRight",
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
                moveTo(9.7929f, 6.7929f)
                curveTo(10.1834f, 6.4024f, 10.8166f, 6.4024f, 11.2071f, 6.7929f)
                lineTo(15.7071f, 11.2929f)
                curveTo(16.0976f, 11.6834f, 16.0976f, 12.3166f, 15.7071f, 12.7071f)
                lineTo(11.2071f, 17.2071f)
                curveTo(10.8166f, 17.5976f, 10.1834f, 17.5976f, 9.7929f, 17.2071f)
                curveTo(9.4024f, 16.8166f, 9.4024f, 16.1834f, 9.7929f, 15.7929f)
                lineTo(13.5858f, 12.0f)
                lineTo(9.7929f, 8.2071f)
                curveTo(9.4024f, 7.8166f, 9.4024f, 7.1834f, 9.7929f, 6.7929f)
                close()
            }
        }.build().also {
            _chevronSmallRight = it
        }
    }

private var _chevronSmallRight: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChevronSmallRightIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.ChevronSmallRight,
            contentDescription = null,
    )
}
