package io.channel.bezier.compose.component.tag

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.component.tag.properties.BezierTagColor

@Composable
fun BezierTag(
        text: String,
        color: BezierTagColor,
) {
    Text(
            modifier = Modifier
                    .clip(RoundedCornerShape(8.dp))
                    .background(color.backgroundColor().color)
                    .padding(horizontal = 8.dp, vertical = 3.dp)
                    .padding(horizontal = 3.dp),
            text = text,
            style = BezierTheme.typography.body2Regular,
            color = BezierTheme.colorSchemes.fgBlackDarkest.color,
    )
}

@Preview(showBackground = true)
@Composable
private fun BezierTagPreview() {
    BezierTheme {
        Column(
                modifier = Modifier.padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            BezierTagColor.entries.forEach { color ->
                BezierTag(
                        text = "Label",
                        color = color,
                )
            }
        }
    }
}
