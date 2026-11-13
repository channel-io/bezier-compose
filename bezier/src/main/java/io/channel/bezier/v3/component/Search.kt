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
import androidx.compose.foundation.layout.fillMaxHeight
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
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.component.BezierText
import io.channel.bezier.icon.CancelCircleFilled
import io.channel.bezier.icon.Search
import io.channel.bezier.interaction.BezierComponentInteraction
import io.channel.bezier.typography.BezierTypo

private val Height = 40.dp
private val MinWidth = 40.dp
private val FieldGap = 8.dp
private val ItemGap = 6.dp
private val HorizontalPadding = 10.dp
private val CornerRadius = 12.dp
private val BorderWidth = 1.5.dp
private val IconSize = 20.dp
private val CancelHorizontalPadding = 4.dp
private const val DisabledAlpha = 0.4f

private val FieldShape = RoundedCornerShape(CornerRadius)

@Composable
fun Search(
        value: String,
        onValueChange: (String) -> Unit,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        placeholder: String? = null,
        allowClear: Boolean = true,
        cancelText: String? = null,
        onCancelClick: () -> Unit = {},
        keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
        keyboardActions: KeyboardActions = KeyboardActions.Default,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val colors = BezierTheme.colorsV3
    val focused by interactionSource.collectIsFocusedAsState()

    val active = enabled && focused
    val fillColor = if (active) colors.fillGreyLight else colors.fillGrey
    val borderColor = if (active) colors.stateActive else colors.stateDefault

    val textStyle = remember(colors.textNeutral) {
        TextStyle(
                color = colors.textNeutral,
                fontSize = BezierTypo.TextXLarge.fontSize,
                lineHeight = BezierTypo.TextXLarge.lineHeight,
                letterSpacing = BezierTypo.TextXLarge.letterSpacing,
                fontWeight = FontWeight.Normal,
        )
    }

    Row(
            modifier = modifier
                    .height(Height)
                    .widthIn(min = MinWidth)
                    .graphicsLayer { alpha = if (enabled) 1f else DisabledAlpha }
                    .clip(RectangleShape),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(FieldGap),
    ) {
        BasicTextField(
                value = value,
                onValueChange = onValueChange,
                modifier = Modifier
                        .weight(1f)
                        .fillMaxHeight()
                        .clip(FieldShape)
                        .background(fillColor)
                        .border(BorderWidth, borderColor, FieldShape)
                        .padding(horizontal = HorizontalPadding),
                enabled = enabled,
                textStyle = textStyle,
                singleLine = true,
                keyboardOptions = keyboardOptions,
                keyboardActions = keyboardActions,
                interactionSource = interactionSource,
                cursorBrush = SolidColor(colors.textNeutral),
                decorationBox = { innerTextField ->
                    Row(
                            modifier = Modifier.fillMaxSize(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(ItemGap),
                    ) {
                        Icon(
                                modifier = Modifier.size(IconSize),
                                imageVector = BezierIcons.Search.imageVector,
                                contentDescription = null,
                                tint = colors.iconNeutral,
                        )

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

                        if (allowClear && value.isNotEmpty() && enabled) {
                            Icon(
                                    modifier = Modifier
                                            .size(IconSize)
                                            .clickable(
                                                    interactionSource = remember { MutableInteractionSource() },
                                                    indication = null,
                                                    onClick = {
                                                        BezierComponentInteraction.notify("Search", "V3", BezierIcons.CancelCircleFilled.imageVector.name)
                                                        onValueChange("")
                                                    },
                                            ),
                                    imageVector = BezierIcons.CancelCircleFilled.imageVector,
                                    contentDescription = null,
                                    tint = colors.iconNeutral,
                            )
                        }
                    }
                },
        )

        if (cancelText != null) {
            Box(
                    modifier = Modifier
                            .fillMaxHeight()
                            .clickable(
                                    interactionSource = remember { MutableInteractionSource() },
                                    indication = null,
                                    enabled = enabled,
                                    onClick = {
                                        BezierComponentInteraction.notify("Search", "V3", cancelText)
                                        onCancelClick()
                                    },
                            )
                            .padding(horizontal = CancelHorizontalPadding),
                    contentAlignment = Alignment.Center,
            ) {
                BezierText(
                        text = cancelText,
                        typo = BezierTypo.TextMedium,
                        color = colors.textNeutral,
                        maxLines = 1,
                )
            }
        }
    }
}

@Composable
private fun SearchMatrix() {
    BezierTheme {
        Column(
                modifier = Modifier
                        .background(BezierTheme.colorsV3.surface)
                        .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp),
        ) {
            Text(
                    text = "hasValue = false",
                    color = BezierTheme.colorsV3.textNeutral,
            )
            Search(
                    value = "",
                    onValueChange = {},
                    placeholder = "Search by name, email, phone",
                    modifier = Modifier.fillMaxWidth(),
            )
            Search(
                    value = "",
                    onValueChange = {},
                    placeholder = "Search by name, email, phone",
                    enabled = false,
                    modifier = Modifier.fillMaxWidth(),
            )

            Text(
                    text = "hasValue = true",
                    color = BezierTheme.colorsV3.textNeutral,
            )
            Search(
                    value = "John Doe",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
            )
            Search(
                    value = "John Doe",
                    onValueChange = {},
                    enabled = false,
                    modifier = Modifier.fillMaxWidth(),
            )

            Text(
                    text = "cancelButton = true",
                    color = BezierTheme.colorsV3.textNeutral,
            )
            Search(
                    value = "John Doe",
                    onValueChange = {},
                    cancelText = "Cancel",
                    modifier = Modifier.fillMaxWidth(),
            )
        }
    }
}

@Preview(showBackground = true, widthDp = 360)
@Preview(showBackground = true, widthDp = 360, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun SearchMatrixPreview() = SearchMatrix()
