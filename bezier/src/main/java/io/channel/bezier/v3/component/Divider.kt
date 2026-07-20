package io.channel.bezier.v3.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme

@Composable
fun Divider(
        modifier: Modifier = Modifier,
        sideIndent: Boolean = true,
        parallelIndent: Boolean = true,
) {
    Box(
            modifier = modifier
                    .fillMaxWidth()
                    .padding(
                            horizontal = if (sideIndent) DividerIndent else 0.dp,
                            vertical = if (parallelIndent) DividerIndent else 0.dp,
                    ),
    ) {
        Box(
                modifier = Modifier
                        .fillMaxWidth()
                        .height(DividerThickness)
                        .background(BezierTheme.colorsV3.borderNeutral),
        )
    }
}

private val DividerIndent: Dp = 6.dp
private val DividerThickness: Dp = 1.dp

@Composable
private fun DividerMatrix() {
    BezierTheme {
        Column(
                modifier = Modifier
                        .background(BezierTheme.colorsV3.surface)
                        .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(24.dp),
        ) {
            Divider()
            Divider(sideIndent = false)
            Divider(parallelIndent = false)
            Divider(sideIndent = false, parallelIndent = false)
        }
    }
}

@Preview(showBackground = true, widthDp = 360)
@Preview(showBackground = true, widthDp = 360, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun DividerMatrixPreview() = DividerMatrix()
