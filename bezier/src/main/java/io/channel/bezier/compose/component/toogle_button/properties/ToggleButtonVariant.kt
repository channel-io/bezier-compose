package io.channel.bezier.compose.component.toogle_button.properties

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.color_v2.BezierColor

enum class ToggleButtonVariant(
        internal val borderWidth: Dp,
        internal val selectedBackgroundColor: @Composable () -> BezierColor,
        internal val selectedBorderColor: @Composable () -> BezierColor,
        internal val selectedContentColor: @Composable () -> BezierColor,
        internal val selectedPressedBackgroundColor: @Composable () -> BezierColor,
        internal val unselectedBackgroundColor: @Composable () -> BezierColor,
        internal val unselectedBorderColor: @Composable () -> BezierColor,
        internal val unselectedContentColor: @Composable () -> BezierColor,
        internal val unselectedPressedBackgroundColor: @Composable () -> BezierColor,
) {
    Primary(
            borderWidth = 1.dp,
            selectedBackgroundColor = { BezierTheme.colorSchemes.bgBlueLightest },
            selectedBorderColor = { BezierTheme.colorSchemes.primaryBgNormal },
            selectedContentColor = { BezierTheme.colorSchemes.fgBlueNormal },
            selectedPressedBackgroundColor = { BezierTheme.colorSchemes.bgBlueLighter },
            unselectedBackgroundColor = { BezierTheme.colorSchemes.bgGreyLightest },
            unselectedBorderColor = { BezierTheme.colorSchemes.bgBlackDark },
            unselectedContentColor = { BezierTheme.colorSchemes.fgBlackDarkest },
            unselectedPressedBackgroundColor = { BezierTheme.colorSchemes.bgGreyLighter },
    ),
    Secondary(
            borderWidth = 0.dp,
            selectedBackgroundColor = { BezierTheme.colorSchemes.primaryBgLighter },
            selectedBorderColor = { BezierTheme.colorSchemes.bgWhiteWhiteAlphaTransparent },
            selectedContentColor = { BezierTheme.colorSchemes.fgBlueNormal },
            selectedPressedBackgroundColor = { BezierTheme.colorSchemes.primaryBgLight },
            unselectedBackgroundColor = { BezierTheme.colorSchemes.bgBlackLightest },
            unselectedBorderColor = { BezierTheme.colorSchemes.bgWhiteWhiteAlphaTransparent },
            unselectedContentColor = { BezierTheme.colorSchemes.fgBlackDarkest },
            unselectedPressedBackgroundColor = { BezierTheme.colorSchemes.bgBlackLighter },
    );

    internal fun getColorSchemes(selected: Boolean): BezierToggleButtonColorSchemes {
        return if (selected) {
            BezierToggleButtonColorSchemes(
                    backgroundColor = selectedBackgroundColor,
                    pressedBackgroundColor = selectedPressedBackgroundColor,
                    borderColor = selectedBorderColor,
                    contentColor = selectedContentColor,
            )
        } else {
            BezierToggleButtonColorSchemes(
                    backgroundColor = unselectedBackgroundColor,
                    pressedBackgroundColor = unselectedPressedBackgroundColor,
                    borderColor = unselectedBorderColor,
                    contentColor = unselectedContentColor,
            )
        }
    }
}

internal class BezierToggleButtonColorSchemes(
        val backgroundColor: @Composable () -> BezierColor,
        val pressedBackgroundColor: @Composable () -> BezierColor,
        val borderColor: @Composable () -> BezierColor,
        val contentColor: @Composable () -> BezierColor,
)

