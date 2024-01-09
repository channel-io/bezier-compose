@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.compose.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.compose.BezierIcon

val BezierIcon.ArrowHookRightDown: ImageVector
    get() {
        return _arrowHookRightDown ?: ImageVector.Builder(
                name = "ArrowHookRightDown",
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
                moveTo(9.5005f, 3.0265f)
                lineTo(13.0005f, 3.0265f)
                curveTo(13.5527f, 3.0265f, 14.0005f, 3.4742f, 14.0005f, 4.0265f)
                curveTo(14.0005f, 4.5788f, 13.5527f, 5.0265f, 13.0005f, 5.0265f)
                lineTo(9.5005f, 5.0265f)
                curveTo(7.0195f, 5.0265f, 5.0005f, 7.0455f, 5.0005f, 9.5265f)
                curveTo(5.0005f, 12.0075f, 7.0195f, 14.0265f, 9.5005f, 14.0265f)
                lineTo(18.8195f, 14.0265f)
                lineTo(15.5273f, 10.7335f)
                curveTo(15.1369f, 10.343f, 15.137f, 9.71f, 15.5274f, 9.3195f)
                curveTo(15.9179f, 8.929f, 16.551f, 8.929f, 16.9415f, 9.3195f)
                lineTo(21.5615f, 13.9395f)
                curveTo(22.1465f, 14.5245f, 22.1465f, 15.4755f, 21.5615f, 16.0605f)
                lineTo(16.9415f, 20.6805f)
                curveTo(16.551f, 21.071f, 15.9179f, 21.071f, 15.5275f, 20.6805f)
                curveTo(15.137f, 20.29f, 15.137f, 19.657f, 15.5275f, 19.2665f)
                lineTo(18.7675f, 16.0265f)
                lineTo(9.5005f, 16.0265f)
                curveTo(5.9165f, 16.0265f, 3.0005f, 13.1105f, 3.0005f, 9.5265f)
                curveTo(3.0005f, 5.9425f, 5.9165f, 3.0265f, 9.5005f, 3.0265f)
                close()
            }
        }.build().also {
            _arrowHookRightDown = it
        }
    }

private var _arrowHookRightDown: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ArrowHookRightDownIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.ArrowHookRightDown,
            contentDescription = null,
    )
}
