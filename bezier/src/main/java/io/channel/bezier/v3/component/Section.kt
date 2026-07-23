package io.channel.bezier.v3.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.component.BezierText
import io.channel.bezier.icon.ChevronSmallRight
import io.channel.bezier.icon.Folder
import io.channel.bezier.icon.Plus
import io.channel.bezier.typography.BezierTypo
import io.channel.bezier.typography.BezierWeight

@Composable
fun Section(
        modifier: Modifier = Modifier,
        label: String? = null,
        labelColor: SectionLabelColor = SectionLabelColor.NeutralDark,
        labelLeadingContent: (@Composable () -> Unit)? = null,
        labelTrailingContent: (@Composable () -> Unit)? = null,
        variant: SectionVariant = SectionVariant.Solid,
        content: @Composable () -> Unit,
) {
    Column(
            modifier = modifier.fillMaxWidth(),
    ) {
        if (label != null) {
            SectionLabel(
                    label = label,
                    color = labelColor,
                    leadingContent = labelLeadingContent,
                    trailingContent = labelTrailingContent,
            )
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
        color: SectionLabelColor,
        leadingContent: (@Composable () -> Unit)?,
        trailingContent: (@Composable () -> Unit)?,
        modifier: Modifier = Modifier,
) {
    Row(
            modifier = modifier
                    .fillMaxWidth()
                    .heightIn(min = SectionLabelMinHeight)
                    .padding(horizontal = SectionLabelHorizontalPadding),
            horizontalArrangement = Arrangement.spacedBy(SectionLabelTrailingGap),
            verticalAlignment = Alignment.CenterVertically,
    ) {
        Row(
                modifier = Modifier.weight(1f),
                horizontalArrangement = Arrangement.spacedBy(SectionLabelLeadingGap),
                verticalAlignment = Alignment.CenterVertically,
        ) {
            if (leadingContent != null) {
                Box(modifier = Modifier.size(SectionLabelSlotSize)) {
                    leadingContent()
                }
            }

            BezierText(
                    text = label,
                    typo = BezierTypo.TextMedium,
                    weight = BezierWeight.Bold,
                    color = color.textColor(),
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1,
                    modifier = Modifier.weight(1f),
            )
        }

        if (trailingContent != null) {
            Box(
                    modifier = Modifier.height(SectionLabelSlotSize),
                    contentAlignment = Alignment.Center,
            ) {
                trailingContent()
            }
        }
    }
}

enum class SectionVariant {
    Solid,
    Card,
}

enum class SectionLabelColor {
    NeutralDark,
    NeutralLight,
}

@Composable
private fun SectionLabelColor.textColor(): Color = when (this) {
    SectionLabelColor.NeutralDark -> BezierTheme.colorsV3.textNeutral
    SectionLabelColor.NeutralLight -> BezierTheme.colorsV3.textNeutralLighter
}

private val SectionLabelMinHeight: Dp = 32.dp
private val SectionLabelHorizontalPadding: Dp = 10.dp
private val SectionLabelLeadingGap: Dp = 8.dp
private val SectionLabelTrailingGap: Dp = 4.dp
private val SectionLabelSlotSize: Dp = 20.dp

@Composable
private fun SectionPreviewContent() {
    BezierTheme {
        Column(
                modifier = Modifier
                        .background(BezierTheme.colorsV3.surfaceLow)
                        .fillMaxSize()
                        .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(24.dp),
        ) {
            Section(
                    label = "Section Label",
                    labelLeadingContent = { SectionPreviewIcon(BezierIcons.Folder) },
                    labelTrailingContent = { SectionPreviewIcon(BezierIcons.ChevronSmallRight) },
            ) {
                repeat(3) {
                    BaseItem(
                            label = "Label",
                            size = BaseItemSize.Small,
                            leadingContent = { SectionPreviewIcon(BezierIcons.Plus) },
                    )
                }
            }

            Section(
                    label = "Overlay Label",
                    labelColor = SectionLabelColor.NeutralLight,
                    variant = SectionVariant.Card,
            ) {
                repeat(4) { index ->
                    if (index > 0) {
                        Divider(sideIndent = false, parallelIndent = false)
                    }
                    BaseItem(
                            label = "Label",
                            size = BaseItemSize.Medium,
                            leadingContent = { SectionPreviewIcon(BezierIcons.Plus) },
                    )
                }
            }
        }
    }
}

@Composable
private fun SectionPreviewIcon(icon: BezierIcon) {
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
