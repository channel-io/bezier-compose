package io.channel.bezier.compose.sample.playground

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.component.BezierText
import io.channel.bezier.icon.ArrowLeft
import io.channel.bezier.typography.BezierTypo
import io.channel.bezier.v3.component.BottomSheetContent
import io.channel.bezier.v3.component.IconButton
import io.channel.bezier.v3.component.IconButtonSize
import io.channel.bezier.v3.component.IconButtonVariant

@Composable
fun BottomSheetContentPlaygroundScreen(onBack: () -> Unit) {
    var showGrabber by remember { mutableStateOf(true) }
    var hasTitle by remember { mutableStateOf(true) }
    var hasDescription by remember { mutableStateOf(true) }

    Scaffold(
            topBar = {
                TopAppBar(
                        title = { Text("BottomSheetContent") },
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
            BooleanControl(label = "showGrabber", value = showGrabber) { showGrabber = it }
            BooleanControl(label = "title", value = hasTitle) { hasTitle = it }
            BooleanControl(label = "description", value = hasDescription) { hasDescription = it }

            Box(
                    modifier = Modifier
                            .fillMaxWidth()
                            .background(BezierTheme.colorsV3.surfaceLow)
                            .padding(24.dp),
            ) {
                Box(
                        modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp))
                                .background(BezierTheme.colorsV3.surface),
                ) {
                    BottomSheetContent(
                            title = if (hasTitle) "Title" else null,
                            description = if (hasDescription) "Description" else null,
                            showGrabber = showGrabber,
                    ) {
                        Box(
                                modifier = Modifier
                                        .fillMaxWidth()
                                        .height(96.dp)
                                        .clip(RoundedCornerShape(12.dp))
                                        .background(BezierTheme.colorsV3.surfaceLow),
                        ) {
                            BezierText(
                                    text = "content",
                                    typo = BezierTypo.TextMedium,
                                    modifier = Modifier.padding(16.dp),
                                    color = BezierTheme.colorsV3.textNeutral,
                            )
                        }
                    }
                }
            }
        }
    }
}
