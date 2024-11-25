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

val BezierIcons.ArrowRightUpSmall: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_arrow_right_up_small
        override val imageVector: ImageVector
            get() = _arrowRightUpSmall ?: ImageVector.Builder(
                    name = "ArrowRightUpSmall",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(7.05f, 16.95f)
                    arcTo(1.0f, 1.0f, 134.99134833716204f, isMoreThanHalf = false, isPositiveArc = false, 8.464f, 16.95f)
                    lineTo(15.243f, 10.172f)
                    lineTo(15.243f, 15.536000000000001f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 17.243000000000002f, 15.536000000000001f)
                    lineTo(17.243000000000002f, 7.757f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 16.243000000000002f, 6.757f)
                    lineTo(8.464f, 6.757f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = false, 8.464f, 8.757f)
                    lineTo(13.828f, 8.757f)
                    lineTo(7.05f, 15.536f)
                    arcTo(1.0f, 1.0f, 224.99134833716198f, isMoreThanHalf = false, isPositiveArc = false, 7.05f, 16.95f)
                }
            }.build().also {
                _arrowRightUpSmall = it
            }
    }


private var _arrowRightUpSmall: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ArrowRightUpSmallIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ArrowRightUpSmall.imageVector,
            contentDescription = null,
    )
}
