package io.channel.bezier.v3.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.component.BezierText
import io.channel.bezier.dimension.BezierFontSize
import io.channel.bezier.dimension.BezierLetterSpacing
import io.channel.bezier.dimension.BezierLineHeight
import io.channel.bezier.icon.Plus
import io.channel.bezier.typography.BezierTypo
import io.channel.bezier.typography.BezierWeight

@Composable
fun Badge(
        label: String,
        modifier: Modifier = Modifier,
        size: BadgeSize = BadgeSize.Xsmall,
        color: BadgeColor = BadgeColor.Default,
        iconSource: BezierIcon? = null,
) {
    val layout = size.layout
    val colorSpec = badgeColorSpec(color)

    Box(
            modifier = modifier
                    .clip(RoundedCornerShape(BadgeCornerRadius))
                    .background(colorSpec.background)
                    .padding(horizontal = layout.horizontalPadding, vertical = layout.verticalPadding),
            contentAlignment = Alignment.Center,
    ) {
        Row(
                horizontalArrangement = Arrangement.spacedBy(BadgeIconTextGap),
                verticalAlignment = Alignment.CenterVertically,
        ) {
            if (iconSource != null) {
                Icon(
                        modifier = Modifier.size(BadgeIconLength),
                        imageVector = iconSource.imageVector,
                        tint = colorSpec.iconColor,
                        contentDescription = null,
                )
            }
            Box(modifier = Modifier.padding(horizontal = layout.textInnerHorizontalPadding)) {
                BadgeText(text = label, size = size, color = colorSpec.textColor)
            }
        }
    }
}

@Composable
private fun BadgeText(text: String, size: BadgeSize, color: Color) {
    when (size) {
        BadgeSize.Xsmall -> BezierText(
                text = text,
                typo = BezierTypo.TextXSmall,
                weight = BezierWeight.Regular,
                color = color,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
        )

        BadgeSize.Small -> BezierText(
                text = text,
                typo = BezierTypo.TextMedium,
                weight = BezierWeight.Regular,
                color = color,
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
        )

        BadgeSize.Medium -> Text(
                text = text,
                style = TextStyle(
                        fontSize = BezierFontSize.Size15,
                        lineHeight = BezierLineHeight.Size18,
                        letterSpacing = BezierLetterSpacing.Tight,
                        fontWeight = FontWeight.Normal,
                        color = color,
                ),
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
        )

        BadgeSize.Large -> Text(
                text = text,
                style = TextStyle(
                        fontSize = BezierFontSize.Size16,
                        lineHeight = BezierLineHeight.Size20,
                        letterSpacing = BezierLetterSpacing.Tight,
                        fontWeight = FontWeight.Normal,
                        color = color,
                ),
                overflow = TextOverflow.Ellipsis,
                maxLines = 1,
        )
    }
}

private val BadgeIconLength: Dp = 16.dp
private val BadgeIconTextGap: Dp = 0.dp
private val BadgeCornerRadius: Dp = 32.dp

enum class BadgeSize {
    Xsmall,
    Small,
    Medium,
    Large;

    internal val layout: BadgeLayoutSpec
        get() = when (this) {
            Xsmall -> BadgeLayoutSpec(
                    horizontalPadding = 4.dp,
                    verticalPadding = 1.dp,
                    textInnerHorizontalPadding = 4.dp,
            )

            Small -> BadgeLayoutSpec(
                    horizontalPadding = 4.dp,
                    verticalPadding = 2.dp,
                    textInnerHorizontalPadding = 4.dp,
            )

            Medium -> BadgeLayoutSpec(
                    horizontalPadding = 4.dp,
                    verticalPadding = 2.dp,
                    textInnerHorizontalPadding = 4.dp,
            )

            Large -> BadgeLayoutSpec(
                    horizontalPadding = 4.dp,
                    verticalPadding = 3.dp,
                    textInnerHorizontalPadding = 4.dp,
            )
        }
}

enum class BadgeColor {
    Default,
    MonochromeLight,
    MonochromeDark,
    Blue,
    Cobalt,
    Teal,
    Green,
    Olive,
    Pink,
    Navy,
    Yellow,
    Orange,
    Red,
    Purple,
}

internal data class BadgeLayoutSpec(
        val horizontalPadding: Dp,
        val verticalPadding: Dp,
        val textInnerHorizontalPadding: Dp,
)

internal data class BadgeColorSpec(
        val background: Color,
        val textColor: Color,
        val iconColor: Color,
)

