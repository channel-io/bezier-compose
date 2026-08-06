package io.channel.bezier.v3.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.color.BezierSemanticColorV3
import io.channel.bezier.component.BezierText
import io.channel.bezier.extension.outsideBorder
import io.channel.bezier.icon.CheckBold
import io.channel.bezier.icon.HyphenBold
import io.channel.bezier.interaction.BezierComponentInteraction
import io.channel.bezier.typography.BezierTypo

@Composable
fun Checkbox(
        checked: CheckboxState,
        label: String,
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        hasError: Boolean = false,
) {
    val colors = BezierTheme.colorsV3

    Row(
            modifier = modifier
                    .graphicsLayer(alpha = if (enabled) 1f else 0.4f)
                    .clickable(enabled = enabled) {
                        BezierComponentInteraction.notify("CheckboxV3", label)
                        onClick()
                    }
                    .padding(vertical = CheckboxRowVerticalPadding),
            horizontalArrangement = Arrangement.spacedBy(CheckboxGap),
            verticalAlignment = Alignment.CenterVertically,
    ) {
        CheckboxIndicator(
                checked = checked,
                enabled = enabled,
                showErrorRing = hasError && enabled,
                colors = colors,
        )
        BezierText(
                text = label,
                typo = BezierTypo.TextXLarge,
                color = colors.textNeutral,
        )
    }
}

@Composable
private fun CheckboxIndicator(
        checked: CheckboxState,
        enabled: Boolean,
        showErrorRing: Boolean,
        colors: BezierSemanticColorV3,
) {
    val errorBorderModifier = if (showErrorRing) {
        Modifier.outsideBorder(
                color = colors.stateWarning,
                borderWidth = CheckboxRingBorderWidth,
                shape = RoundedCornerShape(CheckboxRingRadius),
                gap = CheckboxRingGap,
                stroke = true,
        )
    } else {
        Modifier
    }

    Box(
            modifier = Modifier
                    .then(errorBorderModifier)
                    .size(CheckboxBoxSize)
                    .clip(RoundedCornerShape(CheckboxBoxRadius))
                    .background(checked.background(colors, enabled))
                    .then(
                            if (checked == CheckboxState.Unchecked) {
                                Modifier.border(
                                        width = CheckboxBorderWidth,
                                        color = colors.borderNeutralHeavy,
                                        shape = RoundedCornerShape(CheckboxBoxRadius),
                                )
                            } else {
                                Modifier
                            },
                    ),
            contentAlignment = Alignment.Center,
    ) {
        val icon = checked.icon
        if (icon != null) {
            Icon(
                    modifier = Modifier.size(CheckboxIconSize),
                    imageVector = icon.imageVector,
                    tint = colors.iconInverseHeavier,
                    contentDescription = null,
            )
        }
    }
}

enum class CheckboxState {
    Unchecked,
    Checked,
    Indeterminate;

    internal fun background(colors: BezierSemanticColorV3, enabled: Boolean): Color = when (this) {
        Unchecked -> if (enabled) colors.fillGreyLight else colors.fillNeutralHeavy
        Checked, Indeterminate -> colors.fillNeutralHeaviest
    }

    internal val icon: BezierIcon?
        get() = when (this) {
            Unchecked -> null
            Checked -> BezierIcons.CheckBold
            Indeterminate -> BezierIcons.HyphenBold
        }
}

private val CheckboxGap: Dp = 8.dp
private val CheckboxRowVerticalPadding: Dp = 8.dp
private val CheckboxBoxSize: Dp = 22.dp
private val CheckboxBoxRadius: Dp = 10.dp
private val CheckboxBorderWidth: Dp = 2.dp
private val CheckboxIconSize: Dp = 18.dp
private val CheckboxRingGap: Dp = 1.5.dp
private val CheckboxRingRadius: Dp = 13.dp
private val CheckboxRingBorderWidth: Dp = 1.5.dp

@Preview(showBackground = true, widthDp = 640)
@Preview(showBackground = true, widthDp = 640, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun CheckboxMatrixPreview() {
    BezierTheme {
        Column(
                modifier = Modifier
                        .background(BezierTheme.colorsV3.surface)
                        .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(modifier = Modifier.size(width = 140.dp, height = 40.dp))
                listOf("default", "error", "disabled").forEach { stateLabel ->
                    Box(
                            modifier = Modifier.size(width = 160.dp, height = 40.dp),
                            contentAlignment = Alignment.CenterStart,
                    ) {
                        BezierText(
                                text = stateLabel,
                                typo = BezierTypo.TextMedium,
                                color = BezierTheme.colorsV3.textNeutral,
                        )
                    }
                }
            }

            CheckboxState.entries.forEach { state ->
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                            modifier = Modifier.size(width = 140.dp, height = 40.dp),
                            contentAlignment = Alignment.CenterStart,
                    ) {
                        BezierText(
                                text = state.name,
                                typo = BezierTypo.TextMedium,
                                color = BezierTheme.colorsV3.textNeutral,
                        )
                    }
                    Box(modifier = Modifier.size(width = 160.dp, height = 40.dp)) {
                        Checkbox(checked = state, label = "Label", onClick = {})
                    }
                    Box(modifier = Modifier.size(width = 160.dp, height = 40.dp)) {
                        Checkbox(checked = state, label = "Label", onClick = {}, hasError = true)
                    }
                    Box(modifier = Modifier.size(width = 160.dp, height = 40.dp)) {
                        Checkbox(checked = state, label = "Label", onClick = {}, enabled = false)
                    }
                }
            }
        }
    }
}
