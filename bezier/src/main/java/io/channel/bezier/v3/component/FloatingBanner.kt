package io.channel.bezier.v3.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.dropShadow
import androidx.compose.ui.graphics.shadow.Shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.component.BezierText
import io.channel.bezier.icon.CancelSmall
import io.channel.bezier.icon.ChevronSmallRight
import io.channel.bezier.icon.Plus
import io.channel.bezier.interaction.BezierComponentInteraction
import io.channel.bezier.typography.BezierTypo
import io.channel.bezier.typography.BezierWeight

@Composable
fun FloatingBanner(
        description: String,
        modifier: Modifier = Modifier,
        title: String? = null,
        clickArea: FloatingBannerClickArea = FloatingBannerClickArea.None,
        leadingIcon: (@Composable (iconSize: Dp) -> Unit)? = null,
        onClick: (() -> Unit)? = null,
) {
    val colors = BezierTheme.colorsV3
    val actionIcon = clickArea.actionIcon

    Row(
            modifier = modifier
                    .width(FloatingBannerWidth)
                    .heightIn(min = FloatingBannerMinHeight)
                    .dropShadow(
                            shape = RoundedCornerShape(FloatingBannerCornerRadius),
                            shadow = Shadow(
                                    radius = FloatingBannerShadowRadius,
                                    color = colors.elevationLarge,
                                    spread = FloatingBannerShadowSpread,
                                    offset = DpOffset(0.dp, FloatingBannerShadowOffsetY),
                            ),
                    )
                    .clip(RoundedCornerShape(FloatingBannerCornerRadius))
                    .background(colors.surfaceHighest)
                    .let {
                        if (clickArea == FloatingBannerClickArea.Full && onClick != null) {
                            it.clickable {
                                BezierComponentInteraction.notify("FloatingBannerV3", description)
                                onClick.invoke()
                            }
                        } else {
                            it
                        }
                    }
                    .padding(start = 10.dp, top = 10.dp, end = 8.dp, bottom = 10.dp),
            verticalAlignment = Alignment.Top,
    ) {
        if (leadingIcon != null) {
            Box(
                    modifier = Modifier.padding(start = 2.dp, top = 5.dp, bottom = 5.dp),
                    contentAlignment = Alignment.Center,
            ) {
                leadingIcon(FloatingBannerIconLength)
            }
        }

        Column(
                modifier = Modifier
                        .weight(1f)
                        .padding(6.dp),
                verticalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            if (title != null) {
                BezierText(
                        text = title,
                        typo = BezierTypo.TextMedium,
                        modifier = Modifier.fillMaxWidth(),
                        weight = BezierWeight.Bold,
                        color = colors.textNeutralLight,
                )
            }
            BezierText(
                    text = description,
                    typo = BezierTypo.TextMedium,
                    modifier = Modifier.fillMaxWidth(),
                    weight = BezierWeight.Regular,
                    color = colors.textNeutralLight,
            )
        }

        if (actionIcon != null) {
            Box(
                    modifier = Modifier
                            .size(FloatingBannerActionSlotSize)
                            .let {
                                if (clickArea == FloatingBannerClickArea.ActionIcon && onClick != null) {
                                    it
                                            .clip(CircleShape)
                                            .clickable {
                                                BezierComponentInteraction.notify("FloatingBannerV3", actionIcon.imageVector.name)
                                                onClick.invoke()
                                            }
                                } else {
                                    it
                                }
                            }
                            .padding(5.dp),
                    contentAlignment = Alignment.Center,
            ) {
                Icon(
                        modifier = Modifier.size(FloatingBannerIconLength),
                        imageVector = actionIcon.imageVector,
                        tint = colors.iconNeutral,
                        contentDescription = null,
                )
            }
        }
    }
}

enum class FloatingBannerClickArea {
    None,
    Full,
    ActionIcon;

    internal val actionIcon: BezierIcon?
        get() = when (this) {
            None -> null
            Full -> BezierIcons.ChevronSmallRight
            ActionIcon -> BezierIcons.CancelSmall
        }
}

private val FloatingBannerWidth: Dp = 320.dp
private val FloatingBannerMinHeight: Dp = 30.dp
private val FloatingBannerCornerRadius: Dp = 16.dp
private val FloatingBannerShadowRadius: Dp = 20.dp
private val FloatingBannerShadowSpread: Dp = 0.dp
private val FloatingBannerShadowOffsetY: Dp = 4.dp
private val FloatingBannerIconLength: Dp = 20.dp
private val FloatingBannerActionSlotSize: Dp = 30.dp

@Composable
private fun FloatingBannerMatrix() {
    BezierTheme {
        Column(
                modifier = Modifier
                        .background(BezierTheme.colorsV3.surface)
                        .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            FloatingBannerClickArea.entries.forEach { clickArea ->
                FloatingBanner(
                        title = "Banner Title",
                        description = "Banner description text goes here.",
                        clickArea = clickArea,
                        onClick = {},
                )
                FloatingBanner(
                        title = "Banner Title",
                        description = "Banner description text goes here.",
                        clickArea = clickArea,
                        leadingIcon = { iconSize ->
                            Icon(
                                    modifier = Modifier.size(iconSize),
                                    imageVector = BezierIcons.Plus.imageVector,
                                    tint = BezierTheme.colorsV3.iconNeutral,
                                    contentDescription = null,
                            )
                        },
                        onClick = {},
                )
            }
            FloatingBanner(
                    description = "Banner description text goes here.",
                    clickArea = FloatingBannerClickArea.None,
            )
        }
    }
}

@Preview(showBackground = true, widthDp = 400)
@Preview(showBackground = true, widthDp = 400, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun FloatingBannerMatrixPreview() = FloatingBannerMatrix()
