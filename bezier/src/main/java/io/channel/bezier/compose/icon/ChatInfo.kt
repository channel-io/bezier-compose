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

val BezierIcon.ChatInfo: ImageVector
    get() {
        return _chatInfo ?: ImageVector.Builder(
                name = "ChatInfo",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(12.0002f, 6.0001f)
                curveTo(12.8292f, 6.0001f, 13.5002f, 6.6711f, 13.5002f, 7.5001f)
                curveTo(13.5002f, 8.3281f, 12.8292f, 9.0001f, 12.0002f, 9.0001f)
                curveTo(11.1712f, 9.0001f, 10.5002f, 8.3281f, 10.5002f, 7.5001f)
                curveTo(10.5002f, 6.6711f, 11.1712f, 6.0001f, 12.0002f, 6.0001f)
                close()
                moveTo(13.0f, 18.0f)
                lineTo(11.0f, 18.0f)
                lineTo(11.0f, 10.0f)
                lineTo(13.0f, 10.0f)
                lineTo(13.0f, 18.0f)
                close()
            }

            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(20.7653f, 17.1322f)
                curveTo(20.7073f, 16.9552f, 20.7783f, 16.7792f, 20.8253f, 16.6892f)
                curveTo(21.9303f, 14.6222f, 22.2653f, 12.2952f, 21.7953f, 9.9602f)
                curveTo(20.9853f, 5.9352f, 17.7183f, 2.7912f, 13.6643f, 2.1352f)
                curveTo(10.4213f, 1.6112f, 7.2383f, 2.6252f, 4.9363f, 4.9222f)
                curveTo(2.6363f, 7.2182f, 1.6133f, 10.3972f, 2.1323f, 13.6432f)
                curveTo(2.8103f, 17.8842f, 6.2663f, 21.2782f, 10.5363f, 21.8942f)
                curveTo(11.0263f, 21.9652f, 11.5153f, 22.0002f, 12.0003f, 22.0002f)
                curveTo(13.6363f, 22.0002f, 15.2353f, 21.6022f, 16.6913f, 20.8242f)
                curveTo(16.7803f, 20.7772f, 16.9573f, 20.7072f, 17.1313f, 20.7652f)
                lineTo(19.7363f, 21.6332f)
                curveTo(20.2763f, 21.8112f, 20.8663f, 21.6752f, 21.2713f, 21.2702f)
                curveTo(21.6753f, 20.8662f, 21.8143f, 20.2782f, 21.6333f, 19.7352f)
                lineTo(20.7653f, 17.1322f)
                close()
                moveTo(19.0613f, 15.7472f)
                curveTo(18.7183f, 16.3912f, 18.6493f, 17.1072f, 18.8683f, 17.7642f)
                lineTo(19.4193f, 19.4192f)
                lineTo(17.7643f, 18.8672f)
                curveTo(17.1063f, 18.6482f, 16.3923f, 18.7172f, 15.7483f, 19.0602f)
                curveTo(14.2393f, 19.8662f, 12.5333f, 20.1622f, 10.8223f, 19.9152f)
                curveTo(7.4103f, 19.4222f, 4.6483f, 16.7132f, 4.1073f, 13.3272f)
                curveTo(3.6913f, 10.7232f, 4.5083f, 8.1752f, 6.3503f, 6.3382f)
                curveTo(7.8723f, 4.8182f, 9.8773f, 4.0002f, 11.9993f, 4.0002f)
                curveTo(12.4433f, 4.0002f, 12.8943f, 4.0362f, 13.3453f, 4.1092f)
                curveTo(16.5803f, 4.6332f, 19.1883f, 7.1432f, 19.8343f, 10.3542f)
                curveTo(20.2123f, 12.2292f, 19.9443f, 14.0942f, 19.0613f, 15.7472f)
                close()
            }
        }.build().also {
            _chatInfo = it
        }
    }

private var _chatInfo: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChatInfoIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.ChatInfo,
            contentDescription = null,
    )
}
