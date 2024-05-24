package io.channel.bezier

import androidx.compose.foundation.LocalIndication
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.LocalContentColor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import io.channel.bezier.color.Colors
import io.channel.bezier.color.darkColors
import io.channel.bezier.color.lightColors
import io.channel.bezier.compose.typography.Typography

@Composable
fun BezierTheme(
        typography: Typography = BezierTheme.typography,
        content: @Composable () -> Unit,
) {
    val isDark = BezierTheme.isDark
    val colors = remember(isDark) {
        when (isDark) {
            true -> darkColors()
            false -> lightColors()
        }
    }

    CompositionLocalProvider(
            LocalColors provides colors,
            LocalTypography provides typography,
            LocalIndication provides rememberRipple(),
            LocalRippleTheme provides BezierRippleTheme,
    ) {
        content()
    }
}

object BezierTheme {

    val colors: Colors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    val typography: Typography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current

    var isDark by mutableStateOf(false)
}

internal val LocalColors = staticCompositionLocalOf { lightColors() }

internal val LocalTypography = staticCompositionLocalOf { Typography() }

private object BezierRippleTheme : RippleTheme {
    @Composable
    override fun defaultColor(): Color = RippleTheme.defaultRippleColor(
            contentColor = LocalContentColor.current,
            lightTheme = !BezierTheme.isDark,
    )

    @Composable
    override fun rippleAlpha(): RippleAlpha = RippleTheme.defaultRippleAlpha(
            contentColor = LocalContentColor.current,
            lightTheme = !BezierTheme.isDark,
    )
}
