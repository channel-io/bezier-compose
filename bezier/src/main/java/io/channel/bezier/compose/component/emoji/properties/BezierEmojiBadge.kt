package io.channel.bezier.compose.component.emoji.properties

sealed interface BezierEmojiBadge {
    data object None : BezierEmojiBadge
    data object Chat : BezierEmojiBadge
}
