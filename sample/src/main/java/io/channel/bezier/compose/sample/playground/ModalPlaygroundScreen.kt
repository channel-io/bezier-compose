package io.channel.bezier.compose.sample.playground

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.component.BezierText
import io.channel.bezier.icon.ArrowLeft
import io.channel.bezier.typography.BezierTypo
import io.channel.bezier.v3.component.Button
import io.channel.bezier.v3.component.IconButton
import io.channel.bezier.v3.component.IconButtonSize
import io.channel.bezier.v3.component.IconButtonVariant
import io.channel.bezier.v3.component.Modal

private const val ShortContent = "customContent"

private const val LongContent =
        "customContent 슬롯은 가로를 가득 채우고, 컨테이너 높이는 이 내용의 높이가 결정합니다. 문장이 길어지면 Modal도 함께 늘어납니다."

@Composable
fun ModalPlaygroundScreen(onBack: () -> Unit) {
    var visible by remember { mutableStateOf(false) }
    var cancellable by remember { mutableStateOf(true) }
    var longContent by remember { mutableStateOf(false) }

    Scaffold(
            topBar = {
                TopAppBar(
                        title = { Text("Modal") },
                        navigationIcon = {
                            IconButton(
                                    icon = BezierIcons.ArrowLeft,
                                    onClick = onBack,
                                    size = IconButtonSize.Medium,
                                    variant = IconButtonVariant.Ghost,
                                    contentDescription = "Back",
                            )
                        },
                )
            },
    ) { padding ->
        Column(
                modifier = Modifier
                        .padding(padding)
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState()),
        ) {
            Box(
                    modifier = Modifier
                            .fillMaxWidth()
                            .background(BezierTheme.colorsV3.surfaceLow)
                            .padding(32.dp),
                    contentAlignment = Alignment.Center,
            ) {
                Button(
                        text = "Open Modal",
                        onClick = { visible = true },
                )
            }

            Divider()

            BooleanControl("Cancellable", cancellable) { cancellable = it }
            BooleanControl("Long content", longContent) { longContent = it }
        }
    }

    if (visible) {
        Modal(
                onDismissRequest = { visible = false },
                cancellable = cancellable,
        ) {
            BezierText(
                    modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 20.dp),
                    text = if (longContent) LongContent else ShortContent,
                    typo = BezierTypo.TextMedium,
                    color = BezierTheme.colorsV3.textNeutral,
            )

            Button(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Close",
                    onClick = { visible = false },
            )
        }
    }
}
