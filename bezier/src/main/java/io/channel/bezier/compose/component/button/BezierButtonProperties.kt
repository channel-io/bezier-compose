package io.channel.bezier.compose.component.button

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.color_v2.BezierColor

@Stable
sealed interface BezierButtonContent {
    data class Icon(val icon: BezierIcon) : BezierButtonContent
    data class Avatar(val painter: Painter) : BezierButtonContent
    data class Emoji(val painter: Painter) : BezierButtonContent
}


enum class BezierButtonVariant {
    Primary,
    Secondary,
    Tertiary,
}

enum class BezierButtonSize {
    XSmall,
    Small,
    Medium,
    Large,
    XLarge;

    internal val textStyle: TextStyle
        @Composable
        get() = when (this) {
            XSmall -> BezierTheme.typography.caption2SemiBold
            Small -> BezierTheme.typography.caption1SemiBold
            Medium -> BezierTheme.typography.body2SemiBold
            Large -> BezierTheme.typography.body1SemiBold
            XLarge -> BezierTheme.typography.title2SemiBold
        }

    internal val radius: Dp
        get() = when (this) {
            XSmall -> 8.dp
            Small -> 10.dp
            Medium -> 12.dp
            Large -> 14.dp
            XLarge -> 16.dp
        }

    internal val containerPadding: PaddingValues
        get() = when (this) {
            XSmall -> PaddingValues(horizontal = 6.dp, vertical = 3.dp)
            Small -> PaddingValues(horizontal = 8.dp, vertical = 6.dp)
            Medium -> PaddingValues(horizontal = 12.dp, vertical = 9.dp)
            Large -> PaddingValues(horizontal = 14.dp, vertical = 11.dp)
            XLarge -> PaddingValues(horizontal = 16.dp, vertical = 15.dp)
        }

    internal val textPadding: PaddingValues
        get() = when (this) {
            XSmall -> PaddingValues(horizontal = 3.dp, vertical = 0.dp)
            Small -> PaddingValues(horizontal = 4.dp, vertical = 1.dp)
            Medium -> PaddingValues(horizontal = 4.dp, vertical = 0.dp)
            Large -> PaddingValues(horizontal = 5.dp, vertical = 1.dp)
            XLarge -> PaddingValues(horizontal = 6.dp, vertical = 0.dp)
        }

    internal val iconSize: Dp
        get() = when (this) {
            XSmall,
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
    White;

    @Composable
    internal fun getContentColor(variant: BezierButtonVariant): Color {
        return when (variant) {
            BezierButtonVariant.Primary -> when (this) {
                Blue,
                Cobalt,
                Red,
                Orange,
                Green,
                Pink,
                Purple,
                DarkGrey,
                LightGrey -> BezierTheme.colorSchemes.fgAbsoluteWhiteDark

                White -> BezierTheme.colorSchemes.fgAbsoluteBlackNormal
            }

            BezierButtonVariant.Secondary,
            BezierButtonVariant.Tertiary -> when (this) {
                Blue -> BezierTheme.colorSchemes.primaryFgNormal
                Cobalt -> BezierTheme.colorSchemes.accentFgNormal
                Red -> BezierTheme.colorSchemes.criticalFgNormal
                Orange -> BezierTheme.colorSchemes.warningFgNormal
                Green -> BezierTheme.colorSchemes.successFgNormal
                Pink -> BezierTheme.colorSchemes.fgPinkNormal
                Purple -> BezierTheme.colorSchemes.fgPurpleNormal
                DarkGrey -> BezierTheme.colorSchemes.fgBlackDarkest
                LightGrey -> BezierTheme.colorSchemes.fgBlackDarker
                White -> BezierTheme.colorSchemes.bgAbsoluteWhiteNormal
            }
        }.color
    }

    @Composable
    internal fun getBackgroundColor(variant: BezierButtonVariant): Color {
        return when (variant) {
            BezierButtonVariant.Primary -> when (this) {
                Blue -> BezierTheme.colorSchemes.primaryBgNormal
                Cobalt -> BezierTheme.colorSchemes.accentBgNormal
                Red -> BezierTheme.colorSchemes.criticalBgNormal
                Orange -> BezierTheme.colorSchemes.warningBgNormal
                Green -> BezierTheme.colorSchemes.successBgNormal
                Pink -> BezierTheme.colorSchemes.bgPinkNormal
                Purple -> BezierTheme.colorSchemes.bgPurpleNormal
                DarkGrey -> BezierTheme.colorSchemes.bgGreyDarkest
                LightGrey -> BezierTheme.colorSchemes.bgBlackDark
                White -> BezierTheme.colorSchemes.bgAbsoluteWhiteDark
            }

            BezierButtonVariant.Secondary -> when (this) {
                Blue -> BezierTheme.colorSchemes.primaryBgLightest
                Cobalt -> BezierTheme.colorSchemes.accentBgLightest
                Red -> BezierTheme.colorSchemes.criticalBgLightest
                Orange -> BezierTheme.colorSchemes.warningBgLightest
                Green -> BezierTheme.colorSchemes.successBgLightest
                Pink -> BezierTheme.colorSchemes.bgPinkLightest
                Purple -> BezierTheme.colorSchemes.bgPurpleLightest
                DarkGrey -> BezierTheme.colorSchemes.bgBlackLighter
                LightGrey -> BezierTheme.colorSchemes.bgBlackLighter
                White -> BezierTheme.colorSchemes.bgAbsoluteWhiteLightest
            }

            // TODO : Transparent 교체 필요
            BezierButtonVariant.Tertiary -> object : BezierColor {
                override val color: Color
                    get() = Color(0x00000000)
            }
        }.color
    }
}
