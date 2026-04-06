package io.channel.bezier.compose.sample

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.channel.bezier.BezierTheme
import io.channel.bezier.typography.BezierFontWeight

@Composable
private fun SectionHeader(title: String) {
    Spacer(modifier = Modifier.height(16.dp))
    Text(
        text = title,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        modifier = Modifier.padding(vertical = 8.dp),
    )
    Divider()
    Spacer(modifier = Modifier.height(8.dp))
}

@Composable
private fun TypographyItem(name: String, style: TextStyle) {
    Text(
        text = name,
        style = style,
        modifier = Modifier.padding(vertical = 4.dp),
    )
}

@Preview(showBackground = true)
@Composable
fun TypographyPreview() {
    BezierTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
        ) {
            // Display
            SectionHeader("Display")
            TypographyItem("displayLarge", BezierTheme.typography.displayLarge)
            TypographyItem("displayMedium", BezierTheme.typography.displayMedium)

            // Heading
            SectionHeader("Heading")
            TypographyItem("headingXLarge", BezierTheme.typography.headingXLarge)
            TypographyItem("headingLarge", BezierTheme.typography.headingLarge)
            TypographyItem("headingMedium", BezierTheme.typography.headingMedium)
            TypographyItem("headingSmall", BezierTheme.typography.headingSmall)
            TypographyItem("headingXSmall", BezierTheme.typography.headingXSmall)
            TypographyItem("headingXXSmall", BezierTheme.typography.headingXXSmall)

            // Text (Regular / Bold)
            SectionHeader("Text")
            TypographyItem("textXXLarge (Regular)", BezierTheme.typography.textXXLarge())
            TypographyItem("textXXLarge (Bold)", BezierTheme.typography.textXXLarge(BezierFontWeight.Bold))
            TypographyItem("textXLarge (Regular)", BezierTheme.typography.textXLarge())
            TypographyItem("textXLarge (Bold)", BezierTheme.typography.textXLarge(BezierFontWeight.Bold))
            TypographyItem("textLarge (Regular)", BezierTheme.typography.textLarge())
            TypographyItem("textLarge (Bold)", BezierTheme.typography.textLarge(BezierFontWeight.Bold))
            TypographyItem("textMedium (Regular)", BezierTheme.typography.textMedium())
            TypographyItem("textMedium (Bold)", BezierTheme.typography.textMedium(BezierFontWeight.Bold))
            TypographyItem("textSmall (Regular)", BezierTheme.typography.textSmall())
            TypographyItem("textSmall (Bold)", BezierTheme.typography.textSmall(BezierFontWeight.Bold))
            TypographyItem("textXSmall (Regular)", BezierTheme.typography.textXSmall())
            TypographyItem("textXSmall (Bold)", BezierTheme.typography.textXSmall(BezierFontWeight.Bold))
            TypographyItem("textXXSmall (Regular)", BezierTheme.typography.textXXSmall())
            TypographyItem("textXXSmall (Bold)", BezierTheme.typography.textXXSmall(BezierFontWeight.Bold))

            // Label
            SectionHeader("Label")
            TypographyItem("labelLarge", BezierTheme.typography.labelLarge)
            TypographyItem("labelMedium", BezierTheme.typography.labelMedium)
            TypographyItem("labelSmall", BezierTheme.typography.labelSmall)

            // Caption (Regular / Bold)
            SectionHeader("Caption")
            TypographyItem("captionMedium (Regular)", BezierTheme.typography.captionMedium())
            TypographyItem("captionMedium (Bold)", BezierTheme.typography.captionMedium(BezierFontWeight.Bold))
            TypographyItem("captionSmall (Regular)", BezierTheme.typography.captionSmall())
            TypographyItem("captionSmall (Bold)", BezierTheme.typography.captionSmall(BezierFontWeight.Bold))

            // Code
            SectionHeader("Code")
            TypographyItem("codeMedium", BezierTheme.typography.codeMedium)
            TypographyItem("codeSmall", BezierTheme.typography.codeSmall)

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}
