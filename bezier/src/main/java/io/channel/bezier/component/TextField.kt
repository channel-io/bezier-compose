package io.channel.bezier.component

import androidx.annotation.ColorRes
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.R
import io.channel.bezier.icon.BookEditing
import io.channel.bezier.icon.CancelCircleFilled
import io.channel.bezier.icon.ChevronDown
import io.channel.bezier.icon.Search
import io.channel.bezier.icon.View
import io.channel.bezier.icon.ViewOff

val TextFieldOuterBorderWidth = 3.dp
val TextFieldOuterBorderRadius = 8.dp + TextFieldOuterBorderWidth
private val InnerBorderWidth = 1.dp
private val InnerBorderRadius = 8.dp

@Composable
fun TextField(
        value: TextFieldValue,
        onValueChange: (TextFieldValue) -> Unit,
        modifier: Modifier = Modifier,
        type: TextFieldType = TextFieldType.Primary,
        size: TextFieldSize = TextFieldSize.M,
        placeholder: (@Composable () -> Unit)? = null,
        leftContent: (@Composable () -> Unit)? = null,
        rightContent: (@Composable () -> Unit)? = null,
        hasError: Boolean = false,
        enabled: Boolean = true,
        normalAlphaRegardlessOfEnabledState: Boolean = false,
        readOnly: Boolean = false,
        textStyle: TextStyle = TextStyle.Default,
        keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
        keyboardActions: KeyboardActions = KeyboardActions.Default,
        singleLine: Boolean = false,
        maxLines: Int = Int.MAX_VALUE,
        visualTransformation: VisualTransformation = VisualTransformation.None,
        onTextLayout: (TextLayoutResult) -> Unit = {},
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        cursorBrush: Brush = SolidColor(Color.Black),
) {
    fun isPassword() =
            keyboardOptions.keyboardType == KeyboardType.Password
                    || keyboardOptions.keyboardType == KeyboardType.NumberPassword

    val focused by interactionSource.collectIsFocusedAsState()

    val outerBorderColor = when {
        hasError -> colorResource(type.outerErrorBorderColorId)
        !focused -> null
        else -> colorResource(type.outerFocusedBorderColorId)
    }

    val innerBorderColor = when {
        hasError -> colorResource(type.innerErrorBorderColorId)
        !focused -> colorResource(type.borderColorId)
        else -> colorResource(type.innerFocusedBorderColorId)
    }

    val backgroundColor = when {
        focused -> colorResource(type.focusedBackColorId)
        else -> colorResource(type.backColorId)
    }

    val transformedText = remember(value, visualTransformation) {
        visualTransformation.filter(value.annotatedString)
    }

    var isPasswordVisible by remember { mutableStateOf(false) }

    BasicTextField(
            value = value,
            onValueChange = onValueChange,
            modifier = modifier
                    .heightIn(min = size.minHeight)
                    .alpha(if (enabled || normalAlphaRegardlessOfEnabledState) 1f else 0.4f)
                    .drawWithContent {
                        if (outerBorderColor != null) {
                            val outerBorderWidthPx = TextFieldOuterBorderWidth.toPx()
                            val outerBorderRadiusPx = TextFieldOuterBorderRadius.toPx()

                            drawRoundRect(
                                    color = outerBorderColor,
                                    topLeft = Offset(-outerBorderWidthPx / 2, -outerBorderWidthPx / 2),
                                    size = Size(this.size.width + outerBorderWidthPx, this.size.height + outerBorderWidthPx),
                                    cornerRadius = CornerRadius(
                                            x = outerBorderRadiusPx - outerBorderWidthPx / 2f,
                                            y = outerBorderRadiusPx - outerBorderWidthPx / 2f,
                                    ),
                                    style = Stroke(width = outerBorderWidthPx),
                            )
                        }

                        drawContent()
                    }
                    .border(
                            color = innerBorderColor,
                            width = InnerBorderWidth,
                            shape = RoundedCornerShape(InnerBorderRadius),
                    )
                    .clip(RoundedCornerShape(8.dp))
                    .background(backgroundColor)
                    .padding(horizontal = 10.dp, vertical = size.verticalPadding),
            enabled = enabled,
            readOnly = readOnly,
            textStyle = textStyle,
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            singleLine = singleLine,
            maxLines = maxLines,
            visualTransformation = if (isPassword() && !isPasswordVisible) {
                PasswordVisualTransformation()
            } else {
                visualTransformation
            },
            onTextLayout = onTextLayout,
            interactionSource = interactionSource,
            cursorBrush = cursorBrush,
            decorationBox = { innerTextField ->
                Row(
                        verticalAlignment = Alignment.CenterVertically,
                ) {
                    if (leftContent != null) {
                        leftContent()
                        Spacer(modifier = Modifier.width(12.dp))
                    }

                    Box(modifier = Modifier.weight(1f)) {
                        innerTextField()

                        if (placeholder != null && transformedText.text.isEmpty()) {
                            Box(modifier = Modifier.align(Alignment.CenterStart)) {
                                CompositionLocalProvider(
                                        LocalTextStyle provides TextStyle(
                                                color = BezierTheme.colorsV3.textNeutralLighter,
                                                fontSize = 16.sp,
                                        ),
                                        content = placeholder,
                                )
                            }
                        }
                    }

                    if ((focused && (isPassword() || value.text.isNotEmpty())) || rightContent != null) {
                        // if rightContent or delete all button or visibility toggle button is visible, then put a spacer between
                        //  textfield and them
                        Spacer(modifier = Modifier.width(6.dp))
                    }

                    if (focused && isPassword()) {
                        Icon(
                                modifier = Modifier
                                        .padding(5.dp)
                                        .size(20.dp)
                                        .clickable(
                                                interactionSource = remember { MutableInteractionSource() },
                                                indication = null,
                                                onClick = {
                                                    isPasswordVisible = !isPasswordVisible
                                                },
                                        ),
                                imageVector = if (isPasswordVisible) {
                                    BezierIcons.View.imageVector
                                } else {
                                    BezierIcons.ViewOff.imageVector
                                },
                                contentDescription = null,
                                tint = BezierTheme.colorsV3.iconNeutral,
                        )
                    }

                    /**
                     * TextField에 x 버튼이 있는 것이 피그마 가이드에 존재하지 않았음.
                     * 기존 iOS의 스펙을 따라 만든 것이었음.
                     * 기존 iOS에서는 singleLine일 때만 x버튼이 나타나고 있음. 그래서 그 히스토리를 기반으로 반영함.
                     */
                    if (focused && value.text.isNotEmpty() && (maxLines <= 1 || singleLine)) {
                        Icon(
                                modifier = Modifier
                                        .padding(5.dp)
                                        .size(20.dp)
                                        .clickable(
                                                interactionSource = remember { MutableInteractionSource() },
                                                indication = null,
                                                onClick = {
                                                    onValueChange(TextFieldValue())
                                                },
                                        ),
                                imageVector = BezierIcons.CancelCircleFilled.imageVector,
                                contentDescription = null,
                                tint = BezierTheme.colorsV3.iconNeutral,
                        )
                    }

                    if (rightContent != null) {
                        rightContent()
                    }
                }
            },
    )
}

