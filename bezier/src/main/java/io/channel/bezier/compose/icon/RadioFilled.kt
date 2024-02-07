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

val BezierIcon.RadioFilled: ImageVector
    get() {
        return _radioFilled ?: ImageVector.Builder(
                name = "RadioFilled",
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
                moveTo(4.0002f, 12.0001f)
                curveTo(4.0002f, 16.4111f, 7.5892f, 20.0001f, 12.0002f, 20.0001f)
                curveTo(16.4112f, 20.0001f, 20.0002f, 16.4111f, 20.0002f, 12.0001f)
                curveTo(20.0002f, 7.5891f, 16.4112f, 4.0001f, 12.0002f, 4.0001f)
                curveTo(7.5892f, 4.0001f, 4.0002f, 7.5891f, 4.0002f, 12.0001f)
                close()
                moveTo(2.0002f, 12.0001f)
                curveTo(2.0002f, 6.4771f, 6.4772f, 2.0001f, 12.0002f, 2.0001f)
                curveTo(17.5232f, 2.0001f, 22.0002f, 6.4771f, 22.0002f, 12.0001f)
                curveTo(22.0002f, 17.5231f, 17.5232f, 22.0001f, 12.0002f, 22.0001f)
                curveTo(6.4772f, 22.0001f, 2.0002f, 17.5231f, 2.0002f, 12.0001f)
                close()
                moveTo(12.0f, 17.0f)
                curveTo(14.7614f, 17.0f, 17.0f, 14.7614f, 17.0f, 12.0f)
                curveTo(17.0f, 9.2386f, 14.7614f, 7.0f, 12.0f, 7.0f)
                curveTo(9.2386f, 7.0f, 7.0f, 9.2386f, 7.0f, 12.0f)
                curveTo(7.0f, 14.7614f, 9.2386f, 17.0f, 12.0f, 17.0f)
                close()
            }
        }.build().also {
            _radioFilled = it
        }
    }

private var _radioFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun RadioFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.RadioFilled,
            contentDescription = null,
    )
}
