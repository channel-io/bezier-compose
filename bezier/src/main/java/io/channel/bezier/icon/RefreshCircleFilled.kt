@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons

val BezierIcons.RefreshCircleFilled: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _refreshCircleFilled ?: ImageVector.Builder(
                    name = "RefreshCircleFilled",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                ) {
                    moveTo(18.2751f, 10.0973f)
                    curveTo(18.2751f, 10.2703f, 18.1341f, 10.4103f, 17.9621f, 10.4103f)
                    lineTo(14.4301f, 10.4103f)
                    curveTo(14.1511f, 10.4103f, 14.0111f, 10.0733f, 14.2091f, 9.87535f)
                    lineTo(15.5231f, 8.56135f)
                    curveTo(14.5771f, 7.62935f, 13.3291f, 7.11435f, 12.0001f, 7.11435f)
                    curveTo(9.23111f, 7.11435f, 6.97711f, 9.36735f, 6.97711f, 12.1373f)
                    curveTo(6.97711f, 14.9063f, 9.23111f, 17.1593f, 12.0001f, 17.1593f)
                    curveTo(14.7701f, 17.1593f, 17.0231f, 14.9063f, 17.0231f, 12.1373f)
                    lineTo(18.2731f, 12.1373f)
                    curveTo(18.2731f, 15.5953f, 15.4591f, 18.4093f, 12.0001f, 18.4093f)
                    curveTo(8.54111f, 18.4093f, 5.72711f, 15.5953f, 5.72711f, 12.1373f)
                    curveTo(5.72711f, 8.67835f, 8.54111f, 5.86435f, 12.0001f, 5.86435f)
                    curveTo(13.6631f, 5.86435f, 15.2261f, 6.50835f, 16.4081f, 7.67635f)
                    lineTo(17.7391f, 6.34435f)
                    curveTo(17.9371f, 6.14635f, 18.2751f, 6.28635f, 18.2751f, 6.56635f)
                    lineTo(18.2751f, 10.0973f)
                    close()
                    moveTo(12.0001f, 2.00037f)
                    curveTo(6.47712f, 2.00037f, 2.00012f, 6.47737f, 2.00012f, 12.0004f)
                    curveTo(2.00012f, 17.5224f, 6.47712f, 22.0004f, 12.0001f, 22.0004f)
                    curveTo(17.5231f, 22.0004f, 22.0001f, 17.5224f, 22.0001f, 12.0004f)
                    curveTo(22.0001f, 6.47737f, 17.5231f, 2.00037f, 12.0001f, 2.00037f)
                    close()
                }
            }.build().also {
                _refreshCircleFilled = it
            }
    }


private var _refreshCircleFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun RefreshCircleFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.RefreshCircleFilled.imageVector,
            contentDescription = null,
    )
}
