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

val BezierIcons.StarFilled: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_star_filled
        override val imageVector: ImageVector
            get() = _starFilled ?: ImageVector.Builder(
                    name = "StarFilled",
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
                    moveTo(12.0f, 17.76f)
                    lineTo(16.785f, 21.236f)
                    curveTo(17.892f, 22.04f, 19.38f, 20.958000000000002f, 18.958f, 19.656f)
                    lineTo(17.13f, 14.032f)
                    lineTo(21.915f, 10.556000000000001f)
                    curveTo(23.021f, 9.752f, 22.453f, 8.001000000000001f, 21.085f, 8.001000000000001f)
                    lineTo(15.171000000000001f, 8.001000000000001f)
                    lineTo(13.343000000000002f, 2.3760000000000012f)
                    curveTo(12.920000000000002f, 1.0750000000000013f, 11.080000000000002f, 1.0750000000000013f, 10.657000000000002f, 2.3760000000000012f)
                    lineTo(8.83f, 8.0f)
                    lineTo(2.915f, 8.0f)
                    curveTo(1.547f, 8.0f, 0.978f, 9.75f, 2.085f, 10.555f)
                    lineTo(6.869f, 14.030999999999999f)
                    lineTo(5.042f, 19.656f)
                    curveTo(4.619f, 20.956f, 6.108f, 22.038999999999998f, 7.215f, 21.235f)
                    close()
                }
            }.build().also {
                _starFilled = it
            }
    }


private var _starFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun StarFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.StarFilled.imageVector,
            contentDescription = null,
    )
}
