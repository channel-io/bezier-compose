package io.channel.bezier.compose

import androidx.compose.foundation.background
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import io.channel.bezier.compose.color_v2.BezierColor

@Composable
fun Button(
    text: String,
    color: ButtonColor,
    type: ButtonType,
) {
    BezierTheme.colorSchemes.blue200

    Text(
        modifier = Modifier.background(color.asBackgroundColor(type).color),
        text = text,
        color = color.asTextColor(type).color,
    )
}

enum class ButtonType {
    Primary,
    Secondary,
}

enum class ButtonColor {
    Blue,
    Red;

    fun asTextColor(type: ButtonType): BezierColor {
        return when (this) {
            Blue -> when (type) {
                ButtonType.Primary -> BezierColor
                ButtonType.Secondary -> BezierColor
            }
            Red -> when (type) {
                ButtonType.Primary -> BezierColor
                ButtonType.Secondary -> BezierColor
            }
        }
    }

    fun asBackgroundColor(type: ButtonType): BezierColor {
        return when (this) {
            Blue -> when (type) {
                ButtonType.Primary -> BezierColor
                ButtonType.Secondary -> BezierColor
            }
            Red -> when (type) {
                ButtonType.Primary -> BezierColor
                ButtonType.Secondary -> BezierColor
            }
        }
    }
}
