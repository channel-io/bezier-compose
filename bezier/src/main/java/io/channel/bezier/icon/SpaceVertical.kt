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

val BezierIcons.SpaceVertical: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _spaceVertical ?: ImageVector.Builder(
                    name = "SpaceVertical",
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
                    moveTo(12.707f, 21.293f)
                    arcTo(1.0f, 1.0f, 45.008651662838f, isMoreThanHalf = false, isPositiveArc = true, 11.293000000000001f, 21.293f)
                    lineTo(8.366000000000001f, 18.366f)
                    arcTo(0.8f, 0.8f, 134.96801042191746f, isMoreThanHalf = false, isPositiveArc = true, 8.93f, 17.0f)
                    lineTo(11.0f, 17.0f)
                    lineTo(11.0f, 7.0f)
                    lineTo(8.931f, 7.0f)
                    arcTo(0.8f, 0.8f, 90.02654147845973f, isMoreThanHalf = false, isPositiveArc = true, 8.366f, 5.634f)
                    lineTo(11.293f, 2.7070000000000003f)
                    arcTo(1.0f, 1.0f, 225.008651662838f, isMoreThanHalf = false, isPositiveArc = true, 12.706999999999999f, 2.7070000000000003f)
                    lineTo(15.633999999999999f, 5.634f)
                    arcTo(0.8f, 0.8f, 314.9680104219174f, isMoreThanHalf = false, isPositiveArc = true, 15.07f, 7.0f)
                    lineTo(13.0f, 7.0f)
                    lineTo(13.0f, 17.0f)
                    lineTo(15.068999999999999f, 17.0f)
                    arcTo(0.8f, 0.8f, 270.02654147845976f, isMoreThanHalf = false, isPositiveArc = true, 15.633999999999999f, 18.366f)
                    close()
                }
            }.build().also {
                _spaceVertical = it
            }
    }


private var _spaceVertical: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun SpaceVerticalIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.SpaceVertical.imageVector,
            contentDescription = null,
    )
}
