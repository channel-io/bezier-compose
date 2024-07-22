package io.channel.bezier.compose.component

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
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.color_v2.BezierColor

@Composable
fun BezierLoader(
        variant: BezierLoaderVariant,
        size: BezierLoaderSize,
) {
    CircularProgressIndicator(
            modifier = Modifier.size(size.size),
            color = variant.foregroundColor().color,
            strokeWidth = size.strokeWidth,
            backgroundColor = variant.backgroundColor().color,
            strokeCap = StrokeCap.Round,
    )
}

enum class BezierLoaderVariant(
        internal val backgroundColor: @Composable () -> BezierColor,
        internal val foregroundColor: @Composable () -> BezierColor,
) {
    Primary(
            backgroundColor = { BezierTheme.colorSchemes.primaryBgLightest },
            foregroundColor = { BezierTheme.colorSchemes.fgBlueNormal },
    ),
    Secondary(
            backgroundColor = { BezierTheme.colorSchemes.bgBlackLight },
            foregroundColor = { BezierTheme.colorSchemes.fgBlackLight },
    ),
    OnOverlay(
            backgroundColor = { BezierTheme.colorSchemes.bgAbsoluteWhiteLightest },
            foregroundColor = { BezierTheme.colorSchemes.fgAbsoluteWhiteLight },
    ),
}

enum class BezierLoaderSize(
        internal val size: Dp,
        internal val strokeWidth: Dp,
) {
    Small(
            size = 28.dp,
            strokeWidth = 4.dp,
    ),
    Medium(
            size = 50.dp,
            strokeWidth = 6.dp,
    ),
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
