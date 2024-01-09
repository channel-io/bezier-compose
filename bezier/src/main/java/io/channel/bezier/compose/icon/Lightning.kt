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

val BezierIcon.Lightning: ImageVector
    get() {
        return _lightning ?: ImageVector.Builder(
                name = "Lightning",
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
                moveTo(6.526f, 12.5372f)
                lineTo(11.001f, 13.5732f)
                lineTo(9.174f, 19.7852f)
                lineTo(17.474f, 11.4622f)
                lineTo(12.999f, 10.4262f)
                lineTo(14.825f, 4.2142f)
                lineTo(6.526f, 12.5372f)
                close()
                moveTo(8.146f, 23.0362f)
                curveTo(7.883f, 23.0362f, 7.618f, 22.9652f, 7.376f, 22.8212f)
                curveTo(6.776f, 22.4662f, 6.505f, 21.7772f, 6.701f, 21.1082f)
                lineTo(8.484f, 15.0432f)
                lineTo(5.198f, 14.2832f)
                curveTo(4.668f, 14.1602f, 4.245f, 13.7592f, 4.095f, 13.2362f)
                curveTo(3.944f, 12.7122f, 4.089f, 12.1482f, 4.474f, 11.7622f)
                lineTo(14.798f, 1.4102f)
                curveTo(15.289f, 0.9162f, 16.024f, 0.8232f, 16.624f, 1.1782f)
                curveTo(17.224f, 1.5342f, 17.496f, 2.2222f, 17.299f, 2.8912f)
                lineTo(15.515f, 8.9562f)
                lineTo(18.802f, 9.7172f)
                curveTo(19.332f, 9.8402f, 19.755f, 10.2412f, 19.905f, 10.7652f)
                curveTo(20.055f, 11.2882f, 19.91f, 11.8522f, 19.525f, 12.2382f)
                lineTo(9.202f, 22.5902f)
                curveTo(8.909f, 22.8842f, 8.53f, 23.0362f, 8.146f, 23.0362f)
                close()
            }
        }.build().also {
            _lightning = it
        }
    }

private var _lightning: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun LightningIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Lightning,
            contentDescription = null,
    )
}
