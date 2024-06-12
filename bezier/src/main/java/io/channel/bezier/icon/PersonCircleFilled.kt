@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons

val BezierIcons.PersonCircleFilled: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _personCircleFilled ?: ImageVector.Builder(
                    name = "PersonCircleFilled",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                ) {
                    moveTo(12.0002f, 2.00012f)
                    curveTo(6.4769f, 2.00012f, 2.00018f, 6.47684f, 2.00018f, 12.0001f)
                    curveTo(2.00018f, 17.5234f, 6.4769f, 22.0001f, 12.0002f, 22.0001f)
                    curveTo(17.5228f, 22.0001f, 22.0002f, 17.5231f, 22.0002f, 12.0001f)
                    curveTo(22.0002f, 6.47717f, 17.5228f, 2.00012f, 12.0002f, 2.00012f)
                    close()
                    moveTo(12.0002f, 4.00012f)
                    curveTo(16.4183f, 4.00012f, 20.0002f, 7.58177f, 20.0002f, 12.0001f)
                    curveTo(20.0002f, 14.1689f, 19.1372f, 16.136f, 17.7359f, 17.5769f)
                    curveTo(17.0801f, 15.1232f, 14.7515f, 13.296f, 12.0002f, 13.296f)
                    curveTo(9.24875f, 13.296f, 6.92005f, 15.1234f, 6.2644f, 17.5773f)
                    curveTo(4.8631f, 16.1364f, 4.00018f, 14.1691f, 4.00018f, 12.0001f)
                    curveTo(4.00018f, 7.58141f, 7.58147f, 4.00012f, 12.0002f, 4.00012f)
                    close()
                    moveTo(12.0002f, 12.3018f)
                    curveTo(13.4092f, 12.3018f, 14.5512f, 11.1588f, 14.5512f, 9.75082f)
                    curveTo(14.5512f, 8.34182f, 13.4092f, 7.19882f, 12.0002f, 7.19882f)
                    curveTo(10.5912f, 7.19882f, 9.44818f, 8.34182f, 9.44818f, 9.75082f)
                    curveTo(9.44818f, 11.1588f, 10.5912f, 12.3018f, 12.0002f, 12.3018f)
                    close()
                }
            }.build().also {
                _personCircleFilled = it
            }
    }


private var _personCircleFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun PersonCircleFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.PersonCircleFilled.imageVector,
            contentDescription = null,
    )
}
