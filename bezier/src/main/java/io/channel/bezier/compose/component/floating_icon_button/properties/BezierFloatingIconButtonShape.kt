package io.channel.bezier.compose.component.floating_icon_button.properties

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Shape

enum class BezierFloatingIconButtonShape {
    Rectangle,
    Circle;

    fun createShape(size: BezierFloatingIconButtonSize): Shape {
        return when (this) {
            Rectangle -> RoundedCornerShape(size.radius)
            Circle -> CircleShape
        }
    }
}
