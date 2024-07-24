package io.channel.bezier.compose.component.loader.properties

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

enum class BezierLoaderSize(
        internal val size: Dp,
        internal val strokeWidth: Dp,
) {
    Small(
            size = 28.dp,
            strokeWidth = 4.dp,
    ),
    Medium(
            size = 50.dp,
            strokeWidth = 6.dp,
    ),
}
