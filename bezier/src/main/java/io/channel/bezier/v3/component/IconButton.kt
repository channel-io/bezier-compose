package io.channel.bezier.v3.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.component.BezierText
import io.channel.bezier.icon.Plus
import io.channel.bezier.typography.BezierTypo

@Composable
fun IconButton(
        icon: BezierIcon,
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        size: IconButtonSize = IconButtonSize.Medium,
        variant: IconButtonVariant = IconButtonVariant.Ghost,
        isActive: Boolean = false,
        isLoading: Boolean = false,
        enabled: Boolean = true,
        contentDescription: String? = null,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val colorSpec = iconButtonColorSpec(variant)
    val isPressed by interactionSource.collectIsPressedAsState()
    val showOverlay = (isPressed || isActive) && variant == IconButtonVariant.Ghost
    val containerAlpha = if (enabled) 1f else 0.4f

    Box(
            modifier = modifier
                    .size(size.containerLength)
                    .graphicsLayer(alpha = containerAlpha)
                    .clip(CircleShape)
                    .then(
                            if (colorSpec.background != null) Modifier.background(colorSpec.background)
                            else Modifier,
                    )
                    .then(
                            if (showOverlay) Modifier.background(Color.Black.copy(alpha = 0.05f))
                            else Modifier,
                    )
                    .clickable(
                            interactionSource = interactionSource,
                            indication = null,
                            enabled = enabled && !isLoading,
                            onClick = onClick,
                    ),
            contentAlignment = Alignment.Center,
    ) {
        Icon(
                modifier = Modifier
                        .alpha(if (isLoading) 0f else 1f)
                        .size(size.iconLength),
                imageVector = icon.imageVector,
                tint = colorSpec.iconColor,
                contentDescription = contentDescription,
        )
        if (isLoading) {
            CircularProgressIndicator(
                    modifier = Modifier.size(size.spinnerLength),
                    color = colorSpec.iconColor,
                    backgroundColor = BezierTheme.colorsV3.borderNeutral,
                    strokeWidth = 2.dp,
            )
        }
    }
}

enum class IconButtonSize {
    Xsmall,
    Small,
    Medium,
    Large;

    internal val containerLength: Dp
        get() = when (this) {
            Xsmall -> 20.dp
            Small -> 24.dp
            Medium -> 32.dp
            Large -> 44.dp
        }

    internal val padding: Dp
        get() = when (this) {
            Xsmall -> 2.dp
            Small -> 4.dp
            Medium -> 6.dp
            Large -> 12.dp
        }

    internal val iconLength: Dp
        get() = containerLength - padding * 2

    internal val spinnerLength: Dp
        get() = when (this) {
            Xsmall -> 12.dp
            Small -> 14.dp
            Medium -> 16.dp
            Large -> 18.dp
        }
}

enum class IconButtonVariant {
    Ghost,
    Filled,
}

internal data class IconButtonColorSpec(
        val background: Color?,
        val iconColor: Color,
)

@Composable
internal fun iconButtonColorSpec(variant: IconButtonVariant): IconButtonColorSpec {
    val colors = BezierTheme.colorsV3
    return when (variant) {
        IconButtonVariant.Ghost -> IconButtonColorSpec(
                background = null,
                iconColor = colors.iconNeutral,
        )
        IconButtonVariant.Filled -> IconButtonColorSpec(
                background = colors.fillNeutralLight,
                iconColor = colors.iconNeutralHeavy,
        )
    }
}

@Composable
private fun pressedInteractionSource(): MutableInteractionSource {
    val source = remember { MutableInteractionSource() }
    LaunchedEffect(source) {
        source.emit(PressInteraction.Press(Offset.Zero))
    }
    return source
}

@Composable
private fun IconButtonMatrix(size: IconButtonSize, sizeLabel: String) {
    val labelColWidth = 88.dp
    val cellWidth = 96.dp

    BezierTheme {
        Column(
                modifier = Modifier
                        .background(BezierTheme.colorsV3.surface)
                        .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(modifier = Modifier.width(labelColWidth * 2))
                listOf("default", "pressed", "active", "disabled", "loading").forEach { stateLabel ->
                    Box(
                            modifier = Modifier.width(cellWidth),
                            contentAlignment = Alignment.Center,
                    ) {
                        BezierText(
                                text = stateLabel,
                                typo = BezierTypo.TextMedium,
                                color = BezierTheme.colorsV3.textNeutral,
                        )
                    }
                }
            }

            IconButtonVariant.values().forEachIndexed { variantIndex, variant ->
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                            modifier = Modifier.width(labelColWidth),
                            contentAlignment = Alignment.CenterStart,
                    ) {
                        if (variantIndex == 0) {
                            BezierText(
                                    text = sizeLabel,
                                    typo = BezierTypo.TextMedium,
                                    color = BezierTheme.colorsV3.textNeutral,
                            )
                        }
                    }
                    Box(
                            modifier = Modifier.width(labelColWidth),
                            contentAlignment = Alignment.CenterStart,
                    ) {
                        BezierText(
                                text = variant.name.lowercase(),
                                typo = BezierTypo.TextMedium,
                                color = BezierTheme.colorsV3.textNeutral,
                        )
                    }
                    IconButtonCell(cellWidth) {
                        IconButton(icon = BezierIcons.Plus, onClick = {}, size = size, variant = variant)
                    }
                    IconButtonCell(cellWidth) {
                        IconButton(icon = BezierIcons.Plus, onClick = {}, size = size, variant = variant, interactionSource = pressedInteractionSource())
                    }
                    IconButtonCell(cellWidth) {
                        IconButton(icon = BezierIcons.Plus, onClick = {}, size = size, variant = variant, isActive = true)
                    }
                    IconButtonCell(cellWidth) {
                        IconButton(icon = BezierIcons.Plus, onClick = {}, size = size, variant = variant, enabled = false)
                    }
                    IconButtonCell(cellWidth) {
                        IconButton(icon = BezierIcons.Plus, onClick = {}, size = size, variant = variant, isLoading = true)
                    }
                }
            }
        }
    }
}

@Composable
private fun IconButtonCell(width: Dp, content: @Composable () -> Unit) {
    Box(
            modifier = Modifier.width(width),
            contentAlignment = Alignment.Center,
    ) {
        content()
    }
}

@Preview(showBackground = true, widthDp = 700)
@Composable
private fun IconButtonMatrixXsmallPreview() = IconButtonMatrix(IconButtonSize.Xsmall, "xsmall")

@Preview(showBackground = true, widthDp = 700)
@Composable
private fun IconButtonMatrixSmallPreview() = IconButtonMatrix(IconButtonSize.Small, "small")

@Preview(showBackground = true, widthDp = 700)
@Composable
private fun IconButtonMatrixMediumPreview() = IconButtonMatrix(IconButtonSize.Medium, "medium")

@Preview(showBackground = true, widthDp = 700)
@Composable
private fun IconButtonMatrixLargePreview() = IconButtonMatrix(IconButtonSize.Large, "large")

@Preview(showBackground = true, widthDp = 700)
@Preview(showBackground = true, widthDp = 700, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun IconButtonMatrixMediumDarkPreview() = IconButtonMatrix(IconButtonSize.Medium, "medium")
