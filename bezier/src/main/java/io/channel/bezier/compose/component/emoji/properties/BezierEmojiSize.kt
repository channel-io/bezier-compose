package io.channel.bezier.compose.component.emoji.properties

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.compose.component.badge.chat.properties.BezierChatBadgeSize

enum class BezierEmojiSize(
        internal val size: Dp,
        internal val chatBadgeSize: BezierChatBadgeSize
) {
    Size16(
            size = 16.dp,
            chatBadgeSize = BezierChatBadgeSize.Medium,
    ),
    Size20(
            size = 20.dp,
            chatBadgeSize = BezierChatBadgeSize.Medium,
    ),
    Size24(
            size = 24.dp,
            chatBadgeSize = BezierChatBadgeSize.Medium,
    ),
    Size30(
            size = 30.dp,
            chatBadgeSize = BezierChatBadgeSize.Medium,
    ),
    Size36(
            size = 36.dp,
            chatBadgeSize = BezierChatBadgeSize.Medium,
    ),
    Size42(
            size = 42.dp,
            chatBadgeSize = BezierChatBadgeSize.Medium,
    ),
    Size48(
            size = 48.dp,
            chatBadgeSize = BezierChatBadgeSize.Medium,
    ),
    Size60(
            size = 60.dp,
            chatBadgeSize = BezierChatBadgeSize.Medium,
    ),
    Size72(
            size = 72.dp,
            chatBadgeSize = BezierChatBadgeSize.Medium,
    ),
    Size90(
            size = 90.dp,
            chatBadgeSize = BezierChatBadgeSize.Medium,
    ),
    Size120(
            size = 120.dp,
            chatBadgeSize = BezierChatBadgeSize.Medium,
    ),
}

