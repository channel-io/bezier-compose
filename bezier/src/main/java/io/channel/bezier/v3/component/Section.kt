package io.channel.bezier.v3.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.component.BezierText
import io.channel.bezier.icon.Plus
import io.channel.bezier.typography.BezierTypo
import io.channel.bezier.typography.BezierWeight

@Composable
fun Section(
        modifier: Modifier = Modifier,
        label: String? = null,
        variant: SectionVariant = SectionVariant.Solid,
        content: @Composable () -> Unit,
) {
    Column(
            modifier = modifier.fillMaxWidth(),
    ) {
        if (label != null) {
            SectionLabel(label = label)
        }

        when (variant) {
            SectionVariant.Solid -> Column(
                    modifier = Modifier.fillMaxWidth(),
                    content = { content() },
            )

            SectionVariant.Card -> Card(
                    modifier = Modifier.fillMaxWidth(),
                    content = content,
            )
        }
    }
}

@Composable
private fun SectionLabel(
        label: String,
        modifier: Modifier = Modifier,
) {
    Row(
            modifier = modifier
                    .fillMaxWidth()
                    .heightIn(min = SectionLabelMinHeight)
                    .padding(horizontal = SectionLabelHorizontalPadding),
            verticalAlignment = Alignment.CenterVertically,
    ) {
        BezierText(
                text = label,
                typo = BezierTypo.TextMedium,
                weight = BezierWeight.Bold,
                color = BezierTheme.colorsV3.textNeutral,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
        )
    }
}

enum class SectionVariant {
    Solid,
    Card,
}

private val SectionLabelMinHeight: Dp = 32.dp
private val SectionLabelHorizontalPadding: Dp = 10.dp

@Composable
private fun SectionPreviewContent() {
    BezierTheme {
        Column(
                modifier = Modifier
                        .background(BezierTheme.colorsV3.surfaceLow)
                        .fillMaxSize()
                        .padding(24.dp),
        ) {
            Section(label = "Section Label") {
                repeat(3) {
                    BaseItem(
                            label = "Label",
                            size = BaseItemSize.Small,
                            leadingContent = { SectionPreviewLeadingIcon(BezierIcons.Plus) },
                    )
                }
            }

            Section(
                    modifier = Modifier.padding(top = 24.dp),
                    label = "Section Label",
                    variant = SectionVariant.Card,
            ) {
                repeat(4) { index ->
                    if (index > 0) {
                        Divider(sideIndent = false, parallelIndent = false)
                    }
                    BaseItem(
                            label = "Label",
                            size = BaseItemSize.Medium,
                            leadingContent = { SectionPreviewLeadingIcon(BezierIcons.Plus) },
                    )
                }
            }
        }
    }
}

@Composable
private fun SectionPreviewLeadingIcon(icon: BezierIcon) {
    Icon(
            modifier = Modifier.fillMaxSize(),
            imageVector = icon.imageVector,
            tint = BezierTheme.colorsV3.iconNeutralHeavier,
            contentDescription = null,
    )
}

@Preview(showBackground = true, widthDp = 400)
@Composable
private fun SectionPreview() = SectionPreviewContent()

@Preview(showBackground = true, widthDp = 400, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun SectionDarkPreview() = SectionPreviewContent()
