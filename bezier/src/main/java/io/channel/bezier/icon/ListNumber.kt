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

val BezierIcons.ListNumber: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _listNumber ?: ImageVector.Builder(
                    name = "ListNumber",
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
                    moveTo(4.604f, 3.089f)
                    arcTo(0.75f, 0.75f, 298.1641970835811f, isMoreThanHalf = false, isPositiveArc = true, 5.0f, 3.75f)
                    lineTo(5.0f, 8.75f)
                    arcTo(0.75f, 0.75f, 0.0f, isMoreThanHalf = false, isPositiveArc = true, 3.5f, 8.75f)
                    lineTo(3.5f, 5.151f)
                    lineTo(3.166f, 5.374f)
                    arcTo(0.75f, 0.75f, 56.93990930288017f, isMoreThanHalf = false, isPositiveArc = true, 2.334f, 4.1259999999999994f)
                    lineTo(3.834f, 3.1259999999999994f)
                    arcTo(0.75f, 0.75f, 236.32327250473298f, isMoreThanHalf = false, isPositiveArc = true, 4.604f, 3.0889999999999995f)
                    moveTo(8.0f, 5.0f)
                    arcTo(1.0f, 1.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = false, 9.0f, 6.0f)
                    lineTo(20.0f, 6.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 20.0f, 4.0f)
                    lineTo(9.0f, 4.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = false, isPositiveArc = false, 8.0f, 5.0f)
                    moveTo(9.0f, 13.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = true, 9.0f, 11.0f)
                    lineTo(20.0f, 11.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = true, 20.0f, 13.0f)
                    close()
                    moveTo(9.0f, 20.0f)
                    arcTo(1.0f, 1.0f, 90.0f, isMoreThanHalf = true, isPositiveArc = true, 9.0f, 18.0f)
                    lineTo(20.0f, 18.0f)
                    arcTo(1.0f, 1.0f, 270.0f, isMoreThanHalf = true, isPositiveArc = true, 20.0f, 20.0f)
                    close()
                    moveTo(3.684f, 16.747f)
                    arcTo(0.555f, 0.555f, 213.4941396084013f, isMoreThanHalf = true, isPositiveArc = true, 4.538f, 17.447f)
                    lineTo(2.22f, 19.767f)
                    arcTo(0.75f, 0.75f, 224.96438060756947f, isMoreThanHalf = false, isPositiveArc = false, 2.75f, 21.047f)
                    lineTo(5.75f, 21.047f)
                    arcTo(0.75f, 0.75f, 90.0f, isMoreThanHalf = true, isPositiveArc = false, 5.75f, 19.547f)
                    lineTo(4.56f, 19.547f)
                    lineTo(5.6f, 18.508f)
                    arcTo(2.055f, 2.055f, 44.9972412974693f, isMoreThanHalf = true, isPositiveArc = false, 2.437f, 15.915f)
                    lineTo(2.127f, 16.38f)
                    arcTo(0.75f, 0.75f, 213.0600906971217f, isMoreThanHalf = false, isPositiveArc = false, 3.375f, 17.212f)
                    close()
                }
            }.build().also {
                _listNumber = it
            }
    }


private var _listNumber: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ListNumberIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.ListNumber.imageVector,
            contentDescription = null,
    )
}
