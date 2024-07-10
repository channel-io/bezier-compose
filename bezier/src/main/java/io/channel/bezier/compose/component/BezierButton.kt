package io.channel.bezier.compose.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.color_v2.BezierColor
import io.channel.bezier.extension.thenIf
import io.channel.bezier.icon.ArrowRight
import io.channel.bezier.icon.Plus

@Composable
fun BezierButton(
        text: String,
        size: BezierButtonSize,
        variant: BezierButtonVariant,
        color: BezierButtonColor,
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        prefixContent: BezierButtonContent? = null,
        suffixContent: BezierButtonContent? = null,
        isLoading: Boolean = false,
        enabled: Boolean = true,
) {
    val colorSchemes = BezierButtonColorSchemes(
            backgroundColor = getBackgroundColor(variant, color),
            contentColor = getContentColor(variant, color),
    )

    Box(
            modifier = modifier
                    .clip(RoundedCornerShape(size.radius))
                    .thenIf(!enabled) {
                        alpha(0.4f)
                    }
                    .background(colorSchemes.backgroundColor)
                    .clickable(enabled = enabled) { onClick() }
                    .padding(size.containerPadding),
            contentAlignment = Alignment.Center,
    ) {
        if (isLoading) {
            CircularProgressIndicator(
                    modifier = Modifier.size(size.iconSize),
                    color = colorSchemes.contentColor,
            )
        }

        Row(
                modifier = Modifier
                        .thenIf(isLoading) {
                            alpha(0f)
                        },
                verticalAlignment = Alignment.CenterVertically,
        ) {
            if (prefixContent != null) {
                BezierButtonContent(
                        content = prefixContent,
                        size = size,
                        colorSchemes = colorSchemes,
                )
            }

            Text(
                    modifier = Modifier
                            .padding(size.textPadding)
                            .weight(1f, fill = false),
                    text = text,
                    style = size.textStyle,
                    color = colorSchemes.contentColor,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
            )

            if (suffixContent != null) {
                BezierButtonContent(
                        content = suffixContent,
                        size = size,
                        colorSchemes = colorSchemes,
                )
            }
        }
    }
}

@Composable
private fun BezierButtonContent(
        content: BezierButtonContent,
        size: BezierButtonSize,
        colorSchemes: BezierButtonColorSchemes,
) {
    when (content) {
        is BezierButtonContent.Icon -> Icon(
                modifier = Modifier.size(size.iconSize),
                painter = rememberVectorPainter(content.icon.imageVector),
                contentDescription = null,
                tint = colorSchemes.contentColor,
        )

        // TODO : Not Implementation
        is BezierButtonContent.Avatar -> Box(
                modifier = Modifier
                        .size(size.iconSize)
                        .background(colorSchemes.backgroundColor),
        )

        // TODO : Not Implementation
        is BezierButtonContent.Emoji -> Image(
                modifier = Modifier.size(size.iconSize),
                painter = content.painter,
                contentDescription = null,
        )
    }
}

private class BezierButtonColorSchemes(
        val backgroundColor: Color,
        val contentColor: Color,
)

@Composable
private fun getContentColor(variant: BezierButtonVariant, color: BezierButtonColor): Color {
    return when (variant) {
        BezierButtonVariant.Primary -> when (color) {
            BezierButtonColor.Blue,
            BezierButtonColor.Cobalt,
            BezierButtonColor.Red,
            BezierButtonColor.Orange,
            BezierButtonColor.Green,
            BezierButtonColor.Pink,
            BezierButtonColor.Purple,
            BezierButtonColor.DarkGrey,
            BezierButtonColor.LightGrey -> BezierTheme.colorSchemes.fgAbsoluteWhiteDark

            BezierButtonColor.White -> BezierTheme.colorSchemes.fgAbsoluteBlackNormal
        }

        BezierButtonVariant.Secondary,
        BezierButtonVariant.Tertiary -> when (color) {
            BezierButtonColor.Blue -> BezierTheme.colorSchemes.primaryFgNormal
            BezierButtonColor.Cobalt -> BezierTheme.colorSchemes.accentFgNormal
            BezierButtonColor.Red -> BezierTheme.colorSchemes.criticalFgNormal
            BezierButtonColor.Orange -> BezierTheme.colorSchemes.warningFgNormal
            BezierButtonColor.Green -> BezierTheme.colorSchemes.successFgNormal
            BezierButtonColor.Pink -> BezierTheme.colorSchemes.fgPinkNormal
            BezierButtonColor.Purple -> BezierTheme.colorSchemes.fgPurpleNormal
            BezierButtonColor.DarkGrey -> BezierTheme.colorSchemes.fgBlackDarkest
            BezierButtonColor.LightGrey -> BezierTheme.colorSchemes.fgBlackDarker
            BezierButtonColor.White -> BezierTheme.colorSchemes.bgAbsoluteWhiteNormal
        }
    }.color
}

