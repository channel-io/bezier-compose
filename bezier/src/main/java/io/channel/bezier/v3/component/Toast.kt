package io.channel.bezier.v3.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.color.DarkColor
import io.channel.bezier.component.BezierText
import io.channel.bezier.icon.CheckCircleFilled
import io.channel.bezier.icon.ErrorDiamondFilled
import io.channel.bezier.typography.BezierTypo
import io.channel.bezier.typography.BezierWeight

@Composable
fun Toast(
        text: String,
        modifier: Modifier = Modifier,
        preset: ToastPreset = ToastPreset.Info,
) {
    val isAmbientDark = BezierTheme.colorsV3 is DarkColor

    BezierTheme(isDark = !isAmbientDark) {
        val colors = BezierTheme.colorsV3
        val iconSource = preset.iconSource
        val iconColor = preset.iconColor()

        Row(
                modifier = modifier
                        .widthIn(max = ToastMaxWidth)
                        .heightIn(min = ToastMinHeight)
                        .clip(RoundedCornerShape(ToastCornerRadius))
                        .background(colors.surfaceGlass)
                        .padding(horizontal = preset.horizontalPadding, vertical = ToastVerticalPadding),
                horizontalArrangement = Arrangement.spacedBy(ToastIconTextGap),
                verticalAlignment = Alignment.Top,
        ) {
            if (iconSource != null && iconColor != null) {
                Icon(
                        modifier = Modifier.size(ToastIconLength),
                        imageVector = iconSource.imageVector,
                        tint = iconColor,
                        contentDescription = null,
                )
            }
            BezierText(
                    modifier = Modifier
                            .weight(1f, fill = false)
                            .padding(vertical = ToastTextVerticalPadding),
                    text = text,
                    typo = BezierTypo.TextMedium,
                    weight = BezierWeight.Bold,
                    color = colors.textNeutral,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = ToastMaxLines,
            )
        }
    }
}

private val ToastMaxWidth: Dp = 460.dp
private val ToastMinHeight: Dp = 40.dp
private val ToastCornerRadius: Dp = 20.dp
private val ToastVerticalPadding: Dp = 12.dp
private val ToastTextVerticalPadding: Dp = 1.dp
private val ToastIconTextGap: Dp = 6.dp
private val ToastIconLength: Dp = 20.dp
private const val ToastMaxLines: Int = 2

enum class ToastPreset {
    Info,
    Success,
    Error;

    internal val iconSource: BezierIcon?
        get() = when (this) {
            Info -> null
            Success -> BezierIcons.CheckCircleFilled
            Error -> BezierIcons.ErrorDiamondFilled
        }

    internal val horizontalPadding: Dp
        get() = when (this) {
            Info -> 14.dp
            Success, Error -> 12.dp
        }

    @Composable
    internal fun iconColor(): Color? = when (this) {
        Info -> null
        Success -> BezierTheme.colorsV3.iconAccentGreen
        Error -> BezierTheme.colorsV3.iconAccentRed
    }
}

@Composable
private fun ToastMatrix() {
    BezierTheme(isDark = isSystemInDarkTheme()) {
        Column(
                modifier = Modifier
                        .background(BezierTheme.colorsV3.surface)
                        .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            Toast(text = "Message", preset = ToastPreset.Info)
            Toast(text = "Message", preset = ToastPreset.Success)
            Toast(text = "Message", preset = ToastPreset.Error)
            Toast(
                    text = "This is a very long toast message that should wrap into at most two lines and then be truncated with an ellipsis once it overflows the available width",
                    preset = ToastPreset.Error,
            )
        }
    }
}

@Preview(showBackground = true, widthDp = 520)
@Composable
private fun ToastMatrixLightPreview() = ToastMatrix()

@Preview(showBackground = true, widthDp = 520, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun ToastMatrixDarkPreview() = ToastMatrix()
