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

val BezierIcons.Share: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_share
        override val imageVector: ImageVector
            get() = _share ?: ImageVector.Builder(
                    name = "Share",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(13.0f, 5.207f)
                    lineTo(15.414f, 7.621f)
                    arcTo(1.0f, 1.0f, 135.99574461357975f, isMoreThanHalf = true, isPositiveArc = false, 16.828f, 6.207000000000001f)
                    lineTo(13.06f, 2.439f)
                    arcTo(1.5f, 1.5f, 314.9643492835457f, isMoreThanHalf = false, isPositiveArc = false, 10.940000000000001f, 2.439f)
                    lineTo(7.17f, 6.207f)
                    arcTo(1.0f, 1.0f, 225.95439955078024f, isMoreThanHalf = true, isPositiveArc = false, 8.585f, 7.62f)
                    lineTo(11.0f, 5.206f)
                    lineTo(11.0f, 15.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = false, 13.0f, 15.0f)
                    close()
                    moveTo(6.0f, 22.0f)
                    arcTo(4.0f, 4.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 2.0f, 18.0f)
                    lineTo(2.0f, 13.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = true, 4.0f, 13.0f)
                    lineTo(4.0f, 18.0f)
                    arcTo(2.0f, 2.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 6.0f, 20.0f)
                    lineTo(18.0f, 20.0f)
                    arcTo(2.0f, 2.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 20.0f, 18.0f)
                    lineTo(20.0f, 13.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = true, isPositiveArc = true, 22.0f, 13.0f)
                    lineTo(22.0f, 18.0f)
                    arcTo(4.0f, 4.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 18.0f, 22.0f)
                    close()
                }
            }.build().also {
                _share = it
            }
    }


private var _share: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ShareIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Share.imageVector,
            contentDescription = null,
    )
}
