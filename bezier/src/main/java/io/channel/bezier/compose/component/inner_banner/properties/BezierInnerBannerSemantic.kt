package io.channel.bezier.compose.component.inner_banner.properties

import androidx.compose.runtime.Composable
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.color_v2.BezierColor
import io.channel.bezier.icon.Block
import io.channel.bezier.icon.CheckCircleFilled
import io.channel.bezier.icon.ErrorDiamondFilled
import io.channel.bezier.icon.Info
import io.channel.bezier.icon.Lightbulb

enum class BezierInnerBannerSemantic(
        internal val defaultIcon: BezierIcon,
        internal val backgroundColor: @Composable () -> BezierColor,
        internal val contentColor: @Composable () -> BezierColor,
) {
    Info(
            defaultIcon = BezierIcons.Info,
            backgroundColor = { BezierTheme.colorSchemes.bgBlackLightest },
            contentColor = { BezierTheme.colorSchemes.fgBlackDarker },
    ),
    Tips(
            defaultIcon = BezierIcons.Lightbulb,
            backgroundColor = { BezierTheme.colorSchemes.accentBgLightest },
            contentColor = { BezierTheme.colorSchemes.fgCobaltDark },
    ),
    Success(
            defaultIcon = BezierIcons.CheckCircleFilled,
            backgroundColor = { BezierTheme.colorSchemes.successBgLightest },
            contentColor = { BezierTheme.colorSchemes.fgGreenDark },
    ),
    Warning(
            defaultIcon = BezierIcons.ErrorDiamondFilled,
            backgroundColor = { BezierTheme.colorSchemes.warningBgLightest },
            contentColor = { BezierTheme.colorSchemes.fgOrangeDark },
    ),
    Error(
            defaultIcon = BezierIcons.Block,
            backgroundColor = { BezierTheme.colorSchemes.criticalBgLightest },
            contentColor = { BezierTheme.colorSchemes.criticalFgDark },
    ),
}
