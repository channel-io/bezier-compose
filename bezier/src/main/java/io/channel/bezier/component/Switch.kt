package io.channel.bezier.component

import androidx.compose.animation.core.EaseInOut
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.FractionalThreshold
import androidx.compose.material.SwipeableState
import androidx.compose.material.Text
import androidx.compose.material.swipeable
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.Stable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.runtime.snapshots.SnapshotStateList
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
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import kotlin.math.roundToInt

private val switchButtonOffset = 22.dp
private const val SwitchOn = true
private const val SwitchOff = false
private const val TimeOutMilliSecond = 10000L

@Composable
fun Switch(
        checked: Boolean,
        onCheckedChange: ((Boolean) -> Unit)?,
        enabled: Boolean = true,
) {
    val currentChecked by rememberUpdatedState(checked)
    var forceAnimationCheck by remember { mutableStateOf(false) }
    var interactionEnable by remember { mutableStateOf(true) }

    val switchState = rememberSwitchState(
            initialValue = checked,
            onCheckedChange = {
                interactionEnable = false
                onCheckedChange?.invoke(it)
            },
    )

    LaunchedEffect(switchState) {
        snapshotFlow { switchState.currentValue }
                .collectLatest { newValue ->
                    if (currentChecked == newValue) {
                        return@collectLatest
                    }

                    interactionEnable = false
                    delay(TimeOutMilliSecond)
                    forceAnimationCheck = !forceAnimationCheck
                }
    }

    LaunchedEffect(checked, forceAnimationCheck) {
        if (checked != switchState.currentValue) {
            if (checked) {
                switchState.on()
            } else {
                switchState.off()
            }
        }

        interactionEnable = true
    }

    Switch(switchState, enabled && interactionEnable)
}

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

    val checkedColor = BezierTheme.colorsV3.fillAccentGreenHeavier
    val uncheckedColor = BezierTheme.colorsV3.fillNeutralHeavy
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
                    },
    ) {
        Box(
                modifier = Modifier
                        .width(50.dp)
                        .height(28.dp)
                        .alpha(if (enabled) 1f else 0.4f)
                        .roundedBackground(backgroundColor = backgroundColor)
                        .padding(2.dp),
        ) {
            Thumb(
                    modifier = Modifier
                            .offset {
                                IntOffset(state.swipeableState.offset.value.roundToInt(), 0)
                            },
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
                            color = BezierTheme.colorsV3.fillAbsoluteWhite,
                    ),
    )
}

@Composable
fun rememberSwitchState(
        initialValue: Boolean,
        onCheckedChange: ((Boolean) -> Unit)?
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
        val onCheckedChange: ((Boolean) -> Unit)?,
) {
    internal val swipeableState = SwipeableState(
            initialValue = initialValue,
            animationSpec = AnimationSpec,
            confirmStateChange = { curr ->
                val result = if (currentValue != curr && onCheckedChange != null) {
                    onCheckedChange.invoke(curr)

                    true
                } else {
                    false
                }

                result
            },
    )

    internal fun onCheckChanged(checked: Boolean) {
        if (currentValue != checked) {
            onCheckedChange?.invoke(checked)
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
                anim = tween(
                        durationMillis = 200,
                        easing = EaseInOut,
                ),
        )
    }

    suspend fun off() {
        swipeableState.animateTo(
                targetValue = SwitchOff,
                anim = tween(
                        durationMillis = 200,
                        easing = EaseInOut,
                ),
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

@Preview(showBackground = true)
@Composable
private fun SwitchStatefulPreview() {
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
            horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp),
        ) {
            Switch(
                    state = isChecked1,
            )

            Switch(
                    state = isChecked2,
            )
        }

        Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp),
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

@Preview(showBackground = true)
@Composable
private fun SwitchStatelessCallbackPreview() {
    Column(
            modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(15.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        var checked1 by remember { mutableStateOf(false) }
        var checked2 by remember { mutableStateOf(false) }

        val coroutineScope = rememberCoroutineScope()

        Text(text = "딜레이가 있는 케이스\n스위치의 상태값 : $checked1")

        Switch(
                checked = checked1,
                onCheckedChange = {
                    coroutineScope.launch {
                        // api 콜에 대한 상태를 기다립니다.
                        delay(300L)
                        checked1 = it
                    }
                },
        )

        Text(text = "타임아웃 케이스\n실제 스위치의 상태값 : $checked2")

        Switch(
                checked = checked2,
                onCheckedChange = {},
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun SwitchStatelessPreview() {
    var checked1 by remember { mutableStateOf(false) }
    var checked2 by remember { mutableStateOf(true) }
    var checked3 by remember { mutableStateOf(false) }
    var checked4 by remember { mutableStateOf(true) }

    Column(
            modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp),
        ) {
            Switch(
                    checked = checked1,
                    onCheckedChange = {
                        checked1 = it
                    },
            )

            Switch(
                    checked = checked2,
                    onCheckedChange = {
                        checked2 = it
                    },
            )
        }

        Row(
                horizontalArrangement = Arrangement.spacedBy(10.dp),
        ) {
            Switch(
                    checked = checked3,
                    onCheckedChange = {
                        checked3 = it
                    },
                    enabled = false,
            )

            Switch(
                    checked = checked4,
                    onCheckedChange = {
                        checked4 = it
                    },
                    enabled = false,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SwitchStatelessInLazyColumnPreview() {
    val checkList = remember {
        SnapshotStateList<Boolean>().also { items ->
            repeat(50) {
                items.add(false)
            }
        }
    }

    LaunchedEffect(Unit) {
        var checked = true

        while (true) {
            delay(1000L)
            checked = !checked
            repeat(50) {
                checkList[it] = checked
            }
        }
    }

    LazyColumn(
            modifier = Modifier.fillMaxSize(),
    ) {
        checkList.forEachIndexed { index, checked ->
            item {
                Row(
                        modifier = Modifier.padding(vertical = 8.dp),
                        verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(text = "Check ${index + 1}")

                    Spacer(modifier = Modifier.width(16.dp))

                    Switch(
                            checked = checked,
                            onCheckedChange = {
                                checkList[index] = it
                            },
                    )
                }
            }
        }
    }
}
