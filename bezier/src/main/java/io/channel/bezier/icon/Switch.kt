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

val BezierIcons.Switch: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_switch
        override val imageVector: ImageVector
            get() = _switch ?: ImageVector.Builder(
                    name = "Switch",
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
                    moveTo(9.0f, 4.0f)
                    arcTo(8.0f, 8.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = false, 9.0f, 20.0f)
                    lineTo(15.0f, 20.0f)
                    arcTo(8.0f, 8.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 15.0f, 4.0f)
                    close()
                    moveTo(15.0f, 6.0f)
                    arcTo(6.0f, 6.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = false, 15.0f, 18.0f)
                    arcTo(6.0f, 6.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 15.0f, 6.0f)
                }
            }.build().also {
                _switch = it
            }
    }


private var _switch: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun SwitchIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Switch.imageVector,
            contentDescription = null,
    )
}
