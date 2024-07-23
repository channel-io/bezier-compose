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

val BezierIcons.PlayFilled: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _playFilled ?: ImageVector.Builder(
                    name = "PlayFilled",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(9.147f, 20.297f)
                    lineTo(18.602f, 13.679f)
                    arcTo(2.0f, 2.0f, 55.011013754539995f, isMoreThanHalf = false, isPositiveArc = false, 18.564f, 10.376000000000001f)
                    lineTo(9.11f, 4.073f)
                    curveTo(7.78f, 3.187f, 6.0f, 4.14f, 6.0f, 5.737f)
                    lineTo(6.0f, 18.659f)
                    curveTo(6.0f, 20.276999999999997f, 7.821f, 21.224999999999998f, 9.147f, 20.296999999999997f)
                }
            }.build().also {
                _playFilled = it
            }
    }


private var _playFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun PlayFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.PlayFilled.imageVector,
            contentDescription = null,
    )
}
