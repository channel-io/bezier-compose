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

val BezierIcons.TransferDisabled: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _transferDisabled ?: ImageVector.Builder(
                    name = "TransferDisabled",
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
                    moveTo(2.808f, 4.215f)
                    arcTo(1.0f, 1.0f, 136.2087320087955f, isMoreThanHalf = false, isPositiveArc = true, 4.228f, 2.807f)
                    lineTo(7.421f, 6.0f)
                    lineTo(17.0f, 6.0f)
                    lineTo(17.0f, 3.931f)
                    arcTo(0.8f, 0.8f, 180.02654147844697f, isMoreThanHalf = false, isPositiveArc = true, 18.366f, 3.366f)
                    lineTo(21.293f, 6.293f)
                    arcTo(1.0f, 1.0f, 315.008651662838f, isMoreThanHalf = false, isPositiveArc = true, 21.293f, 7.707f)
                    lineTo(18.366f, 10.634f)
                    arcTo(0.8f, 0.8f, 44.96801042191744f, isMoreThanHalf = false, isPositiveArc = true, 17.0f, 10.07f)
                    lineTo(17.0f, 8.0f)
                    lineTo(9.421f, 8.0f)
                    lineTo(21.2f, 19.778f)
                    arcTo(1.0f, 1.0f, 315.7224906879578f, isMoreThanHalf = false, isPositiveArc = true, 19.791999999999998f, 21.198f)
                    close()
                    moveTo(13.178f, 16.0f)
                    lineTo(7.0f, 16.0f)
                    lineTo(7.0f, 13.931000000000001f)
                    arcTo(0.8f, 0.8f, 359.973458521553f, isMoreThanHalf = false, isPositiveArc = false, 5.634f, 13.366000000000001f)
                    lineTo(2.7070000000000003f, 16.293000000000003f)
                    arcTo(1.0f, 1.0f, 224.99134833716207f, isMoreThanHalf = false, isPositiveArc = false, 2.7070000000000003f, 17.707000000000004f)
                    lineTo(5.634f, 20.634000000000004f)
                    arcTo(0.8f, 0.8f, 135.0318958890256f, isMoreThanHalf = false, isPositiveArc = false, 7.0f, 20.068f)
                    lineTo(7.0f, 18.0f)
                    lineTo(15.179f, 18.0f)
                    close()
                }
            }.build().also {
                _transferDisabled = it
            }
    }


private var _transferDisabled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun TransferDisabledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.TransferDisabled.imageVector,
            contentDescription = null,
    )
}
