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

val BezierIcons.Google: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _google ?: ImageVector.Builder(
                    name = "Google",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(12.0f, 10.198f)
                    lineTo(12.0f, 14.048f)
                    lineTo(17.4f, 14.048f)
                    arcTo(4.63f, 4.63f, 10.18236558658985f, isMoreThanHalf = false, isPositiveArc = true, 15.402f, 17.088f)
                    lineTo(15.402f, 17.09f)
                    curveTo(14.505999999999998f, 17.698f, 13.35f, 18.043f, 12.003f, 18.043f)
                    curveTo(9.395f, 18.043f, 7.183f, 16.282999999999998f, 6.389f, 13.916999999999998f)
                    lineTo(6.385000000000001f, 13.916999999999998f)
                    arcTo(6.0f, 6.0f, 161.38746408990156f, isMoreThanHalf = false, isPositiveArc = true, 6.385000000000001f, 10.086999999999998f)
                    curveTo(7.175000000000001f, 7.716999999999998f, 9.391f, 5.956999999999998f, 12.0f, 5.956999999999998f)
                    arcTo(5.43f, 5.43f, 269.0687796300915f, isMoreThanHalf = false, isPositiveArc = true, 15.836f, 7.456999999999998f)
                    lineTo(18.691f, 4.6019999999999985f)
                    arcTo(9.6f, 9.6f, 313.1986294503533f, isMoreThanHalf = false, isPositiveArc = false, 12.0f, 2.001f)
                    arcTo(10.0f, 10.0f, 270.0010313425794f, isMoreThanHalf = false, isPositiveArc = false, 3.064f, 7.5120000000000005f)
                    arcTo(10.0f, 10.0f, 206.67954307236025f, isMoreThanHalf = false, isPositiveArc = false, 3.064f, 16.492f)
                    arcTo(10.0f, 10.0f, 153.3076325546982f, isMoreThanHalf = false, isPositiveArc = false, 12.0f, 22.0f)
                    curveTo(14.697f, 22.0f, 16.971f, 21.114f, 18.628f, 19.586f)
                    lineTo(18.626f, 19.584f)
                    curveTo(20.517000000000003f, 17.843f, 21.604000000000003f, 15.271999999999998f, 21.604000000000003f, 12.23f)
                    curveTo(21.604000000000003f, 11.55f, 21.549000000000003f, 10.867f, 21.432000000000002f, 10.198f)
                    close()
                }
            }.build().also {
                _google = it
            }
    }


private var _google: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun GoogleIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Google.imageVector,
            contentDescription = null,
    )
}
