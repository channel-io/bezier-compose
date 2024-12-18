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

val BezierIcons.FastRewindFilled: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_fast_rewind_filled
        override val imageVector: ImageVector
            get() = _fastRewindFilled ?: ImageVector.Builder(
                    name = "FastRewindFilled",
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
                    moveTo(11.999f, 13.034f)
                    lineTo(20.833f, 18.919f)
                    arcTo(0.75f, 0.75f, 123.687813445552f, isMoreThanHalf = false, isPositiveArc = false, 21.999f, 18.294f)
                    lineTo(21.999f, 5.707f)
                    arcTo(0.75f, 0.75f, 0.07226243658752529f, isMoreThanHalf = false, isPositiveArc = false, 20.833f, 5.082f)
                    lineTo(11.998999999999999f, 10.966999999999999f)
                    lineTo(11.998999999999999f, 5.706999999999999f)
                    arcTo(0.75f, 0.75f, 0.07226243658752529f, isMoreThanHalf = false, isPositiveArc = false, 10.832999999999998f, 5.081999999999999f)
                    lineTo(1.3839999999999986f, 11.376999999999999f)
                    arcTo(0.75f, 0.75f, 236.30473785288302f, isMoreThanHalf = false, isPositiveArc = false, 1.3839999999999986f, 12.624999999999998f)
                    lineTo(10.832999999999998f, 18.919999999999998f)
                    arcTo(0.75f, 0.75f, 123.687813445552f, isMoreThanHalf = false, isPositiveArc = false, 11.998999999999999f, 18.294999999999998f)
                    close()
                }
            }.build().also {
                _fastRewindFilled = it
            }
    }


private var _fastRewindFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun FastRewindFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.FastRewindFilled.imageVector,
            contentDescription = null,
    )
}
