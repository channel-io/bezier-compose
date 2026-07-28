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
import io.channel.bezier.v3.component.ConfirmModal
import io.channel.bezier.v3.component.ConfirmModalButtonLayout
import io.channel.bezier.v3.component.IconButton
import io.channel.bezier.v3.component.IconButtonSize
import io.channel.bezier.v3.component.IconButtonVariant

@Composable
fun ConfirmModalPlaygroundScreen(onBack: () -> Unit) {
    var visible by remember { mutableStateOf(false) }
    var buttonLayout by remember { mutableStateOf(ConfirmModalButtonLayout.Horizontal) }
    var destructive by remember { mutableStateOf(false) }
    var hasDescription by remember { mutableStateOf(true) }
    var hasAltAction by remember { mutableStateOf(false) }
    var hasCustomContent by remember { mutableStateOf(false) }
    var cancellable by remember { mutableStateOf(true) }

    Scaffold(
            topBar = {
                TopAppBar(
                        title = { Text("ConfirmModal") },
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
                        text = "Open ConfirmModal",
                        onClick = { visible = true },
                )
            }

            Divider()

            EnumControl(
                    label = "buttonLayout",
                    options = ConfirmModalButtonLayout.values(),
                    selected = buttonLayout,
            ) { buttonLayout = it }
            BooleanControl("destructive", destructive) { destructive = it }
            BooleanControl("hasDescription", hasDescription) { hasDescription = it }
            BooleanControl("hasAltAction", hasAltAction) { hasAltAction = it }
            BooleanControl("hasCustomContent", hasCustomContent) { hasCustomContent = it }
            BooleanControl("cancellable", cancellable) { cancellable = it }
        }
    }

    if (visible) {
        ConfirmModal(
                title = "Dialog Title",
                confirmText = if (destructive) "Delete" else "Confirm",
                onConfirmClick = { visible = false },
                cancelText = "Cancel",
                onCancelClick = { visible = false },
                onDismissRequest = { visible = false },
                description = "Description text goes here.".takeIf { hasDescription },
                altActionText = "Alt Action".takeIf { hasAltAction },
                onAltActionClick = { visible = false },
                destructive = destructive,
                buttonLayout = buttonLayout,
                cancellable = cancellable,
                customContent = if (hasCustomContent) {
                    {
                        BezierText(
                                modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(vertical = 12.dp),
                                text = "customContent slot",
                                typo = BezierTypo.TextMedium,
                                color = BezierTheme.colorsV3.textNeutralLight,
                        )
                    }
                } else {
                    null
                },
        )
    }
}
