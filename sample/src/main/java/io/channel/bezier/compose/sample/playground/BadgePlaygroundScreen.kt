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
import io.channel.bezier.v3.component.Badge
import io.channel.bezier.v3.component.BadgeColor
import io.channel.bezier.v3.component.BadgeSize
import io.channel.bezier.v3.component.IconButton
import io.channel.bezier.v3.component.IconButtonSize
import io.channel.bezier.v3.component.IconButtonVariant

@Composable
fun BadgePlaygroundScreen(onBack: () -> Unit) {
    var size by remember { mutableStateOf(BadgeSize.Xsmall) }
    var color by remember { mutableStateOf(BadgeColor.Default) }
    var hasIcon by remember { mutableStateOf(false) }

    Scaffold(
            topBar = {
                TopAppBar(
                        title = { Text("Badge") },
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
                Badge(
                        label = "Badge",
                        size = size,
                        color = color,
                        iconSource = if (hasIcon) BezierIcons.Plus else null,
                )
            }

            Divider()

            EnumControl("Size", BadgeSize.values(), size) { size = it }
            EnumControl("Color", BadgeColor.values(), color) { color = it }
            BooleanControl("hasIcon", hasIcon) { hasIcon = it }
        }
    }
}
