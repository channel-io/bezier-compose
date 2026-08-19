package io.channel.bezier.v3.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme
import io.channel.bezier.component.BezierText
import io.channel.bezier.interaction.interactionComponent
import io.channel.bezier.typography.BezierTypo

@Composable
fun BaseItem(
        label: String,
        modifier: Modifier = Modifier,
        size: BaseItemSize = BaseItemSize.Small,
        description: String? = null,
        leadingContent: (@Composable () -> Unit)? = null,
        centerSlot: (@Composable () -> Unit)? = null,
        trailingContent: (@Composable () -> Unit)? = null,
) {
    Row(
            modifier = modifier
                    .semantics { interactionComponent = "BaseItem" }
                    .clip(RoundedCornerShape(BaseItemCornerRadius))
                    .heightIn(min = size.minHeight)
                    .padding(
                            horizontal = size.horizontalPadding,
                            vertical = size.verticalPadding,
                    ),
            horizontalArrangement = Arrangement.spacedBy(BaseItemGap),
            verticalAlignment = Alignment.CenterVertically,
    ) {
        if (leadingContent != null) {
            Box(modifier = Modifier.size(size.leadingContentSize)) {
                leadingContent()
            }
        }

        Column(
                modifier = Modifier
                        .weight(1f)
                        .padding(start = CenterContentStartPadding),
        ) {
            Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(TitleRowGap),
                    verticalAlignment = Alignment.CenterVertically,
            ) {
                BezierText(
                        text = label,
                        typo = BezierTypo.TextXLarge,
                        color = BezierTheme.colorsV3.textNeutral,
                        overflow = TextOverflow.Ellipsis,
                        maxLines = 1,
                        modifier = Modifier.weight(1f, fill = false),
                )

                if (centerSlot != null) {
                    centerSlot()
                }
            }

            if (size.supportsDescription && description != null) {
                BezierText(
                        text = description,
                        typo = BezierTypo.CaptionMedium,
                        color = BezierTheme.colorsV3.textNeutralLighter,
                        modifier = Modifier.fillMaxWidth(),
                )
            }
        }

        if (trailingContent != null) {
            trailingContent()
        }
    }
}

enum class BaseItemSize(
        val minHeight: Dp,
        val horizontalPadding: Dp,
        val verticalPadding: Dp,
        val leadingContentSize: Dp,
        val supportsDescription: Boolean,
) {
    Small(
            minHeight = 40.dp,
            horizontalPadding = 6.dp,
            verticalPadding = 6.dp,
            leadingContentSize = 24.dp,
            supportsDescription = false,
    ),
    Medium(
            minHeight = 48.dp,
            horizontalPadding = 6.dp,
            verticalPadding = 6.dp,
            leadingContentSize = 24.dp,
            supportsDescription = true,
    ),
    Large(
            minHeight = 52.dp,
            horizontalPadding = 6.dp,
            verticalPadding = 8.dp,
            leadingContentSize = 36.dp,
            supportsDescription = true,
    ),
}

private val BaseItemCornerRadius: Dp = 8.dp
private val BaseItemGap: Dp = 10.dp
private val TitleRowGap: Dp = 4.dp
private val CenterContentStartPadding: Dp = 2.dp

@Composable
private fun BaseItemPreviewContent() {
    BezierTheme {
        Column(
                modifier = Modifier
                        .background(BezierTheme.colorsV3.surface)
                        .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            BaseItem(
                    modifier = Modifier.width(328.dp),
                    label = "Small item",
                    size = BaseItemSize.Small,
                    leadingContent = { PreviewLeading() },
                    centerSlot = { PreviewCenterSlot() },
                    trailingContent = { PreviewTrailing() },
            )

            BaseItem(
                    modifier = Modifier.width(328.dp),
                    label = "Medium item with a long label that gets truncated",
                    description = "Description text",
                    size = BaseItemSize.Medium,
                    leadingContent = { PreviewLeading() },
                    centerSlot = { PreviewCenterSlot() },
                    trailingContent = { PreviewTrailing() },
            )

            BaseItem(
                    modifier = Modifier.width(328.dp),
                    label = "Large item",
                    description = "Description text",
                    size = BaseItemSize.Large,
                    leadingContent = { PreviewLeading() },
                    trailingContent = { PreviewTrailing() },
            )
        }
    }
}

@Composable
private fun PreviewLeading() {
    Box(
            modifier = Modifier
                    .fillMaxSize()
                    .clip(CircleShape)
                    .background(BezierTheme.colorsV3.fillNeutral),
    )
}

@Composable
private fun PreviewCenterSlot() {
    Box(
            modifier = Modifier
                    .size(width = 8.dp, height = 8.dp)
                    .clip(CircleShape)
                    .background(BezierTheme.colorsV3.fillNeutralHeavier),
    )
}

@Composable
private fun PreviewTrailing() {
    Box(
            modifier = Modifier
                    .size(24.dp)
                    .clip(RoundedCornerShape(6.dp))
                    .background(BezierTheme.colorsV3.fillNeutral),
    )
}

@Preview(showBackground = true, widthDp = 400)
@Composable
private fun BaseItemPreview() = BaseItemPreviewContent()

@Preview(showBackground = true, widthDp = 400, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun BaseItemDarkPreview() = BaseItemPreviewContent()
