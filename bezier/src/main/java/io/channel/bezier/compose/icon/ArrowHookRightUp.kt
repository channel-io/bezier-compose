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

val BezierIcon.ArrowHookRightUp: ImageVector
    get() {
        return _arrowHookRightUp ?: ImageVector.Builder(
                name = "ArrowHookRightUp",
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
                moveTo(9.5005f, 8.0001f)
                lineTo(18.7935f, 8.0001f)
                lineTo(15.5273f, 4.7331f)
                curveTo(15.1369f, 4.3426f, 15.137f, 3.7096f, 15.5274f, 3.3191f)
                curveTo(15.9179f, 2.9286f, 16.551f, 2.9286f, 16.9415f, 3.3191f)
                lineTo(21.5615f, 7.9391f)
                curveTo(22.1465f, 8.5241f, 22.1465f, 9.4761f, 21.5615f, 10.0611f)
                lineTo(16.9415f, 14.6802f)
                curveTo(16.551f, 15.0706f, 15.9179f, 15.0706f, 15.5275f, 14.6801f)
                curveTo(15.137f, 14.2896f, 15.137f, 13.6565f, 15.5275f, 13.266f)
                lineTo(18.7935f, 10.0001f)
                lineTo(9.5005f, 10.0001f)
                curveTo(7.0195f, 10.0001f, 5.0005f, 12.0191f, 5.0005f, 14.5001f)
                curveTo(5.0005f, 16.9811f, 7.0195f, 19.0001f, 9.5005f, 19.0001f)
                lineTo(13.0005f, 19.0001f)
                curveTo(13.5527f, 19.0001f, 14.0005f, 19.4478f, 14.0005f, 20.0001f)
                curveTo(14.0005f, 20.5524f, 13.5527f, 21.0001f, 13.0005f, 21.0001f)
                lineTo(9.5005f, 21.0001f)
                curveTo(5.9165f, 21.0001f, 3.0005f, 18.0841f, 3.0005f, 14.5001f)
                curveTo(3.0005f, 10.9161f, 5.9165f, 8.0001f, 9.5005f, 8.0001f)
                close()
            }
        }.build().also {
            _arrowHookRightUp = it
        }
    }

private var _arrowHookRightUp: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ArrowHookRightUpIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.ArrowHookRightUp,
            contentDescription = null,
    )
}
