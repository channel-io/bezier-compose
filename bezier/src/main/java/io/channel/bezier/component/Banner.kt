package io.channel.bezier.component

import androidx.annotation.ColorRes
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.takeOrElse
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.R

@Composable
fun Banner(
    type: BannerType,
    description: AnnotatedString,
    modifier: Modifier = Modifier,
    title: String? = null,
    icon: Painter? = null,
    iconColor: Color = Color.Unspecified,
    onClick: (() -> Unit)? = null,
    onRemove: (() -> Unit)? = null,
    content: (@Composable () -> Unit)? = null,
) {
    BannerLayout(
            type = type,
            description = {
                Text(
                        text = description,
                        color = colorResource(id = type.descriptionColor),
                        fontSize = 14.sp,
                )
            },
            modifier = modifier,
            title = title,
            icon = icon,
            iconColor = iconColor,
            onClick = onClick,
            onRemove = onRemove,
            content = content,
    )
}

@Composable
fun Banner(
    type: BannerType,
    description: String,
    modifier: Modifier = Modifier,
    title: String? = null,
    icon: Painter? = null,
    iconColor: Color = Color.Unspecified,
    onClick: (() -> Unit)? = null,
    onRemove: (() -> Unit)? = null,
    content: (@Composable () -> Unit)? = null,
) {
    BannerLayout(
            type = type,
            description = {
                Text(
                        text = description,
                        color = colorResource(id = type.descriptionColor),
                        fontSize = 14.sp,
                )
            },
            modifier = modifier,
            title = title,
            icon = icon,
            iconColor = iconColor,
            onClick = onClick,
            onRemove = onRemove,
            content = content,
    )
}

@Composable
private fun BannerLayout(
    type: BannerType,
    description: @Composable () -> Unit,
    modifier: Modifier,
    title: String?,
    icon: Painter?,
    iconColor: Color,
    onClick: (() -> Unit)?,
    onRemove: (() -> Unit)?,
    content: (@Composable () -> Unit)?,
) {
    Row(
            modifier = modifier
                    .widthIn(
                            max = if (type == BannerType.Floating) {
                                460.dp
                            } else {
                                Dp.Unspecified
                            }
                    )
                    .shadow(
                            elevation = type.elevation,
                            clip = true,
                            shape = RoundedCornerShape(16.dp),
                    )
                    .background(colorResource(id = type.backgroundColor))
                    .let {
                        if (onClick != null) {
                            it.clickable(onClick = onClick)
                        } else {
                            it
                        }
                    }
                    .padding(vertical = 10.dp, horizontal = 8.dp)
    ) {
        if (icon != null) {
            Icon(
                    modifier = Modifier
                            .padding(start = 6.dp, top = 5.dp, bottom = 5.dp)
                            .size(20.dp),
                    painter = icon,
                    tint = iconColor.takeOrElse { BezierTheme.colors.txtBlackDark },
                    contentDescription = null,
            )
        }

        Column(
                modifier = Modifier
                        .padding(6.dp)
                        .weight(1F),
                verticalArrangement = Arrangement.spacedBy(4.dp)
        ) {
            if (type == BannerType.Inner && title != null) {
                Text(
                        text = title,
                        color = BezierTheme.colors.txtBlackDarker,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                )
            }

            description()
        }

        if (type == BannerType.Inner && content != null) {
            Box(
                    modifier = Modifier
                            .padding(start = 4.dp, end = 6.dp),
            ) {
                content()
            }
        }


        if (onRemove != null) {
            Icon(
                    modifier = Modifier
                            .size(30.dp)
                            .clickable(
                                    interactionSource = remember { MutableInteractionSource() },
                                    indication = null,
                                    onClick = onRemove,
                            )
                            .padding(5.dp),
                    painter = painterResource(id = R.drawable.icon_cancel_small),
                    tint = BezierTheme.colors.txtBlackDark,
                    contentDescription = null,
            )
        } else if (onClick != null) {
            Icon(
                    modifier = Modifier
                            .size(30.dp)
                            .padding(5.dp),
                    painter = painterResource(id = R.drawable.icon_chevron_small_right),
                    tint = BezierTheme.colors.txtBlackDark,
                    contentDescription = null,
            )
        }
    }
}

