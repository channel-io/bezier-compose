package io.channel.bezier.compose.component.floating_icon_button.properties

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.compose.component.avatar.properties.BezierAvatarSize

enum class BezierFloatingIconButtonSize(
        internal val contentSize: Dp,
        internal val iconSize: Dp,
        internal val emojiSize: Dp,
        internal val avatarSize: BezierAvatarSize,
) {
    XSmall(
            contentSize = 24.dp,
            iconSize = 16.dp,
            emojiSize = 16.dp,
            avatarSize = BezierAvatarSize.Size16,
    ),
    Small(
            contentSize = 32.dp,
            iconSize = 16.dp,
            emojiSize = 16.dp,
            avatarSize = BezierAvatarSize.Size16,
    ),
    Medium(
            contentSize = 40.dp,
            iconSize = 20.dp,
            emojiSize = 20.dp,
            avatarSize = BezierAvatarSize.Size20,
    ),
    Large(
            contentSize = 44.dp,
            iconSize = 20.dp,
            emojiSize = 20.dp,
            avatarSize = BezierAvatarSize.Size20,
    ),
    XLarge(
            contentSize = 54.dp,
            iconSize = 24.dp,
            emojiSize = 24.dp,
            avatarSize = BezierAvatarSize.Size24,
    ),
}
