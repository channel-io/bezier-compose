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

val BezierIcons.Naver: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_naver
        override val imageVector: ImageVector
            get() = _naver ?: ImageVector.Builder(
                    name = "Naver",
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
                    moveTo(12.0f, 2.0f)
                    curveTo(17.522f, 2.0f, 22.0f, 6.478f, 22.0f, 12.0f)
                    curveTo(22.0f, 17.522f, 17.522f, 22.0f, 12.0f, 22.0f)
                    curveTo(6.4780000000000015f, 22.0f, 2.0f, 17.522f, 2.0f, 12.0f)
                    curveTo(2.0f, 6.4780000000000015f, 6.477f, 2.0f, 12.0f, 2.0f)
                    moveTo(7.0f, 7.508f)
                    lineTo(7.0f, 16.524f)
                    lineTo(10.374f, 16.524f)
                    lineTo(10.394f, 12.049000000000001f)
                    lineTo(13.424f, 16.523000000000003f)
                    lineTo(16.82f, 16.523000000000003f)
                    lineTo(16.82f, 7.508f)
                    lineTo(13.47f, 7.5f)
                    lineTo(13.46f, 11.99f)
                    lineTo(10.373000000000001f, 7.508f)
                    close()
                    moveTo(2.932f, 12.014f)
                    lineTo(2.933f, 11.88f)
                    lineTo(2.933f, 12.148000000000001f)
                    close()
                    moveTo(12.224f, 3.019f)
                    lineTo(11.641f, 3.019f)
                    arcTo(9.0f, 9.0f, 268.14392875150605f, isMoreThanHalf = false, isPositiveArc = true, 12.224f, 3.019f)
                    moveTo(20.928f, 12.293f)
                    lineTo(20.928f, 11.732999999999999f)
                    arcTo(9.0f, 9.0f, 358.21717695902356f, isMoreThanHalf = false, isPositiveArc = true, 20.928f, 12.293f)
                    moveTo(11.65f, 21.01f)
                    lineTo(12.213000000000001f, 21.01f)
                    arcTo(10.0f, 10.0f, 88.3869107174816f, isMoreThanHalf = false, isPositiveArc = true, 11.65f, 21.01f)
                }
            }.build().also {
                _naver = it
            }
    }


private var _naver: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun NaverIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Naver.imageVector,
            contentDescription = null,
    )
}
