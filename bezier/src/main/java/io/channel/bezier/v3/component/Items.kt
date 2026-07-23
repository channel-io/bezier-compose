package io.channel.bezier.v3.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.component.BezierText
import io.channel.bezier.icon.ArrowRightUpSmall
import io.channel.bezier.icon.ChevronSmallRight
import io.channel.bezier.icon.ChevronSmallUpdown
import io.channel.bezier.icon.Plus
import io.channel.bezier.typography.BezierTypo

@Composable
fun NavigationItem(
        leadingIcon: BezierIcon,
        label: String,
        modifier: Modifier = Modifier,
) {
    BaseItem(
            modifier = modifier,
            label = label,
            size = BaseItemSize.Medium,
            leadingContent = { ItemLeadingIcon(leadingIcon) },
            trailingContent = { ItemTrailingIcon(BezierIcons.ChevronSmallRight) },
    )
}

@Composable
fun SelectItem(
        leadingIcon: BezierIcon,
        label: String,
        modifier: Modifier = Modifier,
        value: String? = null,
) {
    BaseItem(
            modifier = modifier,
            label = label,
            size = BaseItemSize.Medium,
            leadingContent = { ItemLeadingIcon(leadingIcon) },
            trailingContent = { ItemValueTrailing(value = value, icon = BezierIcons.ChevronSmallUpdown) },
    )
}

@Composable
fun MultiSelectItem(
        leadingIcon: BezierIcon,
        label: String,
        modifier: Modifier = Modifier,
        value: String? = null,
) {
    BaseItem(
            modifier = modifier,
            label = label,
            size = BaseItemSize.Medium,
            leadingContent = { ItemLeadingIcon(leadingIcon) },
            trailingContent = { ItemValueTrailing(value = value, icon = BezierIcons.ChevronSmallUpdown) },
    )
}

@Composable
fun OutlinkItem(
        leadingIcon: BezierIcon,
        label: String,
        modifier: Modifier = Modifier,
) {
    BaseItem(
            modifier = modifier,
            label = label,
            size = BaseItemSize.Medium,
            leadingContent = { ItemLeadingIcon(leadingIcon) },
            trailingContent = { ItemTrailingIcon(BezierIcons.ArrowRightUpSmall) },
    )
}

@Composable
fun ActionItem(
        leadingIcon: BezierIcon,
        label: String,
        modifier: Modifier = Modifier,
) {
    BaseItem(
            modifier = modifier,
            label = label,
            size = BaseItemSize.Medium,
            leadingContent = { ItemLeadingIcon(leadingIcon) },
    )
}

@Composable
private fun ItemLeadingIcon(icon: BezierIcon) {
    Icon(
            modifier = Modifier.fillMaxSize(),
            imageVector = icon.imageVector,
            tint = BezierTheme.colorsV3.iconNeutralHeavier,
            contentDescription = null,
    )
}

@Composable
private fun ItemTrailingIcon(icon: BezierIcon) {
    Icon(
            modifier = Modifier.size(ItemTrailingIconSize),
            imageVector = icon.imageVector,
            tint = BezierTheme.colorsV3.iconNeutralHeavier,
            contentDescription = null,
    )
}

@Composable
private fun ItemValueTrailing(
        value: String?,
        icon: BezierIcon,
) {
    Row(
            horizontalArrangement = Arrangement.spacedBy(ItemTrailingGap),
            verticalAlignment = Alignment.CenterVertically,
    ) {
        if (value != null) {
            BezierText(
                    text = value,
                    typo = BezierTypo.TextMedium,
                    color = BezierTheme.colorsV3.textNeutralLighter,
            )
        }
        ItemTrailingIcon(icon)
    }
}

private val ItemTrailingIconSize: Dp = 16.dp
private val ItemTrailingGap: Dp = 4.dp

@Composable
private fun ItemsPreviewContent() {
    BezierTheme {
        Column(
                modifier = Modifier
                        .background(BezierTheme.colorsV3.surface)
                        .padding(24.dp),
        ) {
            NavigationItem(
                    modifier = Modifier.width(328.dp),
                    leadingIcon = BezierIcons.Plus,
                    label = "Center content",
            )
            SelectItem(
                    modifier = Modifier.width(328.dp),
                    leadingIcon = BezierIcons.Plus,
                    label = "Center content",
                    value = "Value",
            )
            MultiSelectItem(
                    modifier = Modifier.width(328.dp),
                    leadingIcon = BezierIcons.Plus,
                    label = "Center content",
                    value = "Value1, Value2",
            )
            OutlinkItem(
                    modifier = Modifier.width(328.dp),
                    leadingIcon = BezierIcons.Plus,
                    label = "Center content",
            )
            ActionItem(
                    modifier = Modifier.width(328.dp),
                    leadingIcon = BezierIcons.Plus,
                    label = "Center content",
            )
        }
    }
}

@Preview(showBackground = true, widthDp = 400)
@Composable
private fun ItemsPreview() = ItemsPreviewContent()

@Preview(showBackground = true, widthDp = 400, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun ItemsDarkPreview() = ItemsPreviewContent()
