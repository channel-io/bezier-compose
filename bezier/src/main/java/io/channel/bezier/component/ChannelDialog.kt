package io.channel.bezier.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import io.channel.bezier.BezierTheme

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun ChannelDialog(
        onDismissRequest: () -> Unit,
        modifier: Modifier = Modifier,
        buttonOrientation: ButtonOrientation = ButtonOrientation.Auto,
        cancellable: Boolean = true,
        title: (@Composable () -> Unit)? = null,
        description: (@Composable () -> Unit)? = null,
        content: (@Composable () -> Unit)? = null,
        buttonBuilder: ChannelDialogButtonBuilder.() -> Unit,
) {
    val properties = remember(cancellable) {
        DialogProperties(
                dismissOnBackPress = cancellable,
                dismissOnClickOutside = cancellable,
                usePlatformDefaultWidth = false,
        )
    }

    Dialog(
            onDismissRequest = onDismissRequest,
            properties = properties,
    ) {
        ChannelDialogLayout(
                modifier = modifier,
                title = title,
                buttonOrientation = buttonOrientation,
                description = description,
                content = content,
                buttonBuilder = buttonBuilder,
        )
    }
}

@Composable
private fun ChannelDialogLayout(
        modifier: Modifier = Modifier,
        buttonOrientation: ButtonOrientation = ButtonOrientation.Auto,
        title: @Composable (() -> Unit)? = null,
        description: @Composable (() -> Unit)? = null,
        content: @Composable (() -> Unit)? = null,
        buttonBuilder: ChannelDialogButtonBuilder.() -> Unit,
) {
    Surface(
            modifier = modifier
                    .padding(horizontal = 40.dp)
                    .widthIn(max = 480.dp)
                    .fillMaxWidth(),
            color = BezierTheme.colors.bgWhiteNormal,
            shape = RoundedCornerShape(16.dp),
    ) {
        Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            if (title != null) {
                Spacer(modifier = Modifier.height(4.dp))

                CompositionLocalProvider(
                        LocalTextStyle provides TextStyle(
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                color = BezierTheme.colors.txtBlackDarkest,
                                textAlign = TextAlign.Center,
                        ),
                ) {
                    title()
                }
            }

            if (description != null) {
                Spacer(modifier = Modifier.height(8.dp))

                CompositionLocalProvider(
                        LocalTextStyle provides TextStyle(
                                fontSize = 14.sp,
                                color = BezierTheme.colors.txtBlackDarkest,
                                textAlign = TextAlign.Center,
                        ),
                ) {
                    description()
                }
            }

            if (content != null) {
                Spacer(modifier = Modifier.height(16.dp))
                content()
            }

            Spacer(modifier = Modifier.height(20.dp))

            val buttons = remember(buttonBuilder) {
                ChannelDialogButtonBuilderImpl()
                        .apply(buttonBuilder)
                        .buttons
            }

            if (buttons.size > 2 || buttonOrientation == ButtonOrientation.Vertical) {
                Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    buttons.forEach {
                        Button(
                                modifier = Modifier.fillMaxWidth(),
                                text = it.text(),
                                color = it.color,
                                size = it.size,
                                type = it.type,
                                onClick = it.onClick,
                        )
                    }
                }
            } else {
                Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    buttons.forEach {
                        Button(
                                modifier = Modifier.weight(1f),
                                text = it.text(),
                                color = it.color,
                                size = it.size,
                                type = it.type,
                                onClick = it.onClick,
                        )
                    }
                }
            }
        }
    }
}

enum class ButtonOrientation {
    Auto, Vertical
}

interface ChannelDialogButtonBuilder {
    fun button(
            text: @Composable () -> String,
            size: ButtonSize = ButtonSize.L,
            type: ButtonType = ButtonType.Secondary,
            color: ButtonColor = ButtonColor.MonochromeLight,
            onClick: () -> Unit,
    )
}

private class ChannelDialogButtonBuilderImpl : ChannelDialogButtonBuilder {
    val buttons = mutableListOf<ButtonInfo>()

    override fun button(
            text: @Composable () -> String,
            size: ButtonSize,
            type: ButtonType,
            color: ButtonColor,
            onClick: () -> Unit,
    ) {
        buttons += ButtonInfo(
                text = text,
                size = size,
                type = type,
                color = color,
                onClick = onClick,
        )
    }
}

private class ButtonInfo(
        val text: @Composable () -> String,
        val size: ButtonSize,
        val type: ButtonType,
        val color: ButtonColor,
        val onClick: () -> Unit,
)

@Preview
@Composable
private fun ChannelDialogLayoutPreview() {
    ChannelDialogLayout(
            title = { Text("영구히 삭제하시겠습니까?") },
            description = { Text("통계 및 해당 채팅과 관련된 모든 데이터가 사라지게 됩니다. 이 동작은 되돌릴 수 없습니다.") },
    ) {
        button(
                text = { "취소" },
                onClick = {},
        )

        button(
                text = { "삭제" },
                type = ButtonType.Primary,
                color = ButtonColor.Red,
                onClick = {},
        )
    }
}

@Preview
@Composable
private fun ChannelDialogLayoutPreview2() {
    ChannelDialogLayout(
            title = { Text("영구히 삭제하시겠습니까?") },
            description = { Text("통계 및 해당 채팅과 관련된 모든 데이터가 사라지게 됩니다. 이 동작은 되돌릴 수 없습니다.") },
    ) {
        button(
                text = { "취소" },
                onClick = {},
        )

        button(
                text = { "삭제" },
                type = ButtonType.Primary,
                color = ButtonColor.Red,
                onClick = {},
        )

        button(
                text = { "수정" },
                type = ButtonType.Primary,
                color = ButtonColor.Blue,
                onClick = {},
        )
    }
}
