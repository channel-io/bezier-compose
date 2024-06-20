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

val BezierIcons.Crop: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _crop ?: ImageVector.Builder(
                    name = "Crop",
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
                    moveTo(5.0f, 7.0f)
                    lineTo(5.0f, 16.0f)
                    arcTo(3.0f, 3.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 8.0f, 19.0f)
                    lineTo(17.0f, 19.0f)
                    lineTo(17.0f, 23.0f)
                    lineTo(19.0f, 23.0f)
                    lineTo(19.0f, 19.0f)
                    lineTo(23.0f, 19.0f)
                    lineTo(23.0f, 17.0f)
                    lineTo(19.0f, 17.0f)
                    lineTo(19.0f, 8.0f)
                    arcTo(3.0f, 3.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 16.0f, 5.0f)
                    lineTo(7.0f, 5.0f)
                    lineTo(7.0f, 1.0f)
                    lineTo(5.0f, 1.0f)
                    lineTo(5.0f, 5.0f)
                    lineTo(1.0f, 5.0f)
                    lineTo(1.0f, 7.0f)
                    close()
                    moveTo(7.0f, 7.0f)
                    lineTo(7.0f, 16.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 8.0f, 17.0f)
                    lineTo(17.0f, 17.0f)
                    lineTo(17.0f, 8.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 16.0f, 7.0f)
                    close()
                }
            }.build().also {
                _crop = it
            }
    }


private var _crop: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CropIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Crop.imageVector,
            contentDescription = null,
    )
}
