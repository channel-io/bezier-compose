package io.channel.bezier.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.Indication
import androidx.compose.foundation.LocalIndication
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.R

@Composable
fun Button(
        size: ButtonSize,
        type: ButtonType,
        color: ButtonColor,
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        indication: Indication? = LocalIndication.current,
        text: String? = null,
        leftIcon: (@Composable (iconSize: Dp) -> Unit)? = null,
        rightIcon: (@Composable (iconSize: Dp) -> Unit)? = null,
) {
    val isOnlyIcon = (leftIcon != null || rightIcon != null) && text == null

    Row(
            modifier = modifier
                    .clip(
                            shape = if (type == ButtonType.Floating) {
                                RoundedCornerShape(50)
                            } else {
                                RoundedCornerShape(size.radius)
                            },
                    )
                    .graphicsLayer(
                            alpha = if (enabled) 1f else 0.4f,
                    )
                    .heightIn(min = size.height)
                    .background(
                            color = color.getBackgroundColor(type),
                    )
                    .clickable(
                            interactionSource = interactionSource,
                            indication = indication,
                            enabled = enabled,
                    ) {
                        onClick.invoke()
                    }
                    .padding(
                            horizontal = size.horizontalPadding + if (isOnlyIcon) 0.dp else size.extraPadding,
                            vertical = size.verticalPadding,
                    ),
            horizontalArrangement = Arrangement.spacedBy(
                    space = size.contentPadding,
                    alignment = Alignment.CenterHorizontally,
            ),
            verticalAlignment = Alignment.CenterVertically,
    ) {
        if (leftIcon != null) {
            leftIcon(size.iconSize)
        }

        if (text != null) {
            Text(
                    modifier = Modifier
                            .padding(horizontal = 2.dp),
                    text = text,
                    color = color.getTextColor(type),
                    fontSize = size.fontSize,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
            )
        }

        if (rightIcon != null) {
            rightIcon(size.iconSize)
        }
    }
}

@Composable
fun Button(
        size: ButtonSize,
        type: ButtonType,
        color: ButtonColor,
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        indication: Indication? = LocalIndication.current,
        text: String? = null,
) {
    Button(
            size = size,
            type = type,
            color = color,
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            interactionSource = interactionSource,
            indication = indication,
            text = text,
            leftIconPainter = null,
            rightIconPainter = null,
    )
}

@Composable
fun Button(
        size: ButtonSize,
        type: ButtonType,
        color: ButtonColor,
        onClick: () -> Unit,
        modifier: Modifier = Modifier,
        enabled: Boolean = true,
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        indication: Indication? = LocalIndication.current,
        text: String? = null,
        leftIconPainter: Painter? = null,
        rightIconPainter: Painter? = null,
) {
    Button(
            size = size,
            type = type,
            color = color,
            onClick = onClick,
            modifier = modifier,
            enabled = enabled,
            interactionSource = interactionSource,
            indication = indication,
            text = text,
            leftIcon = leftIconPainter?.let {
                { iconSize ->
                    Icon(
                            modifier = Modifier.size(iconSize),
                            painter = leftIconPainter,
                            tint = color.getIconColor(type),
                            contentDescription = null,
                    )
                }
            },
            rightIcon = rightIconPainter?.let {
                { iconSize ->
                    Icon(
                            modifier = Modifier.size(iconSize),
                            painter = rightIconPainter,
                            tint = color.getIconColor(type),
                            contentDescription = null,
                    )
                }
            },
    )
}

enum class ButtonSize(
        val height: Dp,
        val radius: Dp,
        val fontSize: TextUnit,
        val iconSize: Dp,
        val horizontalPadding: Dp,
        val verticalPadding: Dp,
        val contentPadding: Dp,
        val extraPadding: Dp,
) {
    XS(
            height = 24.dp,
            radius = 6.dp,
            fontSize = 13.sp,
            iconSize = 16.dp,
            horizontalPadding = 3.dp,
            verticalPadding = 4.dp,
            contentPadding = 2.dp,
            extraPadding = 3.dp,
    ),
    S(
            height = 30.dp,
            radius = 8.dp,
            fontSize = 14.sp,
            iconSize = 20.dp,
            horizontalPadding = 5.dp,
            verticalPadding = 5.dp,
            contentPadding = 2.dp,
            extraPadding = 1.dp,
    ),
    M(
            height = 40.dp,
            radius = 12.dp,
            fontSize = 15.sp,
            iconSize = 24.dp,
            horizontalPadding = 8.dp,
            verticalPadding = 8.dp,
            contentPadding = 2.dp,
            extraPadding = 0.dp,
    ),
    L(
            height = 44.dp,
            radius = 12.dp,
            fontSize = 16.sp,
            iconSize = 24.dp,
            horizontalPadding = 10.dp,
            verticalPadding = 10.dp,
            contentPadding = 3.dp,
            extraPadding = 0.dp,
    ),
    XL(
            height = 54.dp,
            radius = 16.dp,
            fontSize = 16.sp,
            iconSize = 24.dp,
            horizontalPadding = 15.dp,
            verticalPadding = 15.dp,
            contentPadding = 4.dp,
            extraPadding = (-3).dp,
    ),
}

