package io.channel.bezier.compose.component.button.properties

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.component.avatar.properties.BezierAvatarSize

enum class BezierButtonSize(
        internal val textStyle: @Composable () -> TextStyle,
        internal val radius: Dp,
        internal val containerPadding: PaddingValues,
        internal val textPadding: PaddingValues,
        internal val iconSize: Dp,
        internal val avatarSize: BezierAvatarSize,
) {
    XSmall(
            textStyle = { BezierTheme.typography.caption2SemiBold },
            radius = 8.dp,
            containerPadding = PaddingValues(horizontal = 6.dp, vertical = 3.dp),
            textPadding = PaddingValues(horizontal = 3.dp, vertical = 0.dp),
            iconSize = 16.dp,
            avatarSize = BezierAvatarSize.Size16,
    ),
    Small(
            textStyle = { BezierTheme.typography.caption1SemiBold },
            radius = 10.dp,
            containerPadding = PaddingValues(horizontal = 8.dp, vertical = 6.dp),
            textPadding = PaddingValues(horizontal = 4.dp, vertical = 1.dp),
            iconSize = 16.dp,
            avatarSize = BezierAvatarSize.Size16,
    ),
    Medium(
            textStyle = { BezierTheme.typography.body2SemiBold },
            radius = 12.dp,
            containerPadding = PaddingValues(horizontal = 12.dp, vertical = 9.dp),
            textPadding = PaddingValues(horizontal = 4.dp, vertical = 0.dp),
            iconSize = 20.dp,
            avatarSize = BezierAvatarSize.Size20,
    ),
    Large(
            textStyle = { BezierTheme.typography.body1SemiBold },
            radius = 14.dp,
            containerPadding = PaddingValues(horizontal = 14.dp, vertical = 11.dp),
            textPadding = PaddingValues(horizontal = 5.dp, vertical = 1.dp),
            iconSize = 20.dp,
            avatarSize = BezierAvatarSize.Size20,
    ),
    XLarge(
            textStyle = { BezierTheme.typography.title2SemiBold },
            radius = 16.dp,
            containerPadding = PaddingValues(horizontal = 16.dp, vertical = 15.dp),
            textPadding = PaddingValues(horizontal = 6.dp, vertical = 0.dp),
            iconSize = 24.dp,
            avatarSize = BezierAvatarSize.Size24,
    ),
}
