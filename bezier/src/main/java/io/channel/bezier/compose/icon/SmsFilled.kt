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

val BezierIcon.SmsFilled: ImageVector
    get() {
        return _smsFilled ?: ImageVector.Builder(
                name = "SmsFilled",
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
                moveTo(21.5f, 12.0f)
                curveTo(21.5f, 16.4183f, 17.2467f, 20.0f, 12.0f, 20.0f)
                curveTo(11.3111f, 20.0f, 10.6393f, 19.9383f, 9.9921f, 19.821f)
                curveTo(8.5759f, 21.032f, 6.939f, 21.612f, 5.8791f, 21.8801f)
                curveTo(5.457f, 21.9869f, 5.1612f, 21.5173f, 5.3821f, 21.1421f)
                curveTo(5.7698f, 20.4835f, 6.2467f, 19.5469f, 6.5246f, 18.5384f)
                curveTo(4.0899f, 17.0899f, 2.5f, 14.7013f, 2.5f, 12.0f)
                curveTo(2.5f, 7.5817f, 6.7533f, 4.0f, 12.0f, 4.0f)
                curveTo(17.2467f, 4.0f, 21.5f, 7.5817f, 21.5f, 12.0f)
                close()
                moveTo(6.0f, 11.9994f)
                curveTo(6.0f, 12.8252f, 6.6759f, 13.5f, 7.5006f, 13.5f)
                curveTo(8.3263f, 13.5f, 9.0011f, 12.8252f, 9.0011f, 11.9994f)
                curveTo(9.0011f, 11.1748f, 8.3263f, 10.5f, 7.5006f, 10.5f)
                curveTo(6.6759f, 10.5f, 6.0f, 11.1748f, 6.0f, 11.9994f)
                close()
                moveTo(10.5f, 11.9994f)
                curveTo(10.5f, 12.8252f, 11.1759f, 13.5f, 12.0006f, 13.5f)
                curveTo(12.8263f, 13.5f, 13.5011f, 12.8252f, 13.5011f, 11.9994f)
                curveTo(13.5011f, 11.1748f, 12.8263f, 10.5f, 12.0006f, 10.5f)
                curveTo(11.1759f, 10.5f, 10.5f, 11.1748f, 10.5f, 11.9994f)
                close()
                moveTo(16.5006f, 13.5f)
                curveTo(15.6759f, 13.5f, 15.0f, 12.8252f, 15.0f, 11.9994f)
                curveTo(15.0f, 11.1748f, 15.6759f, 10.5f, 16.5006f, 10.5f)
                curveTo(17.3263f, 10.5f, 18.0011f, 11.1748f, 18.0011f, 11.9994f)
                curveTo(18.0011f, 12.8252f, 17.3263f, 13.5f, 16.5006f, 13.5f)
                close()
            }
        }.build().also {
            _smsFilled = it
        }
    }

private var _smsFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun SmsFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.SmsFilled,
            contentDescription = null,
    )
}
