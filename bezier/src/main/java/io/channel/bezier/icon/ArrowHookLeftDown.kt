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

val BezierIcons.ArrowHookLeftDown: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_arrow_hook_left_down
        override val imageVector: ImageVector
            get() = _arrowHookLeftDown ?: ImageVector.Builder(
                    name = "ArrowHookLeftDown",
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
                    moveTo(14.5f, 3.026f)
                    lineTo(11.0f, 3.026f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = false, 11.0f, 5.026f)
                    lineTo(14.5f, 5.026f)
                    curveTo(16.981f, 5.026f, 19.0f, 7.045999999999999f, 19.0f, 9.526f)
                    curveTo(19.0f, 12.008f, 16.981f, 14.026f, 14.5f, 14.026f)
                    lineTo(5.181f, 14.026f)
                    lineTo(8.472999999999999f, 10.733f)
                    arcTo(1.0f, 1.0f, 42.62621028505733f, isMoreThanHalf = false, isPositiveArc = false, 7.06f, 9.32f)
                    lineTo(2.4399999999999995f, 13.940000000000001f)
                    arcTo(1.5f, 1.5f, 224.96434928354574f, isMoreThanHalf = false, isPositiveArc = false, 2.4399999999999995f, 16.060000000000002f)
                    lineTo(7.06f, 20.680000000000003f)
                    arcTo(1.0f, 1.0f, 136.84033465090712f, isMoreThanHalf = true, isPositiveArc = false, 8.474f, 19.267000000000003f)
                    lineTo(5.234f, 16.027f)
                    lineTo(14.5f, 16.027f)
                    curveTo(18.084f, 16.027f, 21.0f, 13.110000000000001f, 21.0f, 9.527000000000001f)
                    curveTo(21.0f, 5.942000000000001f, 18.084f, 3.027000000000001f, 14.5f, 3.027000000000001f)
                }
            }.build().also {
                _arrowHookLeftDown = it
            }
    }


private var _arrowHookLeftDown: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ArrowHookLeftDownIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ArrowHookLeftDown.imageVector,
            contentDescription = null,
    )
}
