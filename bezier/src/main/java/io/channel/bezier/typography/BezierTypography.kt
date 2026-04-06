package io.channel.bezier.typography

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import io.channel.bezier.BezierTheme
import io.channel.bezier.dimension.BezierFontSize
import io.channel.bezier.dimension.BezierLetterSpacing
import io.channel.bezier.dimension.BezierLineHeight

enum class BezierFontWeight {
    Regular,
    Bold,
}

private fun BezierFontWeight.toFontWeight(): FontWeight = when (this) {
    BezierFontWeight.Regular -> FontWeight.Normal
    BezierFontWeight.Bold -> FontWeight.Bold
}

object BezierTypography {

    // region Display (Bold)

    val displayLarge: TextStyle
        @Composable @ReadOnlyComposable get() = TextStyle(
            fontSize = BezierFontSize.Size36,
            lineHeight = BezierLineHeight.Size44,
            letterSpacing = BezierLetterSpacing.Tighter,
            fontWeight = FontWeight.Bold,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val displayMedium: TextStyle
        @Composable @ReadOnlyComposable get() = TextStyle(
            fontSize = BezierFontSize.Size30,
            lineHeight = BezierLineHeight.Size36,
            letterSpacing = BezierLetterSpacing.Tighter,
            fontWeight = FontWeight.Bold,
            color = BezierTheme.colorsV3.textNeutral,
        )

    // endregion

    // region Heading (Bold)

    val headingXLarge: TextStyle
        @Composable @ReadOnlyComposable get() = TextStyle(
            fontSize = BezierFontSize.Size24,
            lineHeight = BezierLineHeight.Size32,
            letterSpacing = BezierLetterSpacing.Tighter,
            fontWeight = FontWeight.Bold,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val headingLarge: TextStyle
        @Composable @ReadOnlyComposable get() = TextStyle(
            fontSize = BezierFontSize.Size22,
            lineHeight = BezierLineHeight.Size28,
            letterSpacing = BezierLetterSpacing.Tighter,
            fontWeight = FontWeight.Bold,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val headingMedium: TextStyle
        @Composable @ReadOnlyComposable get() = TextStyle(
            fontSize = BezierFontSize.Size18,
            lineHeight = BezierLineHeight.Size24,
            letterSpacing = BezierLetterSpacing.Normal,
            fontWeight = FontWeight.Bold,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val headingSmall: TextStyle
        @Composable @ReadOnlyComposable get() = TextStyle(
            fontSize = BezierFontSize.Size17,
            lineHeight = BezierLineHeight.Size24,
            letterSpacing = BezierLetterSpacing.Tight,
            fontWeight = FontWeight.Bold,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val headingXSmall: TextStyle
        @Composable @ReadOnlyComposable get() = TextStyle(
            fontSize = BezierFontSize.Size16,
            lineHeight = BezierLineHeight.Size24,
            letterSpacing = BezierLetterSpacing.Tight,
            fontWeight = FontWeight.Bold,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val headingXXSmall: TextStyle
        @Composable @ReadOnlyComposable get() = TextStyle(
            fontSize = BezierFontSize.Size15,
            lineHeight = BezierLineHeight.Size20,
            letterSpacing = BezierLetterSpacing.Tight,
            fontWeight = FontWeight.Bold,
            color = BezierTheme.colorsV3.textNeutral,
        )

    // endregion

    // region Text (Regular / Bold)

    @Composable @ReadOnlyComposable
    fun textXXLarge(weight: BezierFontWeight = BezierFontWeight.Regular): TextStyle = TextStyle(
        fontSize = BezierFontSize.Size17,
        lineHeight = BezierLineHeight.Size24,
        letterSpacing = BezierLetterSpacing.Tight,
        fontWeight = weight.toFontWeight(),
        color = BezierTheme.colorsV3.textNeutral,
    )

    @Composable @ReadOnlyComposable
    fun textXLarge(weight: BezierFontWeight = BezierFontWeight.Regular): TextStyle = TextStyle(
        fontSize = BezierFontSize.Size16,
        lineHeight = BezierLineHeight.Size24,
        letterSpacing = BezierLetterSpacing.Tight,
        fontWeight = weight.toFontWeight(),
        color = BezierTheme.colorsV3.textNeutral,
    )

    @Composable @ReadOnlyComposable
    fun textLarge(weight: BezierFontWeight = BezierFontWeight.Regular): TextStyle = TextStyle(
        fontSize = BezierFontSize.Size15,
        lineHeight = BezierLineHeight.Size20,
        letterSpacing = BezierLetterSpacing.Tight,
        fontWeight = weight.toFontWeight(),
        color = BezierTheme.colorsV3.textNeutral,
    )

    @Composable @ReadOnlyComposable
    fun textMedium(weight: BezierFontWeight = BezierFontWeight.Regular): TextStyle = TextStyle(
        fontSize = BezierFontSize.Size14,
        lineHeight = BezierLineHeight.Size18,
        letterSpacing = BezierLetterSpacing.Normal,
        fontWeight = weight.toFontWeight(),
        color = BezierTheme.colorsV3.textNeutral,
    )

    @Composable @ReadOnlyComposable
    fun textSmall(weight: BezierFontWeight = BezierFontWeight.Regular): TextStyle = TextStyle(
        fontSize = BezierFontSize.Size13,
        lineHeight = BezierLineHeight.Size18,
        letterSpacing = BezierLetterSpacing.Normal,
        fontWeight = weight.toFontWeight(),
        color = BezierTheme.colorsV3.textNeutral,
    )

    @Composable @ReadOnlyComposable
    fun textXSmall(weight: BezierFontWeight = BezierFontWeight.Regular): TextStyle = TextStyle(
        fontSize = BezierFontSize.Size12,
        lineHeight = BezierLineHeight.Size16,
        letterSpacing = BezierLetterSpacing.Normal,
        fontWeight = weight.toFontWeight(),
        color = BezierTheme.colorsV3.textNeutral,
    )

    @Composable @ReadOnlyComposable
    fun textXXSmall(weight: BezierFontWeight = BezierFontWeight.Regular): TextStyle = TextStyle(
        fontSize = BezierFontSize.Size11,
        lineHeight = BezierLineHeight.Size16,
        letterSpacing = BezierLetterSpacing.Normal,
        fontWeight = weight.toFontWeight(),
        color = BezierTheme.colorsV3.textNeutral,
    )

    // endregion

    // region Label (Bold)

    val labelLarge: TextStyle
        @Composable @ReadOnlyComposable get() = TextStyle(
            fontSize = BezierFontSize.Size14,
            lineHeight = BezierLineHeight.Size18,
            letterSpacing = BezierLetterSpacing.Normal,
            fontWeight = FontWeight.Bold,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val labelMedium: TextStyle
        @Composable @ReadOnlyComposable get() = TextStyle(
            fontSize = BezierFontSize.Size13,
            lineHeight = BezierLineHeight.Size18,
            letterSpacing = BezierLetterSpacing.Normal,
            fontWeight = FontWeight.Bold,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val labelSmall: TextStyle
        @Composable @ReadOnlyComposable get() = TextStyle(
            fontSize = BezierFontSize.Size12,
            lineHeight = BezierLineHeight.Size16,
            letterSpacing = BezierLetterSpacing.Normal,
            fontWeight = FontWeight.Bold,
            color = BezierTheme.colorsV3.textNeutral,
        )

    // endregion

    // region Caption (Regular / Bold)

    @Composable @ReadOnlyComposable
    fun captionMedium(weight: BezierFontWeight = BezierFontWeight.Regular): TextStyle = TextStyle(
        fontSize = BezierFontSize.Size12,
        lineHeight = BezierLineHeight.Size16,
        letterSpacing = BezierLetterSpacing.Normal,
        fontWeight = weight.toFontWeight(),
        color = BezierTheme.colorsV3.textNeutral,
    )

    @Composable @ReadOnlyComposable
    fun captionSmall(weight: BezierFontWeight = BezierFontWeight.Regular): TextStyle = TextStyle(
        fontSize = BezierFontSize.Size11,
        lineHeight = BezierLineHeight.Size16,
        letterSpacing = BezierLetterSpacing.Normal,
        fontWeight = weight.toFontWeight(),
        color = BezierTheme.colorsV3.textNeutral,
    )

    // endregion

    // region Code (Normal, Monospace)

    val codeMedium: TextStyle
        @Composable @ReadOnlyComposable get() = TextStyle(
            fontSize = BezierFontSize.Size14,
            lineHeight = BezierLineHeight.Size18,
            letterSpacing = BezierLetterSpacing.Normal,
            fontWeight = FontWeight.Normal,
            fontFamily = FontFamily.Monospace,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val codeSmall: TextStyle
        @Composable @ReadOnlyComposable get() = TextStyle(
            fontSize = BezierFontSize.Size13,
            lineHeight = BezierLineHeight.Size18,
            letterSpacing = BezierLetterSpacing.Normal,
            fontWeight = FontWeight.Normal,
            fontFamily = FontFamily.Monospace,
            color = BezierTheme.colorsV3.textNeutral,
        )

    // endregion
}
