package io.channel.bezier.compose.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.R
import io.channel.bezier.compose.color_v2.BezierColor
import io.channel.bezier.extension.thenIf

@Composable
fun BezierButton(
        text: String,
        size: BezierButtonSize,
        variant: BezierButtonVariants,
        color: BezierButtonColors,
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        prefixContent: Painter? = null, // TODO : 스펙이 확장되기 이전까지는 Painter로 합니다.
        suffixContent: Painter? = null,
        isLoading: Boolean = false,
) {
    Box(
            modifier = modifier
                    .clip(RoundedCornerShape(size.radius))
                    .background(getBackgroundColor(variant, color))
                    .clickable { onClick() }
                    .padding(size.containerPadding),
            contentAlignment = Alignment.Center,
    ) {
        if (isLoading) {
            CircularProgressIndicator(
                    modifier = Modifier.size(size.iconSize),
                    color = getContentsColor(variant, color),
            )
        }

        Row(
                modifier = Modifier
                        .thenIf(isLoading) {
                            Modifier.alpha(0f)
                        },
                verticalAlignment = Alignment.CenterVertically,
        ) {
            if (prefixContent != null) {
                Icon(
                        modifier = Modifier.size(size.iconSize),
                        painter = prefixContent,
                        contentDescription = null,
                        tint = getContentsColor(variant, color),
                )
            }

            Text(
                    modifier = Modifier.padding(size.textPadding),
                    text = text,
                    style = size.textStyle,
                    color = getContentsColor(variant, color),
            )

            if (suffixContent != null) {
                Icon(
                        modifier = Modifier.size(size.iconSize),
                        painter = suffixContent,
                        contentDescription = null,
                        tint = getContentsColor(variant, color),
                )
            }
        }
    }
}

@Composable
private fun getContentsColor(variant: BezierButtonVariants, color: BezierButtonColors): Color {
    return when (variant) {
        BezierButtonVariants.Primary -> when (color) {
            BezierButtonColors.Blue,
            BezierButtonColors.Cobalt,
            BezierButtonColors.Red,
            BezierButtonColors.Orange,
            BezierButtonColors.Green,
            BezierButtonColors.Pink,
            BezierButtonColors.Purple,
            BezierButtonColors.DarkGrey,
            BezierButtonColors.LightGrey -> BezierTheme.colorSchemes.fgAbsoluteWhiteDark

            BezierButtonColors.White -> BezierTheme.colorSchemes.fgAbsoluteBlackNormal
        }

        BezierButtonVariants.Secondary,
        BezierButtonVariants.Tertiary -> when (color) {
            BezierButtonColors.Blue -> BezierTheme.colorSchemes.primaryFgNormal
            BezierButtonColors.Cobalt -> BezierTheme.colorSchemes.accentFgNormal
            BezierButtonColors.Red -> BezierTheme.colorSchemes.criticalFgNormal
            BezierButtonColors.Orange -> BezierTheme.colorSchemes.warningFgNormal
            BezierButtonColors.Green -> BezierTheme.colorSchemes.successFgNormal
            BezierButtonColors.Pink -> BezierTheme.colorSchemes.fgPinkNormal
            BezierButtonColors.Purple -> BezierTheme.colorSchemes.fgPurpleNormal
            BezierButtonColors.DarkGrey -> BezierTheme.colorSchemes.fgBlackDarkest
            BezierButtonColors.LightGrey -> BezierTheme.colorSchemes.fgBlackDarker
            BezierButtonColors.White -> BezierTheme.colorSchemes.bgAbsoluteWhiteNormal
        }
    }.color
}

