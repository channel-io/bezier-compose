package io.channel.bezier.compose.sample.playground

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.icon.ArrowLeft
import io.channel.bezier.icon.Bookmark
import io.channel.bezier.icon.Folder
import io.channel.bezier.icon.Plus
import io.channel.bezier.icon.Star
import io.channel.bezier.v3.component.BaseItem
import io.channel.bezier.v3.component.BaseItemSize
import io.channel.bezier.v3.component.CollapsibleSection
import io.channel.bezier.v3.component.IconButton
import io.channel.bezier.v3.component.IconButtonSize
import io.channel.bezier.v3.component.IconButtonVariant
import io.channel.bezier.v3.component.SectionLabelColor

@Composable
fun CollapsibleSectionPlaygroundScreen(onBack: () -> Unit) {
    Scaffold(
            topBar = {
                TopAppBar(
                        title = { Text("CollapsibleSection") },
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
        var basicOpen by remember { mutableStateOf(true) }
        var slotOpen by remember { mutableStateOf(true) }
        var lightOpen by remember { mutableStateOf(false) }

        Column(
                modifier = Modifier
                        .padding(padding)
                        .fillMaxSize()
                        .background(BezierTheme.colorsV3.surfaceLow)
                        .verticalScroll(rememberScrollState())
                        .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(32.dp),
        ) {
            CollapsibleSection(
                    label = "Expanded",
                    open = basicOpen,
                    onOpenChange = { basicOpen = it },
            ) {
                PlaygroundCollapsibleItem(BezierIcons.Plus, "Add item")
                PlaygroundCollapsibleItem(BezierIcons.Star, "Favorites")
                PlaygroundCollapsibleItem(BezierIcons.Bookmark, "Bookmarks")
            }

            CollapsibleSection(
                    label = "Label with leading & trailing",
                    open = slotOpen,
                    onOpenChange = { slotOpen = it },
                    labelLeadingContent = { PlaygroundCollapsibleLabelIcon(BezierIcons.Folder) },
                    labelTrailingContent = {
                        IconButton(
                                icon = BezierIcons.Plus,
                                onClick = {},
                                size = IconButtonSize.Xsmall,
                                variant = IconButtonVariant.Ghost,
                                contentDescription = "Add",
                        )
                    },
            ) {
                PlaygroundCollapsibleItem(BezierIcons.Plus, "Add item")
                PlaygroundCollapsibleItem(BezierIcons.Star, "Favorites")
            }

            CollapsibleSection(
                    label = "Neutral light (collapsed)",
                    open = lightOpen,
                    onOpenChange = { lightOpen = it },
                    labelColor = SectionLabelColor.NeutralLight,
            ) {
                PlaygroundCollapsibleItem(BezierIcons.Plus, "Add item")
                PlaygroundCollapsibleItem(BezierIcons.Star, "Favorites")
            }

            CollapsibleSection(
                    label = "Static (onOpenChange = null)",
                    open = true,
                    onOpenChange = null,
            ) {
                PlaygroundCollapsibleItem(BezierIcons.Bookmark, "Not togglable")
            }
        }
    }
}

@Composable
private fun PlaygroundCollapsibleItem(
        icon: BezierIcon,
        label: String,
) {
    BaseItem(
            modifier = Modifier.fillMaxWidth(),
            label = label,
            size = BaseItemSize.Medium,
            leadingContent = {
                Icon(
                        modifier = Modifier.fillMaxSize(),
                        imageVector = icon.imageVector,
                        tint = BezierTheme.colorsV3.iconNeutralHeavier,
                        contentDescription = null,
                )
            },
    )
}

@Composable
private fun PlaygroundCollapsibleLabelIcon(icon: BezierIcon) {
    Box(modifier = Modifier.size(20.dp)) {
        Icon(
                modifier = Modifier.fillMaxSize(),
                imageVector = icon.imageVector,
                tint = BezierTheme.colorsV3.iconNeutralHeavier,
                contentDescription = null,
        )
    }
}
