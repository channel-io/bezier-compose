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

val BezierIcons.FolderOff: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_folder_off
        override val imageVector: ImageVector
            get() = _folderOff ?: ImageVector.Builder(
                    name = "FolderOff",
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
                    moveTo(1.707f, 2.703f)
                    arcTo(1.0f, 1.0f, 224.991348337162f, isMoreThanHalf = false, isPositiveArc = false, 1.707f, 4.117f)
                    lineTo(18.677f, 21.087f)
                    arcTo(1.0f, 1.0f, 134.04560044921752f, isMoreThanHalf = false, isPositiveArc = false, 20.092f, 19.674f)
                    lineTo(19.392f, 18.974f)
                    arcTo(3.0f, 3.0f, 82.49188213039632f, isMoreThanHalf = false, isPositiveArc = false, 22.0f, 16.0f)
                    lineTo(22.0f, 8.0f)
                    arcTo(3.0f, 3.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 19.0f, 5.0f)
                    lineTo(12.828f, 5.0f)
                    arcTo(1.0f, 1.0f, 90.01223660525453f, isMoreThanHalf = false, isPositiveArc = true, 12.120999999999999f, 4.707f)
                    lineTo(11.293f, 3.879f)
                    arcTo(3.0f, 3.0f, 315.00865351048367f, isMoreThanHalf = false, isPositiveArc = false, 9.172f, 3.0f)
                    lineTo(5.0f, 3.0f)
                    curveTo(4.538f, 3.0f, 4.1f, 3.104f, 3.71f, 3.291f)
                    lineTo(3.121f, 2.703f)
                    arcTo(1.0f, 1.0f, 314.99134833716204f, isMoreThanHalf = false, isPositiveArc = false, 1.707f, 2.703f)
                    moveTo(5.418f, 5.0f)
                    lineTo(7.418f, 7.0f)
                    lineTo(9.172f, 7.0f)
                    arcTo(1.0f, 1.0f, 89.98776339474547f, isMoreThanHalf = false, isPositiveArc = false, 9.879000000000001f, 6.707f)
                    lineTo(10.586f, 6.0f)
                    lineTo(9.879f, 5.293f)
                    arcTo(1.0f, 1.0f, 315.00865351048367f, isMoreThanHalf = false, isPositiveArc = false, 9.172f, 5.0f)
                    close()
                    moveTo(9.41f, 8.99f)
                    lineTo(17.42f, 17.0f)
                    lineTo(19.0f, 17.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 20.0f, 16.0f)
                    lineTo(20.0f, 8.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 19.0f, 7.0f)
                    lineTo(12.828f, 7.0f)
                    arcTo(1.0f, 1.0f, 269.98776339474546f, isMoreThanHalf = false, isPositiveArc = false, 12.120999999999999f, 7.293f)
                    lineTo(11.293f, 8.121f)
                    arcTo(3.0f, 3.0f, 44.97882276933434f, isMoreThanHalf = false, isPositiveArc = true, 9.408999999999999f, 8.991f)
                }

                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(2.0f, 6.0f)
                    quadTo(2.0f, 5.95f, 2.002f, 5.902f)
                    lineTo(5.1f, 9.0f)
                    lineTo(5.0f, 9.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 4.0f, 10.0f)
                    lineTo(4.0f, 16.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 5.0f, 17.0f)
                    lineTo(13.1f, 17.0f)
                    lineTo(15.1f, 19.0f)
                    lineTo(5.0f, 19.0f)
                    arcTo(3.0f, 3.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 2.0f, 16.0f)
                    close()
                }
            }.build().also {
                _folderOff = it
            }
    }


private var _folderOff: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun FolderOffIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.FolderOff.imageVector,
            contentDescription = null,
    )
}
