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

val BezierIcons.Soccerball: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_soccerball
        override val imageVector: ImageVector
            get() = _soccerball ?: ImageVector.Builder(
                    name = "Soccerball",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(15.804f, 13.236f)
                    lineTo(12.0f, 15.999f)
                    lineTo(8.196f, 13.235000000000001f)
                    lineTo(9.649f, 8.763000000000002f)
                    lineTo(14.350999999999999f, 8.763000000000002f)
                    close()
                }

                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(12.0f, 22.0f)
                    arcTo(9.96f, 9.96f, 89.91447762264684f, isMoreThanHalf = false, isPositiveArc = true, 5.351f, 19.469f)
                    arcTo(10.0f, 10.0f, 131.65967015031657f, isMoreThanHalf = false, isPositiveArc = true, 3.657f, 17.514000000000003f)
                    arcTo(9.95f, 9.95f, 146.45644973247332f, isMoreThanHalf = false, isPositiveArc = true, 2.0f, 12.0f)
                    quadTo(2.002f, 10.964f, 2.203f, 9.986f)
                    arcTo(9.989f, 9.989f, 191.60921549190275f, isMoreThanHalf = false, isPositiveArc = true, 4.09f, 5.88f)
                    arcTo(10.03f, 10.03f, 217.76074784945203f, isMoreThanHalf = false, isPositiveArc = true, 8.536999999999999f, 2.616f)
                    arcTo(10.0f, 10.0f, 249.78452383408302f, isMoreThanHalf = false, isPositiveArc = true, 12.0f, 2.0f)
                    quadTo(12.48f, 2.0f, 12.95f, 2.044f)
                    arcTo(10.0f, 10.0f, 275.4057539871578f, isMoreThanHalf = false, isPositiveArc = true, 15.462f, 2.615f)
                    arcTo(10.0f, 10.0f, 290.25506193096055f, isMoreThanHalf = false, isPositiveArc = true, 22.0f, 12.0f)
                    curveTo(22.0f, 17.523f, 17.522f, 22.0f, 12.0f, 22.0f)
                    moveTo(6.294f, 13.973f)
                    lineTo(4.004f, 11.741f)
                    curveTo(4.050999999999999f, 10.270999999999999f, 4.494f, 8.902f, 5.2299999999999995f, 7.736f)
                    lineTo(8.472999999999999f, 7.265f)
                    lineTo(9.953999999999999f, 4.263999999999999f)
                    arcTo(8.0f, 8.0f, 255.23953026503142f, isMoreThanHalf = false, isPositiveArc = true, 12.001f, 4.0f)
                    curveTo(12.706999999999999f, 4.0f, 13.392999999999999f, 4.091f, 14.046f, 4.263f)
                    lineTo(15.526f, 7.265f)
                    lineTo(18.771f, 7.734999999999999f)
                    arcTo(7.96f, 7.96f, 327.7406482986387f, isMoreThanHalf = false, isPositiveArc = true, 19.996000000000002f, 11.741f)
                    lineTo(17.706000000000003f, 13.972999999999999f)
                    lineTo(18.229000000000003f, 17.021f)
                    arcTo(8.0f, 8.0f, 38.850112510249204f, isMoreThanHalf = false, isPositiveArc = true, 14.694000000000003f, 19.535f)
                    lineTo(12.0f, 18.119f)
                    lineTo(9.306000000000001f, 19.535f)
                    curveTo(7.906000000000001f, 19.035f, 6.686000000000001f, 18.155f, 5.771000000000001f, 17.02f)
                    close()
                }
            }.build().also {
                _soccerball = it
            }
    }


private var _soccerball: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun SoccerballIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Soccerball.imageVector,
            contentDescription = null,
    )
}
