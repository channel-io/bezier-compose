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
    DisplayLarge(fontSize = BezierFontSize.Size36, lineHeight = BezierLineHeight.Size44, letterSpacing = BezierLetterSpacing.Tighter, fixedWeight = FontWeight.Bold),
    DisplayMedium(fontSize = BezierFontSize.Size30, lineHeight = BezierLineHeight.Size36, letterSpacing = BezierLetterSpacing.Tighter, fixedWeight = FontWeight.Bold),

    // Heading (fixed Bold)
    HeadingXLarge(fontSize = BezierFontSize.Size24, lineHeight = BezierLineHeight.Size32, letterSpacing = BezierLetterSpacing.Tighter, fixedWeight = FontWeight.Bold),
    HeadingLarge(fontSize = BezierFontSize.Size22, lineHeight = BezierLineHeight.Size28, letterSpacing = BezierLetterSpacing.Tighter, fixedWeight = FontWeight.Bold),
    HeadingMedium(fontSize = BezierFontSize.Size18, lineHeight = BezierLineHeight.Size24, letterSpacing = BezierLetterSpacing.Normal, fixedWeight = FontWeight.Bold),
    HeadingSmall(fontSize = BezierFontSize.Size17, lineHeight = BezierLineHeight.Size24, letterSpacing = BezierLetterSpacing.Tight, fixedWeight = FontWeight.Bold),
    HeadingXSmall(fontSize = BezierFontSize.Size16, lineHeight = BezierLineHeight.Size24, letterSpacing = BezierLetterSpacing.Tight, fixedWeight = FontWeight.Bold),
    HeadingXXSmall(fontSize = BezierFontSize.Size15, lineHeight = BezierLineHeight.Size20, letterSpacing = BezierLetterSpacing.Tight, fixedWeight = FontWeight.Bold),

    // Text (weight param supported)
    TextXXLarge(fontSize = BezierFontSize.Size17, lineHeight = BezierLineHeight.Size24, letterSpacing = BezierLetterSpacing.Tight),
    TextXLarge(fontSize = BezierFontSize.Size16, lineHeight = BezierLineHeight.Size24, letterSpacing = BezierLetterSpacing.Tight),
    TextLarge(fontSize = BezierFontSize.Size15, lineHeight = BezierLineHeight.Size20, letterSpacing = BezierLetterSpacing.Tight),
    TextMedium(fontSize = BezierFontSize.Size14, lineHeight = BezierLineHeight.Size18, letterSpacing = BezierLetterSpacing.Normal),
    TextSmall(fontSize = BezierFontSize.Size13, lineHeight = BezierLineHeight.Size18, letterSpacing = BezierLetterSpacing.Normal),
    TextXSmall(fontSize = BezierFontSize.Size12, lineHeight = BezierLineHeight.Size16, letterSpacing = BezierLetterSpacing.Normal),
    TextXXSmall(fontSize = BezierFontSize.Size11, lineHeight = BezierLineHeight.Size16, letterSpacing = BezierLetterSpacing.Normal),

    // Label (fixed Bold)
    LabelLarge(fontSize = BezierFontSize.Size15, lineHeight = BezierLineHeight.Size20, letterSpacing = BezierLetterSpacing.Normal, fixedWeight = FontWeight.Bold),
    LabelMedium(fontSize = BezierFontSize.Size14, lineHeight = BezierLineHeight.Size20, letterSpacing = BezierLetterSpacing.Normal, fixedWeight = FontWeight.Bold),
    LabelSmall(fontSize = BezierFontSize.Size13, lineHeight = BezierLineHeight.Size18, letterSpacing = BezierLetterSpacing.Normal, fixedWeight = FontWeight.Bold),

    // Caption (weight param supported)
    CaptionMedium(fontSize = BezierFontSize.Size12, lineHeight = BezierLineHeight.Size16, letterSpacing = BezierLetterSpacing.Normal),
    CaptionSmall(fontSize = BezierFontSize.Size11, lineHeight = BezierLineHeight.Size16, letterSpacing = BezierLetterSpacing.Normal),

    // Code (fixed Normal, monospace)
    CodeMedium(fontSize = BezierFontSize.Size14, lineHeight = BezierLineHeight.Size18, letterSpacing = BezierLetterSpacing.Normal, fixedWeight = FontWeight.Normal, isMonospace = true),
    CodeSmall(fontSize = BezierFontSize.Size13, lineHeight = BezierLineHeight.Size18, letterSpacing = BezierLetterSpacing.Normal, fixedWeight = FontWeight.Normal, isMonospace = true),
}
