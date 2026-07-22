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

enum class BaseItemPresetType {
    Navigation,
    Select,
    MultiSelect,
    Outlink,
    Action,
}

@Composable
fun BaseItemPreset(
        leadingIcon: BezierIcon,
        label: String,
        type: BaseItemPresetType,
        modifier: Modifier = Modifier,
        value: String? = null,
) {
    BaseItem(
            modifier = modifier,
            label = label,
            size = BaseItemSize.Medium,
            leadingContent = {
                Icon(
                        modifier = Modifier.fillMaxSize(),
                        imageVector = leadingIcon.imageVector,
                        tint = BezierTheme.colorsV3.iconNeutralHeavier,
                        contentDescription = null,
                )
            },
            trailingContent = if (type == BaseItemPresetType.Action) {
                null
            } else {
                { PresetTrailing(type = type, value = value) }
            },
    )
}

@Composable
private fun PresetTrailing(
        type: BaseItemPresetType,
        value: String?,
) {
    Row(
            horizontalArrangement = Arrangement.spacedBy(PresetTrailingGap),
            verticalAlignment = Alignment.CenterVertically,
    ) {
        val showValue = type == BaseItemPresetType.Select || type == BaseItemPresetType.MultiSelect
        if (showValue && value != null) {
            BezierText(
                    text = value,
                    typo = BezierTypo.TextMedium,
                    color = BezierTheme.colorsV3.textNeutralLighter,
            )
        }

        val trailingIcon = when (type) {
            BaseItemPresetType.Navigation -> BezierIcons.ChevronSmallRight
            BaseItemPresetType.Select -> BezierIcons.ChevronSmallUpdown
            BaseItemPresetType.MultiSelect -> BezierIcons.ChevronSmallUpdown
            BaseItemPresetType.Outlink -> BezierIcons.ArrowRightUpSmall
            BaseItemPresetType.Action -> null
        }
        if (trailingIcon != null) {
            Icon(
                    modifier = Modifier.size(PresetTrailingIconSize),
                    imageVector = trailingIcon.imageVector,
                    tint = BezierTheme.colorsV3.iconNeutralHeavier,
                    contentDescription = null,
            )
        }
    }
}

private val PresetTrailingIconSize: Dp = 16.dp
private val PresetTrailingGap: Dp = 4.dp

@Composable
private fun BaseItemPresetPreviewContent() {
    BezierTheme {
        Column(
                modifier = Modifier
                        .background(BezierTheme.colorsV3.surface)
                        .padding(24.dp),
        ) {
            BaseItemPreset(
                    modifier = Modifier.width(328.dp),
                    leadingIcon = BezierIcons.Plus,
                    label = "Center content",
                    type = BaseItemPresetType.Navigation,
            )
            BaseItemPreset(
                    modifier = Modifier.width(328.dp),
                    leadingIcon = BezierIcons.Plus,
                    label = "Center content",
                    type = BaseItemPresetType.Select,
                    value = "Value",
            )
            BaseItemPreset(
                    modifier = Modifier.width(328.dp),
                    leadingIcon = BezierIcons.Plus,
                    label = "Center content",
                    type = BaseItemPresetType.MultiSelect,
                    value = "Value1, Value2",
            )
            BaseItemPreset(
                    modifier = Modifier.width(328.dp),
                    leadingIcon = BezierIcons.Plus,
                    label = "Center content",
                    type = BaseItemPresetType.Outlink,
            )
            BaseItemPreset(
                    modifier = Modifier.width(328.dp),
                    leadingIcon = BezierIcons.Plus,
                    label = "Center content",
                    type = BaseItemPresetType.Action,
            )
        }
    }
}

@Preview(showBackground = true, widthDp = 400)
@Composable
private fun BaseItemPresetPreview() = BaseItemPresetPreviewContent()

@Preview(showBackground = true, widthDp = 400, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun BaseItemPresetDarkPreview() = BaseItemPresetPreviewContent()
