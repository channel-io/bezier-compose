package io.channel.bezier.compose.component.inner_banner

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.component.icon_button.BezierIconButton
import io.channel.bezier.compose.component.icon_button.properties.BezierIconButtonColor
import io.channel.bezier.compose.component.icon_button.properties.BezierIconButtonShape
import io.channel.bezier.compose.component.icon_button.properties.BezierIconButtonSize
import io.channel.bezier.compose.component.icon_button.properties.BezierIconButtonVariant
import io.channel.bezier.compose.component.inner_banner.properties.BezierInnerBannerActionType
import io.channel.bezier.compose.component.inner_banner.properties.BezierInnerBannerSemantic

@Composable
fun BezierInnerBanner(
        description: String,
        semantic: BezierInnerBannerSemantic,
        actionType: BezierInnerBannerActionType,
        modifier: Modifier = Modifier,
        title: String? = null,
) {
    BezierInnerBanner(
            icon = semantic.defaultIcon,
            description = description,
            semantic = semantic,
            actionType = actionType,
            modifier = modifier,
            title = title,
    )
}

@Composable
fun BezierInnerBanner(
        icon: BezierIcon,
        description: String,
        semantic: BezierInnerBannerSemantic,
        actionType: BezierInnerBannerActionType,
        modifier: Modifier = Modifier,
        title: String? = null,
) {
    val backgroundColor = semantic.backgroundColor().color
    val contentColor = semantic.contentColor().color

    Row(
            modifier = modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(14.dp))
                    .background(backgroundColor)
                    .padding(start = 12.dp, end = 6.dp, top = 8.dp, bottom = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(6.dp),
    ) {
        Icon(
                modifier = Modifier
                        .padding(top = 6.dp)
                        .size(20.dp),
                imageVector = icon.imageVector, contentDescription = null, tint = contentColor,
        )
        Column(
                modifier = Modifier
                        .weight(1f)
                        .padding(top = 5.dp, bottom = 5.dp, end = 6.dp),
                verticalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            if (title != null) {
                Text(
                        text = title,
                        style = BezierTheme.typography.body2SemiBold,
                        color = contentColor,
                )
            }

            Text(
                    text = description,
                    style = BezierTheme.typography.body2Regular,
                    color = contentColor,
            )
        }


        BezierIconButton(
                icon = actionType.icon,
                size = BezierIconButtonSize.Small,
                color = BezierIconButtonColor.LightGrey,
                shape = BezierIconButtonShape.Rectangle,
                variant = BezierIconButtonVariant.Tertiary,
                onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun BezierInnerBannerSemanticPreview() {
    BezierTheme {
        Column(
                modifier = Modifier.padding(4.dp),
                verticalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            BezierInnerBannerSemantic.entries.forEach { semantic ->
                BezierInnerBanner(
                        description = "description",
                        semantic = semantic,
                        actionType = BezierInnerBannerActionType.CloseButton,
                        title = "title",
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun BezierInnerBannerActionTypePreview() {
    BezierTheme {
        Column(
                modifier = Modifier.padding(4.dp),
                verticalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            BezierInnerBannerActionType.entries.forEach { actionType ->
                BezierInnerBanner(
                        description = "description",
                        semantic = BezierInnerBannerSemantic.Info,
                        actionType = actionType,
                        title = "title",
                )
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun BezierInnerBannerNoTitlePreview() {
    BezierTheme {
        Column(
                modifier = Modifier.padding(4.dp),
                verticalArrangement = Arrangement.spacedBy(4.dp),
        ) {
            BezierInnerBanner(
                    description = "description",
                    semantic = BezierInnerBannerSemantic.Info,
                    actionType = BezierInnerBannerActionType.CloseButton,
            )
        }
    }
}
