package io.channel.bezier.v3.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.icon.Plus

@Composable
fun Button(
        text: String,
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        size: ButtonSize = ButtonSize.Medium,
        variant: ButtonVariant = ButtonVariant.Filled,
        semantic: ButtonSemantic = ButtonSemantic.Primary,
        isActive: Boolean = false,
        isLoading: Boolean = false,
        enabled: Boolean = true,
        leadingIcon: BezierIcon? = null,
        trailingIcon: BezierIcon? = null,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {

    val spec = size.spec
    val colorSpec = buttonColorSpec(variant, semantic)
    val isPressed by interactionSource.collectIsPressedAsState()
    val showOverlay = (isPressed || isActive) && variant != ButtonVariant.Filled
    val containerAlpha = if (enabled) 1f else 0.4f

    Box(
            modifier = modifier
                    .height(spec.height)
                    .defaultMinSize(minWidth = spec.minWidth)
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
                    .then(
                            if (colorSpec.border != null) Modifier.border(width = 1.dp, color = colorSpec.border, shape = CircleShape)
                            else Modifier,
                    )
                    .clickable(
                            interactionSource = interactionSource,
                            indication = null,
                            enabled = enabled && !isLoading,
                            onClick = onClick,
                    )
                    .padding(horizontal = spec.horizontalPadding),
            contentAlignment = Alignment.Center,
    ) {
        Row(
                modifier = Modifier.alpha(if (isLoading) 0f else 1f),
                horizontalArrangement = Arrangement.spacedBy(spec.gap),
                verticalAlignment = Alignment.CenterVertically,
        ) {
            if (leadingIcon != null) {
                Icon(
                        modifier = Modifier.size(ButtonIconLength),
                        imageVector = leadingIcon.imageVector,
                        tint = colorSpec.foreground,
                        contentDescription = null,
                )
            }
            Box(
                    modifier = Modifier.padding(horizontal = spec.textInnerHorizontalPadding),
            ) {
                Text(
                        text = text,
                        color = colorSpec.foreground,
                        fontSize = spec.fontSize,
                        lineHeight = spec.lineHeight,
                        fontWeight = FontWeight.SemiBold,
                        letterSpacing = 0.sp,
                )
            }
            if (trailingIcon != null) {
                Icon(
                        modifier = Modifier.size(ButtonIconLength),
                        imageVector = trailingIcon.imageVector,
                        tint = colorSpec.foreground,
                        contentDescription = null,
                )
            }
        }
        if (isLoading) {
            CircularProgressIndicator(
                    modifier = Modifier.size(ButtonIconLength),
                    color = colorSpec.foreground,
                    strokeWidth = 2.dp,
            )
        }
    }
}

private val ButtonIconLength: Dp = 16.dp

enum class ButtonSize {
    Xsmall,
    Small,
    Medium,
    Large,
    Xlarge;

    internal val spec: ButtonLayoutSpec
        get() = when (this) {
            Xsmall -> ButtonLayoutSpec(
                    height = 24.dp,
                    minWidth = 20.dp,
                    horizontalPadding = 4.dp,
                    gap = 0.dp,
                    textInnerHorizontalPadding = 3.dp,
                    fontSize = 13.sp,
                    lineHeight = 18.sp,
            )

            Small -> ButtonLayoutSpec(
                    height = 30.dp,
                    minWidth = 24.dp,
                    horizontalPadding = 6.dp,
                    gap = 0.dp,
                    textInnerHorizontalPadding = 3.dp,
                    fontSize = 14.sp,
                    lineHeight = 18.sp,
            )

            Medium -> ButtonLayoutSpec(
                    height = 40.dp,
                    minWidth = 36.dp,
                    horizontalPadding = 10.dp,
                    gap = 2.dp,
                    textInnerHorizontalPadding = 4.dp,
                    fontSize = 15.sp,
                    lineHeight = 20.sp,
            )

            Large -> ButtonLayoutSpec(
                    height = 44.dp,
                    minWidth = 44.dp,
                    horizontalPadding = 12.dp,
                    gap = 2.dp,
                    textInnerHorizontalPadding = 4.dp,
                    fontSize = 16.sp,
                    lineHeight = 20.sp,
            )

            Xlarge -> ButtonLayoutSpec(
                    height = 54.dp,
                    minWidth = 54.dp,
                    horizontalPadding = 20.dp,
                    gap = 2.dp,
                    textInnerHorizontalPadding = 4.dp,
                    fontSize = 16.sp,
                    lineHeight = 20.sp,
            )
        }
}

enum class ButtonVariant {
    Filled,
    Outlined,
    Ghost,
}

enum class ButtonSemantic {
    Primary,
    Secondary,
    Destructive,
}

internal data class ButtonLayoutSpec(
        val height: Dp,
        val minWidth: Dp,
        val horizontalPadding: Dp,
        val gap: Dp,
        val textInnerHorizontalPadding: Dp,
        val fontSize: TextUnit,
        val lineHeight: TextUnit,
)

internal data class ButtonColorSpec(
        val background: Color?,
        val foreground: Color,
        val border: Color?,
)

@Composable
internal fun buttonColorSpec(variant: ButtonVariant, semantic: ButtonSemantic): ButtonColorSpec {
    val colors = BezierTheme.colorsV3
    return when (variant) {
        ButtonVariant.Filled -> when (semantic) {
            ButtonSemantic.Primary -> ButtonColorSpec(
                    background = colors.fillNeutralHeaviest,
                    foreground = colors.textInverse,
                    border = null,
            )

            ButtonSemantic.Secondary -> ButtonColorSpec(
                    background = colors.fillNeutralLight,
                    foreground = colors.textNeutral,
                    border = null,
            )

            ButtonSemantic.Destructive -> ButtonColorSpec(
                    background = colors.fillAccentRedHeavier,
                    foreground = colors.textInverse,
                    border = null,
            )
        }

        ButtonVariant.Outlined -> when (semantic) {
            ButtonSemantic.Primary -> ButtonColorSpec(
                    background = null,
                    foreground = colors.textNeutralHeaviest,
                    border = colors.borderNeutral,
            )

            ButtonSemantic.Secondary -> ButtonColorSpec(
                    background = null,
                    foreground = colors.textNeutralLight,
                    border = colors.borderNeutral,
            )

            ButtonSemantic.Destructive -> ButtonColorSpec(
                    background = null,
                    foreground = colors.textAccentRed,
                    border = colors.borderNeutral,
            )
        }

        ButtonVariant.Ghost -> when (semantic) {
            ButtonSemantic.Primary -> ButtonColorSpec(
                    background = null,
                    foreground = colors.textNeutralLight,
                    border = null,
            )

            ButtonSemantic.Secondary -> ButtonColorSpec(
                    background = null,
                    foreground = colors.textNeutralLighter,
                    border = null,
            )

            ButtonSemantic.Destructive -> ButtonColorSpec(
                    background = null,
                    foreground = colors.textAccentRed,
                    border = null,
            )
        }
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
private fun ButtonMatrix(size: ButtonSize, sizeLabel: String) {
    val labelColWidth = 88.dp
    val cellWidth = 132.dp

    BezierTheme {
        Column(
                modifier = Modifier
                        .background(BezierTheme.colorsV3.surface)
                        .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(modifier = Modifier.width(labelColWidth * 3))
                listOf("default", "pressed", "active", "disabled", "loading").forEach { stateLabel ->
                    Box(
                            modifier = Modifier.width(cellWidth),
                            contentAlignment = Alignment.Center,
                    ) {
                        Text(text = stateLabel, color = BezierTheme.colorsV3.textNeutral)
                    }
                }
            }

            ButtonVariant.values().forEachIndexed { variantIndex, variant ->
                ButtonSemantic.values().forEachIndexed { semanticIndex, semantic ->
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Box(
                                modifier = Modifier.width(labelColWidth),
                                contentAlignment = Alignment.CenterStart,
                        ) {
                            if (variantIndex == 0 && semanticIndex == 0) {
                                Text(
                                        text = sizeLabel,
                                        color = BezierTheme.colorsV3.textNeutral,
                                        fontWeight = FontWeight.Bold,
                                )
                            }
                        }
                        Box(
                                modifier = Modifier.width(labelColWidth),
                                contentAlignment = Alignment.CenterStart,
                        ) {
                            if (semanticIndex == 0) {
                                Text(
                                        text = variant.name.lowercase(),
                                        color = BezierTheme.colorsV3.textNeutral,
                                )
                            }
                        }
                        Box(
                                modifier = Modifier.width(labelColWidth),
                                contentAlignment = Alignment.CenterStart,
                        ) {
                            Text(
                                    text = semantic.name.lowercase(),
                                    color = BezierTheme.colorsV3.textNeutral,
                            )
                        }
                        ButtonStateCell(cellWidth) {
                            Button(
                                    text = "Label",
                                    onClick = {},
                                    size = size,
                                    variant = variant,
                                    semantic = semantic,
                                    leadingIcon = BezierIcons.Plus,
                                    trailingIcon = BezierIcons.Plus,
                            )
                        }
                        ButtonStateCell(cellWidth) {
                            Button(
                                    text = "Label",
                                    onClick = {},
                                    size = size,
                                    variant = variant,
                                    semantic = semantic,
                                    leadingIcon = BezierIcons.Plus,
                                    trailingIcon = BezierIcons.Plus,
                                    interactionSource = pressedInteractionSource(),
                            )
                        }
                        ButtonStateCell(cellWidth) {
                            Button(
                                    text = "Label",
                                    onClick = {},
                                    size = size,
                                    variant = variant,
                                    semantic = semantic,
                                    leadingIcon = BezierIcons.Plus,
                                    trailingIcon = BezierIcons.Plus,
                                    isActive = true,
                            )
                        }
                        ButtonStateCell(cellWidth) {
                            Button(
                                    text = "Label",
                                    onClick = {},
                                    size = size,
                                    variant = variant,
                                    semantic = semantic,
                                    leadingIcon = BezierIcons.Plus,
                                    trailingIcon = BezierIcons.Plus,
                                    enabled = false,
                            )
                        }
                        ButtonStateCell(cellWidth) {
                            Button(
                                    text = "Label",
                                    onClick = {},
                                    size = size,
                                    variant = variant,
                                    semantic = semantic,
                                    leadingIcon = BezierIcons.Plus,
                                    trailingIcon = BezierIcons.Plus,
                                    isLoading = true,
                            )
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun ButtonStateCell(width: Dp, content: @Composable () -> Unit) {
    Box(
            modifier = Modifier.width(width),
            contentAlignment = Alignment.Center,
    ) {
        content()
    }
}

@Preview(showBackground = true, widthDp = 1000)
@Composable
private fun ButtonMatrixXsmallPreview() = ButtonMatrix(ButtonSize.Xsmall, "xsmall")

@Preview(showBackground = true, widthDp = 1000)
@Composable
private fun ButtonMatrixSmallPreview() = ButtonMatrix(ButtonSize.Small, "small")

@Preview(showBackground = true, widthDp = 1000)
@Composable
private fun ButtonMatrixMediumPreview() = ButtonMatrix(ButtonSize.Medium, "medium")

@Preview(showBackground = true, widthDp = 1000)
@Composable
private fun ButtonMatrixLargePreview() = ButtonMatrix(ButtonSize.Large, "large")

@Preview(showBackground = true, widthDp = 1000)
@Composable
private fun ButtonMatrixXlargePreview() = ButtonMatrix(ButtonSize.Xlarge, "xlarge")

@Preview(showBackground = true, widthDp = 1000)
@Preview(showBackground = true, widthDp = 1000, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun ButtonMatrixMediumDarkPreview() = ButtonMatrix(ButtonSize.Medium, "medium")
