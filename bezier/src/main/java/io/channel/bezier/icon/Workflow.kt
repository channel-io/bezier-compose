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

val BezierIcons.Workflow: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _workflow ?: ImageVector.Builder(
                    name = "Workflow",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                        pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(2.0f, 6.0f)
                    arcTo(3.5f, 3.5f, 179.95053834815639f, isMoreThanHalf = false, isPositiveArc = true, 8.855f, 5.0f)
                    lineTo(13.933f, 5.0f)
                    arcTo(4.0f, 4.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = true, 13.933f, 13.0f)
                    lineTo(10.0f, 13.0f)
                    arcTo(2.0f, 2.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = false, 10.0f, 17.0f)
                    lineTo(16.145f, 17.0f)
                    arcTo(3.502f, 3.502f, 196.77263067536254f, isMoreThanHalf = false, isPositiveArc = true, 23.0f, 18.0f)
                    arcTo(3.5f, 3.5f, 359.9505383481564f, isMoreThanHalf = false, isPositiveArc = true, 16.145f, 19.0f)
                    lineTo(10.0f, 19.0f)
                    arcTo(4.0f, 4.0f, 90.0f, isMoreThanHalf = false, isPositiveArc = true, 10.0f, 11.0f)
                    lineTo(13.933f, 11.0f)
                    arcTo(2.0f, 2.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 13.933f, 7.0f)
                    lineTo(8.855f, 7.0f)
                    arcTo(3.502f, 3.502f, 16.772630675362542f, isMoreThanHalf = false, isPositiveArc = true, 2.0f, 6.0f)
                    moveTo(18.333f, 18.0f)
                    arcTo(1.167f, 1.167f, 180.00000120741828f, isMoreThanHalf = true, isPositiveArc = false, 20.666999999999998f, 18.0f)
                    arcTo(1.167f, 1.167f, 359.9999987925817f, isMoreThanHalf = false, isPositiveArc = false, 18.333f, 18.0f)
                }
            }.build().also {
                _workflow = it
            }
    }


private var _workflow: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun WorkflowIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Workflow.imageVector,
            contentDescription = null,
    )
}
