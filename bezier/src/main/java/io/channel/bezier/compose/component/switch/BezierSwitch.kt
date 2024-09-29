package io.channel.bezier.compose.component.switch

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.setValue
import androidx.compose.runtime.snapshotFlow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.component.switch.source.BezierSwitchControl
import io.channel.bezier.compose.component.switch.source.rememberBezierSwitchControlState
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun BezierSwitch(
        text: String,
        checked: Boolean,
        onCheckedChange: (Boolean) -> Unit,
        modifier: Modifier = Modifier,
) {
    val coroutineScope = rememberCoroutineScope()

    val switchControlState = rememberBezierSwitchControlState(checked)
    val currentOnCheckedChange by rememberUpdatedState(onCheckedChange)

    LaunchedEffect(switchControlState.anchoredDraggableState) {
        snapshotFlow { switchControlState.anchoredDraggableState.currentValue }
                .collect { newValue ->
                    if (newValue == switchControlState.checked) {
                        currentOnCheckedChange(newValue)
                        return@collect
                    }

                    delay(10000L)
                    switchControlState.forceAnimationCheck = !switchControlState.forceAnimationCheck
                }
    }

    Row(
            modifier = modifier.clickable(
                    interactionSource = remember { MutableInteractionSource() },
                    indication = null,
                    onClick = {
                        coroutineScope.launch {
                            switchControlState.trySwitch(onCheckedChange)
                        }
                    },
            ),
            verticalAlignment = Alignment.CenterVertically,
    ) {
        Spacer(modifier = Modifier.width(12.dp))
        Text(
                modifier = Modifier.weight(1f),
                text = text,
                style = BezierTheme.typography.caption1Regular,
                color = BezierTheme.colorSchemes.fgBlackDarkest.color,
        )
        BezierSwitchControl(
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
                state = switchControlState,
                onCheckedChange = { newValue ->
                    onCheckedChange(newValue)
                },
        )
    }
}

@Composable
@Preview
private fun BezierSwitchPreview() {
    var checked by remember {
        mutableStateOf(false)
    }

    BezierTheme {
        BezierSwitch(
                modifier = Modifier.padding(16.dp),
                text = "hello~",
                checked = checked,
                onCheckedChange = {
                    checked = it
                },
        )
    }
}

@Composable
@Preview
private fun BezierSwitchRevertPreview() {
    BezierTheme {
        BezierSwitch(
                modifier = Modifier.padding(16.dp),
                text = "hello~",
                checked = false,
                onCheckedChange = {},
        )
    }
}
