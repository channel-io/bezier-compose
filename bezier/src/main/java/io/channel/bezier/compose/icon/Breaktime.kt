@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.compose.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.compose.BezierIcon

val BezierIcon.Breaktime: ImageVector
    get() {
        return _breaktime ?: ImageVector.Builder(
                name = "Breaktime",
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
                moveTo(14.9972f, 5.0005f)
                curveTo(14.4662f, 5.0005f, 14.0002f, 5.3235f, 14.0002f, 5.6925f)
                lineTo(14.0002f, 6.0005f)
                lineTo(12.0002f, 6.0005f)
                lineTo(12.0002f, 5.6925f)
                curveTo(12.0002f, 4.2085f, 13.3442f, 3.0005f, 14.9972f, 3.0005f)
                curveTo(15.5282f, 3.0005f, 15.9942f, 2.6765f, 15.9942f, 2.3075f)
                lineTo(15.9942f, 2.0005f)
                lineTo(17.9942f, 2.0005f)
                lineTo(17.9942f, 2.3075f)
                curveTo(17.9942f, 3.7925f, 16.6502f, 5.0005f, 14.9972f, 5.0005f)
                close()
                moveTo(20.0002f, 12.8218f)
                curveTo(20.5892f, 12.5378f, 21.0002f, 11.9398f, 21.0002f, 11.2438f)
                lineTo(21.0002f, 8.9998f)
                lineTo(20.0002f, 8.9998f)
                lineTo(20.0002f, 12.8218f)
                close()
                moveTo(13.0002f, 18.9957f)
                curveTo(15.7572f, 18.9957f, 18.0002f, 16.7527f, 18.0002f, 13.9957f)
                lineTo(18.0002f, 8.9957f)
                lineTo(6.0002f, 8.9957f)
                lineTo(6.0002f, 13.9957f)
                curveTo(6.0002f, 16.7527f, 8.2432f, 18.9957f, 11.0002f, 18.9957f)
                lineTo(13.0002f, 18.9957f)
                close()
                moveTo(20.0002f, 6.9957f)
                lineTo(20.0002f, 6.9997f)
                lineTo(22.0002f, 6.9997f)
                curveTo(22.5525f, 6.9997f, 23.0002f, 7.4474f, 23.0002f, 7.9997f)
                lineTo(23.0002f, 11.2437f)
                curveTo(23.0002f, 13.0797f, 21.6742f, 14.6057f, 19.9302f, 14.9307f)
                curveTo(19.7172f, 16.5157f, 18.9772f, 17.9337f, 17.8852f, 18.9997f)
                lineTo(20.0002f, 18.9997f)
                curveTo(20.5525f, 18.9997f, 21.0002f, 19.4474f, 21.0002f, 19.9997f)
                curveTo(21.0002f, 20.552f, 20.5525f, 20.9997f, 20.0002f, 20.9997f)
                lineTo(4.0002f, 20.9997f)
                curveTo(3.4479f, 20.9997f, 3.0002f, 20.552f, 3.0002f, 19.9997f)
                curveTo(3.0002f, 19.4474f, 3.4479f, 18.9997f, 4.0002f, 18.9997f)
                lineTo(6.1152f, 18.9997f)
                curveTo(4.8122f, 17.7277f, 4.0002f, 15.9557f, 4.0002f, 13.9957f)
                lineTo(4.0002f, 7.9957f)
                curveTo(4.0002f, 7.4434f, 4.4479f, 6.9957f, 5.0002f, 6.9957f)
                lineTo(20.0002f, 6.9957f)
                close()
            }
        }.build().also {
            _breaktime = it
        }
    }

private var _breaktime: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun BreaktimeIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Breaktime,
            contentDescription = null,
    )
}
