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

val BezierIcons.ArrowLeftUp: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_arrow_left_up
        override val imageVector: ImageVector
            get() = _arrowLeftUp ?: ImageVector.Builder(
                    name = "ArrowLeftUp",
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
                    moveTo(20.0f, 20.0f)
                    arcTo(1.0f, 1.0f, 44.99134833716207f, isMoreThanHalf = false, isPositiveArc = false, 20.0f, 18.586f)
                    lineTo(7.414f, 6.0f)
                    lineTo(19.0f, 6.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 19.0f, 4.0f)
                    lineTo(5.5f, 4.0f)
                    curveTo(4.673f, 4.0f, 4.0f, 4.673f, 4.0f, 5.5f)
                    lineTo(4.0f, 19.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = false, 6.0f, 19.0f)
                    lineTo(6.0f, 7.414f)
                    lineTo(18.586f, 20.0f)
                    arcTo(1.0f, 1.0f, 134.9913483371621f, isMoreThanHalf = false, isPositiveArc = false, 20.0f, 20.0f)
                }
            }.build().also {
                _arrowLeftUp = it
            }
    }


private var _arrowLeftUp: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ArrowLeftUpIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ArrowLeftUp.imageVector,
            contentDescription = null,
    )
}
