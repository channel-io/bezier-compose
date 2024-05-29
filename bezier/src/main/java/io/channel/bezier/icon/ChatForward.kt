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

val BezierIcon.ChatForward: ImageVector
    get() {
        return _chatForward ?: ImageVector.Builder(
                name = "ChatForward",
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
                moveTo(13.6643f, 2.1352f)
                curveTo(13.7768f, 2.1534f, 13.8887f, 2.1735f, 14.0f, 2.1955f)
                lineTo(14.0f, 4.2444f)
                curveTo(13.7847f, 4.1903f, 13.566f, 4.1451f, 13.3443f, 4.1092f)
                curveTo(12.8933f, 4.0362f, 12.4433f, 4.0002f, 11.9983f, 4.0002f)
                curveTo(9.8773f, 4.0002f, 7.8713f, 4.8182f, 6.3493f, 6.3382f)
                curveTo(4.5083f, 8.1752f, 3.6903f, 10.7232f, 4.1063f, 13.3272f)
                curveTo(4.6483f, 16.7132f, 7.4093f, 19.4222f, 10.8223f, 19.9152f)
                curveTo(12.5333f, 20.1622f, 14.2383f, 19.8662f, 15.7483f, 19.0612f)
                curveTo(16.3903f, 18.7172f, 17.1053f, 18.6482f, 17.7633f, 18.8672f)
                lineTo(19.4193f, 19.4192f)
                lineTo(18.8673f, 17.7642f)
                curveTo(18.6493f, 17.1082f, 18.7173f, 16.3922f, 19.0603f, 15.7482f)
                curveTo(19.6844f, 14.5799f, 20.0009f, 13.3069f, 20.0005f, 12.0f)
                lineTo(22.0f, 12.0f)
                lineTo(22.0f, 11.8069f)
                curveTo(22.0341f, 13.5076f, 21.6379f, 15.1684f, 20.8253f, 16.6892f)
                curveTo(20.7773f, 16.7782f, 20.7063f, 16.9562f, 20.7653f, 17.1322f)
                lineTo(21.6333f, 19.7352f)
                curveTo(21.8133f, 20.2782f, 21.6753f, 20.8662f, 21.2703f, 21.2702f)
                curveTo(20.8663f, 21.6752f, 20.2773f, 21.8112f, 19.7353f, 21.6332f)
                lineTo(17.1303f, 20.7652f)
                curveTo(16.9563f, 20.7062f, 16.7793f, 20.7762f, 16.6903f, 20.8242f)
                curveTo(15.2343f, 21.6022f, 13.6363f, 22.0002f, 12.0003f, 22.0002f)
                curveTo(11.5143f, 22.0002f, 11.0253f, 21.9652f, 10.5363f, 21.8942f)
                curveTo(6.2663f, 21.2782f, 2.8103f, 17.8842f, 2.1323f, 13.6432f)
                curveTo(1.6134f, 10.3972f, 2.6353f, 7.2192f, 4.9363f, 4.9222f)
                curveTo(7.2373f, 2.6252f, 10.4153f, 1.6112f, 13.6643f, 2.1352f)
                close()
                moveTo(19.0f, 8.7751f)
                lineTo(19.0f, 7.0f)
                lineTo(17.9f, 7.0f)
                curveTo(16.2984f, 7.0f, 15.0f, 8.2984f, 15.0f, 9.9f)
                lineTo(15.0f, 10.0f)
                curveTo(15.0f, 10.5523f, 14.5523f, 11.0f, 14.0f, 11.0f)
                curveTo(13.4477f, 11.0f, 13.0f, 10.5523f, 13.0f, 10.0f)
                lineTo(13.0f, 9.9f)
                curveTo(13.0f, 7.1938f, 15.1938f, 5.0f, 17.9f, 5.0f)
                lineTo(19.0f, 5.0f)
                lineTo(19.0f, 3.2249f)
                curveTo(19.0f, 2.5804f, 19.7516f, 2.2576f, 20.1912f, 2.7134f)
                lineTo(22.7445f, 5.3605f)
                curveTo(23.0852f, 5.7137f, 23.0852f, 6.2863f, 22.7445f, 6.6395f)
                lineTo(20.1912f, 9.2866f)
                curveTo(19.7516f, 9.7424f, 19.0f, 9.4196f, 19.0f, 8.7751f)
                close()
            }
        }.build().also {
            _chatForward = it
        }
    }

private var _chatForward: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChatForwardIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.ChatForward,
            contentDescription = null,
    )
}