@Composable
internal fun badgeColorSpec(color: BadgeColor): BadgeColorSpec {
    val colors = BezierTheme.colorsV3
    return when (color) {
        BadgeColor.Default -> BadgeColorSpec(
                background = colors.fillNeutralLight,
                textColor = colors.textNeutral,
                iconColor = colors.textNeutralLight,
        )

        BadgeColor.MonochromeLight -> BadgeColorSpec(
                background = colors.fillNeutralLight,
                textColor = colors.textNeutralLighter,
                iconColor = colors.iconNeutral,
        )

        BadgeColor.MonochromeDark -> BadgeColorSpec(
                background = colors.fillNeutralHeavier,
                textColor = colors.textAbsoluteWhite,
                iconColor = colors.iconAbsoluteWhite,
        )

        BadgeColor.Blue -> BadgeColorSpec(
                background = colors.fillAccentBlueHeavy,
                textColor = colors.textAccentBlue,
                iconColor = colors.iconAccentBlue,
        )

        BadgeColor.Cobalt -> BadgeColorSpec(
                background = colors.fillAccentCobaltHeavy,
                textColor = colors.textAccentCobalt,
                iconColor = colors.iconAccentCobalt,
        )

        BadgeColor.Teal -> BadgeColorSpec(
                background = colors.fillAccentTealHeavy,
                textColor = colors.textAccentTeal,
                iconColor = colors.iconAccentTeal,
        )

        BadgeColor.Green -> BadgeColorSpec(
                background = colors.fillAccentGreenHeavy,
                textColor = colors.textAccentGreen,
                iconColor = colors.iconAccentGreen,
        )

        BadgeColor.Olive -> BadgeColorSpec(
                background = colors.fillAccentOliveHeavy,
                textColor = colors.textAccentOlive,
                iconColor = colors.iconAccentOlive,
        )

        BadgeColor.Pink -> BadgeColorSpec(
                background = colors.fillAccentPinkHeavy,
                textColor = colors.textAccentPink,
                iconColor = colors.iconAccentPink,
        )

        BadgeColor.Navy -> BadgeColorSpec(
                background = colors.fillAccentNavyHeavy,
                textColor = colors.textAccentNavy,
                iconColor = colors.iconAccentNavy,
        )

        BadgeColor.Yellow -> BadgeColorSpec(
                background = colors.fillAccentYellowHeavy,
                textColor = colors.textAccentYellow,
                iconColor = colors.iconAccentYellow,
        )

        BadgeColor.Orange -> BadgeColorSpec(
                background = colors.fillAccentOrangeHeavy,
                textColor = colors.textAccentOrange,
                iconColor = colors.iconAccentOrange,
        )

        BadgeColor.Red -> BadgeColorSpec(
                background = colors.fillAccentRedHeavy,
                textColor = colors.textAccentRed,
                iconColor = colors.iconAccentRed,
        )

        BadgeColor.Purple -> BadgeColorSpec(
                background = colors.fillAccentPurpleHeavy,
                textColor = colors.textAccentPurple,
                iconColor = colors.iconAccentPurple,
        )
    }
}

@Composable
private fun BadgeMatrix(size: BadgeSize, sizeLabel: String) {
    val labelColWidth = 132.dp
    val cellWidth = 132.dp

    BezierTheme {
        Column(
                modifier = Modifier
                        .background(BezierTheme.colorsV3.surface)
                        .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(modifier = Modifier.width(labelColWidth))
                listOf("no icon", "with icon").forEach { headerLabel ->
                    Box(modifier = Modifier.width(cellWidth), contentAlignment = Alignment.CenterStart) {
                        BezierText(
                                text = headerLabel,
                                typo = BezierTypo.TextMedium,
                                color = BezierTheme.colorsV3.textNeutral,
                        )
                    }
                }
            }

            BadgeColor.values().forEachIndexed { idx, badgeColor ->
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Box(modifier = Modifier.width(labelColWidth), contentAlignment = Alignment.CenterStart) {
                        BezierText(
                                text = if (idx == 0) "$sizeLabel — ${badgeColor.name}" else badgeColor.name,
                                typo = BezierTypo.TextMedium,
                                weight = if (idx == 0) BezierWeight.Bold else BezierWeight.Regular,
                                color = BezierTheme.colorsV3.textNeutral,
                        )
                    }
                    Box(modifier = Modifier.width(cellWidth), contentAlignment = Alignment.CenterStart) {
                        Badge(label = "Badge", size = size, color = badgeColor)
                    }
                    Box(modifier = Modifier.width(cellWidth), contentAlignment = Alignment.CenterStart) {
                        Badge(label = "Badge", size = size, color = badgeColor, iconSource = BezierIcons.Plus)
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 600)
@Composable
private fun BadgeMatrixXsmallPreview() = BadgeMatrix(BadgeSize.Xsmall, "xsmall")

@Preview(showBackground = true, widthDp = 600)
@Composable
private fun BadgeMatrixSmallPreview() = BadgeMatrix(BadgeSize.Small, "small")

@Preview(showBackground = true, widthDp = 600)
@Composable
private fun BadgeMatrixMediumPreview() = BadgeMatrix(BadgeSize.Medium, "medium")

@Preview(showBackground = true, widthDp = 600)
@Composable
private fun BadgeMatrixLargePreview() = BadgeMatrix(BadgeSize.Large, "large")

@Preview(showBackground = true, widthDp = 600, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun BadgeMatrixMediumDarkPreview() = BadgeMatrix(BadgeSize.Medium, "medium")
