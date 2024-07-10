package io.channel.bezier.compose.component.button

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
import androidx.compose.material.Button
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.extension.thenIf
import io.channel.bezier.icon.ArrowRight
import io.channel.bezier.icon.Plus

@Composable
fun BezierButton(
        text: String,
        size: BezierButtonSize,
        variant: BezierButtonVariant,
        color: BezierButtonColor,
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        prefixContent: BezierButtonContent? = null,
        suffixContent: BezierButtonContent? = null,
        isLoading: Boolean = false,
        enabled: Boolean = true,
) {
    val colorSchemes = BezierButtonColorSchemes(
            backgroundColor = color.getBackgroundColor(variant),
            contentColor = color.getContentColor(variant),
    )

    Box(
            modifier = modifier
                    .clip(RoundedCornerShape(size.radius))
                    .thenIf(!enabled) {
                        alpha(0.4f)
                    }
                    .background(colorSchemes.backgroundColor)
                    .clickable(enabled = enabled) { onClick() }
                    .padding(size.containerPadding),
            contentAlignment = Alignment.Center,
    ) {
        if (isLoading) {
            // TODO : 베지어 로더로 변경 예정
            CircularProgressIndicator(
                    modifier = Modifier.size(size.iconSize),
                    color = colorSchemes.contentColor,
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
                BezierButtonContent(
                        content = prefixContent,
                        size = size,
                        colorSchemes = colorSchemes,
                )
            }

            Text(
                    modifier = Modifier
                            .padding(size.textPadding)
                            .weight(1f, fill = false),
                    text = text,
                    style = size.textStyle,
                    color = colorSchemes.contentColor,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
            )

            if (suffixContent != null) {
                BezierButtonContent(
                        content = suffixContent,
                        size = size,
                        colorSchemes = colorSchemes,
                )
            }
        }
    }
}

@Composable
private fun BezierButtonContent(
        content: BezierButtonContent,
        size: BezierButtonSize,
        colorSchemes: BezierButtonColorSchemes,
) {
    when (content) {
        is BezierButtonContent.Icon -> Icon(
                modifier = Modifier.size(size.iconSize),
                painter = rememberVectorPainter(content.icon.imageVector),
                contentDescription = null,
                tint = colorSchemes.contentColor,
        )

        // TODO : Not Implementation
        is BezierButtonContent.Avatar -> Box(
                modifier = Modifier,
        )

        // TODO : Not Implementation
        is BezierButtonContent.Emoji -> Image(
                modifier = Modifier.size(size.iconSize),
                painter = content.painter,
                contentDescription = null,
        )
    }
}

private class BezierButtonColorSchemes(
        val backgroundColor: Color,
        val contentColor: Color,
)

@Composable
@Preview(
        showBackground = true,
        widthDp = 1200,
)
private fun BezierButtonStylePreview() {
    BezierTheme {
        Column(
                modifier = Modifier.padding(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            BezierButtonVariant.entries.forEach { variant ->
                Row(
                        horizontalArrangement = Arrangement.spacedBy(4.dp),
                ) {
                    BezierButtonColor.entries.forEach { color ->
                        BezierButton(
                                text = "Label",
                                size = BezierButtonSize.Medium,
                                variant = variant,
                                color = color,
                                prefixContent = BezierButtonContent.Icon(BezierIcons.Plus),
                                suffixContent = BezierButtonContent.Icon(BezierIcons.ArrowRight),
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
private fun BezierButtonSizePreview() {
    BezierTheme {
        Column(
                modifier = Modifier.padding(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            BezierButtonSize.entries.forEach { size ->
                BezierButton(
                        text = "Label",
                        size = size,
                        variant = BezierButtonVariant.Primary,
                        color = BezierButtonColor.Blue,
                        prefixContent = BezierButtonContent.Icon(BezierIcons.Plus),
                        suffixContent = BezierButtonContent.Icon(BezierIcons.ArrowRight),
                        onClick = { },
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun BezierButtonOnlyTextPreview() {
    BezierTheme {
        BezierButton(
                text = "Label",
                size = BezierButtonSize.Medium,
                variant = BezierButtonVariant.Primary,
                color = BezierButtonColor.Blue,
                onClick = { },
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun BezierButtonLoadingPreview() {
    BezierTheme {
        BezierButton(
                text = "Label",
                size = BezierButtonSize.Large,
                variant = BezierButtonVariant.Primary,
                color = BezierButtonColor.Blue,
                onClick = { },
                prefixContent = BezierButtonContent.Icon(BezierIcons.Plus),
                suffixContent = BezierButtonContent.Icon(BezierIcons.ArrowRight),
                isLoading = true,
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun BezierButtonEnabledPreview() {
    BezierTheme {
        Column(
                modifier = Modifier.padding(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            BezierButton(
                    text = "Label",
                    size = BezierButtonSize.Large,
                    variant = BezierButtonVariant.Primary,
                    color = BezierButtonColor.Blue,
                    onClick = { },
                    prefixContent = BezierButtonContent.Icon(BezierIcons.Plus),
                    suffixContent = BezierButtonContent.Icon(BezierIcons.ArrowRight),
                    enabled = true,
            )

            BezierButton(
                    text = "Label",
                    size = BezierButtonSize.Large,
                    variant = BezierButtonVariant.Primary,
                    color = BezierButtonColor.Blue,
                    onClick = { },
                    prefixContent = BezierButtonContent.Icon(BezierIcons.Plus),
                    suffixContent = BezierButtonContent.Icon(BezierIcons.ArrowRight),
                    enabled = false,
            )
        }
    }
}
