package io.channel.bezier.compose.component.avatar.properties

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import io.channel.bezier.compose.R
import io.channel.bezier.compose.component.avatar.AvatarRadiusFraction
import io.channel.bezier.shape.SmoothRoundedCornerShape

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
        Email(painter = { painterResource(id = R.drawable.image_email) });

        fun createShape(size: BezierAvatarSize): Shape {
            return when (size) {
                BezierAvatarSize.Size16,
                BezierAvatarSize.Size20,
                BezierAvatarSize.Size24,
                BezierAvatarSize.Size30,
                BezierAvatarSize.Size36 -> CircleShape
                BezierAvatarSize.Size42,
                BezierAvatarSize.Size48,
                BezierAvatarSize.Size72,
                BezierAvatarSize.Size90,
                BezierAvatarSize.Size120 -> SmoothRoundedCornerShape(AvatarRadiusFraction)
            }
        }
    }
}