enum class ButtonType {
    Primary,
    Secondary,
    Tertiary,
    Floating,
}

enum class ButtonColor {
    Blue,
    Red,
    Cobalt,
    Green,
    MonochromeLight,
    MonochromeDark,
    Orange,
    AbsoluteWhite;

    @Composable
    fun getBackgroundColor(type: ButtonType): Color {
        return when (type) {
            ButtonType.Primary -> {
                when (this) {
                    Blue -> BezierTheme.colorsV3.fillAccentBlueHeavier
                    Red -> BezierTheme.colorsV3.fillAccentRedHeavier
                    Cobalt -> BezierTheme.colorsV3.fillAccentCobaltHeavier
                    Green -> BezierTheme.colorsV3.fillAccentGreenHeavier
                    MonochromeLight -> BezierTheme.colorsV3.fillNeutralLight
                    MonochromeDark -> BezierTheme.colorsV3.fillNeutralHeaviest
                    AbsoluteWhite -> BezierTheme.colorsV3.fillAbsoluteWhiteTransparent
                    Orange -> BezierTheme.colorsV3.fillAccentOrangeHeavier
                }
            }

            ButtonType.Floating -> {
                when (this) {
                    Blue -> BezierTheme.colorsV3.fillAccentBlueHeavier
                    Red -> BezierTheme.colorsV3.fillAccentRedHeavier
                    Cobalt -> BezierTheme.colorsV3.fillAccentCobaltHeavier
                    Green -> BezierTheme.colorsV3.fillAccentGreenHeavier
                    MonochromeLight, MonochromeDark -> BezierTheme.colorsV3.fillBright
                    AbsoluteWhite -> BezierTheme.colorsV3.fillAbsoluteWhiteTransparent
                    Orange -> BezierTheme.colorsV3.fillAccentOrangeHeavier
                }
            }

            ButtonType.Secondary -> {
                when (this) {
                    Blue -> BezierTheme.colorsV3.fillAccentBlue
                    Red -> BezierTheme.colorsV3.fillAccentRed
                    Cobalt -> BezierTheme.colorsV3.fillAccentCobalt
                    Green -> BezierTheme.colorsV3.fillAccentGreen
                    MonochromeLight, MonochromeDark -> BezierTheme.colorsV3.fillNeutralLight
                    AbsoluteWhite -> BezierTheme.colorsV3.fillAbsoluteWhiteTransparent
                    Orange -> BezierTheme.colorsV3.fillAccentOrange
                }
            }

            ButtonType.Tertiary -> BezierTheme.colorsV3.fillAbsoluteWhiteTransparent
        }
    }

    @Composable
    fun getTextColor(type: ButtonType): Color {
        return when (type) {
            ButtonType.Primary, ButtonType.Floating -> {
                when (this) {
                    MonochromeDark -> BezierTheme.colorsV3.textAbsoluteWhite
                    else -> BezierTheme.colorsV3.textAbsoluteWhite
                }
            }

            ButtonType.Secondary, ButtonType.Tertiary -> {
                when (this) {
                    Blue -> BezierTheme.colorsV3.textAccentBlue
                    Red -> BezierTheme.colorsV3.textAccentRed
                    Cobalt -> BezierTheme.colorsV3.textAccentCobalt
                    Green -> BezierTheme.colorsV3.textAccentGreen
                    MonochromeLight -> BezierTheme.colorsV3.textNeutralLight
                    MonochromeDark -> BezierTheme.colorsV3.textNeutral
                    AbsoluteWhite -> BezierTheme.colorsV3.textAbsoluteWhite
                    Orange -> BezierTheme.colorsV3.textAccentOrange
                }
            }
        }
    }

