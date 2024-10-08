package io.channel.bezier.compose.component.switch.source

import androidx.compose.animation.core.TweenSpec
import androidx.compose.animation.core.exponentialDecay
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.AnchoredDraggableState
import androidx.compose.foundation.gestures.DraggableAnchors
import androidx.compose.foundation.gestures.animateTo
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalFoundationApi::class)
@Stable
internal class BezierSwitchControlState(
        initialChecked: Boolean,
        val anchoredDraggableState: AnchoredDraggableState<Boolean>,
) {
    var checked by mutableStateOf(initialChecked)
    var forceAnimationCheck by mutableStateOf(false)

    suspend fun trySwitch(onCheckedChange: (Boolean) -> Unit) {
        if (!anchoredDraggableState.isAnimationRunning) {
            onCheckedChange(!anchoredDraggableState.currentValue)
            anchoredDraggableState.animateTo(!anchoredDraggableState.currentValue)
        }
    }
}

@Composable
@OptIn(ExperimentalFoundationApi::class)
internal fun rememberBezierSwitchControlState(checked: Boolean): BezierSwitchControlState {
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

    return remember {
        BezierSwitchControlState(
                initialChecked = checked,
                anchoredDraggableState = AnchoredDraggableState(
                        initialValue = checked,
                        snapAnimationSpec = TweenSpec(durationMillis = 100),
                        decayAnimationSpec = exponentialDecay(),
                        anchors = DraggableAnchors {
                            false at 0f
                            true at maxBoundPx
                        },
                        positionalThreshold = { totalDistance -> totalDistance * 0.7f },
                        velocityThreshold = { switchVelocityThresholdPx },
                ),
        )
    }.apply {
        this.checked = checked
    }
}
