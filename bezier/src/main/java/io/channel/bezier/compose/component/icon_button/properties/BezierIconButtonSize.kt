package io.channel.bezier.compose.component.icon_button.properties

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.compose.component.avatar.properties.BezierAvatarSize
import io.channel.bezier.compose.component.emoji.properties.BezierEmojiSize
import io.channel.bezier.compose.component.loader.properties.BezierLoaderSize

enum class BezierIconButtonSize(
        internal val radius: Dp,
        internal val containerPadding: PaddingValues,
        internal val iconSize: Dp,
        internal val emojiSize: BezierEmojiSize,
        internal val avatarSize: BezierAvatarSize,
        internal val loaderSize: BezierLoaderSize,
        internal val slotSize: Dp,
) {
    XSmall(
            radius = 8.dp,
            containerPadding = PaddingValues(4.dp),
            iconSize = 16.dp,
            emojiSize = BezierEmojiSize.Size16,
            avatarSize = BezierAvatarSize.Size16,
            loaderSize = BezierLoaderSize.XXSmall,
            slotSize = 16.dp,
    ),
    Small(
            radius = 10.dp,
            containerPadding = PaddingValues(6.dp),
            iconSize = 20.dp,
            emojiSize = BezierEmojiSize.Size20,
            avatarSize = BezierAvatarSize.Size20,
            loaderSize = BezierLoaderSize.XSmall,
            slotSize = 20.dp,
    ),
    Medium(
            radius = 12.dp,
            containerPadding = PaddingValues(10.dp),
            iconSize = 20.dp,
            emojiSize = BezierEmojiSize.Size20,
            avatarSize = BezierAvatarSize.Size20,
            loaderSize = BezierLoaderSize.XSmall,
            slotSize = 20.dp,
    ),
    Large(
            radius = 14.dp,
            containerPadding = PaddingValues(14.dp),
            iconSize = 20.dp,
            emojiSize = BezierEmojiSize.Size20,
            avatarSize = BezierAvatarSize.Size20,
            loaderSize = BezierLoaderSize.XSmall,
            slotSize = 20.dp
    ),
    XLarge(
            radius = 16.dp,
            containerPadding = PaddingValues(15.dp),
            iconSize = 24.dp,
            emojiSize = BezierEmojiSize.Size24,
            avatarSize = BezierAvatarSize.Size24,
            loaderSize = BezierLoaderSize.Small,
            slotSize = 24.dp,
    ),
}
