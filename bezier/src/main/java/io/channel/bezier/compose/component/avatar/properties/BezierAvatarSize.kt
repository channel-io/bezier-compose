package io.channel.bezier.compose.component.avatar.properties

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.compose.component.badge.chat.properties.BezierChatBadgeSize
import io.channel.bezier.compose.component.badge.status.properties.BezierStatusBadgeSize

/**
 * 정의되지 않은 값에 대한 fallback 입니다.
 */
private val DefaultIntegrationBadgeSize = 16.dp

enum class BezierAvatarSize(
        internal val size: Dp,
        internal val outlineBorderWidth: Dp,
        internal val statusBadgeSize: BezierStatusBadgeSize,
        internal val chatBadgeSize: BezierChatBadgeSize,
        internal val integrationBadgeSize: Dp,
        internal val badgeOffset: Dp,
) {
    Size16(
            size = 16.dp,
            outlineBorderWidth = 2.dp,
            statusBadgeSize = BezierStatusBadgeSize.Medium,
            chatBadgeSize = BezierChatBadgeSize.Medium,
            integrationBadgeSize = DefaultIntegrationBadgeSize,
            badgeOffset = 4.dp,
    ),
    Size20(
            size = 20.dp,
            outlineBorderWidth = 2.dp,
            statusBadgeSize = BezierStatusBadgeSize.Medium,
            chatBadgeSize = BezierChatBadgeSize.Medium,
            integrationBadgeSize = DefaultIntegrationBadgeSize,
            badgeOffset = 4.dp,
    ),
    Size24(
            size = 24.dp,
            outlineBorderWidth = 2.dp,
            statusBadgeSize = BezierStatusBadgeSize.Medium,
            chatBadgeSize = BezierChatBadgeSize.Medium,
            integrationBadgeSize = 16.dp,
            badgeOffset = 4.dp,
    ),
    Size30(
            size = 30.dp,
            outlineBorderWidth = 2.dp,
            statusBadgeSize = BezierStatusBadgeSize.Medium,
            chatBadgeSize = BezierChatBadgeSize.Medium,
            integrationBadgeSize = DefaultIntegrationBadgeSize,
            badgeOffset = 4.dp,
    ),
    Size36(
            size = 36.dp,
            outlineBorderWidth = 2.dp,
            statusBadgeSize = BezierStatusBadgeSize.Medium,
            chatBadgeSize = BezierChatBadgeSize.Medium,
            integrationBadgeSize = DefaultIntegrationBadgeSize,
            badgeOffset = 3.dp,
    ),
    Size42(
            size = 42.dp,
            outlineBorderWidth = 2.dp,
            statusBadgeSize = BezierStatusBadgeSize.Medium,
            chatBadgeSize = BezierChatBadgeSize.Medium,
            integrationBadgeSize = 20.dp,
            badgeOffset = 2.dp,
    ),
    Size48(
            size = 48.dp,
            outlineBorderWidth = 2.dp,
            statusBadgeSize = BezierStatusBadgeSize.Medium,
            chatBadgeSize = BezierChatBadgeSize.Medium,
            integrationBadgeSize = 20.dp,
            badgeOffset = 2.dp,
    ),
    Size72(
            size = 72.dp,
            outlineBorderWidth = 2.dp,
            statusBadgeSize = BezierStatusBadgeSize.Large,
            chatBadgeSize = BezierChatBadgeSize.Large,
            integrationBadgeSize = DefaultIntegrationBadgeSize,
            badgeOffset = (-2).dp,
    ),
    Size90(
            size = 90.dp,
            outlineBorderWidth = 2.dp,
            statusBadgeSize = BezierStatusBadgeSize.Large,
            chatBadgeSize = BezierChatBadgeSize.Large,
            integrationBadgeSize = DefaultIntegrationBadgeSize,
            badgeOffset = (-2).dp,
    ),
    Size120(
            size = 120.dp,
            outlineBorderWidth = 2.dp,
            statusBadgeSize = BezierStatusBadgeSize.Large,
            chatBadgeSize = BezierChatBadgeSize.Large,
            integrationBadgeSize = DefaultIntegrationBadgeSize,
            badgeOffset = (-2).dp,
    ),
}
