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

val BezierIcons.Transfer: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_transfer
        override val imageVector: ImageVector
            get() = _transfer ?: ImageVector.Builder(
                    name = "Transfer",
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
                    moveTo(17.0f, 10.069f)
                    lineTo(17.0f, 8.0f)
                    lineTo(5.0f, 8.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 5.0f, 6.0f)
                    lineTo(17.0f, 6.0f)
                    lineTo(17.0f, 3.931f)
                    arcTo(0.8f, 0.8f, 180.02654147844697f, isMoreThanHalf = false, isPositiveArc = true, 18.366f, 3.366f)
                    lineTo(21.293f, 6.293f)
                    arcTo(1.0f, 1.0f, 315.008651662838f, isMoreThanHalf = false, isPositiveArc = true, 21.293f, 7.707f)
                    lineTo(18.366f, 10.634f)
                    arcTo(0.8f, 0.8f, 44.96801042191744f, isMoreThanHalf = false, isPositiveArc = true, 17.0f, 10.07f)
                    moveTo(7.0f, 18.0f)
                    lineTo(7.0f, 20.068f)
                    arcTo(0.8f, 0.8f, 359.9549101409432f, isMoreThanHalf = false, isPositiveArc = true, 5.634f, 20.634f)
                    lineTo(2.7070000000000003f, 17.707f)
                    arcTo(1.0f, 1.0f, 135.00865166283793f, isMoreThanHalf = false, isPositiveArc = true, 2.7070000000000003f, 16.293f)
                    lineTo(5.634f, 13.364999999999998f)
                    arcTo(0.8f, 0.8f, 224.9681041109744f, isMoreThanHalf = false, isPositiveArc = true, 7.0f, 13.931f)
                    lineTo(7.0f, 16.0f)
                    lineTo(19.0f, 16.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = true, 19.0f, 18.0f)
                    close()
                }
            }.build().also {
                _transfer = it
            }
    }


private var _transfer: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TransferIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Transfer.imageVector,
            contentDescription = null,
    )
}
