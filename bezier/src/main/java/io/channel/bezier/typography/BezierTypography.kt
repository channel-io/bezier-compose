package io.channel.bezier.typography

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import io.channel.bezier.dimension.BezierFontSize
import io.channel.bezier.dimension.BezierLetterSpacing
import io.channel.bezier.dimension.BezierLineHeight

enum class BezierWeight {
    Regular,
    Bold,
}

@Suppress("EnumEntryName")
enum class BezierTypo(
    internal val fontSize: TextUnit,
    internal val lineHeight: TextUnit,
    internal val letterSpacing: TextUnit,
    internal val fixedWeight: FontWeight? = null,
    internal val isMonospace: Boolean = false,
) {
    // Display (fixed Bold)
    displayLarge(BezierFontSize.Size36, BezierLineHeight.Size44, BezierLetterSpacing.Tighter, fixedWeight = FontWeight.Bold),
    displayMedium(BezierFontSize.Size30, BezierLineHeight.Size36, BezierLetterSpacing.Tighter, fixedWeight = FontWeight.Bold),

    // Heading (fixed Bold)
    headingXLarge(BezierFontSize.Size24, BezierLineHeight.Size32, BezierLetterSpacing.Tighter, fixedWeight = FontWeight.Bold),
    headingLarge(BezierFontSize.Size22, BezierLineHeight.Size28, BezierLetterSpacing.Tighter, fixedWeight = FontWeight.Bold),
    headingMedium(BezierFontSize.Size18, BezierLineHeight.Size24, BezierLetterSpacing.Normal, fixedWeight = FontWeight.Bold),
    headingSmall(BezierFontSize.Size17, BezierLineHeight.Size24, BezierLetterSpacing.Tight, fixedWeight = FontWeight.Bold),
    headingXSmall(BezierFontSize.Size16, BezierLineHeight.Size24, BezierLetterSpacing.Tight, fixedWeight = FontWeight.Bold),
    headingXXSmall(BezierFontSize.Size15, BezierLineHeight.Size20, BezierLetterSpacing.Tight, fixedWeight = FontWeight.Bold),

    // Text (weight param supported)
    textXXLarge(BezierFontSize.Size17, BezierLineHeight.Size24, BezierLetterSpacing.Tight),
    textXLarge(BezierFontSize.Size16, BezierLineHeight.Size24, BezierLetterSpacing.Tight),
    textLarge(BezierFontSize.Size15, BezierLineHeight.Size20, BezierLetterSpacing.Tight),
    textMedium(BezierFontSize.Size14, BezierLineHeight.Size18, BezierLetterSpacing.Normal),
    textSmall(BezierFontSize.Size13, BezierLineHeight.Size18, BezierLetterSpacing.Normal),
    textXSmall(BezierFontSize.Size12, BezierLineHeight.Size16, BezierLetterSpacing.Normal),
    textXXSmall(BezierFontSize.Size11, BezierLineHeight.Size16, BezierLetterSpacing.Normal),

    // Label (fixed Bold)
    labelLarge(BezierFontSize.Size14, BezierLineHeight.Size18, BezierLetterSpacing.Normal, fixedWeight = FontWeight.Bold),
    labelMedium(BezierFontSize.Size13, BezierLineHeight.Size18, BezierLetterSpacing.Normal, fixedWeight = FontWeight.Bold),
    labelSmall(BezierFontSize.Size12, BezierLineHeight.Size16, BezierLetterSpacing.Normal, fixedWeight = FontWeight.Bold),

    // Caption (weight param supported)
    captionMedium(BezierFontSize.Size12, BezierLineHeight.Size16, BezierLetterSpacing.Normal),
    captionSmall(BezierFontSize.Size11, BezierLineHeight.Size16, BezierLetterSpacing.Normal),

    // Code (fixed Normal, monospace)
    codeMedium(BezierFontSize.Size14, BezierLineHeight.Size18, BezierLetterSpacing.Normal, fixedWeight = FontWeight.Normal, isMonospace = true),
    codeSmall(BezierFontSize.Size13, BezierLineHeight.Size18, BezierLetterSpacing.Normal, fixedWeight = FontWeight.Normal, isMonospace = true),
}
