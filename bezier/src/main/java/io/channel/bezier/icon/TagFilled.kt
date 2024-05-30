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

val BezierIcons.TagFilled: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _tagFilled ?: ImageVector.Builder(
                    name = "TagFilled",
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
                    moveTo(13.0f, 2.51474f)
                    curveTo(12.7348f, 2.51474f, 12.4804f, 2.6201f, 12.2929f, 2.80763f)
                    lineTo(3.3934f, 11.7071f)
                    curveTo(2.22183f, 12.8787f, 2.22183f, 14.7782f, 3.3934f, 15.9498f)
                    lineTo(9.05025f, 21.6066f)
                    curveTo(10.2218f, 22.7782f, 12.1213f, 22.7782f, 13.2929f, 21.6066f)
                    lineTo(22.1924f, 12.7071f)
                    curveTo(22.3799f, 12.5196f, 22.4853f, 12.2652f, 22.4853f, 12.0f)
                    lineTo(22.4853f, 4.51474f)
                    curveTo(22.4853f, 3.41017f, 21.5899f, 2.51474f, 20.4853f, 2.51474f)
                    lineTo(13.0f, 2.51474f)
                    close()
                    moveTo(19.0f, 7.99997f)
                    curveTo(19.0f, 9.1053f, 18.1053f, 9.99997f, 17.0f, 9.99997f)
                    curveTo(15.896f, 9.99997f, 15.0f, 9.1053f, 15.0f, 7.99997f)
                    curveTo(15.0f, 6.89464f, 15.896f, 5.99997f, 17.0f, 5.99997f)
                    curveTo(18.1053f, 5.99997f, 19.0f, 6.89464f, 19.0f, 7.99997f)
                    close()
                }
            }.build().also {
                _tagFilled = it
            }
    }


private var _tagFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TagFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.TagFilled.imageVector,
            contentDescription = null,
    )
}