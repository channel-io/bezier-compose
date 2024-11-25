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

val BezierIcons.Image: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_image
        override val imageVector: ImageVector
            get() = _image ?: ImageVector.Builder(
                    name = "Image",
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
                    moveTo(5.0f, 19.0f)
                    lineTo(19.0f, 19.0f)
                    lineTo(19.0f, 5.0f)
                    lineTo(5.0f, 5.0f)
                    close()
                    moveTo(19.5f, 3.0f)
                    lineTo(4.5f, 3.0f)
                    curveTo(3.673f, 3.0f, 3.0f, 3.673f, 3.0f, 4.5f)
                    lineTo(3.0f, 19.5f)
                    curveTo(3.0f, 20.326999999999998f, 3.673f, 21.0f, 4.5f, 21.0f)
                    lineTo(19.5f, 21.0f)
                    curveTo(20.326999999999998f, 21.0f, 21.0f, 20.326999999999998f, 21.0f, 19.5f)
                    lineTo(21.0f, 4.5f)
                    curveTo(21.0f, 3.673f, 20.326999999999998f, 3.0f, 19.5f, 3.0f)
                    moveTo(18.0f, 18.0f)
                    lineTo(18.0f, 12.0f)
                    lineTo(14.004999999999999f, 10.0f)
                    lineTo(6.0f, 14.0f)
                    lineTo(6.0f, 18.0f)
                    close()
                    moveTo(10.0f, 8.0f)
                    arcTo(2.0f, 2.0f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 6.0f, 8.0f)
                    arcTo(2.0f, 2.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 10.0f, 8.0f)
                }
            }.build().also {
                _image = it
            }
    }


private var _image: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ImageIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Image.imageVector,
            contentDescription = null,
    )
}
