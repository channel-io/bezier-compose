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
import io.channel.bezier.BezierIcons

val BezierIcons.Settings: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _settings ?: ImageVector.Builder(
                    name = "Settings",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                        pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(7.0f, 12.0f)
                    arcTo(5.0f, 5.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = true, 17.0f, 12.0f)
                    arcTo(5.0f, 5.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 7.0f, 12.0f)
                    moveTo(22.0f, 13.5f)
                    lineTo(22.0f, 10.5f)
                    lineTo(19.77f, 10.128f)
                    arcTo(8.0f, 8.0f, 346.3566396990538f, isMoreThanHalf = false, isPositiveArc = false, 18.815f, 7.832000000000001f)
                    lineTo(20.131f, 5.989000000000001f)
                    lineTo(18.011f, 3.8690000000000007f)
                    lineTo(16.166999999999998f, 5.1850000000000005f)
                    arcTo(8.0f, 8.0f, 301.53097944850015f, isMoreThanHalf = false, isPositiveArc = false, 13.871999999999998f, 4.23f)
                    lineTo(13.5f, 2.0f)
                    lineTo(10.5f, 2.0f)
                    lineTo(10.128f, 4.23f)
                    arcTo(8.0f, 8.0f, 256.35663969905374f, isMoreThanHalf = false, isPositiveArc = false, 7.832000000000001f, 5.1850000000000005f)
                    lineTo(5.99f, 3.868f)
                    lineTo(3.87f, 5.99f)
                    lineTo(5.1850000000000005f, 7.833f)
                    arcTo(8.0f, 8.0f, 211.50280545253673f, isMoreThanHalf = false, isPositiveArc = false, 4.231000000000001f, 10.129f)
                    lineTo(2.0f, 10.5f)
                    lineTo(2.0f, 13.5f)
                    lineTo(4.23f, 13.872f)
                    curveTo(4.428000000000001f, 14.693999999999999f, 4.753f, 15.466f, 5.184f, 16.168f)
                    lineTo(3.8680000000000003f, 18.011f)
                    lineTo(5.989000000000001f, 20.131999999999998f)
                    lineTo(7.832000000000001f, 18.814999999999998f)
                    arcTo(8.0f, 8.0f, 121.52547434076165f, isMoreThanHalf = false, isPositiveArc = false, 10.128f, 19.769999999999996f)
                    lineTo(10.5f, 22.0f)
                    lineTo(13.5f, 22.0f)
                    lineTo(13.872f, 19.77f)
                    arcTo(8.0f, 8.0f, 76.34444074109153f, isMoreThanHalf = false, isPositiveArc = false, 16.167f, 18.815f)
                    lineTo(18.01f, 20.132f)
                    lineTo(20.131f, 18.012f)
                    lineTo(18.815f, 16.168f)
                    arcTo(8.0f, 8.0f, 31.52547434076163f, isMoreThanHalf = false, isPositiveArc = false, 19.77f, 13.872f)
                    close()
                }
            }.build().also {
                _settings = it
            }
    }


private var _settings: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun SettingsIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Settings.imageVector,
            contentDescription = null,
    )
}
