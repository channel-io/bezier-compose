package io.channel.bezier.compose.component.avatar.properties

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import io.channel.bezier.compose.R

@Stable
sealed interface BezierAvatarBadge {
    data object None : BezierAvatarBadge

    data class Status(val isOnline: Boolean, val doNotDisturb: Boolean) : BezierAvatarBadge

    data object Chat : BezierAvatarBadge

    enum class Integration(
            internal val painter: @Composable () -> Painter
    ) : BezierAvatarBadge {
        Kakao(painter = { painterResource(id = R.drawable.image_kakao) }),
        Line(painter = { painterResource(id = R.drawable.image_line) }),
        NaverTalk(painter = { painterResource(id = R.drawable.image_talktalk) }),
        Instagram(painter = { painterResource(id = R.drawable.image_instagram) }),
        PhoneNumber(painter = { painterResource(id = R.drawable.image_avatar_call) }),
        Email(painter = { painterResource(id = R.drawable.image_email) }),
    }
}
