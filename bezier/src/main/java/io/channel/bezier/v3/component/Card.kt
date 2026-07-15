package io.channel.bezier.v3.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme
import io.channel.bezier.component.BezierText
import io.channel.bezier.typography.BezierTypo

@Composable
fun Card(
        modifier: Modifier = Modifier,
        content: @Composable () -> Unit,
) {
    val shape = RoundedCornerShape(CardCornerRadius)

    Column(
            modifier = modifier
                    .clip(shape)
                    .background(BezierTheme.colorsV3.surface)
                    .border(
                            width = CardBorderWidth,
                            color = BezierTheme.colorsV3.borderNeutral,
                            shape = shape,
                    )
                    .padding(horizontal = CardHorizontalPadding, vertical = CardVerticalPadding),
    ) {
        content()
    }
}

private val CardCornerRadius: Dp = 16.dp
private val CardBorderWidth: Dp = 1.dp
private val CardHorizontalPadding: Dp = 4.dp
private val CardVerticalPadding: Dp = 2.dp

@Composable
private fun CardPreviewContent() {
    BezierTheme {
        Column(
                modifier = Modifier
                        .background(BezierTheme.colorsV3.surfaceLow)
                        .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Card(modifier = Modifier.width(320.dp)) {
                Box(
                        modifier = Modifier
                                .fillMaxWidth()
                                .padding(16.dp),
                ) {
                    BezierText(
                            text = "Card content",
                            typo = BezierTypo.TextMedium,
                            color = BezierTheme.colorsV3.textNeutral,
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun CardPreview() = CardPreviewContent()

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun CardDarkPreview() = CardPreviewContent()
