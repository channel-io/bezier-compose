package io.channel.bezier.compose.component.floating_icon_button.properties

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.component.avatar.properties.BezierAvatarSize

enum class BezierFloatingIconButtonSize(
        internal val containerPadding: PaddingValues,
        internal val iconSize: Dp,
        internal val emojiSize: Dp,
        internal val avatarSize: BezierAvatarSize,
) {
    XSmall(
            containerPadding = PaddingValues(4.dp),
            iconSize = 16.dp,
            emojiSize = 16.dp,
            avatarSize = BezierAvatarSize.Size16,
    ),
    Small(
            containerPadding = PaddingValues(6.dp),
            iconSize = 16.dp,
            emojiSize = 16.dp,
            avatarSize = BezierAvatarSize.Size16,
    ),
    Medium(
            containerPadding = PaddingValues(10.dp),
            iconSize = 20.dp,
            emojiSize = 20.dp,
            avatarSize = BezierAvatarSize.Size20,
    ),
    Large(
            containerPadding = PaddingValues(14.dp),
            iconSize = 20.dp,
            emojiSize = 20.dp,
            avatarSize = BezierAvatarSize.Size20,
    ),
    XLarge(
            containerPadding = PaddingValues(15.dp),
            iconSize = 24.dp,
            emojiSize = 24.dp,
            avatarSize = BezierAvatarSize.Size24,
    ),
}
