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

val BezierIcons.ChevronLeft: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _chevronLeft ?: ImageVector.Builder(
                    name = "ChevronLeft",
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
                    moveTo(15.207f, 19.707f)
                    arcTo(1.0f, 1.0f, 45.008651662838f, isMoreThanHalf = false, isPositiveArc = true, 13.793000000000001f, 19.707f)
                    lineTo(6.793000000000001f, 12.707f)
                    arcTo(1.0f, 1.0f, 135.00865166283802f, isMoreThanHalf = false, isPositiveArc = true, 6.793000000000001f, 11.293000000000001f)
                    lineTo(13.793000000000001f, 4.293000000000001f)
                    arcTo(1.0f, 1.0f, 224.00425538642025f, isMoreThanHalf = true, isPositiveArc = true, 15.207f, 5.707000000000001f)
                    lineTo(8.914f, 12.0f)
                    lineTo(15.207f, 18.293f)
                    arcTo(1.0f, 1.0f, 315.0086516628379f, isMoreThanHalf = false, isPositiveArc = true, 15.207f, 19.707f)
                }
            }.build().also {
                _chevronLeft = it
            }
    }


private var _chevronLeft: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChevronLeftIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ChevronLeft.imageVector,
            contentDescription = null,
    )
}
