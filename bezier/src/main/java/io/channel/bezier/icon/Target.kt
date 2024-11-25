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

val BezierIcons.Target: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_target
        override val imageVector: ImageVector
            get() = _target ?: ImageVector.Builder(
                    name = "Target",
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
                    moveTo(13.0f, 17.0f)
                    lineTo(13.0f, 19.93f)
                    arcTo(8.01f, 8.01f, 82.7246760962972f, isMoreThanHalf = false, isPositiveArc = false, 19.931f, 13.0f)
                    lineTo(17.001f, 13.0f)
                    lineTo(17.001f, 11.0f)
                    lineTo(19.931f, 11.0f)
                    arcTo(8.01f, 8.01f, 352.717345279252f, isMoreThanHalf = false, isPositiveArc = false, 13.001000000000001f, 4.07f)
                    lineTo(13.001000000000001f, 7.0f)
                    lineTo(11.001000000000001f, 7.0f)
                    lineTo(11.001000000000001f, 4.07f)
                    arcTo(8.01f, 8.01f, 262.73933704708463f, isMoreThanHalf = false, isPositiveArc = false, 4.068f, 11.0f)
                    lineTo(7.0f, 11.0f)
                    lineTo(7.0f, 13.0f)
                    lineTo(4.07f, 13.0f)
                    arcTo(8.01f, 8.01f, 172.71734527925202f, isMoreThanHalf = false, isPositiveArc = false, 11.0f, 19.93f)
                    lineTo(11.0f, 17.0f)
                    close()
                    moveTo(2.0f, 12.0f)
                    curveTo(2.0f, 6.486f, 6.486f, 2.0f, 12.0f, 2.0f)
                    curveTo(17.514f, 2.0f, 22.0f, 6.486f, 22.0f, 12.0f)
                    curveTo(22.0f, 17.514f, 17.514f, 22.0f, 12.0f, 22.0f)
                    curveTo(6.486000000000001f, 22.0f, 2.0f, 17.514f, 2.0f, 12.0f)
                    moveTo(10.0f, 12.0f)
                    arcTo(2.0f, 2.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = true, 14.001999999999999f, 12.0f)
                    arcTo(2.0f, 2.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 10.0f, 12.0f)
                }
            }.build().also {
                _target = it
            }
    }


private var _target: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TargetIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Target.imageVector,
            contentDescription = null,
    )
}
