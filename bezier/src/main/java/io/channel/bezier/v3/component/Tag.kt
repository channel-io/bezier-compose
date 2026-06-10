package io.channel.bezier.v3.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.color.BezierSemanticColorV3
import io.channel.bezier.component.BezierText
import io.channel.bezier.icon.CancelSmall
import io.channel.bezier.typography.BezierTypo
import io.channel.bezier.typography.BezierWeight

@Composable
fun Tag(
        label: String,
        modifier: Modifier = Modifier,
        size: TagSize = TagSize.Xsmall,
        color: TagColor = TagColor.Default,
        onDelete: (() -> Unit)? = null,
) {
    val colors = BezierTheme.colorsV3
    val spec = size.spec

    Row(
            modifier = modifier
                    .clip(RoundedCornerShape(TagCornerRadius))
                    .background(color.background(colors))
                    .padding(
                            horizontal = spec.horizontalPadding,
                            vertical = spec.verticalPadding,
                    ),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
                modifier = Modifier.padding(horizontal = TagTextInnerHorizontalPadding),
        ) {
            TagLabel(text = label, size = size, color = colors.textNeutral)
        }
        if (onDelete != null) {
            Box(
                    modifier = Modifier
                            .size(TagCancelIconLength)
                            .clip(CircleShape)
                            .clickable(onClick = onDelete),
            ) {
                Icon(
                        imageVector = BezierIcons.CancelSmall.imageVector,
                        contentDescription = null,
                        tint = colors.textNeutralLight,
                )
            }
        }
    }
}

@Composable
private fun TagLabel(text: String, size: TagSize, color: Color) {
    when (size) {
        TagSize.Xsmall -> BezierText(
                text = text,
                typo = BezierTypo.TextXSmall,
                weight = BezierWeight.Regular,
                color = color,
        )

        TagSize.Small -> BezierText(
                text = text,
                typo = BezierTypo.TextMedium,
                weight = BezierWeight.Regular,
                color = color,
        )

        TagSize.Medium -> Text(
                text = text,
                color = color,
                fontSize = 15.sp,
                lineHeight = 18.sp,
                letterSpacing = (-0.1).sp,
                fontWeight = FontWeight.Normal,
        )

        TagSize.Large -> Text(
                text = text,
                color = color,
                fontSize = 16.sp,
                lineHeight = 20.sp,
                letterSpacing = (-0.1).sp,
                fontWeight = FontWeight.Normal,
        )
    }
}

private val TagCancelIconLength: Dp = 16.dp
private val TagTextInnerHorizontalPadding: Dp = 4.dp
private val TagCornerRadius: Dp = 32.dp

enum class TagSize {
    Xsmall,
    Small,
    Medium,
    Large;

    internal val spec: TagLayoutSpec
        get() = when (this) {
            Xsmall -> TagLayoutSpec(horizontalPadding = 4.dp, verticalPadding = 1.dp)
            Small -> TagLayoutSpec(horizontalPadding = 4.dp, verticalPadding = 2.dp)
            Medium -> TagLayoutSpec(horizontalPadding = 4.dp, verticalPadding = 2.dp)
            Large -> TagLayoutSpec(horizontalPadding = 4.dp, verticalPadding = 3.dp)
        }
}

enum class TagColor {
    Default,
    Red,
    Orange,
    Yellow,
    Olive,
    Green,
    Teal,
    Cobalt,
    Blue,
    Purple,
    Pink,
    Navy;

    @Composable
    internal fun background(colors: BezierSemanticColorV3): Color = when (this) {
        Default -> colors.fillNeutralLight
        Red -> colors.fillAccentRedHeavy
        Orange -> colors.fillAccentOrangeHeavy
        Yellow -> colors.fillAccentYellowHeavy
        Olive -> colors.fillAccentOliveHeavy
        Green -> colors.fillAccentGreenHeavy
        Teal -> colors.fillAccentTealHeavy
        Cobalt -> colors.fillAccentCobaltHeavy
        Blue -> colors.fillAccentBlueHeavy
        Purple -> colors.fillAccentPurpleHeavy
        Pink -> colors.fillAccentPinkHeavy
        Navy -> colors.fillAccentNavyHeavy
    }
}

internal data class TagLayoutSpec(
        val horizontalPadding: Dp,
        val verticalPadding: Dp,
)

@Composable
private fun TagMatrix(onDelete: Boolean) {
    BezierTheme {
        Column(
                modifier = Modifier
                        .background(BezierTheme.colorsV3.surface)
                        .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            TagSize.entries.forEach { size ->
                Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                ) {
                    Box(
                            modifier = Modifier.size(width = 64.dp, height = 26.dp),
                            contentAlignment = Alignment.CenterStart,
                    ) {
                        BezierText(
                                text = size.name.lowercase(),
                                typo = BezierTypo.TextMedium,
                                color = BezierTheme.colorsV3.textNeutral,
                        )
                    }
                    TagColor.entries.forEach { color ->
                        Tag(
                                label = "Tag",
                                size = size,
                                color = color,
                                onDelete = if (onDelete) ({}) else null,
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 1100)
@Composable
private fun TagMatrixPreview() = TagMatrix(onDelete = false)

@Preview(showBackground = true, widthDp = 1100)
@Composable
private fun TagMatrixOnDeletePreview() = TagMatrix(onDelete = true)

@Preview(showBackground = true, widthDp = 1100)
@Preview(showBackground = true, widthDp = 1100, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun TagMatrixDarkPreview() = TagMatrix(onDelete = true)
