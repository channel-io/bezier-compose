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

val BezierIcons.FullscreenExit: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_fullscreen_exit
        override val imageVector: ImageVector
            get() = _fullscreenExit ?: ImageVector.Builder(
                    name = "FullscreenExit",
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
                    moveTo(15.5f, 10.0f)
                    lineTo(21.0f, 10.0f)
                    lineTo(21.0f, 8.0f)
                    lineTo(16.0f, 8.0f)
                    lineTo(16.0f, 3.0f)
                    lineTo(14.0f, 3.0f)
                    lineTo(14.0f, 8.5f)
                    curveTo(14.0f, 9.327f, 14.673f, 10.0f, 15.5f, 10.0f)
                    moveTo(14.0f, 21.0f)
                    lineTo(16.0f, 21.0f)
                    lineTo(16.0f, 16.0f)
                    lineTo(21.0f, 16.0f)
                    lineTo(21.0f, 14.0f)
                    lineTo(15.5f, 14.0f)
                    curveTo(14.673f, 14.0f, 14.0f, 14.673f, 14.0f, 15.5f)
                    close()
                    moveTo(10.0f, 21.0f)
                    lineTo(8.0f, 21.0f)
                    lineTo(8.0f, 16.0f)
                    lineTo(3.0f, 16.0f)
                    lineTo(3.0f, 14.0f)
                    lineTo(8.5f, 14.0f)
                    curveTo(9.327f, 14.0f, 10.0f, 14.673f, 10.0f, 15.5f)
                    close()
                    moveTo(3.0f, 10.0f)
                    lineTo(8.5f, 10.0f)
                    curveTo(9.327f, 10.0f, 10.0f, 9.327f, 10.0f, 8.5f)
                    lineTo(10.0f, 3.0f)
                    lineTo(8.0f, 3.0f)
                    lineTo(8.0f, 8.0f)
                    lineTo(3.0f, 8.0f)
                    close()
                }
            }.build().also {
                _fullscreenExit = it
            }
    }


private var _fullscreenExit: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun FullscreenExitIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.FullscreenExit.imageVector,
            contentDescription = null,
    )
}
