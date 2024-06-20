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

val BezierIcons.NaverTalktalk: BezierIcon
    get() = object : BezierIcon {
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
                        strokeAlpha = 1.0f,
                        pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(6.5f, 3.0f)
                    lineTo(17.5f, 3.0f)
                    arcTo(3.5f, 3.5f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 21.0f, 6.5f)
                    lineTo(21.0f, 15.5f)
                    arcTo(3.5f, 3.5f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 17.5f, 19.0f)
                    lineTo(9.106f, 19.0f)
                    arcTo(2.5f, 2.5f, 270.0100596711706f, isMoreThanHalf = false, isPositiveArc = false, 7.256f, 19.818f)
                    lineTo(5.2620000000000005f, 22.012f)
                    curveTo(4.462000000000001f, 22.892f, 3.0000000000000004f, 22.326f, 3.0000000000000004f, 21.137f)
                    lineTo(3.0000000000000004f, 6.5f)
                    arcTo(3.5f, 3.5f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 6.5f, 3.0f)
                    moveTo(8.25f, 14.75f)
                    lineTo(8.25f, 7.257f)
                    lineTo(10.826f, 7.257f)
                    lineTo(13.184000000000001f, 10.982f)
                    lineTo(13.192f, 7.249999999999999f)
                    lineTo(15.75f, 7.255999999999999f)
                    lineTo(15.75f, 14.75f)
                    lineTo(13.156f, 14.75f)
                    lineTo(10.842f, 11.03f)
                    lineTo(10.827f, 14.75f)
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
