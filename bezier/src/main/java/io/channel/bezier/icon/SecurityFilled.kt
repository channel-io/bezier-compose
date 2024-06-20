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

val BezierIcons.SecurityFilled: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _securityFilled ?: ImageVector.Builder(
                    name = "SecurityFilled",
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
                    moveTo(12.0f, 1.932f)
                    lineTo(21.0f, 5.307f)
                    lineTo(21.0f, 10.0f)
                    curveTo(21.0f, 14.669f, 18.362000000000002f, 18.936999999999998f, 14.186f, 21.025f)
                    lineTo(12.0f, 22.118f)
                    lineTo(9.814f, 21.025f)
                    arcTo(12.33f, 12.33f, 116.57469488382084f, isMoreThanHalf = false, isPositiveArc = true, 3.0f, 10.0f)
                    lineTo(3.0f, 5.307f)
                    close()
                    moveTo(8.5f, 10.225f)
                    lineTo(7.086f, 11.639f)
                    lineTo(10.86f, 15.415f)
                    lineTo(17.0f, 9.275f)
                    lineTo(15.586f, 7.86f)
                    lineTo(10.86f, 12.585f)
                    close()
                }
            }.build().also {
                _securityFilled = it
            }
    }


private var _securityFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun SecurityFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.SecurityFilled.imageVector,
            contentDescription = null,
    )
}
