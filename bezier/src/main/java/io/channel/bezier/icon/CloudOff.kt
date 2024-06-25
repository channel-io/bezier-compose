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

val BezierIcons.CloudOff: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _cloudOff ?: ImageVector.Builder(
                    name = "CloudOff",
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
                    moveTo(2.707f, 3.793f)
                    arcTo(1.0f, 1.0f, 224.99134833716198f, isMoreThanHalf = false, isPositiveArc = false, 2.707f, 5.207f)
                    lineTo(19.677f, 22.177f)
                    arcTo(1.0f, 1.0f, 134.04560044921752f, isMoreThanHalf = false, isPositiveArc = false, 21.092f, 20.764f)
                    lineTo(18.99f, 18.662f)
                    arcTo(6.0f, 6.0f, 70.67983544965989f, isMoreThanHalf = false, isPositiveArc = false, 17.197999999999997f, 7.002999999999998f)
                    arcTo(6.0f, 6.0f, 330.03307423661545f, isMoreThanHalf = false, isPositiveArc = false, 12.0f, 4.0f)
                    arcTo(6.0f, 6.0f, 270.0085939476242f, isMoreThanHalf = false, isPositiveArc = false, 7.004f, 6.676f)
                    lineTo(4.121f, 3.793f)
                    arcTo(1.0f, 1.0f, 314.991348337162f, isMoreThanHalf = false, isPositiveArc = false, 2.7070000000000007f, 3.793f)
                    moveTo(8.461f, 8.133f)
                    lineTo(17.316000000000003f, 16.988f)
                    arcTo(4.0f, 4.0f, 85.56174349255281f, isMoreThanHalf = false, isPositiveArc = false, 17.0f, 9.0f)
                    lineTo(15.93f, 9.0f)
                    lineTo(15.668f, 8.4f)
                    arcTo(4.001f, 4.001f, 336.4468885494648f, isMoreThanHalf = false, isPositiveArc = false, 8.460999999999999f, 8.133000000000001f)
                    moveTo(4.724999999999998f, 8.725000000000001f)
                    lineTo(6.5f, 10.5f)
                    lineTo(6.25f, 10.5f)
                    arcTo(3.25f, 3.25f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 6.25f, 17.0f)
                    lineTo(13.0f, 17.0f)
                    lineTo(15.0f, 19.0f)
                    lineTo(6.25f, 19.0f)
                    arcTo(5.25f, 5.25f, 89.95065671302295f, isMoreThanHalf = false, isPositiveArc = true, 4.725f, 8.725f)
                }
            }.build().also {
                _cloudOff = it
            }
    }


private var _cloudOff: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CloudOffIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.CloudOff.imageVector,
            contentDescription = null,
    )
}
