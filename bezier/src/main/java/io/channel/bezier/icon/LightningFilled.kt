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

val BezierIcons.LightningFilled: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _lightningFilled ?: ImageVector.Builder(
                    name = "LightningFilled",
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
                    moveTo(18.54f, 10.226f)
                    lineTo(14.221f, 9.226f)
                    lineTo(16.303f, 2.1430000000000007f)
                    curveTo(16.449f, 1.6470000000000007f, 15.835f, 1.2830000000000008f, 15.47f, 1.6500000000000008f)
                    lineTo(5.146f, 12.003f)
                    arcTo(0.5f, 0.5f, 224.87483778107978f, isMoreThanHalf = false, isPositiveArc = false, 5.388f, 12.843f)
                    lineTo(9.708f, 13.843f)
                    lineTo(7.6240000000000006f, 20.924f)
                    curveTo(7.478000000000001f, 21.422f, 8.092f, 21.785f, 8.458f, 21.418f)
                    lineTo(18.781f, 11.065999999999999f)
                    arcTo(0.5f, 0.5f, 44.93587333147426f, isMoreThanHalf = false, isPositiveArc = false, 18.541f, 10.225999999999999f)
                }
            }.build().also {
                _lightningFilled = it
            }
    }


private var _lightningFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun LightningFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.LightningFilled.imageVector,
            contentDescription = null,
    )
}
