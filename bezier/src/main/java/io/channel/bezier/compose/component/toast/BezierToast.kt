package io.channel.bezier.compose.component.toast

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.icon.ErrorTriangleFilled

@Composable
fun BezierToast(
        text: String,
        bezierIcon: BezierIcon,
) {
    Row(
            modifier = Modifier
                    .background(
                            color = BezierTheme.colorSchemes.bgBlackDarker.color,
                            shape = RoundedCornerShape(20.dp),
                    )
                    .padding(horizontal = 14.dp, vertical = 10.dp),
            horizontalArrangement = Arrangement.spacedBy(6.dp),
    ) {
        Icon(
                modifier = Modifier
                        .padding(vertical = 3.dp)
                        .size(20.dp),
                imageVector = bezierIcon.imageVector,
                tint = BezierTheme.colorSchemes.fgAbsoluteWhiteLight.color,
                contentDescription = bezierIcon.imageVector.name,
        )

        Text(
                modifier = Modifier.padding(vertical = 4.dp),
                text = text,
                fontStyle = BezierTheme.typography.caption1SemiBold.fontStyle,
                color = BezierTheme.colorSchemes.fgAbsoluteWhiteDark.color,
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun BezierToastPreview() {
    BezierTheme {
        Box(
                modifier = Modifier
                        .size(200.dp)
                        .padding(10.dp),
        ) {
            BezierToast(
                    text = "Lorem ipsum dolor sit amet, consectetu",
                    bezierIcon = BezierIcons.ErrorTriangleFilled,
            )
        }
    }
}
