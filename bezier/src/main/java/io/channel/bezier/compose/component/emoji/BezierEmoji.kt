package io.channel.bezier.compose.component.emoji

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.component.badge.chat.BezierChatBadge
import io.channel.bezier.compose.component.emoji.properties.BezierEmojiBadge
import io.channel.bezier.compose.component.emoji.properties.BezierEmojiSize
import io.channel.bezier.extension.toEmojiPainter

@Composable
fun BezierEmoji(
        name: String,
        size: BezierEmojiSize,
        modifier: Modifier = Modifier,
        badge: BezierEmojiBadge = BezierEmojiBadge.None,
) {
    Box(
            modifier = modifier,
    ) {
        Icon(
                modifier = Modifier.size(size.size),
                painter = name.toEmojiPainter,
                contentDescription = null,
        )

        Box(
                modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .offset(x = 4.dp, y = 4.dp),
        ) {
            when (badge) {
                BezierEmojiBadge.None -> Unit
                BezierEmojiBadge.Chat -> BezierChatBadge(size = size.chatBadgeSize)
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 700, heightDp = 300)
@Composable
private fun BezierEmojiPreview() {
    BezierTheme {
        Column {
            Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                BezierEmojiSize.entries.forEach { size ->
                    BezierEmoji(
                            name = "smile",
                            size = size,
                    )
                }
            }

            Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                BezierEmojiSize.entries.forEach { size ->
                    BezierEmoji(
                            name = "smile",
                            size = size,
                            badge = BezierEmojiBadge.Chat,
                    )
                }
            }
        }
    }
}
