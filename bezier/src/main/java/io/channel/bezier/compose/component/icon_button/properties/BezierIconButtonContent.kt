package io.channel.bezier.compose.component.icon_button.properties

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import coil.compose.rememberAsyncImagePainter
import io.channel.bezier.BezierIcon
import io.channel.bezier.compose.R

@Stable
sealed interface BezierIconButtonContent {
    data class Icon(val icon: BezierIcon) : BezierIconButtonContent
    class Avatar : BezierIconButtonContent {
        private val _painter: @Composable () -> Painter
        val painter: Painter
            @Composable
            get() = _painter()

        constructor(url: String, error: Painter? = null) {
            _painter = {
                rememberAsyncImagePainter(
                        model = url,
                        error = error ?: painterResource(id = R.drawable.unknown),
                )
            }
        }

        constructor(painter: Painter) {
            _painter = { painter }
        }
    }

    data class Emoji(val name: String) : BezierIconButtonContent
}
