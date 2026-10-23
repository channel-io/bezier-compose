package io.channel.bezier.component

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.input.TextFieldValue

@Composable
internal fun rememberStringTextFieldValue(
        value: String,
        onValueChange: (String) -> Unit,
): Pair<TextFieldValue, (TextFieldValue) -> Unit> {
    var textFieldValueState by remember {
        mutableStateOf(TextFieldValue(text = value, selection = TextRange(value.length)))
    }
    val textFieldValue = if (textFieldValueState.text == value) {
        textFieldValueState
    } else {
        textFieldValueState.copy(text = value, selection = TextRange(value.length))
    }

    var lastTextValue by remember(value) { mutableStateOf(value) }

    return textFieldValue to { newTextFieldValue: TextFieldValue ->
        textFieldValueState = newTextFieldValue

        val textChangedSinceLastInvocation = lastTextValue != newTextFieldValue.text
        lastTextValue = newTextFieldValue.text

        if (textChangedSinceLastInvocation) {
            onValueChange(newTextFieldValue.text)
        }
    }
}
