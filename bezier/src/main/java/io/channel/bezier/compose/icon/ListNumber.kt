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

val BezierIcon.ListNumber: ImageVector
    get() {
        return _listNumber ?: ImageVector.Builder(
                name = "ListNumber",
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
                moveTo(4.604f, 3.0887f)
                curveTo(4.8478f, 3.2193f, 5.0001f, 3.4734f, 5.0001f, 3.75f)
                lineTo(5.0001f, 8.75f)
                curveTo(5.0001f, 9.1642f, 4.6643f, 9.5f, 4.2501f, 9.5f)
                curveTo(3.8359f, 9.5f, 3.5001f, 9.1642f, 3.5001f, 8.75f)
                lineTo(3.5001f, 5.1514f)
                lineTo(3.1661f, 5.374f)
                curveTo(2.8215f, 5.6038f, 2.3558f, 5.5107f, 2.126f, 5.166f)
                curveTo(1.8963f, 4.8214f, 1.9894f, 4.3557f, 2.334f, 4.126f)
                lineTo(3.834f, 3.126f)
                curveTo(4.0642f, 2.9725f, 4.3601f, 2.9582f, 4.604f, 3.0887f)
                close()
                moveTo(8.0f, 5.0f)
                curveTo(8.0f, 5.5523f, 8.4477f, 6.0f, 9.0f, 6.0f)
                lineTo(20.0f, 6.0f)
                curveTo(20.5523f, 6.0f, 21.0f, 5.5523f, 21.0f, 5.0f)
                curveTo(21.0f, 4.4477f, 20.5523f, 4.0f, 20.0f, 4.0f)
                lineTo(9.0f, 4.0f)
                curveTo(8.4477f, 4.0f, 8.0f, 4.4477f, 8.0f, 5.0f)
                close()
                moveTo(9.0f, 13.0f)
                curveTo(8.4477f, 13.0f, 8.0f, 12.5523f, 8.0f, 12.0f)
                curveTo(8.0f, 11.4477f, 8.4477f, 11.0f, 9.0f, 11.0f)
                lineTo(20.0f, 11.0f)
                curveTo(20.5523f, 11.0f, 21.0f, 11.4477f, 21.0f, 12.0f)
                curveTo(21.0f, 12.5523f, 20.5523f, 13.0f, 20.0f, 13.0f)
                lineTo(9.0f, 13.0f)
                close()
                moveTo(9.0f, 20.0f)
                curveTo(8.4477f, 20.0f, 8.0f, 19.5523f, 8.0f, 19.0f)
                curveTo(8.0f, 18.4477f, 8.4477f, 18.0f, 9.0f, 18.0f)
                lineTo(20.0f, 18.0f)
                curveTo(20.5523f, 18.0f, 21.0f, 18.4477f, 21.0f, 19.0f)
                curveTo(21.0f, 19.5523f, 20.5523f, 20.0f, 20.0f, 20.0f)
                lineTo(9.0f, 20.0f)
                close()
                moveTo(3.6839f, 16.7473f)
                curveTo(3.8482f, 16.5009f, 4.1771f, 16.4269f, 4.4311f, 16.5793f)
                curveTo(4.7407f, 16.765f, 4.7933f, 17.1922f, 4.538f, 17.4475f)
                lineTo(2.2197f, 19.7657f)
                curveTo(2.0052f, 19.9802f, 1.9411f, 20.3028f, 2.0572f, 20.5831f)
                curveTo(2.1733f, 20.8633f, 2.4467f, 21.046f, 2.7501f, 21.046f)
                lineTo(5.7501f, 21.046f)
                curveTo(6.1643f, 21.046f, 6.5001f, 20.7103f, 6.5001f, 20.296f)
                curveTo(6.5001f, 19.8818f, 6.1643f, 19.546f, 5.7501f, 19.546f)
                lineTo(4.5607f, 19.546f)
                lineTo(5.5986f, 18.5081f)
                curveTo(6.5439f, 17.5628f, 6.3492f, 15.9809f, 5.2029f, 15.2931f)
                curveTo(4.2623f, 14.7287f, 3.0443f, 15.0026f, 2.4359f, 15.9153f)
                lineTo(2.126f, 16.38f)
                curveTo(1.8963f, 16.7247f, 1.9894f, 17.1903f, 2.334f, 17.4201f)
                curveTo(2.6787f, 17.6498f, 3.1444f, 17.5567f, 3.3741f, 17.2121f)
                lineTo(3.6839f, 16.7473f)
                close()
            }
        }.build().also {
            _listNumber = it
        }
    }

private var _listNumber: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ListNumberIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.ListNumber,
            contentDescription = null,
    )
}
