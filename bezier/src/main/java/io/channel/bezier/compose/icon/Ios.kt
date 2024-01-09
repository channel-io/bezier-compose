@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.compose.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.compose.BezierIcon

val BezierIcon.Ios: ImageVector
    get() {
        return _ios ?: ImageVector.Builder(
                name = "Ios",
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
                moveTo(5.0f, 2.0f)
                curveTo(3.8954f, 2.0f, 3.0f, 2.8954f, 3.0f, 4.0f)
                lineTo(3.0f, 20.0f)
                curveTo(3.0f, 21.1046f, 3.8954f, 22.0f, 5.0f, 22.0f)
                lineTo(13.0f, 22.0f)
                curveTo(13.0771f, 22.0f, 13.1532f, 21.9956f, 13.2281f, 21.9871f)
                curveTo(13.2905f, 21.996f, 13.3525f, 22.0005f, 13.4139f, 22.0005f)
                curveTo(13.6951f, 22.0005f, 14.0431f, 21.8744f, 14.4289f, 21.7346f)
                curveTo(14.9087f, 21.5606f, 15.4469f, 21.3655f, 15.9879f, 21.3655f)
                curveTo(16.4727f, 21.3655f, 16.8931f, 21.5226f, 17.3079f, 21.6776f)
                curveTo(17.712f, 21.8285f, 18.1109f, 21.9775f, 18.5589f, 21.9775f)
                curveTo(20.5359f, 21.9775f, 21.9999f, 17.8565f, 21.9999f, 17.8565f)
                curveTo(21.9999f, 17.8565f, 19.9059f, 17.0465f, 19.9059f, 14.6935f)
                curveTo(19.9059f, 12.6075f, 21.5869f, 11.7485f, 21.5869f, 11.7485f)
                curveTo(21.5869f, 11.7485f, 20.7269f, 10.1935f, 18.5419f, 10.1935f)
                curveTo(17.7696f, 10.1935f, 17.1062f, 10.4609f, 16.5869f, 10.6703f)
                curveTo(16.2529f, 10.8049f, 15.9784f, 10.9155f, 15.7729f, 10.9155f)
                curveTo(15.516f, 10.9155f, 15.2063f, 10.7962f, 14.8466f, 10.6576f)
                curveTo(14.3481f, 10.4656f, 13.7535f, 10.2365f, 13.0699f, 10.2365f)
                curveTo(11.2589f, 10.2365f, 9.3269f, 11.8585f, 9.3269f, 14.9495f)
                curveTo(9.3269f, 16.2803f, 9.7365f, 17.749f, 10.3459f, 19.0f)
                lineTo(5.0f, 19.0f)
                lineTo(5.0f, 5.0f)
                lineTo(13.0f, 5.0f)
                lineTo(13.0f, 9.0f)
                lineTo(15.0f, 9.0f)
                lineTo(15.0f, 4.0f)
                curveTo(15.0f, 2.8954f, 14.1046f, 2.0f, 13.0f, 2.0f)
                lineTo(5.0f, 2.0f)
                close()
                moveTo(17.9572f, 8.9406f)
                curveTo(18.9722f, 7.7206f, 18.7612f, 6.4556f, 18.7612f, 6.4556f)
                curveTo(18.7612f, 6.4556f, 17.3412f, 6.4616f, 16.3192f, 7.8076f)
                curveTo(15.4112f, 9.0046f, 15.6432f, 10.0296f, 15.6432f, 10.0296f)
                curveTo(15.6432f, 10.0296f, 16.8742f, 10.2426f, 17.9572f, 8.9406f)
                close()
            }
        }.build().also {
            _ios = it
        }
    }

private var _ios: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun IosIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Ios,
            contentDescription = null,
    )
}
