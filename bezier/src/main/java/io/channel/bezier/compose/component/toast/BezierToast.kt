package io.channel.bezier.compose.component.toast

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.component.emoji.BezierEmoji
import io.channel.bezier.compose.component.emoji.properties.BezierEmojiSize
import io.channel.bezier.compose.component.toast.properties.BezierToastContent
import io.channel.bezier.icon.ErrorTriangleFilled

@Composable
fun BezierToast(
        text: String,
        prefixContent: BezierToastContent? = null,
) {
    Row(
            modifier = Modifier
                    .background(
                            color = BezierTheme.colorSchemes.bgBlackDarker.color,
                            shape = RoundedCornerShape(20.dp),
                    )
                    .padding(horizontal = 14.dp, vertical = 10.dp),
    ) {
        if (prefixContent != null) {
            BezierToastContent(content = prefixContent)

            Spacer(
                    modifier = Modifier.width(
                            when (prefixContent) {
                                is BezierToastContent.Emoji -> 4.dp
                                is BezierToastContent.Icon -> 6.dp
                            },
                    ),
            )
        }

        Text(
                modifier = Modifier.padding(vertical = 4.dp),
                text = text,
                fontStyle = BezierTheme.typography.caption1SemiBold.fontStyle,
                color = BezierTheme.colorSchemes.fgAbsoluteWhiteDark.color,
        )
    }
}

@Composable
private fun BezierToastContent(
        content: BezierToastContent,
) {
    when (content) {
        is BezierToastContent.Icon -> Icon(
                modifier = Modifier
                        .padding(vertical = 3.dp)
                        .size(20.dp),
                imageVector = content.icon.imageVector,
                tint = BezierTheme.colorSchemes.fgAbsoluteWhiteLight.color,
                contentDescription = content.icon.imageVector.name,
        )

        is BezierToastContent.Emoji -> BezierEmoji(
                modifier = Modifier.padding(vertical = 1.dp),
                name = content.name,
                size = BezierEmojiSize.Size24,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun BezierToastPreview() {
    BezierTheme {
        Column(
                modifier = Modifier
                        .size(200.dp)
                        .padding(10.dp),
                verticalArrangement = Arrangement.spacedBy(10.dp),
        ) {
            BezierToast(
                    text = "Lorem ipsum dolor sit amet, consectetu",
                    prefixContent = BezierToastContent.Icon(BezierIcons.ErrorTriangleFilled),
            )

            BezierToast(
                    text = "Lorem ipsum dolor sit amet, consectetu",
                    prefixContent = BezierToastContent.Emoji(""),
            )
        }
    }
}
