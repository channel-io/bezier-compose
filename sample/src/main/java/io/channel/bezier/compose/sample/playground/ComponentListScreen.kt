package io.channel.bezier.compose.sample.playground

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
) {
    Scaffold(
            topBar = { TopAppBar(title = { Text("v3 Components") }) },
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