@Composable
fun TextField(
        value: String,
        onValueChange: (String) -> Unit,
        modifier: Modifier = Modifier,
        type: TextFieldType = TextFieldType.Primary,
        size: TextFieldSize = TextFieldSize.M,
        placeholder: (@Composable () -> Unit)? = null,
        leftContent: (@Composable () -> Unit)? = null,
        rightContent: (@Composable () -> Unit)? = null,
        hasError: Boolean = false,
        enabled: Boolean = true,
        normalAlphaRegardlessOfEnabledState: Boolean = false,
        readOnly: Boolean = false,
        textStyle: TextStyle = TextStyle.Default,
        keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
        keyboardActions: KeyboardActions = KeyboardActions.Default,
        singleLine: Boolean = false,
        maxLines: Int = Int.MAX_VALUE,
        visualTransformation: VisualTransformation = VisualTransformation.None,
        onTextLayout: (TextLayoutResult) -> Unit = {},
        interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
        cursorBrush: Brush = SolidColor(Color.Black),
) {
    // BasicTextField String 오버로드의 코드를 일부 참고했습니다. BasicTextField와 코드가 다른 이유는 단순하게
    //   BasicTextField String 오버로드의 코드가 정확하게 무슨 일을 하는지 몰라서이므로 이게 명확해졌을 때는
    //   넣어도 좋습니다.
    var textFieldValueState by remember { mutableStateOf(TextFieldValue(text = value)) }
    val textFieldValue = textFieldValueState.copy(text = value)

    TextField(
            value = textFieldValue,
            onValueChange = {
                val lastText = textFieldValue.text
                textFieldValueState = it

                if (lastText != it.text) {
                    onValueChange(it.text)
                }
            },
            modifier = modifier,
            type = type,
            size = size,
            placeholder = placeholder,
            leftContent = leftContent,
            rightContent = rightContent,
            hasError = hasError,
            enabled = enabled,
            normalAlphaRegardlessOfEnabledState = normalAlphaRegardlessOfEnabledState,
            readOnly = readOnly,
            textStyle = textStyle,
            keyboardOptions = keyboardOptions,
            keyboardActions = keyboardActions,
            singleLine = singleLine,
            maxLines = maxLines,
            visualTransformation = visualTransformation,
            onTextLayout = onTextLayout,
            interactionSource = interactionSource,
            cursorBrush = cursorBrush,
    )
}

