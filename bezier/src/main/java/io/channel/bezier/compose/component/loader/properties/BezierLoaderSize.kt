package io.channel.bezier.compose.component.loader.properties

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

enum class BezierLoaderSize(
        internal val size: Dp,
) {
    XXSmall(
            size = 16.dp,
    ),
    XSmall(
            size = 20.dp,
    ),
    Small(
            size = 24.dp,
    ),
    Medium(
            size = 28.dp,
    ),
    Large(
            size = 50.dp,
    ),
}
