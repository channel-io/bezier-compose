package io.channel.bezier.compose.component.progress_bar

import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.progressSemantics
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.color_v2.colors
import io.channel.bezier.compose.component.progress_bar.properties.BezierProgressBarSize
import io.channel.bezier.compose.component.progress_bar.properties.BezierProgressBarVariant
import io.channel.bezier.extension.thenIf

@Composable
fun BezierProgressBar(
        /*@FloatRange(from = 0.0, to = 1.0)*/
        progress: Float,
        variant: BezierProgressBarVariant,
        size: BezierProgressBarSize,
        modifier: Modifier = Modifier,
) {
    val coercedProgress = progress.coerceIn(0f, 1f)

    val progressRatio: Float by animateFloatAsState(
            targetValue = coercedProgress,
            animationSpec = tween(
                    durationMillis = 1000,
                    easing = CubicBezierEasing(0.24f, 1f, 0.24f, 1f),
            ),
            label = "ProgressAnimation",
    )

    Box(
            modifier = modifier
                    .requiredHeight(size.height)
                    .clip(RoundedCornerShape(3.dp))
                    .background(variant.backgroundColor().color),
    ) {
        val indicatorColor = variant.colors().colors

        Canvas(
                modifier = Modifier
                        .progressSemantics(progressRatio)
                        .fillMaxSize(),
        ) {
            drawRoundRect(
                    brush = Brush.horizontalGradient(indicatorColor),
                    cornerRadius = CornerRadius(3.dp.toPx(), 3.dp.toPx()),
                    size = this.size.copy(width = this.size.width * progressRatio),
            )
        }
    }
}

@Composable
@Preview
private fun BezierProgressBarPreview() {
    var progress by remember {
        mutableFloatStateOf(0.1f)
    }

    BezierTheme {
        Column(
                modifier = Modifier
                        .background(Color.White),
        ) {
            BezierProgressBarVariant.entries.forEach { variant ->
                BezierProgressBar(
                        modifier = Modifier
                                .fillMaxWidth()
                                .thenIf(variant == BezierProgressBarVariant.OverBackground) {
                                    background(Color.DarkGray).padding(vertical = 4.dp)
                                }
                                .padding(8.dp)
                                .clickable(
                                        interactionSource = remember { MutableInteractionSource() },
                                        indication = null,
                                ) {
                                    if (progress >= 1) {
                                        progress = 0f
                                    } else {
                                        progress += 0.3f
                                    }
                                },
                        progress = progress,
                        variant = variant,
                        size = BezierProgressBarSize.Medium,
                )
            }
        }
    }
}
