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

val BezierIcon.Store: ImageVector
    get() {
        return _store ?: ImageVector.Builder(
                name = "Store",
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
                moveTo(20.5002f, 3.0001f)
                lineTo(3.5002f, 3.0001f)
                curveTo(2.6719f, 3.0001f, 2.0002f, 3.6718f, 2.0002f, 4.5001f)
                lineTo(2.0002f, 9.4269f)
                lineTo(2.5133f, 9.9181f)
                curveTo(2.6692f, 10.0601f, 2.8319f, 10.1908f, 3.0002f, 10.3102f)
                lineTo(3.0002f, 19.5001f)
                lineTo(3.0071f, 19.6446f)
                curveTo(3.0798f, 20.4051f, 3.7206f, 21.0001f, 4.5002f, 21.0001f)
                lineTo(19.5002f, 21.0001f)
                lineTo(19.6447f, 20.9933f)
                curveTo(20.4052f, 20.9206f, 21.0002f, 20.2797f, 21.0002f, 19.5001f)
                lineTo(21.0002f, 10.3093f)
                curveTo(21.1685f, 10.1899f, 21.3313f, 10.0592f, 21.4875f, 9.9173f)
                lineTo(22.0002f, 9.4224f)
                lineTo(22.0002f, 4.5001f)
                curveTo(22.0002f, 3.6718f, 21.3285f, 3.0001f, 20.5002f, 3.0001f)
                close()
                moveTo(19.0002f, 11.1677f)
                curveTo(17.668f, 11.4295f, 16.2544f, 11.1671f, 15.0923f, 10.3815f)
                lineTo(14.989f, 10.308f)
                lineTo(14.9045f, 10.3687f)
                curveTo(13.1511f, 11.5567f, 10.8321f, 11.5558f, 9.071f, 10.3603f)
                lineTo(8.993f, 10.305f)
                lineTo(8.9093f, 10.3653f)
                curveTo(7.744f, 11.1555f, 6.3297f, 11.4209f, 5.0002f, 11.1639f)
                lineTo(5.0f, 19.0f)
                lineTo(8.0f, 19.0f)
                lineTo(8.0f, 13.0f)
                lineTo(16.0f, 13.0f)
                lineTo(16.0f, 19.0f)
                lineTo(19.0f, 19.0f)
                lineTo(19.0002f, 11.1677f)
                close()
                moveTo(14.0f, 19.0f)
                lineTo(14.0f, 15.0f)
                lineTo(10.0f, 15.0f)
                lineTo(10.0f, 19.0f)
                lineTo(14.0f, 19.0f)
                close()
                moveTo(20.0f, 5.0f)
                lineTo(20.0f, 8.556f)
                lineTo(19.9741f, 8.5781f)
                curveTo(18.8042f, 9.4969f, 17.1555f, 9.4909f, 16.0f, 8.566f)
                lineTo(16.0f, 7.0f)
                lineTo(14.0f, 7.0f)
                lineTo(14.0f, 8.5516f)
                curveTo(12.8368f, 9.4915f, 11.1685f, 9.4959f, 10.0f, 8.5648f)
                lineTo(10.0f, 7.0f)
                lineTo(8.0f, 7.0f)
                lineTo(8.0f, 8.5498f)
                curveTo(6.8852f, 9.4411f, 5.3315f, 9.4861f, 4.1822f, 8.6927f)
                lineTo(4.0f, 8.556f)
                lineTo(4.0f, 5.0f)
                lineTo(20.0f, 5.0f)
                close()
            }
        }.build().also {
            _store = it
        }
    }

private var _store: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun StoreIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Store,
            contentDescription = null,
    )
}
