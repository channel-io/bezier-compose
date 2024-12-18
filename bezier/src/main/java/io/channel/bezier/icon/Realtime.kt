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

val BezierIcons.Realtime: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_realtime
        override val imageVector: ImageVector
            get() = _realtime ?: ImageVector.Builder(
                    name = "Realtime",
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
                    moveTo(12.0f, 20.0f)
                    curveTo(7.59f, 20.0f, 4.0f, 16.411f, 4.0f, 12.0f)
                    curveTo(4.0f, 7.588999999999999f, 7.59f, 4.0f, 12.0f, 4.0f)
                    curveTo(13.846f, 4.0f, 15.542f, 4.634f, 16.897f, 5.688f)
                    lineTo(16.206999999999997f, 6.379f)
                    curveTo(13.456999999999997f, 4.318999999999999f, 9.529999999999998f, 4.531f, 7.029999999999998f, 7.029999999999999f)
                    lineTo(8.090999999999998f, 8.091f)
                    curveTo(10.003999999999998f, 6.178999999999999f, 12.977999999999998f, 5.9719999999999995f, 15.130999999999997f, 7.454999999999999f)
                    lineTo(14.367999999999997f, 8.218f)
                    arcTo(4.44f, 4.44f, 302.2918087775544f, isMoreThanHalf = false, isPositiveArc = false, 11.001999999999997f, 7.644f)
                    arcTo(4.46f, 4.46f, 257.0784912951103f, isMoreThanHalf = false, isPositiveArc = false, 8.841999999999997f, 8.841000000000001f)
                    lineTo(9.901999999999997f, 9.901000000000002f)
                    arcTo(2.95f, 2.95f, 224.8966824503196f, isMoreThanHalf = false, isPositiveArc = true, 11.335999999999997f, 9.107000000000001f)
                    arcTo(2.92f, 2.92f, 257.3809136933214f, isMoreThanHalf = false, isPositiveArc = true, 13.253999999999996f, 9.332f)
                    lineTo(12.511999999999997f, 10.074000000000002f)
                    arcTo(2.0f, 2.0f, 285.6549586833665f, isMoreThanHalf = false, isPositiveArc = false, 12.0f, 10.0f)
                    arcTo(2.0f, 2.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = false, 14.0f, 12.0f)
                    curveTo(14.0f, 11.822f, 13.97f, 11.653f, 13.926f, 11.49f)
                    lineTo(18.312f, 7.104f)
                    arcTo(7.95f, 7.95f, 321.96857152582896f, isMoreThanHalf = false, isPositiveArc = true, 20.0f, 12.0f)
                    curveTo(20.0f, 16.411f, 16.411f, 20.0f, 12.0f, 20.0f)
                    moveTo(12.0f, 2.0f)
                    curveTo(6.486f, 2.0f, 2.0f, 6.486f, 2.0f, 12.0f)
                    curveTo(2.0f, 17.514f, 6.486f, 22.0f, 12.0f, 22.0f)
                    curveTo(17.514f, 22.0f, 22.0f, 17.514f, 22.0f, 12.0f)
                    curveTo(22.0f, 6.486000000000001f, 17.514f, 2.0f, 12.0f, 2.0f)
                }
            }.build().also {
                _realtime = it
            }
    }


private var _realtime: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun RealtimeIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Realtime.imageVector,
            contentDescription = null,
    )
}
