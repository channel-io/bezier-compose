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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.icon.ArrowLeft
import io.channel.bezier.v3.component.AvatarGroup
import io.channel.bezier.v3.component.AvatarGroupEllipsisType
import io.channel.bezier.v3.component.AvatarGroupSize
import io.channel.bezier.v3.component.IconButton
import io.channel.bezier.v3.component.IconButtonSize
import io.channel.bezier.v3.component.IconButtonVariant
import androidx.compose.runtime.setValue

@Composable
fun AvatarGroupPlaygroundScreen(onBack: () -> Unit) {
    var size by remember { mutableStateOf(AvatarGroupSize.Size24) }
    var ellipsisType by remember { mutableStateOf(AvatarGroupEllipsisType.Icon) }
    var countOption by remember { mutableStateOf(AvatarCountOption.Five) }

    val palette: List<Painter> = remember {
        listOf(
                ColorPainter(Color(0xFFB6CED6)),
                ColorPainter(Color(0xFFD6BFB6)),
                ColorPainter(Color(0xFFB6D6BF)),
                ColorPainter(Color(0xFFCFB6D6)),
                ColorPainter(Color(0xFFD6CCB6)),
                ColorPainter(Color(0xFFB6B6D6)),
                ColorPainter(Color(0xFFD6B6C2)),
                ColorPainter(Color(0xFFC2D6B6)),
        )
    }

    Scaffold(
            topBar = {
                TopAppBar(
                        title = { Text("AvatarGroup") },
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
                AvatarGroup(
                        avatars = palette.take(countOption.count),
                        size = size,
                        ellipsisType = ellipsisType,
                )
            }

            Divider()

            EnumControl("Size", AvatarGroupSize.values(), size) { size = it }
            EnumControl("EllipsisType", AvatarGroupEllipsisType.values(), ellipsisType) { ellipsisType = it }
            EnumControl("Avatars count", AvatarCountOption.values(), countOption) { countOption = it }
        }
    }
}

enum class AvatarCountOption(val count: Int) {
    One(1),
    Two(2),
    Three(3),
    Four(4),
    Five(5),
    Eight(8),
}
