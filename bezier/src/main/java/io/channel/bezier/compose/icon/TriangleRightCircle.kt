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

val BezierIcon.TriangleRightCircle: ImageVector
    get() {
        return _triangleRightCircle ?: ImageVector.Builder(
                name = "TriangleRightCircle",
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
                moveTo(9.9515f, 7.651f)
                curveTo(9.9515f, 7.397f, 10.2485f, 7.258f, 10.4435f, 7.421f)
                lineTo(15.6745f, 11.78f)
                curveTo(15.8185f, 11.9f, 15.8185f, 12.122f, 15.6745f, 12.241f)
                lineTo(10.4435f, 16.601f)
                curveTo(10.2485f, 16.764f, 9.9515f, 16.625f, 9.9515f, 16.371f)
                lineTo(9.9515f, 7.651f)
                close()
            }
        }.build().also {
            _triangleRightCircle = it
        }
    }

private var _triangleRightCircle: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TriangleRightCircleIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.TriangleRightCircle,
            contentDescription = null,
    )
}
