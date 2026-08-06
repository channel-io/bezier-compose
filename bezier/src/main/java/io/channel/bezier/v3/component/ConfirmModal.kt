package io.channel.bezier.v3.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme
import io.channel.bezier.component.BezierText
import io.channel.bezier.typography.BezierTypo
import io.channel.bezier.typography.BezierWeight

enum class ConfirmModalButtonLayout {
    Horizontal,
    Vertical,
}

@Composable
fun ConfirmModal(
        title: String,
        confirmText: String,
        onConfirmClick: () -> Unit,
        onDismissRequest: () -> Unit,
        modifier: Modifier = Modifier,
        description: String? = null,
        cancelText: String? = null,
        onCancelClick: () -> Unit = {},
        altActionText: String? = null,
        onAltActionClick: () -> Unit = {},
        destructive: Boolean = false,
        buttonLayout: ConfirmModalButtonLayout = ConfirmModalButtonLayout.Horizontal,
        cancellable: Boolean = true,
        customContent: (@Composable () -> Unit)? = null,
) {
    Modal(
            onDismissRequest = onDismissRequest,
            modifier = modifier,
            cancellable = cancellable,
    ) {
        ConfirmModalContent(
                title = title,
                description = description,
        )

        if (customContent != null) {
            Box(modifier = Modifier.fillMaxWidth()) {
                customContent()
            }
        }

        ConfirmModalButtons(
                confirmText = confirmText,
                onConfirmClick = onConfirmClick,
                cancelText = cancelText,
                onCancelClick = onCancelClick,
                altActionText = altActionText,
                onAltActionClick = onAltActionClick,
                destructive = destructive,
                buttonLayout = buttonLayout,
        )
    }
}

@Composable
private fun ConfirmModalContent(
        title: String,
        description: String?,
) {
    val textColor = BezierTheme.colorsV3.textNeutral

    Column(
            modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = ConfirmModalContentBottomPadding),
            verticalArrangement = Arrangement.spacedBy(ConfirmModalContentGap),
    ) {
        BezierText(
                modifier = Modifier.fillMaxWidth(),
                text = title,
                typo = BezierTypo.HeadingXSmall,
                color = textColor,
                textAlign = TextAlign.Center,
        )

        if (description != null) {
            BezierText(
                    modifier = Modifier.fillMaxWidth(),
                    text = description,
                    typo = BezierTypo.TextLarge,
                    weight = BezierWeight.Regular,
                    color = textColor,
                    textAlign = TextAlign.Center,
            )
        }
    }
}

@Composable
private fun ConfirmModalButtons(
        confirmText: String,
        onConfirmClick: () -> Unit,
        cancelText: String?,
        onCancelClick: () -> Unit,
        altActionText: String?,
        onAltActionClick: () -> Unit,
        destructive: Boolean,
        buttonLayout: ConfirmModalButtonLayout,
) {
    val confirmSemantic = if (destructive) ButtonSemantic.Destructive else ButtonSemantic.Primary
    val isVertical = buttonLayout == ConfirmModalButtonLayout.Vertical

    if (isVertical) {
        Column(
                modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = ConfirmModalButtonsTopPadding),
                verticalArrangement = Arrangement.spacedBy(ConfirmModalVerticalButtonGap),
        ) {
            Button(
                    modifier = Modifier.fillMaxWidth(),
                    text = confirmText,
                    onClick = onConfirmClick,
                    size = ButtonSize.Large,
                    semantic = confirmSemantic,
            )

            if (altActionText != null) {
                Button(
                        modifier = Modifier.fillMaxWidth(),
                        text = altActionText,
                        onClick = onAltActionClick,
                        size = ButtonSize.Large,
                        semantic = ButtonSemantic.Secondary,
                )
            }

            if (cancelText != null) {
                Button(
                        modifier = Modifier.fillMaxWidth(),
                        text = cancelText,
                        onClick = onCancelClick,
                        size = ButtonSize.Large,
                        semantic = ButtonSemantic.Secondary,
                )
            }
        }
    } else {
        Row(
                modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = ConfirmModalButtonsTopPadding),
                horizontalArrangement = Arrangement.spacedBy(ConfirmModalHorizontalButtonGap),
        ) {
            if (cancelText != null) {
                Button(
                        modifier = Modifier.weight(1f),
                        text = cancelText,
                        onClick = onCancelClick,
                        size = ButtonSize.Large,
                        semantic = ButtonSemantic.Secondary,
                )
            }

            Button(
                    modifier = Modifier.weight(1f),
                    text = confirmText,
                    onClick = onConfirmClick,
                    size = ButtonSize.Large,
                    semantic = confirmSemantic,
            )
        }
    }
}

private val ConfirmModalContentGap: Dp = 10.dp
private val ConfirmModalContentBottomPadding: Dp = 8.dp
private val ConfirmModalButtonsTopPadding: Dp = 12.dp
private val ConfirmModalHorizontalButtonGap: Dp = 8.dp
private val ConfirmModalVerticalButtonGap: Dp = 10.dp

@Composable
private fun ConfirmModalPreviewContent(
        destructive: Boolean,
        buttonLayout: ConfirmModalButtonLayout,
        cancelText: String? = "Cancel",
        altActionText: String? = null,
) {
    BezierTheme {
        Column(
                modifier = Modifier
                        .fillMaxWidth()
                        .background(BezierTheme.colorsV3.surfaceLow)
                        .padding(vertical = 24.dp),
        ) {
            ModalLayout {
                ConfirmModalContent(
                        title = "Dialog Title",
                        description = "Description text goes here.",
                )

                ConfirmModalButtons(
                        confirmText = if (destructive) "Delete" else "Confirm",
                        onConfirmClick = {},
                        cancelText = cancelText,
                        onCancelClick = {},
                        altActionText = altActionText,
                        onAltActionClick = {},
                        destructive = destructive,
                        buttonLayout = buttonLayout,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ConfirmModalHorizontalPreview() = ConfirmModalPreviewContent(
        destructive = false,
        buttonLayout = ConfirmModalButtonLayout.Horizontal,
)

@Preview(showBackground = true)
@Composable
private fun ConfirmModalHorizontalDestructivePreview() = ConfirmModalPreviewContent(
        destructive = true,
        buttonLayout = ConfirmModalButtonLayout.Horizontal,
)

@Preview(showBackground = true)
@Composable
private fun ConfirmModalVerticalPreview() = ConfirmModalPreviewContent(
        destructive = false,
        buttonLayout = ConfirmModalButtonLayout.Vertical,
)

@Preview(showBackground = true)
@Composable
private fun ConfirmModalAltActionPreview() = ConfirmModalPreviewContent(
        destructive = true,
        buttonLayout = ConfirmModalButtonLayout.Vertical,
        altActionText = "Alt Action",
)

@Preview(showBackground = true)
@Composable
private fun ConfirmModalConfirmOnlyPreview() = ConfirmModalPreviewContent(
        destructive = false,
        buttonLayout = ConfirmModalButtonLayout.Horizontal,
        cancelText = null,
)

@Preview(showBackground = true)
@Composable
private fun ConfirmModalVerticalAltActionWithoutCancelPreview() = ConfirmModalPreviewContent(
        destructive = false,
        buttonLayout = ConfirmModalButtonLayout.Vertical,
        cancelText = null,
        altActionText = "Alt Action",
)

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun ConfirmModalDarkPreview() = ConfirmModalPreviewContent(
        destructive = false,
        buttonLayout = ConfirmModalButtonLayout.Horizontal,
)
