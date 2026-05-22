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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.icon.ArrowLeft
import io.channel.bezier.v3.component.Avatar
import io.channel.bezier.v3.component.AvatarSize
import io.channel.bezier.v3.component.AvatarStatusType
import io.channel.bezier.v3.component.IconButton
import io.channel.bezier.v3.component.IconButtonSize
import io.channel.bezier.v3.component.IconButtonVariant

@Composable
fun AvatarPlaygroundScreen(onBack: () -> Unit) {
    var size by remember { mutableStateOf(AvatarSize.Size48) }
    var enabled by remember { mutableStateOf(true) }
    var showBorder by remember { mutableStateOf(false) }
    var showStatus by remember { mutableStateOf(false) }
    var statusType by remember { mutableStateOf(AvatarStatusType.Online) }

    val previewPainter = remember { ColorPainter(Color(0xFFB6CED6)) }

    Scaffold(
            topBar = {
                TopAppBar(
                        title = { Text("Avatar") },
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
                Avatar(
                        image = previewPainter,
                        size = size,
                        enabled = enabled,
                        showBorder = showBorder,
                        status = if (showStatus) statusType else null,
                        contentDescription = "preview",
                )
            }

            Divider()

            EnumControl("Size", AvatarSize.values(), size) { size = it }
            BooleanControl("enabled", enabled) { enabled = it }
            BooleanControl("showBorder", showBorder) { showBorder = it }
            BooleanControl("showStatus", showStatus) { showStatus = it }
            EnumControl("statusType", AvatarStatusType.values(), statusType) { statusType = it }
        }
    }
}
