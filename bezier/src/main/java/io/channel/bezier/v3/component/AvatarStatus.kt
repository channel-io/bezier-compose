package io.channel.bezier.v3.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.color.BezierSemanticColorV3
import io.channel.bezier.icon.Lock
import io.channel.bezier.icon.MoonFilled

@Composable
internal fun AvatarStatus(
        type: AvatarStatusType,
        size: AvatarStatusSize,
        modifier: Modifier = Modifier,
) {
    val colors = BezierTheme.colorsV3
    val layout = size.layout
    val innerColor = type.innerColor(colors)

    Box(
            modifier = modifier
                    .size(layout.container)
                    .clip(RoundedCornerShape(layout.cornerRadius))
                    .background(colors.surfaceHighest)
                    .padding(layout.padding),
            contentAlignment = Alignment.Center,
    ) {
        when (type) {
            AvatarStatusType.Online,
            AvatarStatusType.Offline -> Box(
                    modifier = Modifier
                            .size(layout.inner)
                            .clip(CircleShape)
                            .background(innerColor),
            )

            AvatarStatusType.Lock -> Icon(
                    modifier = Modifier.size(layout.inner),
                    imageVector = BezierIcons.Lock.imageVector,
                    tint = innerColor,
                    contentDescription = null,
            )

            AvatarStatusType.OnlineDnd, AvatarStatusType.OfflineDnd -> Icon(
                    modifier = Modifier.size(layout.inner),
                    imageVector = BezierIcons.MoonFilled.imageVector,
                    tint = innerColor,
                    contentDescription = null,
            )
        }
    }
}

enum class AvatarStatusType {
    Online,
    Offline,
    Lock,
    OnlineDnd,
    OfflineDnd;

    @Composable
    internal fun innerColor(colors: BezierSemanticColorV3): Color = when (this) {
        Online -> colors.iconAccentGreen
        Offline -> colors.iconNeutral
        Lock -> colors.iconNeutral
        OnlineDnd -> colors.iconAccentGreen
        OfflineDnd -> colors.iconAccentYellow
    }
}

internal enum class AvatarStatusSize {
    Small,
    Medium,
    Large,
    XLarge;

    internal val layout: AvatarStatusLayoutSpec
        get() = when (this) {
            Small -> AvatarStatusLayoutSpec(
                    container = 8.dp,
                    padding = 2.dp,
                    inner = 6.dp,
                    cornerRadius = 4.dp,
            )

            Medium -> AvatarStatusLayoutSpec(
                    container = 12.dp,
                    padding = 2.dp,
                    inner = 8.dp,
                    cornerRadius = 6.dp,
            )

            Large -> AvatarStatusLayoutSpec(
                    container = 16.dp,
                    padding = 3.dp,
                    inner = 12.dp,
                    cornerRadius = 8.dp,
            )

            XLarge -> AvatarStatusLayoutSpec(
                    container = 24.dp,
                    padding = 2.dp,
                    inner = 18.dp,
                    cornerRadius = 12.dp,
            )
        }
}

internal data class AvatarStatusLayoutSpec(
        val container: Dp,
        val padding: Dp,
        val inner: Dp,
        val cornerRadius: Dp,
)
