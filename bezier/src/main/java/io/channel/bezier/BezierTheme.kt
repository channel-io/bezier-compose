package io.channel.bezier

import androidx.compose.foundation.LocalIndication
import androidx.compose.material.LocalContentColor
import androidx.compose.material.LocalRippleConfiguration
import androidx.compose.material.RippleConfiguration
import androidx.compose.material.RippleDefaults
import androidx.compose.material.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import io.channel.bezier.color.Colors
import io.channel.bezier.color.darkColors
import io.channel.bezier.color.lightColors

@Composable
fun BezierTheme(
        isDark: Boolean = BezierTheme.isDark,
        content: @Composable () -> Unit,
) {
    val colors = remember(isDark) {
        when (isDark) {
            true -> darkColors()
            false -> lightColors()
        }
    }

    val contentColor = LocalContentColor.current
    val rippleConfiguration = remember(isDark, contentColor) {
        RippleConfiguration(
                color = RippleDefaults.rippleColor(contentColor, isDark),
                rippleAlpha = RippleDefaults.rippleAlpha(contentColor, isDark),
        )
    }
    CompositionLocalProvider(
            LocalColors provides colors,
            LocalIndication provides ripple(),
            LocalRippleConfiguration provides rippleConfiguration,
    ) {
        content()
    }
}

object BezierTheme {

    val colors: Colors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    var isDark by mutableStateOf(false)
}

internal val LocalColors = staticCompositionLocalOf { lightColors() }
