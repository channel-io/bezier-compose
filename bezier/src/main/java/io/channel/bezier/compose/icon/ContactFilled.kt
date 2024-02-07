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

val BezierIcon.ContactFilled: ImageVector
    get() {
        return _contactFilled ?: ImageVector.Builder(
                name = "ContactFilled",
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
                moveTo(3.0055f, 7.0064f)
                curveTo(3.0236f, 5.6525f, 3.1015f, 4.8404f, 3.436f, 4.184f)
                curveTo(3.8195f, 3.4314f, 4.4314f, 2.8195f, 5.184f, 2.436f)
                curveTo(6.0397f, 2.0f, 7.1598f, 2.0f, 9.4f, 2.0f)
                lineTo(14.6f, 2.0f)
                curveTo(16.8402f, 2.0f, 17.9603f, 2.0f, 18.816f, 2.436f)
                curveTo(19.5686f, 2.8195f, 20.1805f, 3.4314f, 20.564f, 4.184f)
                curveTo(21.0f, 5.0397f, 21.0f, 6.1598f, 21.0f, 8.4f)
                lineTo(21.0f, 15.6f)
                curveTo(21.0f, 17.8402f, 21.0f, 18.9603f, 20.564f, 19.816f)
                curveTo(20.1805f, 20.5686f, 19.5686f, 21.1805f, 18.816f, 21.564f)
                curveTo(17.9603f, 22.0f, 16.8402f, 22.0f, 14.6f, 22.0f)
                lineTo(9.4f, 22.0f)
                curveTo(7.1598f, 22.0f, 6.0397f, 22.0f, 5.184f, 21.564f)
                curveTo(4.4314f, 21.1805f, 3.8195f, 20.5686f, 3.436f, 19.816f)
                curveTo(3.1015f, 19.1596f, 3.0236f, 18.3475f, 3.0055f, 16.9936f)
                curveTo(2.839f, 16.9853f, 2.7204f, 16.9666f, 2.6173f, 16.9239f)
                curveTo(2.3723f, 16.8224f, 2.1776f, 16.6277f, 2.0761f, 16.3827f)
                curveTo(2.0f, 16.1989f, 2.0f, 15.9659f, 2.0f, 15.5f)
                curveTo(2.0f, 15.0341f, 2.0f, 14.8011f, 2.0761f, 14.6173f)
                curveTo(2.1776f, 14.3723f, 2.3723f, 14.1776f, 2.6173f, 14.0761f)
                curveTo(2.7193f, 14.0339f, 2.8364f, 14.0151f, 3.0f, 14.0067f)
                lineTo(3.0f, 9.9933f)
                curveTo(2.8364f, 9.9849f, 2.7193f, 9.9661f, 2.6173f, 9.9239f)
                curveTo(2.3723f, 9.8224f, 2.1776f, 9.6277f, 2.0761f, 9.3827f)
                curveTo(2.0f, 9.1989f, 2.0f, 8.9659f, 2.0f, 8.5f)
                curveTo(2.0f, 8.0341f, 2.0f, 7.8011f, 2.0761f, 7.6173f)
                curveTo(2.1776f, 7.3723f, 2.3723f, 7.1776f, 2.6173f, 7.0761f)
                curveTo(2.7204f, 7.0334f, 2.839f, 7.0147f, 3.0055f, 7.0064f)
                close()
                moveTo(12.0f, 11.5f)
                curveTo(13.1046f, 11.5f, 14.0f, 10.6046f, 14.0f, 9.5f)
                curveTo(14.0f, 8.3954f, 13.1046f, 7.5f, 12.0f, 7.5f)
                curveTo(10.8954f, 7.5f, 10.0f, 8.3954f, 10.0f, 9.5f)
                curveTo(10.0f, 10.6046f, 10.8954f, 11.5f, 12.0f, 11.5f)
                close()
                moveTo(16.2144f, 17.0f)
                lineTo(7.786f, 17.0f)
                curveTo(7.6253f, 17.0f, 7.4903f, 16.865f, 7.5005f, 16.7056f)
                curveTo(7.6523f, 14.3513f, 9.6093f, 12.4907f, 12.0008f, 12.4907f)
                curveTo(14.3911f, 12.4907f, 16.3481f, 14.3513f, 16.4999f, 16.7056f)
                curveTo(16.5101f, 16.865f, 16.3751f, 17.0f, 16.2144f, 17.0f)
                close()
            }
        }.build().also {
            _contactFilled = it
        }
    }

private var _contactFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ContactFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.ContactFilled,
            contentDescription = null,
    )
}
