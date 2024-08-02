package io.channel.bezier.compose.component.checkbox

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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

@Composable
fun BezierCheckbox(
        checked: Boolean,
        color: BezierCheckboxColor,
        variant: BezierCheckboxVariant,
        onCheckedChange: (Boolean) -> Unit,
        modifier: Modifier = Modifier,
        text: String? = null,
        enabled: Boolean = true,
) {
    BezierCheckbox(
            status = when (checked) {
                true -> BezierCheckboxStatus.True
                false -> BezierCheckboxStatus.False
            },
            color = color,
            variant = variant,
            onCheckedChange = { status ->
                when (status) {
                    BezierCheckboxStatus.False -> onCheckedChange(false)
                    BezierCheckboxStatus.True,
                    BezierCheckboxStatus.Indeterminate -> onCheckedChange(true)
                }
            },
            modifier = modifier,
            text = text,
            enabled = enabled,
    )
}

@Composable
fun BezierCheckbox(
        status: BezierCheckboxStatus,
        color: BezierCheckboxColor,
        variant: BezierCheckboxVariant,
        onCheckedChange: (BezierCheckboxStatus) -> Unit,
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
                    .thenIf(variant == BezierCheckboxVariant.Secondary) {
                        padding(start = 32.dp)
                    }
                    .clickable(enabled = enabled) {
                        onCheckedChange.invoke(status.switch())
                    },
    ) {
        BezierCheckboxControl(
                modifier = Modifier.padding(variant.controlPadding),
                backgroundColor = backgroundColor,
                iconColor = iconColor,
                variant = variant,
                status = status,
                onClick = {
                    onCheckedChange.invoke(status.switch())
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
        when (variant) {
            BezierCheckboxVariant.Primary -> BezierPrimaryCheckboxIcon(
                    enabled = enabled,
                    status = status,
                    iconColor = iconColor,
                    variant = variant,
            )

            BezierCheckboxVariant.Secondary -> BezierSecondaryCheckboxIcon(
                    status = status,
                    iconColor = iconColor,
                    variant = variant,
            )
        }
    }
}

@Composable
private fun BezierPrimaryCheckboxIcon(
        enabled: Boolean,
        variant: BezierCheckboxVariant,
        status: BezierCheckboxStatus,
        iconColor: Color,
) {
    when (status) {
        BezierCheckboxStatus.False -> {
            if (enabled) {
                Box(
                        modifier = Modifier
                                .size(variant.iconSize)
                                .clip(CircleShape)
                                .background(iconColor),
                )
            }
        }

        BezierCheckboxStatus.True -> {
            Icon(
                    modifier = Modifier
                            .size(variant.iconSize),
                    imageVector = BezierIcons.CheckBold.imageVector,
                    tint = iconColor,
                    contentDescription = null,
            )
        }

        BezierCheckboxStatus.Indeterminate -> {
            Icon(
                    modifier = Modifier
                            .size(variant.iconSize),
                    imageVector = BezierIcons.CheckBold.imageVector,
                    tint = iconColor,
                    contentDescription = null,
            )
        }
    }
}

@Composable
private fun BezierSecondaryCheckboxIcon(
        status: BezierCheckboxStatus,
        variant: BezierCheckboxVariant,
        iconColor: Color,
) {
    when (status) {
        BezierCheckboxStatus.False,
        BezierCheckboxStatus.Indeterminate -> {
            Icon(
                    modifier = Modifier
                            .size(variant.iconSize),
                    imageVector = BezierIcons.CheckBold.imageVector,
                    tint = iconColor,
                    contentDescription = null,
            )
        }

        BezierCheckboxStatus.True -> {
            Icon(
                    modifier = Modifier
                            .size(variant.iconSize),
                    imageVector = BezierIcons.CheckBold.imageVector,
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
                    onCheckedChange = { switchStatus1 = it },
            )

            BezierCheckbox(
                    modifier = Modifier.fillMaxWidth(),
                    color = BezierCheckboxColor.Blue,
                    variant = BezierCheckboxVariant.Secondary,
                    status = switchStatus2,
                    text = "Checkbox label",
                    onCheckedChange = { switchStatus2 = it },
            )

            BezierCheckbox(
                    modifier = Modifier.fillMaxWidth(),
                    color = BezierCheckboxColor.Blue,
                    variant = BezierCheckboxVariant.Secondary,
                    status = switchStatus3,
                    text = "Checkbox label Checkbox label Checkbox label Checkbox label Checkbox label Checkbox label Checkbox label Checkbox label Checkbox label Checkbox label Checkbox label Checkbox label Checkbox label Checkbox label",
                    onCheckedChange = { switchStatus3 = it },
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
                        onCheckedChange = { switchStatus1 = it },
                )

                var switchStatus2 by remember { mutableStateOf(BezierCheckboxStatus.True) }
                BezierCheckbox(
                        color = BezierCheckboxColor.Blue,
                        variant = BezierCheckboxVariant.Primary,
                        status = switchStatus2,
                        onCheckedChange = { switchStatus2 = it },
                )

                var switchStatus3 by remember { mutableStateOf(BezierCheckboxStatus.Indeterminate) }
                BezierCheckbox(
                        color = BezierCheckboxColor.Blue,
                        variant = BezierCheckboxVariant.Primary,
                        status = switchStatus3,
                        onCheckedChange = { switchStatus3 = it },
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
                        onCheckedChange = { switchStatus4 = it },
                )

                var switchStatus5 by remember { mutableStateOf(BezierCheckboxStatus.True) }
                BezierCheckbox(
                        color = BezierCheckboxColor.Blue,
                        variant = BezierCheckboxVariant.Primary,
                        status = switchStatus5,
                        enabled = false,
                        onCheckedChange = { switchStatus5 = it },
                )

                var switchStatus6 by remember { mutableStateOf(BezierCheckboxStatus.Indeterminate) }
                BezierCheckbox(
                        color = BezierCheckboxColor.Blue,
                        variant = BezierCheckboxVariant.Primary,
                        status = switchStatus6,
                        enabled = false,
                        onCheckedChange = { switchStatus6 = it },
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
                        onCheckedChange = { switchStatus7 = it },
                )

                var switchStatus8 by remember { mutableStateOf(BezierCheckboxStatus.True) }
                BezierCheckbox(
                        color = BezierCheckboxColor.Blue,
                        variant = BezierCheckboxVariant.Secondary,
                        status = switchStatus8,
                        onCheckedChange = { switchStatus8 = it },
                )

                var switchStatus9 by remember { mutableStateOf(BezierCheckboxStatus.Indeterminate) }
                BezierCheckbox(
                        color = BezierCheckboxColor.Blue,
                        variant = BezierCheckboxVariant.Secondary,
                        status = switchStatus9,
                        onCheckedChange = { switchStatus9 = it },
                )
            }
        }
    }
}