@Composable
private fun getBackgroundColor(variant: BezierButtonVariant, color: BezierButtonColor): Color {
    return when (variant) {
        BezierButtonVariant.Primary -> when (color) {
            BezierButtonColor.Blue -> BezierTheme.colorSchemes.primaryBgNormal
            BezierButtonColor.Cobalt -> BezierTheme.colorSchemes.accentBgNormal
            BezierButtonColor.Red -> BezierTheme.colorSchemes.criticalBgNormal
            BezierButtonColor.Orange -> BezierTheme.colorSchemes.warningBgNormal
            BezierButtonColor.Green -> BezierTheme.colorSchemes.successBgNormal
            BezierButtonColor.Pink -> BezierTheme.colorSchemes.bgPinkNormal
            BezierButtonColor.Purple -> BezierTheme.colorSchemes.bgPurpleNormal
            BezierButtonColor.DarkGrey -> BezierTheme.colorSchemes.bgGreyDarkest
            BezierButtonColor.LightGrey -> BezierTheme.colorSchemes.bgBlackDark
            BezierButtonColor.White -> BezierTheme.colorSchemes.bgAbsoluteWhiteDark
        }

        BezierButtonVariant.Secondary -> when (color) {
            BezierButtonColor.Blue -> BezierTheme.colorSchemes.primaryBgLightest
            BezierButtonColor.Cobalt -> BezierTheme.colorSchemes.accentBgLightest
            BezierButtonColor.Red -> BezierTheme.colorSchemes.criticalBgLightest
            BezierButtonColor.Orange -> BezierTheme.colorSchemes.warningBgLightest
            BezierButtonColor.Green -> BezierTheme.colorSchemes.successBgLightest
            BezierButtonColor.Pink -> BezierTheme.colorSchemes.bgPinkLightest
            BezierButtonColor.Purple -> BezierTheme.colorSchemes.bgPurpleLightest
            BezierButtonColor.DarkGrey -> BezierTheme.colorSchemes.bgBlackLighter
            BezierButtonColor.LightGrey -> BezierTheme.colorSchemes.bgBlackLighter
            BezierButtonColor.White -> BezierTheme.colorSchemes.bgAbsoluteWhiteLightest
        }

        // TODO : Transparent 교체 필요
        BezierButtonVariant.Tertiary -> object : BezierColor {
            override val color: Color
                get() = Color(0x00000000)
        }
    }.color
}

enum class BezierButtonVariant {
    Primary,
    Secondary,
    Tertiary,
}

enum class BezierButtonSize {
    XsSmall,
    Small,
    Medium,
    Large,
    XLarge;

    internal val textStyle: TextStyle
        @Composable
        get() = when (this) {
            XsSmall -> BezierTheme.typography.caption2SemiBold
            Small -> BezierTheme.typography.caption1SemiBold
            Medium -> BezierTheme.typography.body2SemiBold
            Large -> BezierTheme.typography.body1SemiBold
            XLarge -> BezierTheme.typography.title2SemiBold
        }

    internal val radius: Dp
        get() = when (this) {
            XsSmall -> 8.dp
            Small -> 10.dp
            Medium -> 12.dp
            Large -> 14.dp
            XLarge -> 16.dp
        }

    internal val containerPadding: PaddingValues
        get() = when (this) {
            XsSmall -> PaddingValues(horizontal = 6.dp, vertical = 3.dp)
            Small -> PaddingValues(horizontal = 8.dp, vertical = 6.dp)
            Medium -> PaddingValues(horizontal = 12.dp, vertical = 9.dp)
            Large -> PaddingValues(horizontal = 14.dp, vertical = 11.dp)
            XLarge -> PaddingValues(horizontal = 16.dp, vertical = 15.dp)
        }

