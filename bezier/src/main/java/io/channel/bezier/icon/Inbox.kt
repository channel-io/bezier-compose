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

val BezierIcons.Inbox: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_inbox
        override val imageVector: ImageVector
            get() = _inbox ?: ImageVector.Builder(
                    name = "Inbox",
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
                    moveTo(6.0f, 4.0f)
                    arcTo(4.0f, 4.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 2.0f, 8.0f)
                    lineTo(2.0f, 16.0f)
                    arcTo(4.0f, 4.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 6.0f, 20.0f)
                    lineTo(18.0f, 20.0f)
                    arcTo(4.0f, 4.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 22.0f, 16.0f)
                    lineTo(22.0f, 8.0f)
                    arcTo(4.0f, 4.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 18.0f, 4.0f)
                    close()
                    moveTo(20.0f, 8.0f)
                    arcTo(2.0f, 2.0f, 0.0f, isMoreThanHalf = false, isPositiveArc = false, 18.0f, 6.0f)
                    lineTo(6.0f, 6.0f)
                    arcTo(2.0f, 2.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 4.0f, 8.0f)
                    lineTo(4.0f, 11.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 5.0f, 12.0f)
                    lineTo(8.0f, 12.0f)
                    curveTo(8.552f, 12.0f, 8.984f, 12.46f, 9.164f, 12.982f)
                    arcTo(3.001f, 3.001f, 160.91215828776936f, isMoreThanHalf = false, isPositiveArc = false, 14.835999999999999f, 12.982f)
                    curveTo(15.015999999999998f, 12.459999999999999f, 15.447999999999999f, 12.0f, 15.999999999999998f, 12.0f)
                    lineTo(19.0f, 12.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 20.0f, 11.0f)
                    close()
                }
            }.build().also {
                _inbox = it
            }
    }


private var _inbox: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun InboxIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Inbox.imageVector,
            contentDescription = null,
    )
}
