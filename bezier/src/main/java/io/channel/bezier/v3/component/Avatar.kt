package io.channel.bezier.v3.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme
import io.channel.bezier.component.BezierText
import io.channel.bezier.shape.SmoothRoundedCornerShape
import io.channel.bezier.typography.BezierTypo

private const val AvatarRadiusFraction = 42

@Composable
fun Avatar(
        image: Painter,
        modifier: Modifier = Modifier,
        size: AvatarSize = AvatarSize.Size16,
        enabled: Boolean = true,
        showBorder: Boolean = false,
        status: AvatarStatusType? = null,
        contentDescription: String? = null,
) {
    val layout = size.layout
    val shape = SmoothRoundedCornerShape(percent = AvatarRadiusFraction)
    val containerAlpha = if (enabled) 1f else AvatarDisabledOpacity

    val borderModifier = if (showBorder) {
        Modifier.outsideBorder(
                color = BezierTheme.colorsV3.surface,
                borderWidth = layout.borderWidth,
                shape = shape,
        )
    } else {
        Modifier
    }

    Box(
            modifier = modifier
                    .size(layout.length)
                    .then(borderModifier)
                    .graphicsLayer(alpha = containerAlpha),
    ) {
        Image(
                modifier = Modifier
                        .size(layout.length)
                        .clip(shape),
                painter = image,
                contentDescription = contentDescription,
                contentScale = ContentScale.Crop,
        )

        if (status != null) {
            AvatarStatus(
                    type = status,
                    size = layout.statusSize,
                    modifier = Modifier.offset(x = layout.statusOffsetX, y = layout.statusOffsetY),
            )
        }
    }
}

private fun Modifier.outsideBorder(
        color: Color,
        borderWidth: Dp,
        shape: Shape,
) = drawBehind {
    val borderWidthPx = borderWidth.toPx()
    val grownSize = Size(
            width = size.width + borderWidthPx * 2,
            height = size.height + borderWidthPx * 2,
    )
    val outline = shape.createOutline(grownSize, layoutDirection, this)
    translate(left = -borderWidthPx, top = -borderWidthPx) {
        drawOutline(outline = outline, color = color)
    }
}

private const val AvatarDisabledOpacity = 0.4f

enum class AvatarSize {
    Size16,
    Size20,
    Size24,
    Size30,
    Size36,
    Size42,
    Size48,
    Size72,
    Size90,
    Size120,
    Size160;

    internal val layout: AvatarLayoutSpec
        get() = when (this) {
            Size16 -> AvatarLayoutSpec(16.dp, 1.dp, AvatarStatusSize.Small, 12.dp, 12.dp)
            Size20 -> AvatarLayoutSpec(20.dp, 1.dp, AvatarStatusSize.Small, 14.dp, 14.dp)
            Size24 -> AvatarLayoutSpec(24.dp, 1.5.dp, AvatarStatusSize.Small, 18.dp, 18.dp)
            Size30 -> AvatarLayoutSpec(30.dp, 1.5.dp, AvatarStatusSize.Medium, 21.dp, 20.dp)
            Size36 -> AvatarLayoutSpec(36.dp, 1.5.dp, AvatarStatusSize.Medium, 26.dp, 26.dp)
            Size42 -> AvatarLayoutSpec(42.dp, 2.dp, AvatarStatusSize.Medium, 32.dp, 32.dp)
            Size48 -> AvatarLayoutSpec(48.dp, 2.dp, AvatarStatusSize.Medium, 36.dp, 37.dp)
            Size72 -> AvatarLayoutSpec(72.dp, 2.5.dp, AvatarStatusSize.Large, 55.dp, 54.dp)
            Size90 -> AvatarLayoutSpec(90.dp, 3.dp, AvatarStatusSize.XLarge, 68.dp, 68.dp)
            Size120 -> AvatarLayoutSpec(120.dp, 3.5.dp, AvatarStatusSize.XLarge, 96.dp, 94.dp)
            Size160 -> AvatarLayoutSpec(160.dp, 4.dp, AvatarStatusSize.XLarge, 132.dp, 129.dp)
        }
}

internal data class AvatarLayoutSpec(
        val length: Dp,
        val borderWidth: Dp,
        val statusSize: AvatarStatusSize,
        val statusOffsetX: Dp,
        val statusOffsetY: Dp,
)

@Composable
private fun AvatarMatrix(
        enabled: Boolean,
        showBorder: Boolean,
        status: AvatarStatusType?,
) {
    val previewImage = ColorPainter(Color(0xFFB6CED6))

    BezierTheme {
        Column(
                modifier = Modifier
                        .background(BezierTheme.colorsV3.surfaceLow)
                        .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            AvatarSize.entries.forEach { size ->
                Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                ) {
                    Box(modifier = Modifier.size(width = 64.dp, height = 24.dp), contentAlignment = Alignment.CenterStart) {
                        BezierText(
                                text = size.name.removePrefix("Size"),
                                typo = BezierTypo.TextMedium,
                                color = BezierTheme.colorsV3.textNeutral,
                        )
                    }
                    Avatar(
                            image = previewImage,
                            size = size,
                            enabled = enabled,
                            showBorder = showBorder,
                            status = status,
                            contentDescription = "preview",
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 320, heightDp = 1200)
@Composable
private fun AvatarMatrixDefaultPreview() = AvatarMatrix(enabled = true, showBorder = false, status = null)

@Preview(showBackground = true, widthDp = 320, heightDp = 1200)
@Composable
private fun AvatarMatrixDisabledPreview() = AvatarMatrix(enabled = false, showBorder = false, status = null)

@Preview(showBackground = true, widthDp = 320, heightDp = 1200)
@Composable
private fun AvatarMatrixBorderStatusPreview() = AvatarMatrix(enabled = true, showBorder = true, status = AvatarStatusType.Online)

@Preview(showBackground = true, widthDp = 320, heightDp = 1200, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun AvatarMatrixDarkPreview() = AvatarMatrix(enabled = true, showBorder = true, status = AvatarStatusType.OnlineDnd)
