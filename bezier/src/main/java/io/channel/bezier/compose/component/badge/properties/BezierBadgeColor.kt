package io.channel.bezier.compose.component.badge.properties

import androidx.compose.runtime.Composable
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.color_v2.BezierColor

enum class BezierBadgeColor(
        val backgroundColor: @Composable () -> BezierColor,
        val contentColor: @Composable () -> BezierColor,
) {
    Grey(
            backgroundColor = { BezierTheme.colorSchemes.bgBlackLighter },
            contentColor = { BezierTheme.colorSchemes.fgBlackDarker },
    ),
    DarkGrey(
            backgroundColor = { BezierTheme.colorSchemes.bgBlackDarker },
            contentColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteDark },
    ),
    Blue(
            backgroundColor = { BezierTheme.colorSchemes.bgBlueShadeLight },
            contentColor = { BezierTheme.colorSchemes.fgBlueDark },
    ),
    Cobalt(
            backgroundColor = { BezierTheme.colorSchemes.bgCobaltShadeLight },
            contentColor = { BezierTheme.colorSchemes.fgCobaltDark },
    ),
    Teal(
            backgroundColor = { BezierTheme.colorSchemes.bgTealShadeLight },
            contentColor = { BezierTheme.colorSchemes.fgTealDark },
    ),
    Green(
            backgroundColor = { BezierTheme.colorSchemes.bgGreenShadeLight },
            contentColor = { BezierTheme.colorSchemes.successFgDark },
    ),
    Olive(
            backgroundColor = { BezierTheme.colorSchemes.bgOliveShadeLight },
            contentColor = { BezierTheme.colorSchemes.fgOliveDark },
    ),
    Pink(
            backgroundColor = { BezierTheme.colorSchemes.bgPinkShadeLight },
            contentColor = { BezierTheme.colorSchemes.fgPinkDark },
    ),
    Navy(
            backgroundColor = { BezierTheme.colorSchemes.bgNavyShadeLight },
            contentColor = { BezierTheme.colorSchemes.fgNavyDark },
    ),
    Yellow(
            backgroundColor = { BezierTheme.colorSchemes.bgYellowShadeLight },
            contentColor = { BezierTheme.colorSchemes.fgYellowDark },
    ),
    Orange(
            backgroundColor = { BezierTheme.colorSchemes.bgOrangeShadeLight },
            contentColor = { BezierTheme.colorSchemes.warningFgDark },
    ),
    Red(
            backgroundColor = { BezierTheme.colorSchemes.bgRedShadeLight },
            contentColor = { BezierTheme.colorSchemes.criticalFgDark },
    ),
    Purple(
            backgroundColor = { BezierTheme.colorSchemes.bgPurpleShadeLight },
            contentColor = { BezierTheme.colorSchemes.fgPurpleDark },
    ),
}
