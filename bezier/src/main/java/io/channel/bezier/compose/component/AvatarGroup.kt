package io.channel.bezier.compose.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.channel.bezier.compose.BezierTheme
import io.channel.bezier.compose.R

@Composable
fun AvatarGroup(
    painters: List<Painter>,
    modifier: Modifier = Modifier,
    size: AvatarSize = AvatarSize.Size24,
    count: Int = 3,
    gap: Dp = (-4).dp,
    showText: Boolean = true,
    showBorder: Boolean = true,
) {
    Row(
            modifier = modifier,
            verticalAlignment = Alignment.CenterVertically,
    ) {
        val borderWidth = if (showBorder) {
            size.borderWidth
        } else {
            0.dp
        }

        Row(
                horizontalArrangement = Arrangement.spacedBy(gap - borderWidth)
        ) {
            painters.take(count).forEach { painter ->
                Avatar(
                        painter = painter,
                        showBorder = showBorder,
                        size = size,
                )
            }
        }

        if (showText && painters.size > count) {
            val otherProfileCount = painters.size - count

            Spacer(modifier = Modifier.width(4.dp))

            Text(
                    text = "+" + when {
                        otherProfileCount > 99 -> "99+"
                        else -> "$otherProfileCount"
                    },
                    color = BezierTheme.colors.txtBlackDark,
                    fontSize = 16.sp
            )
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun AvatarGroupPreview() {
    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {
        AvatarGroup(
                painters = listOf(
                        painterResource(id = R.drawable.unknown),
                        painterResource(id = R.drawable.unknown),
                ),
        )

        AvatarGroup(
                painters = listOf(
                        painterResource(id = R.drawable.unknown),
                        painterResource(id = R.drawable.unknown),
                        painterResource(id = R.drawable.unknown),
                        painterResource(id = R.drawable.unknown),
                        painterResource(id = R.drawable.unknown),
                ),
        )
    }
}
