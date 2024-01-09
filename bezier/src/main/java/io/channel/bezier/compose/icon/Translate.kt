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

val BezierIcon.Translate: ImageVector
    get() {
        return _translate ?: ImageVector.Builder(
                name = "Translate",
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
                moveTo(10.0002f, 19.0001f)
                lineTo(19.0002f, 19.0001f)
                lineTo(19.0002f, 10.0001f)
                lineTo(16.0002f, 10.0001f)
                lineTo(10.9182f, 10.0001f)
                curveTo(10.8918f, 9.9814f, 10.866f, 9.9639f, 10.84f, 9.9463f)
                curveTo(10.8117f, 9.9272f, 10.7834f, 9.9079f, 10.7542f, 9.8871f)
                curveTo(11.9172f, 9.0031f, 12.7042f, 8.2261f, 12.7672f, 8.1621f)
                curveTo(12.9942f, 7.9371f, 13.0622f, 7.5971f, 12.9402f, 7.3011f)
                curveTo(12.8182f, 7.0051f, 12.5302f, 6.8131f, 12.2102f, 6.8131f)
                lineTo(10.4352f, 6.8131f)
                lineTo(10.4352f, 5.0001f)
                lineTo(8.8552f, 5.0001f)
                lineTo(8.8552f, 6.8131f)
                lineTo(6.2322f, 6.8131f)
                lineTo(6.2322f, 8.3931f)
                lineTo(10.0992f, 8.3931f)
                curveTo(9.0122f, 9.2501f, 7.4932f, 10.2821f, 6.0002f, 10.7421f)
                lineTo(6.4652f, 12.2521f)
                curveTo(7.4822f, 11.9381f, 8.4862f, 11.4131f, 9.3852f, 10.8401f)
                curveTo(9.5732f, 10.9841f, 9.7822f, 11.1371f, 10.0002f, 11.2891f)
                lineTo(10.0002f, 16.0001f)
                lineTo(10.0002f, 19.0001f)
                close()
                moveTo(16.0002f, 8.0001f)
                lineTo(20.0002f, 8.0001f)
                curveTo(20.5522f, 8.0001f, 21.0002f, 8.4481f, 21.0002f, 9.0001f)
                lineTo(21.0002f, 20.0001f)
                curveTo(21.0002f, 20.5521f, 20.5522f, 21.0001f, 20.0002f, 21.0001f)
                lineTo(9.0002f, 21.0001f)
                curveTo(8.4482f, 21.0001f, 8.0002f, 20.5521f, 8.0002f, 20.0001f)
                lineTo(8.0002f, 16.0001f)
                lineTo(4.0002f, 16.0001f)
                curveTo(3.4482f, 16.0001f, 3.0002f, 15.5521f, 3.0002f, 15.0001f)
                lineTo(3.0002f, 4.0001f)
                curveTo(3.0002f, 3.4481f, 3.4482f, 3.0001f, 4.0002f, 3.0001f)
                lineTo(15.0002f, 3.0001f)
                curveTo(15.5522f, 3.0001f, 16.0002f, 3.4481f, 16.0002f, 4.0001f)
                lineTo(16.0002f, 8.0001f)
                close()
                moveTo(14.4465f, 13.1624f)
                lineTo(13.6935f, 15.0894f)
                lineTo(15.2085f, 15.0894f)
                lineTo(14.4465f, 13.1624f)
                close()
                moveTo(10.8395f, 17.9874f)
                lineTo(13.8555f, 11.0124f)
                lineTo(15.1265f, 11.0124f)
                lineTo(18.1605f, 17.9874f)
                lineTo(16.3595f, 17.9874f)
                lineTo(15.7725f, 16.5104f)
                lineTo(13.1695f, 16.5104f)
                lineTo(12.6025f, 17.9874f)
                lineTo(10.8395f, 17.9874f)
                close()
            }
        }.build().also {
            _translate = it
        }
    }

private var _translate: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TranslateIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Translate,
            contentDescription = null,
    )
}
