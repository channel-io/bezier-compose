package io.channel.bezier.v3.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.component.BezierText
import io.channel.bezier.icon.ErrorDiamondFilled
import io.channel.bezier.typography.BezierTypo

@Composable
internal fun FormFieldErrorMessage(
        text: String,
        modifier: Modifier = Modifier,
) {
    val colors = BezierTheme.colorsV3

    Row(
            modifier = modifier,
            horizontalArrangement = Arrangement.spacedBy(FormFieldErrorMessageGap),
            verticalAlignment = Alignment.Top,
    ) {
        Box(
                modifier = Modifier.height(FormFieldErrorMessageIconBoxHeight),
                contentAlignment = Alignment.Center,
        ) {
            Icon(
                    modifier = Modifier.size(FormFieldErrorMessageIconSize),
                    imageVector = BezierIcons.ErrorDiamondFilled.imageVector,
                    tint = colors.iconAccentOrange,
                    contentDescription = null,
            )
        }
        BezierText(
                modifier = Modifier.weight(1f),
                text = text,
                typo = BezierTypo.CaptionMedium,
                color = colors.textAccentOrange,
        )
    }
}

private val FormFieldErrorMessageGap: Dp = 4.dp
private val FormFieldErrorMessageIconBoxHeight: Dp = 16.dp
private val FormFieldErrorMessageIconSize: Dp = 10.dp

@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun FormFieldErrorMessagePreview() {
    BezierTheme {
        Column(
                modifier = Modifier
                        .background(BezierTheme.colorsV3.surface)
                        .padding(24.dp),
        ) {
            FormFieldErrorMessage(text = "Error message")
        }
    }
}
