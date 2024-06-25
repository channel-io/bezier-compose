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

val BezierIcons.GoalOff: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _goalOff ?: ImageVector.Builder(
                    name = "GoalOff",
                    defaultWidth = 24.dp,
                    defaultHeight = 24.dp,
                    viewportWidth = 24f,
                    viewportHeight = 24f,
            ).apply {
                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                ) {
                    moveTo(12.0f, 20.0f)
                    lineTo(12.0f, 22.0f)
                    curveTo(13.96f, 22.0f, 15.79f, 21.433f, 17.335f, 20.455f)
                    lineTo(15.877f, 18.997f)
                    arcTo(7.95f, 7.95f, 60.90744678099708f, isMoreThanHalf = false, isPositiveArc = true, 12.0f, 20.0f)
                    moveTo(3.545f, 6.665f)
                    lineTo(5.004f, 8.124f)
                    arcTo(7.95f, 7.95f, 209.10731952677247f, isMoreThanHalf = false, isPositiveArc = false, 4.0f, 12.0f)
                    lineTo(2.0f, 12.0f)
                    curveTo(2.0f, 10.04f, 2.567f, 8.21f, 3.545f, 6.665f)
                    moveTo(8.0f, 17.414f)
                    lineTo(11.147f, 14.267000000000001f)
                    lineTo(9.733f, 12.853000000000002f)
                    lineTo(6.586f, 16.0f)
                    lineTo(4.914f, 16.0f)
                    arcTo(1.0f, 1.0f, 269.98776339474546f, isMoreThanHalf = false, isPositiveArc = false, 4.207f, 16.293f)
                    lineTo(1.927f, 18.573f)
                    arcTo(0.25f, 0.25f, 225.0725517985275f, isMoreThanHalf = false, isPositiveArc = false, 2.104f, 19.0f)
                    lineTo(5.0f, 19.0f)
                    lineTo(5.0f, 21.896f)
                    curveTo(5.0f, 22.119f, 5.27f, 22.231f, 5.427f, 22.073f)
                    lineTo(7.706999999999999f, 19.793f)
                    arcTo(1.0f, 1.0f, 45.008653510483754f, isMoreThanHalf = false, isPositiveArc = false, 8.0f, 19.086f)
                    close()
                }

                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(19.647f, 18.438f)
                    arcTo(9.96f, 9.96f, 40.203674377598716f, isMoreThanHalf = false, isPositiveArc = false, 22.0f, 12.0f)
                    curveTo(22.0f, 6.486f, 17.514f, 2.0f, 12.0f, 2.0f)
                    curveTo(9.55f, 2.0f, 7.303f, 2.886f, 5.562f, 4.354f)
                    lineTo(4.122f, 2.9130000000000003f)
                    arcTo(1.0f, 1.0f, 315.0202524107195f, isMoreThanHalf = false, isPositiveArc = false, 2.707f, 4.327f)
                    lineTo(19.677f, 21.296999999999997f)
                    arcTo(1.0f, 1.0f, 134.04560044921752f, isMoreThanHalf = false, isPositiveArc = false, 21.092f, 19.883999999999997f)
                    close()
                    moveTo(6.982f, 5.774f)
                    arcTo(7.96f, 7.96f, 230.99901185577306f, isMoreThanHalf = false, isPositiveArc = true, 12.0f, 4.0f)
                    curveTo(16.411f, 4.0f, 20.0f, 7.59f, 20.0f, 12.0f)
                    arcTo(7.96f, 7.96f, 359.93879571152723f, isMoreThanHalf = false, isPositiveArc = true, 18.226f, 17.018f)
                    close()
                }
            }.build().also {
                _goalOff = it
            }
    }


private var _goalOff: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun GoalOffIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.GoalOff.imageVector,
            contentDescription = null,
    )
}
