package io.channel.bezier.compose.component.toast.properties

import androidx.compose.runtime.Stable
import io.channel.bezier.BezierIcon

@Stable
sealed interface BezierToastContent {
    data class Icon(val icon: BezierIcon) : BezierToastContent
    data class Emoji(val name: String) : BezierToastContent
}

