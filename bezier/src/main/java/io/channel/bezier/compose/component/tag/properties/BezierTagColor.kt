package io.channel.bezier.compose.component.tag.properties

import androidx.compose.runtime.Composable
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.color_v2.BezierColor

enum class BezierTagColor(
        internal val backgroundColor: @Composable () -> BezierColor,
) {
    Default(
            backgroundColor = { BezierTheme.colorSchemes.bgBlackLighter },
    ),
    Blue(
            backgroundColor = { BezierTheme.colorSchemes.bgBlueShadeLight },
    ),
    Cobalt(
            backgroundColor = { BezierTheme.colorSchemes.bgCobaltShadeLight },
    ),
    Teal(
            backgroundColor = { BezierTheme.colorSchemes.bgTealShadeLight },
    ),
    Green(
            backgroundColor = { BezierTheme.colorSchemes.bgGreenShadeLight },
    ),
    Olive(
            backgroundColor = { BezierTheme.colorSchemes.bgOliveShadeLight },
    ),
    Pink(
            backgroundColor = { BezierTheme.colorSchemes.bgPinkShadeLight },
    ),
    Navy(
            backgroundColor = { BezierTheme.colorSchemes.bgNavyShadeLight },
    ),
    Yellow(
            backgroundColor = { BezierTheme.colorSchemes.bgYellowShadeLight },
    ),
    Orange(
            backgroundColor = { BezierTheme.colorSchemes.bgOrangeShadeLight },
    ),
    Red(
            backgroundColor = { BezierTheme.colorSchemes.bgRedShadeLight },
    ),
    Purple(
            backgroundColor = { BezierTheme.colorSchemes.bgPurpleShadeLight },
    ),
}
