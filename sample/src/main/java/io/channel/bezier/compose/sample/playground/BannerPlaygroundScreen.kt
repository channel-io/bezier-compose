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
import io.channel.bezier.v3.component.Banner
import io.channel.bezier.v3.component.BannerColor
import io.channel.bezier.v3.component.IconButton
import io.channel.bezier.v3.component.IconButtonSize
import io.channel.bezier.v3.component.IconButtonVariant

@Composable
fun BannerPlaygroundScreen(onBack: () -> Unit) {
    var color by remember { mutableStateOf(BannerColor.Default) }
    var hasTitle by remember { mutableStateOf(true) }
    var showLeadingIcon by remember { mutableStateOf(true) }
    var clickable by remember { mutableStateOf(false) }
    var dismissible by remember { mutableStateOf(false) }

    Scaffold(
            topBar = {
                TopAppBar(
                        title = { Text("Banner") },
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
            val title = if (hasTitle) "Banner Title" else null
            val onClick: (() -> Unit)? = if (clickable) ({}) else null
            val onDismiss: (() -> Unit)? = if (dismissible) ({}) else null

            Box(
                    modifier = Modifier
                            .fillMaxWidth()
                            .background(BezierTheme.colorsV3.surfaceLow)
                            .padding(32.dp),
                    contentAlignment = Alignment.Center,
            ) {
                if (showLeadingIcon) {
                    Banner(
                            description = "Banner description text goes here.",
                            modifier = Modifier.fillMaxWidth(),
                            color = color,
                            title = title,
                            onClick = onClick,
                            onDismiss = onDismiss,
                    )
                } else {
                    Banner(
                            description = "Banner description text goes here.",
                            modifier = Modifier.fillMaxWidth(),
                            color = color,
                            title = title,
                            leadingIcon = null,
                            onClick = onClick,
                            onDismiss = onDismiss,
                    )
                }
            }

            Divider()

            EnumControl("color", BannerColor.values(), color) { color = it }
            BooleanControl("title", hasTitle) { hasTitle = it }
            BooleanControl("leadingIcon", showLeadingIcon) { showLeadingIcon = it }
            BooleanControl("clickable", clickable) { clickable = it }
            BooleanControl("dismissible", dismissible) { dismissible = it }
        }
    }
}
