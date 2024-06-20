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

val BezierIcons.Bold: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _bold ?: ImageVector.Builder(
                    name = "Bold",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                        pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(6.0f, 3.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 5.0f, 4.0f)
                    lineTo(5.0f, 20.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 6.0f, 21.0f)
                    lineTo(14.0f, 21.0f)
                    arcTo(5.5f, 5.5f, 90.01094333615929f, isMoreThanHalf = false, isPositiveArc = false, 17.377f, 11.158f)
                    arcTo(5.0f, 5.0f, 39.16826694162971f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 3.0f)
                    close()
                    moveTo(13.5f, 10.0f)
                    arcTo(2.0f, 2.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 13.5f, 6.0f)
                    lineTo(8.0f, 6.0f)
                    lineTo(8.0f, 10.0f)
                    close()
                    moveTo(8.0f, 13.0f)
                    lineTo(8.0f, 18.0f)
                    lineTo(14.0f, 18.0f)
                    arcTo(2.5f, 2.5f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 14.0f, 13.0f)
                    close()
                }
            }.build().also {
                _bold = it
            }
    }


private var _bold: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun BoldIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Bold.imageVector,
            contentDescription = null,
    )
}
