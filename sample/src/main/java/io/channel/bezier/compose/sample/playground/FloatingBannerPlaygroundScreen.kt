package io.channel.bezier.compose.sample.playground

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Icon
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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.icon.ArrowLeft
import io.channel.bezier.icon.Plus
import io.channel.bezier.v3.component.FloatingBanner
import io.channel.bezier.v3.component.FloatingBannerClickArea
import io.channel.bezier.v3.component.IconButton
import io.channel.bezier.v3.component.IconButtonSize
import io.channel.bezier.v3.component.IconButtonVariant

@Composable
fun FloatingBannerPlaygroundScreen(onBack: () -> Unit) {
    var clickArea by remember { mutableStateOf(FloatingBannerClickArea.None) }
    var hasTitle by remember { mutableStateOf(true) }
    var showLeadingIcon by remember { mutableStateOf(false) }

    Scaffold(
            topBar = {
                TopAppBar(
                        title = { Text("FloatingBanner") },
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
            val leadingIcon: (@Composable (Dp) -> Unit)? = if (showLeadingIcon) {
                { iconSize ->
                    Icon(
                            modifier = Modifier.size(iconSize),
                            imageVector = BezierIcons.Plus.imageVector,
                            tint = BezierTheme.colorsV3.iconNeutral,
                            contentDescription = null,
                    )
                }
            } else {
                null
            }

            Box(
                    modifier = Modifier
                            .fillMaxWidth()
                            .background(BezierTheme.colorsV3.surfaceLow)
                            .padding(32.dp),
                    contentAlignment = Alignment.Center,
            ) {
                FloatingBanner(
                        description = "Banner description text goes here.",
                        title = if (hasTitle) "Banner Title" else null,
                        clickArea = clickArea,
                        leadingIcon = leadingIcon,
                        onClick = {},
                )
            }

            Divider()

            EnumControl("clickArea", FloatingBannerClickArea.values(), clickArea) { clickArea = it }
            BooleanControl("title", hasTitle) { hasTitle = it }
            BooleanControl("leadingIcon", showLeadingIcon) { showLeadingIcon = it }
        }
    }
}
