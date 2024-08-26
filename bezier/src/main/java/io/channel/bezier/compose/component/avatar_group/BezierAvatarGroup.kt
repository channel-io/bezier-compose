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
            showingPainters.forEachIndexed { index, painter ->
                val isEllipsis = index == showingPainters.lastIndex
                        && variant == BezierAvatarGroupVariant.Icon
                        && painters.size - itemCount > 0

                BezierAvatar(
                        painter = painter,
                        size = BezierAvatarSize.Size24,
                        showBorder = type == BezierAvatarGroupType.Stack,
                        isEllipsis = isEllipsis,
                )
            }
        }

        if (variant == BezierAvatarGroupVariant.Count && painters.size - itemCount > 0) {
            Spacer(Modifier.width(4.dp))

            Text(
                    text = "+${painters.size - itemCount}",
                    color = BezierTheme.colorSchemes.fgBlackDark.color,
                    style = BezierTheme.typography.body1SemiBold,
            )
        }
    }
}

@Composable
@Preview
private fun BezierAvatarGroupPreview() {
    val painters = List(104) {
        painterResource(id = R.drawable.unknown)
    }

    BezierTheme {
        Column(
                modifier = Modifier.background(Color.LightGray),
        ) {

            BezierAvatarGroupVariant.entries.forEach { variant ->
                BezierAvatarGroupType.entries.forEach { type ->
                    BezierAvatarGroup(
                            modifier = Modifier.padding(16.dp),
                            painters = painters,
                            variant = variant,
                            type = type,
                    )
                }
            }
        }
    }
}
