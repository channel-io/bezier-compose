@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.compose.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.compose.BezierIcon

val BezierIcon.ChatLightningFilled: ImageVector
    get() {
        return _chatLightningFilled ?: ImageVector.Builder(
                name = "ChatLightningFilled",
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
                moveTo(20.7233f, 18.19f)
                curveTo(20.5573f, 17.694f, 20.5763f, 17.144f, 20.8223f, 16.683f)
                curveTo(21.8613f, 14.734f, 22.2813f, 12.409f, 21.7873f, 9.954f)
                curveTo(20.9823f, 5.954f, 17.6933f, 2.789f, 13.6643f, 2.137f)
                curveTo(6.8373f, 1.033f, 1.0233f, 6.848f, 2.1293f, 13.675f)
                curveTo(2.7823f, 17.703f, 5.9463f, 20.991f, 9.9473f, 21.796f)
                curveTo(12.4033f, 22.29f, 14.7293f, 21.868f, 16.6783f, 20.829f)
                curveTo(17.1373f, 20.584f, 17.6813f, 20.565f, 18.1743f, 20.729f)
                curveTo(18.7113f, 20.908f, 19.4293f, 21.147f, 20.0973f, 21.37f)
                curveTo(20.8793f, 21.63f, 21.6223f, 20.886f, 21.3613f, 20.105f)
                lineTo(20.7233f, 18.19f)
                close()
                moveTo(15.9691f, 11.135f)
                lineTo(13.4271f, 10.547f)
                lineTo(14.6531f, 6.379f)
                curveTo(14.7391f, 6.086f, 14.3771f, 5.872f, 14.1621f, 6.088f)
                lineTo(8.0861f, 12.181f)
                curveTo(7.9231f, 12.345f, 8.0031f, 12.623f, 8.2281f, 12.676f)
                lineTo(10.7701f, 13.264f)
                lineTo(9.5451f, 17.432f)
                curveTo(9.4591f, 17.725f, 9.8201f, 17.939f, 10.0351f, 17.723f)
                lineTo(16.1111f, 11.63f)
                curveTo(16.2741f, 11.466f, 16.1941f, 11.188f, 15.9691f, 11.135f)
                close()
            }
        }.build().also {
            _chatLightningFilled = it
        }
    }

private var _chatLightningFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChatLightningFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.ChatLightningFilled,
            contentDescription = null,
    )
}
