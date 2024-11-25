@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

import androidx.annotation.DrawableRes
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
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons
import io.channel.bezier.compose.R

val BezierIcons.Bot: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_bot
        override val imageVector: ImageVector
            get() = _bot ?: ImageVector.Builder(
                    name = "Bot",
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
                    moveTo(12.023f, 2.0f)
                    arcTo(3.0f, 3.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 15.023f, 5.0f)
                    lineTo(9.023f, 5.0f)
                    arcTo(3.0f, 3.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 12.023f, 2.0f)
                    moveTo(20.0f, 19.998f)
                    lineTo(4.0f, 19.998f)
                    arcTo(2.0f, 2.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 2.0f, 17.998f)
                    lineTo(2.0f, 7.998000000000001f)
                    arcTo(2.0f, 2.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 4.0f, 5.998000000000001f)
                    lineTo(20.0f, 5.998000000000001f)
                    arcTo(2.0f, 2.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 22.0f, 7.998000000000001f)
                    lineTo(22.0f, 17.998f)
                    arcTo(2.0f, 2.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 20.0f, 19.998f)
                    moveTo(20.0f, 17.998f)
                    lineTo(20.0f, 7.998000000000001f)
                    lineTo(4.0f, 7.998000000000001f)
                    lineTo(4.0f, 17.998f)
                    close()
                    moveTo(6.742f, 12.972f)
                    curveTo(6.742f, 14.759f, 7.164f, 15.488f, 8.174f, 15.488f)
                    curveTo(9.184f, 15.488f, 9.606f, 14.759f, 9.606f, 12.972f)
                    curveTo(9.606f, 11.184999999999999f, 9.184f, 10.456999999999999f, 8.174f, 10.456999999999999f)
                    curveTo(7.164f, 10.456999999999999f, 6.741999999999999f, 11.187f, 6.741999999999999f, 12.972f)
                    moveTo(15.854f, 15.488f)
                    curveTo(14.844f, 15.488f, 14.421999999999999f, 14.759f, 14.421999999999999f, 12.972f)
                    curveTo(14.421999999999999f, 11.184999999999999f, 14.844f, 10.456999999999999f, 15.854f, 10.456999999999999f)
                    curveTo(16.863999999999997f, 10.456999999999999f, 17.285999999999998f, 11.187f, 17.285999999999998f, 12.972f)
                    curveTo(17.285999999999998f, 14.759f, 16.863999999999997f, 15.488f, 15.853999999999997f, 15.488f)
                }
            }.build().also {
                _bot = it
            }
    }


private var _bot: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun BotIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Bot.imageVector,
            contentDescription = null,
    )
}
