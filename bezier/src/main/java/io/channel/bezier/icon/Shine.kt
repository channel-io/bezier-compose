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

val BezierIcons.Shine: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_shine
        override val imageVector: ImageVector
            get() = _shine ?: ImageVector.Builder(
                    name = "Shine",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(17.73f, 10.464f)
                    arcTo(0.25f, 0.25f, 23.073918065630725f, isMoreThanHalf = false, isPositiveArc = true, 17.27f, 10.464f)
                    lineTo(16.15f, 7.85f)
                    lineTo(13.535999999999998f, 6.7299999999999995f)
                    arcTo(0.25f, 0.25f, 113.073918065631f, isMoreThanHalf = false, isPositiveArc = true, 13.535999999999998f, 6.27f)
                    lineTo(16.15f, 5.1499999999999995f)
                    lineTo(17.27f, 2.5359999999999996f)
                    arcTo(0.25f, 0.25f, 203.07391806563072f, isMoreThanHalf = false, isPositiveArc = true, 17.73f, 2.5359999999999996f)
                    lineTo(18.85f, 5.1499999999999995f)
                    lineTo(21.464000000000002f, 6.27f)
                    arcTo(0.25f, 0.25f, 293.073918065631f, isMoreThanHalf = false, isPositiveArc = true, 21.464000000000002f, 6.7299999999999995f)
                    lineTo(18.85f, 7.85f)
                    close()
                    moveTo(10.228f, 21.5f)
                    arcTo(0.25f, 0.25f, 24.21678341329262f, isMoreThanHalf = false, isPositiveArc = true, 9.772f, 21.5f)
                    lineTo(7.5f, 16.5f)
                    lineTo(2.5f, 14.228f)
                    arcTo(0.25f, 0.25f, 114.21678341329262f, isMoreThanHalf = false, isPositiveArc = true, 2.5f, 13.772f)
                    lineTo(7.5f, 11.5f)
                    lineTo(9.772f, 6.5f)
                    arcTo(0.25f, 0.25f, 204.21678341329263f, isMoreThanHalf = false, isPositiveArc = true, 10.228f, 6.5f)
                    lineTo(12.5f, 11.5f)
                    lineTo(17.5f, 13.772f)
                    arcTo(0.25f, 0.25f, 294.2167834132926f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 14.228f)
                    lineTo(12.5f, 16.5f)
                    close()
                }
            }.build().also {
                _shine = it
            }
    }


private var _shine: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ShineIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Shine.imageVector,
            contentDescription = null,
    )
}
