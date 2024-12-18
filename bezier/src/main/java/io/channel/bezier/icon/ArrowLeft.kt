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

val BezierIcons.ArrowLeft: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_arrow_left
        override val imageVector: ImageVector
            get() = _arrowLeft ?: ImageVector.Builder(
                    name = "ArrowLeft",
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
                    moveTo(12.267f, 20.742f)
                    arcTo(1.0f, 1.0f, 46.762166682136545f, isMoreThanHalf = false, isPositiveArc = false, 12.311f, 19.329f)
                    lineTo(6.363f, 13.0f)
                    lineTo(20.0f, 13.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 20.0f, 11.0f)
                    lineTo(6.389f, 11.0f)
                    lineTo(12.311f, 4.698f)
                    arcTo(1.0f, 1.0f, 43.2176789738009f, isMoreThanHalf = false, isPositiveArc = false, 10.853f, 3.3280000000000003f)
                    lineTo(3.657f, 10.986f)
                    arcTo(1.5f, 1.5f, 223.23560714898218f, isMoreThanHalf = false, isPositiveArc = false, 3.657f, 13.041f)
                    lineTo(10.853f, 20.698f)
                    arcTo(1.0f, 1.0f, 136.8013999188801f, isMoreThanHalf = false, isPositiveArc = false, 12.267f, 20.742f)
                }
            }.build().also {
                _arrowLeft = it
            }
    }


private var _arrowLeft: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ArrowLeftIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ArrowLeft.imageVector,
            contentDescription = null,
    )
}
