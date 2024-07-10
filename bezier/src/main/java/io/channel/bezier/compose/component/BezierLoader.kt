package io.channel.bezier.compose.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
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
            color = variant.foregroundColor.color,
            strokeWidth = size.strokeWidth,
            backgroundColor = variant.backgroundColor.color,
            strokeCap = StrokeCap.Round,
    )
}

enum class BezierLoaderVariant {
    Primary,
    Secondary,
    OnOverlay;

    internal val backgroundColor: BezierColor
        @Composable
        get() = when (this) {
            Primary -> BezierTheme.colorSchemes.primaryBgLightest
            Secondary -> BezierTheme.colorSchemes.bgBlackLight
            OnOverlay -> BezierTheme.colorSchemes.bgAbsoluteWhiteLightest
        }

    internal val foregroundColor: BezierColor
        @Composable
        get() = when (this) {
            Primary -> BezierTheme.colorSchemes.fgBlueNormal
            Secondary -> BezierTheme.colorSchemes.fgBlackLight
            OnOverlay -> BezierTheme.colorSchemes.fgAbsoluteWhiteLight
        }
}

enum class BezierLoaderSize {
    Small,
    Medium;

    internal val size: Dp
        get() = when (this) {
            Small -> 28.dp
            Medium -> 50.dp
        }

    internal val strokeWidth: Dp
        get() = when (this) {
            Small -> 4.dp
            Medium -> 6.dp
        }
}

@Composable
@Preview(showBackground = true)
private fun BezierLoaderPreview() {
    BezierTheme {
        Column(verticalArrangement = Arrangement.spacedBy(16.dp)) {
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
