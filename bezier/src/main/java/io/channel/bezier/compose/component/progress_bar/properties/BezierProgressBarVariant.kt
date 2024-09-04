package io.channel.bezier.compose.component.progress_bar.properties

import androidx.compose.runtime.Composable
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.color_v2.BezierColor

enum class BezierProgressBarVariant(
        internal val colors: @Composable () -> List<BezierColor>,
        internal val backgroundColor: @Composable () -> BezierColor,
) {
    Primary(
            colors = { BezierTheme.colorSchemes.gradientBgGreen },
            backgroundColor = { BezierTheme.colorSchemes.bgBlackLight },
    ),
    Secondary(
            colors = { BezierTheme.colorSchemes.gradientFgBlack },
            backgroundColor = { BezierTheme.colorSchemes.bgBlackLight },
    ),
    OverBackground(
            colors = { BezierTheme.colorSchemes.gradientBgGreen },
            backgroundColor = { BezierTheme.colorSchemes.bgAbsoluteWhiteNormal },
    ),
}
