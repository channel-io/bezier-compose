package io.channel.bezier.compose.component.checkbox

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.component.checkbox.properties.BezierCheckboxColor
import io.channel.bezier.compose.component.checkbox.properties.BezierCheckboxStatus
import io.channel.bezier.compose.component.checkbox.properties.BezierCheckboxVariant
import io.channel.bezier.extension.thenIf
import io.channel.bezier.icon.CheckBold
import io.channel.bezier.icon.HyphenBold

@Composable
fun BezierCheckbox(
        color: BezierCheckboxColor,
        variant: BezierCheckboxVariant,
        status: BezierCheckboxStatus,
        onClick: (BezierCheckboxStatus) -> Unit,
        modifier: Modifier = Modifier,
        text: String? = null,
        enabled: Boolean = true,
) {
    val colorSchemes = color.getColorSchemes(variant, status)
    val backgroundColor = colorSchemes.backgroundColor().color
    val iconColor = colorSchemes.iconColor().color

    Row(
            modifier = modifier
                    .thenIf(!enabled) {
                        alpha(0.4f)
                    }
                    .clickable(enabled = enabled) {
                        onClick.invoke(status.switch())
                    },
    ) {
        if (variant == BezierCheckboxVariant.Secondary) {
            Spacer(modifier = Modifier.width(32.dp))
        }

        BezierCheckboxControl(
                modifier = Modifier.padding(variant.controlPadding),
                backgroundColor = backgroundColor,
                iconColor = iconColor,
                variant = variant,
                status = status,
                onClick = {
                    onClick.invoke(status.switch())
                },
                enabled = enabled,
        )

        if (text != null) {
            BezierCheckboxLabel(
                    text = text,
                    modifier = modifier.align(Alignment.CenterVertically),
            )
        }
    }
}

@Composable
private fun BezierCheckboxControl(
        status: BezierCheckboxStatus,
        variant: BezierCheckboxVariant,
        backgroundColor: Color,
        iconColor: Color,
        enabled: Boolean,
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
) {
    Box(
            modifier = modifier
                    .size(24.dp)
                    .padding(2.dp)
                    .clip(CircleShape)
                    .clickable(
                            enabled = enabled,
                            onClick = onClick,
                    )
                    .background(backgroundColor),
            contentAlignment = Alignment.Center,
    ) {
        if (enabled && variant == BezierCheckboxVariant.Primary && status == BezierCheckboxStatus.False) {
            Box(
                    modifier = Modifier
                            .size(16.dp)
                            .clip(CircleShape)
                            .background(iconColor),
            )
        }

        if (
                status == BezierCheckboxStatus.True
                || (
                        (status == BezierCheckboxStatus.False || status == BezierCheckboxStatus.Indeterminate)
                                && variant == BezierCheckboxVariant.Secondary
                        )
        ) {
            Icon(
                    modifier = Modifier
                            .size(16.dp),
                    imageVector = BezierIcons.CheckBold.imageVector,
                    tint = iconColor,
                    contentDescription = null,
            )
        }

        if (variant == BezierCheckboxVariant.Primary && status == BezierCheckboxStatus.Indeterminate) {
            Icon(
                    modifier = Modifier
                            .size(16.dp),
                    imageVector = BezierIcons.HyphenBold.imageVector,
                    tint = iconColor,
                    contentDescription = null,
            )
        }
    }
}

@Composable
private fun BezierCheckboxLabel(
        text: String,
        modifier: Modifier = Modifier,
) {
    Text(
            modifier = modifier,
            text = text,
            style = BezierTheme.typography.caption1Regular,
            color = BezierTheme.colorSchemes.fgBlackDarkest.color,
    )
}

