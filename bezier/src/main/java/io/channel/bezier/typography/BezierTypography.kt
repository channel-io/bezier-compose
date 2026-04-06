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

enum class BezierTypo(
     val fontSize: TextUnit,
     val lineHeight: TextUnit,
     val letterSpacing: TextUnit,
     val fixedWeight: FontWeight? = null,
     val isMonospace: Boolean = false,
) {
    // Display (fixed Bold)
    DisplayLarge(BezierFontSize.Size36, BezierLineHeight.Size44, BezierLetterSpacing.Tighter, fixedWeight = FontWeight.Bold),
    DisplayMedium(BezierFontSize.Size30, BezierLineHeight.Size36, BezierLetterSpacing.Tighter, fixedWeight = FontWeight.Bold),

    // Heading (fixed Bold)
    HeadingXLarge(BezierFontSize.Size24, BezierLineHeight.Size32, BezierLetterSpacing.Tighter, fixedWeight = FontWeight.Bold),
    HeadingLarge(BezierFontSize.Size22, BezierLineHeight.Size28, BezierLetterSpacing.Tighter, fixedWeight = FontWeight.Bold),
    HeadingMedium(BezierFontSize.Size18, BezierLineHeight.Size24, BezierLetterSpacing.Normal, fixedWeight = FontWeight.Bold),
    HeadingSmall(BezierFontSize.Size17, BezierLineHeight.Size24, BezierLetterSpacing.Tight, fixedWeight = FontWeight.Bold),
    HeadingXSmall(BezierFontSize.Size16, BezierLineHeight.Size24, BezierLetterSpacing.Tight, fixedWeight = FontWeight.Bold),
    HeadingXXSmall(BezierFontSize.Size15, BezierLineHeight.Size20, BezierLetterSpacing.Tight, fixedWeight = FontWeight.Bold),

    // Text (weight param supported)
    TextXXLarge(BezierFontSize.Size17, BezierLineHeight.Size24, BezierLetterSpacing.Tight),
    TextXLarge(BezierFontSize.Size16, BezierLineHeight.Size24, BezierLetterSpacing.Tight),
    TextLarge(BezierFontSize.Size15, BezierLineHeight.Size20, BezierLetterSpacing.Tight),
    TextMedium(BezierFontSize.Size14, BezierLineHeight.Size18, BezierLetterSpacing.Normal),
    TextSmall(BezierFontSize.Size13, BezierLineHeight.Size18, BezierLetterSpacing.Normal),
    TextXSmall(BezierFontSize.Size12, BezierLineHeight.Size16, BezierLetterSpacing.Normal),
    TextXXSmall(BezierFontSize.Size11, BezierLineHeight.Size16, BezierLetterSpacing.Normal),

    // Label (fixed Bold)
    LabelLarge(BezierFontSize.Size14, BezierLineHeight.Size18, BezierLetterSpacing.Normal, fixedWeight = FontWeight.Bold),
    LabelMedium(BezierFontSize.Size13, BezierLineHeight.Size18, BezierLetterSpacing.Normal, fixedWeight = FontWeight.Bold),
    LabelSmall(BezierFontSize.Size12, BezierLineHeight.Size16, BezierLetterSpacing.Normal, fixedWeight = FontWeight.Bold),

    // Caption (weight param supported)
    CaptionMedium(BezierFontSize.Size12, BezierLineHeight.Size16, BezierLetterSpacing.Normal),
    CaptionSmall(BezierFontSize.Size11, BezierLineHeight.Size16, BezierLetterSpacing.Normal),

    // Code (fixed Normal, monospace)
    CodeMedium(BezierFontSize.Size14, BezierLineHeight.Size18, BezierLetterSpacing.Normal, fixedWeight = FontWeight.Normal, isMonospace = true),
    CodeSmall(BezierFontSize.Size13, BezierLineHeight.Size18, BezierLetterSpacing.Normal, fixedWeight = FontWeight.Normal, isMonospace = true),
}
