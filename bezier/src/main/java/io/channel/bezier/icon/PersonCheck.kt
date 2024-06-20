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

val BezierIcons.PersonCheck: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _personCheck ?: ImageVector.Builder(
                    name = "PersonCheck",
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
                    moveTo(9.484f, 11.0f)
                    arcTo(3.5f, 3.5f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 9.484f, 4.0f)
                    arcTo(3.5f, 3.5f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 9.484f, 11.0f)
                    moveTo(9.652f, 12.007f)
                    arcTo(8.0f, 8.0f, 272.4271091941989f, isMoreThanHalf = false, isPositiveArc = true, 16.544f, 16.576999999999998f)
                    lineTo(15.5f, 17.62f)
                    lineTo(13.257f, 15.378f)
                    lineTo(10.429f, 18.206f)
                    lineTo(12.222f, 20.0f)
                    lineTo(2.007f, 20.0f)
                    arcTo(0.503f, 0.503f, 89.60826099085968f, isMoreThanHalf = false, isPositiveArc = true, 1.5010000000000001f, 19.476f)
                    arcTo(8.0f, 8.0f, 183.7582289195434f, isMoreThanHalf = false, isPositiveArc = true, 8.953f, 12.017999999999999f)
                    arcTo(4.0f, 4.0f, 264.4822189957631f, isMoreThanHalf = false, isPositiveArc = true, 9.402999999999999f, 11.999999999999998f)
                    lineTo(9.483999999999998f, 11.999999999999998f)
                    quadTo(9.568999999999999f, 11.999999999999998f, 9.651999999999997f, 12.006999999999998f)
                    moveTo(19.743f, 14.793f)
                    lineTo(15.5f, 19.036f)
                    lineTo(13.257f, 16.793000000000003f)
                    lineTo(11.843f, 18.207000000000004f)
                    lineTo(15.5f, 21.864000000000004f)
                    lineTo(21.157f, 16.207000000000004f)
                    close()
                }
            }.build().also {
                _personCheck = it
            }
    }


private var _personCheck: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun PersonCheckIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.PersonCheck.imageVector,
            contentDescription = null,
    )
}
