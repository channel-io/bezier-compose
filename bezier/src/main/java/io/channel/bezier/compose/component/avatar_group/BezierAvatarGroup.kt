package io.channel.bezier.compose.component.avatar_group

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.R
import io.channel.bezier.compose.component.avatar.BezierAvatar
import io.channel.bezier.compose.component.avatar.properties.BezierAvatarSize
import io.channel.bezier.compose.component.avatar_group.properties.BezierAvatarGroupType
import io.channel.bezier.compose.component.avatar_group.properties.BezierAvatarGroupVariant

@Composable
fun BezierAvatarGroup(
        painters: List<Painter>,
        variant: BezierAvatarGroupVariant,
        type: BezierAvatarGroupType,
        modifier: Modifier = Modifier,
        itemCount: Int = 5,
) {
    val showingPainters = remember(painters, itemCount) {
        painters.take(itemCount)
    }

    Row(
            modifier = modifier,
    ) {
        Row(
                horizontalArrangement = Arrangement.spacedBy(
                        if (type == BezierAvatarGroupType.Stack) {
                            (-4).dp
                        } else {
                            4.dp
                        },
                ),
        ) {
            showingPainters.forEach { painter ->
                BezierAvatar(
                        painter = painter,
                        size = BezierAvatarSize.Size24,
                        showBorder = type == BezierAvatarGroupType.Stack,
                )
            }
        }

        if (variant == BezierAvatarGroupVariant.Count) {
            Spacer(Modifier.width(4.dp))

            Text(
                    text = (painters.size - itemCount).toString(),
                    color = BezierTheme.colorSchemes.fgBlackDark.color,
                    style = BezierTheme.typography.body1SemiBold,
            )
        }
    }
}

@Composable
@Preview
private fun BezierAvatarGroupPreview() {
    BezierTheme {
        Column(
                modifier = Modifier.background(Color.LightGray),
        ) {
            BezierAvatarGroup(
                    modifier = Modifier.padding(16.dp),
                    painters = listOf(
                            painterResource(id = R.drawable.unknown),
                            painterResource(id = R.drawable.unknown),
                            painterResource(id = R.drawable.unknown),
                            painterResource(id = R.drawable.unknown),
                            painterResource(id = R.drawable.unknown),
                            painterResource(id = R.drawable.unknown),
                            painterResource(id = R.drawable.unknown),
                            painterResource(id = R.drawable.unknown),
                    ),
                    variant = BezierAvatarGroupVariant.Count,
                    type = BezierAvatarGroupType.Stack,
            )
            BezierAvatarGroup(
                    modifier = Modifier.padding(16.dp),
                    painters = listOf(
                            painterResource(id = R.drawable.unknown),
                            painterResource(id = R.drawable.unknown),
                            painterResource(id = R.drawable.unknown),
                            painterResource(id = R.drawable.unknown),
                            painterResource(id = R.drawable.unknown),
                            painterResource(id = R.drawable.unknown),
                    ),
                    variant = BezierAvatarGroupVariant.Count,
                    type = BezierAvatarGroupType.Spread,
            )
        }
    }
}
