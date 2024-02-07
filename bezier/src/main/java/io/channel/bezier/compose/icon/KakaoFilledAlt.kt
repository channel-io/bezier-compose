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

val BezierIcon.KakaoFilledAlt: ImageVector
    get() {
        return _kakaoFilledAlt ?: ImageVector.Builder(
                name = "KakaoFilledAlt",
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
                moveTo(12.0f, 2.0f)
                curveTo(5.9294f, 2.0f, 1.0f, 5.8637f, 1.0f, 10.6762f)
                curveTo(1.0f, 13.77f, 3.0625f, 16.4856f, 6.1563f, 18.0325f)
                curveTo(6.1182f, 18.1673f, 6.0402f, 18.4389f, 5.9424f, 18.7801f)
                curveTo(5.6159f, 19.918f, 5.0674f, 21.8296f, 5.0356f, 22.02f)
                curveTo(5.0292f, 22.0687f, 5.0352f, 22.1183f, 5.0533f, 22.164f)
                curveTo(5.0713f, 22.2097f, 5.1007f, 22.2501f, 5.1388f, 22.2812f)
                curveTo(5.1801f, 22.2986f, 5.2245f, 22.3076f, 5.2694f, 22.3076f)
                curveTo(5.3142f, 22.3076f, 5.3587f, 22.2986f, 5.4f, 22.2812f)
                curveTo(5.7438f, 22.2331f, 9.415f, 19.655f, 10.0475f, 19.2081f)
                curveTo(10.6943f, 19.2996f, 11.3468f, 19.3455f, 12.0f, 19.3456f)
                curveTo(18.0775f, 19.3456f, 23.0f, 15.4681f, 23.0f, 10.6762f)
                curveTo(23.0f, 5.8844f, 18.0706f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }.build().also {
            _kakaoFilledAlt = it
        }
    }

private var _kakaoFilledAlt: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun KakaoFilledAltIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.KakaoFilledAlt,
            contentDescription = null,
    )
}
