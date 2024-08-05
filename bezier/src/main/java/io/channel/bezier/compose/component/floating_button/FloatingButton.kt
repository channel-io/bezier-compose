package io.channel.bezier.compose.component.floating_button

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.R
import io.channel.bezier.compose.component.avatar.BezierAvatar
import io.channel.bezier.compose.component.floating_button.properties.BezierFloatingButtonColor
import io.channel.bezier.compose.component.floating_button.properties.BezierFloatingButtonContent
import io.channel.bezier.compose.component.floating_button.properties.BezierFloatingButtonSize
import io.channel.bezier.compose.component.floating_button.properties.BezierFloatingButtonVariant
import io.channel.bezier.compose.component.loader.BezierLoader
import io.channel.bezier.compose.component.loader.properties.BezierLoaderSize
import io.channel.bezier.compose.component.loader.properties.BezierLoaderVariant
import io.channel.bezier.compose.foundation.BezierShadowStyle
import io.channel.bezier.compose.foundation.bezierShadow
import io.channel.bezier.extension.thenIf
import io.channel.bezier.extension.toEmojiPainter
import io.channel.bezier.icon.ArrowRight
import io.channel.bezier.icon.Plus

@Composable
fun BezierFloatingButton(
    text: String,
    size: BezierFloatingButtonSize,
    variant: BezierFloatingButtonVariant,
    color: BezierFloatingButtonColor,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    prefixContent: BezierFloatingButtonContent? = null,
    suffixContent: BezierFloatingButtonContent? = null,
    isLoading: Boolean = false,
    enabled: Boolean = true,
) {
    val colorSchemes = color.getColorSchemes(variant)
    val backgroundColor = colorSchemes.backgroundColor().color
    val contentColor = colorSchemes.contentColor().color

    val shape = RoundedCornerShape(100.dp)

    Box(
        modifier = modifier
            .bezierShadow(BezierShadowStyle.Shadow2, shape)
            .clip(shape)
            .thenIf(!enabled) {
                alpha(0.4f)
            }
            .background(backgroundColor)
            .clickable(enabled = enabled) { onClick() }
            .padding(size.containerPadding),
        contentAlignment = Alignment.Center,
    ) {
        if (isLoading) {
            BezierLoader(
                variant = BezierLoaderVariant.OnOverlay,
                size = BezierLoaderSize.Small,
            )
        }

        Row(
            modifier = Modifier
                .thenIf(isLoading) {
                    alpha(0f)
                },
            verticalAlignment = Alignment.CenterVertically,
        ) {
            if (prefixContent != null) {
                BezierFloatingButtonContent(
                    content = prefixContent,
                    size = size,
                    contentColor = contentColor,
                )
            }

            Text(
                modifier = Modifier
                    .padding(size.textPadding)
                    .weight(1f, fill = false),
                text = text,
                style = size.textStyle(),
                color = contentColor,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
            )

            if (suffixContent != null) {
                BezierFloatingButtonContent(
                    content = suffixContent,
                    size = size,
                    contentColor = contentColor,
                )
            }
        }
    }
}

@Composable
private fun BezierFloatingButtonContent(
    content: BezierFloatingButtonContent,
    size: BezierFloatingButtonSize,
    contentColor: Color,
) {
    when (content) {
        is BezierFloatingButtonContent.Icon -> Icon(
            modifier = Modifier.size(size.iconSize),
            painter = rememberVectorPainter(content.icon.imageVector),
            contentDescription = null,
            tint = contentColor,
        )

        is BezierFloatingButtonContent.Avatar -> BezierAvatar(
            painter = content.painter,
            avatarSize = size.avatarSize,
        )

        is BezierFloatingButtonContent.Emoji -> Image(
            modifier = Modifier.size(size.emojiSize),
            painter = content.name.toEmojiPainter,
            contentDescription = content.name,
        )
    }
}

@Composable
@Preview(
    showBackground = true,
    widthDp = 1200,
)
private fun BezierFloatingButtonStylePreview() {
    BezierTheme {
        Column(
            modifier = Modifier
                .background(Color.White)
                .padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            BezierFloatingButtonVariant.entries.forEach { variant ->
                Row(
                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                ) {
                    BezierFloatingButtonColor.entries.forEach { color ->
                        BezierFloatingButton(
                            text = "Label",
                            size = BezierFloatingButtonSize.Medium,
                            variant = variant,
                            color = color,
                            prefixContent = BezierFloatingButtonContent.Icon(BezierIcons.Plus),
                            suffixContent = BezierFloatingButtonContent.Icon(BezierIcons.ArrowRight),
                            onClick = { },
                        )
                    }
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun BezierFloatingButtonSizePreview() {
    BezierTheme {
        Column(
            modifier = Modifier.padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            BezierFloatingButtonSize.entries.forEach { size ->
                BezierFloatingButton(
                    text = "Label",
                    size = size,
                    variant = BezierFloatingButtonVariant.Primary,
                    color = BezierFloatingButtonColor.Blue,
                    prefixContent = BezierFloatingButtonContent.Icon(BezierIcons.Plus),
                    suffixContent = BezierFloatingButtonContent.Icon(BezierIcons.ArrowRight),
                    onClick = { },
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun BezierFloatingButtonOnlyTextPreview() {
    BezierTheme {
        BezierFloatingButton(
            text = "Label",
            size = BezierFloatingButtonSize.Medium,
            variant = BezierFloatingButtonVariant.Primary,
            color = BezierFloatingButtonColor.Blue,
            onClick = { },
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun BezierFloatingButtonOtherContentsPreview() {
    BezierTheme {
        BezierFloatingButton(
            text = "Label",
            size = BezierFloatingButtonSize.Medium,
            variant = BezierFloatingButtonVariant.Primary,
            color = BezierFloatingButtonColor.Blue,
            onClick = { },
            prefixContent = BezierFloatingButtonContent.Avatar(painterResource(id = R.drawable.unknown)),
            suffixContent = BezierFloatingButtonContent.Emoji("smile")
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun BezierFloatingButtonLoadingPreview() {
    BezierTheme {
        BezierFloatingButton(
            text = "Label",
            size = BezierFloatingButtonSize.Large,
            variant = BezierFloatingButtonVariant.Primary,
            color = BezierFloatingButtonColor.Blue,
            onClick = { },
            prefixContent = BezierFloatingButtonContent.Icon(BezierIcons.Plus),
            suffixContent = BezierFloatingButtonContent.Icon(BezierIcons.ArrowRight),
            isLoading = true,
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun BezierFloatingButtonEnabledPreview() {
    BezierTheme {
        Column(
            modifier = Modifier.padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            BezierFloatingButton(
                text = "Label",
                size = BezierFloatingButtonSize.Large,
                variant = BezierFloatingButtonVariant.Primary,
                color = BezierFloatingButtonColor.Blue,
                onClick = { },
                prefixContent = BezierFloatingButtonContent.Icon(BezierIcons.Plus),
                suffixContent = BezierFloatingButtonContent.Icon(BezierIcons.ArrowRight),
                enabled = true,
            )

            BezierFloatingButton(
                text = "Label",
                size = BezierFloatingButtonSize.Large,
                variant = BezierFloatingButtonVariant.Primary,
                color = BezierFloatingButtonColor.Blue,
                onClick = { },
                prefixContent = BezierFloatingButtonContent.Icon(BezierIcons.Plus),
                suffixContent = BezierFloatingButtonContent.Icon(BezierIcons.ArrowRight),
                enabled = false,
            )
        }
    }
}
