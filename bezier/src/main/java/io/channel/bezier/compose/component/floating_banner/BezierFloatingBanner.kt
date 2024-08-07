package io.channel.bezier.compose.component.floating_banner

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.component.floating_banner.properties.BezierFloatingBannerActionType
import io.channel.bezier.compose.component.icon_button.BezierIconButton
import io.channel.bezier.compose.component.icon_button.properties.BezierIconButtonColor
import io.channel.bezier.compose.component.icon_button.properties.BezierIconButtonShape
import io.channel.bezier.compose.component.icon_button.properties.BezierIconButtonSize
import io.channel.bezier.compose.component.icon_button.properties.BezierIconButtonVariant
import io.channel.bezier.compose.foundation.ShadowStyle
import io.channel.bezier.compose.foundation.bezierShadow
import io.channel.bezier.icon.InfoFilled

@Composable
fun BezierFloatingBanner(
        icon: BezierIcon,
        description: String,
        actionType: BezierFloatingBannerActionType,
        modifier: Modifier = Modifier,
) {
    val shape = RoundedCornerShape(14.dp)

    Row(
            modifier = modifier
                    .bezierShadow(
                            style = ShadowStyle.Shadow3,
                            shape = shape,
                    )
                    .background(
                            color = BezierTheme.colorSchemes.bgGreyLighter.color,
                            shape = shape,
                    )
                    .padding(8.dp),
    ) {
        Row(
                modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 6.dp),
                horizontalArrangement = Arrangement.spacedBy(6.dp),
        ) {
            Icon(
                    modifier = Modifier
                            .padding(vertical = 6.dp)
                            .size(20.dp),
                    imageVector = icon.imageVector,
                    contentDescription = icon.imageVector.name,
                    tint = BezierTheme.colorSchemes.fgBlackDark.color,
            )

            Text(
                    modifier = Modifier
                            .weight(1f)
                            .padding(vertical = 5.dp),
                    text = description,
                    style = BezierTheme.typography.body2Regular,
                    color = BezierTheme.colorSchemes.fgBlackDarkest.color,
            )
        }

        BezierIconButton(
                icon = actionType.icon,
                size = BezierIconButtonSize.Small,
                variant = BezierIconButtonVariant.Tertiary,
                color = BezierIconButtonColor.LightGrey,
                shape = BezierIconButtonShape.Rectangle,
                onClick = {},
        )
    }
}

@Composable
@Preview(showBackground = true)
fun BezierFloatingBannerPreview() {
    BezierTheme {
        Box(
                modifier = Modifier.background(Color.White),
        ) {
            BezierFloatingBanner(
                    modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp),
                    icon = BezierIcons.InfoFilled,
                    description = "description",
                    actionType = BezierFloatingBannerActionType.CloseButton,
            )
        }
    }
}
