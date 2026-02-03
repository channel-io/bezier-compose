package io.channel.bezier.typography

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import io.channel.bezier.BezierTheme
import io.channel.bezier.dimension.BezierFontSize
import io.channel.bezier.dimension.BezierLetterSpacing
import io.channel.bezier.dimension.BezierLineHeight

object BezierTypography {

    val headingXLarge: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = BezierFontSize.size24,
            lineHeight = BezierLineHeight.height32,
            letterSpacing = BezierLetterSpacing.spacing0,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val headingLarge: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = BezierFontSize.size22,
            lineHeight = BezierLineHeight.height28,
            letterSpacing = BezierLetterSpacing.spacing0,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val headingMedium: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = BezierFontSize.size18,
            lineHeight = BezierLineHeight.height24,
            letterSpacing = BezierLetterSpacing.spacing0,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val headingSmall: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = BezierFontSize.size17,
            lineHeight = BezierLineHeight.height24,
            letterSpacing = BezierLetterSpacing.spacing0,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val headingXSmall: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = BezierFontSize.size16,
            lineHeight = BezierLineHeight.height24,
            letterSpacing = BezierLetterSpacing.spacing0,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val heading2XSmall: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = BezierFontSize.size15,
            lineHeight = BezierLineHeight.height20,
            letterSpacing = BezierLetterSpacing.spacing0,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val textBold2XLarge: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = BezierFontSize.size17,
            lineHeight = BezierLineHeight.height24,
            letterSpacing = BezierLetterSpacing.spacing0,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val textBoldXLarge: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = BezierFontSize.size16,
            lineHeight = BezierLineHeight.height24,
            letterSpacing = BezierLetterSpacing.spacing0,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val textBoldLarge: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = BezierFontSize.size15,
            lineHeight = BezierLineHeight.height20,
            letterSpacing = BezierLetterSpacing.spacing0,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val textBoldMedium: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = BezierFontSize.size14,
            lineHeight = BezierLineHeight.height18,
            letterSpacing = BezierLetterSpacing.spacing0,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val textBoldSmall: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = BezierFontSize.size13,
            lineHeight = BezierLineHeight.height18,
            letterSpacing = BezierLetterSpacing.spacing0,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val textBoldXSmall: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = BezierFontSize.size12,
            lineHeight = BezierLineHeight.height16,
            letterSpacing = BezierLetterSpacing.spacing0,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val textBold2XSmall: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = BezierFontSize.size11,
            lineHeight = BezierLineHeight.height16,
            letterSpacing = BezierLetterSpacing.spacing0,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val textRegular2XLarge: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = TextStyle(
            fontWeight = FontWeight.Normal,
            fontSize = BezierFontSize.size17,
            lineHeight = BezierLineHeight.height24,
            letterSpacing = BezierLetterSpacing.spacing0,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val textRegularXLarge: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = TextStyle(
            fontWeight = FontWeight.Normal,
            fontSize = BezierFontSize.size16,
            lineHeight = BezierLineHeight.height24,
            letterSpacing = BezierLetterSpacing.spacing0,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val textRegularLarge: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = TextStyle(
            fontWeight = FontWeight.Normal,
            fontSize = BezierFontSize.size15,
            lineHeight = BezierLineHeight.height20,
            letterSpacing = BezierLetterSpacing.spacing0,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val textRegularMedium: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = TextStyle(
            fontWeight = FontWeight.Normal,
            fontSize = BezierFontSize.size14,
            lineHeight = BezierLineHeight.height18,
            letterSpacing = BezierLetterSpacing.spacing0,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val textRegularSmall: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = TextStyle(
            fontWeight = FontWeight.Normal,
            fontSize = BezierFontSize.size13,
            lineHeight = BezierLineHeight.height18,
            letterSpacing = BezierLetterSpacing.spacing0,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val textRegularXSmall: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = TextStyle(
            fontWeight = FontWeight.Normal,
            fontSize = BezierFontSize.size12,
            lineHeight = BezierLineHeight.height16,
            letterSpacing = BezierLetterSpacing.spacing0,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val textRegular2XSmall: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = TextStyle(
            fontWeight = FontWeight.Normal,
            fontSize = BezierFontSize.size11,
            lineHeight = BezierLineHeight.height16,
            letterSpacing = BezierLetterSpacing.spacing0,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val displayLarge: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = BezierFontSize.size36,
            lineHeight = BezierLineHeight.height44,
            letterSpacing = BezierLetterSpacing.spacingMinus04,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val displayMedium: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = BezierFontSize.size30,
            lineHeight = BezierLineHeight.height36,
            letterSpacing = BezierLetterSpacing.spacingMinus04,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val codeMedium: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = TextStyle(
            fontWeight = FontWeight.Normal,
            fontSize = BezierFontSize.size14,
            lineHeight = BezierLineHeight.height18,
            letterSpacing = BezierLetterSpacing.spacing0,
            color = BezierTheme.colorsV3.textNeutral,
        )

    val codeSmall: TextStyle
        @Composable
        @ReadOnlyComposable
        get() = TextStyle(
            fontWeight = FontWeight.Normal,
            fontSize = BezierFontSize.size13,
            lineHeight = BezierLineHeight.height18,
            letterSpacing = BezierLetterSpacing.spacing0,
            color = BezierTheme.colorsV3.textNeutral,
        )
}
