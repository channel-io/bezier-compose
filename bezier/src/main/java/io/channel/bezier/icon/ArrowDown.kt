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

val BezierIcons.ArrowDown: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_arrow_down
        override val imageVector: ImageVector
            get() = _arrowDown ?: ImageVector.Builder(
                    name = "ArrowDown",
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
                    moveTo(3.285f, 12.163f)
                    arcTo(1.0f, 1.0f, 223.23783331786345f, isMoreThanHalf = false, isPositiveArc = true, 4.698f, 12.119f)
                    lineTo(11.001000000000001f, 18.042f)
                    lineTo(11.0f, 18.0f)
                    lineTo(11.0f, 4.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = true, 13.0f, 4.0f)
                    lineTo(13.0f, 18.0f)
                    quadTo(13.0f, 18.035f, 12.998f, 18.069f)
                    lineTo(19.328f, 12.119f)
                    arcTo(1.0f, 1.0f, 226.78232116178927f, isMoreThanHalf = false, isPositiveArc = true, 20.698f, 13.577f)
                    lineTo(13.041f, 20.773f)
                    arcTo(1.5f, 1.5f, 46.764392851017824f, isMoreThanHalf = false, isPositiveArc = true, 10.986f, 20.773f)
                    lineTo(3.33f, 13.577f)
                    arcTo(1.0f, 1.0f, 133.19860008111993f, isMoreThanHalf = false, isPositiveArc = true, 3.286f, 12.163f)
                }
            }.build().also {
                _arrowDown = it
            }
    }


private var _arrowDown: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ArrowDownIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ArrowDown.imageVector,
            contentDescription = null,
    )
}