enum class BannerType(
        @ColorRes val backgroundColor: Int,
        val elevation: Dp,
        @ColorRes val descriptionColor: Int,
) {
    Inner(
            backgroundColor = R.color.bg_black_lightest,
            elevation = 0.dp,
            descriptionColor = R.color.txt_black_darker,
    ),
    Floating(
            backgroundColor = R.color.bg_grey_lighter,
            elevation = 20.dp,
            descriptionColor = R.color.txt_black_darkest,
    ),
    Card(
            backgroundColor = R.color.bg_white_low,
            elevation = 6.dp,
            descriptionColor = R.color.txt_black_darkest,
    ),
}

@Preview(showBackground = true)
@Composable
private fun FloatingBannerPreview() {
    Banner(
            modifier = Modifier.padding(10.dp),
            type = BannerType.Floating,
            title = null,
            description = "componet ia properies, parent cmobil iespetc",
            icon = painterResource(id = R.drawable.icon_lock),
            iconColor = BezierTheme.colors.txtBlackDark,
            onRemove = {},
    )
}

@Preview(showBackground = true)
@Composable
private fun CardBannerPreview() {
    Banner(
            modifier = Modifier.padding(10.dp),
            type = BannerType.Card,
            title = null,
            description = "componet ia properies, parent cmobil iespetc",
            icon = painterResource(id = R.drawable.icon_lock),
            iconColor = BezierTheme.colors.txtBlackDark,
            onRemove = {},
    )
}

@Preview(showBackground = true)
@Composable
private fun InnerBannerPreview() {
    Banner(
            modifier = Modifier
                    .padding(10.dp),
            type = BannerType.Inner,
            title = "componet ia properies, palent",
            description = "shape viw imlaouy",
            icon = painterResource(id = R.drawable.icon_lock),
            iconColor = BezierTheme.colors.txtBlackDark,
            onRemove = {},
    ) {
        Box(
                modifier = Modifier
                        .size(64.dp, 52.dp)
                        .background(
                                color = BezierTheme.colors.bgtxtBlueNormal,
                        ),
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun InnerBannerWithoutTitlePreview() {
    Banner(
            modifier = Modifier
                    .padding(10.dp),
            type = BannerType.Inner,
            title = null,
            description = "shape viw imlaouy",
            icon = painterResource(id = R.drawable.icon_lock),
            iconColor = BezierTheme.colors.txtBlackDark,
            onRemove = {},
    )
}


@Preview(showBackground = true)
@Composable
private fun BannerOnRemovePreview() {
    var visibleState by remember { mutableStateOf(true) }
    Column(
            modifier = Modifier
                    .fillMaxWidth()
    ) {
        Button(
                modifier = Modifier
                        .align(Alignment.CenterHorizontally),
                onClick = {
                    visibleState = true
                }
        ) {
            Text(text = "원복")
        }

        Banner(
                modifier = Modifier
                        .padding(10.dp)
                        .graphicsLayer {
                            alpha = if (visibleState) 1f else 0f
                        },
                type = BannerType.Inner,
                title = "componet ia properies, palent",
                description = "shape viw imlaouy",
                icon = painterResource(id = R.drawable.icon_lock),
                iconColor = BezierTheme.colors.txtBlackDark,
                onRemove = { visibleState = false },
        ) {
            Box(
                    modifier = Modifier
                            .size(64.dp, 52.dp)
                            .background(
                                    color = BezierTheme.colors.bgtxtBlueNormal,
                            ),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun BannerOnClickPreview() {
    Column(
            modifier = Modifier
                    .fillMaxWidth()
    ) {
        Banner(
                modifier = Modifier.padding(10.dp),
                type = BannerType.Inner,
                title = "componet ia properies, palent",
                description = "shape viw imlaouy",
                icon = painterResource(id = R.drawable.icon_lock),
                iconColor = BezierTheme.colors.txtBlackDark,
                onClick = {},
        ) {
            Box(
                    modifier = Modifier
                            .size(64.dp, 52.dp)
                            .background(
                                    color = BezierTheme.colors.bgtxtBlueNormal,
                            ),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun BannerOnClickOnRemovePreview() {
    Column(
            modifier = Modifier
                    .fillMaxWidth()
    ) {
        Banner(
                modifier = Modifier.padding(10.dp),
                type = BannerType.Inner,
                title = "componet ia properies, palent",
                description = "shape viw imlaouy",
                icon = painterResource(id = R.drawable.icon_lock),
                iconColor = BezierTheme.colors.txtBlackDark,
                onClick = {},
                onRemove = {},
        ) {
            Box(
                    modifier = Modifier
                            .size(64.dp, 52.dp)
                            .background(
                                    color = BezierTheme.colors.bgtxtBlueNormal,
                            ),
            )
        }
    }
}
