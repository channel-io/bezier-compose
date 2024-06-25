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

val BezierIcons.Briefcase: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _briefcase ?: ImageVector.Builder(
                    name = "Briefcase",
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
                    moveTo(20.0f, 14.0f)
                    lineTo(4.0f, 14.0f)
                    lineTo(4.0f, 8.0f)
                    lineTo(20.0f, 8.0f)
                    close()
                    moveTo(20.0f, 18.0f)
                    lineTo(4.0f, 18.0f)
                    lineTo(4.0f, 16.0f)
                    lineTo(20.0f, 16.0f)
                    close()
                    moveTo(15.0f, 6.0f)
                    lineTo(9.0f, 6.0f)
                    lineTo(9.0f, 5.0f)
                    lineTo(15.0f, 5.0f)
                    close()
                    moveTo(17.0f, 6.0f)
                    lineTo(20.5f, 6.0f)
                    curveTo(21.326999999999998f, 6.0f, 22.0f, 6.673f, 22.0f, 7.5f)
                    lineTo(22.0f, 18.5f)
                    curveTo(22.0f, 19.326999999999998f, 21.326999999999998f, 20.0f, 20.5f, 20.0f)
                    lineTo(3.5f, 20.0f)
                    curveTo(2.673f, 20.0f, 2.0f, 19.326999999999998f, 2.0f, 18.5f)
                    lineTo(2.0f, 7.5f)
                    curveTo(2.0f, 6.673f, 2.673f, 6.0f, 3.5f, 6.0f)
                    lineTo(7.0f, 6.0f)
                    lineTo(7.0f, 4.5f)
                    curveTo(7.0f, 3.673f, 7.673f, 3.0f, 8.5f, 3.0f)
                    lineTo(15.5f, 3.0f)
                    curveTo(16.326999999999998f, 3.0f, 17.0f, 3.673f, 17.0f, 4.5f)
                    close()
                    moveTo(14.0f, 13.0f)
                    lineTo(10.0f, 13.0f)
                    lineTo(10.0f, 11.0f)
                    lineTo(14.0f, 11.0f)
                    close()
                }
            }.build().also {
                _briefcase = it
            }
    }


private var _briefcase: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun BriefcaseIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Briefcase.imageVector,
            contentDescription = null,
    )
}
