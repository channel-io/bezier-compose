package io.channel.bezier.compose.component.badge

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.component.badge.properties.BezierBadgeColor
import io.channel.bezier.compose.component.badge.properties.BezierBadgeSize
import io.channel.bezier.icon.CircleSmall
import io.channel.bezier.icon.Communication

@Composable
fun BezierBadge(
        text: String,
        size: BezierBadgeSize,
        color: BezierBadgeColor,
        modifier: Modifier = Modifier,
        prefixIcon: BezierIcon? = null,
        suffixIcon: BezierIcon? = null,
) {
    Row(
            modifier = modifier
                    .clip(RoundedCornerShape(size.radius))
                    .background(color.backgroundColor().color)
                    .padding(size.backgroundPadding),
            horizontalArrangement = Arrangement.spacedBy(size.contentGap),
            verticalAlignment = Alignment.CenterVertically,
    ) {
        if (prefixIcon != null) {
            Icon(
                    modifier = Modifier.size(size.iconSize),
                    imageVector = prefixIcon.imageVector,
                    contentDescription = prefixIcon.imageVector.name,
                    tint = color.contentColor().color,
            )
        }

        Text(
                modifier = Modifier.padding(size.textPadding),
                text = text,
                style = size.textStyle(),
                color = color.contentColor().color,
        )

        if (suffixIcon != null) {
            Icon(
                    modifier = Modifier.size(size.iconSize),
                    imageVector = suffixIcon.imageVector,
                    contentDescription = suffixIcon.imageVector.name,
                    tint = color.contentColor().color,
            )
        }
    }
}

@Composable
@Preview(
        showBackground = true,
        widthDp = 1300,
)
fun BezierBadgePreview() {
    BezierTheme {
        Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            BezierBadgeSize.entries.forEach { size ->
                Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    BezierBadgeColor.entries.forEach { color ->
                        BezierBadge(
                                text = "Label",
                                size = size,
                                color = color,
                                prefixIcon = BezierIcons.CircleSmall,
                                suffixIcon = BezierIcons.Communication,
                        )
                    }
                }
            }
        }
    }
}
