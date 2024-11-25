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

val BezierIcons.InboxAll: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_inbox_all
        override val imageVector: ImageVector
            get() = _inboxAll ?: ImageVector.Builder(
                    name = "InboxAll",
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
                    moveTo(19.0f, 7.5f)
                    lineTo(14.5f, 7.5f)
                    arcTo(2.5f, 2.5f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 7.5f)
                    lineTo(5.0f, 7.5f)
                    lineTo(5.0f, 5.0f)
                    lineTo(19.0f, 5.0f)
                    close()
                    moveTo(19.0f, 14.5f)
                    lineTo(14.5f, 14.5f)
                    arcTo(2.5f, 2.5f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 9.5f, 14.5f)
                    lineTo(5.0f, 14.5f)
                    lineTo(5.0f, 12.0f)
                    lineTo(19.0f, 12.0f)
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
                }
            }.build().also {
                _inboxAll = it
            }
    }


private var _inboxAll: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun InboxAllIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.InboxAll.imageVector,
            contentDescription = null,
    )
}
