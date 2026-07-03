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
import io.channel.bezier.icon.ArrowLeft
import io.channel.bezier.v3.component.IconButton
import io.channel.bezier.v3.component.IconButtonSize
import io.channel.bezier.v3.component.IconButtonVariant
import io.channel.bezier.v3.component.Status
import io.channel.bezier.v3.component.StatusSize
import io.channel.bezier.v3.component.StatusType

@Composable
fun StatusPlaygroundScreen(onBack: () -> Unit) {
    var type by remember { mutableStateOf(StatusType.Online) }
    var size by remember { mutableStateOf(StatusSize.XLarge) }

    Scaffold(
            topBar = {
                TopAppBar(
                        title = { Text("Status") },
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
                Status(type = type, size = size)
            }

            Divider()

            EnumControl("type", StatusType.values(), type) { type = it }
            EnumControl("Size", StatusSize.values(), size) { size = it }
        }
    }
}
