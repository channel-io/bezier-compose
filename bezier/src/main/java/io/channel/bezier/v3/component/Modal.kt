package io.channel.bezier.v3.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.dropShadow
import androidx.compose.ui.graphics.shadow.Shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import io.channel.bezier.BezierTheme
import io.channel.bezier.component.BezierText
import io.channel.bezier.typography.BezierTypo

@Composable
fun Modal(
        onDismissRequest: () -> Unit,
        modifier: Modifier = Modifier,
        cancellable: Boolean = true,
        content: @Composable ColumnScope.() -> Unit,
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
        ModalLayout(
                modifier = modifier,
                content = content,
        )
    }
}

@Composable
private fun ModalLayout(
        modifier: Modifier = Modifier,
        content: @Composable ColumnScope.() -> Unit,
) {
    val elevationColor = BezierTheme.colorsV3.elevationLarge
    val shadow = remember(elevationColor) {
        Shadow(
                radius = ModalShadowRadius,
                color = elevationColor,
                spread = ModalShadowSpread,
                offset = DpOffset(0.dp, ModalShadowOffsetY),
        )
    }

    Column(
            modifier = modifier
                    .padding(horizontal = ModalScreenHorizontalMargin)
                    .widthIn(max = ModalMaxWidth)
                    .fillMaxWidth()
                    .dropShadow(
                            shape = ModalShape,
                            shadow = shadow,
                    )
                    .clip(ModalShape)
                    .background(BezierTheme.colorsV3.surfaceHigher)
                    .padding(
                            start = ModalHorizontalPadding,
                            top = ModalTopPadding,
                            end = ModalHorizontalPadding,
                            bottom = ModalBottomPadding,
                    ),
            horizontalAlignment = Alignment.CenterHorizontally,
            content = content,
    )
}

private val ModalMaxWidth: Dp = 480.dp
private val ModalScreenHorizontalMargin: Dp = 40.dp
private val ModalCornerRadius: Dp = 32.dp
private val ModalHorizontalPadding: Dp = 16.dp
private val ModalTopPadding: Dp = 20.dp
private val ModalBottomPadding: Dp = 16.dp
private val ModalShadowRadius: Dp = 20.dp
private val ModalShadowSpread: Dp = 0.dp
private val ModalShadowOffsetY: Dp = 4.dp
private val ModalShape = RoundedCornerShape(ModalCornerRadius)

@Composable
private fun ModalPreviewContent() {
    BezierTheme {
        Column(
                modifier = Modifier
                        .fillMaxWidth()
                        .background(BezierTheme.colorsV3.surfaceLow)
                        .padding(vertical = 32.dp),
        ) {
            ModalLayout {
                BezierText(
                        modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 40.dp),
                        text = "customContent",
                        typo = BezierTypo.TextMedium,
                        color = BezierTheme.colorsV3.textNeutral,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ModalPreview() = ModalPreviewContent()

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun ModalDarkPreview() = ModalPreviewContent()
