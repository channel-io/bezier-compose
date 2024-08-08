package io.channel.bezier.extension

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalInspectionMode
import coil.compose.rememberAsyncImagePainter
import io.channel.bezier.BezierIcons
import io.channel.bezier.icon.FaceSmile
import java.net.URLEncoder

private const val emojiUrl = "https://cf.channel.io/asset/emoji/images/80/%s.png"

internal val String.toEmojiPainter: Painter
    @Composable
    get() = if (LocalInspectionMode.current) {
        rememberVectorPainter(image = BezierIcons.FaceSmile.imageVector)
    } else {
        rememberAsyncImagePainter(model = emojiUrl.format(URLEncoder.encode(this, "UTF-8")))
    }
