package io.channel.bezier

import androidx.compose.foundation.LocalIndication
<<<<<<< HEAD:bezier/src/main/java/io/channel/bezier/compose/BezierTheme.kt
=======
import androidx.compose.material.LocalContentColor
>>>>>>> upstream/v2:bezier/src/main/java/io/channel/bezier/BezierTheme.kt
import androidx.compose.material.ripple.LocalRippleTheme
import androidx.compose.material.ripple.RippleAlpha
import androidx.compose.material.ripple.RippleTheme
import androidx.compose.material.ripple.rememberRipple
<<<<<<< HEAD:bezier/src/main/java/io/channel/bezier/compose/BezierTheme.kt
import androidx.compose.material3.LocalContentColor
=======
>>>>>>> upstream/v2:bezier/src/main/java/io/channel/bezier/BezierTheme.kt
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
import io.channel.bezier.compose.typography.Typography
=======
import io.channel.bezier.color.Colors
import io.channel.bezier.color.darkColors
import io.channel.bezier.color.lightColors
>>>>>>> upstream/v2:bezier/src/main/java/io/channel/bezier/BezierTheme.kt

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
