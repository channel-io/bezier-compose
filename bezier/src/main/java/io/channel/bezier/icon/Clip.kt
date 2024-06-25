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

val BezierIcons.Clip: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _clip ?: ImageVector.Builder(
                    name = "Clip",
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
                    moveTo(20.486f, 13.487f)
                    arcTo(1.0f, 1.0f, 314.9913483371621f, isMoreThanHalf = false, isPositiveArc = false, 19.072f, 13.487f)
                    lineTo(13.535f, 19.024f)
                    arcTo(5.0f, 5.0f, 45.99574461357872f, isMoreThanHalf = false, isPositiveArc = true, 6.465f, 11.954f)
                    lineTo(13.54f, 4.877000000000001f)
                    arcTo(2.992f, 2.992f, 224.99323068703612f, isMoreThanHalf = true, isPositiveArc = true, 17.773f, 9.109000000000002f)
                    lineTo(10.613f, 16.268f)
                    arcTo(1.005f, 1.005f, 44.97986029006903f, isMoreThanHalf = true, isPositiveArc = true, 9.19f, 14.846f)
                    lineTo(14.809999999999999f, 9.225999999999999f)
                    arcTo(1.0f, 1.0f, 45.02025361764865f, isMoreThanHalf = true, isPositiveArc = false, 13.395999999999999f, 7.810999999999999f)
                    lineTo(7.775999999999999f, 13.431f)
                    arcTo(3.005f, 3.005f, 225.03085905936595f, isMoreThanHalf = false, isPositiveArc = false, 7.775999999999999f, 17.683f)
                    arcTo(3.005f, 3.005f, 135.01738562717262f, isMoreThanHalf = false, isPositiveArc = false, 12.027999999999999f, 17.682f)
                    lineTo(19.188f, 10.523f)
                    arcTo(4.993f, 4.993f, 45.387409504100034f, isMoreThanHalf = true, isPositiveArc = false, 12.125999999999998f, 3.463f)
                    lineTo(5.05f, 10.54f)
                    arcTo(7.0f, 7.0f, 224.9999992115624f, isMoreThanHalf = false, isPositiveArc = false, 14.95f, 20.439999999999998f)
                    lineTo(20.485999999999997f, 14.901999999999997f)
                    arcTo(1.0f, 1.0f, 44.991348337162f, isMoreThanHalf = false, isPositiveArc = false, 20.485999999999997f, 13.487999999999998f)
                }
            }.build().also {
                _clip = it
            }
    }


private var _clip: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ClipIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Clip.imageVector,
            contentDescription = null,
    )
}
