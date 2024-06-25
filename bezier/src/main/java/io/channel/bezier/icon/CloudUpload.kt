@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

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

val BezierIcons.CloudUpload: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _cloudUpload ?: ImageVector.Builder(
                    name = "CloudUpload",
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
                    moveTo(12.0f, 6.0f)
                    arcTo(4.0f, 4.0f, 270.0021612250254f, isMoreThanHalf = false, isPositiveArc = false, 8.02f, 9.599f)
                    lineTo(7.93f, 10.5f)
                    lineTo(6.25f, 10.5f)
                    arcTo(3.25f, 3.25f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 6.25f, 17.0f)
                    lineTo(8.0f, 17.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = true, 8.0f, 19.0f)
                    lineTo(6.25f, 19.0f)
                    arcTo(5.25f, 5.25f, 89.67260021563486f, isMoreThanHalf = false, isPositiveArc = true, 6.19f, 8.5f)
                    arcTo(6.002f, 6.002f, 194.50484111102298f, isMoreThanHalf = false, isPositiveArc = true, 17.199f, 7.003f)
                    arcTo(6.0f, 6.0f, 271.8096417282573f, isMoreThanHalf = false, isPositiveArc = true, 17.0f, 19.0f)
                    lineTo(16.0f, 19.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = true, 16.0f, 17.0f)
                    lineTo(17.0f, 17.0f)
                    arcTo(4.0f, 4.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 17.0f, 9.0f)
                    lineTo(15.93f, 9.0f)
                    lineTo(15.668f, 8.4f)
                    arcTo(4.0f, 4.0f, 336.4218288685546f, isMoreThanHalf = false, isPositiveArc = false, 12.0f, 6.0f)
                    moveTo(11.293f, 10.293f)
                    arcTo(1.0f, 1.0f, 225.008651662838f, isMoreThanHalf = false, isPositiveArc = true, 12.706999999999999f, 10.293f)
                    lineTo(15.633999999999999f, 13.219999999999999f)
                    arcTo(0.8f, 0.8f, 314.9681205173722f, isMoreThanHalf = false, isPositiveArc = true, 15.068999999999999f, 14.585999999999999f)
                    lineTo(13.0f, 14.585999999999999f)
                    lineTo(13.0f, 18.0f)
                    arcTo(1.0f, 1.0f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 11.0f, 18.0f)
                    lineTo(11.0f, 14.586f)
                    lineTo(8.931f, 14.586f)
                    arcTo(0.8f, 0.8f, 90.02654147845973f, isMoreThanHalf = false, isPositiveArc = true, 8.366f, 13.22f)
                    close()
                }
            }.build().also {
                _cloudUpload = it
            }
    }


private var _cloudUpload: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun CloudUploadIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.CloudUpload.imageVector,
            contentDescription = null,
    )
}
