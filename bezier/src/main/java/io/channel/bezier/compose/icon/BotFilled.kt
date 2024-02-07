@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.compose.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.compose.BezierIcon

val BezierIcon.BotFilled: ImageVector
    get() {
        return _botFilled ?: ImageVector.Builder(
                name = "BotFilled",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
                    pathFillType = PathFillType.EvenOdd,
            ) {
                moveTo(12.0041f, 2.0021f)
                curveTo(13.6481f, 2.0021f, 14.9801f, 3.3341f, 14.9801f, 4.9781f)
                lineTo(9.0281f, 4.9781f)
                curveTo(9.0281f, 3.3341f, 10.3611f, 2.0021f, 12.0041f, 2.0021f)
                close()
                moveTo(14.4124f, 12.9743f)
                curveTo(14.4124f, 14.7613f, 14.8344f, 15.4903f, 15.8444f, 15.4903f)
                curveTo(16.8544f, 15.4903f, 17.2764f, 14.7613f, 17.2764f, 12.9743f)
                curveTo(17.2764f, 11.1883f, 16.8544f, 10.4593f, 15.8444f, 10.4593f)
                curveTo(14.8344f, 10.4593f, 14.4124f, 11.1883f, 14.4124f, 12.9743f)
                close()
                moveTo(6.7324f, 12.9743f)
                curveTo(6.7324f, 14.7613f, 7.1544f, 15.4903f, 8.1644f, 15.4903f)
                curveTo(9.1744f, 15.4903f, 9.5964f, 14.7613f, 9.5964f, 12.9743f)
                curveTo(9.5964f, 11.1883f, 9.1744f, 10.4593f, 8.1644f, 10.4593f)
                curveTo(7.1544f, 10.4593f, 6.7324f, 11.1883f, 6.7324f, 12.9743f)
                close()
                moveTo(4.1874f, 5.9743f)
                lineTo(19.8214f, 5.9743f)
                curveTo(21.0274f, 5.9743f, 22.0044f, 6.9513f, 22.0044f, 8.1573f)
                lineTo(22.0044f, 17.7913f)
                curveTo(22.0044f, 18.9973f, 21.0274f, 19.9743f, 19.8214f, 19.9743f)
                lineTo(4.1874f, 19.9743f)
                curveTo(2.9814f, 19.9743f, 2.0044f, 18.9973f, 2.0044f, 17.7913f)
                lineTo(2.0044f, 8.1573f)
                curveTo(2.0044f, 6.9513f, 2.9814f, 5.9743f, 4.1874f, 5.9743f)
                close()
            }
        }.build().also {
            _botFilled = it
        }
    }

private var _botFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun BotFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.BotFilled,
            contentDescription = null,
    )
}
