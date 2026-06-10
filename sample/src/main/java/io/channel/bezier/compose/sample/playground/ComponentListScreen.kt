package io.channel.bezier.compose.sample.playground

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material.Divider
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ComponentListScreen(
        onSelectButton: () -> Unit,
        onSelectIconButton: () -> Unit,
        onSelectBadge: () -> Unit,
        onSelectTag: () -> Unit,
        onSelectAvatar: () -> Unit,
        onSelectAvatarGroup: () -> Unit,
        onSelectSpinner: () -> Unit,
) {
    Scaffold(
            topBar = {
                TopAppBar(
                        modifier = Modifier.statusBarsPadding(),
                        title = { Text("v3 Components") },
                )
            },
    ) { padding ->
        Column(
                modifier = Modifier
                        .padding(padding)
                        .fillMaxSize(),
        ) {
            ComponentRow("Button", onClick = onSelectButton)
            Divider()
            ComponentRow("IconButton", onClick = onSelectIconButton)
            Divider()
            ComponentRow("Badge", onClick = onSelectBadge)
            Divider()
            ComponentRow("Tag", onClick = onSelectTag)
            Divider()
            ComponentRow("Avatar", onClick = onSelectAvatar)
            Divider()
            ComponentRow("AvatarGroup", onClick = onSelectAvatarGroup)
            Divider()
            ComponentRow("Spinner", onClick = onSelectSpinner)
            Divider()
        }
    }
}

@Composable
private fun ComponentRow(name: String, onClick: () -> Unit) {
    Box(
            modifier = Modifier
                    .fillMaxWidth()
                    .clickable(onClick = onClick)
                    .padding(16.dp),
    ) {
        Text(text = name)
    }
}
