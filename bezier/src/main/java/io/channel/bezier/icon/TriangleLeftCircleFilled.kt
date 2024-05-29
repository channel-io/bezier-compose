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

val BezierIcon.TriangleLeftCircleFilled: ImageVector
    get() {
        return io.channel.bezier.icon._triangleLeftCircleFilled ?: ImageVector.Builder(
                name = "TriangleLeftCircleFilled",
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
                moveTo(13.8083f, 7.3556f)
                curveTo(13.8233f, 7.3556f, 13.8363f, 7.3616f, 13.8513f, 7.3636f)
                curveTo(13.9053f, 7.3696f, 13.9553f, 7.3896f, 13.9983f, 7.4216f)
                curveTo(14.0133f, 7.4326f, 14.0273f, 7.4426f, 14.0393f, 7.4566f)
                curveTo(14.0863f, 7.5076f, 14.1223f, 7.5716f, 14.1223f, 7.6516f)
                lineTo(14.1223f, 16.3706f)
                curveTo(14.1223f, 16.4506f, 14.0863f, 16.5146f, 14.0393f, 16.5656f)
                curveTo(14.0273f, 16.5786f, 14.0133f, 16.5896f, 13.9993f, 16.6006f)
                curveTo(13.9553f, 16.6326f, 13.9053f, 16.6526f, 13.8513f, 16.6586f)
                curveTo(13.8363f, 16.6606f, 13.8233f, 16.6676f, 13.8083f, 16.6666f)
                curveTo(13.7463f, 16.6636f, 13.6843f, 16.6466f, 13.6303f, 16.6016f)
                lineTo(8.3993f, 12.2416f)
                curveTo(8.2553f, 12.1216f, 8.2553f, 11.9006f, 8.3993f, 11.7806f)
                lineTo(13.6303f, 7.4206f)
                curveTo(13.6843f, 7.3766f, 13.7463f, 7.3586f, 13.8083f, 7.3556f)
                close()
                moveTo(12.0003f, 2.0006f)
                curveTo(6.4773f, 2.0006f, 2.0003f, 6.4776f, 2.0003f, 12.0006f)
                curveTo(2.0003f, 17.5226f, 6.4773f, 22.0006f, 12.0003f, 22.0006f)
                curveTo(17.5223f, 22.0006f, 22.0003f, 17.5226f, 22.0003f, 12.0006f)
                curveTo(22.0003f, 6.4776f, 17.5223f, 2.0006f, 12.0003f, 2.0006f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._triangleLeftCircleFilled = it
        }
    }

private var _triangleLeftCircleFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TriangleLeftCircleFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.TriangleLeftCircleFilled,
            contentDescription = null,
    )
}