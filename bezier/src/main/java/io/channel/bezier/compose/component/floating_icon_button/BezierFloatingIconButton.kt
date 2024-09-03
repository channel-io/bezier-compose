package io.channel.bezier.compose.component.floating_icon_button

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
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
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.component.avatar.BezierAvatar
import io.channel.bezier.compose.component.floating_icon_button.properties.BezierFloatingIconButtonColor
import io.channel.bezier.compose.component.floating_icon_button.properties.BezierFloatingIconButtonContent
import io.channel.bezier.compose.component.floating_icon_button.properties.BezierFloatingIconButtonSize
import io.channel.bezier.compose.component.floating_icon_button.properties.BezierFloatingIconButtonVariant
import io.channel.bezier.compose.component.loader.BezierLoader
import io.channel.bezier.compose.component.loader.properties.BezierLoaderSize
import io.channel.bezier.compose.component.loader.properties.BezierLoaderVariant
import io.channel.bezier.compose.foundation.ShadowStyle
import io.channel.bezier.compose.foundation.bezierShadow
import io.channel.bezier.extension.thenIf
import io.channel.bezier.extension.toEmojiPainter
import io.channel.bezier.icon.Plus

@Composable
fun BezierFloatingIconButton(
        content: BezierFloatingIconButtonContent,
        size: BezierFloatingIconButtonSize,
        variant: BezierFloatingIconButtonVariant,
        color: BezierFloatingIconButtonColor,
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
                    .requiredSize(size.contentSize)
                    .bezierShadow(ShadowStyle.Shadow2, CircleShape)
                    .clip(CircleShape)
                    .thenIf(!enabled) {
                        alpha(0.4f)
                    }
                    .background(backgroundColor)
                    .clickable(enabled = enabled) { onClick() },
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
            BezierFloatingIconButtonContent(
                    content = content,
                    size = size,
                    contentColor = contentColor,
            )
        }
    }
}

@Composable
private fun BezierFloatingIconButtonContent(
        content: BezierFloatingIconButtonContent,
        size: BezierFloatingIconButtonSize,
        contentColor: Color,
) {
    when (content) {
        is BezierFloatingIconButtonContent.Icon -> Icon(
                modifier = Modifier.size(size.iconSize),
                painter = rememberVectorPainter(content.icon.imageVector),
                contentDescription = null,
                tint = contentColor,
        )

        is BezierFloatingIconButtonContent.Avatar -> BezierAvatar(
                painter = content.painter,
                size = size.avatarSize,
        )

        is BezierFloatingIconButtonContent.Emoji -> Image(
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
private fun BezierIconButtonPreview() {
    BezierTheme {
        Column(
                modifier = Modifier.padding(8.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            BezierFloatingIconButtonVariant.entries.forEach { variant ->
                BezierFloatingIconButtonSize.entries.forEach { size ->
                    Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp),
                    ) {
                        BezierFloatingIconButtonColor.entries.forEach { color ->
                            Box(
                                    modifier = Modifier.width(BezierFloatingIconButtonSize.XLarge.contentSize),
                                    contentAlignment = Alignment.Center,
                            ) {
                                BezierFloatingIconButton(
                                        content = BezierFloatingIconButtonContent.Icon(BezierIcons.Plus),
                                        size = size,
                                        variant = variant,
                                        color = color,
                                        onClick = { },
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
