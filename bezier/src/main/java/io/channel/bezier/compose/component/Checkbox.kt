package io.channel.bezier.compose.component

import android.content.Context
import android.util.AttributeSet
import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.AbstractComposeView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.channel.bezier.compose.BezierTheme
import io.channel.bezier.compose.R
import io.channel.bezier.compose.extension.ifTrue
import io.channel.bezier.compose.extension.orElse

typealias CheckboxType = Checkbox.Type
typealias CheckboxState = Checkbox.State
typealias CheckboxColor = Checkbox.Color

class Checkbox @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0,
) : AbstractComposeView(context, attrs, defStyleAttr) {

    private var _enabled by mutableStateOf(isEnabled)
    var state by mutableStateOf(State.Off)
    var type by mutableStateOf(Type.Rectangle)
    var text by mutableStateOf<String?>(null)
    var color by mutableStateOf(Color.Normal)

    var onCheckChangedListener: ((State) -> Unit)? = null

    fun setState(state: State, isUserAction: Boolean = true) {
        this.state = state

        if (isUserAction) {
            onCheckChangedListener?.invoke(state)
        }
    }

    init {
        val typedArray = context.theme.obtainStyledAttributes(
                attrs,
                R.styleable.Checkbox,
                0,
                0,
        )

        type = Type.fromId(typedArray.getInt(R.styleable.Checkbox_ckb_type, type.id))
        state = State.fromId(typedArray.getInt(R.styleable.Checkbox_ckb_state, state.id))
        _enabled = typedArray.getBoolean(R.styleable.Checkbox_ckb_enabled, true)
        text = typedArray.getString(R.styleable.Checkbox_ckb_text)
        color = Color.fromId(typedArray.getInt(R.styleable.Checkbox_ckb_color, 0))

        typedArray.recycle()
    }

    @Composable
    override fun Content() {
        BezierTheme {
            Checkbox(
                    state = state,
                    type = type,
                    enabled = _enabled,
                    text = text,
                    color = color,
                    onStateChange = {
                        state = it

                        onCheckChangedListener?.invoke(it)
                    },
            )
        }
    }

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)

        _enabled = enabled
    }

    enum class Color(
            val id: Int,
    ) {
        Normal(0),
        Green(1),
        Blue(2);

        @Composable
        fun backgroundColor(type: Type, state: State): androidx.compose.ui.graphics.Color {
            if (state == State.Off) {
                return BezierTheme.colors.bgWhiteNormal
            }

            return when (this) {
                Normal -> when (type) {
                    Type.Rectangle -> BezierTheme.colors.bgtxtGreenNormal
                    Type.Circle -> BezierTheme.colors.bgtxtBlueNormal
                }
                Green -> BezierTheme.colors.bgtxtGreenNormal
                Blue -> BezierTheme.colors.bgtxtBlueNormal
            }
        }

        companion object {
            fun fromId(id: Int): Color {
                return Color.values().find { it.id == id }.orElse(Normal)
            }
        }
    }

    enum class Type(
            val id: Int,
            val checkboxSize: Dp,
            val borderRadius: Dp,
    ) {
        Rectangle(0, 22.dp, 6.dp),
        Circle(1, 24.dp, 12.dp);

        companion object {
            fun fromId(id: Int): Type {
                return values().find { it.id == id }.orElse(Rectangle)
            }
        }
    }

    // check box rectangle state

    enum class State(val id: Int, @DrawableRes val drawableRes: Int, val borderWidth: Dp) {
        On(0, R.drawable.icon_check_bold, 0.dp),
        Indeterminate(1, R.drawable.icon_hyphen_bold, 0.dp),
        Off(2, 0, 2.dp);

        companion object {
            fun fromId(id: Int): State {
                return values().find { it.id == id }.orElse(Off)
            }
        }
    }
}

