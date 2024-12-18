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

val BezierIcons.Cookie: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_cookie
        override val imageVector: ImageVector
            get() = _cookie ?: ImageVector.Builder(
                    name = "Cookie",
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
                    moveTo(4.005f, 12.0f)
                    curveTo(4.005f, 16.41f, 7.593999999999999f, 20.0f, 12.004999999999999f, 20.0f)
                    curveTo(16.415999999999997f, 20.0f, 20.005f, 16.41f, 20.005f, 12.0f)
                    quadTo(20.005f, 11.656f, 19.971999999999998f, 11.303f)
                    arcTo(8.216f, 8.216f, 96.26717494490829f, isMoreThanHalf = false, isPositiveArc = true, 12.701999999999998f, 4.033000000000001f)
                    arcTo(8.0f, 8.0f, 275.21022449473537f, isMoreThanHalf = false, isPositiveArc = false, 12.005f, 4.0f)
                    curveTo(7.594000000000001f, 4.0f, 4.005000000000001f, 7.589f, 4.005000000000001f, 12.0f)
                    moveTo(21.677999999999997f, 9.35f)
                    lineTo(21.827999999999996f, 10.167f)
                    curveTo(21.946999999999996f, 10.802f, 22.004999999999995f, 11.402f, 22.004999999999995f, 12.0f)
                    curveTo(22.004999999999995f, 17.514f, 17.518999999999995f, 22.0f, 12.004999999999995f, 22.0f)
                    curveTo(6.490999999999996f, 22.0f, 2.0049999999999955f, 17.514f, 2.0049999999999955f, 12.0f)
                    curveTo(2.0049999999999955f, 6.486000000000001f, 6.490999999999995f, 2.0f, 12.004999999999995f, 2.0f)
                    curveTo(12.594999999999995f, 2.0f, 13.212999999999996f, 2.06f, 13.837999999999996f, 2.175f)
                    lineTo(14.654999999999996f, 2.327f)
                    lineTo(14.654999999999996f, 3.157f)
                    arcTo(6.207f, 6.207f, 179.87093518611024f, isMoreThanHalf = false, isPositiveArc = false, 20.846999999999994f, 9.35f)
                    close()
                    moveTo(10.0f, 7.0f)
                    arcTo(1.75f, 1.75f, 270.0f, isMoreThanHalf = true, isPositiveArc = true, 10.0f, 10.5f)
                    arcTo(1.75f, 1.75f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 10.0f, 7.0f)
                    moveTo(15.0f, 11.5f)
                    arcTo(1.75f, 1.75f, 270.0f, isMoreThanHalf = true, isPositiveArc = false, 15.0f, 15.0f)
                    arcTo(1.75f, 1.75f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 15.0f, 11.5f)
                    moveTo(10.25f, 16.75f)
                    arcTo(1.75f, 1.75f, 178.61405925869818f, isMoreThanHalf = true, isPositiveArc = true, 13.749f, 16.749f)
                    arcTo(1.75f, 1.75f, 1.3531909396708133f, isMoreThanHalf = false, isPositiveArc = true, 10.25f, 16.75f)
                }
            }.build().also {
                _cookie = it
            }
    }


private var _cookie: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CookieIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Cookie.imageVector,
            contentDescription = null,
    )
}
