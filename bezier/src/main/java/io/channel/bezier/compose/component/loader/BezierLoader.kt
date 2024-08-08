package io.channel.bezier.compose.component.loader

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.component.loader.properties.BezierLoaderSize
import io.channel.bezier.compose.component.loader.properties.BezierLoaderVariant

private const val StrokeWidthRatio = 0.12f

@Composable
fun BezierLoader(
        variant: BezierLoaderVariant,
        size: BezierLoaderSize,
) {
    CircularProgressIndicator(
            modifier = Modifier.size(size.size),
            color = variant.foregroundColor().color,
            strokeWidth = size.size * StrokeWidthRatio,
            backgroundColor = variant.backgroundColor().color,
            strokeCap = StrokeCap.Round,
    )
}

@Composable
@Preview(showBackground = true)
private fun BezierLoaderPreview() {
    BezierTheme {
        Column(
                modifier = Modifier.background(Color.LightGray),
                verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            BezierLoaderSize.entries.forEach { size ->
                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    BezierLoaderVariant.entries.forEach { variants ->
                        BezierLoader(variant = variants, size = size)
                    }
                }
            }
        }
    }
}
