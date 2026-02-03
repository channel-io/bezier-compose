package io.channel.bezier

import androidx.compose.foundation.LocalIndication
import androidx.compose.material.LocalContentColor
import androidx.compose.material.LocalRippleConfiguration
import androidx.compose.material.RippleConfiguration
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import io.channel.bezier.color.BezierSemanticColorV3
import io.channel.bezier.color.Colors
import io.channel.bezier.color.DarkColor
import io.channel.bezier.color.LightColor
import io.channel.bezier.color.darkColors
import io.channel.bezier.color.lightColors
import io.channel.bezier.typography.BezierTypography

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
            false -> LightColor()
        }
    }

    val contentColor = if (isDark) {
        colorsV3.fillAbsoluteWhite
    } else {
        colorsV3.fillAbsoluteBlack
    }

    val rippleConfiguration = remember(isDark, contentColor) {
        RippleConfiguration(
                color = contentColor,
                rippleAlpha = RippleAlpha(
                        pressedAlpha = 0.12f,
                        focusedAlpha = 0.12f,
                        draggedAlpha = 0.08f,
                        hoveredAlpha = 0.04f,
                ),
        )
    }
    CompositionLocalProvider(
            LocalColors provides colors,
            LocalColorsV3 provides colorsV3,
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
        @Deprecated("Please Migrate colorsV3")
        get() = LocalColors.current

    val colorsV3: BezierSemanticColorV3
        @Composable
        @ReadOnlyComposable
        get() = LocalColorsV3.current

    val typography: BezierTypography = BezierTypography

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
