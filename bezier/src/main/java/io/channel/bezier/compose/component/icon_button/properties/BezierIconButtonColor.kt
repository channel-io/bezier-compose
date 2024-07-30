package io.channel.bezier.compose.component.icon_button.properties

import androidx.compose.runtime.Composable
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.color_v2.BezierColor

enum class BezierIconButtonColor(
        private val primaryColorSchemes: BezierIconButtonColorSchemes,
        private val secondaryColorSchemes: BezierIconButtonColorSchemes,
        private val tertiaryColorSchemes: BezierIconButtonColorSchemes,
) {
    Blue(
            primaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.primaryBgNormal },
                    contentColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteDark },
            ),
            secondaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.primaryBgLightest },
                    contentColor = { BezierTheme.colorSchemes.primaryFgNormal },
            ),
            tertiaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgWhiteWhiteAlphaTransparent },
                    contentColor = { BezierTheme.colorSchemes.primaryFgNormal },
            ),
    ),
    Cobalt(
            primaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.accentBgNormal },
                    contentColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteDark },
            ),
            secondaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.accentBgLightest },
                    contentColor = { BezierTheme.colorSchemes.accentFgNormal },
            ),
            tertiaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgWhiteWhiteAlphaTransparent },
                    contentColor = { BezierTheme.colorSchemes.accentFgNormal },
            ),
    ),
    Red(
            primaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.criticalBgNormal },
                    contentColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteDark },
            ),
            secondaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.criticalBgLightest },
                    contentColor = { BezierTheme.colorSchemes.criticalFgNormal },
            ),
            tertiaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgWhiteWhiteAlphaTransparent },
                    contentColor = { BezierTheme.colorSchemes.criticalFgNormal },
            ),
    ),
    Orange(
            primaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.warningBgNormal },
                    contentColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteDark },
            ),
            secondaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.warningBgLightest },
                    contentColor = { BezierTheme.colorSchemes.warningFgNormal },
            ),
            tertiaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgWhiteWhiteAlphaTransparent },
                    contentColor = { BezierTheme.colorSchemes.warningFgNormal },
            ),
    ),
    Green(
            primaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.successBgNormal },
                    contentColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteDark },
            ),
            secondaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.successBgLightest },
                    contentColor = { BezierTheme.colorSchemes.successFgNormal },
            ),
            tertiaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgWhiteWhiteAlphaTransparent },
                    contentColor = { BezierTheme.colorSchemes.successFgNormal },
            ),
    ),
    Pink(
            primaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgPinkNormal },
                    contentColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteDark },
            ),
            secondaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgPinkLightest },
                    contentColor = { BezierTheme.colorSchemes.fgPinkNormal },
            ),
            tertiaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgWhiteWhiteAlphaTransparent },
                    contentColor = { BezierTheme.colorSchemes.fgPinkNormal },
            ),
    ),
    Purple(
            primaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgPurpleNormal },
                    contentColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteDark },
            ),
            secondaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgPurpleLightest },
                    contentColor = { BezierTheme.colorSchemes.fgPurpleNormal },
            ),
            tertiaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgWhiteWhiteAlphaTransparent },
                    contentColor = { BezierTheme.colorSchemes.fgPurpleNormal },
            ),
    ),
    DarkGrey(
            primaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgGreyDarkest },
                    contentColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteDark },
            ),
            secondaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgBlackLighter },
                    contentColor = { BezierTheme.colorSchemes.fgBlackDarker },
            ),
            tertiaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgWhiteWhiteAlphaTransparent },
                    contentColor = { BezierTheme.colorSchemes.fgBlackDarker },
            ),
    ),
    LightGrey(
            primaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgBlackDark },
                    contentColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteNormal },
            ),
            secondaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgBlackLighter },
                    contentColor = { BezierTheme.colorSchemes.fgBlackDark },
            ),
            tertiaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgWhiteWhiteAlphaTransparent },
                    contentColor = { BezierTheme.colorSchemes.fgBlackDark },
            ),
    ),
    White(
            primaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgAbsoluteWhiteDark },
                    contentColor = { BezierTheme.colorSchemes.fgAbsoluteBlackNormal },
            ),
            secondaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgAbsoluteWhiteLightest },
                    contentColor = { BezierTheme.colorSchemes.bgAbsoluteWhiteNormal },
            ),
            tertiaryColorSchemes = BezierIconButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgWhiteWhiteAlphaTransparent },
                    contentColor = { BezierTheme.colorSchemes.bgAbsoluteWhiteNormal },
            ),
    );

    @Composable
    internal fun getColorSchemes(variant: BezierIconButtonVariant): BezierIconButtonColorSchemes {
        return when (variant) {
            BezierIconButtonVariant.Primary -> primaryColorSchemes
            BezierIconButtonVariant.Secondary -> secondaryColorSchemes
            BezierIconButtonVariant.Tertiary -> tertiaryColorSchemes
        }
    }
}

internal class BezierIconButtonColorSchemes(
        val backgroundColor: @Composable () -> BezierColor,
        val contentColor: @Composable () -> BezierColor,
)