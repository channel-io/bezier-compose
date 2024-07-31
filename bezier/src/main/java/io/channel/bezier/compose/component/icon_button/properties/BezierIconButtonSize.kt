package io.channel.bezier.compose.component.icon_button.properties

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.compose.component.avatar.properties.BezierAvatarSize

enum class BezierIconButtonSize(
        internal val radius: Dp,
        internal val containerPadding: PaddingValues,
        internal val iconSize: Dp,
        internal val emojiSize: Dp,
        internal val avatarSize: BezierAvatarSize,
) {
    XSmall(
            radius = 8.dp,
            containerPadding = PaddingValues(4.dp),
            iconSize = 16.dp,
            emojiSize = 16.dp,
            avatarSize = BezierAvatarSize.Size16,
    ),
    Small(
            radius = 10.dp,
            containerPadding = PaddingValues(6.dp),
            iconSize = 16.dp,
            emojiSize = 16.dp,
            avatarSize = BezierAvatarSize.Size16,
    ),
    Medium(
            radius = 12.dp,
            containerPadding = PaddingValues(10.dp),
            iconSize = 20.dp,
            emojiSize = 20.dp,
            avatarSize = BezierAvatarSize.Size20,
    ),
    Large(
            radius = 14.dp,
            containerPadding = PaddingValues(14.dp),
            iconSize = 20.dp,
            emojiSize = 20.dp,
            avatarSize = BezierAvatarSize.Size20,
    ),
    XLarge(
            radius = 16.dp,
            containerPadding = PaddingValues(15.dp),
            iconSize = 24.dp,
            emojiSize = 24.dp,
            avatarSize = BezierAvatarSize.Size24,
    ),
}
