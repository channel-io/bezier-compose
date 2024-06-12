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

val BezierIcons.ChevronSmallLeftright: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _chevronSmallLeftright ?: ImageVector.Builder(
                    name = "ChevronSmallLeftright",
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
                    moveTo(10.207f, 16.207f)
                    arcTo(1.0f, 1.0f, 45.008651662838f, isMoreThanHalf = false, isPositiveArc = true, 8.793000000000001f, 16.207f)
                    lineTo(5.293000000000001f, 12.707f)
                    arcTo(1.0f, 1.0f, 135.00865166283802f, isMoreThanHalf = false, isPositiveArc = true, 5.293000000000001f, 11.293000000000001f)
                    lineTo(8.793000000000001f, 7.793000000000001f)
                    arcTo(1.0f, 1.0f, 225.99574461357972f, isMoreThanHalf = false, isPositiveArc = true, 10.207f, 9.207f)
                    lineTo(7.414f, 12.0f)
                    lineTo(10.207f, 14.793f)
                    arcTo(1.0f, 1.0f, 315.0086516628379f, isMoreThanHalf = false, isPositiveArc = true, 10.207f, 16.207f)
                    moveTo(13.793f, 16.207f)
                    arcTo(1.0f, 1.0f, 135.00865166283802f, isMoreThanHalf = false, isPositiveArc = true, 13.793f, 14.793000000000001f)
                    lineTo(16.586f, 12.0f)
                    lineTo(13.793f, 9.207f)
                    arcTo(1.0f, 1.0f, 135.99574461357975f, isMoreThanHalf = false, isPositiveArc = true, 15.206999999999999f, 7.793000000000001f)
                    lineTo(18.707f, 11.293000000000001f)
                    arcTo(1.0f, 1.0f, 315.008651662838f, isMoreThanHalf = false, isPositiveArc = true, 18.707f, 12.707f)
                    lineTo(15.207f, 16.207f)
                    arcTo(1.0f, 1.0f, 45.008651662838f, isMoreThanHalf = false, isPositiveArc = true, 13.793000000000001f, 16.207f)
                }
            }.build().also {
                _chevronSmallLeftright = it
            }
    }


private var _chevronSmallLeftright: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChevronSmallLeftrightIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ChevronSmallLeftright.imageVector,
            contentDescription = null,
    )
}
