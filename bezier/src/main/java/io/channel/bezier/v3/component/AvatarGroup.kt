package io.channel.bezier.v3.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.component.BezierText
import io.channel.bezier.icon.More
import io.channel.bezier.shape.SmoothRoundedCornerShape
import io.channel.bezier.typography.BezierTypo
import io.channel.bezier.typography.BezierWeight

private const val AvatarGroupShapePercent = 42
private val AvatarGroupCountEllipsisGap: Dp = 4.dp
private val Size20CountTextPadding: Dp = 4.dp

@Composable
fun AvatarGroup(
        avatars: List<Painter>,
        modifier: Modifier = Modifier,
        size: AvatarGroupSize = AvatarGroupSize.Size20,
        ellipsisType: AvatarGroupEllipsisType = AvatarGroupEllipsisType.Icon,
) {
    val layout = size.layout(ellipsisType)
    val hasEllipsis = avatars.size > 3
    val visibleAvatars = if (hasEllipsis) avatars.take(3) else avatars
    val shape = SmoothRoundedCornerShape(percent = AvatarGroupShapePercent)
    val moreText = "+${avatars.size - 3}"

    Box(modifier = modifier) {
        visibleAvatars.forEachIndexed { idx, painter ->
            Avatar(
                    image = painter,
                    size = layout.avatarSize,
                    modifier = Modifier.offset(x = layout.spacing * idx),
            )
        }

        if (hasEllipsis) {
            when (ellipsisType) {
                AvatarGroupEllipsisType.Icon -> EllipsisIcon(
                        avatarPainter = avatars[3],
                        size = layout.avatarSize,
                        avatarLength = layout.avatarLength,
                        moreIconSize = layout.moreIconSize,
                        shape = shape,
                        modifier = Modifier.offset(x = layout.spacing * 3),
                )

                AvatarGroupEllipsisType.Count -> {
                    val textOffsetX = layout.spacing * 2 + layout.avatarLength + AvatarGroupCountEllipsisGap
                    Box(
                            modifier = Modifier
                                    .offset(x = textOffsetX)
                                    .height(layout.avatarLength)
                                    .padding(horizontal = layout.countTextHorizontalPadding),
                            contentAlignment = Alignment.Center,
                    ) {
                        BezierText(
                                text = moreText,
                                typo = layout.countTypo,
                                weight = BezierWeight.Bold,
                                color = BezierTheme.colorsV3.textNeutralLighter,
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun EllipsisIcon(
        avatarPainter: Painter,
        size: AvatarSize,
        avatarLength: Dp,
        moreIconSize: Dp,
        shape: androidx.compose.ui.graphics.Shape,
        modifier: Modifier,
) {
    Box(modifier = modifier) {
        Avatar(
                image = avatarPainter,
                size = size,
                showBorder = true,
        )
        Box(
                modifier = Modifier
                        .size(avatarLength)
                        .clip(shape)
                        .background(BezierTheme.colorsV3.dimAbsoluteBlack),
                contentAlignment = Alignment.Center,
        ) {
            Icon(
                    imageVector = BezierIcons.More.imageVector,
                    contentDescription = null,
                    modifier = Modifier.size(moreIconSize),
                    tint = BezierTheme.colorsV3.iconAbsoluteWhite,
            )
        }
    }
}

enum class AvatarGroupSize {
    Size20,
    Size24;

    internal fun layout(ellipsisType: AvatarGroupEllipsisType): AvatarGroupLayoutSpec = when (this) {
        Size20 -> AvatarGroupLayoutSpec(
                avatarSize = AvatarSize.Size20,
                avatarLength = 20.dp,
                spacing = 13.dp,
                moreIconSize = 12.dp,
                countTypo = BezierTypo.TextXSmall,
                countTextHorizontalPadding = Size20CountTextPadding,
        )

        Size24 -> AvatarGroupLayoutSpec(
                avatarSize = AvatarSize.Size24,
                avatarLength = 24.dp,
                spacing = 17.dp,
                moreIconSize = 16.dp,
                countTypo = BezierTypo.TextSmall,
                countTextHorizontalPadding = 0.dp,
        )
    }
}

enum class AvatarGroupEllipsisType {
    Icon,
    Count,
}

internal data class AvatarGroupLayoutSpec(
        val avatarSize: AvatarSize,
        val avatarLength: Dp,
        val spacing: Dp,
        val moreIconSize: Dp,
        val countTypo: BezierTypo,
        val countTextHorizontalPadding: Dp,
)

@Composable
private fun AvatarGroupMatrix() {
    val previewPainters: List<Painter> = listOf(
            ColorPainter(Color(0xFFB6CED6)),
            ColorPainter(Color(0xFFD6BFB6)),
            ColorPainter(Color(0xFFB6D6BF)),
            ColorPainter(Color(0xFFCFB6D6)),
            ColorPainter(Color(0xFFD6CCB6)),
    )

    BezierTheme {
        Column(
                modifier = Modifier
                        .background(BezierTheme.colorsV3.surfaceLow)
                        .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            listOf(AvatarGroupSize.Size20, AvatarGroupSize.Size24).forEach { size ->
                listOf(AvatarGroupEllipsisType.Icon, AvatarGroupEllipsisType.Count).forEach { ellipsisType ->
                    Row(
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(8.dp),
                    ) {
                        AvatarGroup(
                                avatars = previewPainters,
                                size = size,
                                ellipsisType = ellipsisType,
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 320)
@Composable
private fun AvatarGroupMatrixPreview() = AvatarGroupMatrix()

@Preview(showBackground = true, widthDp = 320, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun AvatarGroupMatrixDarkPreview() = AvatarGroupMatrix()
