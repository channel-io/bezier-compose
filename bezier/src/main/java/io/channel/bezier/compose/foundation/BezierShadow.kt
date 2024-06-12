package io.channel.bezier.compose.foundation

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.node.*
import androidx.compose.ui.platform.InspectorInfo
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.compose.LocalColors

fun Modifier.bezierShadow(style: ShadowStyle, shape: Shape) = this.then(ShadowElement(style, shape))

enum class ShadowStyle {
    Shadow1,
    Shadow2,
    Shadow3,
    Shadow4,
    Shadow5,
    Shadow6,
}

private data class ShadowElement(
    private val shadowStyle: ShadowStyle,
    private val shape: Shape,
) : ModifierNodeElement<ShadowModifier>() {
    override fun create() = ShadowModifier(
        shadowStyle = shadowStyle,
        shape = shape,
    )

    override fun update(node: ShadowModifier) {
        node.shadowStyle = shadowStyle
        node.shape = shape
    }

    override fun InspectorInfo.inspectableProperties() {
        name = "shadow"
        properties["shadowStyle"] = shadowStyle
        properties["shape"] = shape
    }
}

private class ShadowModifier(
    var shadowStyle: ShadowStyle,
    var shape: Shape,
) : Modifier.Node(), DrawModifierNode, CompositionLocalConsumerModifierNode {
    private val transparentColor = 0x00000000

    override fun ContentDrawScope.draw() {
        val shadowInfo = shadowStyle.asShadowInfo()

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

    fun ShadowStyle.asShadowInfo(): ShadowInfo {
        val colors = currentValueOf(LocalColors)

        return when (this) {
            ShadowStyle.Shadow1 -> ShadowInfo(
                color = colors.shdwMedium,
                x = 0.dp,
                y = 1.dp,
                blur = 4.dp,
            )

            ShadowStyle.Shadow2 -> ShadowInfo(
                color = colors.shdwMedium,
                x = 0.dp,
                y = 2.dp,
                blur = 6.dp,
            )

            ShadowStyle.Shadow3 -> ShadowInfo(
                color = colors.shdwLarge,
                x = 0.dp,
                y = 4.dp,
                blur = 20.dp,
            )

            ShadowStyle.Shadow4 -> ShadowInfo(
                color = colors.shdwXlarge,
                x = 0.dp,
                y = 4.dp,
                blur = 24.dp,
            )

            ShadowStyle.Shadow5 -> ShadowInfo(
                color = colors.shdwXlarge,
                x = 0.dp,
                y = 6.dp,
                blur = 40.dp,
            )

            ShadowStyle.Shadow6 -> ShadowInfo(
                color = colors.shdwXlarge,
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
