package io.channel.bezier.v3.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.component.BezierText
import io.channel.bezier.icon.ChevronSmallDown
import io.channel.bezier.icon.ChevronSmallRight
import io.channel.bezier.icon.Folder
import io.channel.bezier.icon.Plus
import io.channel.bezier.interaction.BezierComponentInteraction
import io.channel.bezier.typography.BezierTypo
import io.channel.bezier.typography.BezierWeight

@Composable
fun CollapsibleSection(
        label: String,
        open: Boolean,
        onOpenChange: ((Boolean) -> Unit)?,
        modifier: Modifier = Modifier,
        labelColor: SectionLabelColor = SectionLabelColor.NeutralDark,
        labelLeadingContent: (@Composable () -> Unit)? = null,
        labelTrailingContent: (@Composable () -> Unit)? = null,
        content: @Composable () -> Unit,
) {
    Column(
            modifier = modifier.fillMaxWidth(),
    ) {
        CollapsibleSectionLabel(
                label = label,
                color = labelColor,
                open = open,
                onOpenChange = onOpenChange,
                leadingContent = labelLeadingContent,
                trailingContent = labelTrailingContent,
        )

        if (open) {
            content()
        }
    }
}

@Composable
private fun CollapsibleSectionLabel(
        label: String,
        color: SectionLabelColor,
        open: Boolean,
        onOpenChange: ((Boolean) -> Unit)?,
        leadingContent: (@Composable () -> Unit)?,
        trailingContent: (@Composable () -> Unit)?,
        modifier: Modifier = Modifier,
) {
    Row(
            modifier = modifier
                    .fillMaxWidth()
                    .clip(CollapsibleSectionLabelShape)
                    .then(
                            if (onOpenChange != null) {
                                Modifier.clickable {
                                    BezierComponentInteraction.notify("CollapsibleSection", "V3", label)
                                    onOpenChange(!open)
                                }
                            } else {
                                Modifier
                            },
                    )
                    .heightIn(min = LabelMinHeight)
                    .padding(horizontal = LabelHorizontalPadding),
            horizontalArrangement = Arrangement.spacedBy(LabelTrailingGap),
            verticalAlignment = Alignment.CenterVertically,
    ) {
        Row(
                modifier = Modifier
                        .weight(1f)
                        .heightIn(min = CenterContentMinHeight),
                horizontalArrangement = Arrangement.spacedBy(CenterContentGap),
                verticalAlignment = Alignment.CenterVertically,
        ) {
            if (leadingContent != null) {
                Box(modifier = Modifier.size(LeadingContentSize)) {
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
                    modifier = Modifier.weight(1f, fill = false),
            )

            Icon(
                    modifier = Modifier.size(ChevronSize),
                    imageVector = if (open) {
                        BezierIcons.ChevronSmallDown.imageVector
                    } else {
                        BezierIcons.ChevronSmallRight.imageVector
                    },
                    tint = color.chevronColor(),
                    contentDescription = null,
            )
        }

        if (trailingContent != null) {
            Box(
                    modifier = Modifier.height(TrailingContentHeight),
                    contentAlignment = Alignment.CenterEnd,
            ) {
                trailingContent()
            }
        }
    }
}

@Composable
private fun SectionLabelColor.chevronColor(): Color = when (this) {
    SectionLabelColor.NeutralDark -> BezierTheme.colorsV3.iconNeutralHeavier
    SectionLabelColor.NeutralLight -> BezierTheme.colorsV3.iconNeutral
}

private val LabelMinHeight: Dp = 32.dp
private val LabelHorizontalPadding: Dp = 10.dp
private val LabelTrailingGap: Dp = 4.dp
private val CenterContentGap: Dp = 8.dp
private val CenterContentMinHeight: Dp = 24.dp
private val LeadingContentSize: Dp = 20.dp
private val ChevronSize: Dp = 16.dp
private val TrailingContentHeight: Dp = 20.dp
private val CollapsibleSectionLabelShape = RoundedCornerShape(8.dp)

@Composable
private fun CollapsibleSectionPreviewContent() {
    BezierTheme {
        var firstOpen by remember { mutableStateOf(true) }
        var secondOpen by remember { mutableStateOf(false) }

        Column(
                modifier = Modifier
                        .background(BezierTheme.colorsV3.surfaceLow)
                        .fillMaxSize()
                        .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(24.dp),
        ) {
            CollapsibleSection(
                    label = "Section Label",
                    open = firstOpen,
                    onOpenChange = { firstOpen = it },
                    labelLeadingContent = { CollapsibleSectionPreviewIcon(BezierIcons.Folder) },
            ) {
                repeat(3) {
                    BaseItem(
                            modifier = Modifier.fillMaxWidth(),
                            label = "Label",
                            size = BaseItemSize.Medium,
                            leadingContent = { CollapsibleSectionPreviewIcon(BezierIcons.Plus) },
                    )
                }
            }

            CollapsibleSection(
                    label = "Overlay Label",
                    open = secondOpen,
                    onOpenChange = { secondOpen = it },
                    labelColor = SectionLabelColor.NeutralLight,
            ) {
                repeat(2) {
                    BaseItem(
                            modifier = Modifier.fillMaxWidth(),
                            label = "Label",
                            size = BaseItemSize.Medium,
                    )
                }
            }
        }
    }
}

@Composable
private fun CollapsibleSectionPreviewIcon(icon: BezierIcon) {
    Icon(
            modifier = Modifier.fillMaxSize(),
            imageVector = icon.imageVector,
            tint = BezierTheme.colorsV3.iconNeutralHeavier,
            contentDescription = null,
    )
}

@Preview(showBackground = true, widthDp = 400)
@Composable
private fun CollapsibleSectionPreview() = CollapsibleSectionPreviewContent()

@Preview(showBackground = true, widthDp = 400, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun CollapsibleSectionDarkPreview() = CollapsibleSectionPreviewContent()