@Composable
fun Checkbox(
        modifier: Modifier = Modifier,
        state: CheckboxState,
        onStateChange: (CheckboxState) -> Unit,
        type: CheckboxType = CheckboxType.Rectangle,
        enabled: Boolean = true,
        text: String? = null,
        color: CheckboxColor = Checkbox.Color.Normal,
) {
    Row(
            modifier = modifier
                    .padding(2.dp)
                    .alpha(enabled.ifTrue(1.0f, 0.4f))
                    .clickable(
                            interactionSource = remember { MutableInteractionSource() },
                            indication = null,
                            enabled = enabled,
                    ) {
                        onStateChange(state.toggle())
                    },
            verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
                modifier = Modifier
                        .size(type.checkboxSize)
                        .clip(RoundedCornerShape(type.borderRadius))
                        .border(
                                width = state.borderWidth,
                                color = BezierTheme.colors.bdrBlackLight,
                                shape = RoundedCornerShape(type.borderRadius),
                        )
                        .background(color.backgroundColor(type, state))
                        .clickable(
                                interactionSource = remember { MutableInteractionSource() },
                                indication = rememberRipple(),
                                enabled = enabled,
                        ) {
                            onStateChange(state.toggle())
                        },
        ) {
            if (state.drawableRes != 0) {
                Icon(
                        modifier = Modifier
                                .fillMaxSize()
                                .clip(RoundedCornerShape(type.borderRadius)),
                        painter = painterResource(id = state.drawableRes),
                        contentDescription = null,
                        tint = BezierTheme.colors.bgtxtAbsoluteWhiteDark,
                )
            }
        }

        if (text != null) {
            Spacer(modifier = Modifier.width(8.dp))
            Text(
                    text = text,
                    fontSize = 15.sp,
                    color = BezierTheme.colors.txtBlackDarkest,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun RectangleCheckBoxPreview() {
    var state by remember { mutableStateOf(CheckboxState.Off) }

    Checkbox(
            enabled = true,
            text = "This is a rectangle checkbox",
            state = state,
            type = CheckboxType.Rectangle,
            onStateChange = { state = it },
    )
}

@Preview(showBackground = true)
@Composable
private fun CircleCheckBoxPreview() {
    var state by remember { mutableStateOf(CheckboxState.Off) }

    Checkbox(
            enabled = true,
            text = "This is a circle checkbox",
            state = state,
            type = CheckboxType.Circle,
            onStateChange = { state = it },
    )
}

@Preview(showBackground = true)
@Composable
private fun RectangleIndeterminateCheckBoxPreview() {
    var state by remember { mutableStateOf(CheckboxState.Indeterminate) }

    Checkbox(
            enabled = true,
            text = "This is a rectangle checkbox",
            state = state,
            type = CheckboxType.Rectangle,
            onStateChange = { state = it },
    )
}

@Preview(showBackground = true)
@Composable
private fun CircleIndeterminateCheckBoxPreview() {
    var state by remember { mutableStateOf(CheckboxState.Indeterminate) }

    Checkbox(
            enabled = true,
            text = "This is a circle checkbox",
            state = state,
            type = CheckboxType.Circle,
            onStateChange = { state = it },
    )
}

@Preview(showBackground = true)
@Composable
private fun DisabledRectangleCheckBoxPreview() {
    var state by remember { mutableStateOf(CheckboxState.Off) }

    Checkbox(
            enabled = false,
            text = "This is a rectangle checkbox",
            state = state,
            type = CheckboxType.Rectangle,
            onStateChange = { state = it },
    )
}

@Preview(showBackground = true)
@Composable
private fun DisabledCircleCheckBoxPreview() {
    var state by remember { mutableStateOf(CheckboxState.Off) }

    Checkbox(
            enabled = false,
            text = "This is a circle checkbox",
            state = state,
            type = CheckboxType.Circle,
            onStateChange = { state = it },
    )
}

fun CheckboxState.toggle(): CheckboxState {
    return if (this == CheckboxState.On) CheckboxState.Off else CheckboxState.On
}
