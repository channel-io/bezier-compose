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
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.icon.ArrowLeft
import io.channel.bezier.v3.component.IconButton
import io.channel.bezier.v3.component.IconButtonSize
import io.channel.bezier.v3.component.IconButtonVariant
import io.channel.bezier.v3.component.Search

@Composable
fun SearchPlaygroundScreen(onBack: () -> Unit) {
    var value by remember { mutableStateOf("") }
    var enabled by remember { mutableStateOf(true) }
    var allowClear by remember { mutableStateOf(true) }
    var cancelButton by remember { mutableStateOf(false) }

    Scaffold(
            topBar = {
                TopAppBar(
                        title = { Text("Search") },
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
            ) {
                Search(
                        value = value,
                        onValueChange = { value = it },
                        enabled = enabled,
                        placeholder = "Search by name, email, phone",
                        allowClear = allowClear,
                        cancelText = if (cancelButton) "Cancel" else null,
                        onCancelClick = { value = "" },
                        modifier = Modifier.fillMaxWidth(),
                )
            }

            Divider()

            BooleanControl("enabled", enabled) { enabled = it }
            BooleanControl("allowClear", allowClear) { allowClear = it }
            BooleanControl("cancelButton", cancelButton) { cancelButton = it }
        }
    }
}
