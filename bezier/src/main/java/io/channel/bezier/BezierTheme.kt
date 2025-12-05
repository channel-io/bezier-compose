package io.channel.bezier

import androidx.compose.foundation.LocalIndication
import androidx.compose.material.LocalContentColor
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import io.channel.bezier.color.*
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

    val colorsV3 = remember(isDark) {
        when (isDark) {
            true -> DarkColor()
            else -> LightColor()
        }
    }

    CompositionLocalProvider(
            LocalColors provides colors,
            LocalColorsV3 provides colorsV3,
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
        @Deprecated("Please Migrate colorsV3")
        get() = LocalColors.current

    val colorsV3: BezierSemanticColorV3
        @Composable
        @ReadOnlyComposable
        get() = LocalColorsV3.current

    fun getColorsV3(): BezierSemanticColorV3 {
        return if (isDark) {
            DarkColor()
        } else {
            LightColor()
        }
    }

    var isDark by mutableStateOf(false)
}

internal val LocalColors = staticCompositionLocalOf { lightColors() }

internal val LocalColorsV3 = staticCompositionLocalOf<BezierSemanticColorV3> { LightColor() }


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
