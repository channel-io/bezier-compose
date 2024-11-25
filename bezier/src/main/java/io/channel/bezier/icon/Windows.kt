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

val BezierIcons.Windows: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_windows
        override val imageVector: ImageVector
            get() = _windows ?: ImageVector.Builder(
                    name = "Windows",
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
                    moveTo(21.0f, 11.573f)
                    lineTo(21.0f, 2.966f)
                    lineTo(11.223f, 4.41f)
                    lineTo(11.223f, 11.614f)
                    close()
                    moveTo(3.0f, 5.626f)
                    lineTo(10.361f, 4.538f)
                    lineTo(10.361f, 11.618f)
                    lineTo(3.0010000000000003f, 11.648f)
                    close()
                    moveTo(3.0f, 18.513f)
                    lineTo(3.0f, 12.421000000000003f)
                    lineTo(10.361f, 12.451000000000002f)
                    lineTo(10.361f, 19.544000000000004f)
                    close()
                    moveTo(21.0f, 21.034f)
                    lineTo(11.223f, 19.665f)
                    lineTo(11.223f, 12.454999999999998f)
                    lineTo(21.0f, 12.495999999999999f)
                    close()
                }
            }.build().also {
                _windows = it
            }
    }


private var _windows: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun WindowsIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Windows.imageVector,
            contentDescription = null,
    )
}
