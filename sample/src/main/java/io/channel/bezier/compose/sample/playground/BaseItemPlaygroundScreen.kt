package io.channel.bezier.compose.sample.playground

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.icon.ArrowLeft
import io.channel.bezier.v3.component.BaseItem
import io.channel.bezier.v3.component.BaseItemSize
import io.channel.bezier.v3.component.IconButton
import io.channel.bezier.v3.component.IconButtonSize
import io.channel.bezier.v3.component.IconButtonVariant

@Composable
fun BaseItemPlaygroundScreen(onBack: () -> Unit) {
    var size by remember { mutableStateOf(BaseItemSize.Small) }
    var hasDescription by remember { mutableStateOf(false) }
    var showLeading by remember { mutableStateOf(true) }
    var showCenterSlot by remember { mutableStateOf(false) }
    var showTrailing by remember { mutableStateOf(true) }

    Scaffold(
            topBar = {
                TopAppBar(
                        title = { Text("BaseItem") },
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
            val leadingContent: (@Composable () -> Unit)? = if (showLeading) {
                { DummyLeading() }
            } else {
                null
            }
            val centerSlot: (@Composable () -> Unit)? = if (showCenterSlot) {
                { DummyCenterSlot() }
            } else {
                null
            }
            val trailingContent: (@Composable () -> Unit)? = if (showTrailing) {
                { DummyTrailing() }
            } else {
                null
            }

            Box(
                    modifier = Modifier
                            .fillMaxWidth()
                            .background(BezierTheme.colorsV3.surfaceLow)
                            .padding(32.dp),
            ) {
                BaseItem(
                        modifier = Modifier.fillMaxWidth(),
                        label = "Base item label",
                        size = size,
                        description = if (hasDescription) "Description text" else null,
                        leadingContent = leadingContent,
                        centerSlot = centerSlot,
                        trailingContent = trailingContent,
                )
            }

            Divider()

            EnumControl("size", BaseItemSize.values(), size) { size = it }
            BooleanControl("description", hasDescription) { hasDescription = it }
            BooleanControl("leadingContent", showLeading) { showLeading = it }
            BooleanControl("centerSlot", showCenterSlot) { showCenterSlot = it }
            BooleanControl("trailingContent", showTrailing) { showTrailing = it }
        }
    }
}

@Composable
private fun DummyLeading() {
    Box(
            modifier = Modifier
                    .fillMaxSize()
                    .clip(CircleShape)
                    .background(BezierTheme.colorsV3.fillNeutral),
    )
}

@Composable
private fun DummyCenterSlot() {
    Box(
            modifier = Modifier
                    .size(width = 8.dp, height = 8.dp)
                    .clip(CircleShape)
                    .background(BezierTheme.colorsV3.fillNeutralHeavier),
    )
}

@Composable
private fun DummyTrailing() {
    Box(
            modifier = Modifier
                    .size(24.dp)
                    .clip(RoundedCornerShape(6.dp))
                    .background(BezierTheme.colorsV3.fillNeutral),
    )
}
