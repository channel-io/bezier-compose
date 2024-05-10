package io.channel.bezier.component

import android.content.Context
import android.content.res.Configuration
import android.util.AttributeSet
import androidx.annotation.IntRange
import androidx.compose.animation.core.CubicBezierEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.AbstractComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.content.res.use
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.R
import io.channel.bezier.extension.roundedBackground

class ProgressBar @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0,
) : AbstractComposeView(context, attrs, defStyleAttr) {

    var progress by mutableStateOf(0)
    var size by mutableStateOf(ProgressBarSize.S)
    var color by mutableStateOf(ProgressBarColor.Green)

    init {
        if (attrs != null) {
            context.theme.obtainStyledAttributes(
                    attrs,
                    R.styleable.ProgressBar,
                    0,
                    0,
            ).use { typedArray ->
                size = ProgressBarSize.fromId(typedArray.getInt(R.styleable.ProgressBar_pb_size, ProgressBarSize.S.id))
                        ?: throw NoSuchElementException("unsupported attribute")
                color = ProgressBarColor.fromId(typedArray.getInt(R.styleable.ProgressBar_pb_color, ProgressBarColor.Green.id))
                        ?: throw NoSuchElementException("unsupported attribute")
            }
        }
    }

    @Composable
    override fun Content() {
        BezierTheme {
            ProgressBar(
                    progress = progress,
                    modifier = Modifier
                            .fillMaxWidth(),
                    size = size,
                    color = color,
            )
        }
    }
}

@Composable
fun ProgressBar(
        @IntRange(from = 0, to = 100) progress: Int,
        modifier: Modifier = Modifier,
        size: ProgressBarSize = ProgressBarSize.S,
        color: ProgressBarColor = ProgressBarColor.Green,
) {
    val progressRatio: Float by animateFloatAsState(
            targetValue = progress / 100f,
            animationSpec = tween(
                    durationMillis = 1000,
                    easing = CubicBezierEasing(0.24f, 1f, 0.24f, 1f),
            ),
            label = "ProgressAnimation",
    )

    Box(
            modifier = modifier
                    .height(size.heightDp.dp)
                    .roundedBackground(color.backgroundColor),
    ) {
        Box(
                modifier = Modifier
                        .fillMaxWidth(progressRatio)
                        .fillMaxHeight()
                        .clip(RoundedCornerShape(50))
                        .background(Brush.horizontalGradient(0f to color.startColor, 1f to color.endColor)),
        )
    }
}

enum class ProgressBarSize(
        val id: Int,
        val heightDp: Int,
) {
    S(id = 0, heightDp = 4),
    M(id = 1, heightDp = 6);

    companion object {
        fun fromId(id: Int): ProgressBarSize? {
            return ProgressBarSize.values().find { it.id == id }
        }
    }
}

enum class ProgressBarColor(
        val id: Int
) {
    Green(id = 0),
    GreenAlt(id = 1),
    Grey(id = 2);

    val startColor: Color
        @Composable
        @ReadOnlyComposable
        get() = when (this) {
            Green -> BezierTheme.colors.bgtxtGreenNormal
            GreenAlt -> BezierTheme.colors.bgtxtGreenNormal
            Grey -> BezierTheme.colors.bgBlackLight
        }

    val endColor: Color
        @Composable
        @ReadOnlyComposable
        get() = when (this) {
            Green -> BezierTheme.colors.invertedBgtxtGreenNormal
            GreenAlt -> BezierTheme.colors.invertedBgtxtGreenNormal
            Grey -> BezierTheme.colors.bgBlackDark
        }

    val backgroundColor: Color
        @Composable
        @ReadOnlyComposable
        get() = when (this) {
            Green -> BezierTheme.colors.bgBlackLight
            GreenAlt -> BezierTheme.colors.bgtxtAbsoluteWhiteNormal
            Grey -> BezierTheme.colors.bgBlackLight
        }

    companion object {
        fun fromId(id: Int): ProgressBarColor? {
            return ProgressBarColor.values().find { it.id == id }
        }
    }
}

@Preview(
        widthDp = 300,
        uiMode = Configuration.UI_MODE_NIGHT_NO,
        showBackground = true,
)
@Composable
private fun ProgressBarPreview() {
    var progress by remember { mutableStateOf(50) }

    Column(
            modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
    ) {
        Row(
                modifier = Modifier
                        .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(10.dp),
        ) {
            Button(
                    onClick = { progress = 0 },
                    modifier = Modifier
                            .weight(1f),
            ) {
                Text(text = "0")
            }

            Button(
                    onClick = { progress = 50 },
                    modifier = Modifier
                            .weight(1f),
            ) {
                Text(text = "50")
            }

            Button(
                    onClick = { progress = 100 },
                    modifier = Modifier
                            .weight(1f),
            ) {
                Text(text = "100")
            }
        }

        ProgressBarSize.values().forEach { size ->
            ProgressBarColor.values().forEach { color ->
                ProgressBar(
                        modifier = Modifier
                                .fillMaxWidth(),
                        progress = progress,
                        size = size,
                        color = color,
                )
            }
        }
    }
}
