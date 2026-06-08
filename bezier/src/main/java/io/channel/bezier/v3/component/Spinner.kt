package io.channel.bezier.v3.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme

@Composable
fun Spinner(
        modifier: Modifier = Modifier,
        size: SpinnerSize = SpinnerSize.Size24,
        color: Color = BezierTheme.colorsV3.iconNeutral,
) {
    CircularProgressIndicator(
            modifier = modifier.size(size.length),
            color = color,
            strokeWidth = size.strokeWidth,
    )
}

enum class SpinnerSize {
    Size12,
    Size16,
    Size20,
    Size24,
    Size30,
    Size36,
    Size42,
    Size48;

    internal val length: Dp
        get() = when (this) {
            Size12 -> 12.dp
            Size16 -> 16.dp
            Size20 -> 20.dp
            Size24 -> 24.dp
            Size30 -> 30.dp
            Size36 -> 36.dp
            Size42 -> 42.dp
            Size48 -> 48.dp
        }

    internal val strokeWidth: Dp
        get() = when (this) {
            Size12 -> 1.5.dp
            Size16 -> 2.dp
            Size20 -> 2.5.dp
            Size24 -> 3.dp
            Size30 -> 3.75.dp
            Size36 -> 4.5.dp
            Size42 -> 5.25.dp
            Size48 -> 6.dp
        }
}

@Composable
private fun SpinnerMatrix() {
    BezierTheme {
        Row(
                modifier = Modifier
                        .background(BezierTheme.colorsV3.surface)
                        .padding(24.dp),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically,
        ) {
            SpinnerSize.values().forEach { size ->
                Spinner(size = size)
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 400)
@Preview(showBackground = true, widthDp = 400, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun SpinnerMatrixPreview() = SpinnerMatrix()
