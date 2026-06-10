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
            BezierText(text = "DisplayLarge - 가나다라", typo = BezierTypo.DisplayLarge)
            BezierText(text = "DisplayMedium - 가나다라", typo = BezierTypo.DisplayMedium)

            // Heading
            SectionHeader("Heading")
            BezierText(text = "HeadingXLarge - 가나다라", typo = BezierTypo.HeadingXLarge)
            BezierText(text = "HeadingLarge - 가나다라", typo = BezierTypo.HeadingLarge)
            BezierText(text = "HeadingMedium - 가나다라", typo = BezierTypo.HeadingMedium)
            BezierText(text = "HeadingSmall - 가나다라", typo = BezierTypo.HeadingSmall)
            BezierText(text = "HeadingXSmall - 가나다라", typo = BezierTypo.HeadingXSmall)
            BezierText(text = "HeadingXXSmall - 가나다라", typo = BezierTypo.HeadingXXSmall)

            // Text (Regular / Bold)
            SectionHeader("Text")
            BezierText(text = "TextXXLarge (Regular)", typo = BezierTypo.TextXXLarge)
            BezierText(text = "TextXXLarge (Bold)", typo = BezierTypo.TextXXLarge, weight = BezierWeight.Bold)
            BezierText(text = "TextXLarge (Regular)", typo = BezierTypo.TextXLarge)
            BezierText(text = "TextXLarge (Bold)", typo = BezierTypo.TextXLarge, weight = BezierWeight.Bold)
            BezierText(text = "TextLarge (Regular)", typo = BezierTypo.TextLarge)
            BezierText(text = "TextLarge (Bold)", typo = BezierTypo.TextLarge, weight = BezierWeight.Bold)
            BezierText(text = "TextMedium (Regular)", typo = BezierTypo.TextMedium)
            BezierText(text = "TextMedium (Bold)", typo = BezierTypo.TextMedium, weight = BezierWeight.Bold)
            BezierText(text = "TextSmall (Regular)", typo = BezierTypo.TextSmall)
            BezierText(text = "TextSmall (Bold)", typo = BezierTypo.TextSmall, weight = BezierWeight.Bold)
            BezierText(text = "TextXSmall (Regular)", typo = BezierTypo.TextXSmall)
            BezierText(text = "TextXSmall (Bold)", typo = BezierTypo.TextXSmall, weight = BezierWeight.Bold)
            BezierText(text = "TextXXSmall (Regular)", typo = BezierTypo.TextXXSmall)
            BezierText(text = "TextXXSmall (Bold)", typo = BezierTypo.TextXXSmall, weight = BezierWeight.Bold)

            // Label
            SectionHeader("Label")
            BezierText(text = "LabelLarge - 가나다라", typo = BezierTypo.LabelLarge)
            BezierText(text = "LabelMedium - 가나다라", typo = BezierTypo.LabelMedium)
            BezierText(text = "LabelSmall - 가나다라", typo = BezierTypo.LabelSmall)

            // Caption (Regular / Bold)
            SectionHeader("Caption")
            BezierText(text = "CaptionMedium (Regular)", typo = BezierTypo.CaptionMedium)
            BezierText(text = "CaptionMedium (Bold)", typo = BezierTypo.CaptionMedium, weight = BezierWeight.Bold)
            BezierText(text = "CaptionSmall (Regular)", typo = BezierTypo.CaptionSmall)
            BezierText(text = "CaptionSmall (Bold)", typo = BezierTypo.CaptionSmall, weight = BezierWeight.Bold)

            // Code
            SectionHeader("Code")
            BezierText(text = "CodeMedium - 가나다라", typo = BezierTypo.CodeMedium)
            BezierText(text = "CodeSmall - 가나다라", typo = BezierTypo.CodeSmall)

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}
