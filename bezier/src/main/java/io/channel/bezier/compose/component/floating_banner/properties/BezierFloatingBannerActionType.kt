package io.channel.bezier.compose.component.floating_banner.properties

import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons
import io.channel.bezier.icon.CancelSmall
import io.channel.bezier.icon.ChevronSmallRight

enum class BezierFloatingBannerActionType(
        internal val icon: BezierIcon,
) {
    CloseButton(
            icon = BezierIcons.CancelSmall,
    ),
    ChevronIcon(
            icon = BezierIcons.ChevronSmallRight,
    ),
}
