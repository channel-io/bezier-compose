package io.channel.bezier.component

import android.content.Context
import android.util.AttributeSet
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.AbstractComposeView
import androidx.compose.ui.platform.LocalInspectionMode
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.core.content.res.use
import coil.compose.rememberAsyncImagePainter
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.R
import io.channel.bezier.extension.ifTrue
import io.channel.bezier.extension.orElse
import io.channel.bezier.shape.SmoothRoundedCornerShape

typealias AvatarSize = Avatar.Size

const val AvatarRadiusFraction = 42

class Avatar @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0,
) : AbstractComposeView(context, attrs, defStyleAttr) {

    var size by mutableStateOf(Size.Size20)
    var showBorder by mutableStateOf(false)
    private var imageUrl by mutableStateOf<String?>(null)
    private var clipShape by mutableStateOf(true)
    var statusType by mutableStateOf<StatusType?>(null)

    init {
        if (attrs != null) {
            context.theme.obtainStyledAttributes(
                    attrs,
                    R.styleable.Avatar,
                    0,
                    0,
            ).use { typedArray ->
                size = Size.fromId(typedArray.getInt(R.styleable.Avatar_av_size, size.id))
                showBorder = typedArray.getBoolean(R.styleable.Avatar_av_showBorder, showBorder)
                clipShape = typedArray.getBoolean(R.styleable.Avatar_av_clip, clipShape)
            }
        }
    }

    fun setUrl(url: String) {
        imageUrl = url
    }

    fun clear() {
        imageUrl = null
    }

    @Composable
    override fun Content() {
        val painter = if (imageUrl != null) {
            rememberAsyncImagePainter(model = imageUrl)
        } else {
            painterResource(id = R.drawable.unknown)
        }

        BezierTheme {
            Avatar(
                    painter = painter,
                    size = size,
                    shape = clipShape.ifTrue(SmoothRoundedCornerShape(percent = AvatarRadiusFraction), RectangleShape),
                    showBorder = showBorder,
                    status = statusType,
            )
        }
    }

    enum class Size(
        val id: Int,
        val avatarSize: Dp,
        val overflowOffset: Dp,
        val borderWidth: Dp,
        val statusSize: StatusSize,
    ) {
        Size16(0, 16.dp, 4.dp, 2.dp, StatusSize.M),
        Size20(1, 20.dp, 4.dp, 2.dp, StatusSize.M),
        Size24(2, 24.dp, 4.dp, 2.dp, StatusSize.M),
        Size30(3, 30.dp, 4.dp, 2.dp, StatusSize.M),
        Size36(4, 36.dp, 3.dp, 2.dp, StatusSize.M),
        Size42(5, 42.dp, 2.dp, 2.dp, StatusSize.M),
        Size48(6, 48.dp, 2.dp, 2.dp, StatusSize.M),
        Size72(7, 72.dp, (-2).dp, 2.dp, StatusSize.M),
        Size90(8, 90.dp, (-2).dp, 3.dp, StatusSize.L),
        Size120(9, 120.dp, (-4).dp, 4.dp, StatusSize.L),
        Size160(10, 160.dp, (-10).dp, 4.dp, StatusSize.L);

        val borderSize: Dp
            get() = avatarSize + borderWidth * 2

        companion object {
            fun fromId(id: Int): Size {
                return values().find { it.id == id }.orElse(Size20)
            }
        }
    }
}

@Composable
fun Avatar(
    painter: Painter,
    modifier: Modifier = Modifier,
    showBorder: Boolean = false,
    shape: Shape = SmoothRoundedCornerShape(percent = AvatarRadiusFraction),
    size: AvatarSize = Avatar.Size.Size20,
    overlay: (@Composable () -> Unit)? = null,
    overflow: (@Composable () -> Unit)? = null,
) {
    val avatarModifier = modifier
            .let {
                when (showBorder) {
                    true -> it
                            .size(size.borderSize)
                            .background(
                                    shape = shape,
                                    color = BezierTheme.colors.bgWhiteHigh,
                            )
                            .padding(size.borderWidth)

                    false -> it.size(size.avatarSize)
                }
            }
            .clip(shape)

    val resolvedPainter = when (LocalInspectionMode.current) {
        true -> painterResource(R.drawable.unknown)
        false -> painter
    }

    Box {
        Box(modifier = avatarModifier) {
            Image(
                    modifier = Modifier.fillMaxSize(),
                    painter = resolvedPainter,
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
            )

            if (overlay != null) {
                overlay()
            }
        }

        if (overflow != null) {
            Box(
                    modifier = Modifier
                            .align(Alignment.BottomEnd)
                            .offset(x = size.overflowOffset, y = size.overflowOffset),
                    contentAlignment = Alignment.Center,
            ) {
                overflow()
            }
        }
    }
}

@Composable
fun Avatar(
    painter: Painter,
    status: StatusType?,
    modifier: Modifier = Modifier,
    showBorder: Boolean = false,
    shape: Shape = SmoothRoundedCornerShape(percent = AvatarRadiusFraction),
    size: AvatarSize = Avatar.Size.Size20,
    overlay: (@Composable () -> Unit)? = null,
) {
    Avatar(
            painter = painter,
            modifier = modifier,
            showBorder = showBorder,
            shape = shape,
            size = size,
            overlay = overlay,
            overflow = {
                if (status != null) {
                    Status(
                            size = size.statusSize,
                            type = status,
                    )
                }
            },
    )
}

@Preview
@Composable
private fun AvatarMoreOverlayPreview() {
    Avatar(
            painter = painterResource(id = R.drawable.unknown),
            size = Avatar.Size.Size120,
            overlay = {
                Icon(
                        painter = painterResource(id = R.drawable.icon_more),
                        modifier = Modifier
                                .fillMaxSize()
                                .background(BezierTheme.colors.bgtxtAbsoluteBlackLighter),
                        tint = BezierTheme.colors.bgtxtAbsoluteWhiteNormal,
                        contentDescription = null,
                )
            }
    )
}

// 2022.11.23 (Android Studio Dolphin Patch 1) 기준으로 Split 화면에서 프리뷰가 수시로 잘 안 떠서 실기기 프리뷰 하는 게 마음 편함
@Preview
@Composable
private fun AvatarPreview() {
    Column(
            modifier = Modifier
                    .background(Color.Gray)
                    .padding(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Avatar(
                painter = painterResource(id = R.drawable.unknown),
                status = StatusType.Online,
                size = Avatar.Size.Size90,
        )

        Avatar(
                painter = painterResource(id = R.drawable.unknown),
                showBorder = true,
                status = StatusType.Online,
                size = Avatar.Size.Size90,
        )

        Avatar(
                painter = painterResource(id = R.drawable.unknown),
                size = Avatar.Size.Size90,
        ) {
            Avatar(
                    painter = painterResource(R.drawable.unknown),
                    size = Avatar.Size.Size20,
                    showBorder = true,
            )
        }

        Avatar(
                painter = painterResource(id = R.drawable.unknown),
                shape = RectangleShape,
                size = Avatar.Size.Size90,
        )

        Avatar(
                painter = painterResource(id = R.drawable.unknown),
                status = StatusType.Online,
                shape = RectangleShape,
                size = Avatar.Size.Size48,
        )
    }
}
