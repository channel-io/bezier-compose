package io.channel.bezier.compose.component.loader.properties

import androidx.compose.runtime.Composable
import io.channel.bezier.compose.color_v2.BezierColor
import io.channel.bezier.BezierTheme

enum class BezierLoaderVariant(
        internal val backgroundColor: @Composable () -> BezierColor,
        internal val foregroundColor: @Composable () -> BezierColor,
) {
    Primary(
            backgroundColor = { BezierTheme.colorSchemes.primaryBgLightest },
            foregroundColor = { BezierTheme.colorSchemes.fgBlueNormal },
    ),
    Secondary(
            backgroundColor = { BezierTheme.colorSchemes.bgBlackLight },
            foregroundColor = { BezierTheme.colorSchemes.fgBlackLight },
    ),
    OnOverlay(
            backgroundColor = { BezierTheme.colorSchemes.bgAbsoluteWhiteLightest },
            foregroundColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteLight },
    ),
}
