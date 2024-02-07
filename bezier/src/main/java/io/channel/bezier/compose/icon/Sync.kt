@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.compose.icon

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
import io.channel.bezier.compose.BezierIcon

val BezierIcon.Sync: ImageVector
    get() {
        return _sync ?: ImageVector.Builder(
                name = "Sync",
                defaultWidth = 24.dp,
                defaultHeight = 24.dp,
                viewportWidth = 24f,
                viewportHeight = 24f,
        ).apply {
            path(
                    fill = SolidColor(Color(0xFF313234)),
                    strokeLineWidth = 1f,
            ) {
                moveTo(15.8732f, 9.25f)
                lineTo(21.5002f, 9.25f)
                curveTo(21.7762f, 9.25f, 22.0002f, 9.026f, 22.0002f, 8.75f)
                lineTo(22.0002f, 3.123f)
                curveTo(22.0002f, 2.677f, 21.4612f, 2.455f, 21.1462f, 2.77f)
                lineTo(19.0272f, 4.889f)
                curveTo(17.1432f, 3.027f, 14.6512f, 2.0f, 12.0002f, 2.0f)
                curveTo(6.8231f, 2.0f, 2.5523f, 5.9545f, 2.0496f, 11.0014f)
                curveTo(1.9949f, 11.551f, 2.4479f, 12.0f, 3.0002f, 12.0f)
                curveTo(3.5525f, 12.0f, 3.9936f, 11.55f, 4.0621f, 11.002f)
                curveTo(4.5549f, 7.0602f, 7.9271f, 4.0f, 12.0002f, 4.0f)
                curveTo(14.1172f, 4.0f, 16.1062f, 4.819f, 17.6132f, 6.303f)
                lineTo(15.5202f, 8.396f)
                curveTo(15.2052f, 8.711f, 15.4282f, 9.25f, 15.8732f, 9.25f)
                close()
                moveTo(8.1272f, 14.75f)
                lineTo(2.5002f, 14.75f)
                curveTo(2.2242f, 14.75f, 2.0002f, 14.974f, 2.0002f, 15.25f)
                lineTo(2.0002f, 20.877f)
                curveTo(2.0002f, 21.322f, 2.5392f, 21.545f, 2.8542f, 21.23f)
                lineTo(4.9732f, 19.111f)
                curveTo(6.8562f, 20.973f, 9.3492f, 22.0f, 12.0002f, 22.0f)
                curveTo(17.1772f, 22.0f, 21.4481f, 18.0455f, 21.9507f, 12.9986f)
                curveTo(22.0054f, 12.449f, 21.5525f, 12.0f, 21.0002f, 12.0f)
                curveTo(20.4479f, 12.0f, 20.0068f, 12.45f, 19.9382f, 12.998f)
                curveTo(19.4455f, 16.9398f, 16.0733f, 20.0f, 12.0002f, 20.0f)
                curveTo(9.8832f, 20.0f, 7.8932f, 19.181f, 6.3872f, 17.697f)
                lineTo(8.4802f, 15.604f)
                curveTo(8.7952f, 15.289f, 8.5722f, 14.75f, 8.1272f, 14.75f)
                close()
            }
        }.build().also {
            _sync = it
        }
    }

private var _sync: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun SyncIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Sync,
            contentDescription = null,
    )
}
