package io.channel.bezier.compose.component.toogle_button

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.component.toogle_button.properties.BezierToggleButtonShape
import io.channel.bezier.compose.component.toogle_button.properties.BezierToggleButtonVariant
import io.channel.bezier.icon.ChevronSmallDown

@Composable
fun BezierToggleButton(
        selected: Boolean,
        text: String,
        variant: BezierToggleButtonVariant,
        shape: BezierToggleButtonShape,
        modifier: Modifier = Modifier,
        prefixIcon: BezierIcon? = null,
        suffixIcon: BezierIcon? = null,
        enabled: Boolean = true,
        onClick: () -> Unit,
) {
     val colorSchemes = variant.getColorSchemes(selected)

    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    Row(
            modifier = modifier
                    .border(
                            width = variant.borderWidth,
                            color = colorSchemes.borderColor().color,
                            shape = shape.shape,
                    )
                    .clip(shape.shape)
                    .clickable(
                            enabled = enabled,
                            interactionSource = interactionSource,
                            indication = null,
                            onClick = onClick,
                    )
                    .background(
                            if (isPressed) {
                                colorSchemes.pressedBackgroundColor().color
                            } else {
                                colorSchemes.backgroundColor().color
                            },
                    )
                    .padding(vertical = 6.dp, horizontal = 12.dp),
            verticalAlignment = Alignment.CenterVertically,
    ) {
        if (prefixIcon != null) {
            Icon(
                    modifier = Modifier.size(20.dp),
                    imageVector = prefixIcon.imageVector,
                    tint = colorSchemes.contentColor().color,
                    contentDescription = null,
            )
        }

        BezierToggleButtonLabel(
                text = text,
                color = colorSchemes.contentColor().color,
                textStyle = if (selected) {
                    BezierTheme.typography.body2SemiBold
                } else {
                    BezierTheme.typography.body2Regular
                },
        )

        if (suffixIcon != null) {
            Icon(
                    modifier = Modifier.size(20.dp),
                    imageVector = suffixIcon.imageVector,
                    tint = colorSchemes.contentColor().color,
                    contentDescription = null,
            )
        }
    }
}

@Composable
private fun BezierToggleButtonLabel(
        color: Color,
        text: String,
        textStyle: TextStyle,
) {
    Text(
            modifier = Modifier.padding(vertical = 1.dp, horizontal = 4.dp),
            text = text,
            style = textStyle,
            color = color,
    )
}

@Preview(showBackground = true)
@Composable
private fun ToggleButtonPreview() {
    BezierTheme {
        Column(
                verticalArrangement = Arrangement.spacedBy(10.dp),
        ) {
            Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
            ) {
                BezierToggleButton(
                        selected = false,
                        text = "label",
                        variant = BezierToggleButtonVariant.Primary,
                        shape = BezierToggleButtonShape.Rectangle,
                        onClick = {},
                )
                BezierToggleButton(
                        selected = true,
                        text = "label",
                        variant = BezierToggleButtonVariant.Primary,
                        shape = BezierToggleButtonShape.Capsule,
                        onClick = {},
                )
            }

            Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
            ) {
                BezierToggleButton(
                        selected = false,
                        text = "label",
                        variant = BezierToggleButtonVariant.Secondary,
                        shape = BezierToggleButtonShape.Rectangle,
                        onClick = {},
                )
                BezierToggleButton(
                        selected = true,
                        text = "label",
                        variant = BezierToggleButtonVariant.Secondary,
                        shape = BezierToggleButtonShape.Capsule,
                        onClick = {},
                )
            }

            Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
            ) {
                BezierToggleButton(
                        selected = false,
                        text = "label",
                        variant = BezierToggleButtonVariant.Primary,
                        shape = BezierToggleButtonShape.Capsule,
                        onClick = {},
                )
                BezierToggleButton(
                        selected = true,
                        text = "label",
                        variant = BezierToggleButtonVariant.Primary,
                        shape = BezierToggleButtonShape.Capsule,
                        onClick = {},
                )
            }

            Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
            ) {
                BezierToggleButton(
                        selected = false,
                        text = "label",
                        variant = BezierToggleButtonVariant.Secondary,
                        shape = BezierToggleButtonShape.Capsule,
                        onClick = {},
                )
                BezierToggleButton(
                        selected = true,
                        text = "label",
                        variant = BezierToggleButtonVariant.Secondary,
                        shape = BezierToggleButtonShape.Capsule,
                        onClick = {},
                )
            }

            Row(
                    horizontalArrangement = Arrangement.spacedBy(10.dp),
            ) {
                BezierToggleButton(
                        selected = false,
                        text = "Label",
                        variant = BezierToggleButtonVariant.Primary,
                        shape = BezierToggleButtonShape.Rectangle,
                        prefixIcon = BezierIcons.ChevronSmallDown,
                        suffixIcon = BezierIcons.ChevronSmallDown,
                        onClick = {},
                )

                BezierToggleButton(
                        selected = true,
                        text = "Label",
                        variant = BezierToggleButtonVariant.Primary,
                        shape = BezierToggleButtonShape.Rectangle,
                        prefixIcon = BezierIcons.ChevronSmallDown,
                        suffixIcon = BezierIcons.ChevronSmallDown,
                        onClick = {},
                )
            }
        }
    }
}
