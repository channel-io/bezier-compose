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
import io.channel.bezier.icon.Plus
import io.channel.bezier.v3.component.IconButton
import io.channel.bezier.v3.component.IconButtonSize
import io.channel.bezier.v3.component.IconButtonVariant

@Composable
fun IconButtonPlaygroundScreen(onBack: () -> Unit) {
    var size by remember { mutableStateOf(IconButtonSize.Medium) }
    var variant by remember { mutableStateOf(IconButtonVariant.Ghost) }
    var isActive by remember { mutableStateOf(false) }
    var isLoading by remember { mutableStateOf(false) }
    var enabled by remember { mutableStateOf(true) }

    Scaffold(
            topBar = {
                TopAppBar(
                        title = { Text("IconButton") },
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
                IconButton(
                        icon = BezierIcons.Plus,
                        onClick = {},
                        size = size,
                        variant = variant,
                        isActive = isActive,
                        isLoading = isLoading,
                        enabled = enabled,
                        contentDescription = "Sample",
                )
            }

            Divider()

            EnumControl("Size", IconButtonSize.values(), size) { size = it }
            EnumControl("Variant", IconButtonVariant.values(), variant) { variant = it }
            BooleanControl("isActive", isActive) { isActive = it }
            BooleanControl("isLoading", isLoading) { isLoading = it }
            BooleanControl("enabled", enabled) { enabled = it }
        }
    }
}
