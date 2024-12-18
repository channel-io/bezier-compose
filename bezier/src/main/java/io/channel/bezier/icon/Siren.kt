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

val BezierIcons.Siren: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_siren
        override val imageVector: ImageVector
            get() = _siren ?: ImageVector.Builder(
                    name = "Siren",
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
                    moveTo(12.0f, 4.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 11.0f, 3.0f)
                    lineTo(11.0f, 1.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = true, 13.0f, 1.0f)
                    lineTo(13.0f, 3.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 12.0f, 4.0f)
                    moveTo(6.536f, 5.536f)
                    arcTo(1.0f, 1.0f, 44.96812921607166f, isMoreThanHalf = false, isPositiveArc = true, 5.1209999999999996f, 5.536f)
                    lineTo(3.707f, 4.12f)
                    arcTo(1.0f, 1.0f, 134.00425538642028f, isMoreThanHalf = true, isPositiveArc = true, 5.1209999999999996f, 2.7060000000000004f)
                    lineTo(6.536f, 4.12f)
                    arcTo(1.0f, 1.0f, 314.96812921607165f, isMoreThanHalf = false, isPositiveArc = true, 6.536f, 5.535f)
                    moveTo(17.707f, 4.12f)
                    arcTo(1.0f, 1.0f, 225.02025301418402f, isMoreThanHalf = false, isPositiveArc = false, 19.121000000000002f, 5.535f)
                    lineTo(20.536f, 4.12f)
                    arcTo(1.0f, 1.0f, 44.97974758928053f, isMoreThanHalf = true, isPositiveArc = false, 19.121000000000002f, 2.7060000000000004f)
                    close()
                    moveTo(12.007f, 5.0f)
                    arcTo(7.0f, 7.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 5.007f, 12.0f)
                    lineTo(5.007f, 20.0f)
                    lineTo(4.007f, 20.0f)
                    lineTo(4.007f, 22.0f)
                    lineTo(20.006999999999998f, 22.0f)
                    lineTo(20.006999999999998f, 20.0f)
                    lineTo(19.006999999999998f, 20.0f)
                    lineTo(19.006999999999998f, 12.0f)
                    arcTo(7.0f, 7.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 12.006999999999998f, 5.0f)
                    moveTo(9.0f, 10.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 8.0f, 11.0f)
                    lineTo(8.0f, 17.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = false, 10.0f, 17.0f)
                    lineTo(10.0f, 11.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 9.0f, 10.0f)
                }
            }.build().also {
                _siren = it
            }
    }


private var _siren: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun SirenIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Siren.imageVector,
            contentDescription = null,
    )
}