@Composable
private fun getBackgroundColor(variant: BezierButtonVariants, color: BezierButtonColors): Color {
    return when (variant) {
        BezierButtonVariants.Primary -> when (color) {
            BezierButtonColors.Blue -> BezierTheme.colorSchemes.primaryBgNormal
            BezierButtonColors.Cobalt -> BezierTheme.colorSchemes.accentBgNormal
            BezierButtonColors.Red -> BezierTheme.colorSchemes.criticalBgNormal
            BezierButtonColors.Orange -> BezierTheme.colorSchemes.warningBgNormal
            BezierButtonColors.Green -> BezierTheme.colorSchemes.successBgNormal
            BezierButtonColors.Pink -> BezierTheme.colorSchemes.bgPinkNormal
            BezierButtonColors.Purple -> BezierTheme.colorSchemes.bgPurpleNormal
            BezierButtonColors.DarkGrey -> BezierTheme.colorSchemes.bgGreyDarkest
            BezierButtonColors.LightGrey -> BezierTheme.colorSchemes.bgBlackDark
            BezierButtonColors.White -> BezierTheme.colorSchemes.bgAbsoluteWhiteDark
        }

        BezierButtonVariants.Secondary -> when (color) {
            BezierButtonColors.Blue -> BezierTheme.colorSchemes.primaryBgLightest
            BezierButtonColors.Cobalt -> BezierTheme.colorSchemes.accentBgLightest
            BezierButtonColors.Red -> BezierTheme.colorSchemes.criticalBgLightest
            BezierButtonColors.Orange -> BezierTheme.colorSchemes.warningBgLightest
            BezierButtonColors.Green -> BezierTheme.colorSchemes.successBgLightest
            BezierButtonColors.Pink -> BezierTheme.colorSchemes.bgPinkLightest
            BezierButtonColors.Purple -> BezierTheme.colorSchemes.bgPurpleLightest
            BezierButtonColors.DarkGrey -> BezierTheme.colorSchemes.bgBlackLighter
            BezierButtonColors.LightGrey -> BezierTheme.colorSchemes.bgBlackLighter
            BezierButtonColors.White -> BezierTheme.colorSchemes.bgAbsoluteWhiteLightest
        }

        // TODO : Transparent 교체 필요
        BezierButtonVariants.Tertiary -> object : BezierColor {
            override val color: Color
                get() = Color(0x00000000)
        }
    }.color
}

enum class BezierButtonVariants {
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

    val textStyle: TextStyle
        @Composable
        get() = when (this) {
            XsSmall -> BezierTheme.typography.caption2SemiBold
            Small -> BezierTheme.typography.caption1SemiBold
            Medium -> BezierTheme.typography.body2SemiBold
            Large -> BezierTheme.typography.body1SemiBold
            XLarge -> BezierTheme.typography.title2SemiBold
        }

    val radius: Dp
        get() = when (this) {
            XsSmall -> 8.dp
            Small -> 10.dp
            Medium -> 12.dp
            Large -> 14.dp
            XLarge -> 16.dp
        }

    val containerPadding: PaddingValues
        get() = when (this) {
            XsSmall -> PaddingValues(horizontal = 6.dp, vertical = 3.dp)
            Small -> PaddingValues(horizontal = 8.dp, vertical = 6.dp)
            Medium -> PaddingValues(horizontal = 12.dp, vertical = 9.dp)
            Large -> PaddingValues(horizontal = 14.dp, vertical = 11.dp)
            XLarge -> PaddingValues(horizontal = 16.dp, vertical = 15.dp)
        }

    val textPadding: PaddingValues
        get() = when (this) {
            XsSmall -> PaddingValues(horizontal = 3.dp, vertical = 0.dp)
            Small -> PaddingValues(horizontal = 4.dp, vertical = 1.dp)
            Medium -> PaddingValues(horizontal = 4.dp, vertical = 0.dp)
            Large -> PaddingValues(horizontal = 5.dp, vertical = 1.dp)
            XLarge -> PaddingValues(horizontal = 6.dp, vertical = 0.dp)
        }

    val iconSize: Dp
        get() = when (this) {
            XsSmall,
            Small -> 16.dp

            Medium,
            Large -> 20.dp

            XLarge -> 24.dp
        }
}

enum class BezierButtonColors {
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
            BezierButtonVariants.entries.forEach { variant ->
                Row(
                        horizontalArrangement = Arrangement.spacedBy(4.dp),
                ) {
                    BezierButtonColors.entries.forEach { color ->
                        BezierButton(
                                text = "Label",
                                size = BezierButtonSize.Medium,
                                variant = variant,
                                color = color,
                                prefixContent = painterResource(id = R.drawable.icon_plus),
                                suffixContent = painterResource(id = R.drawable.icon_arrow_right),
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
                        variant = BezierButtonVariants.Primary,
                        color = BezierButtonColors.Blue,
                        prefixContent = painterResource(id = R.drawable.icon_plus),
                        suffixContent = painterResource(id = R.drawable.icon_arrow_right),
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
                variant = BezierButtonVariants.Primary,
                color = BezierButtonColors.Blue,
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
                variant = BezierButtonVariants.Primary,
                color = BezierButtonColors.Blue,
                onClick = { },
                prefixContent = painterResource(id = R.drawable.icon_plus),
                suffixContent = painterResource(id = R.drawable.icon_arrow_right),
                isLoading = true,
        )
    }
}
