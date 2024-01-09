package io.channel.bezier.compose.extension

import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.*
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

fun Modifier.roundedBackground(
        backgroundColor: Color,
        borderRadius: Dp,
        borderWidth: Dp = 0.dp,
        borderColor: Color = Color.Unspecified,
): Modifier = this
        .clip(RoundedCornerShape(borderRadius))
        .let {
            when {
                borderWidth > 0.dp && borderColor.isSpecified -> it.border(borderWidth, borderColor, RoundedCornerShape(borderRadius))
                else -> it
            }
        }
        .padding(borderWidth)
        .background(color = backgroundColor, shape = RoundedCornerShape(borderRadius - borderWidth))
        .clip(RoundedCornerShape(borderRadius - borderWidth))

fun Modifier.roundedBackground(
        backgroundColor: Color,
        borderWidth: Dp = 0.dp,
        borderColor: Color = Color.Unspecified,
): Modifier = this
        .clip(RoundedCornerShape(50))
        .let {
            when {
                borderWidth > 0.dp && borderColor.isSpecified -> it.border(borderWidth, borderColor, RoundedCornerShape(50))
                else -> it
            }
        }
        .padding(borderWidth)
        .background(color = backgroundColor, shape = RoundedCornerShape(50))
        .clip(RoundedCornerShape(50))

fun Modifier.shimmer(
        shimmerColor: Color = Color.White,
        duration: Float = 1400f,
): Modifier = composed {
    val shimmerColors = remember {
        listOf(
                shimmerColor.copy(alpha = 0.6f),
                shimmerColor.copy(alpha = 0.3f),
                shimmerColor.copy(alpha = 0.6f),
        )
    }

    val transition = rememberInfiniteTransition()
    val translateAnimation = transition.animateFloat(
            initialValue = 0f,
            targetValue = duration,
            animationSpec = infiniteRepeatable(
                    animation = tween(800),
                    repeatMode = RepeatMode.Restart,
            ),
    )

    this.background(
            Brush.linearGradient(
                    colors = shimmerColors,
                    start = Offset.Zero,
                    end = Offset(x = translateAnimation.value, y = translateAnimation.value),
            )
    )
}
