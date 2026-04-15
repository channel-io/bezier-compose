package io.channel.bezier.component

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import io.channel.bezier.BezierTheme
import io.channel.bezier.extension.ifTrue
import io.channel.bezier.typography.BezierTypo
import io.channel.bezier.typography.BezierWeight

@Composable
fun BezierText(
    text: String,
    typo: BezierTypo,
    modifier: Modifier = Modifier,
    weight: BezierWeight = BezierWeight.Regular,
    color: Color = BezierTheme.colorsV3.textNeutral,
    textAlign: TextAlign? = null,
    textDecoration: TextDecoration? = null,
    overflow: TextOverflow = TextOverflow.Clip,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
) {
    val resolvedWeight = typo.fixedWeight ?: when (weight) {
        BezierWeight.Regular -> FontWeight.Normal
        BezierWeight.Bold -> FontWeight.Bold
    }

    Text(
        text = text,
        modifier = modifier,
        style = TextStyle(
            fontSize = typo.fontSize,
            lineHeight = typo.lineHeight,
            letterSpacing = typo.letterSpacing,
            fontWeight = resolvedWeight,
            fontFamily = typo.isMonospace.ifTrue(FontFamily.Monospace, null),
            color = color,
            textAlign = textAlign ?: TextAlign.Unspecified,
            textDecoration = textDecoration,
        ),
        overflow = overflow,
        maxLines = maxLines,
        minLines = minLines,
    )
}
