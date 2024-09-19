package io.channel.bezier.compose.component.floating_icon_button.properties

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.compose.component.avatar.properties.BezierAvatarSize
import io.channel.bezier.compose.component.emoji.properties.BezierEmojiSize
import io.channel.bezier.compose.component.loader.properties.BezierLoaderSize

enum class BezierFloatingIconButtonSize(
        internal val contentSize: Dp,
        internal val iconSize: Dp,
        internal val emojiSize: BezierEmojiSize,
        internal val avatarSize: BezierAvatarSize,
        internal val loaderSize: BezierLoaderSize,
        internal val slotSize: Dp,
) {
    XSmall(
            contentSize = 24.dp,
            iconSize = 16.dp,
            emojiSize = BezierEmojiSize.Size16,
            avatarSize = BezierAvatarSize.Size16,
            loaderSize = BezierLoaderSize.XXSmall,
            slotSize = 16.dp,
    ),
    Small(
            contentSize = 32.dp,
            iconSize = 16.dp,
            emojiSize = BezierEmojiSize.Size16,
            avatarSize = BezierAvatarSize.Size16,
            loaderSize = BezierLoaderSize.XSmall,
            slotSize = 16.dp,
    ),
    Medium(
            contentSize = 40.dp,
            iconSize = 20.dp,
            emojiSize = BezierEmojiSize.Size20,
            avatarSize = BezierAvatarSize.Size20,
            loaderSize = BezierLoaderSize.XSmall,
            slotSize = 20.dp,
    ),
    Large(
            contentSize = 44.dp,
            iconSize = 20.dp,
            emojiSize = BezierEmojiSize.Size20,
            avatarSize = BezierAvatarSize.Size20,
            loaderSize = BezierLoaderSize.XSmall,
            slotSize = 20.dp,
    ),
    XLarge(
            contentSize = 54.dp,
            iconSize = 24.dp,
            emojiSize = BezierEmojiSize.Size24,
            avatarSize = BezierAvatarSize.Size24,
            loaderSize = BezierLoaderSize.Small,
            slotSize = 24.dp,
    ),
}
