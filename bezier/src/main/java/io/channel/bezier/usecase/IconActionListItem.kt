package io.channel.bezier.usecase

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.R
import io.channel.bezier.component.Badge
import io.channel.bezier.component.ListItemContainer
import io.channel.bezier.component.ListItemContainerSize

@Composable
fun IconActionListItem(
        title: String,
        modifier: Modifier = Modifier,
        size: ListItemContainerSize = ListItemContainerSize.M,
        description: String? = null,
        titleColor: Color = BezierTheme.colors.txtBlackDarkest,
        icon: Painter? = null,
        iconColor: Color = BezierTheme.colors.txtBlackDarker,
        showNavigator: Boolean = true,
        content: @Composable () -> Unit = {},
) {
    ListItemContainer(
            modifier = modifier,
            size = size,
            leftContent = icon?.let {
                {
                    Icon(
                            modifier = Modifier.size(24.dp),
                            painter = icon,
                            contentDescription = null,
                            tint = iconColor,
                    )
                }
            },
            centerContent = {
                Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalAlignment = Alignment.CenterVertically,
                ) {
                    Text(
                            modifier = Modifier.weight(1f, false),
                            text = title,
                            fontSize = 16.sp,
                            color = titleColor,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis,
                    )

                    Box {
                        content()
                    }
                }
            },
            rightContent = if (description == null && !showNavigator) {
                null
            } else {
                {
                    Row(
                            horizontalArrangement = Arrangement.spacedBy(4.dp),
                            verticalAlignment = Alignment.CenterVertically,
                    ) {
                        if (description != null) {
                            Text(
                                    modifier = Modifier.weight(1f, false),
                                    text = description,
                                    fontSize = 16.sp,
                                    color = BezierTheme.colors.txtBlackDark,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                            )
                        }

                        if (showNavigator) {
                            Icon(
                                    modifier = Modifier.size(24.dp),
                                    painter = painterResource(id = R.drawable.icon_chevron_small_right),
                                    contentDescription = null,
                                    tint = BezierTheme.colors.txtBlackDark,
                            )
                        }
                    }
                }
            },
    )
}

@Preview(showBackground = true)
@Composable
private fun IconActionListItemWithBadgePreview() {
    IconActionListItem(
            title = "닝겐",
            description = "은 영어로 ningen",
            icon = painterResource(id = R.drawable.icon_person),
            content = { Badge(text = "한국인", color = Badge.Color.Blue) },
    )
}

@Preview(showBackground = true)
@Composable
private fun IconActionListItemOverflowPreview() {
    IconActionListItem(
            title = "자동차 책임배상 보험",
            description = "Kraftfahrzeughaftpflichtversicherung",
            icon = painterResource(id = R.drawable.icon_more),
            content = { Badge(text = "독일어", color = Badge.Color.Cobalt) },
    )
}

@Preview(showBackground = true)
@Composable
private fun IconActionListItemWithoutIconAndNavigator() {
    IconActionListItem(
            title = "닝겐",
            description = "은 영어로 ningen",
            showNavigator = false,
    )
}
