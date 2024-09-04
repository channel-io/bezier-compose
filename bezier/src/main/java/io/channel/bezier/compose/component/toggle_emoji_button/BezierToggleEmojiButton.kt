package io.channel.bezier.compose.component.toggle_emoji_button

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.component.emoji.BezierEmoji
import io.channel.bezier.compose.component.emoji.properties.BezierEmojiSize
import io.channel.bezier.compose.component.toggle_emoji_button.properties.BezierToggleEmojiButtonVariant

@Composable
fun BezierToggleEmojiButton(
        selected: Boolean,
        name: String,
        variant: BezierToggleEmojiButtonVariant,
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
) {
    val colorSchemes = variant.getColorSchemes(selected)

    val shape = RoundedCornerShape(12.dp)
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    Box(
            modifier = modifier
                    .clip(shape)
                    .border(
                            width = variant.borderWidth,
                            color = colorSchemes.borderColor().color,
                            shape = shape,
                    )
                    .clickable(
                            enabled = enabled,
                            interactionSource = interactionSource,
                            indication = null,
                            onClick = onClick,
                    )
                    .background(
                            if (isPressed) {
                                colorSchemes.pressedBackgroundColor().color
                            } else {
                                colorSchemes.backgroundColor().color
                            },
                    )
                    .padding(12.dp),
            contentAlignment = Alignment.Center,
    ) {
        BezierEmoji(
                name = name,
                size = BezierEmojiSize.Size30,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun BezierToggleEmojiButtonPreview() {
    BezierTheme {
        Column(
                modifier = Modifier.padding(10.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            var checked1 by remember { mutableStateOf(false) }
            var checked2 by remember { mutableStateOf(true) }
            var checked3 by remember { mutableStateOf(false) }
            var checked4 by remember { mutableStateOf(true) }

            Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                BezierToggleEmojiButton(
                        selected = checked1,
                        name = "ghost",
                        variant = BezierToggleEmojiButtonVariant.Primary,
                        onClick = { checked1 = !checked1 },
                )

                BezierToggleEmojiButton(
                        selected = checked2,
                        name = "innocent",
                        variant = BezierToggleEmojiButtonVariant.Primary,
                        onClick = { checked2 = !checked2 },
                )
            }

            Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                BezierToggleEmojiButton(
                        selected = checked3,
                        name = "thinking_face",
                        variant = BezierToggleEmojiButtonVariant.Secondary,
                        onClick = { checked3 = !checked3 },
                )

                BezierToggleEmojiButton(
                        selected = checked4,
                        name = "+1",
                        variant = BezierToggleEmojiButtonVariant.Secondary,
                        onClick = { checked4 = !checked4 },
                )
            }
        }
    }
}
