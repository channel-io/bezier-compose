package io.channel.bezier.compose.component.badge.chat

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.component.badge.chat.properties.BezierChatBadgeSize
import io.channel.bezier.icon.Lock

@Composable
fun BezierChatBadge(
        badgeSize: BezierChatBadgeSize,
) {
    Box(
            modifier = Modifier
                    .clip(CircleShape)
                    .size(badgeSize.badgeSize)
                    .background(BezierTheme.colorSchemes.bgWhiteHighest.color),
            contentAlignment = Alignment.Center,
    ) {
        Icon(
                modifier = Modifier.size(badgeSize.iconSize),
                imageVector = BezierIcons.Lock.imageVector,
                contentDescription = "private chat",
                tint = BezierTheme.colorSchemes.fgBlackDarker.color,
        )
    }
}

@Composable
@Preview
private fun BezierChatBadgePreview() {
    BezierTheme {
        Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            BezierChatBadgeSize.entries.forEach {
                BezierChatBadge(it)
            }
        }
    }
}
