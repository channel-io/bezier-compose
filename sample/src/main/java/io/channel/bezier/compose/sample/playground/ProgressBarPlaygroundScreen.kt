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
import io.channel.bezier.v3.component.ProgressBar
import io.channel.bezier.v3.component.ProgressBarSize
import io.channel.bezier.v3.component.ProgressBarVariant

@Composable
fun ProgressBarPlaygroundScreen(onBack: () -> Unit) {
    var progress by remember { mutableStateOf(60) }
    var size by remember { mutableStateOf(ProgressBarSize.Medium) }
    var variant by remember { mutableStateOf(ProgressBarVariant.Default) }

    Scaffold(
            topBar = {
                TopAppBar(
                        title = { Text("ProgressBar") },
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
                ProgressBar(
                        modifier = Modifier.fillMaxWidth(),
                        progress = progress,
                        size = size,
                        variant = variant,
                )
            }

            Divider()

            SliderControl("Progress", progress, 0..100) { progress = it }
            EnumControl("Size", ProgressBarSize.values(), size) { size = it }
            EnumControl("Variant", ProgressBarVariant.values(), variant) { variant = it }
        }
    }
}
