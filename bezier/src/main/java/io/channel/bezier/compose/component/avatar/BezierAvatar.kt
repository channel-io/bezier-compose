package io.channel.bezier.compose.component.avatar

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.R
import io.channel.bezier.compose.component.avatar.properties.BezierAvatarBadge
import io.channel.bezier.compose.component.avatar.properties.BezierAvatarSize
import io.channel.bezier.compose.component.badge.chat.BezierChatBadge
import io.channel.bezier.compose.component.badge.status.BezierStatusBadge
import io.channel.bezier.extension.outlineBorder
import io.channel.bezier.extension.thenIf
import io.channel.bezier.shape.SmoothRoundedCornerShape

internal const val AvatarRadiusFraction = 42

@Composable
fun BezierAvatar(
        url: String,
        size: BezierAvatarSize,
        isOnline: Boolean,
        doNotDisturb: Boolean,
        modifier: Modifier = Modifier,
        showBorder: Boolean = false,
        errorPainter: Painter = painterResource(id = R.drawable.unknown),
) {
    BezierAvatar(
            url = url,
            size = size,
            modifier = modifier,
            showBorder = showBorder,
            badge = BezierAvatarBadge.Status(isOnline = isOnline, doNotDisturb = doNotDisturb),
            errorPainter = errorPainter,
    )
}

@Composable
fun BezierAvatar(
        url: String,
        size: BezierAvatarSize,
        modifier: Modifier = Modifier,
        showBorder: Boolean = false,
        badge: BezierAvatarBadge = BezierAvatarBadge.None,
        errorPainter: Painter = painterResource(id = R.drawable.unknown),
) {
    val painter = rememberAsyncImagePainter(
            model = url,
            error = errorPainter,
    )

    BezierAvatar(
            painter = painter,
            size = size,
            modifier = modifier,
            showBorder = showBorder,
            badge = badge,
    )
}

@Composable
fun BezierAvatar(
        painter: Painter,
        size: BezierAvatarSize,
        isOnline: Boolean,
        doNotDisturb: Boolean,
        modifier: Modifier = Modifier,
        showBorder: Boolean = false,
) {
    BezierAvatar(
            painter = painter,
            size = size,
            modifier = modifier,
            showBorder = showBorder,
            badge = BezierAvatarBadge.Status(isOnline = isOnline, doNotDisturb = doNotDisturb),
    )
}

@Composable
fun BezierAvatar(
        painter: Painter,
        size: BezierAvatarSize,
        modifier: Modifier = Modifier,
        showBorder: Boolean = false,
        badge: BezierAvatarBadge = BezierAvatarBadge.None,
) {
    val avatarShape = SmoothRoundedCornerShape(AvatarRadiusFraction)

    Box(
            modifier = modifier.requiredSize(size.size),
    ) {
        Image(
                modifier = Modifier
                        .fillMaxSize()
                        .thenIf(showBorder) {
                            outlineBorder(
                                    width = size.outlineBorderWidth,
                                    color = BezierTheme.colorSchemes.surfaceNormal.color,
                                    shape = avatarShape,
                            )
                        }
                        .clip(avatarShape),
                painter = painter,
                contentDescription = null,
        )

        Box(
                modifier = Modifier
                        .align(Alignment.BottomEnd)
                        .offset(x = size.badgeOffset, y = size.badgeOffset),
        ) {
            when (badge) {
                BezierAvatarBadge.None -> Unit
                BezierAvatarBadge.Chat -> BezierChatBadge(size = size.chatBadgeSize)
                is BezierAvatarBadge.Status -> BezierStatusBadge(
                        isOnline = badge.isOnline,
                        doNotDisturb = badge.doNotDisturb,
                        size = size.statusBadgeSize,
                )

                is BezierAvatarBadge.Integration -> IntegrationBadge(
                        integration = badge,
                        size = size,
                )
            }
        }
    }
}

@Composable
private fun IntegrationBadge(
        integration: BezierAvatarBadge.Integration,
        size: BezierAvatarSize,
) {
    val shape = integration.createShape(size)

    Image(
            modifier = Modifier
                    .size(size.size)
                    .outlineBorder(
                            width = 2.dp,
                            color = BezierTheme.colorSchemes.surfaceNormal.color,
                            shape = shape,
                    )
                    .clip(shape),
            painter = integration.painter(),
            contentDescription = integration.name,
    )
}

@Composable
@Preview(widthDp = 700, heightDp = 1100)
private fun BezierAvatarPreview() {
    val badges = listOf(
            BezierAvatarBadge.None,
            BezierAvatarBadge.Status(isOnline = true, doNotDisturb = false),
            BezierAvatarBadge.Status(isOnline = true, doNotDisturb = true),
            BezierAvatarBadge.Status(isOnline = false, doNotDisturb = true),
            BezierAvatarBadge.Status(isOnline = false, doNotDisturb = false),
            BezierAvatarBadge.Chat,
            BezierAvatarBadge.Integration.Kakao,
    )

    BezierTheme {
        Column(
                modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 20.dp, top = 20.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Row(
                    verticalAlignment = Alignment.Bottom,
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                BezierAvatarSize.entries.forEach { size ->
                    BezierAvatar(
                            painter = painterResource(id = R.drawable.unknown),
                            size = size,
                            showBorder = false,
                    )
                }
            }

            badges.forEach { badge ->
                Row(
                        verticalAlignment = Alignment.Bottom,
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    BezierAvatarSize.entries.forEach { size ->
                        BezierAvatar(
                                painter = painterResource(id = R.drawable.unknown),
                                size = size,
                                showBorder = true,
                                badge = badge,
                        )
                    }
                }
            }
        }
    }
}
