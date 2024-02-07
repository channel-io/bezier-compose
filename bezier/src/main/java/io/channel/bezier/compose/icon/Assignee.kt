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

val BezierIcon.Assignee: ImageVector
    get() {
        return _assignee ?: ImageVector.Builder(
                name = "Assignee",
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
                moveTo(21.7155f, 2.0001f)
                lineTo(14.2845f, 2.0001f)
                curveTo(14.1275f, 2.0001f, 14.0005f, 2.1271f, 14.0005f, 2.2841f)
                lineTo(14.0005f, 13.0311f)
                curveTo(14.0005f, 13.2751f, 14.2865f, 13.4061f, 14.4705f, 13.2461f)
                lineTo(18.0005f, 10.1821f)
                lineTo(21.5295f, 13.2461f)
                curveTo(21.7135f, 13.4061f, 22.0005f, 13.2751f, 22.0005f, 13.0311f)
                lineTo(22.0005f, 2.2841f)
                curveTo(22.0005f, 2.1271f, 21.8725f, 2.0001f, 21.7155f, 2.0001f)
                close()
                moveTo(8.5002f, 12.6729f)
                curveTo(10.0742f, 12.6729f, 11.3492f, 11.3969f, 11.3492f, 9.8229f)
                curveTo(11.3492f, 8.2499f, 10.0742f, 6.9739f, 8.5002f, 6.9739f)
                curveTo(6.9262f, 6.9739f, 5.6502f, 8.2499f, 5.6502f, 9.8229f)
                curveTo(5.6502f, 11.3969f, 6.9262f, 12.6729f, 8.5002f, 12.6729f)
                close()
                moveTo(2.0002f, 19.5729f)
                curveTo(2.2202f, 16.1749f, 5.0462f, 13.4869f, 8.5002f, 13.4869f)
                curveTo(11.9542f, 13.4869f, 14.7792f, 16.1749f, 14.9992f, 19.5729f)
                curveTo(15.0142f, 19.8049f, 14.8192f, 19.9999f, 14.5872f, 19.9999f)
                lineTo(2.4132f, 19.9999f)
                curveTo(2.1812f, 19.9999f, 1.9862f, 19.8049f, 2.0002f, 19.5729f)
                close()
            }
        }.build().also {
            _assignee = it
        }
    }

private var _assignee: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun AssigneeIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Assignee,
            contentDescription = null,
    )
}
