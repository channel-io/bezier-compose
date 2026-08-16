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
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.dropShadow
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.shadow.Shadow
import androidx.compose.ui.layout.boundsInWindow
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.IntRect
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.roundToIntRect
import androidx.compose.ui.window.Popup
import androidx.compose.ui.window.PopupPositionProvider
import androidx.compose.ui.window.PopupProperties
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.component.BezierText
import io.channel.bezier.icon.Plus
import io.channel.bezier.icon.Trash
import io.channel.bezier.interaction.BezierComponentInteraction
import io.channel.bezier.typography.BezierTypo
import io.channel.bezier.typography.BezierWeight

@Composable
fun DropdownMenu(
        expanded: Boolean,
        onDismissRequest: () -> Unit,
        modifier: Modifier = Modifier,
        trigger: @Composable () -> Unit,
        content: @Composable ColumnScope.() -> Unit,
) {
    var anchorBounds by remember { mutableStateOf(IntRect.Zero) }

    Box(
            modifier = modifier.onGloballyPositioned {
                anchorBounds = it.boundsInWindow().roundToIntRect()
            },
    ) {
        trigger()

        if (expanded) {
            val density = LocalDensity.current
            val layoutDirection = LocalLayoutDirection.current
            val containerSize = LocalWindowInfo.current.containerSize
            val safeDrawing = WindowInsets.safeDrawing
            val topInset = safeDrawing.getTop(density)
            val bottomInset = safeDrawing.getBottom(density)
            val leftInset = safeDrawing.getLeft(density, layoutDirection)
            val rightInset = safeDrawing.getRight(density, layoutDirection)

            val positionProvider = remember(
                    density,
                    containerSize,
                    topInset,
                    bottomInset,
                    leftInset,
                    rightInset,
            ) {
                DropdownMenuPositionProvider(
                        density = density,
                        containerSize = containerSize,
                        topInset = topInset,
                        bottomInset = bottomInset,
                        leftInset = leftInset,
                        rightInset = rightInset,
                )
            }
            val maxHeight = remember(anchorBounds, containerSize, topInset, bottomInset, density) {
                with(density) {
                    val spaceBelow = containerSize.height - bottomInset - anchorBounds.bottom
                    val spaceAbove = anchorBounds.top - topInset
                    val available = maxOf(spaceBelow, spaceAbove)
                    (available.toDp() - OverlayTriggerGap - OverlayScreenMargin).coerceAtLeast(0.dp)
                }
            }

            Popup(
                    popupPositionProvider = positionProvider,
                    onDismissRequest = onDismissRequest,
                    properties = PopupProperties(focusable = true),
            ) {
                DropdownMenuOverlay(
                        maxHeight = maxHeight,
                        content = content,
                )
            }
        }
    }
}

@Composable
private fun DropdownMenuOverlay(
        maxHeight: Dp,
        modifier: Modifier = Modifier,
        content: @Composable ColumnScope.() -> Unit,
) {
    val elevationColor = BezierTheme.colorsV3.elevationLarge
    val shadow = remember(elevationColor) {
        Shadow(
                radius = OverlayShadowRadius,
                color = elevationColor,
                spread = 0.dp,
                offset = DpOffset(0.dp, OverlayShadowOffsetY),
        )
    }

    Column(
            modifier = modifier
                    .widthIn(min = OverlayMinWidth, max = OverlayMaxWidth)
                    .width(IntrinsicSize.Max)
                    .heightIn(max = maxHeight)
                    .dropShadow(
                            shape = OverlayShape,
                            shadow = shadow,
                    )
                    .clip(OverlayShape)
                    .background(BezierTheme.colorsV3.surfaceHighest)
                    .verticalScroll(rememberScrollState())
                    .padding(OverlayPadding),
            content = content,
    )
}

@Composable
fun DropdownMenuGroup(
        modifier: Modifier = Modifier,
        label: String? = null,
        showDivider: Boolean = false,
        content: @Composable ColumnScope.() -> Unit,
) {
    Column(modifier = modifier.fillMaxWidth()) {
        if (label != null) {
            Row(
                    modifier = Modifier
                            .fillMaxWidth()
                            .heightIn(min = GroupLabelMinHeight)
                            .padding(horizontal = GroupLabelHorizontalPadding),
                    verticalAlignment = Alignment.CenterVertically,
            ) {
                BezierText(
                        text = label,
                        typo = BezierTypo.TextMedium,
                        weight = BezierWeight.Bold,
                        color = BezierTheme.colorsV3.textNeutralLighter,
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 1,
                )
            }
        }

        content()

        if (showDivider) {
            Divider()
        }
    }
}

