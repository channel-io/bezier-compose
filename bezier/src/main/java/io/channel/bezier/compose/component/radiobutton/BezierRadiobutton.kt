package io.channel.bezier.compose.component.radiobutton

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.extension.thenIf
import io.channel.bezier.icon.CheckBold

@Composable
fun BezierRadiobutton(
        text: String,
        checked: Boolean,
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
) {
    val controlColor = if (checked) {
        BezierTheme.colorSchemes.fgGreenNormal
    } else {
        BezierTheme.colorSchemes.fgBlackDark
    }.color

    Row(
            modifier = modifier
                    .thenIf(!enabled) {
                        alpha(0.4f)
                    }
                    .clickable(
                            enabled = enabled,
                            onClick = onClick,
                    ),
    ) {
        BezierRadiobuttonControl(
                modifier = Modifier.padding(8.dp),
                color = controlColor,
        )

        BezierRadiobuttonLabel(
                modifier = Modifier.align(Alignment.CenterVertically),
                text = text,
        )
    }
}

@Composable
private fun BezierRadiobuttonControl(
        color: Color,
        modifier: Modifier = Modifier,
) {
    Icon(
            modifier = modifier
                    .size(24.dp)
                    .padding(2.dp),
            imageVector = BezierIcons.CheckBold.imageVector,
            tint = color,
            contentDescription = null,
    )
}

@Composable
private fun BezierRadiobuttonLabel(
        text: String,
        modifier: Modifier = Modifier,
) {
    Text(
            modifier = modifier,
            text = text,
            style = BezierTheme.typography.caption1Regular,
    )
}

@Preview(showBackground = true)
@Composable
private fun BezierRadiobuttonPreview() {
    BezierTheme {
        var checked1 by remember { mutableStateOf(false) }
        var checked2 by remember { mutableStateOf(true) }
        var checked3 by remember { mutableStateOf(false) }
        var checked4 by remember { mutableStateOf(true) }

        Column {
            BezierRadiobutton(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Radio label",
                    checked = checked1,
                    onClick = { checked1 = !checked1 },
            )
            BezierRadiobutton(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Radio label",
                    checked = checked2,
                    onClick = { checked2 = !checked2 },
            )
            BezierRadiobutton(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Radio label",
                    checked = checked3,
                    enabled = false,
                    onClick = { checked3 = !checked3 },
            )
            BezierRadiobutton(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Radio label",
                    checked = checked4,
                    enabled = false,
                    onClick = { checked4 = !checked4 },
            )
        }

    }
}
