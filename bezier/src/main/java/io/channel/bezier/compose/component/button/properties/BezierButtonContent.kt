package io.channel.bezier.compose.component.button.properties

import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.painter.Painter
import io.channel.bezier.BezierIcon

@Stable
sealed interface BezierButtonContent {
    data class Icon(val icon: BezierIcon) : BezierButtonContent
    data class Avatar(val painter: Painter) : BezierButtonContent
    data class Emoji(val painter: Painter) : BezierButtonContent
}
