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

val BezierIcons.PeopleList: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _peopleList ?: ImageVector.Builder(
                    name = "PeopleList",
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
                    moveTo(5.00018f, 7.00009f)
                    curveTo(6.10418f, 7.00009f, 7.00018f, 6.10409f, 7.00018f, 5.00009f)
                    curveTo(7.00018f, 3.89609f, 6.10418f, 3.00009f, 5.00018f, 3.00009f)
                    curveTo(3.89518f, 3.00009f, 3.00018f, 3.89609f, 3.00018f, 5.00009f)
                    curveTo(3.00018f, 6.10409f, 3.89518f, 7.00009f, 5.00018f, 7.00009f)
                    close()
                    moveTo(3.00018f, 16.0001f)
                    lineTo(4.00018f, 16.0001f)
                    lineTo(4.00018f, 20.0001f)
                    curveTo(4.00018f, 20.5524f, 4.4479f, 21.0001f, 5.00018f, 21.0001f)
                    curveTo(5.55247f, 21.0001f, 6.00018f, 20.5524f, 6.00018f, 20.0001f)
                    lineTo(6.00018f, 16.0001f)
                    lineTo(7.00018f, 16.0001f)
                    lineTo(7.00018f, 9.00009f)
                    curveTo(7.00018f, 8.44781f, 6.55247f, 8.00009f, 6.00018f, 8.00009f)
                    lineTo(4.00018f, 8.00009f)
                    curveTo(3.4479f, 8.00009f, 3.00018f, 8.44781f, 3.00018f, 9.00009f)
                    lineTo(3.00018f, 16.0001f)
                    close()
                    moveTo(10.0f, 5.0f)
                    curveTo(10.0f, 5.55228f, 10.4477f, 6.0f, 11.0f, 6.0f)
                    lineTo(20.0f, 6.0f)
                    curveTo(20.5523f, 6.0f, 21.0f, 5.55228f, 21.0f, 5.0f)
                    curveTo(21.0f, 4.44772f, 20.5523f, 4.0f, 20.0f, 4.0f)
                    lineTo(11.0f, 4.0f)
                    curveTo(10.4477f, 4.0f, 10.0f, 4.44772f, 10.0f, 5.0f)
                    close()
                    moveTo(10.0f, 12.0f)
                    curveTo(10.0f, 12.5523f, 10.4477f, 13.0f, 11.0f, 13.0f)
                    lineTo(20.0f, 13.0f)
                    curveTo(20.5523f, 13.0f, 21.0f, 12.5523f, 21.0f, 12.0f)
                    curveTo(21.0f, 11.4477f, 20.5523f, 11.0f, 20.0f, 11.0f)
                    lineTo(11.0f, 11.0f)
                    curveTo(10.4477f, 11.0f, 10.0f, 11.4477f, 10.0f, 12.0f)
                    close()
                    moveTo(11.0f, 20.0f)
                    curveTo(10.4477f, 20.0f, 10.0f, 19.5523f, 10.0f, 19.0f)
                    curveTo(10.0f, 18.4477f, 10.4477f, 18.0f, 11.0f, 18.0f)
                    lineTo(20.0f, 18.0f)
                    curveTo(20.5523f, 18.0f, 21.0f, 18.4477f, 21.0f, 19.0f)
                    curveTo(21.0f, 19.5523f, 20.5523f, 20.0f, 20.0f, 20.0f)
                    lineTo(11.0f, 20.0f)
                    close()
                }
            }.build().also {
                _peopleList = it
            }
    }


private var _peopleList: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun PeopleListIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.PeopleList.imageVector,
            contentDescription = null,
    )
}
