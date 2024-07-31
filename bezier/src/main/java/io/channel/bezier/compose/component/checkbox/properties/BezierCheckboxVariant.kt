package io.channel.bezier.compose.component.checkbox.properties

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

enum class BezierCheckboxVariant(
        internal val controlPadding: Dp,
) {
    Primary(
            controlPadding = 8.dp,
    ),
    Secondary(
            controlPadding = 6.dp,
    ),
}

