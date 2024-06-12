@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

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

val BezierIcons.Hashtag: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _hashtag ?: ImageVector.Builder(
                    name = "Hashtag",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                        pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(10.679f, 5.516f)
                    arcTo(1.0f, 1.0f, 280.30146197485567f, isMoreThanHalf = false, isPositiveArc = true, 11.484f, 6.679f)
                    lineTo(11.244f, 8.0f)
                    lineTo(14.211f, 8.0f)
                    lineTo(14.516f, 6.321f)
                    arcTo(1.0f, 1.0f, 190.30997100176828f, isMoreThanHalf = false, isPositiveArc = true, 16.484f, 6.678999999999999f)
                    lineTo(16.244f, 8.0f)
                    lineTo(17.5f, 8.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = true, 17.5f, 10.0f)
                    lineTo(15.879999999999999f, 10.0f)
                    lineTo(15.152999999999999f, 14.0f)
                    lineTo(16.5f, 14.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = true, 16.5f, 16.0f)
                    lineTo(14.79f, 16.0f)
                    lineTo(14.484f, 17.679f)
                    arcTo(1.0f, 1.0f, 10.309970398238445f, isMoreThanHalf = true, isPositiveArc = true, 12.516f, 17.320999999999998f)
                    lineTo(12.756f, 15.999999999999998f)
                    lineTo(9.79f, 15.999999999999998f)
                    lineTo(9.485f, 17.679f)
                    arcTo(1.0f, 1.0f, 10.309970398238445f, isMoreThanHalf = true, isPositiveArc = true, 7.5169999999999995f, 17.320999999999998f)
                    lineTo(7.756f, 16.0f)
                    lineTo(6.5f, 16.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = true, 6.5f, 14.0f)
                    lineTo(8.120000000000001f, 14.0f)
                    lineTo(8.847000000000001f, 10.0f)
                    lineTo(7.5f, 10.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 8.0f)
                    lineTo(9.21f, 8.0f)
                    lineTo(9.516f, 6.321f)
                    arcTo(1.0f, 1.0f, 190.30146197485564f, isMoreThanHalf = false, isPositiveArc = true, 10.679f, 5.516f)
                    moveTo(13.12f, 14.0f)
                    lineTo(13.847f, 10.0f)
                    lineTo(10.88f, 10.0f)
                    lineTo(10.153f, 14.0f)
                    close()
                }
            }.build().also {
                _hashtag = it
            }
    }


private var _hashtag: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun HashtagIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Hashtag.imageVector,
            contentDescription = null,
    )
}
