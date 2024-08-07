package io.channel.bezier.compose.component.inner_banner.properties

import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons
import io.channel.bezier.icon.CancelSmall
import io.channel.bezier.icon.ChevronSmallRight

enum class BezierInnerBannerActionType(
        internal val icon: BezierIcon,
) {
    CloseButton(
            icon = BezierIcons.CancelSmall,
    ),
    ChevronIcon(
            icon = BezierIcons.ChevronSmallRight,
    ),
}
