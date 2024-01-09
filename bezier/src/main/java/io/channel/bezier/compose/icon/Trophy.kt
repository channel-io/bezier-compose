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

val BezierIcon.Trophy: ImageVector
    get() {
        return _trophy ?: ImageVector.Builder(
                name = "Trophy",
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
                moveTo(7.0f, 4.0f)
                lineTo(17.0f, 4.0f)
                lineTo(17.0f, 9.0f)
                curveTo(17.0f, 11.7614f, 14.7614f, 14.0f, 12.0f, 14.0f)
                curveTo(9.2386f, 14.0f, 7.0f, 11.7614f, 7.0f, 9.0f)
                lineTo(7.0f, 4.0f)
                close()
                moveTo(17.7453f, 13.0f)
                curveTo(16.8336f, 14.3071f, 15.4872f, 15.2885f, 13.9157f, 15.7346f)
                curveTo(14.4593f, 16.5004f, 15.3531f, 17.0f, 16.3636f, 17.0f)
                lineTo(16.5f, 17.0f)
                curveTo(16.7761f, 17.0f, 17.0f, 17.2239f, 17.0f, 17.5f)
                lineTo(17.0f, 21.5f)
                curveTo(17.0f, 21.7761f, 16.7761f, 22.0f, 16.5f, 22.0f)
                lineTo(7.5f, 22.0f)
                curveTo(7.2239f, 22.0f, 7.0f, 21.7761f, 7.0f, 21.5f)
                lineTo(7.0f, 17.5f)
                curveTo(7.0f, 17.2239f, 7.2239f, 17.0f, 7.5f, 17.0f)
                lineTo(7.6364f, 17.0f)
                curveTo(8.6469f, 17.0f, 9.5407f, 16.5004f, 10.0843f, 15.7346f)
                curveTo(8.5128f, 15.2885f, 7.1664f, 14.3071f, 6.2547f, 13.0f)
                lineTo(6.0f, 13.0f)
                curveTo(3.7909f, 13.0f, 2.0f, 11.2091f, 2.0f, 9.0f)
                lineTo(2.0f, 6.0f)
                curveTo(2.0f, 4.8954f, 2.8954f, 4.0f, 4.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                curveTo(5.0f, 2.8954f, 5.8954f, 2.0f, 7.0f, 2.0f)
                lineTo(17.0f, 2.0f)
                curveTo(18.1046f, 2.0f, 19.0f, 2.8954f, 19.0f, 4.0f)
                lineTo(20.0f, 4.0f)
                curveTo(21.1046f, 4.0f, 22.0f, 4.8954f, 22.0f, 6.0f)
                lineTo(22.0f, 9.0f)
                curveTo(22.0f, 11.2091f, 20.2091f, 13.0f, 18.0f, 13.0f)
                lineTo(17.7453f, 13.0f)
                close()
                moveTo(5.0f, 6.0f)
                lineTo(4.0f, 6.0f)
                lineTo(4.0f, 9.0f)
                curveTo(4.0f, 9.8386f, 4.5162f, 10.5567f, 5.2481f, 10.8539f)
                curveTo(5.0864f, 10.2634f, 5.0f, 9.6418f, 5.0f, 9.0f)
                lineTo(5.0f, 6.0f)
                close()
                moveTo(18.7519f, 10.8539f)
                curveTo(19.4838f, 10.5567f, 20.0f, 9.8386f, 20.0f, 9.0f)
                lineTo(20.0f, 6.0f)
                lineTo(19.0f, 6.0f)
                lineTo(19.0f, 9.0f)
                curveTo(19.0f, 9.6418f, 18.9136f, 10.2634f, 18.7519f, 10.8539f)
                close()
                moveTo(9.0f, 18.8118f)
                lineTo(9.0f, 20.0f)
                lineTo(15.0f, 20.0f)
                lineTo(15.0f, 18.8118f)
                curveTo(13.7149f, 18.4483f, 12.6402f, 17.5839f, 12.0f, 16.4429f)
                curveTo(11.3598f, 17.5839f, 10.2851f, 18.4483f, 9.0f, 18.8118f)
                close()
            }
        }.build().also {
            _trophy = it
        }
    }

private var _trophy: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TrophyIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Trophy,
            contentDescription = null,
    )
}
