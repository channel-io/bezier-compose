package io.channel.bezier.compose.component.badge.status

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.component.badge.status.properties.BezierStatusBadgeSize
import io.channel.bezier.icon.MoonFilled

@Composable
fun BezierStatusBadge(
        isOnline: Boolean,
        doNotDisturb: Boolean,
        badgeSize: BezierStatusBadgeSize,
        modifier: Modifier = Modifier,
) {
    val contentColor = if (isOnline) {
        BezierTheme.colorSchemes.fgGreenNormal.color
    } else if (doNotDisturb) {
        BezierTheme.colorSchemes.fgYellowNormal.color
    } else {
        BezierTheme.colorSchemes.bgGreyDark.color
    }

    Box(
            modifier = modifier
                    .clip(CircleShape)
                    .size(badgeSize.badgeSize)
                    .background(BezierTheme.colorSchemes.bgWhiteHighest.color),
            contentAlignment = Alignment.Center,
    ) {
        if (doNotDisturb) {
            Icon(
                    modifier = Modifier.size(badgeSize.moonSize),
                    imageVector = BezierIcons.MoonFilled.imageVector,
                    contentDescription = "doNotDisturb",
                    tint = contentColor,
            )
        } else {
            Box(
                    modifier = Modifier
                            .clip(CircleShape)
                            .size(badgeSize.dotSize)
                            .background(contentColor),
            )
        }
    }
}

@Composable
@Preview
private fun BezierStatusBadgePreview() {
    BezierTheme {
        Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            BezierStatusBadgeSize.entries.forEach {
                BezierStatusBadge(
                        isOnline = true,
                        doNotDisturb = false,
                        badgeSize = it,
                )
                BezierStatusBadge(
                        isOnline = false,
                        doNotDisturb = false,
                        badgeSize = it,
                )
            }
        }
    }
}

@Composable
@Preview
private fun BezierStatusBadgeDoNotDisturbPreview() {
    BezierTheme {
        Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            BezierStatusBadgeSize.entries.forEach {
                BezierStatusBadge(
                        isOnline = true,
                        doNotDisturb = true,
                        badgeSize = it,
                )

                BezierStatusBadge(
                        isOnline = false,
                        doNotDisturb = true,
                        badgeSize = it,
                )
            }
        }
    }
}
