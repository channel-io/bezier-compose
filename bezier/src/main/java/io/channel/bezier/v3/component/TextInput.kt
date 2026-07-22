package io.channel.bezier.v3.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.color.BezierSemanticColorV3
import io.channel.bezier.component.BezierText
import io.channel.bezier.icon.CancelCircleFilled
import io.channel.bezier.icon.View
import io.channel.bezier.icon.ViewOff
import io.channel.bezier.typography.BezierTypo

private val HorizontalPadding = 10.dp
private val ItemGap = 6.dp
private val BorderWidth = 1.5.dp
private val MinWidth = 40.dp
private val SystemIconSize = 20.dp
private const val DisabledAlpha = 0.4f

@Composable
fun TextInput(
        value: String,
        onValueChange: (String) -> Unit,
        modifier: Modifier = Modifier,
        variant: TextInputVariant = TextInputVariant.Primary,
        size: TextInputSize = TextInputSize.Small,
        enabled: Boolean = true,
        readOnly: Boolean = false,
        hasError: Boolean = false,
        placeholder: String? = null,
        allowClear: Boolean = false,
        passwordToggle: Boolean = false,
        leadingContent: (@Composable () -> Unit)? = null,
        trailingContent: (@Composable () -> Unit)? = null,
        keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
        keyboardActions: KeyboardActions = KeyboardActions.Default,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val colors = BezierTheme.colorsV3
    val focused by interactionSource.collectIsFocusedAsState()

    val fillColor = variant.fillColor(colors, enabled, readOnly, focused, hasError)
    val borderColor = variant.borderColor(colors, enabled, readOnly, focused, hasError)
    val valueTextColor = if (readOnly) colors.textNeutralLight else colors.textNeutral
    val shape = RoundedCornerShape(size.cornerRadius)

    val textStyle = remember(valueTextColor) {
        TextStyle(
                color = valueTextColor,
                fontSize = BezierTypo.TextXLarge.fontSize,
                lineHeight = BezierTypo.TextXLarge.lineHeight,
                letterSpacing = BezierTypo.TextXLarge.letterSpacing,
                fontWeight = FontWeight.Normal,
        )
    }

    var passwordVisible by remember { mutableStateOf(false) }
    val visualTransformation = if (passwordToggle && !passwordVisible) {
        PasswordVisualTransformation()
    } else {
        VisualTransformation.None
    }

    BasicTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = modifier
                    .height(size.height)
                    .widthIn(min = MinWidth)
                    .graphicsLayer { alpha = if (enabled) 1f else DisabledAlpha }
                    .clip(shape)
                    .background(fillColor)
                    .then(
                            if (borderColor != null) {
                                Modifier.border(BorderWidth, borderColor, shape)
                            } else {
                                Modifier
                            },
                    )
                    .padding(horizontal = HorizontalPadding, vertical = size.verticalPadding),
            enabled = enabled,
            readOnly = readOnly,
            textStyle = textStyle,
            singleLine = true,
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            visualTransformation = visualTransformation,
            interactionSource = interactionSource,
            cursorBrush = SolidColor(valueTextColor),
            decorationBox = { innerTextField ->
                Row(
                        modifier = Modifier.fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(ItemGap),
                ) {
                    if (leadingContent != null) {
                        leadingContent()
                    }

                    Box(modifier = Modifier.weight(1f)) {
                        innerTextField()

                        if (value.isEmpty() && placeholder != null) {
                            BezierText(
                                    text = placeholder,
                                    typo = BezierTypo.TextXLarge,
                                    color = colors.textNeutralLighter,
                                    overflow = TextOverflow.Ellipsis,
                                    maxLines = 1,
                            )
                        }
                    }

                    if (trailingContent != null) {
                        trailingContent()
                    }

                    if (allowClear && value.isNotEmpty() && enabled && !readOnly) {
                        SystemIcon(
                                icon = BezierIcons.CancelCircleFilled,
                                onClick = { onValueChange("") },
                        )
                    }

                    if (passwordToggle) {
                        SystemIcon(
                                icon = if (passwordVisible) BezierIcons.View else BezierIcons.ViewOff,
                                enabled = enabled,
                                onClick = { passwordVisible = !passwordVisible },
                        )
                    }
                }
            },
    )
}

@Composable
private fun SystemIcon(
        icon: BezierIcon,
        onClick: () -> Unit,
        enabled: Boolean = true,
) {
    Icon(
            modifier = Modifier
                    .size(SystemIconSize)
                    .clickable(
                            interactionSource = remember { MutableInteractionSource() },
                            indication = null,
                            enabled = enabled,
                            onClick = onClick,
                    ),
            imageVector = icon.imageVector,
            contentDescription = null,
            tint = BezierTheme.colorsV3.iconNeutral,
    )
}

enum class TextInputVariant {
    Primary,
    Secondary,
    ;

    internal fun fillColor(
            colors: BezierSemanticColorV3,
            enabled: Boolean,
            readOnly: Boolean,
            focused: Boolean,
            hasError: Boolean,
    ): Color = when (this) {
        Secondary -> colors.fillNeutralLight
        Primary -> when {
            !enabled -> colors.fillGrey
            readOnly -> colors.fillGreyHeavy
            focused || hasError -> colors.fillGreyLight
            else -> colors.fillGrey
        }
    }

    internal fun borderColor(
            colors: BezierSemanticColorV3,
            enabled: Boolean,
            readOnly: Boolean,
            focused: Boolean,
            hasError: Boolean,
    ): Color? {
        val primaryBase = if (this == Primary) colors.stateDefault else null
        return when {
            !enabled -> primaryBase
            readOnly -> primaryBase
            hasError -> colors.stateWarning
            focused -> colors.fillNeutralHeaviest
            else -> primaryBase
        }
    }
}

enum class TextInputSize(
        val height: Dp,
        val verticalPadding: Dp,
        val cornerRadius: Dp,
) {
    Small(height = 40.dp, verticalPadding = 5.dp, cornerRadius = 12.dp),
    Medium(height = 48.dp, verticalPadding = 7.dp, cornerRadius = 14.dp),
}

@Composable
private fun TextInputMatrix() {
    BezierTheme {
        Column(
                modifier = Modifier
                        .background(BezierTheme.colorsV3.surface)
                        .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp),
        ) {
            TextInputSize.values().forEach { size ->
                TextInputVariant.values().forEach { variant ->
                    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        Text(
                                text = "$variant · $size",
                                color = BezierTheme.colorsV3.textNeutral,
                        )
                        TextInput(
                                value = "",
                                onValueChange = {},
                                variant = variant,
                                size = size,
                                placeholder = "placeholder",
                                modifier = Modifier.fillMaxWidth(),
                        )
                        TextInput(
                                value = "hong@company.com",
                                onValueChange = {},
                                variant = variant,
                                size = size,
                                modifier = Modifier.fillMaxWidth(),
                        )
                        TextInput(
                                value = "hong@company.com",
                                onValueChange = {},
                                variant = variant,
                                size = size,
                                hasError = true,
                                modifier = Modifier.fillMaxWidth(),
                        )
                        TextInput(
                                value = "hong@company.com",
                                onValueChange = {},
                                variant = variant,
                                size = size,
                                readOnly = true,
                                modifier = Modifier.fillMaxWidth(),
                        )
                        TextInput(
                                value = "hong@company.com",
                                onValueChange = {},
                                variant = variant,
                                size = size,
                                enabled = false,
                                modifier = Modifier.fillMaxWidth(),
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 360)
@Preview(showBackground = true, widthDp = 360, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun TextInputMatrixPreview() = TextInputMatrix()
