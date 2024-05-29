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

val BezierIcon.Search: ImageVector
    get() {
        return io.channel.bezier.icon._search ?: ImageVector.Builder(
                name = "Search",
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
                moveTo(18.0002f, 10.0001f)
                curveTo(18.0002f, 5.5818f, 14.4185f, 2.0001f, 10.0002f, 2.0001f)
                curveTo(5.5819f, 2.0001f, 2.0002f, 5.5818f, 2.0002f, 10.0001f)
                curveTo(2.0002f, 14.4184f, 5.5819f, 18.0001f, 10.0002f, 18.0001f)
                curveTo(11.8489f, 18.0001f, 13.5511f, 17.373f, 14.9058f, 16.32f)
                lineTo(20.2931f, 21.7072f)
                curveTo(20.6836f, 22.0977f, 21.3168f, 22.0977f, 21.7073f, 21.7072f)
                curveTo(22.0978f, 21.3167f, 22.0978f, 20.6835f, 21.7073f, 20.293f)
                lineTo(16.32f, 14.9057f)
                curveTo(17.3731f, 13.5511f, 18.0002f, 11.8488f, 18.0002f, 10.0001f)
                close()
                moveTo(16.0002f, 10.0001f)
                curveTo(16.0002f, 13.3138f, 13.3139f, 16.0001f, 10.0002f, 16.0001f)
                curveTo(6.6865f, 16.0001f, 4.0002f, 13.3138f, 4.0002f, 10.0001f)
                curveTo(4.0002f, 6.6864f, 6.6865f, 4.0001f, 10.0002f, 4.0001f)
                curveTo(13.3139f, 4.0001f, 16.0002f, 6.6864f, 16.0002f, 10.0001f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._search = it
        }
    }

private var _search: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun SearchIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Search,
            contentDescription = null,
    )
}