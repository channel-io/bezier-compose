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

val BezierIcons.HexahedronFilled: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _hexahedronFilled ?: ImageVector.Builder(
                    name = "HexahedronFilled",
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
                    moveTo(13.0f, 2.577f)
                    arcTo(2.0f, 2.0f, 300.0f, isMoreThanHalf = false, isPositiveArc = false, 11.0f, 2.577f)
                    lineTo(4.0f, 6.62f)
                    arcTo(2.0f, 2.0f, 240.00003480239235f, isMoreThanHalf = false, isPositiveArc = false, 3.0f, 8.35f)
                    lineTo(3.0f, 16.433f)
                    arcTo(2.0f, 2.0f, 179.998544459905f, isMoreThanHalf = false, isPositiveArc = false, 4.0f, 18.165f)
                    lineTo(11.0f, 22.206f)
                    arcTo(2.0f, 2.0f, 120.00000000000001f, isMoreThanHalf = false, isPositiveArc = false, 13.0f, 22.206f)
                    lineTo(20.0f, 18.165f)
                    arcTo(2.0f, 2.0f, 60.000000021348384f, isMoreThanHalf = false, isPositiveArc = false, 21.0f, 16.433f)
                    lineTo(21.0f, 8.35f)
                    arcTo(2.0f, 2.0f, 359.99854445965457f, isMoreThanHalf = false, isPositiveArc = false, 20.0f, 6.617999999999999f)
                    close()
                    moveTo(10.493f, 12.895f)
                    arcTo(1.0f, 1.0f, 299.5379543000901f, isMoreThanHalf = false, isPositiveArc = true, 11.0f, 13.764999999999999f)
                    lineTo(11.0f, 19.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = false, 13.0f, 19.0f)
                    lineTo(13.0f, 13.765f)
                    arcTo(1.0f, 1.0f, 180.00167934476588f, isMoreThanHalf = false, isPositiveArc = true, 13.507f, 12.895000000000001f)
                    lineTo(18.527f, 10.049000000000001f)
                    arcTo(1.0f, 1.0f, 60.43629834610656f, isMoreThanHalf = false, isPositiveArc = false, 17.540000000000003f, 8.309000000000001f)
                    lineTo(12.493000000000002f, 11.171000000000001f)
                    arcTo(1.0f, 1.0f, 60.462045671622455f, isMoreThanHalf = false, isPositiveArc = true, 11.507000000000001f, 11.171000000000001f)
                    lineTo(6.455f, 8.306f)
                    arcTo(1.0f, 1.0f, 299.129605072852f, isMoreThanHalf = false, isPositiveArc = false, 5.469f, 10.046f)
                    close()
                }
            }.build().also {
                _hexahedronFilled = it
            }
    }


private var _hexahedronFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun HexahedronFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.HexahedronFilled.imageVector,
            contentDescription = null,
    )
}
