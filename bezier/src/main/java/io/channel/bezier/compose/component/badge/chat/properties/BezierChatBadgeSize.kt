package io.channel.bezier.compose.component.badge.chat.properties

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

enum class BezierChatBadgeSize(
        internal val badgeSize: Dp,
        internal val iconSize: Dp,
) {
    Medium(
            badgeSize = 12.dp,
            iconSize = 10.dp,
    ),
    Large(
            badgeSize = 20.dp,
            iconSize = 16.dp,
    ),
}
