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

val BezierIcons.Sync: BezierIcon
    get() = object : BezierIcon {
        @DrawableRes
        override val resourceId: Int = R.drawable.icon_sync
        override val imageVector: ImageVector
            get() = _sync ?: ImageVector.Builder(
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
                    moveTo(15.873f, 9.25f)
                    lineTo(21.5f, 9.25f)
                    arcTo(0.5f, 0.5f, 90.0f, isMoreThanHalf = false, isPositiveArc = false, 22.0f, 8.75f)
                    lineTo(22.0f, 3.123f)
                    arcTo(0.5f, 0.5f, 359.9878298026262f, isMoreThanHalf = false, isPositiveArc = false, 21.146f, 2.7700000000000005f)
                    lineTo(19.027f, 4.889000000000001f)
                    arcTo(9.93f, 9.93f, 314.8414895123731f, isMoreThanHalf = false, isPositiveArc = false, 12.0f, 2.0f)
                    curveTo(6.823f, 2.0f, 2.5519999999999996f, 5.954000000000001f, 2.0500000000000007f, 11.001f)
                    curveTo(1.9950000000000008f, 11.551f, 2.448000000000001f, 12.0f, 3.000000000000001f, 12.0f)
                    curveTo(3.552000000000001f, 12.0f, 3.9940000000000007f, 11.55f, 4.062000000000001f, 11.002f)
                    curveTo(4.555f, 7.06f, 7.927f, 4.0f, 12.0f, 4.0f)
                    curveTo(14.117f, 4.0f, 16.106f, 4.819f, 17.613f, 6.303f)
                    lineTo(15.52f, 8.396f)
                    arcTo(0.5f, 0.5f, 225.07242377268008f, isMoreThanHalf = false, isPositiveArc = false, 15.873f, 9.25f)
                    moveTo(8.127f, 14.75f)
                    lineTo(2.5f, 14.75f)
                    arcTo(0.5f, 0.5f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 2.0f, 15.25f)
                    lineTo(2.0f, 20.877f)
                    arcTo(0.5f, 0.5f, 179.9878298026262f, isMoreThanHalf = false, isPositiveArc = false, 2.854f, 21.23f)
                    lineTo(4.974f, 19.111f)
                    arcTo(9.93f, 9.93f, 134.84146946932896f, isMoreThanHalf = false, isPositiveArc = false, 12.0f, 22.0f)
                    curveTo(17.177f, 22.0f, 21.448f, 18.046f, 21.95f, 12.999f)
                    curveTo(22.005f, 12.449f, 21.552f, 12.0f, 21.0f, 12.0f)
                    curveTo(20.448f, 12.0f, 20.007f, 12.45f, 19.938f, 12.998f)
                    curveTo(19.446f, 16.94f, 16.073f, 20.0f, 12.0f, 20.0f)
                    arcTo(7.95f, 7.95f, 89.87676114273553f, isMoreThanHalf = false, isPositiveArc = true, 6.387f, 17.697f)
                    lineTo(8.48f, 15.604f)
                    arcTo(0.5f, 0.5f, 45.07242377268008f, isMoreThanHalf = false, isPositiveArc = false, 8.127f, 14.75f)
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
            imageVector = BezierIcons.Sync.imageVector,
            contentDescription = null,
    )
}
