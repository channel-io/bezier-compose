package io.channel.bezier.extension

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import coil.compose.rememberAsyncImagePainter
import java.net.URLEncoder

private const val emojiUrl = "https://cf.channel.io/asset/emoji/images/80/%s.png"

internal val String.toEmojiPainter: Painter
    @Composable
    get() = rememberAsyncImagePainter(model = emojiUrl.format(URLEncoder.encode(this, "UTF-8")))
