package io.channel.bezier.v3.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.animation.core.EaseInOut
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.drawOutline
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme
import io.channel.bezier.component.BezierText
import io.channel.bezier.typography.BezierTypo

private val TrackWidth = 50.dp
private val TrackHeight = 28.dp
private val ThumbSize = 24.dp
private val ThumbPadding = 2.dp
private val ThumbTravel = TrackWidth - ThumbSize - ThumbPadding * 2
private val ThumbElevation = 6.dp
private val ErrorRingGap = 3.dp
private val ErrorRingBorder = 1.5.dp
private const val DisabledAlpha = 0.4f
private val ThumbAnimationSpec = tween<Float>(durationMillis = 200, easing = EaseInOut)

@Composable
fun Switch(
        checked: Boolean,
        onCheckedChange: ((Boolean) -> Unit)?,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        hasError: Boolean = false,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
    val colors = BezierTheme.colorsV3

    val progress = animateFloatAsState(
            targetValue = if (checked) 1f else 0f,
            animationSpec = ThumbAnimationSpec,
            label = "SwitchThumbProgress",
    )

    val uncheckedTrackColor = colors.fillNeutralHeavy
    val checkedTrackColor = colors.fillNeutralHeaviest
    val thumbColor = colors.iconInverseHeavier
    val ringColor = colors.stateWarning

    val trackShape = RoundedCornerShape(percent = 50)

    val errorBorderModifier = if (hasError) {
        Modifier.outsideBorder(
                color = ringColor,
                shape = trackShape,
                gap = ErrorRingGap,
                borderWidth = ErrorRingBorder,
        )
    } else {
        Modifier
    }

    Box(
            modifier = modifier
                    .size(width = TrackWidth, height = TrackHeight)
                    .then(errorBorderModifier)
                    .graphicsLayer { alpha = if (enabled) 1f else DisabledAlpha }
                    .drawBehind {
                        drawOutline(
                                outline = trackShape.createOutline(size, layoutDirection, this),
                                color = lerp(uncheckedTrackColor, checkedTrackColor, progress.value),
                        )
                    }
                    .then(
                            if (onCheckedChange != null) {
                                Modifier.clickable(
                                        interactionSource = interactionSource,
                                        indication = null,
                                        enabled = enabled,
                                        onClick = { onCheckedChange(!checked) },
                                )
                            } else {
                                Modifier
                            },
                    ),
            contentAlignment = Alignment.TopStart,
    ) {
        Box(
                modifier = Modifier
                        .graphicsLayer {
                            translationX = ThumbPadding.toPx() + ThumbTravel.toPx() * progress.value
                            translationY = ThumbPadding.toPx()
                        }
                        .size(ThumbSize)
                        .shadow(
                                elevation = ThumbElevation,
                                shape = CircleShape,
                        )
                        .background(
                                color = thumbColor,
                                shape = CircleShape,
                        ),
        )
    }
}

private fun Modifier.outsideBorder(
        color: Color,
        shape: Shape,
        gap: Dp,
        borderWidth: Dp,
) = drawBehind {
    val borderWidthPx = borderWidth.toPx()
    val grow = gap.toPx() - borderWidthPx / 2f
    val grownSize = Size(
            width = size.width + grow * 2f,
            height = size.height + grow * 2f,
    )
    val outline = shape.createOutline(grownSize, layoutDirection, this)
    translate(left = -grow, top = -grow) {
        drawOutline(
                outline = outline,
                color = color,
                style = Stroke(width = borderWidthPx),
        )
    }
}

@Composable
private fun SwitchMatrix() {
    val labelColWidth = 88.dp
    val cellWidth = 96.dp

    BezierTheme {
        Column(
                modifier = Modifier
                        .background(BezierTheme.colorsV3.surface)
                        .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(modifier = Modifier.width(labelColWidth))
                listOf("default", "disabled", "error").forEach { stateLabel ->
                    Box(
                            modifier = Modifier.width(cellWidth),
                            contentAlignment = Alignment.Center,
                    ) {
                        BezierText(
                                text = stateLabel,
                                typo = BezierTypo.TextMedium,
                                color = BezierTheme.colorsV3.textNeutral,
                        )
                    }
                }
            }

            listOf(false, true).forEach { checked ->
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(
                            modifier = Modifier.width(labelColWidth),
                            contentAlignment = Alignment.CenterStart,
                    ) {
                        BezierText(
                                text = if (checked) "on" else "off",
                                typo = BezierTypo.TextMedium,
                                color = BezierTheme.colorsV3.textNeutral,
                        )
                    }
                    SwitchCell(cellWidth) {
                        Switch(checked = checked, onCheckedChange = {})
                    }
                    SwitchCell(cellWidth) {
                        Switch(checked = checked, onCheckedChange = {}, enabled = false)
                    }
                    SwitchCell(cellWidth) {
                        Switch(checked = checked, onCheckedChange = {}, hasError = true)
                    }
                }
            }
        }
    }
}

@Composable
private fun SwitchCell(width: Dp, content: @Composable () -> Unit) {
    Box(
            modifier = Modifier.width(width),
            contentAlignment = Alignment.Center,
    ) {
        content()
    }
}

@Preview(showBackground = true, widthDp = 400)
@Preview(showBackground = true, widthDp = 400, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun SwitchMatrixPreview() = SwitchMatrix()
