package io.channel.bezier

import androidx.compose.foundation.LocalIndication
import androidx.compose.material.ExperimentalMaterialApi
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import io.channel.bezier.color.Colors
import io.channel.bezier.color.darkColors
import io.channel.bezier.color.lightColors
import io.channel.bezier.compose.color_v2.ColorSchemes
import io.channel.bezier.compose.color_v2.SemanticTokens
import io.channel.bezier.compose.color_v2.darkFunctionalTokens
import io.channel.bezier.compose.color_v2.lightFunctionalTokens
import io.channel.bezier.compose.typography.Typography

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BezierTheme(
        isDark: Boolean = BezierTheme.isDark,
        typography: Typography = BezierTheme.typography,
        content: @Composable () -> Unit,
) {
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

    val contentColor = LocalContentColor.current
    val rippleConfiguration = RippleConfiguration(
            color = if (isDark && contentColor.luminance() < 0.5) {
                Color.White
            } else {
                contentColor
            },
            rippleAlpha = RippleDefaults.rippleAlpha(contentColor, !isDark),
    )


    CompositionLocalProvider(
            LocalColors provides colors,
            LocalColorsV2 provides colorSchemes,
            LocalIndication provides ripple(),
            LocalRippleConfiguration provides rippleConfiguration,
            LocalTypography provides typography,
    ) {
        content()
    }
}

object BezierTheme {

    val colors: Colors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current

    val colorSchemes: ColorSchemes
        @Composable
        @ReadOnlyComposable
        get() = LocalColorsV2.current

    val typography: Typography
        @Composable
        @ReadOnlyComposable
        get() = LocalTypography.current

    var isDark by mutableStateOf(false)
}

internal val LocalColors = staticCompositionLocalOf { lightColors() }

internal val LocalColorsV2 = staticCompositionLocalOf<ColorSchemes> { throw UnsupportedOperationException() }
internal val LocalTypography = staticCompositionLocalOf { Typography() }
