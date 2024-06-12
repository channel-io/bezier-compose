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

val BezierIcons.String: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _string ?: ImageVector.Builder(
                    name = "String",
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
                    moveTo(2.0f, 7.0f)
                    arcTo(2.0f, 2.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 4.0f, 5.0f)
                    lineTo(20.0f, 5.0f)
                    arcTo(2.0f, 2.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 22.0f, 7.0f)
                    lineTo(22.0f, 17.0f)
                    arcTo(2.0f, 2.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 20.0f, 19.0f)
                    lineTo(4.0f, 19.0f)
                    arcTo(2.0f, 2.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 2.0f, 17.0f)
                    close()
                    moveTo(6.41f, 7.0f)
                    arcTo(0.5f, 0.5f, 269.9653972421917f, isMoreThanHalf = false, isPositiveArc = false, 5.92f, 7.402f)
                    lineTo(4.12f, 16.402f)
                    arcTo(0.5f, 0.5f, 191.3031573778365f, isMoreThanHalf = false, isPositiveArc = false, 4.61f, 17.0f)
                    lineTo(5.59f, 17.0f)
                    arcTo(0.5f, 0.5f, 89.9653972421917f, isMoreThanHalf = false, isPositiveArc = false, 6.08f, 16.598f)
                    lineTo(6.4f, 15.0f)
                    lineTo(9.600000000000001f, 15.0f)
                    lineTo(9.920000000000002f, 16.598f)
                    arcTo(0.5f, 0.5f, 168.69686393065706f, isMoreThanHalf = false, isPositiveArc = false, 10.410000000000002f, 17.0f)
                    lineTo(11.390000000000002f, 17.0f)
                    arcTo(0.5f, 0.5f, 89.96540141865721f, isMoreThanHalf = false, isPositiveArc = false, 11.880000000000003f, 16.402f)
                    lineTo(10.080000000000002f, 7.402000000000001f)
                    arcTo(0.5f, 0.5f, 348.69686393065706f, isMoreThanHalf = false, isPositiveArc = false, 9.59f, 7.0f)
                    lineTo(6.41f, 7.0f)
                    moveTo(7.6f, 9.0f)
                    lineTo(6.8f, 13.0f)
                    lineTo(9.2f, 13.0f)
                    lineTo(8.399999999999999f, 9.0f)
                    close()
                    moveTo(19.5f, 7.5f)
                    arcTo(0.5f, 0.5f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 19.0f, 7.0f)
                    lineTo(13.5f, 7.0f)
                    arcTo(0.5f, 0.5f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 13.0f, 7.5f)
                    lineTo(13.0f, 8.5f)
                    arcTo(0.5f, 0.5f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 9.0f)
                    lineTo(17.197f, 9.0f)
                    lineTo(13.099f, 14.504999999999999f)
                    arcTo(0.5f, 0.5f, 216.6785069416346f, isMoreThanHalf = false, isPositiveArc = false, 13.0f, 14.803999999999998f)
                    lineTo(13.0f, 16.5f)
                    arcTo(0.5f, 0.5f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 17.0f)
                    lineTo(19.0f, 17.0f)
                    arcTo(0.5f, 0.5f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 16.5f)
                    lineTo(19.5f, 15.5f)
                    arcTo(0.5f, 0.5f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 19.0f, 15.0f)
                    lineTo(15.301f, 15.0f)
                    lineTo(19.401f, 9.495000000000001f)
                    arcTo(0.5f, 0.5f, 36.67850694163459f, isMoreThanHalf = false, isPositiveArc = false, 19.5f, 9.196000000000002f)
                    close()
                }
            }.build().also {
                _string = it
            }
    }


private var _string: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun StringIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.String.imageVector,
            contentDescription = null,
    )
}
