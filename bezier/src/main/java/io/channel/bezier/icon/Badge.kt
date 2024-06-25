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

val BezierIcons.Badge: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _badge ?: ImageVector.Builder(
                    name = "Badge",
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
                    moveTo(12.0f, 3.0f)
                    arcTo(6.5f, 6.5f, 270.0f, isMoreThanHalf = true, isPositiveArc = false, 12.0f, 16.0f)
                    arcTo(6.5f, 6.5f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 12.0f, 3.0f)
                    moveTo(16.0f, 17.002000000000002f)
                    arcTo(8.5f, 8.5f, 61.92751306414704f, isMoreThanHalf = true, isPositiveArc = false, 8.0f, 17.002000000000002f)
                    lineTo(8.0f, 22.162000000000003f)
                    arcTo(0.5f, 0.5f, 180.0845538584112f, isMoreThanHalf = false, isPositiveArc = false, 8.737f, 22.603f)
                    lineTo(12.0f, 20.846f)
                    lineTo(15.263f, 22.603f)
                    arcTo(0.5f, 0.5f, 118.29426903930927f, isMoreThanHalf = false, isPositiveArc = false, 16.0f, 22.163f)
                    close()
                    moveTo(15.697f, 7.282f)
                    arcTo(1.0f, 1.0f, 314.19256905648416f, isMoreThanHalf = false, isPositiveArc = true, 15.716999999999999f, 8.696f)
                    lineTo(11.834999999999999f, 12.696f)
                    arcTo(1.0f, 1.0f, 44.151540331358824f, isMoreThanHalf = false, isPositiveArc = true, 10.399999999999999f, 12.696f)
                    lineTo(8.281999999999998f, 10.515f)
                    arcTo(1.0f, 1.0f, 135.87081319195835f, isMoreThanHalf = false, isPositiveArc = true, 9.717999999999998f, 9.122f)
                    lineTo(11.117999999999999f, 10.564f)
                    lineTo(14.281999999999998f, 7.304f)
                    arcTo(1.0f, 1.0f, 224.07045041714787f, isMoreThanHalf = false, isPositiveArc = true, 15.697f, 7.282f)
                }
            }.build().also {
                _badge = it
            }
    }


private var _badge: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun BadgeIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Badge.imageVector,
            contentDescription = null,
    )
}
