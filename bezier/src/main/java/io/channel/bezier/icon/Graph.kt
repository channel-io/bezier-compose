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

val BezierIcon.Graph: ImageVector
    get() {
        return io.channel.bezier.icon._graph ?: ImageVector.Builder(
                name = "Graph",
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
                moveTo(8.25f, 4.0f)
                curveTo(8.25f, 2.8954f, 9.1454f, 2.0f, 10.25f, 2.0f)
                lineTo(13.75f, 2.0f)
                curveTo(14.8546f, 2.0f, 15.75f, 2.8954f, 15.75f, 4.0f)
                lineTo(15.75f, 7.0f)
                lineTo(19.25f, 7.0f)
                curveTo(20.3546f, 7.0f, 21.25f, 7.8954f, 21.25f, 9.0f)
                lineTo(21.25f, 19.0f)
                curveTo(21.25f, 20.1046f, 20.3546f, 21.0f, 19.25f, 21.0f)
                lineTo(15.0f, 21.0f)
                lineTo(14.25f, 21.0f)
                lineTo(9.75f, 21.0f)
                lineTo(9.0f, 21.0f)
                lineTo(4.75f, 21.0f)
                curveTo(3.6454f, 21.0f, 2.75f, 20.1046f, 2.75f, 19.0f)
                lineTo(2.75f, 14.0f)
                curveTo(2.75f, 12.8954f, 3.6454f, 12.0f, 4.75f, 12.0f)
                lineTo(8.25f, 12.0f)
                lineTo(8.25f, 4.0f)
                close()
                moveTo(10.25f, 4.0f)
                lineTo(10.25f, 19.0f)
                lineTo(13.75f, 19.0f)
                lineTo(13.75f, 4.0f)
                lineTo(10.25f, 4.0f)
                close()
                moveTo(4.75f, 14.0f)
                lineTo(4.75f, 19.0f)
                lineTo(8.25f, 19.0f)
                lineTo(8.25f, 14.0f)
                lineTo(4.75f, 14.0f)
                close()
                moveTo(19.25f, 19.0f)
                lineTo(15.75f, 19.0f)
                lineTo(15.75f, 9.0f)
                lineTo(19.25f, 9.0f)
                lineTo(19.25f, 19.0f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._graph = it
        }
    }

private var _graph: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun GraphIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Graph,
            contentDescription = null,
    )
}