package io.channel.bezier.compose.foundation

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode
import androidx.compose.ui.node.DrawModifierNode
import androidx.compose.ui.node.ModifierNodeElement
import androidx.compose.ui.node.currentValueOf
import androidx.compose.ui.platform.InspectorInfo
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.LocalColorsV2

fun Modifier.bezierShadow(style: BezierShadowStyle, shape: Shape) = this.then(ShadowElement(style, shape))

enum class BezierShadowStyle {
    Shadow1,
    Shadow2,
    Shadow3,
    Shadow4,
    Shadow5,
    Shadow6,
}

private data class ShadowElement(
        private val bezierShadowStyle: BezierShadowStyle,
        private val shape: Shape,
) : ModifierNodeElement<ShadowModifier>() {
    override fun create() = ShadowModifier(
            bezierShadowStyle = bezierShadowStyle,
            shape = shape,
    )

    override fun update(node: ShadowModifier) {
        node.bezierShadowStyle = bezierShadowStyle
        node.shape = shape
    }

    override fun InspectorInfo.inspectableProperties() {
        name = "shadow"
        properties["shadowStyle"] = bezierShadowStyle
        properties["shape"] = shape
    }
}

private class ShadowModifier(
        var bezierShadowStyle: BezierShadowStyle,
        var shape: Shape,
) : Modifier.Node(), DrawModifierNode, CompositionLocalConsumerModifierNode {
    private val transparentColor = 0x00000000

    override fun ContentDrawScope.draw() {
        val shadowInfo = bezierShadowStyle.asShadowInfo()

        drawIntoCanvas { canvas ->
            val paint = Paint()
            val frameworkPaint = paint.asFrameworkPaint()

            frameworkPaint.color = transparentColor
            frameworkPaint.setShadowLayer(
                    shadowInfo.blur.toPx(),
                    shadowInfo.x.toPx(),
                    shadowInfo.y.toPx(),
                    shadowInfo.color.toArgb(),
            )

            val outline = shape.createOutline(size, layoutDirection, this)

            canvas.drawOutline(outline, paint)
        }

        drawContent()
    }

    fun BezierShadowStyle.asShadowInfo(): ShadowInfo {
        val colorSchemes = currentValueOf(LocalColorsV2)

        return when (this) {
            BezierShadowStyle.Shadow1 -> ShadowInfo(
                    color = colorSchemes.shadowMedium.color,
                    x = 0.dp,
                    y = 1.dp,
                    blur = 4.dp,
            )

            BezierShadowStyle.Shadow2 -> ShadowInfo(
                    color = colorSchemes.shadowMedium.color,
                    x = 0.dp,
                    y = 2.dp,
                    blur = 6.dp,
            )

            BezierShadowStyle.Shadow3 -> ShadowInfo(
                    color = colorSchemes.shadowLarge.color,
                    x = 0.dp,
                    y = 4.dp,
                    blur = 20.dp,
            )

            BezierShadowStyle.Shadow4 -> ShadowInfo(
                    color = colorSchemes.shadowXlarge.color,
                    x = 0.dp,
                    y = 4.dp,
                    blur = 24.dp,
            )

            BezierShadowStyle.Shadow5 -> ShadowInfo(
                    color = colorSchemes.shadowXlarge.color,
                    x = 0.dp,
                    y = 6.dp,
                    blur = 40.dp,
            )

            BezierShadowStyle.Shadow6 -> ShadowInfo(
                    color = colorSchemes.shadowXlarge.color,
                    x = 0.dp,
                    y = 12.dp,
                    blur = 60.dp,
            )
        }
    }

    data class ShadowInfo(
            val color: Color,
            val x: Dp,
            val y: Dp,
            val blur: Dp,
    )
}
