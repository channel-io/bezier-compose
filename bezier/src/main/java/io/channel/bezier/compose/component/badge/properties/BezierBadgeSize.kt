package io.channel.bezier.compose.component.badge.properties

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme

enum class BezierBadgeSize(
        internal val textStyle: @Composable () -> TextStyle,
        internal val iconSize: Dp,
        internal val backgroundPadding: PaddingValues,
        internal val textPadding: PaddingValues,
        internal val contentGap: Dp,
        internal val radius: Dp,
) {
    Small(
            textStyle = { BezierTheme.typography.caption3SemiBold },
            iconSize = 12.dp,
            backgroundPadding = PaddingValues(horizontal = 3.dp, vertical = 1.dp),
            textPadding = PaddingValues(horizontal = 2.dp),
            contentGap = 0.dp,
            radius = 4.dp,
    ),
    Large(
            textStyle = { BezierTheme.typography.body2SemiBold },
            iconSize = 16.dp,
            backgroundPadding = PaddingValues(horizontal = 8.dp, vertical = 3.dp),
            textPadding = PaddingValues(horizontal = 3.dp),
            contentGap = 3.dp,
            radius = 7.dp,
    ),
}
