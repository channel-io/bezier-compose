package io.channel.bezier.compose.component.switch.source

import androidx.compose.animation.core.TweenSpec
import androidx.compose.animation.core.exponentialDecay
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.AnchoredDraggableState
import androidx.compose.foundation.gestures.DraggableAnchors
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.anchoredDraggable
import androidx.compose.foundation.gestures.animateTo
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.foundation.ShadowStyle
import io.channel.bezier.compose.foundation.bezierShadow
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.launch

private val SwitchWidth = 44.dp
private val SwitchPadding = 3.dp
private val ThumbSize = 22.dp

@OptIn(ExperimentalFoundationApi::class, FlowPreview::class)
@Composable
internal fun BezierSwitchControl(
        checked: Boolean,
        onCheckedChange: (Boolean) -> Unit,
        modifier: Modifier = Modifier,
) {
    val coroutineScope = rememberCoroutineScope()

    /**
     * 스위치에서 Thumb가 그려질 수 있는 너비는 양 옆 패딩을 제외한 38입니다.
     * Thumb은 중앙 점을 기준으로 그리므로 22의 절반인 11에서 그리면 시작 점이 됩니다.
     * 끝 점은 마찬가지로 끝에서 11만큼 멀어져야 하므로 38 - 11 = 27 에서 그려져야합니다.
     * Thumb은 그려질 때 11을 항상 더하므로 계산식에서는 ThumbSize를 빼줍니다.
     * 결과적으로 maxBound는 16이 되며 11을 더해서 27이 되었을 때 스위치 끝에 그려지게 됩니다.
     */
    val maxBound = SwitchWidth - SwitchPadding * 2 - ThumbSize
    val maxBoundPx = with(LocalDensity.current) { maxBound.toPx() }

    val switchVelocityThresholdPx = with(LocalDensity.current) { 10.dp.toPx() }

    val anchoredDraggableState = remember {
        AnchoredDraggableState(
                initialValue = checked,
                snapAnimationSpec = TweenSpec(durationMillis = 100),
                decayAnimationSpec = exponentialDecay(),
                anchors = DraggableAnchors {
                    false at 0f
                    true at maxBoundPx
                },
                positionalThreshold = { totalDistance -> totalDistance * 0.7f },
                velocityThreshold = { switchVelocityThresholdPx },
        )
    }

    val currentOnCheckedChange by rememberUpdatedState(onCheckedChange)
    val currentChecked by rememberUpdatedState(checked)
    var forceAnimationCheck by remember { mutableStateOf(false) }

    LaunchedEffect(anchoredDraggableState) {
        snapshotFlow { anchoredDraggableState.currentValue }
                .onEach { newValue ->
                    if (newValue != currentChecked) {
                        currentOnCheckedChange(newValue)
                    }
                }
                .debounce(1000L)
                .filter { it != currentChecked }
                .collect {
                    forceAnimationCheck = !forceAnimationCheck
                }
    }

    LaunchedEffect(checked, forceAnimationCheck) {
        if (checked != anchoredDraggableState.currentValue) {
            anchoredDraggableState.animateTo(checked)
        }
    }

    Box(
            modifier = modifier
                    .clip(CircleShape)
                    .requiredSize(width = SwitchWidth, height = 28.dp)
                    .clickable(
                            interactionSource = remember { MutableInteractionSource() },
                            indication = null,
                            onClick = {
                                onCheckedChange(!checked)

                                coroutineScope.launch {
                                    if (!anchoredDraggableState.isAnimationRunning) {
                                        anchoredDraggableState.animateTo(!anchoredDraggableState.currentValue)
                                    }
                                }
                            },
                    ),
    ) {
        Track(fraction = { anchoredDraggableState.requireOffset().dp / SwitchWidth })
        Box(
                modifier = Modifier
                        .padding(SwitchPadding)
                        .anchoredDraggable(
                                state = anchoredDraggableState,
                                orientation = Orientation.Horizontal,
                        ),
        ) {
            Thumb(thumbValue = { anchoredDraggableState.requireOffset() })
        }
    }
}

@Composable
private fun Track(fraction: () -> Float) {
    val start = BezierTheme.colorSchemes.bgBlackDark.color
    val stop = BezierTheme.colorSchemes.bgGreenNormal.color

    Canvas(
            modifier = Modifier
                    .fillMaxSize(),
    ) {
        val backgroundColor = lerp(
                start = start,
                stop = stop,
                fraction = fraction(),
        )

        drawRect(backgroundColor)
    }
}

@Composable
private fun Thumb(thumbValue: () -> Float) {
    val color = BezierTheme.colorSchemes.fgAbsoluteWhiteDark.color

    Canvas(
            modifier = Modifier
                    .size(ThumbSize)
                    .bezierShadow(ShadowStyle.Shadow2, CircleShape),
    ) {
        drawLine(
                color = color,
                start = Offset(thumbValue() + (size.width / 2), this.center.y),
                end = Offset(thumbValue() + (size.width / 2), this.center.y),
                strokeWidth = size.width,
                cap = StrokeCap.Round,
        )
    }
}

@Composable
@Preview
private fun BezierSwitchControlPreview() {
    var checked by remember {
        mutableStateOf(false)
    }

    BezierTheme {
        BezierSwitchControl(
                checked = checked,
                onCheckedChange = {
                    checked = it
                },
        )
    }
}
