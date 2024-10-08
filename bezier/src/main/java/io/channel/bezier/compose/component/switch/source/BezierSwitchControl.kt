package io.channel.bezier.compose.component.switch.source

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.AnchoredDraggableState
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
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.foundation.ShadowStyle
import io.channel.bezier.compose.foundation.bezierShadow
import kotlinx.coroutines.launch

internal val SwitchWidth = 44.dp
internal val SwitchPadding = 3.dp
internal val ThumbSize = 22.dp

@OptIn(ExperimentalFoundationApi::class)
@Composable
internal fun BezierSwitchControl(
        state: BezierSwitchControlState,
        onCheckedChange: (Boolean) -> Unit,
        modifier: Modifier = Modifier,
) {
    val coroutineScope = rememberCoroutineScope()

    val checked = state.checked
    val anchoredDraggableState = state.anchoredDraggableState

    LaunchedEffect(checked, state.forceAnimationCheck) {
        if (checked != anchoredDraggableState.currentValue) {
            anchoredDraggableState.animateTo(checked)
        }
    }

    Box(
            modifier = modifier
                    .padding(2.dp)
                    .clip(CircleShape)
                    .requiredSize(width = SwitchWidth, height = 28.dp)
                    .clickable(
                            interactionSource = remember { MutableInteractionSource() },
                            indication = null,
                            onClick = {
                                coroutineScope.launch {
                                    state.trySwitch(onCheckedChange)
                                }
                            },
                    ),
    ) {
        Track(fraction = { anchoredDraggableState.requireOffset().dp / SwitchWidth })
        Thumb(anchoredDraggableState = anchoredDraggableState)
    }
}

/**
 * 리컴포지션을 피하기 위해 값을 Canvas 가 읽도록 람다를 받습니다.
 * [공식 문서](https://developer.android.com/develop/ui/compose/phases?hl=ko)
 */
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

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun Thumb(
        anchoredDraggableState: AnchoredDraggableState<Boolean>,
) {
    val color = BezierTheme.colorSchemes.fgAbsoluteWhiteDark.color

    Box(
            modifier = Modifier
                    .padding(SwitchPadding)
                    .anchoredDraggable(
                            state = anchoredDraggableState,
                            orientation = Orientation.Horizontal,
                    ),
    ) {
        Canvas(
                modifier = Modifier
                        .size(ThumbSize)
                        .bezierShadow(ShadowStyle.Shadow2, CircleShape),
        ) {
            val thumbValue = anchoredDraggableState.requireOffset()

            drawLine(
                    color = color,
                    start = Offset(thumbValue + (size.width / 2), this.center.y),
                    end = Offset(thumbValue + (size.width / 2), this.center.y),
                    strokeWidth = size.width,
                    cap = StrokeCap.Round,
            )
        }
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
                state = rememberBezierSwitchControlState(checked),
                onCheckedChange = {
                    checked = it
                },
        )
    }
}
