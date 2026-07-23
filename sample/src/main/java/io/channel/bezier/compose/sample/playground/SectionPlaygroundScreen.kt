package io.channel.bezier.compose.sample.playground

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.icon.ArrowLeft
import io.channel.bezier.icon.Bookmark
import io.channel.bezier.icon.Plus
import io.channel.bezier.icon.Star
import io.channel.bezier.v3.component.BaseItem
import io.channel.bezier.v3.component.BaseItemSize
import io.channel.bezier.v3.component.Divider
import io.channel.bezier.v3.component.IconButton
import io.channel.bezier.v3.component.IconButtonSize
import io.channel.bezier.v3.component.IconButtonVariant
import io.channel.bezier.v3.component.Section
import io.channel.bezier.v3.component.SectionVariant

@Composable
fun SectionPlaygroundScreen(onBack: () -> Unit) {
    Scaffold(
            topBar = {
                TopAppBar(
                        title = { Text("Section") },
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
                        .background(BezierTheme.colorsV3.surfaceLow)
                        .verticalScroll(rememberScrollState())
                        .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(32.dp),
        ) {
            Section(label = "Solid") {
                PlaygroundSectionItem(BezierIcons.Plus, "Add item")
                PlaygroundSectionItem(BezierIcons.Star, "Favorites")
                PlaygroundSectionItem(BezierIcons.Bookmark, "Bookmarks")
            }

            Section(
                    label = "Card",
                    variant = SectionVariant.Card,
            ) {
                PlaygroundSectionItem(BezierIcons.Plus, "Add item")
                Divider(sideIndent = false, parallelIndent = false)
                PlaygroundSectionItem(BezierIcons.Star, "Favorites")
                Divider(sideIndent = false, parallelIndent = false)
                PlaygroundSectionItem(BezierIcons.Bookmark, "Bookmarks")
            }

            Section(variant = SectionVariant.Card) {
                PlaygroundSectionItem(BezierIcons.Plus, "Section without label")
            }
        }
    }
}

@Composable
private fun PlaygroundSectionItem(
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
