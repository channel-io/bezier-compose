package io.channel.bezier.compose.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.channel.bezier.compose.BezierTheme

@Composable
fun Alert(
        modifier: Modifier = Modifier,
        alert: Int,
        unread: Int,
) {
    if (alert > 0) {
        Box(
                modifier = modifier
                        .background(
                                shape = CircleShape,
                                color = BezierTheme.colors.bgtxtRedNormal,
                        )
                        .padding(
                                vertical = 2.dp,
                                horizontal = 5.dp
                        )
        ) {
            val alertCount = if (alert > 99) {
                "99+"
            } else {
                alert.toString()
            }

            Text(
                    modifier = Modifier
                            .widthIn(min = 10.dp),
                    text = alertCount,
                    fontWeight = FontWeight.Bold,
                    color = BezierTheme.colors.bgtxtAbsoluteWhiteDark,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center,
            )
        }
    } else if (unread > 0) {
        Box(
                modifier = modifier
                        .size(6.dp)
                        .background(
                                shape = RoundedCornerShape(3.dp),
                                color = BezierTheme.colors.bgtxtRedNormal,
                        ),
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun AlertColumnPreview() {
    Column {
        Alert(
                alert = 1,
                unread = 0,
                modifier = Modifier.padding(bottom = 10.dp),
        )

        Alert(
                alert = 10,
                unread = 0,
                modifier = Modifier.padding(bottom = 10.dp),
        )

        Alert(
                alert = 100,
                unread = 0,
                modifier = Modifier.padding(bottom = 10.dp),
        )

        Alert(
                alert = 0,
                unread = 10,
                modifier = Modifier.padding(bottom = 10.dp),
        )

        Alert(
                alert = 10,
                unread = 10,
                modifier = Modifier.padding(bottom = 10.dp),
        )

        Alert(
                alert = 0,
                unread = 0,
                modifier = Modifier.padding(bottom = 10.dp),
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun AlertRowPreview() {
    Row {
        Alert(
                alert = 1,
                unread = 0,
                modifier = Modifier.padding(end = 10.dp),
        )

        Alert(
                alert = 100,
                unread = 0,
                modifier = Modifier.padding(end = 10.dp),
        )

        Alert(
                alert = 0,
                unread = 10,
                modifier = Modifier.padding(end = 10.dp),
        )
    }
}