    @Composable
    fun getIconColor(type: ButtonType): Color {

        return when (type) {
            ButtonType.Primary, ButtonType.Floating -> {
                when (this) {
                    MonochromeDark -> BezierTheme.colorsV3.iconAbsoluteWhite
                    else -> BezierTheme.colorsV3.iconAbsoluteWhite
                }
            }

            ButtonType.Secondary, ButtonType.Tertiary -> {
                when (this) {
                    Blue -> BezierTheme.colorsV3.iconAccentBlue
                    Red -> BezierTheme.colorsV3.iconAccentRed
                    Cobalt -> BezierTheme.colorsV3.iconAccentCobalt
                    Green -> BezierTheme.colorsV3.iconAccentGreen
                    MonochromeLight -> BezierTheme.colorsV3.iconNeutral
                    MonochromeDark -> BezierTheme.colorsV3.iconNeutralHeavy
                    AbsoluteWhite -> BezierTheme.colorsV3.iconAbsoluteWhite
                    Orange -> BezierTheme.colorsV3.iconAccentOrange
                }
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 1500)
@Preview(
        showBackground = true,
        widthDp = 1500,
        uiMode = UI_MODE_NIGHT_YES,
        backgroundColor = 0x000000,
)
@Composable
fun ButtonColorAndTypePreview() {
    LazyVerticalGrid(
            modifier = Modifier
                    .background(
                            color = BezierTheme.colorsV3.surfaceLow,
                    )
                    .padding(10.dp),
            columns = GridCells.Fixed(ButtonColor.values().size),
    ) {
        items(ButtonColor.values()) {
            Button(
                    modifier = Modifier
                            .padding(bottom = 10.dp)
                            .wrapContentSize(),
                    size = ButtonSize.L,
                    type = ButtonType.Primary,
                    color = it,
                    onClick = {},
                    text = "Get started",
                    leftIconPainter = painterResource(id = R.drawable.icon_cancel),
                    rightIconPainter = painterResource(id = R.drawable.icon_check_bold),
            )
        }

        items(ButtonColor.values()) {
            Button(
                    modifier = Modifier
                            .padding(bottom = 10.dp)
                            .wrapContentSize(),
                    size = ButtonSize.L,
                    type = ButtonType.Secondary,
                    color = it,
                    onClick = {},
                    text = "Get started",
                    leftIconPainter = painterResource(id = R.drawable.icon_cancel),
                    rightIconPainter = painterResource(id = R.drawable.icon_check_bold),
            )
        }

        items(ButtonColor.values()) {
            Button(
                    modifier = Modifier
                            .padding(bottom = 10.dp)
                            .wrapContentSize(),
                    size = ButtonSize.L,
                    type = ButtonType.Tertiary,
                    color = it,
                    onClick = {},
                    text = "Get started",
                    leftIconPainter = painterResource(id = R.drawable.icon_cancel),
                    rightIconPainter = painterResource(id = R.drawable.icon_check_bold),
            )
        }

        items(ButtonColor.values()) {
            Button(
                    modifier = Modifier
                            .padding(bottom = 10.dp)
                            .wrapContentSize(),
                    size = ButtonSize.L,
                    type = ButtonType.Floating,
                    color = it,
                    onClick = {},
                    text = "Get started",
                    leftIconPainter = painterResource(id = R.drawable.icon_cancel),
                    rightIconPainter = painterResource(id = R.drawable.icon_check_bold),
            )
        }
    }
}

@Preview(showBackground = true, widthDp = 800)
@Composable
fun ButtonSizeAndTypePreview() {
    Row(
            modifier = Modifier
                    .background(
                            color = BezierTheme.colorsV3.surfaceLow,
                    )
                    .padding(10.dp),
    ) {
        Column(
                modifier = Modifier.padding(end = 10.dp),
        ) {
            ButtonSize.values().forEach { size ->
                Button(
                        modifier = Modifier
                                .padding(bottom = 10.dp)
                                .wrapContentSize(),
                        size = size,
                        type = ButtonType.Primary,
                        color = ButtonColor.Blue,
                        onClick = {},
                        text = "Get started",
                        leftIconPainter = painterResource(id = R.drawable.icon_cancel),
                        rightIconPainter = painterResource(id = R.drawable.icon_check_bold),
                )
            }
        }

        Column(
                modifier = Modifier.padding(end = 10.dp),
        ) {
            ButtonSize.values().forEach { size ->
                Button(
                        modifier = Modifier
                                .padding(bottom = 10.dp)
                                .wrapContentSize(),
                        size = size,
                        type = ButtonType.Secondary,
                        color = ButtonColor.Blue,
                        onClick = {},
                        text = "Get started",
                        leftIconPainter = painterResource(id = R.drawable.icon_cancel),
                        rightIconPainter = painterResource(id = R.drawable.icon_check_bold),
                )
            }
        }

        Column(
                modifier = Modifier.padding(end = 10.dp),
        ) {
            ButtonSize.values().forEach { size ->
                Button(
                        modifier = Modifier
                                .padding(bottom = 10.dp)
                                .wrapContentSize(),
                        size = size,
                        type = ButtonType.Floating,
                        color = ButtonColor.Blue,
                        onClick = {},
                        text = "Get started",
                        leftIconPainter = painterResource(id = R.drawable.icon_cancel),
                        rightIconPainter = painterResource(id = R.drawable.icon_check_bold),
                )
            }
        }

        Column(
                modifier = Modifier.padding(end = 10.dp),
        ) {
            ButtonSize.values().forEach { size ->
                Button(
                        modifier = Modifier
                                .padding(bottom = 10.dp)
                                .wrapContentSize(),
                        size = size,
                        type = ButtonType.Tertiary,
                        color = ButtonColor.Blue,
                        onClick = {},
                        text = "Get started",
                        leftIconPainter = painterResource(id = R.drawable.icon_cancel),
                        rightIconPainter = painterResource(id = R.drawable.icon_check_bold),
                )
            }
        }
    }
}

@Preview
@Composable
fun ButtonFillMaxWidthPreview() {
    Column(
            modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(
                    space = 10.dp,
                    alignment = Alignment.CenterVertically,
            ),
            horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(
                modifier = Modifier.fillMaxWidth(),
                size = ButtonSize.L,
                type = ButtonType.Primary,
                color = ButtonColor.Blue,
                onClick = { },
                text = "Someting spaecial",
                leftIconPainter = painterResource(id = R.drawable.icon_lock),
        )

        Button(
                size = ButtonSize.L,
                type = ButtonType.Primary,
                color = ButtonColor.Blue,
                onClick = { },
                text = "Someting spaecial",
                leftIconPainter = painterResource(id = R.drawable.icon_lock),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonEnabledPreview() {
    Column(
            modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(
                    space = 10.dp,
                    alignment = Alignment.CenterVertically,
            ),
            horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(
                size = ButtonSize.L,
                type = ButtonType.Primary,
                color = ButtonColor.Blue,
                enabled = true,
                onClick = { },
                text = "Someting spaecial",
                leftIconPainter = painterResource(id = R.drawable.icon_lock),
        )

        Button(
                size = ButtonSize.L,
                type = ButtonType.Primary,
                color = ButtonColor.Blue,
                onClick = { },
                enabled = false,
                text = "Someting spaecial",
                leftIconPainter = painterResource(id = R.drawable.icon_lock),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonOnlyIconPreview() {
    Column(
            modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(
                    space = 10.dp,
                    alignment = Alignment.CenterVertically,
            ),
            horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(
                size = ButtonSize.XS,
                type = ButtonType.Primary,
                color = ButtonColor.Blue,
                enabled = true,
                onClick = { },
                leftIconPainter = painterResource(id = R.drawable.icon_apps),
        )
        Button(
                size = ButtonSize.S,
                type = ButtonType.Primary,
                color = ButtonColor.Blue,
                enabled = true,
                onClick = { },
                leftIconPainter = painterResource(id = R.drawable.icon_apps),
        )
        Button(
                size = ButtonSize.M,
                type = ButtonType.Primary,
                color = ButtonColor.Blue,
                enabled = true,
                onClick = { },
                leftIconPainter = painterResource(id = R.drawable.icon_apps),
        )
        Button(
                size = ButtonSize.L,
                type = ButtonType.Primary,
                color = ButtonColor.Blue,
                enabled = true,
                onClick = { },
                leftIconPainter = painterResource(id = R.drawable.icon_apps),
        )

        Button(
                size = ButtonSize.XL,
                type = ButtonType.Primary,
                color = ButtonColor.Blue,
                enabled = true,
                onClick = { },
                leftIconPainter = painterResource(id = R.drawable.icon_apps),
        )
    }
}
