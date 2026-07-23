package io.channel.bezier.v3.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.annotation.IntRange
import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme
import io.channel.bezier.component.BezierText
import io.channel.bezier.typography.BezierTypo

@Composable
fun ProgressBar(
        @IntRange(from = 0, to = 100) progress: Int,
        modifier: Modifier = Modifier,
        size: ProgressBarSize = ProgressBarSize.Medium,
        variant: ProgressBarVariant = ProgressBarVariant.Default,
) {
    val fraction = animateFloatAsState(
            targetValue = progress.coerceIn(0, 100) / 100f,
            animationSpec = tween(
                    durationMillis = 1000,
                    easing = CubicBezierEasing(0.24f, 1f, 0.24f, 1f),
            ),
            label = "ProgressBarAnimation",
    )

    val trackColor = when (variant) {
        ProgressBarVariant.Default -> BezierTheme.colorsV3.fillNeutralHeavy
        ProgressBarVariant.Overlaid -> BezierTheme.colorsV3.fillGreyHeavier
    }
    val fillColor = BezierTheme.colorsV3.fillNeutralHeaviest
    val barRadius = size.radius

    Spacer(
            modifier = modifier
                    .height(size.height)
                    .drawBehind {
                        val radiusPx = barRadius.toPx()
                        drawRoundRect(
                                color = trackColor,
                                cornerRadius = CornerRadius(radiusPx),
                        )

                        val fillWidth = this.size.width * fraction.value
                        if (fillWidth > 0f) {
                            drawRoundRect(
                                    color = fillColor,
                                    size = Size(fillWidth, this.size.height),
                                    cornerRadius = CornerRadius(minOf(radiusPx, fillWidth / 2f)),
                            )
                        }
                    },
    )
}

enum class ProgressBarSize {
    Medium,
    Small;

    internal val height: Dp
        get() = when (this) {
            Medium -> 6.dp
            Small -> 4.dp
        }

    internal val radius: Dp
        get() = when (this) {
            Medium -> 3.dp
            Small -> 2.dp
        }
}

enum class ProgressBarVariant {
    Default,
    Overlaid,
}

@Composable
private fun ProgressBarMatrix() {
    BezierTheme {
        Column(
                modifier = Modifier
                        .background(BezierTheme.colorsV3.surface)
                        .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(20.dp),
        ) {
            listOf(0, 30, 60, 100).forEach { progress ->
                Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
                    BezierText(
                            text = "progress = $progress",
                            typo = BezierTypo.TextMedium,
                            color = BezierTheme.colorsV3.textNeutral,
                    )
                    ProgressBarVariant.values().forEach { variant ->
                        ProgressBarSize.values().forEach { size ->
                            ProgressBar(
                                    modifier = Modifier.width(240.dp),
                                    progress = progress,
                                    size = size,
                                    variant = variant,
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 320)
@Preview(showBackground = true, widthDp = 320, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun ProgressBarMatrixPreview() = ProgressBarMatrix()
