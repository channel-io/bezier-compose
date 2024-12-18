@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

import androidx.annotation.DrawableRes
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
import io.channel.bezier.compose.R

val BezierIcons.Star: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_star
        override val imageVector: ImageVector
            get() = _star ?: ImageVector.Builder(
                    name = "Star",
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
                    moveTo(12.002f, 18.438f)
                    lineTo(15.743f, 21.156f)
                    curveTo(17.529f, 22.453f, 19.931f, 20.708f, 19.248f, 18.608999999999998f)
                    lineTo(17.82f, 14.210999999999999f)
                    lineTo(21.560000000000002f, 11.492999999999999f)
                    curveTo(23.345000000000002f, 10.194999999999999f, 22.429000000000002f, 7.372999999999998f, 20.222f, 7.372999999999998f)
                    lineTo(15.597000000000001f, 7.371999999999998f)
                    lineTo(14.168000000000001f, 2.9739999999999984f)
                    curveTo(13.488000000000001f, 0.8749999999999982f, 10.517000000000001f, 0.8749999999999982f, 9.836000000000002f, 2.9749999999999983f)
                    lineTo(8.406000000000002f, 7.371999999999998f)
                    lineTo(3.782f, 7.372f)
                    curveTo(1.5750000000000002f, 7.372f, 0.6589999999999998f, 10.195f, 2.442f, 11.492f)
                    lineTo(6.184f, 14.211f)
                    lineTo(4.756f, 18.61f)
                    curveTo(4.073f, 20.708f, 6.476f, 22.453f, 8.261f, 21.156f)
                    close()
                    moveTo(12.59f, 16.393f)
                    lineTo(12.002f, 15.966f)
                    lineTo(7.085f, 19.538f)
                    arcTo(0.277f, 0.277f, 53.717105924233536f, isMoreThanHalf = false, isPositiveArc = true, 6.658f, 19.228f)
                    lineTo(8.311f, 14.138000000000002f)
                    lineTo(8.535f, 13.447000000000001f)
                    lineTo(3.62f, 9.875f)
                    arcTo(0.277f, 0.277f, 125.6799342598602f, isMoreThanHalf = false, isPositiveArc = true, 3.783f, 9.373f)
                    lineTo(9.134f, 9.372f)
                    lineTo(9.86f, 9.372f)
                    lineTo(11.738999999999999f, 3.5919999999999996f)
                    arcTo(0.277f, 0.277f, 197.62311731261175f, isMoreThanHalf = false, isPositiveArc = true, 12.267f, 3.5919999999999996f)
                    lineTo(13.921f, 8.681000000000001f)
                    lineTo(14.145999999999999f, 9.371f)
                    lineTo(20.223f, 9.373000000000001f)
                    curveTo(20.493f, 9.373000000000001f, 20.602999999999998f, 9.716000000000001f, 20.386f, 9.875000000000002f)
                    lineTo(16.057f, 13.020000000000001f)
                    lineTo(15.469f, 13.447000000000001f)
                    lineTo(17.346999999999998f, 19.227f)
                    arcTo(0.277f, 0.277f, 341.7581581221163f, isMoreThanHalf = false, isPositiveArc = true, 16.919999999999998f, 19.537f)
                    close()
                }
            }.build().also {
                _star = it
            }
    }


private var _star: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun StarIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Star.imageVector,
            contentDescription = null,
    )
}
