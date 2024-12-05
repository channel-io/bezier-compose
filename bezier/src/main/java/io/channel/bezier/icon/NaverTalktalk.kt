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

val BezierIcons.NaverTalktalk: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_naver_talktalk
        override val imageVector: ImageVector
            get() = _naverTalktalk ?: ImageVector.Builder(
                    name = "NaverTalktalk",
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
                    moveTo(5.202f, 4.545f)
                    curveTo(9.132f, 0.74f, 15.394f, 0.771f, 19.292f, 4.638f)
                    lineTo(19.292f, 4.648f)
                    curveTo(23.117f, 8.629999999999999f, 23.034000000000002f, 14.953999999999999f, 19.115000000000002f, 18.863f)
                    arcTo(12.36f, 12.36f, 46.64843727173607f, isMoreThanHalf = false, isPositiveArc = true, 11.993000000000002f, 22.16f)
                    curveTo(10.356000000000002f, 22.334f, 8.703000000000003f, 22.327f, 7.068000000000002f, 22.139f)
                    arcTo(23.7f, 23.7f, 97.907687944198f, isMoreThanHalf = false, isPositiveArc = true, 2.517000000000002f, 21.04f)
                    arcTo(0.93f, 0.93f, 109.29611764703301f, isMoreThanHalf = false, isPositiveArc = true, 2.0920000000000023f, 19.589f)
                    arcTo(9.0f, 9.0f, 38.26146584482214f, isMoreThanHalf = false, isPositiveArc = false, 3.2950000000000026f, 17.567f)
                    arcTo(2.3f, 2.3f, 20.955536953614534f, isMoreThanHalf = false, isPositiveArc = false, 3.2220000000000026f, 15.752f)
                    arcTo(9.72f, 9.72f, 154.18668821210508f, isMoreThanHalf = false, isPositiveArc = true, 5.202000000000003f, 4.545f)
                    moveTo(13.632000000000001f, 11.834f)
                    lineTo(13.632000000000001f, 7.54f)
                    lineTo(16.172f, 7.54f)
                    lineTo(16.172f, 15.565000000000001f)
                    lineTo(13.622f, 15.565000000000001f)
                    lineTo(10.698f, 11.273000000000001f)
                    lineTo(10.698f, 15.565000000000001f)
                    lineTo(8.158000000000001f, 15.565000000000001f)
                    lineTo(8.158000000000001f, 7.541f)
                    lineTo(10.708000000000002f, 7.541f)
                    close()
                }
            }.build().also {
                _naverTalktalk = it
            }
    }


private var _naverTalktalk: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun NaverTalktalkIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.NaverTalktalk.imageVector,
            contentDescription = null,
    )
}
