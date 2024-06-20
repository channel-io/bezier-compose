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

val BezierIcons.CommentIn: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _commentIn ?: ImageVector.Builder(
                    name = "CommentIn",
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
                    moveTo(16.0f, 9.414f)
                    arcTo(1.0f, 1.0f, 44.00425538642027f, isMoreThanHalf = false, isPositiveArc = false, 14.586f, 8.0f)
                    lineTo(11.0f, 11.586f)
                    lineTo(9.414f, 10.0f)
                    arcTo(1.0f, 1.0f, 314.00425538642025f, isMoreThanHalf = false, isPositiveArc = false, 8.0f, 11.414f)
                    lineTo(10.293f, 13.707f)
                    arcTo(1.0f, 1.0f, 134.991348337162f, isMoreThanHalf = false, isPositiveArc = false, 11.706999999999999f, 13.707f)
                    close()
                }
            }.build().also {
                _commentIn = it
            }
    }


private var _commentIn: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CommentInIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.CommentIn.imageVector,
            contentDescription = null,
    )
}
