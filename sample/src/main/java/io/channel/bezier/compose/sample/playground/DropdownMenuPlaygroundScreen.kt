package io.channel.bezier.compose.sample.playground

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.component.BezierText
import io.channel.bezier.icon.ArrowLeft
import io.channel.bezier.icon.Bookmark
import io.channel.bezier.icon.Edit
import io.channel.bezier.icon.LinkCopy
import io.channel.bezier.icon.More
import io.channel.bezier.icon.Star
import io.channel.bezier.icon.Trash
import io.channel.bezier.typography.BezierTypo
import io.channel.bezier.v3.component.Badge
import io.channel.bezier.v3.component.DropdownMenu
import io.channel.bezier.v3.component.DropdownMenuGroup
import io.channel.bezier.v3.component.DropdownMenuItem
import io.channel.bezier.v3.component.DropdownMenuItemVariant
import io.channel.bezier.v3.component.IconButton
import io.channel.bezier.v3.component.IconButtonSize
import io.channel.bezier.v3.component.IconButtonVariant

@Composable
fun DropdownMenuPlaygroundScreen(onBack: () -> Unit) {
    Scaffold(
            topBar = {
                TopAppBar(
                        title = { Text("DropdownMenu") },
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
            PlaygroundMenuRow(title = "Basic") { expanded, onExpandedChange ->
                DropdownMenu(
                        expanded = expanded,
                        onDismissRequest = { onExpandedChange(false) },
                        trigger = {
                            IconButton(
                                    icon = BezierIcons.More,
                                    onClick = { onExpandedChange(true) },
                                    size = IconButtonSize.Medium,
                                    variant = IconButtonVariant.Ghost,
                                    contentDescription = "More",
                            )
                        },
                ) {
                    DropdownMenuItem(label = "Edit", onClick = { onExpandedChange(false) })
                    DropdownMenuItem(label = "Duplicate", onClick = { onExpandedChange(false) })
                    DropdownMenuItem(label = "Delete", onClick = { onExpandedChange(false) })
                }
            }

            PlaygroundMenuRow(title = "Leading icon + destructive") { expanded, onExpandedChange ->
                DropdownMenu(
                        expanded = expanded,
                        onDismissRequest = { onExpandedChange(false) },
                        trigger = {
                            IconButton(
                                    icon = BezierIcons.More,
                                    onClick = { onExpandedChange(true) },
                                    size = IconButtonSize.Medium,
                                    variant = IconButtonVariant.Filled,
                                    contentDescription = "More",
                            )
                        },
                ) {
                    DropdownMenuItem(
                            label = "Edit",
                            onClick = { onExpandedChange(false) },
                            leadingIcon = BezierIcons.Edit,
                    )
                    DropdownMenuItem(
                            label = "Duplicate",
                            onClick = { onExpandedChange(false) },
                            leadingIcon = BezierIcons.LinkCopy,
                    )
                    DropdownMenuItem(
                            label = "Delete",
                            onClick = { onExpandedChange(false) },
                            variant = DropdownMenuItemVariant.Destructive,
                            leadingIcon = BezierIcons.Trash,
                    )
                }
            }

            PlaygroundMenuRow(title = "Groups + label + divider") { expanded, onExpandedChange ->
                DropdownMenu(
                        expanded = expanded,
                        onDismissRequest = { onExpandedChange(false) },
                        trigger = {
                            IconButton(
                                    icon = BezierIcons.More,
                                    onClick = { onExpandedChange(true) },
                                    size = IconButtonSize.Medium,
                                    variant = IconButtonVariant.Ghost,
                                    contentDescription = "More",
                            )
                        },
                ) {
                    DropdownMenuGroup(label = "Actions", showDivider = true) {
                        DropdownMenuItem(
                                label = "Star",
                                onClick = { onExpandedChange(false) },
                                leadingIcon = BezierIcons.Star,
                                centerSlot = { Badge(label = "New") },
                        )
                        DropdownMenuItem(
                                label = "Bookmark",
                                onClick = { onExpandedChange(false) },
                                leadingIcon = BezierIcons.Bookmark,
                                trailingContent = {
                                    BezierText(
                                            text = "12",
                                            typo = BezierTypo.TextMedium,
                                            color = BezierTheme.colorsV3.textNeutralLighter,
                                    )
                                },
                        )
                    }

                    DropdownMenuGroup(label = "Danger") {
                        DropdownMenuItem(
                                label = "Delete",
                                description = "This cannot be undone",
                                onClick = { onExpandedChange(false) },
                                variant = DropdownMenuItemVariant.Destructive,
                                leadingIcon = BezierIcons.Trash,
                        )
                    }
                }
            }

            PlaygroundMenuRow(title = "Custom leading + disabled") { expanded, onExpandedChange ->
                DropdownMenu(
                        expanded = expanded,
                        onDismissRequest = { onExpandedChange(false) },
                        trigger = {
                            IconButton(
                                    icon = BezierIcons.More,
                                    onClick = { onExpandedChange(true) },
                                    size = IconButtonSize.Medium,
                                    variant = IconButtonVariant.Ghost,
                                    contentDescription = "More",
                            )
                        },
                ) {
                    DropdownMenuItem(
                            label = "Custom leading",
                            onClick = { onExpandedChange(false) },
                            leadingContent = {
                                Box(
                                        modifier = Modifier
                                                .fillMaxSize()
                                                .clip(CircleShape)
                                                .background(BezierTheme.colorsV3.fillNeutral),
                                )
                            },
                    )
                    DropdownMenuItem(
                            label = "Disabled",
                            onClick = { onExpandedChange(false) },
                            enabled = false,
                            leadingIcon = BezierIcons.Edit,
                    )
                    DropdownMenuItem(
                            label = "Disabled destructive",
                            onClick = { onExpandedChange(false) },
                            enabled = false,
                            variant = DropdownMenuItemVariant.Destructive,
                            leadingIcon = BezierIcons.Trash,
                    )
                }
            }

            PlaygroundMenuRow(title = "Long list (scroll)") { expanded, onExpandedChange ->
                DropdownMenu(
                        expanded = expanded,
                        onDismissRequest = { onExpandedChange(false) },
                        trigger = {
                            IconButton(
                                    icon = BezierIcons.More,
                                    onClick = { onExpandedChange(true) },
                                    size = IconButtonSize.Medium,
                                    variant = IconButtonVariant.Ghost,
                                    contentDescription = "More",
                            )
                        },
                ) {
                    repeat(20) { index ->
                        DropdownMenuItem(
                                label = "Item ${index + 1}",
                                onClick = { onExpandedChange(false) },
                        )
                    }
                }
            }

            Box(modifier = Modifier.size(240.dp))
        }
    }
}

@Composable
private fun PlaygroundMenuRow(
        title: String,
        menu: @Composable (expanded: Boolean, onExpandedChange: (Boolean) -> Unit) -> Unit,
) {
    var expanded by remember { mutableStateOf(false) }

    Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
    ) {
        BezierText(
                text = title,
                typo = BezierTypo.TextMedium,
                color = BezierTheme.colorsV3.textNeutral,
        )

        menu(expanded) { expanded = it }
    }
}