    internal val textPadding: PaddingValues
        get() = when (this) {
            XsSmall -> PaddingValues(horizontal = 3.dp, vertical = 0.dp)
            Small -> PaddingValues(horizontal = 4.dp, vertical = 1.dp)
            Medium -> PaddingValues(horizontal = 4.dp, vertical = 0.dp)
            Large -> PaddingValues(horizontal = 5.dp, vertical = 1.dp)
            XLarge -> PaddingValues(horizontal = 6.dp, vertical = 0.dp)
        }

    internal val iconSize: Dp
        get() = when (this) {
            XsSmall,
            Small -> 16.dp

            Medium,
            Large -> 20.dp

            XLarge -> 24.dp
        }
}

enum class BezierButtonColor {
    Blue,
    Cobalt,
    Red,
    Orange,
    Green,
    Pink,
    Purple,
    DarkGrey,
    LightGrey,
    White,
}

@Composable
@Preview(
        showBackground = true,
        widthDp = 1200,
)
private fun BezierButtonStylePreview() {
    BezierTheme {
        Column(
                modifier = Modifier.padding(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            BezierButtonVariant.entries.forEach { variant ->
                Row(
                        horizontalArrangement = Arrangement.spacedBy(4.dp),
                ) {
                    BezierButtonColor.entries.forEach { color ->
                        BezierButton(
                                text = "Label",
                                size = BezierButtonSize.Medium,
                                variant = variant,
                                color = color,
                                prefixContent = BezierButtonContent.Icon(BezierIcons.Plus),
                                suffixContent = BezierButtonContent.Icon(BezierIcons.ArrowRight),
                                onClick = { },
                        )
                    }
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun BezierButtonSizePreview() {
    BezierTheme {
        Column(
                modifier = Modifier.padding(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            BezierButtonSize.entries.forEach { size ->
                BezierButton(
                        text = "Label",
                        size = size,
                        variant = BezierButtonVariant.Primary,
                        color = BezierButtonColor.Blue,
                        prefixContent = BezierButtonContent.Icon(BezierIcons.Plus),
                        suffixContent = BezierButtonContent.Icon(BezierIcons.ArrowRight),
                        onClick = { },
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun BezierButtonOnlyTextPreview() {
    BezierTheme {
        BezierButton(
                text = "Label",
                size = BezierButtonSize.Medium,
                variant = BezierButtonVariant.Primary,
                color = BezierButtonColor.Blue,
                onClick = { },
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun BezierButtonLoadingPreview() {
    BezierTheme {
        BezierButton(
                text = "Label",
                size = BezierButtonSize.Large,
                variant = BezierButtonVariant.Primary,
                color = BezierButtonColor.Blue,
                onClick = { },
                prefixContent = BezierButtonContent.Icon(BezierIcons.Plus),
                suffixContent = BezierButtonContent.Icon(BezierIcons.ArrowRight),
                isLoading = true,
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun BezierButtonEnabledPreview() {
    BezierTheme {
        Column(
                modifier = Modifier.padding(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            BezierButton(
                    text = "Label",
                    size = BezierButtonSize.Large,
                    variant = BezierButtonVariant.Primary,
                    color = BezierButtonColor.Blue,
                    onClick = { },
                    prefixContent = BezierButtonContent.Icon(BezierIcons.Plus),
                    suffixContent = BezierButtonContent.Icon(BezierIcons.ArrowRight),
                    enabled = true,
            )

            BezierButton(
                    text = "Label",
                    size = BezierButtonSize.Large,
                    variant = BezierButtonVariant.Primary,
                    color = BezierButtonColor.Blue,
                    onClick = { },
                    prefixContent = BezierButtonContent.Icon(BezierIcons.Plus),
                    suffixContent = BezierButtonContent.Icon(BezierIcons.ArrowRight),
                    enabled = false,
            )
        }
    }
}

@Stable
sealed interface BezierButtonContent {
    data class Icon(val icon: BezierIcon) : BezierButtonContent
    data class Avatar(val painter: Painter) : BezierButtonContent
    data class Emoji(val painter: Painter) : BezierButtonContent
}
