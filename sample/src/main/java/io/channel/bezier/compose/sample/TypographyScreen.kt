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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.channel.bezier.BezierTheme
import io.channel.bezier.component.BezierText
import io.channel.bezier.typography.BezierTypo
import io.channel.bezier.typography.BezierWeight

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
            BezierText(text = "displayLarge - 가나다라", typo = BezierTypo.displayLarge)
            BezierText(text = "displayMedium - 가나다라", typo = BezierTypo.displayMedium)

            // Heading
            SectionHeader("Heading")
            BezierText(text = "headingXLarge - 가나다라", typo = BezierTypo.headingXLarge)
            BezierText(text = "headingLarge - 가나다라", typo = BezierTypo.headingLarge)
            BezierText(text = "headingMedium - 가나다라", typo = BezierTypo.headingMedium)
            BezierText(text = "headingSmall - 가나다라", typo = BezierTypo.headingSmall)
            BezierText(text = "headingXSmall - 가나다라", typo = BezierTypo.headingXSmall)
            BezierText(text = "headingXXSmall - 가나다라", typo = BezierTypo.headingXXSmall)

            // Text (Regular / Bold)
            SectionHeader("Text")
            BezierText(text = "textXXLarge (Regular)", typo = BezierTypo.textXXLarge)
            BezierText(text = "textXXLarge (Bold)", typo = BezierTypo.textXXLarge, weight = BezierWeight.Bold)
            BezierText(text = "textXLarge (Regular)", typo = BezierTypo.textXLarge)
            BezierText(text = "textXLarge (Bold)", typo = BezierTypo.textXLarge, weight = BezierWeight.Bold)
            BezierText(text = "textLarge (Regular)", typo = BezierTypo.textLarge)
            BezierText(text = "textLarge (Bold)", typo = BezierTypo.textLarge, weight = BezierWeight.Bold)
            BezierText(text = "textMedium (Regular)", typo = BezierTypo.textMedium)
            BezierText(text = "textMedium (Bold)", typo = BezierTypo.textMedium, weight = BezierWeight.Bold)
            BezierText(text = "textSmall (Regular)", typo = BezierTypo.textSmall)
            BezierText(text = "textSmall (Bold)", typo = BezierTypo.textSmall, weight = BezierWeight.Bold)
            BezierText(text = "textXSmall (Regular)", typo = BezierTypo.textXSmall)
            BezierText(text = "textXSmall (Bold)", typo = BezierTypo.textXSmall, weight = BezierWeight.Bold)
            BezierText(text = "textXXSmall (Regular)", typo = BezierTypo.textXXSmall)
            BezierText(text = "textXXSmall (Bold)", typo = BezierTypo.textXXSmall, weight = BezierWeight.Bold)

            // Label
            SectionHeader("Label")
            BezierText(text = "labelLarge - 가나다라", typo = BezierTypo.labelLarge)
            BezierText(text = "labelMedium - 가나다라", typo = BezierTypo.labelMedium)
            BezierText(text = "labelSmall - 가나다라", typo = BezierTypo.labelSmall)

            // Caption (Regular / Bold)
            SectionHeader("Caption")
            BezierText(text = "captionMedium (Regular)", typo = BezierTypo.captionMedium)
            BezierText(text = "captionMedium (Bold)", typo = BezierTypo.captionMedium, weight = BezierWeight.Bold)
            BezierText(text = "captionSmall (Regular)", typo = BezierTypo.captionSmall)
            BezierText(text = "captionSmall (Bold)", typo = BezierTypo.captionSmall, weight = BezierWeight.Bold)

            // Code
            SectionHeader("Code")
            BezierText(text = "codeMedium - 가나다라", typo = BezierTypo.codeMedium)
            BezierText(text = "codeSmall - 가나다라", typo = BezierTypo.codeSmall)

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}
