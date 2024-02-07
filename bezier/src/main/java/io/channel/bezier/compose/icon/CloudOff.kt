@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.compose.icon

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
import io.channel.bezier.compose.BezierIcon

val BezierIcon.CloudOff: ImageVector
    get() {
        return _cloudOff ?: ImageVector.Builder(
                name = "CloudOff",
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
                moveTo(2.7071f, 3.7929f)
                curveTo(2.3166f, 4.1834f, 2.3166f, 4.8166f, 2.7071f, 5.2071f)
                lineTo(19.6777f, 22.1777f)
                curveTo(20.0682f, 22.5682f, 20.7014f, 22.5682f, 21.0919f, 22.1777f)
                curveTo(21.4824f, 21.7871f, 21.4824f, 21.154f, 21.0919f, 20.7635f)
                lineTo(18.9904f, 18.662f)
                curveTo(21.3258f, 17.841f, 23.0f, 15.616f, 23.0f, 13.0f)
                curveTo(23.0f, 9.7529f, 20.4206f, 7.1082f, 17.1989f, 7.0032f)
                curveTo(16.1628f, 5.2094f, 14.2235f, 4.0f, 12.0f, 4.0f)
                curveTo(9.9155f, 4.0f, 8.0798f, 5.0626f, 7.0044f, 6.6759f)
                lineTo(4.1213f, 3.7929f)
                curveTo(3.7308f, 3.4024f, 3.0976f, 3.4024f, 2.7071f, 3.7929f)
                close()
                moveTo(8.4614f, 8.1329f)
                lineTo(17.3161f, 16.9877f)
                curveTo(19.3775f, 16.8265f, 21.0f, 15.1027f, 21.0f, 13.0f)
                curveTo(21.0f, 10.7909f, 19.2091f, 9.0f, 17.0f, 9.0f)
                lineTo(15.9296f, 9.0f)
                lineTo(15.6676f, 8.4004f)
                curveTo(15.0494f, 6.9856f, 13.6387f, 6.0f, 12.0f, 6.0f)
                curveTo(10.4654f, 6.0f, 9.1321f, 6.8646f, 8.4614f, 8.1329f)
                close()
                moveTo(4.7249f, 8.7249f)
                lineTo(6.5f, 10.5f)
                lineTo(6.25f, 10.5f)
                curveTo(4.4551f, 10.5f, 3.0f, 11.9551f, 3.0f, 13.75f)
                curveTo(3.0f, 15.5449f, 4.4551f, 17.0f, 6.25f, 17.0f)
                lineTo(13.0f, 17.0f)
                lineTo(15.0f, 19.0f)
                lineTo(6.25f, 19.0f)
                curveTo(3.3505f, 19.0f, 1.0f, 16.6495f, 1.0f, 13.75f)
                curveTo(1.0f, 11.3809f, 2.5692f, 9.3783f, 4.7249f, 8.7249f)
                close()
            }
        }.build().also {
            _cloudOff = it
        }
    }

private var _cloudOff: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CloudOffIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.CloudOff,
            contentDescription = null,
    )
}