enum class TextFieldType(
        @ColorRes val backColorId: Int,
        @ColorRes val focusedBackColorId: Int,
        @ColorRes val borderColorId: Int,
        @ColorRes val outerFocusedBorderColorId: Int,
        @ColorRes val innerFocusedBorderColorId: Int,
        @ColorRes val outerErrorBorderColorId: Int,
        @ColorRes val innerErrorBorderColorId: Int,
) {
    Primary(
            backColorId = R.color.fill_neutral_lightest,
            focusedBackColorId = R.color.fill_grey_light,
            borderColorId = R.color.border_neutral,
            outerFocusedBorderColorId = R.color.border_neutral,
            innerFocusedBorderColorId = R.color.text_accent_blue,
            outerErrorBorderColorId = R.color.fill_neutral_light,
            innerErrorBorderColorId = R.color.text_accent_orange,
    ),
    Secondary(
            backColorId = R.color.fill_neutral_light,
            focusedBackColorId = R.color.fill_neutral_light,
            borderColorId = R.color.fill_absolute_black_transparent,
            outerFocusedBorderColorId = R.color.fill_absolute_black_transparent,
            innerFocusedBorderColorId = R.color.fill_absolute_black_transparent,
            outerErrorBorderColorId = R.color.fill_absolute_black_transparent,
            innerErrorBorderColorId = R.color.fill_absolute_black_transparent,
    ),
    Tertiary(
            backColorId = R.color.fill_absolute_black_transparent,
            focusedBackColorId = R.color.fill_neutral_light,
            borderColorId = R.color.fill_absolute_black_transparent,
            outerFocusedBorderColorId = R.color.fill_absolute_black_transparent,
            innerFocusedBorderColorId = R.color.fill_absolute_black_transparent,
            outerErrorBorderColorId = R.color.fill_absolute_black_transparent,
            innerErrorBorderColorId = R.color.fill_absolute_black_transparent,
    ),
}

enum class TextFieldSize(
        val minHeight: Dp,
        val verticalPadding: Dp,
) {
    M(40.dp, 5.dp),
    L(44.dp, 7.dp),
    XL(48.dp, 9.dp),
}

@Preview(showBackground = true)
@Composable
private fun TextFieldPreview() = Column(Modifier.background(color = Color.White)) {
    var value1 by remember { mutableStateOf(TextFieldValue()) }
    var value2 by remember { mutableStateOf(TextFieldValue()) }
    var value3 by remember { mutableStateOf(TextFieldValue()) }
    var value4 by remember { mutableStateOf("") }
    var value5 by remember { mutableStateOf("") }

    TextField(
            modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
            value = value1,
            onValueChange = { value1 = it },
            type = TextFieldType.Primary,
            placeholder = { Text("Placeholder") },
            leftContent = {
                Icon(
                        modifier = Modifier.padding(2.dp),
                        imageVector = BezierIcons.Search.imageVector,
                        contentDescription = null,
                        tint = BezierTheme.colorsV3.textNeutralLighter,
                )
            },
            rightContent = {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Spacer(modifier = Modifier.height(6.dp))

                    Icon(
                            modifier = Modifier
                                    .padding(5.dp)
                                    .size(20.dp),
                            imageVector = BezierIcons.ChevronDown.imageVector,
                            contentDescription = null,
                            tint = BezierTheme.colorsV3.textNeutralLighter,
                    )
                }
            },
    )

    TextField(
            modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
            value = value2,
            onValueChange = { value2 = it },
            type = TextFieldType.Secondary,
    )

    TextField(
            modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
            value = value3,
            onValueChange = { value3 = it },
            type = TextFieldType.Primary,
            enabled = false,
            placeholder = { Text("Placeholder") },
            leftContent = {
                Icon(
                        modifier = Modifier.padding(2.dp),
                        imageVector = BezierIcons.Search.imageVector,
                        contentDescription = null,
                        tint = BezierTheme.colorsV3.textNeutralLighter,
                )
            },
            rightContent = {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Spacer(modifier = Modifier.height(6.dp))

                    Icon(
                            modifier = Modifier
                                    .padding(5.dp)
                                    .size(20.dp),
                            imageVector = BezierIcons.ChevronDown.imageVector,
                            contentDescription = null,
                            tint = BezierTheme.colorsV3.textNeutralLighter,
                    )
                }
            },
    )

    SectionGroup(
            modifier = Modifier
                    .padding(vertical = 16.dp)
                    .fillMaxWidth(),
    ) {
        TextField(
                modifier = Modifier
                        .fillMaxWidth(),
                value = value4,
                onValueChange = { value4 = it },
                type = TextFieldType.Tertiary,
                size = TextFieldSize.L,
                placeholder = { Text("String overload of TextField") },
                leftContent = {
                    Icon(
                            imageVector = BezierIcons.BookEditing.imageVector,
                            contentDescription = null,
                            tint = BezierTheme.colorsV3.textNeutralLighter,
                    )
                },
        )
    }

    TextField(
            modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            value = value5,
            onValueChange = { value5 = it },
            type = TextFieldType.Primary,
            placeholder = { Text("Password") },
            leftContent = {
                Icon(
                        modifier = Modifier.padding(2.dp),
                        imageVector = BezierIcons.Search.imageVector,
                        contentDescription = null,
                        tint = BezierTheme.colorsV3.textNeutralLighter,
                )
            },
            rightContent = {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Spacer(modifier = Modifier.height(6.dp))

                    Icon(
                            modifier = Modifier
                                    .padding(5.dp)
                                    .size(20.dp),
                            imageVector = BezierIcons.ChevronDown.imageVector,
                            contentDescription = null,
                            tint = BezierTheme.colorsV3.textNeutralLighter,
                    )
                }
            },
    )
}
