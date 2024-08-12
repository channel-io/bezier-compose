package io.channel.bezier.compose.component.progress_bar.properties

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

enum class BezierProgressBarSize(
        internal val height: Dp,
) {
    Medium(height = 6.dp),
    Small(height = 4.dp),
}
