package io.channel.bezier.v3.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.component.BezierText
import io.channel.bezier.icon.Block
import io.channel.bezier.icon.CancelSmall
import io.channel.bezier.icon.CheckCircleFilled
import io.channel.bezier.icon.ChevronSmallRight
import io.channel.bezier.icon.ErrorDiamondFilled
import io.channel.bezier.icon.Info
import io.channel.bezier.icon.Lightbulb
import io.channel.bezier.icon.Limit
import io.channel.bezier.typography.BezierTypo
import io.channel.bezier.typography.BezierWeight

@Composable
fun Banner(
        description: String,
        modifier: Modifier = Modifier,
        color: BannerColor = BannerColor.Default,
        title: String? = null,
        leadingIcon: BezierIcon? = color.defaultIcon,
        onClick: (() -> Unit)? = null,
        onDismiss: (() -> Unit)? = null,
) {
    val colorSpec = bannerColorSpec(color)
    val trailingIcon = when {
        onDismiss != null -> BezierIcons.CancelSmall
        onClick != null -> BezierIcons.ChevronSmallRight
        else -> null
    }

    Row(
            modifier = modifier
                    .clip(RoundedCornerShape(BannerCornerRadius))
                    .background(colorSpec.background)
                    .then(
                            if (onClick != null) {
                                Modifier.clickable(onClick = onClick)
                            } else {
                                Modifier
                            }
                    )
                    .padding(BannerContainerPadding),
            verticalAlignment = Alignment.Top,
    ) {
        if (leadingIcon != null) {
            Box(modifier = Modifier.padding(BannerLeadingIconPadding)) {
                Icon(
                        modifier = Modifier.size(BannerIconLength),
                        imageVector = leadingIcon.imageVector,
                        tint = colorSpec.iconColor,
                        contentDescription = null,
                )
            }
        }

        Column(
                modifier = Modifier
                        .weight(1f)
                        .padding(BannerContentPadding),
                verticalArrangement = Arrangement.spacedBy(BannerContentGap),
        ) {
            if (title != null) {
                BezierText(
                        text = title,
                        typo = BezierTypo.TextMedium,
                        weight = BezierWeight.Bold,
                        color = colorSpec.textColor,
                )
            }
            BezierText(
                    text = description,
                    typo = BezierTypo.TextMedium,
                    weight = BezierWeight.Regular,
                    color = colorSpec.textColor,
            )
        }

        if (trailingIcon != null) {
            Box(
                    modifier = Modifier
                            .size(BannerTrailingSlotLength)
                            .then(
                                    if (onDismiss != null) {
                                        Modifier
                                                .clip(CircleShape)
                                                .clickable(onClick = onDismiss)
                                    } else {
                                        Modifier
                                    }
                            )
                            .padding(BannerTrailingSlotPadding),
                    contentAlignment = Alignment.Center,
            ) {
                Icon(
                        modifier = Modifier.size(BannerIconLength),
                        imageVector = trailingIcon.imageVector,
                        tint = colorSpec.iconColor,
                        contentDescription = null,
                )
            }
        }
    }
}

private val BannerCornerRadius: Dp = 16.dp
private val BannerContainerPadding = PaddingValues(horizontal = 8.dp, vertical = 10.dp)
private val BannerLeadingIconPadding = PaddingValues(start = 4.dp, end = 2.dp, top = 5.dp, bottom = 5.dp)
private val BannerContentPadding = PaddingValues(6.dp)
private val BannerContentGap: Dp = 4.dp
private val BannerTrailingSlotLength: Dp = 30.dp
private val BannerTrailingSlotPadding = PaddingValues(5.dp)
private val BannerIconLength: Dp = 20.dp

enum class BannerColor {
    Default,
    Blue,
    Cobalt,
    Green,
    Orange,
    Red;

    internal val defaultIcon: BezierIcon
        get() = when (this) {
            Default -> BezierIcons.Info
            Blue -> BezierIcons.Limit
            Cobalt -> BezierIcons.Lightbulb
            Green -> BezierIcons.CheckCircleFilled
            Orange -> BezierIcons.ErrorDiamondFilled
            Red -> BezierIcons.Block
        }
}

internal data class BannerColorSpec(
        val background: Color,
        val textColor: Color,
        val iconColor: Color,
)

@Composable
internal fun bannerColorSpec(color: BannerColor): BannerColorSpec {
    val colors = BezierTheme.colorsV3
    return when (color) {
        BannerColor.Default -> BannerColorSpec(
                background = colors.fillNeutralLighter,
                textColor = colors.textNeutralLight,
                iconColor = colors.iconNeutral,
        )

        BannerColor.Blue -> BannerColorSpec(
                background = colors.fillAccentBlue,
                textColor = colors.textAccentBlue,
                iconColor = colors.iconAccentBlue,
        )

        BannerColor.Cobalt -> BannerColorSpec(
                background = colors.fillAccentCobalt,
                textColor = colors.textAccentCobalt,
                iconColor = colors.iconAccentCobalt,
        )

        BannerColor.Green -> BannerColorSpec(
                background = colors.fillAccentGreen,
                textColor = colors.textAccentGreen,
                iconColor = colors.iconAccentGreen,
        )

        BannerColor.Orange -> BannerColorSpec(
                background = colors.fillAccentOrange,
                textColor = colors.textAccentOrange,
                iconColor = colors.iconAccentOrange,
        )

        BannerColor.Red -> BannerColorSpec(
                background = colors.fillAccentRed,
                textColor = colors.textAccentRed,
                iconColor = colors.iconAccentRed,
        )
    }
}

@Composable
private fun BannerMatrix() {
    BezierTheme {
        Column(
                modifier = Modifier
                        .background(BezierTheme.colorsV3.surface)
                        .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            BannerColor.values().forEach { color ->
                Row(
                        horizontalArrangement = Arrangement.spacedBy(12.dp),
                        verticalAlignment = Alignment.Top,
                ) {
                    Banner(
                            modifier = Modifier.width(320.dp),
                            title = "Banner Title",
                            description = "Banner description text goes here.",
                            color = color,
                    )
                    Banner(
                            modifier = Modifier.width(320.dp),
                            title = "Banner Title",
                            description = "Banner description text goes here.",
                            color = color,
                            onClick = {},
                    )
                    Banner(
                            modifier = Modifier.width(320.dp),
                            title = "Banner Title",
                            description = "Banner description text goes here.",
                            color = color,
                            onDismiss = {},
                    )
                    Banner(
                            modifier = Modifier.width(320.dp),
                            title = "Banner Title",
                            description = "Banner description text goes here.",
                            color = color,
                            onClick = {},
                            onDismiss = {},
                    )
                }
            }
        }
    }
}

@Composable
private fun BannerVariantMatrix() {
    BezierTheme {
        Column(
                modifier = Modifier
                        .background(BezierTheme.colorsV3.surface)
                        .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            BannerColor.values().forEach { color ->
                Banner(
                        modifier = Modifier.width(320.dp),
                        description = "Banner description text goes here.",
                        color = color,
                )
                Banner(
                        modifier = Modifier.width(320.dp),
                        title = "Banner Title",
                        description = "Banner description text goes here.",
                        color = color,
                        leadingIcon = null,
                        onClick = {},
                        onDismiss = {},
                )
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 1400)
@Preview(showBackground = true, widthDp = 1400, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun BannerMatrixPreview() = BannerMatrix()

@Preview(showBackground = true, widthDp = 400)
@Preview(showBackground = true, widthDp = 400, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun BannerVariantMatrixPreview() = BannerVariantMatrix()
