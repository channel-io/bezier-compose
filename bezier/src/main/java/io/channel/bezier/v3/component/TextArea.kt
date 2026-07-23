package io.channel.bezier.v3.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme
import io.channel.bezier.color.BezierSemanticColorV3
import io.channel.bezier.component.BezierText
import io.channel.bezier.typography.BezierTypo

@Composable
fun TextArea(
        value: String,
        onValueChange: (String) -> Unit,
        modifier: Modifier = Modifier,
        placeholder: String = "",
        enabled: Boolean = true,
        readOnly: Boolean = false,
        hasError: Boolean = false,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val colors = BezierTheme.colorsV3
    val focused by interactionSource.collectIsFocusedAsState()

    val state = when {
        !enabled -> TextAreaState.Disabled
        readOnly -> TextAreaState.ReadOnly
        hasError -> TextAreaState.Error
        focused -> TextAreaState.Focused
        else -> TextAreaState.Default
    }

    BasicTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = modifier
                    .fillMaxWidth()
                    .widthIn(min = TextAreaMinWidth)
                    .graphicsLayer(alpha = if (enabled) 1f else TextAreaDisabledAlpha),
            enabled = enabled,
            readOnly = readOnly,
            textStyle = TextStyle(
                    fontSize = BezierTypo.TextXLarge.fontSize,
                    lineHeight = BezierTypo.TextXLarge.lineHeight,
                    letterSpacing = BezierTypo.TextXLarge.letterSpacing,
                    fontWeight = FontWeight.Normal,
                    color = state.valueTextColor(colors),
            ),
            cursorBrush = SolidColor(colors.textNeutral),
            interactionSource = interactionSource,
            decorationBox = { innerTextField ->
                Box(
                        modifier = Modifier
                                .fillMaxWidth()
                                .heightIn(min = TextAreaMinHeight, max = TextAreaMaxHeight)
                                .clip(RoundedCornerShape(TextAreaRadius))
                                .background(state.background(colors))
                                .border(
                                        width = TextAreaBorderWidth,
                                        color = state.border(colors),
                                        shape = RoundedCornerShape(TextAreaRadius),
                                )
                                .padding(horizontal = TextAreaHorizontalPadding, vertical = TextAreaVerticalPadding),
                ) {
                    if (value.isEmpty()) {
                        BezierText(
                                text = placeholder,
                                typo = BezierTypo.TextXLarge,
                                color = colors.textNeutralLighter,
                        )
                    }
                    innerTextField()
                }
            },
    )
}

private enum class TextAreaState {
    Default,
    Focused,
    Error,
    ReadOnly,
    Disabled;

    fun background(colors: BezierSemanticColorV3): Color = when (this) {
        Default, Disabled -> colors.fillGrey
        Focused, Error -> colors.fillGreyLight
        ReadOnly -> colors.fillGreyHeavy
    }

    fun border(colors: BezierSemanticColorV3): Color = when (this) {
        Focused -> colors.stateActive
        Error -> colors.stateWarning
        Default, ReadOnly, Disabled -> colors.stateDefault
    }

    fun valueTextColor(colors: BezierSemanticColorV3): Color = when (this) {
        ReadOnly -> colors.textNeutralLight
        Default, Focused, Error, Disabled -> colors.textNeutral
    }
}

private val TextAreaMinWidth: Dp = 40.dp
private val TextAreaMinHeight: Dp = 64.dp
private val TextAreaMaxHeight: Dp = 160.dp
private val TextAreaRadius: Dp = 12.dp
private val TextAreaBorderWidth: Dp = 1.5.dp
private val TextAreaHorizontalPadding: Dp = 10.dp
private val TextAreaVerticalPadding: Dp = 8.dp
private const val TextAreaDisabledAlpha: Float = 0.4f

@Preview(showBackground = true, widthDp = 940)
@Preview(showBackground = true, widthDp = 940, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun TextAreaMatrixPreview() {
    BezierTheme {
        Column(
                modifier = Modifier
                        .background(BezierTheme.colorsV3.surface)
                        .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            listOf(false, true).forEach { hasValue ->
                Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                    TextAreaPreviewCell("default", hasValue)
                    TextAreaPreviewCell("error", hasValue, hasError = true)
                    TextAreaPreviewCell("readOnly", hasValue, readOnly = true)
                    TextAreaPreviewCell("disabled", hasValue, enabled = false)
                }
            }
        }
    }
}

@Composable
private fun TextAreaPreviewCell(
        label: String,
        hasValue: Boolean,
        enabled: Boolean = true,
        readOnly: Boolean = false,
        hasError: Boolean = false,
) {
    Column(
            modifier = Modifier.width(200.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp),
    ) {
        BezierText(
                text = label,
                typo = BezierTypo.TextMedium,
                color = BezierTheme.colorsV3.textNeutralLight,
        )
        TextArea(
                value = if (hasValue) "Sample text" else "",
                onValueChange = {},
                placeholder = "Placeholder",
                enabled = enabled,
                readOnly = readOnly,
                hasError = hasError,
        )
    }
}