@Composable
fun DropdownMenuItem(
        label: String,
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        variant: DropdownMenuItemVariant = DropdownMenuItemVariant.Neutral,
        enabled: Boolean = true,
        description: String? = null,
        leadingIcon: BezierIcon? = null,
        leadingContent: (@Composable () -> Unit)? = null,
        centerSlot: (@Composable () -> Unit)? = null,
        trailingContent: (@Composable () -> Unit)? = null,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val hasLeading = leadingContent != null || leadingIcon != null
    val isPressed = interactionSource.collectIsPressedAsState()
    val pressedColor = BezierTheme.colorsV3.fillNeutralLighter

    Row(
            modifier = modifier
                    .fillMaxWidth()
                    .heightIn(min = ItemMinHeight)
                    .then(
                            if (enabled) Modifier
                            else Modifier.graphicsLayer(alpha = ItemDisabledAlpha),
                    )
                    .clip(ItemShape)
                    .drawBehind {
                        if (isPressed.value) {
                            drawRoundRect(
                                    color = pressedColor,
                                    cornerRadius = CornerRadius(ItemCornerRadius.toPx()),
                            )
                        }
                    }
                    .clickable(
                            interactionSource = interactionSource,
                            indication = null,
                            enabled = enabled,
                            onClick = {
                                BezierComponentInteraction.notify("DropdownMenuItem", "V3", label)
                                onClick()
                            },
                    )
                    .padding(
                            horizontal = ItemHorizontalPadding,
                            vertical = ItemVerticalPadding,
                    ),
            horizontalArrangement = Arrangement.spacedBy(ItemGap),
            verticalAlignment = Alignment.CenterVertically,
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(if (hasLeading) ItemGap else 0.dp),
                    verticalAlignment = Alignment.CenterVertically,
            ) {
                if (leadingContent != null) {
                    Box(modifier = Modifier.size(ItemLeadingContentSize)) {
                        leadingContent()
                    }
                } else if (leadingIcon != null) {
                    Icon(
                            modifier = Modifier.size(ItemLeadingContentSize),
                            imageVector = leadingIcon.imageVector,
                            tint = variant.iconColor(),
                            contentDescription = null,
                    )
                }

                Row(
                        modifier = Modifier.weight(1f),
                        horizontalArrangement = Arrangement.spacedBy(ItemLabelRowGap),
                        verticalAlignment = Alignment.CenterVertically,
                ) {
                    BezierText(
                            text = label,
                            typo = BezierTypo.TextXLarge,
                            color = variant.textColor(),
                            overflow = TextOverflow.Ellipsis,
                            maxLines = 1,
                            modifier = Modifier.weight(1f, fill = false),
                    )

                    if (centerSlot != null) {
                        centerSlot()
                    }
                }
            }

            if (description != null) {
                BezierText(
                        text = description,
                        typo = BezierTypo.CaptionMedium,
                        color = BezierTheme.colorsV3.textNeutralLighter,
                        modifier = Modifier
                                .fillMaxWidth()
                                .padding(start = if (hasLeading) ItemDescriptionIndent else 0.dp),
                )
            }
        }

        if (trailingContent != null) {
            trailingContent()
        }
    }
}

enum class DropdownMenuItemVariant {
    Neutral,
    Destructive,
}

@Composable
private fun DropdownMenuItemVariant.textColor(): Color = when (this) {
    DropdownMenuItemVariant.Neutral -> BezierTheme.colorsV3.textNeutral
    DropdownMenuItemVariant.Destructive -> BezierTheme.colorsV3.textAccentRed
}

@Composable
private fun DropdownMenuItemVariant.iconColor(): Color = when (this) {
    DropdownMenuItemVariant.Neutral -> BezierTheme.colorsV3.iconNeutralHeavy
    DropdownMenuItemVariant.Destructive -> BezierTheme.colorsV3.iconAccentRed
}

private class DropdownMenuPositionProvider(
        private val density: Density,
        private val containerSize: IntSize,
        private val topInset: Int,
        private val bottomInset: Int,
        private val leftInset: Int,
        private val rightInset: Int,
) : PopupPositionProvider {
    override fun calculatePosition(
            anchorBounds: IntRect,
            windowSize: IntSize,
            layoutDirection: LayoutDirection,
            popupContentSize: IntSize,
    ): IntOffset {
        val gap = with(density) { OverlayTriggerGap.roundToPx() }
        val margin = with(density) { OverlayScreenMargin.roundToPx() }

        val leftLimit = leftInset + margin
        val rightLimit = containerSize.width - rightInset - margin
        val startX = if (layoutDirection == LayoutDirection.Ltr) {
            anchorBounds.left
        } else {
            anchorBounds.right - popupContentSize.width
        }
        val maxX = (rightLimit - popupContentSize.width).coerceAtLeast(leftLimit)
        val x = startX.coerceIn(leftLimit, maxX)

        val topLimit = topInset + margin
        val bottomLimit = containerSize.height - bottomInset - margin
        val below = anchorBounds.bottom + gap
        val above = anchorBounds.top - gap - popupContentSize.height
        val fitsBelow = below + popupContentSize.height <= bottomLimit
        val maxY = (bottomLimit - popupContentSize.height).coerceAtLeast(topLimit)
        val y = (if (fitsBelow || above < topLimit) below else above).coerceIn(topLimit, maxY)

        return IntOffset(x, y)
    }
}

