package io.channel.bezier.component

import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.FractionalThreshold
import androidx.compose.material.SwipeableState
import androidx.compose.material.swipeable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme
import io.channel.bezier.extension.roundedBackground
import kotlinx.coroutines.launch
import kotlin.math.roundToInt

private val switchButtonOffset = 22.dp
private const val SwitchOn = true
private const val SwitchOff = false

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun Switch(
    state: SwitchState,
    enabled: Boolean = true,
) {
    val coroutineScope = rememberCoroutineScope()

    val sizePx = with(LocalDensity.current) { switchButtonOffset.toPx() }
    val anchors = remember(sizePx) {
        mapOf(
                0F to SwitchOff,
                sizePx to SwitchOn,
        )
    }

    val checkedColor = BezierTheme.colors.bgtxtGreenNormal
    val uncheckedColor = BezierTheme.colors.bgBlackDark
    val backgroundColor by remember(state) {
        derivedStateOf { lerp(uncheckedColor, checkedColor, (state.swipeableState.offset.value / sizePx).coerceIn(0F, 1F)) }
    }

    Row(
            modifier = Modifier
                    .swipeable(
                            enabled = enabled,
                            state = state.swipeableState,
                            anchors = anchors,
                            thresholds = { _, _ -> FractionalThreshold(0.3f) },
                            orientation = Orientation.Horizontal,
                    )
                    .clickable(
                            enabled = enabled,
                            interactionSource = remember { MutableInteractionSource() },
                            indication = null,
                    ) {
                        state.onCheckChanged(!state.currentValue)

                        coroutineScope.launch {
                            state.switch()
                        }
                    }
    ) {
        Box(
                modifier = Modifier
                        .width(50.dp)
                        .height(28.dp)
                        .alpha(if (enabled) 1f else 0.4f)
                        .roundedBackground(backgroundColor = backgroundColor)
                        .padding(2.dp)
        ) {
            Thumb(
                    modifier = Modifier
                            .offset {
                                IntOffset(state.swipeableState.offset.value.roundToInt(), 0)
                            }
            )
        }
    }
}

@Composable
private fun Thumb(
        modifier: Modifier = Modifier,
) {
    Box(
            modifier = modifier
                    .size(24.dp)
                    .shadow(
                            elevation = 6.dp,
                            shape = CircleShape,
                    )
                    .background(
                            color = BezierTheme.colors.bgtxtAbsoluteWhiteDark,
                    ),
    )
}

@Preview(showBackground = true)
@Composable
private fun SwitchPreview() {
    val isChecked1 = rememberSwitchState(
            initialValue = false,
            onCheckedChange = {},
    )
    val isChecked2 = rememberSwitchState(
            initialValue = true,
            onCheckedChange = {},
    )
    val isChecked3 = rememberSwitchState(
            initialValue = false,
            onCheckedChange = {},
    )
    val isChecked4 = rememberSwitchState(
            initialValue = true,
            onCheckedChange = {},
    )

    Column(
            modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Switch(
                    state = isChecked1,
            )

            Switch(
                    state = isChecked2,
            )
        }

        Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Switch(
                    state = isChecked3,
                    enabled = false,
            )
            Switch(
                    state = isChecked4,
                    enabled = false,
            )
        }
    }
}

@Composable
fun rememberSwitchState(
        initialValue: Boolean,
        onCheckedChange: (Boolean) -> Unit
): SwitchState {
    return remember {
        SwitchState(
                initialValue = initialValue,
                onCheckedChange = onCheckedChange,
        )
    }
}

private val AnimationSpec = tween<Float>(durationMillis = 50)

@OptIn(ExperimentalMaterialApi::class)
@Stable
class SwitchState(
        initialValue: Boolean,
        private val onCheckedChange: (Boolean) -> Unit,
) {
    internal val swipeableState = SwipeableState(
            initialValue = initialValue,
            animationSpec = AnimationSpec,
            confirmStateChange = { curr ->
                val result = if (currentValue != curr) {
                    onCheckedChange(curr)

                    true
                } else {
                    false
                }

                result
            }
    )

    internal fun onCheckChanged(checked: Boolean) {
        if (currentValue != checked) {
            onCheckedChange(checked)
        }
    }

    val isOn: Boolean
        get() = currentValue

    val isOff: Boolean
        get() = !currentValue

    val currentValue: Boolean
        get() = swipeableState.currentValue

    suspend fun on() {
        swipeableState.animateTo(
                targetValue = SwitchOn,
                anim = tween(durationMillis = 50)
        )
    }

    suspend fun off() {
        swipeableState.animateTo(
                targetValue = SwitchOff,
                anim = tween(durationMillis = 50)
        )
    }

    suspend fun switch() {
        if (isOn) {
            off()
        } else {
            on()
        }
    }
}
