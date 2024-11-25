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

val BezierIcons.WindowsMinimize: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_windows_minimize
        override val imageVector: ImageVector
            get() = _windowsMinimize ?: ImageVector.Builder(
                    name = "WindowsMinimize",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(7.0f, 12.0f)
                    lineTo(17.0f, 12.0f)
                    lineTo(17.0f, 13.0f)
                    lineTo(7.0f, 13.0f)
                    close()
                }
            }.build().also {
                _windowsMinimize = it
            }
    }


private var _windowsMinimize: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun WindowsMinimizeIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.WindowsMinimize.imageVector,
            contentDescription = null,
    )
}
