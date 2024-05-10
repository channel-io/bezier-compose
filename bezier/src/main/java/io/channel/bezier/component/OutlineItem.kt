package io.channel.bezier.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.R

private val IndentWidth = 12.dp

@Composable
fun OutlineItem(
        modifier: Modifier = Modifier,
        toggle: OutlineToggle = OutlineToggle.Leaf,
        indentLevel: Int = 0,
        onClickExpand: (() -> Unit)? = null,
        content: @Composable () -> Unit,
) {
    Row(
            modifier = modifier
                    .padding(start = IndentWidth * indentLevel),
            verticalAlignment = Alignment.CenterVertically,
    ) {
        val icon = when (toggle) {
            OutlineToggle.Leaf -> R.drawable.icon_hashtag
            OutlineToggle.Expanded -> R.drawable.icon_chevron_small_down
            OutlineToggle.Collapsed -> R.drawable.icon_chevron_small_right
        }

        Icon(
                modifier = Modifier
                        .clickable(
                                enabled = onClickExpand != null && toggle != OutlineToggle.Leaf,
                                indication = rememberRipple(radius = 12.dp),
                                interactionSource = remember { MutableInteractionSource() },
                                onClick = { onClickExpand?.invoke() },
                        )
                        .padding(6.dp)
                        .size(24.dp)
                        .alpha(toggle.iconAlpha),
                painter = painterResource(id = icon),
                contentDescription = null,
                tint = BezierTheme.colors.txtBlackDark,
        )

        content()
    }
}

enum class OutlineToggle {
    Leaf, Expanded, Collapsed;
}

private val OutlineToggle.iconAlpha: Float
    get() = when (this) {
        OutlineToggle.Leaf -> 0.4f
        else -> 1f
    }

@Preview(showBackground = true)
@Composable
private fun OutlineItemPreview() = Column {
    OutlineItem(toggle = OutlineToggle.Leaf) {
        Text(text = "Hello World 1", color = BezierTheme.colors.txtBlackDark)
    }

    OutlineItem(
            toggle = OutlineToggle.Expanded,
            onClickExpand = {},
    ) {
        Text(text = "Hello World 2", color = BezierTheme.colors.txtBlackDark)
    }

    OutlineItem(
            toggle = OutlineToggle.Collapsed,
            onClickExpand = {},
    ) {
        Text(text = "Hello World 3", color = BezierTheme.colors.txtBlackDark)
    }
}
