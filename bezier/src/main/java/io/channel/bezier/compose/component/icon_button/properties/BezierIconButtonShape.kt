package io.channel.bezier.compose.component.icon_button.properties

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Shape

enum class BezierIconButtonShape {
    Rectangle,
    Circle;

    fun createShape(size: BezierIconButtonSize): Shape {
        return when (this) {
            Rectangle -> RoundedCornerShape(size.radius)
            Circle -> CircleShape
        }
    }
}
