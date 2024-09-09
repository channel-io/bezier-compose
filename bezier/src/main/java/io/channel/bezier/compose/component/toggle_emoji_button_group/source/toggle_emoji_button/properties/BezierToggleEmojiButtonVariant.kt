package io.channel.bezier.compose.component.toggle_emoji_button_group.source.toggle_emoji_button.properties

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.color_v2.BezierColor

enum class BezierToggleEmojiButtonVariant(
        internal val borderWidth: Dp,
        internal val selectedBackgroundColor: @Composable () -> BezierColor,
        internal val selectedBorderColor: @Composable () -> BezierColor,
        internal val selectedPressedBackgroundColor: @Composable () -> BezierColor,
        internal val unselectedBackgroundColor: @Composable () -> BezierColor,
        internal val unselectedBorderColor: @Composable () -> BezierColor,
        internal val unselectedPressedBackgroundColor: @Composable () -> BezierColor,
) {
    Primary(
            borderWidth = 1.dp,
            selectedBackgroundColor = { BezierTheme.colorSchemes.bgBlueLightest },
            selectedBorderColor = { BezierTheme.colorSchemes.primaryBgNormal },
            selectedPressedBackgroundColor = { BezierTheme.colorSchemes.bgBlueLighter },
            unselectedBackgroundColor = { BezierTheme.colorSchemes.bgGreyLightest },
            unselectedBorderColor = { BezierTheme.colorSchemes.bgBlackDark },
            unselectedPressedBackgroundColor = { BezierTheme.colorSchemes.bgGreyLighter },
    ),
    Secondary(
            borderWidth = 0.dp,
            selectedBackgroundColor = { BezierTheme.colorSchemes.primaryBgLighter },
            selectedBorderColor = { BezierTheme.colorSchemes.bgWhiteWhiteAlphaTransparent },
            selectedPressedBackgroundColor = { BezierTheme.colorSchemes.primaryBgLight },
            unselectedBackgroundColor = { BezierTheme.colorSchemes.bgBlackLightest },
            unselectedBorderColor = { BezierTheme.colorSchemes.bgWhiteWhiteAlphaTransparent },
            unselectedPressedBackgroundColor = { BezierTheme.colorSchemes.bgBlackLighter },
    );

    internal fun getColorSchemes(selected: Boolean): BezierToggleEmojiButtonColorSchemes {
        return if (selected) {
            BezierToggleEmojiButtonColorSchemes(
                    backgroundColor = selectedBackgroundColor,
                    pressedBackgroundColor = selectedPressedBackgroundColor,
                    borderColor = selectedBorderColor,
            )
        } else {
            BezierToggleEmojiButtonColorSchemes(
                    backgroundColor = unselectedBackgroundColor,
                    pressedBackgroundColor = unselectedPressedBackgroundColor,
                    borderColor = unselectedBorderColor,
            )
        }
    }
}

internal class BezierToggleEmojiButtonColorSchemes(
        val backgroundColor: @Composable () -> BezierColor,
        val pressedBackgroundColor: @Composable () -> BezierColor,
        val borderColor: @Composable () -> BezierColor,
)

