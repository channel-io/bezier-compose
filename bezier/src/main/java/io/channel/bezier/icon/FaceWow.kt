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

val BezierIcons.FaceWow: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _faceWow ?: ImageVector.Builder(
                    name = "FaceWow",
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
                    moveTo(15.21f, 6.6f)
                    curveTo(16.060000000000002f, 6.6f, 16.41f, 7.21f, 16.41f, 8.7f)
                    curveTo(16.41f, 10.2f, 16.06f, 10.809999999999999f, 15.21f, 10.809999999999999f)
                    curveTo(14.370000000000001f, 10.809999999999999f, 14.010000000000002f, 10.2f, 14.010000000000002f, 8.7f)
                    curveTo(14.010000000000002f, 7.209999999999999f, 14.370000000000001f, 6.6f, 15.21f, 6.6f)
                    moveTo(12.0f, 11.0f)
                    curveTo(13.16f, 11.0f, 14.1f, 12.02f, 14.1f, 14.0f)
                    curveTo(14.1f, 15.98f, 13.16f, 17.0f, 12.0f, 17.0f)
                    curveTo(10.84f, 17.0f, 9.9f, 15.98f, 9.9f, 14.0f)
                    curveTo(9.9f, 12.02f, 10.84f, 11.0f, 12.0f, 11.0f)
                    moveTo(8.79f, 6.6f)
                    curveTo(9.629999999999999f, 6.6f, 9.989999999999998f, 7.21f, 9.989999999999998f, 8.7f)
                    curveTo(9.989999999999998f, 10.2f, 9.639999999999999f, 10.809999999999999f, 8.79f, 10.809999999999999f)
                    curveTo(7.9399999999999995f, 10.809999999999999f, 7.589999999999999f, 10.2f, 7.589999999999999f, 8.7f)
                    curveTo(7.589999999999999f, 7.209999999999999f, 7.939999999999999f, 6.6f, 8.79f, 6.6f)
                    moveTo(12.0f, 4.0f)
                    curveTo(7.59f, 4.0f, 4.0f, 7.59f, 4.0f, 12.0f)
                    curveTo(4.0f, 16.41f, 7.59f, 20.0f, 12.0f, 20.0f)
                    curveTo(16.41f, 20.0f, 20.0f, 16.41f, 20.0f, 12.0f)
                    curveTo(20.0f, 7.59f, 16.41f, 4.0f, 12.0f, 4.0f)
                    moveTo(12.0f, 2.0f)
                    curveTo(17.52f, 2.0f, 22.0f, 6.48f, 22.0f, 12.0f)
                    curveTo(22.0f, 17.52f, 17.52f, 22.0f, 12.0f, 22.0f)
                    curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f)
                    curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f)
                }
            }.build().also {
                _faceWow = it
            }
    }


private var _faceWow: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun FaceWowIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.FaceWow.imageVector,
            contentDescription = null,
    )
}
