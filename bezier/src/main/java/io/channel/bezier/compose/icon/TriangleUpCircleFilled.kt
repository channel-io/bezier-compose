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

val BezierIcon.TriangleUpCircleFilled: ImageVector
    get() {
        return _triangleUpCircleFilled ?: ImageVector.Builder(
                name = "TriangleUpCircleFilled",
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
                moveTo(11.9518f, 8.1685f)
                curveTo(12.0368f, 8.1685f, 12.1218f, 8.2045f, 12.1818f, 8.2765f)
                lineTo(16.5418f, 13.5075f)
                curveTo(16.7038f, 13.7035f, 16.5658f, 14.0005f, 16.3108f, 14.0005f)
                lineTo(7.5918f, 14.0005f)
                curveTo(7.3378f, 14.0005f, 7.1988f, 13.7035f, 7.3618f, 13.5075f)
                lineTo(11.7218f, 8.2765f)
                curveTo(11.7808f, 8.2045f, 11.8668f, 8.1685f, 11.9518f, 8.1685f)
                close()
                moveTo(11.9998f, 2.0005f)
                curveTo(6.4768f, 2.0005f, 1.9998f, 6.4775f, 1.9998f, 12.0005f)
                curveTo(1.9998f, 17.5225f, 6.4768f, 22.0005f, 11.9998f, 22.0005f)
                curveTo(17.5228f, 22.0005f, 21.9998f, 17.5225f, 21.9998f, 12.0005f)
                curveTo(21.9998f, 6.4775f, 17.5228f, 2.0005f, 11.9998f, 2.0005f)
                close()
            }
        }.build().also {
            _triangleUpCircleFilled = it
        }
    }

private var _triangleUpCircleFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TriangleUpCircleFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.TriangleUpCircleFilled,
            contentDescription = null,
    )
}
