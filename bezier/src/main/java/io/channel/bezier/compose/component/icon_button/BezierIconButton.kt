package io.channel.bezier.compose.component.icon_button

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.component.avatar.BezierAvatar
import io.channel.bezier.compose.component.icon_button.properties.BezierIconButtonColor
import io.channel.bezier.compose.component.icon_button.properties.BezierIconButtonContent
import io.channel.bezier.compose.component.icon_button.properties.BezierIconButtonShape
import io.channel.bezier.compose.component.icon_button.properties.BezierIconButtonSize
import io.channel.bezier.compose.component.icon_button.properties.BezierIconButtonVariant
import io.channel.bezier.compose.component.loader.BezierLoader
import io.channel.bezier.compose.component.loader.properties.BezierLoaderSize
import io.channel.bezier.compose.component.loader.properties.BezierLoaderVariant
import io.channel.bezier.extension.thenIf
import io.channel.bezier.extension.toEmojiPainter
import io.channel.bezier.icon.Plus

@Composable
fun BezierIconButton(
        icon: BezierIcon,
        size: BezierIconButtonSize,
        variant: BezierIconButtonVariant,
        color: BezierIconButtonColor,
        shape: BezierIconButtonShape,
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        isLoading: Boolean = false,
        enabled: Boolean = true,
) {
    BezierIconButton(
            content = BezierIconButtonContent.Icon(icon),
            size = size,
            variant = variant,
            color = color,
            shape = shape,
            onClick = onClick,
            modifier = modifier,
            isLoading = isLoading,
            enabled = enabled,
    )
}

@Composable
fun BezierIconButton(
        content: BezierIconButtonContent,
        size: BezierIconButtonSize,
        variant: BezierIconButtonVariant,
        color: BezierIconButtonColor,
        shape: BezierIconButtonShape,
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        isLoading: Boolean = false,
        enabled: Boolean = true,
) {
    val colorSchemes = color.getColorSchemes(variant)
    val backgroundColor = colorSchemes.backgroundColor().color
    val contentColor = colorSchemes.contentColor().color

    Box(
            modifier = modifier
                    .clip(shape.createShape(size))
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

        Box(
                modifier = Modifier
                        .thenIf(isLoading) {
                            alpha(0f)
                        },
        ) {
            BezierIconButtonContent(
                    content = content,
                    size = size,
                    contentColor = contentColor,
            )
        }

    }
}

@Composable
private fun BezierIconButtonContent(
        content: BezierIconButtonContent,
        size: BezierIconButtonSize,
        contentColor: Color,
) {
    when (content) {
        is BezierIconButtonContent.Icon -> Icon(
                modifier = Modifier.size(size.iconSize),
                painter = rememberVectorPainter(content.icon.imageVector),
                contentDescription = null,
                tint = contentColor,
        )

        is BezierIconButtonContent.Avatar -> BezierAvatar(
                painter = content.painter,
                avatarSize = size.avatarSize,
        )

        is BezierIconButtonContent.Emoji -> Image(
                modifier = Modifier.size(size.emojiSize),
                painter = content.name.toEmojiPainter,
                contentDescription = content.name,
        )
    }
}

@Composable
@Preview(
        showBackground = true,
        widthDp = 500,
)
private fun BezierIconButtonRectanglePreview() {
    BezierTheme {
        Column(
                modifier = Modifier.padding(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            BezierIconButtonVariant.entries.forEach { variant ->
                Row(
                        horizontalArrangement = Arrangement.spacedBy(4.dp),
                ) {
                    BezierIconButtonColor.entries.forEach { color ->
                        BezierIconButton(
                                content = BezierIconButtonContent.Icon(BezierIcons.Plus),
                                size = BezierIconButtonSize.Medium,
                                variant = variant,
                                color = color,
                                shape = BezierIconButtonShape.Rectangle,
                                onClick = { },
                        )
                    }
                }
            }
        }
    }
}

@Composable
@Preview(
        showBackground = true,
        widthDp = 500,
)
private fun BezierIconButtonCirclePreview() {
    BezierTheme {
        Column(
                modifier = Modifier.padding(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            BezierIconButtonVariant.entries.forEach { variant ->
                Row(
                        horizontalArrangement = Arrangement.spacedBy(4.dp),
                ) {
                    BezierIconButtonColor.entries.forEach { color ->
                        BezierIconButton(
                                content = BezierIconButtonContent.Icon(BezierIcons.Plus),
                                size = BezierIconButtonSize.Medium,
                                variant = variant,
                                color = color,
                                shape = BezierIconButtonShape.Circle,
                                onClick = { },
                        )
                    }
                }
            }
        }
    }
}
