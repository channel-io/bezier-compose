package io.channel.bezier.compose.sample.playground

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material.RadioButton
import androidx.compose.material.Switch
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalLayoutApi::class)
@Composable
internal fun <T> EnumControl(
        label: String,
        options: Array<T>,
        selected: T,
        optionLabel: (T) -> String = { it.toString() },
        onSelected: (T) -> Unit,
) {
    Column(
            modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
    ) {
        Text(text = label, fontWeight = FontWeight.Bold)
        FlowRow(verticalArrangement = Arrangement.Center) {
            options.forEach { option ->
                Row(
                        modifier = Modifier
                                .selectable(
                                        selected = option == selected,
                                        onClick = { onSelected(option) },
                                )
                                .padding(end = 12.dp),
                        verticalAlignment = Alignment.CenterVertically,
                ) {
                    RadioButton(
                            selected = option == selected,
                            onClick = { onSelected(option) },
                    )
                    Text(
                            text = optionLabel(option),
                            modifier = Modifier.padding(start = 4.dp),
                    )
                }
            }
        }
    }
}

@Composable
internal fun BooleanControl(
        label: String,
        value: Boolean,
        onValueChange: (Boolean) -> Unit,
) {
    Row(
            modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
    ) {
        Text(text = label, fontWeight = FontWeight.Bold)
        Switch(checked = value, onCheckedChange = onValueChange)
    }
}
