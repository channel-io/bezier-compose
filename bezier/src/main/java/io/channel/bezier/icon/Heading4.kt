@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

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

val BezierIcons.Heading4: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _heading4 ?: ImageVector.Builder(
                    name = "Heading4",
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
                    moveTo(4.5f, 5.0f)
                    arcTo(0.5f, 0.5f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 4.0f, 5.5f)
                    lineTo(4.0f, 17.5f)
                    arcTo(0.5f, 0.5f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 4.5f, 18.0f)
                    lineTo(6.0f, 18.0f)
                    arcTo(0.5f, 0.5f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 6.5f, 17.5f)
                    lineTo(6.5f, 13.0f)
                    lineTo(11.5f, 13.0f)
                    lineTo(11.5f, 17.5f)
                    arcTo(0.5f, 0.5f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 12.0f, 18.0f)
                    lineTo(13.5f, 18.0f)
                    arcTo(0.5f, 0.5f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 14.0f, 17.5f)
                    lineTo(14.0f, 5.5f)
                    arcTo(0.5f, 0.5f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 5.0f)
                    lineTo(12.0f, 5.0f)
                    arcTo(0.5f, 0.5f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 11.5f, 5.5f)
                    lineTo(11.5f, 10.5f)
                    lineTo(6.5f, 10.5f)
                    lineTo(6.5f, 5.5f)
                    arcTo(0.5f, 0.5f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 6.0f, 5.0f)
                    close()
                    moveTo(20.5f, 12.383f)
                    curveTo(20.5f, 11.123f, 18.846f, 10.655f, 18.185f, 11.728f)
                    lineTo(14.834999999999999f, 17.171f)
                    arcTo(1.2f, 1.2f, 211.61225993925908f, isMoreThanHalf = false, isPositiveArc = false, 15.859f, 19.0f)
                    lineTo(18.5f, 19.0f)
                    lineTo(18.5f, 20.5f)
                    arcTo(0.5f, 0.5f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 19.0f, 21.0f)
                    lineTo(20.0f, 21.0f)
                    arcTo(0.5f, 0.5f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 20.5f, 20.5f)
                    lineTo(20.5f, 19.0f)
                    lineTo(21.5f, 19.0f)
                    arcTo(0.5f, 0.5f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 22.0f, 18.5f)
                    lineTo(22.0f, 17.5f)
                    arcTo(0.5f, 0.5f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 21.5f, 17.0f)
                    lineTo(20.5f, 17.0f)
                    close()
                    moveTo(18.5f, 14.8f)
                    lineTo(18.5f, 17.0f)
                    lineTo(17.2f, 17.0f)
                    close()
                }
            }.build().also {
                _heading4 = it
            }
    }


private var _heading4: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun Heading4IconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Heading4.imageVector,
            contentDescription = null,
    )
}
