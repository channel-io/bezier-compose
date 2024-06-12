@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons

val BezierIcons.Code: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _code ?: ImageVector.Builder(
                    name = "Code",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                ) {
                    moveTo(15.3939f, 4.08087f)
                    curveTo(15.9015f, 4.29842f, 16.1367f, 4.8863f, 15.9191f, 5.39393f)
                    lineTo(9.9191f, 19.3939f)
                    curveTo(9.70154f, 19.9016f, 9.11366f, 20.1367f, 8.60603f, 19.9192f)
                    curveTo(8.0984f, 19.7016f, 7.86325f, 19.1137f, 8.08081f, 18.6061f)
                    lineTo(14.0808f, 4.60609f)
                    curveTo(14.2984f, 4.09846f, 14.8862f, 3.86331f, 15.3939f, 4.08087f)
                    close()
                    moveTo(8.20698f, 4.29289f)
                    curveTo(8.59751f, 4.68342f, 8.59751f, 5.31658f, 8.20698f, 5.70711f)
                    lineTo(4.91409f, 9.0f)
                    lineTo(8.20698f, 12.2929f)
                    curveTo(8.59751f, 12.6834f, 8.59751f, 13.3166f, 8.20698f, 13.7071f)
                    curveTo(7.81646f, 14.0976f, 7.1833f, 14.0976f, 6.79277f, 13.7071f)
                    lineTo(2.79277f, 9.70711f)
                    curveTo(2.40225f, 9.31658f, 2.40225f, 8.68342f, 2.79277f, 8.29289f)
                    lineTo(6.79277f, 4.29289f)
                    curveTo(7.1833f, 3.90237f, 7.81646f, 3.90237f, 8.20698f, 4.29289f)
                    close()
                    moveTo(17.207f, 10.2929f)
                    curveTo(16.8165f, 9.90237f, 16.1834f, 9.90237f, 15.7928f, 10.2929f)
                    curveTo(15.4023f, 10.6834f, 15.4023f, 11.3166f, 15.7928f, 11.7071f)
                    lineTo(19.0857f, 15.0f)
                    lineTo(15.7928f, 18.2929f)
                    curveTo(15.4023f, 18.6834f, 15.4023f, 19.3166f, 15.7928f, 19.7071f)
                    curveTo(16.1834f, 20.0976f, 16.8165f, 20.0976f, 17.207f, 19.7071f)
                    lineTo(21.207f, 15.7071f)
                    curveTo(21.3946f, 15.5196f, 21.4999f, 15.2652f, 21.4999f, 15.0f)
                    curveTo(21.4999f, 14.7348f, 21.3946f, 14.4804f, 21.207f, 14.2929f)
                    lineTo(17.207f, 10.2929f)
                    close()
                }
            }.build().also {
                _code = it
            }
    }


private var _code: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CodeIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Code.imageVector,
            contentDescription = null,
    )
}
