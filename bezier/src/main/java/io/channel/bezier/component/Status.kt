package io.channel.bezier.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.channel.bezier.compose.R

sealed interface StatusType {
    sealed class ColoredStatus(val colorId: Int) : StatusType
    sealed class IconStatus(val iconId: Int, val tintColorId: Int) : StatusType

    data object Online : ColoredStatus(R.color.iconAccentGreen)
    data object Offline : ColoredStatus(R.color.iconNeutral)
    data object Paused : IconStatus(R.drawable.icon_moon_filled, R.color.iconAccentYellow)
    data object Lock : IconStatus(R.drawable.icon_lock, R.color.iconNeutralHeavy)
    data object OnlineDoNotDisturb : IconStatus(R.drawable.icon_moon_filled, R.color.iconAccentGreen)
    data object OfflineDoNotDisturb : IconStatus(R.drawable.icon_moon_filled, R.color.iconAccentYellow)
}

enum class StatusSize(
        val size: Dp,
        val borderWidth: Dp,
) {
    M(12.dp, 2.dp),
    L(20.dp, 3.dp);
}

@Composable
fun Status(
        type: StatusType,
        modifier: Modifier = Modifier,
        size: StatusSize = StatusSize.M,
) {
    Box(
            modifier = modifier
                    .size(size.size)
                    .background(
                            color = colorResource(id = R.color.surfaceHighest),
                            shape = CircleShape,
                    )
                    .padding(size.borderWidth),
            contentAlignment = Alignment.Center,
    ) {
        when (type) {
            is StatusType.ColoredStatus -> Box(
                    modifier = Modifier
                            .fillMaxSize()
                            .align(Alignment.Center)
                            .background(
                                    color = colorResource(id = type.colorId),
                                    shape = CircleShape,
                            ),
            )

            is StatusType.IconStatus -> Icon(
                    modifier = Modifier.fillMaxSize(),
                    painter = painterResource(id = type.iconId),
                    contentDescription = null,
                    tint = colorResource(id = type.tintColorId),
            )
        }
    }
}

fun resolveStatus(isOnline: Boolean?, doNotDisturb: Boolean, canOffline: Boolean = false): StatusType? {
    return when {
        doNotDisturb && isOnline == true -> StatusType.OnlineDoNotDisturb
        doNotDisturb && isOnline == false -> StatusType.OfflineDoNotDisturb
        isOnline == true -> StatusType.Online
        canOffline -> StatusType.Offline
        else -> null
    }
}

@Preview(showBackground = true)
@Composable
private fun StatusPreview() {
    val statuses = listOf(
            StatusType.Online,
            StatusType.Offline,
            StatusType.Paused,
            StatusType.Lock,
            StatusType.OnlineDoNotDisturb,
            StatusType.OfflineDoNotDisturb,
    )

    Row {
        statuses.forEach { type ->
            Column(
                    modifier = Modifier.width(IntrinsicSize.Min),
                    horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Box(
                        modifier = Modifier
                                .background(Color.LightGray)
                                .fillMaxWidth()
                                .padding(8.dp),
                        contentAlignment = Alignment.Center,
                ) {
                    Status(type = type, size = StatusSize.M)
                }
                Text(type.javaClass.simpleName, modifier = Modifier.padding(horizontal = 8.dp), fontSize = 8.sp)
            }
        }
    }
}
