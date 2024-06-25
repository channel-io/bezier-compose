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

val BezierIcons.CommentOut: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _commentOut ?: ImageVector.Builder(
                    name = "CommentOut",
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
                    moveTo(7.0f, 3.0f)
                    arcTo(4.0f, 4.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 3.0f, 7.0f)
                    lineTo(3.0f, 20.96f)
                    curveTo(3.0f, 22.217000000000002f, 4.455f, 22.917f, 5.436999999999999f, 22.131f)
                    lineTo(8.802999999999999f, 19.438f)
                    arcTo(2.0f, 2.0f, 231.3522157781698f, isMoreThanHalf = false, isPositiveArc = true, 10.052999999999999f, 19.0f)
                    lineTo(17.0f, 19.0f)
                    arcTo(4.0f, 4.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 21.0f, 15.0f)
                    lineTo(21.0f, 7.0f)
                    arcTo(4.0f, 4.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 17.0f, 3.0f)
                    close()
                    moveTo(5.0f, 7.0f)
                    arcTo(2.0f, 2.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 7.0f, 5.0f)
                    lineTo(17.0f, 5.0f)
                    arcTo(2.0f, 2.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = true, 19.0f, 7.0f)
                    lineTo(19.0f, 15.0f)
                    arcTo(2.0f, 2.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 17.0f, 17.0f)
                    lineTo(10.052f, 17.0f)
                    arcTo(4.0f, 4.0f, 269.9803129305653f, isMoreThanHalf = false, isPositiveArc = false, 7.553999999999999f, 17.877f)
                    lineTo(5.0f, 19.919f)
                    close()
                    moveTo(15.536f, 13.121f)
                    arcTo(1.0f, 1.0f, 315.0f, isMoreThanHalf = true, isPositiveArc = true, 14.120999999999999f, 14.536000000000001f)
                    lineTo(12.0f, 12.414f)
                    lineTo(9.879f, 14.536f)
                    arcTo(1.0f, 1.0f, 45.0f, isMoreThanHalf = true, isPositiveArc = true, 8.463999999999999f, 13.120999999999999f)
                    lineTo(10.586f, 11.0f)
                    lineTo(8.464f, 8.879f)
                    arcTo(1.0f, 1.0f, 135.0202381035447f, isMoreThanHalf = true, isPositiveArc = true, 9.88f, 7.464f)
                    lineTo(12.0f, 9.586f)
                    lineTo(14.121f, 7.464f)
                    arcTo(1.0f, 1.0f, 225.0f, isMoreThanHalf = true, isPositiveArc = true, 15.536000000000001f, 8.879000000000001f)
                    lineTo(13.414f, 11.0f)
                    close()
                }
            }.build().also {
                _commentOut = it
            }
    }


private var _commentOut: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CommentOutIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.CommentOut.imageVector,
            contentDescription = null,
    )
}
