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

val BezierIcon.Megaphone: ImageVector
    get() {
        return _megaphone ?: ImageVector.Builder(
                name = "Megaphone",
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
                moveTo(19.0002f, 17.1291f)
                lineTo(14.1942f, 14.3781f)
                curveTo(13.7622f, 14.1301f, 13.2712f, 14.0001f, 12.7732f, 14.0001f)
                lineTo(9.0002f, 14.0001f)
                lineTo(9.0002f, 7.9741f)
                lineTo(12.7732f, 7.9741f)
                curveTo(13.2712f, 7.9741f, 13.7622f, 7.8431f, 14.1942f, 7.5961f)
                lineTo(19.0002f, 4.8451f)
                lineTo(19.0002f, 17.1291f)
                close()
                moveTo(5.0002f, 14.0001f)
                lineTo(7.0002f, 14.0001f)
                lineTo(7.0002f, 7.9741f)
                lineTo(5.0002f, 7.9741f)
                lineTo(5.0002f, 14.0001f)
                close()
                moveTo(20.1382f, 2.0181f)
                curveTo(19.9962f, 2.0181f, 19.8502f, 2.0541f, 19.7112f, 2.1331f)
                lineTo(13.2012f, 5.8601f)
                curveTo(13.0702f, 5.9351f, 12.9232f, 5.9741f, 12.7732f, 5.9741f)
                lineTo(4.0002f, 5.9741f)
                curveTo(3.4482f, 5.9741f, 3.0002f, 6.4221f, 3.0002f, 6.9741f)
                lineTo(3.0002f, 15.0001f)
                curveTo(3.0002f, 15.5521f, 3.4482f, 16.0001f, 4.0002f, 16.0001f)
                lineTo(4.6682f, 16.0001f)
                lineTo(3.7602f, 20.3991f)
                curveTo(3.6962f, 20.7091f, 3.9332f, 21.0001f, 4.2502f, 21.0001f)
                lineTo(6.5712f, 21.0001f)
                curveTo(6.9502f, 21.0001f, 7.2782f, 20.7331f, 7.3542f, 20.3621f)
                lineTo(8.2552f, 16.0001f)
                lineTo(12.7732f, 16.0001f)
                curveTo(12.9232f, 16.0001f, 13.0702f, 16.0391f, 13.2012f, 16.1141f)
                lineTo(19.7112f, 19.8411f)
                curveTo(19.8502f, 19.9201f, 19.9962f, 19.9561f, 20.1382f, 19.9561f)
                curveTo(20.5872f, 19.9561f, 21.0002f, 19.5961f, 21.0002f, 19.0941f)
                lineTo(21.0002f, 2.8801f)
                curveTo(21.0002f, 2.3781f, 20.5872f, 2.0181f, 20.1382f, 2.0181f)
                close()
            }
        }.build().also {
            _megaphone = it
        }
    }

private var _megaphone: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun MegaphoneIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Megaphone,
            contentDescription = null,
    )
}
