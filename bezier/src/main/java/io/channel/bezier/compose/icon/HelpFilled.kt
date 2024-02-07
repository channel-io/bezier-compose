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

val BezierIcon.HelpFilled: ImageVector
    get() {
        return _helpFilled ?: ImageVector.Builder(
                name = "HelpFilled",
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
                moveTo(12.0002f, 2.0001f)
                curveTo(17.5228f, 2.0001f, 22.0002f, 6.4771f, 22.0002f, 12.0001f)
                curveTo(22.0002f, 17.5231f, 17.5228f, 22.0001f, 12.0002f, 22.0001f)
                curveTo(6.4769f, 22.0001f, 2.0002f, 17.5234f, 2.0002f, 12.0001f)
                curveTo(2.0002f, 6.4768f, 6.4769f, 2.0001f, 12.0002f, 2.0001f)
                close()
                moveTo(12.8308f, 14.541f)
                lineTo(10.9299f, 14.541f)
                lineTo(10.9299f, 13.8327f)
                curveTo(10.9299f, 12.6772f, 11.5552f, 11.5937f, 12.6017f, 10.9334f)
                curveTo(13.469f, 10.3871f, 13.9393f, 9.994f, 13.9393f, 9.4858f)
                curveTo(13.9393f, 8.4723f, 12.9388f, 7.925f, 11.9984f, 7.925f)
                curveTo(10.9639f, 7.925f, 10.0575f, 8.6544f, 10.0575f, 9.4858f)
                lineTo(8.1567f, 9.4858f)
                curveTo(8.1567f, 7.6099f, 9.9155f, 6.0242f, 11.9984f, 6.0242f)
                curveTo(14.1524f, 6.0242f, 15.8401f, 7.5449f, 15.8401f, 9.4858f)
                curveTo(15.8401f, 11.1395f, 14.4475f, 12.0179f, 13.6151f, 12.5411f)
                curveTo(13.379f, 12.6902f, 12.8308f, 13.1144f, 12.8308f, 13.8327f)
                lineTo(12.8308f, 14.541f)
                close()
                moveTo(11.9414f, 18.1723f)
                curveTo(11.2551f, 18.1723f, 10.6978f, 17.6161f, 10.6978f, 16.9288f)
                curveTo(10.6978f, 16.2415f, 11.2551f, 15.6852f, 11.9414f, 15.6852f)
                curveTo(12.6287f, 15.6852f, 13.1849f, 16.2415f, 13.1849f, 16.9288f)
                curveTo(13.1849f, 17.6161f, 12.6287f, 18.1723f, 11.9414f, 18.1723f)
                close()
            }
        }.build().also {
            _helpFilled = it
        }
    }

private var _helpFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun HelpFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.HelpFilled,
            contentDescription = null,
    )
}
