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

val BezierIcons.Code: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_code
        override val imageVector: ImageVector
            get() = _code ?: ImageVector.Builder(
                    name = "Code",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(15.394f, 4.08f)
                    arcTo(1.0f, 1.0f, 293.18933441787834f, isMoreThanHalf = false, isPositiveArc = true, 15.919f, 5.394f)
                    lineTo(9.919f, 19.394f)
                    arcTo(1.0f, 1.0f, 22.389747760077373f, isMoreThanHalf = true, isPositiveArc = true, 8.081f, 18.605999999999998f)
                    lineTo(14.081f, 4.605999999999998f)
                    arcTo(1.0f, 1.0f, 203.21193010348776f, isMoreThanHalf = false, isPositiveArc = true, 15.394f, 4.080999999999998f)
                    moveTo(8.207f, 4.293f)
                    arcTo(1.0f, 1.0f, 315.008651662838f, isMoreThanHalf = false, isPositiveArc = true, 8.207f, 5.707f)
                    lineTo(4.914f, 9.0f)
                    lineTo(8.207f, 12.293f)
                    arcTo(1.0f, 1.0f, 314.00425538642025f, isMoreThanHalf = true, isPositiveArc = true, 6.793000000000001f, 13.706999999999999f)
                    lineTo(2.793000000000001f, 9.706999999999999f)
                    arcTo(1.0f, 1.0f, 135.00865166283802f, isMoreThanHalf = false, isPositiveArc = true, 2.793000000000001f, 8.293f)
                    lineTo(6.793000000000001f, 4.292999999999999f)
                    arcTo(1.0f, 1.0f, 225.008651662838f, isMoreThanHalf = false, isPositiveArc = true, 8.207f, 4.292999999999999f)
                    moveTo(17.207f, 10.293f)
                    arcTo(1.0f, 1.0f, 315.99574461357975f, isMoreThanHalf = true, isPositiveArc = false, 15.793000000000001f, 11.706999999999999f)
                    lineTo(19.086f, 15.0f)
                    lineTo(15.793f, 18.293f)
                    arcTo(1.0f, 1.0f, 224.00425538642457f, isMoreThanHalf = false, isPositiveArc = false, 17.207f, 19.707f)
                    lineTo(21.207f, 15.707f)
                    arcTo(1.0f, 1.0f, 44.991348337162f, isMoreThanHalf = false, isPositiveArc = false, 21.207f, 14.293000000000001f)
                    close()
                }
            }.build().also {
                _code = it
            }
    }


private var _code: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CodeIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Code.imageVector,
            contentDescription = null,
    )
}
