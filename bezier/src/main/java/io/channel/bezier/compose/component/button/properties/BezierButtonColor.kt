package io.channel.bezier.compose.component.button.properties

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.color_v2.BezierColor

// TODO : 임시 선언
internal val Transparent = object : BezierColor {
    override val color: Color
        get() = Color(0x00000000)
}

enum class BezierButtonColor(
        private val primaryColorSchemes: BezierButtonColorSchemes,
        private val secondaryColorSchemes: BezierButtonColorSchemes,
        private val tertiaryColorSchemes: BezierButtonColorSchemes,
) {
    Blue(
            primaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.primaryBgNormal },
                    contentColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteDark },
            ),
            secondaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.primaryBgLightest },
                    contentColor = { BezierTheme.colorSchemes.primaryFgNormal },
            ),
            tertiaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { Transparent },
                    contentColor = { BezierTheme.colorSchemes.primaryFgNormal },
            ),
    ),
    Cobalt(
            primaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.accentBgNormal },
                    contentColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteDark },
            ),
            secondaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.accentBgLightest },
                    contentColor = { BezierTheme.colorSchemes.accentFgNormal },
            ),
            tertiaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { Transparent },
                    contentColor = { BezierTheme.colorSchemes.accentFgNormal },
            ),
    ),
    Red(
            primaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.criticalBgNormal },
                    contentColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteDark },
            ),
            secondaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.criticalBgLightest },
                    contentColor = { BezierTheme.colorSchemes.criticalFgNormal },
            ),
            tertiaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { Transparent },
                    contentColor = { BezierTheme.colorSchemes.criticalFgNormal },
            ),
    ),
    Orange(
            primaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.warningBgNormal },
                    contentColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteDark },
            ),
            secondaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.warningBgLightest },
                    contentColor = { BezierTheme.colorSchemes.warningFgNormal },
            ),
            tertiaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { Transparent },
                    contentColor = { BezierTheme.colorSchemes.warningFgNormal },
            ),
    ),
    Green(
            primaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.successBgNormal },
                    contentColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteDark },
            ),
            secondaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.successBgLightest },
                    contentColor = { BezierTheme.colorSchemes.successFgNormal },
            ),
            tertiaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { Transparent },
                    contentColor = { BezierTheme.colorSchemes.successFgNormal },
            ),
    ),
    Pink(
            primaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgPinkNormal },
                    contentColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteDark },
            ),
            secondaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgPinkLightest },
                    contentColor = { BezierTheme.colorSchemes.fgPinkNormal },
            ),
            tertiaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { Transparent },
                    contentColor = { BezierTheme.colorSchemes.fgPinkNormal },
            ),
    ),
    Purple(
            primaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgPurpleNormal },
                    contentColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteDark },
            ),
            secondaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgPurpleLightest },
                    contentColor = { BezierTheme.colorSchemes.fgPurpleNormal },
            ),
            tertiaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { Transparent },
                    contentColor = { BezierTheme.colorSchemes.fgPurpleNormal },
            ),
    ),
    DarkGrey(
            primaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgGreyDarkest },
                    contentColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteDark },
            ),
            secondaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgBlackLighter },
                    contentColor = { BezierTheme.colorSchemes.fgBlackDarkest },
            ),
            tertiaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { Transparent },
                    contentColor = { BezierTheme.colorSchemes.fgBlackDarkest },
            ),
    ),
    LightGrey(
            primaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgBlackDark },
                    contentColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteDark },
            ),
            secondaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgBlackLighter },
                    contentColor = { BezierTheme.colorSchemes.fgBlackDarker },
            ),
            tertiaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { Transparent },
                    contentColor = { BezierTheme.colorSchemes.fgBlackDarker },
            ),
    ),
    White(
            primaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgAbsoluteWhiteDark },
                    contentColor = { BezierTheme.colorSchemes.fgAbsoluteBlackNormal },
            ),
            secondaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { BezierTheme.colorSchemes.bgAbsoluteWhiteLightest },
                    contentColor = { BezierTheme.colorSchemes.bgAbsoluteWhiteNormal },
            ),
            tertiaryColorSchemes = BezierButtonColorSchemes(
                    backgroundColor = { Transparent },
                    contentColor = { BezierTheme.colorSchemes.bgAbsoluteWhiteNormal },
            ),
    );

    @Composable
    internal fun getColorSchemes(variant: BezierButtonVariant): BezierButtonColorSchemes {
        return when (variant) {
            BezierButtonVariant.Primary -> primaryColorSchemes
            BezierButtonVariant.Secondary -> secondaryColorSchemes
            BezierButtonVariant.Tertiary -> tertiaryColorSchemes
        }
    }
}

internal class BezierButtonColorSchemes(
        val backgroundColor: @Composable () -> BezierColor,
        val contentColor: @Composable () -> BezierColor,
)
