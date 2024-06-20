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

val BezierIcons.Snooze: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _snooze ?: ImageVector.Builder(
                    name = "Snooze",
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
                    moveTo(6.343f, 0.707f)
                    arcTo(1.0f, 1.0f, 315.00865166283796f, isMoreThanHalf = false, isPositiveArc = true, 6.343f, 2.121f)
                    lineTo(3.515f, 4.95f)
                    arcTo(1.0f, 1.0f, 44.97974698581593f, isMoreThanHalf = false, isPositiveArc = true, 2.1f, 3.536f)
                    lineTo(4.93f, 0.707f)
                    arcTo(1.0f, 1.0f, 225.008651662838f, isMoreThanHalf = false, isPositiveArc = true, 6.343999999999999f, 0.707f)
                    moveTo(17.658f, 0.707f)
                    arcTo(1.0f, 1.0f, 225.0086516628379f, isMoreThanHalf = false, isPositiveArc = true, 19.072000000000003f, 0.707f)
                    lineTo(21.9f, 3.536f)
                    arcTo(1.0f, 1.0f, 315.99574461357713f, isMoreThanHalf = false, isPositiveArc = true, 20.485999999999997f, 4.95f)
                    lineTo(17.657f, 2.12f)
                    arcTo(1.0f, 1.0f, 135.008651662838f, isMoreThanHalf = false, isPositiveArc = true, 17.657f, 0.7060000000000002f)
                    moveTo(4.0f, 12.021f)
                    arcTo(8.0f, 8.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = false, 20.0f, 12.021f)
                    arcTo(8.0f, 8.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 4.0f, 12.021f)
                    moveTo(12.0f, 2.021000000000001f)
                    curveTo(6.477f, 2.021000000000001f, 2.0f, 6.498000000000001f, 2.0f, 12.021f)
                    curveTo(2.0f, 17.544f, 6.477f, 22.021f, 12.0f, 22.021f)
                    curveTo(17.523f, 22.021f, 22.0f, 17.544f, 22.0f, 12.021f)
                    curveTo(22.0f, 6.498000000000001f, 17.523f, 2.021000000000001f, 12.0f, 2.021000000000001f)
                    moveTo(12.0f, 6.021000000000001f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 13.0f, 7.021000000000001f)
                    lineTo(13.0f, 11.336000000000002f)
                    lineTo(15.64f, 12.688000000000002f)
                    arcTo(1.0f, 1.0f, 297.1287666630611f, isMoreThanHalf = false, isPositiveArc = true, 14.728f, 14.468000000000002f)
                    lineTo(11.544f, 12.838000000000001f)
                    arcTo(1.0f, 1.0f, 117.12929445141671f, isMoreThanHalf = false, isPositiveArc = true, 11.0f, 11.948f)
                    lineTo(11.0f, 7.02f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 12.0f, 6.02f)
                }
            }.build().also {
                _snooze = it
            }
    }


private var _snooze: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun SnoozeIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Snooze.imageVector,
            contentDescription = null,
    )
}
