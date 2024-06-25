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

val BezierIcons.ArrowDownSmall: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _arrowDownSmall ?: ImageVector.Builder(
                    name = "ArrowDownSmall",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(12.0f, 5.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 11.0f, 6.0f)
                    lineTo(11.0f, 15.586f)
                    lineTo(7.207f, 11.793f)
                    arcTo(1.0f, 1.0f, 314.00425538642025f, isMoreThanHalf = false, isPositiveArc = false, 5.793f, 13.206999999999999f)
                    lineTo(11.293f, 18.707f)
                    arcTo(1.0f, 1.0f, 134.991348337162f, isMoreThanHalf = false, isPositiveArc = false, 12.706999999999999f, 18.707f)
                    lineTo(18.207f, 13.207f)
                    arcTo(1.0f, 1.0f, 44.004255386422344f, isMoreThanHalf = false, isPositiveArc = false, 16.793f, 11.793000000000001f)
                    lineTo(13.0f, 15.586f)
                    lineTo(13.0f, 6.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 12.0f, 5.0f)
                }
            }.build().also {
                _arrowDownSmall = it
            }
    }


private var _arrowDownSmall: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ArrowDownSmallIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ArrowDownSmall.imageVector,
            contentDescription = null,
    )
}
