package io.channel.bezier.compose.component.button.properties

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.color_v2.BezierColor

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
