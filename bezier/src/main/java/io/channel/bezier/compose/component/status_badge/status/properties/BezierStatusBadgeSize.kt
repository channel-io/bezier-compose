package io.channel.bezier.compose.component.status_badge.status.properties

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

enum class BezierStatusBadgeSize(
        internal val badgeSize: Dp,
        internal val dotSize: Dp,
        internal val moonSize: Dp,
) {
    Medium(
            badgeSize = 12.dp,
            dotSize = 8.dp,
            moonSize = 10.dp,
    ),
    Large(
            badgeSize = 20.dp,
            dotSize = 14.dp,
            moonSize = 16.dp,
    ),
}
