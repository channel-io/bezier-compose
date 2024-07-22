package io.channel.bezier.compose.component.button.properties

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme

enum class BezierButtonSize {
    XSmall,
    Small,
    Medium,
    Large,
    XLarge;

    internal val textStyle: TextStyle
        @Composable
        get() = when (this) {
            XSmall -> BezierTheme.typography.caption2SemiBold
            Small -> BezierTheme.typography.caption1SemiBold
            Medium -> BezierTheme.typography.body2SemiBold
            Large -> BezierTheme.typography.body1SemiBold
            XLarge -> BezierTheme.typography.title2SemiBold
        }

    internal val radius: Dp
        get() = when (this) {
            XSmall -> 8.dp
            Small -> 10.dp
            Medium -> 12.dp
            Large -> 14.dp
            XLarge -> 16.dp
        }

    internal val containerPadding: PaddingValues
        get() = when (this) {
            XSmall -> PaddingValues(horizontal = 6.dp, vertical = 3.dp)
            Small -> PaddingValues(horizontal = 8.dp, vertical = 6.dp)
            Medium -> PaddingValues(horizontal = 12.dp, vertical = 9.dp)
            Large -> PaddingValues(horizontal = 14.dp, vertical = 11.dp)
            XLarge -> PaddingValues(horizontal = 16.dp, vertical = 15.dp)
        }

    internal val textPadding: PaddingValues
        get() = when (this) {
            XSmall -> PaddingValues(horizontal = 3.dp, vertical = 0.dp)
            Small -> PaddingValues(horizontal = 4.dp, vertical = 1.dp)
            Medium -> PaddingValues(horizontal = 4.dp, vertical = 0.dp)
            Large -> PaddingValues(horizontal = 5.dp, vertical = 1.dp)
            XLarge -> PaddingValues(horizontal = 6.dp, vertical = 0.dp)
        }

    internal val iconSize: Dp
        get() = when (this) {
            XSmall,
            Small -> 16.dp

            Medium,
            Large -> 20.dp

            XLarge -> 24.dp
        }
}
