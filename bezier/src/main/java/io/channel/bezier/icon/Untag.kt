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

val BezierIcons.Untag: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_untag
        override val imageVector: ImageVector
            get() = _untag ?: ImageVector.Builder(
                    name = "Untag",
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
                    moveTo(18.142f, 15.728f)
                    lineTo(21.384999999999998f, 12.485f)
                    arcTo(2.0f, 2.0f, 45.00865351048362f, isMoreThanHalf = false, isPositiveArc = false, 21.970999999999997f, 11.071f)
                    lineTo(21.971f, 4.0f)
                    arcTo(2.0f, 2.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 19.971f, 2.0f)
                    lineTo(12.9f, 2.0f)
                    arcTo(2.0f, 2.0f, 270.0164102417634f, isMoreThanHalf = false, isPositiveArc = false, 11.485f, 2.586f)
                    lineTo(8.243f, 5.828f)
                    lineTo(4.914f, 2.5f)
                    arcTo(1.0f, 1.0f, 314.0042553864208f, isMoreThanHalf = false, isPositiveArc = false, 3.5f, 3.914f)
                    lineTo(20.086f, 20.5f)
                    arcTo(1.0f, 1.0f, 134.00425538642457f, isMoreThanHalf = false, isPositiveArc = false, 21.5f, 19.086f)
                    close()
                    moveTo(16.728f, 14.314f)
                    lineTo(19.971f, 11.071f)
                    lineTo(19.971f, 4.0f)
                    lineTo(12.9f, 4.0f)
                    lineTo(9.657f, 7.243f)
                    close()
                    moveTo(5.0f, 11.899f)
                    lineTo(7.243f, 9.657f)
                    lineTo(5.828f, 8.243f)
                    lineTo(3.5860000000000003f, 10.485f)
                    arcTo(4.0f, 4.0f, 225.00147626156968f, isMoreThanHalf = false, isPositiveArc = false, 3.5860000000000003f, 16.142f)
                    lineTo(7.828f, 20.384999999999998f)
                    arcTo(4.0f, 4.0f, 135.00147626156968f, isMoreThanHalf = false, isPositiveArc = false, 13.485f, 20.384999999999998f)
                    lineTo(15.728f, 18.142f)
                    lineTo(14.314f, 16.727999999999998f)
                    lineTo(12.071f, 18.970999999999997f)
                    arcTo(2.0f, 2.0f, 45.008651662838f, isMoreThanHalf = false, isPositiveArc = true, 9.243f, 18.970999999999997f)
                    lineTo(5.0f, 14.728f)
                    arcTo(2.0f, 2.0f, 135.00865166283802f, isMoreThanHalf = false, isPositiveArc = true, 5.0f, 11.9f)
                    moveTo(18.485f, 7.486000000000001f)
                    arcTo(1.999f, 1.999f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 14.485f, 7.486000000000001f)
                    arcTo(2.0f, 2.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = true, 18.485f, 7.486000000000001f)
                }
            }.build().also {
                _untag = it
            }
    }


private var _untag: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun UntagIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Untag.imageVector,
            contentDescription = null,
    )
}
