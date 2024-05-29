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

val BezierIcon.NotificationOff: ImageVector
    get() {
        return io.channel.bezier.icon._notificationOff ?: ImageVector.Builder(
                name = "NotificationOff",
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
                moveTo(17.385f, 13.605f)
                lineTo(18.879f, 16.003f)
                lineTo(17.801f, 16.003f)
                lineTo(8.028f, 6.23f)
                curveTo(8.723f, 4.913f, 10.09f, 4.003f, 11.68f, 4.003f)
                curveTo(13.965f, 4.003f, 15.825f, 5.862f, 15.825f, 8.148f)
                curveTo(15.825f, 10.078f, 16.364f, 11.965f, 17.385f, 13.605f)
                close()
                moveTo(4.2549f, 2.4571f)
                curveTo(3.8645f, 2.0666f, 3.2314f, 2.0666f, 2.8409f, 2.4571f)
                curveTo(2.4505f, 2.8475f, 2.4505f, 3.4806f, 2.8409f, 3.871f)
                lineTo(19.8116f, 20.8417f)
                curveTo(20.2022f, 21.2323f, 20.8356f, 21.2321f, 21.2261f, 20.8414f)
                curveTo(21.6165f, 20.4508f, 21.6163f, 19.8176f, 21.2258f, 19.4272f)
                lineTo(19.8009f, 18.0031f)
                lineTo(20.4999f, 18.0031f)
                curveTo(20.8999f, 18.0031f, 21.2679f, 17.7861f, 21.4619f, 17.4361f)
                curveTo(21.6549f, 17.0871f, 21.6449f, 16.6601f, 21.4329f, 16.3211f)
                lineTo(19.0829f, 12.5471f)
                curveTo(18.2599f, 11.2261f, 17.8249f, 9.7041f, 17.8249f, 8.1481f)
                curveTo(17.8249f, 4.759f, 15.0679f, 2.0031f, 11.6799f, 2.0031f)
                curveTo(9.5419f, 2.0031f, 7.6649f, 3.1061f, 6.5659f, 4.7681f)
                lineTo(4.2549f, 2.4571f)
                close()
                moveTo(13.6797f, 18.003f)
                curveTo(13.6797f, 19.106f, 12.7827f, 20.003f, 11.6797f, 20.003f)
                curveTo(10.5767f, 20.003f, 9.6797f, 19.106f, 9.6797f, 18.003f)
                lineTo(13.6797f, 18.003f)
                close()
                moveTo(4.2768f, 12.5471f)
                lineTo(1.9267f, 16.3211f)
                curveTo(1.7157f, 16.6591f, 1.7038f, 17.0861f, 1.8978f, 17.4361f)
                curveTo(2.0917f, 17.7861f, 2.4597f, 18.0031f, 2.8598f, 18.0031f)
                lineTo(7.6797f, 18.0031f)
                curveTo(7.6797f, 20.2091f, 9.4738f, 22.0031f, 11.6798f, 22.0031f)
                curveTo(13.8478f, 22.0031f, 15.6088f, 20.2671f, 15.6688f, 18.1131f)
                lineTo(13.5588f, 16.0031f)
                lineTo(4.4808f, 16.0031f)
                lineTo(5.9738f, 13.6051f)
                curveTo(6.6958f, 12.4471f, 7.1627f, 11.1621f, 7.3837f, 9.828f)
                lineTo(5.5437f, 7.9871f)
                curveTo(5.5429f, 8.0095f, 5.5412f, 8.0316f, 5.5395f, 8.0538f)
                curveTo(5.5371f, 8.0849f, 5.5347f, 8.1159f, 5.5347f, 8.1481f)
                curveTo(5.5347f, 9.7051f, 5.0998f, 11.2261f, 4.2768f, 12.5471f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._notificationOff = it
        }
    }

private var _notificationOff: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun NotificationOffIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.NotificationOff,
            contentDescription = null,
    )
}