private val OverlayMinWidth: Dp = 160.dp
private val OverlayMaxWidth: Dp = 280.dp
private val OverlayPadding: Dp = 10.dp
private val OverlayCornerRadius: Dp = 32.dp
private val OverlayShadowRadius: Dp = 20.dp
private val OverlayShadowOffsetY: Dp = 4.dp
private val OverlayTriggerGap: Dp = 8.dp
private val OverlayScreenMargin: Dp = 16.dp
private val OverlayShape = RoundedCornerShape(OverlayCornerRadius)

private val GroupLabelMinHeight: Dp = 32.dp
private val GroupLabelHorizontalPadding: Dp = 10.dp

private val ItemMinHeight: Dp = 40.dp
private val ItemHorizontalPadding: Dp = 10.dp
private val ItemVerticalPadding: Dp = 6.dp
private val ItemGap: Dp = 10.dp
private val ItemLabelRowGap: Dp = 4.dp
private val ItemLeadingContentSize: Dp = 24.dp
private val ItemDescriptionIndent: Dp = 34.dp
private val ItemCornerRadius: Dp = 16.dp
private val ItemDisabledAlpha: Float = 0.4f
private val ItemShape = RoundedCornerShape(ItemCornerRadius)

private val PreviewOverlayMaxHeight: Dp = 400.dp

@Composable
private fun DropdownMenuPreviewContent() {
    BezierTheme {
        Column(
                modifier = Modifier
                        .fillMaxSize()
                        .background(BezierTheme.colorsV3.surfaceLow)
                        .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(24.dp),
        ) {
            DropdownMenuOverlay(maxHeight = PreviewOverlayMaxHeight) {
                DropdownMenuItem(label = "Edit", onClick = {})
                DropdownMenuItem(
                        label = "Pressed",
                        onClick = {},
                        interactionSource = pressedInteractionSource(),
                )
                DropdownMenuItem(label = "Disabled", onClick = {}, enabled = false)
            }

            DropdownMenuOverlay(maxHeight = PreviewOverlayMaxHeight) {
                DropdownMenuGroup(label = "Group Label", showDivider = true) {
                    DropdownMenuItem(
                            label = "With icon",
                            onClick = {},
                            leadingIcon = BezierIcons.Plus,
                    )
                    DropdownMenuItem(
                            label = "With description",
                            description = "Description text",
                            onClick = {},
                            leadingIcon = BezierIcons.Plus,
                            centerSlot = { PreviewCenterSlot() },
                            trailingContent = { PreviewTrailingContent() },
                    )
                    DropdownMenuItem(
                            label = "Custom leading",
                            onClick = {},
                            leadingContent = { PreviewLeadingContent() },
                    )
                }

                DropdownMenuGroup {
                    DropdownMenuItem(
                            label = "Delete",
                            onClick = {},
                            variant = DropdownMenuItemVariant.Destructive,
                            leadingIcon = BezierIcons.Trash,
                    )
                    DropdownMenuItem(
                            label = "Delete pressed",
                            onClick = {},
                            variant = DropdownMenuItemVariant.Destructive,
                            leadingIcon = BezierIcons.Trash,
                            interactionSource = pressedInteractionSource(),
                    )
                    DropdownMenuItem(
                            label = "Delete disabled",
                            onClick = {},
                            enabled = false,
                            variant = DropdownMenuItemVariant.Destructive,
                            leadingIcon = BezierIcons.Trash,
                    )
                }
            }
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
private fun PreviewLeadingContent() {
    Box(
            modifier = Modifier
                    .fillMaxSize()
                    .clip(CircleShape)
                    .background(BezierTheme.colorsV3.fillNeutral),
    )
}

@Composable
private fun PreviewCenterSlot() {
    Box(
            modifier = Modifier
                    .size(8.dp)
                    .clip(CircleShape)
                    .background(BezierTheme.colorsV3.fillNeutralHeavier),
    )
}

@Composable
private fun PreviewTrailingContent() {
    Box(
            modifier = Modifier
                    .size(24.dp)
                    .clip(RoundedCornerShape(6.dp))
                    .background(BezierTheme.colorsV3.fillNeutral),
    )
}

@Preview(showBackground = true, widthDp = 360)
@Composable
private fun DropdownMenuPreview() = DropdownMenuPreviewContent()

@Preview(showBackground = true, widthDp = 360, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun DropdownMenuDarkPreview() = DropdownMenuPreviewContent()
