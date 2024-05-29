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
<<<<<<< HEAD:bezier/src/main/java/io/channel/bezier/compose/BezierTheme.kt
import io.channel.bezier.compose.color.Colors
import io.channel.bezier.compose.color.darkColors
import io.channel.bezier.compose.color.lightColors
import io.channel.bezier.compose.color_v2.ColorSchemes
import io.channel.bezier.compose.color_v2.SemanticTokens
import io.channel.bezier.compose.color_v2.darkFunctionalTokens
import io.channel.bezier.compose.color_v2.lightFunctionalTokens

@Composable
fun BezierTheme(
    content: @Composable () -> Unit,
=======
import io.channel.bezier.color.Colors
import io.channel.bezier.color.darkColors
import io.channel.bezier.color.lightColors
import io.channel.bezier.compose.typography.Typography

@Composable
fun BezierTheme(
        typography: Typography = BezierTheme.typography,
        content: @Composable () -> Unit,
>>>>>>> v2:bezier/src/main/java/io/channel/bezier/BezierTheme.kt
) {
    val isDark = BezierTheme.isDark
    val colors = remember(isDark) {
        when (isDark) {
            true -> darkColors()
            false -> lightColors()
        }
    }

    val functionalColorsV2 = remember(isDark) {
        when (isDark) {
            true -> darkFunctionalTokens()
            false -> lightFunctionalTokens()
        }
    }

    val semanticTokens = remember(functionalColorsV2) {
        SemanticTokens(functionalColorsV2)
    }

    val colorSchemes = ColorSchemes(functionalColorsV2, semanticTokens)


    CompositionLocalProvider(
<<<<<<< HEAD:bezier/src/main/java/io/channel/bezier/compose/BezierTheme.kt
        LocalColors provides colors,
        LocalColorsV2 provides colorSchemes,
        LocalIndication provides rememberRipple(),
        LocalRippleTheme provides BezierRippleTheme,
=======
            LocalColors provides colors,
            LocalTypography provides typography,
            LocalIndication provides rememberRipple(),
            LocalRippleTheme provides BezierRippleTheme,
>>>>>>> v2:bezier/src/main/java/io/channel/bezier/BezierTheme.kt
    ) {
        content()
    }
}

object BezierTheme {

    val colors: Colors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

<<<<<<< HEAD:bezier/src/main/java/io/channel/bezier/compose/BezierTheme.kt
    val colorSchemes: ColorSchemes
        @Composable
        @ReadOnlyComposable
        get() = LocalColorsV2.current
=======
    val typography: Typography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current
>>>>>>> v2:bezier/src/main/java/io/channel/bezier/BezierTheme.kt

    var isDark by mutableStateOf(false)
}

internal val LocalColors = staticCompositionLocalOf { lightColors() }

<<<<<<< HEAD:bezier/src/main/java/io/channel/bezier/compose/BezierTheme.kt
internal val LocalColorsV2 = staticCompositionLocalOf<ColorSchemes> { throw UnsupportedOperationException() }
=======
internal val LocalTypography = staticCompositionLocalOf { Typography() }
>>>>>>> v2:bezier/src/main/java/io/channel/bezier/BezierTheme.kt

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
