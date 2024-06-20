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

val BezierIcons.PersonSleep: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _personSleep ?: ImageVector.Builder(
                    name = "PersonSleep",
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
                    moveTo(13.5f, 7.5f)
                    arcTo(3.5f, 3.5f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 6.5f, 7.5f)
                    arcTo(3.5f, 3.5f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 7.5f)
                    moveTo(1.5f, 19.476f)
                    curveTo(1.773f, 15.302f, 5.25f, 12.0f, 9.5f, 12.0f)
                    curveTo(12.600999999999999f, 12.0f, 15.29f, 13.757f, 16.624f, 16.328f)
                    lineTo(15.463999999999999f, 17.72f)
                    arcTo(2.0f, 2.0f, 219.81030073587348f, isMoreThanHalf = false, isPositiveArc = false, 15.267999999999999f, 20.0f)
                    lineTo(2.009f, 20.0f)
                    arcTo(0.506f, 0.506f, 89.73724823514897f, isMoreThanHalf = false, isPositiveArc = true, 1.501f, 19.476f)
                    moveTo(17.0f, 12.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = false, 17.0f, 14.0f)
                    lineTo(19.865000000000002f, 14.0f)
                    lineTo(16.232000000000003f, 18.36f)
                    arcTo(1.0f, 1.0f, 219.79182473838915f, isMoreThanHalf = false, isPositiveArc = false, 17.0f, 20.0f)
                    lineTo(22.0f, 20.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 22.0f, 18.0f)
                    lineTo(19.134999999999998f, 18.0f)
                    lineTo(22.767999999999997f, 13.64f)
                    arcTo(1.0f, 1.0f, 39.791824738389174f, isMoreThanHalf = false, isPositiveArc = false, 22.0f, 12.0f)
                    close()
                }
            }.build().also {
                _personSleep = it
            }
    }


private var _personSleep: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun PersonSleepIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.PersonSleep.imageVector,
            contentDescription = null,
    )
}
