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

val BezierIcons.HeartFilled: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _heartFilled ?: ImageVector.Builder(
                    name = "HeartFilled",
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
                    moveTo(20.335f, 4.967f)
                    curveTo(19.929000000000002f, 4.561f, 19.396f, 4.236f, 18.819000000000003f, 3.9749999999999996f)
                    curveTo(16.426f, 2.893f, 13.296f, 3.68f, 12.0f, 6.133f)
                    curveTo(10.703f, 3.681f, 7.573f, 2.893f, 5.181f, 3.975f)
                    curveTo(4.604f, 4.235f, 4.071f, 4.561f, 3.665f, 4.9670000000000005f)
                    curveTo(1.512f, 7.120000000000001f, 1.46f, 10.395f, 3.432f, 12.765f)
                    curveTo(5.555f, 15.315000000000001f, 9.152f, 18.671f, 11.334999999999999f, 20.643f)
                    arcTo(0.986f, 0.986f, 132.41084807551394f, isMoreThanHalf = false, isPositiveArc = false, 12.665f, 20.643f)
                    curveTo(14.849f, 18.671f, 18.445f, 15.316f, 20.567999999999998f, 12.765f)
                    curveTo(22.538999999999998f, 10.395f, 22.488f, 7.120000000000001f, 20.334999999999997f, 4.9670000000000005f)
                }
            }.build().also {
                _heartFilled = it
            }
    }


private var _heartFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun HeartFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.HeartFilled.imageVector,
            contentDescription = null,
    )
}
