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
import io.channel.bezier.v3.component.TextInput
import io.channel.bezier.v3.component.TextInputSize
import io.channel.bezier.v3.component.TextInputVariant

@Composable
fun TextInputPlaygroundScreen(onBack: () -> Unit) {
    var value by remember { mutableStateOf("") }
    var variant by remember { mutableStateOf(TextInputVariant.Primary) }
    var size by remember { mutableStateOf(TextInputSize.Small) }
    var enabled by remember { mutableStateOf(true) }
    var readOnly by remember { mutableStateOf(false) }
    var hasError by remember { mutableStateOf(false) }
    var allowClear by remember { mutableStateOf(false) }
    var passwordToggle by remember { mutableStateOf(false) }

    Scaffold(
            topBar = {
                TopAppBar(
                        title = { Text("TextInput") },
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
                TextInput(
                        value = value,
                        onValueChange = { value = it },
                        variant = variant,
                        size = size,
                        enabled = enabled,
                        readOnly = readOnly,
                        hasError = hasError,
                        placeholder = "placeholder",
                        allowClear = allowClear,
                        passwordToggle = passwordToggle,
                        modifier = Modifier.fillMaxWidth(),
                )
            }

            Divider()

            EnumControl("variant", TextInputVariant.values(), variant) { variant = it }
            EnumControl("size", TextInputSize.values(), size) { size = it }
            BooleanControl("enabled", enabled) { enabled = it }
            BooleanControl("readOnly", readOnly) { readOnly = it }
            BooleanControl("hasError", hasError) { hasError = it }
            BooleanControl("allowClear", allowClear) { allowClear = it }
            BooleanControl("passwordToggle", passwordToggle) { passwordToggle = it }
        }
    }
}