@Preview(showBackground = true)
@Composable
private fun BezierCheckboxPreview() {
    BezierTheme {
        var switchStatus1 by remember { mutableStateOf(BezierCheckboxStatus.True) }
        var switchStatus2 by remember { mutableStateOf(BezierCheckboxStatus.True) }
        var switchStatus3 by remember { mutableStateOf(BezierCheckboxStatus.True) }

        Column {
            BezierCheckbox(
                    modifier = Modifier.fillMaxWidth(),
                    color = BezierCheckboxColor.Blue,
                    variant = BezierCheckboxVariant.Primary,
                    status = switchStatus1,
                    text = "Checkbox label",
                    onClick = { switchStatus1 = it },
            )

            BezierCheckbox(
                    modifier = Modifier.fillMaxWidth(),
                    color = BezierCheckboxColor.Blue,
                    variant = BezierCheckboxVariant.Secondary,
                    status = switchStatus2,
                    text = "Checkbox label",
                    onClick = { switchStatus2 = it },
            )

            BezierCheckbox(
                    modifier = Modifier.fillMaxWidth(),
                    color = BezierCheckboxColor.Blue,
                    variant = BezierCheckboxVariant.Secondary,
                    status = switchStatus3,
                    text = "Checkbox label Checkbox label Checkbox label Checkbox label Checkbox label Checkbox label Checkbox label Checkbox label Checkbox label Checkbox label Checkbox label Checkbox label Checkbox label Checkbox label",
                    onClick = { switchStatus3 = it },
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun BezierCheckboxControlPreview() {
    BezierTheme {
        Column(
                verticalArrangement = Arrangement.spacedBy(20.dp),
        ) {
            Row(
                    horizontalArrangement = Arrangement.spacedBy(20.dp),
            ) {
                var switchStatus1 by remember { mutableStateOf(BezierCheckboxStatus.False) }
                BezierCheckbox(
                        color = BezierCheckboxColor.Blue,
                        variant = BezierCheckboxVariant.Primary,
                        status = switchStatus1,
                        onClick = { switchStatus1 = it },
                )

                var switchStatus2 by remember { mutableStateOf(BezierCheckboxStatus.True) }
                BezierCheckbox(
                        color = BezierCheckboxColor.Blue,
                        variant = BezierCheckboxVariant.Primary,
                        status = switchStatus2,
                        onClick = { switchStatus2 = it },
                )

                var switchStatus3 by remember { mutableStateOf(BezierCheckboxStatus.Indeterminate) }
                BezierCheckbox(
                        color = BezierCheckboxColor.Blue,
                        variant = BezierCheckboxVariant.Primary,
                        status = switchStatus3,
                        onClick = { switchStatus3 = it },
                )
            }

            Row(
                    horizontalArrangement = Arrangement.spacedBy(20.dp),
            ) {
                var switchStatus4 by remember { mutableStateOf(BezierCheckboxStatus.False) }
                BezierCheckbox(
                        color = BezierCheckboxColor.Blue,
                        variant = BezierCheckboxVariant.Primary,
                        status = switchStatus4,
                        enabled = false,
                        onClick = { switchStatus4 = it },
                )

                var switchStatus5 by remember { mutableStateOf(BezierCheckboxStatus.True) }
                BezierCheckbox(
                        color = BezierCheckboxColor.Blue,
                        variant = BezierCheckboxVariant.Primary,
                        status = switchStatus5,
                        enabled = false,
                        onClick = { switchStatus5 = it },
                )

                var switchStatus6 by remember { mutableStateOf(BezierCheckboxStatus.Indeterminate) }
                BezierCheckbox(
                        color = BezierCheckboxColor.Blue,
                        variant = BezierCheckboxVariant.Primary,
                        status = switchStatus6,
                        enabled = false,
                        onClick = { switchStatus6 = it },
                )
            }

            Row(
                    horizontalArrangement = Arrangement.spacedBy(20.dp),
            ) {
                var switchStatus7 by remember { mutableStateOf(BezierCheckboxStatus.False) }
                BezierCheckbox(
                        color = BezierCheckboxColor.Blue,
                        variant = BezierCheckboxVariant.Secondary,
                        status = switchStatus7,
                        onClick = { switchStatus7 = it },
                )

                var switchStatus8 by remember { mutableStateOf(BezierCheckboxStatus.True) }
                BezierCheckbox(
                        color = BezierCheckboxColor.Blue,
                        variant = BezierCheckboxVariant.Secondary,
                        status = switchStatus8,
                        onClick = { switchStatus8 = it },
                )

                var switchStatus9 by remember { mutableStateOf(BezierCheckboxStatus.Indeterminate) }
                BezierCheckbox(
                        color = BezierCheckboxColor.Blue,
                        variant = BezierCheckboxVariant.Secondary,
                        status = switchStatus9,
                        onClick = { switchStatus9 = it },
                )
            }
        }
    }
}

