@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons

val BezierIcons.Fire: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _fire ?: ImageVector.Builder(
                    name = "Fire",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                ) {
                    moveTo(12.0002f, 18.0001f)
                    curveTo(9.7942f, 18.0001f, 8.0002f, 16.2061f, 8.0002f, 14.0001f)
                    curveTo(8.0002f, 13.1251f, 8.1882f, 12.5061f, 8.6112f, 11.8941f)
                    curveTo(8.7892f, 12.3361f, 9.0192f, 12.7641f, 9.3002f, 13.1681f)
                    curveTo(10.5372f, 14.9501f, 12.6452f, 16.0571f, 14.8012f, 16.0571f)
                    curveTo(15.0202f, 16.0571f, 15.2362f, 16.0461f, 15.4492f, 16.0251f)
                    curveTo(14.7522f, 17.2061f, 13.4672f, 18.0001f, 12.0002f, 18.0001f)
                    close()
                    moveTo(20.0002f, 14.0001f)
                    curveTo(20.0002f, 9.24412f, 17.0002f, 5.95412f, 17.0002f, 5.95412f)
                    curveTo(17.6372f, 8.33112f, 17.4812f, 9.88112f, 16.9342f, 10.8841f)
                    curveTo(15.7432f, 13.0641f, 12.3482f, 11.3961f, 13.2102f, 9.06612f)
                    curveTo(14.8012f, 4.76612f, 13.6412f, 4.09312f, 12.0002f, 1.00012f)
                    curveTo(12.0002f, 1.00012f, 12.1512f, 2.72412f, 8.5942f, 6.25512f)
                    curveTo(8.3602f, 6.48812f, 8.1222f, 6.70912f, 7.8822f, 6.92412f)
                    curveTo(5.9592f, 8.65812f, 4.0002f, 10.0241f, 4.0002f, 14.0001f)
                    curveTo(4.0002f, 18.4111f, 7.5892f, 22.0001f, 12.0002f, 22.0001f)
                    curveTo(16.4112f, 22.0001f, 20.0002f, 18.4111f, 20.0002f, 14.0001f)
                    close()
                }
            }.build().also {
                _fire = it
            }
    }


private var _fire: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun FireIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Fire.imageVector,
            contentDescription = null,
    )
}
