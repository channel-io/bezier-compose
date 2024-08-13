package io.channel.bezier.compose.component.toogle_button.properties

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp

enum class ToggleButtonShape(
        internal val shape: Shape,
) {
    Rectangle(RoundedCornerShape(10.dp)),
    Capsule(CircleShape);
}
