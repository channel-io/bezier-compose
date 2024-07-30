package io.channel.bezier.compose.component.badge.status.properties

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

enum class BezierStatusBadgeSize(
        val badgeSize: Dp,
        val dotSize: Dp,
        val moonSize: Dp,
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
