package io.channel.bezier.compose.component.checkbox.properties

import androidx.compose.runtime.Composable
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.color_v2.BezierColor

internal class BezierCheckboxColorScheme(
        val backgroundColor: @Composable () -> BezierColor,
        val iconColor: @Composable () -> BezierColor,
)

enum class BezierCheckboxColor(
        private val primaryCheckedColorScheme: BezierCheckboxColorScheme,
        private val primaryUncheckedColorScheme: BezierCheckboxColorScheme,
        private val secondaryCheckedColorScheme: BezierCheckboxColorScheme,
        private val secondaryUncheckedColorScheme: BezierCheckboxColorScheme,
) {
    Blue(
            primaryCheckedColorScheme = BezierCheckboxColorScheme(
                    backgroundColor = { BezierTheme.colorSchemes.primaryBgNormal },
                    iconColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteDark },
            ),
            primaryUncheckedColorScheme = BezierCheckboxColorScheme(
                    backgroundColor = { BezierTheme.colorSchemes.bgBlackDark },
                    iconColor = { BezierTheme.colorSchemes.bgWhiteNormal },
            ),
            secondaryCheckedColorScheme = BezierCheckboxColorScheme(
                    backgroundColor = { io.channel.bezier.compose.component.button.properties.Transparent },
                    iconColor = { BezierTheme.colorSchemes.primaryBgNormal },
            ),
            secondaryUncheckedColorScheme = BezierCheckboxColorScheme(
                    backgroundColor = { io.channel.bezier.compose.component.button.properties.Transparent },
                    iconColor = { BezierTheme.colorSchemes.fgBlackDark },
            ),
    ),
    Green(
            primaryCheckedColorScheme = BezierCheckboxColorScheme(
                    backgroundColor = { BezierTheme.colorSchemes.bgBlackDark },
                    iconColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteDark },
            ),
            primaryUncheckedColorScheme = BezierCheckboxColorScheme(
                    backgroundColor = { BezierTheme.colorSchemes.bgWhiteNormal },
                    iconColor = { io.channel.bezier.compose.component.button.properties.Transparent },
            ),
            secondaryCheckedColorScheme = BezierCheckboxColorScheme(
                    backgroundColor = { io.channel.bezier.compose.component.button.properties.Transparent },
                    iconColor = { BezierTheme.colorSchemes.bgGreenNormal },
            ),
            secondaryUncheckedColorScheme = BezierCheckboxColorScheme(
                    backgroundColor = { io.channel.bezier.compose.component.button.properties.Transparent },
                    iconColor = { BezierTheme.colorSchemes.fgBlackDark },
            ),
    );

    @Composable
    internal fun getColorSchemes(
            variant: BezierCheckboxVariant,
            status: BezierCheckboxStatus,
    ): BezierCheckboxColorScheme {
        return when (variant) {
            BezierCheckboxVariant.Primary -> when (status) {
                BezierCheckboxStatus.False -> primaryUncheckedColorScheme
                BezierCheckboxStatus.True,
                BezierCheckboxStatus.Indeterminate -> primaryCheckedColorScheme
            }

            BezierCheckboxVariant.Secondary -> when (status) {
                BezierCheckboxStatus.Indeterminate,
                BezierCheckboxStatus.False -> secondaryUncheckedColorScheme

                BezierCheckboxStatus.True -> secondaryCheckedColorScheme
            }
        }
    }
}

