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

val BezierIcon.Inbox: ImageVector
    get() {
        return _inbox ?: ImageVector.Builder(
                name = "Inbox",
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
                moveTo(6.0f, 4.0f)
                curveTo(3.7909f, 4.0f, 2.0f, 5.7909f, 2.0f, 8.0f)
                lineTo(2.0f, 16.0f)
                curveTo(2.0f, 18.2091f, 3.7909f, 20.0f, 6.0f, 20.0f)
                lineTo(18.0f, 20.0f)
                curveTo(20.2091f, 20.0f, 22.0f, 18.2091f, 22.0f, 16.0f)
                lineTo(22.0f, 8.0f)
                curveTo(22.0f, 5.7909f, 20.2091f, 4.0f, 18.0f, 4.0f)
                lineTo(6.0f, 4.0f)
                close()
                moveTo(20.0f, 8.0f)
                curveTo(20.0f, 6.8954f, 19.1046f, 6.0f, 18.0f, 6.0f)
                lineTo(6.0f, 6.0f)
                curveTo(4.8954f, 6.0f, 4.0f, 6.8954f, 4.0f, 8.0f)
                lineTo(4.0f, 11.0f)
                curveTo(4.0f, 11.5523f, 4.4477f, 12.0f, 5.0f, 12.0f)
                lineTo(8.0f, 12.0f)
                curveTo(8.5523f, 12.0f, 8.9837f, 12.46f, 9.1643f, 12.9819f)
                curveTo(9.571f, 14.1566f, 10.6869f, 15.0f, 12.0f, 15.0f)
                curveTo(13.3131f, 15.0f, 14.429f, 14.1566f, 14.8357f, 12.9819f)
                curveTo(15.0163f, 12.46f, 15.4477f, 12.0f, 16.0f, 12.0f)
                lineTo(19.0f, 12.0f)
                curveTo(19.5523f, 12.0f, 20.0f, 11.5523f, 20.0f, 11.0f)
                lineTo(20.0f, 8.0f)
                close()
            }
        }.build().also {
            _inbox = it
        }
    }

private var _inbox: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun InboxIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Inbox,
            contentDescription = null,
    )
}
