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

val BezierIcons.GhostFilled: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _ghostFilled ?: ImageVector.Builder(
                    name = "GhostFilled",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                        pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(15.12f, 11.468f)
                    curveTo(14.299f, 11.468f, 13.956f, 10.886f, 13.956f, 9.46f)
                    curveTo(13.956f, 8.035f, 14.299f, 7.452000000000001f, 15.119f, 7.452000000000001f)
                    curveTo(15.939f, 7.452000000000001f, 16.283f, 8.035f, 16.283f, 9.46f)
                    curveTo(16.283f, 10.885000000000002f, 15.940000000000001f, 11.468f, 15.119000000000002f, 11.468f)
                    moveTo(8.879000000000001f, 11.468f)
                    curveTo(8.059000000000001f, 11.468f, 7.717000000000001f, 10.886f, 7.717000000000001f, 9.46f)
                    curveTo(7.717000000000001f, 8.035f, 8.059000000000001f, 7.452000000000001f, 8.88f, 7.452000000000001f)
                    curveTo(9.700000000000001f, 7.452000000000001f, 10.043000000000001f, 8.035f, 10.043000000000001f, 9.46f)
                    curveTo(10.043000000000001f, 10.885000000000002f, 9.700000000000001f, 11.468f, 8.88f, 11.468f)
                    moveTo(12.0f, 2.0f)
                    curveTo(7.876f, 2.0f, 4.5f, 5.316f, 4.5f, 9.368f)
                    lineTo(4.5f, 19.266f)
                    curveTo(4.5f, 20.627f, 6.255f, 21.215f, 7.1f, 20.137999999999998f)
                    lineTo(7.1f, 20.136999999999997f)
                    arcTo(1.468f, 1.468f, 218.4604068156894f, isMoreThanHalf = false, isPositiveArc = true, 9.399f, 20.136999999999997f)
                    lineTo(10.167f, 21.115f)
                    curveTo(11.095f, 22.294999999999998f, 12.905f, 22.294999999999998f, 13.833f, 21.115f)
                    lineTo(14.601f, 20.136999999999997f)
                    arcTo(1.468f, 1.468f, 218.49177179222426f, isMoreThanHalf = false, isPositiveArc = true, 16.899f, 20.136999999999997f)
                    lineTo(16.899f, 20.137999999999998f)
                    curveTo(17.745f, 21.214999999999996f, 19.5f, 20.627f, 19.5f, 19.266f)
                    lineTo(19.5f, 9.368f)
                    curveTo(19.5f, 5.316f, 16.125f, 2.0f, 12.0f, 2.0f)
                }
            }.build().also {
                _ghostFilled = it
            }
    }


private var _ghostFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun GhostFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.GhostFilled.imageVector,
            contentDescription = null,
    )
}
