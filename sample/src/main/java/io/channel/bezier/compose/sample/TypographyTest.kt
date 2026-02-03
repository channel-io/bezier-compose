package io.channel.bezier.compose.sample

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme

@Preview(showBackground = true, heightDp = 2000)
@Composable
fun TypographyPreview() {
    BezierTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(BezierTheme.colorsV3.surface)
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
        ) {
            // Heading
            SectionTitle("Heading")
            TypographyItem("headingXLarge", BezierTheme.typography.headingXLarge)
            TypographyItem("headingLarge", BezierTheme.typography.headingLarge)
            TypographyItem("headingMedium", BezierTheme.typography.headingMedium)
            TypographyItem("headingSmall", BezierTheme.typography.headingSmall)
            TypographyItem("headingXSmall", BezierTheme.typography.headingXSmall)
            TypographyItem("heading2XSmall", BezierTheme.typography.heading2XSmall)

            Spacer(modifier = Modifier.height(24.dp))

            // Text Bold
            SectionTitle("Text Bold")
            TypographyItem("textBold2XLarge", BezierTheme.typography.textBold2XLarge)
            TypographyItem("textBoldXLarge", BezierTheme.typography.textBoldXLarge)
            TypographyItem("textBoldLarge", BezierTheme.typography.textBoldLarge)
            TypographyItem("textBoldMedium", BezierTheme.typography.textBoldMedium)
            TypographyItem("textBoldSmall", BezierTheme.typography.textBoldSmall)
            TypographyItem("textBoldXSmall", BezierTheme.typography.textBoldXSmall)
            TypographyItem("textBold2XSmall", BezierTheme.typography.textBold2XSmall)

            Spacer(modifier = Modifier.height(24.dp))

            // Text Regular
            SectionTitle("Text Regular")
            TypographyItem("textRegular2XLarge", BezierTheme.typography.textRegular2XLarge)
            TypographyItem("textRegularXLarge", BezierTheme.typography.textRegularXLarge)
            TypographyItem("textRegularLarge", BezierTheme.typography.textRegularLarge)
            TypographyItem("textRegularMedium", BezierTheme.typography.textRegularMedium)
            TypographyItem("textRegularSmall", BezierTheme.typography.textRegularSmall)
            TypographyItem("textRegularXSmall", BezierTheme.typography.textRegularXSmall)
            TypographyItem("textRegular2XSmall", BezierTheme.typography.textRegular2XSmall)

            Spacer(modifier = Modifier.height(24.dp))

            // Display
            SectionTitle("Display")
            TypographyItem("displayLarge", BezierTheme.typography.displayLarge)
            TypographyItem("displayMedium", BezierTheme.typography.displayMedium)

            Spacer(modifier = Modifier.height(24.dp))

            // Code
            SectionTitle("Code")
            TypographyItem("codeMedium", BezierTheme.typography.codeMedium)
            TypographyItem("codeSmall", BezierTheme.typography.codeSmall)
        }
    }
}

@Composable
private fun SectionTitle(title: String) {
    Text(
        text = title,
        style = BezierTheme.typography.headingSmall,
        color = BezierTheme.colorsV3.textNeutralLight,
        modifier = Modifier.padding(bottom = 8.dp),
    )
}

@Composable
private fun TypographyItem(
    name: String,
    style: androidx.compose.ui.text.TextStyle,
) {
    Column(modifier = Modifier.padding(vertical = 4.dp)) {
        Text(
            text = name,
            style = BezierTheme.typography.textRegularXSmall,
            color = BezierTheme.colorsV3.textNeutralLight,
        )
        Text(
            text = "다람쥐 헌 쳇바퀴에 타고파 ABCabc 123",
            style = style,
        )
    }
}

@Preview(showBackground = true, heightDp = 2000, uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES)
@Composable
fun TypographyPreviewDark() {
    BezierTheme(isDark = true) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(BezierTheme.colorsV3.surface)
                .verticalScroll(rememberScrollState())
                .padding(16.dp),
        ) {
            // Heading
            SectionTitle("Heading")
            TypographyItem("headingXLarge", BezierTheme.typography.headingXLarge)
            TypographyItem("headingLarge", BezierTheme.typography.headingLarge)
            TypographyItem("headingMedium", BezierTheme.typography.headingMedium)
            TypographyItem("headingSmall", BezierTheme.typography.headingSmall)
            TypographyItem("headingXSmall", BezierTheme.typography.headingXSmall)
            TypographyItem("heading2XSmall", BezierTheme.typography.heading2XSmall)

            Spacer(modifier = Modifier.height(24.dp))

            // Text Bold
            SectionTitle("Text Bold")
            TypographyItem("textBold2XLarge", BezierTheme.typography.textBold2XLarge)
            TypographyItem("textBoldXLarge", BezierTheme.typography.textBoldXLarge)
            TypographyItem("textBoldLarge", BezierTheme.typography.textBoldLarge)
            TypographyItem("textBoldMedium", BezierTheme.typography.textBoldMedium)
            TypographyItem("textBoldSmall", BezierTheme.typography.textBoldSmall)
            TypographyItem("textBoldXSmall", BezierTheme.typography.textBoldXSmall)
            TypographyItem("textBold2XSmall", BezierTheme.typography.textBold2XSmall)

            Spacer(modifier = Modifier.height(24.dp))

            // Text Regular
            SectionTitle("Text Regular")
            TypographyItem("textRegular2XLarge", BezierTheme.typography.textRegular2XLarge)
            TypographyItem("textRegularXLarge", BezierTheme.typography.textRegularXLarge)
            TypographyItem("textRegularLarge", BezierTheme.typography.textRegularLarge)
            TypographyItem("textRegularMedium", BezierTheme.typography.textRegularMedium)
            TypographyItem("textRegularSmall", BezierTheme.typography.textRegularSmall)
            TypographyItem("textRegularXSmall", BezierTheme.typography.textRegularXSmall)
            TypographyItem("textRegular2XSmall", BezierTheme.typography.textRegular2XSmall)

            Spacer(modifier = Modifier.height(24.dp))

            // Display
            SectionTitle("Display")
            TypographyItem("displayLarge", BezierTheme.typography.displayLarge)
            TypographyItem("displayMedium", BezierTheme.typography.displayMedium)

            Spacer(modifier = Modifier.height(24.dp))

            // Code
            SectionTitle("Code")
            TypographyItem("codeMedium", BezierTheme.typography.codeMedium)
            TypographyItem("codeSmall", BezierTheme.typography.codeSmall)
        }
    }
}
