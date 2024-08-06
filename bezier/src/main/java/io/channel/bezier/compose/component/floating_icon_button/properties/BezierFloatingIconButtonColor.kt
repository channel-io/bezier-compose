package io.channel.bezier.compose.component.floating_icon_button.properties

import androidx.compose.runtime.Composable
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.color_v2.BezierColor

enum class BezierFloatingIconButtonColor(
        private val primaryColorSchemes: BezierFloatingButtonColorSchemes,
        private val secondaryColorSchemes: BezierFloatingButtonColorSchemes,
) {
    Blue(
            primaryColorSchemes = BezierFloatingButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.primaryBgNormal },
                    contentColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteDark },
            ),
            secondaryColorSchemes = BezierFloatingButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgWhiteHigher },
                    contentColor = { BezierTheme.colorSchemes.primaryFgNormal },
            ),
    ),
    Cobalt(
            primaryColorSchemes = BezierFloatingButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.accentBgNormal },
                    contentColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteDark },
            ),
            secondaryColorSchemes = BezierFloatingButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgWhiteHigher },
                    contentColor = { BezierTheme.colorSchemes.accentFgNormal },
            ),
    ),
    Red(
            primaryColorSchemes = BezierFloatingButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.criticalBgNormal },
                    contentColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteDark },
            ),
            secondaryColorSchemes = BezierFloatingButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgWhiteHigher },
                    contentColor = { BezierTheme.colorSchemes.criticalFgNormal },
            ),
    ),
    Orange(
            primaryColorSchemes = BezierFloatingButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.warningBgNormal },
                    contentColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteDark },
            ),
            secondaryColorSchemes = BezierFloatingButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgWhiteHigher },
                    contentColor = { BezierTheme.colorSchemes.warningFgNormal },
            ),
    ),
    Green(
            primaryColorSchemes = BezierFloatingButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.successBgNormal },
                    contentColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteDark },
            ),
            secondaryColorSchemes = BezierFloatingButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgWhiteHigher },
                    contentColor = { BezierTheme.colorSchemes.successFgNormal },
            ),
    ),
    Pink(
            primaryColorSchemes = BezierFloatingButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgPinkNormal },
                    contentColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteDark },
            ),
            secondaryColorSchemes = BezierFloatingButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgWhiteHigher },
                    contentColor = { BezierTheme.colorSchemes.fgPinkNormal },
            ),
    ),
    Purple(
            primaryColorSchemes = BezierFloatingButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgPurpleNormal },
                    contentColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteDark },
            ),
            secondaryColorSchemes = BezierFloatingButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgWhiteHigher },
                    contentColor = { BezierTheme.colorSchemes.fgPurpleNormal },
            ),
    ),
    DarkGrey(
            primaryColorSchemes = BezierFloatingButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgGreyDarkest },
                    contentColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteDark },
            ),
            secondaryColorSchemes = BezierFloatingButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgWhiteHigher },
                    contentColor = { BezierTheme.colorSchemes.fgBlackDarkest },
            ),
    ),
    LightGrey(
            primaryColorSchemes = BezierFloatingButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgGreyDark },
                    contentColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteDark },
            ),
            secondaryColorSchemes = BezierFloatingButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgWhiteHigher },
                    contentColor = { BezierTheme.colorSchemes.fgBlackDarker },
            ),
    );

    @Composable
    internal fun getColorSchemes(variant: BezierFloatingIconButtonVariant): BezierFloatingButtonColorSchemes {
        return when (variant) {
            BezierFloatingIconButtonVariant.Primary -> primaryColorSchemes
            BezierFloatingIconButtonVariant.Secondary -> secondaryColorSchemes
        }
    }
}

internal class BezierFloatingButtonColorSchemes(
        val backgroundColor: @Composable () -> BezierColor,
        val contentColor: @Composable () -> BezierColor,
)
