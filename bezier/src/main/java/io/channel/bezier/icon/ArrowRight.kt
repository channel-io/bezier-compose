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

val BezierIcon.ArrowRight: ImageVector
    get() {
        return _arrowRight ?: ImageVector.Builder(
                name = "ArrowRight",
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
                moveTo(11.7287f, 20.7423f)
                curveTo(11.3263f, 20.3641f, 11.3066f, 19.7312f, 11.6848f, 19.3287f)
                lineTo(17.6322f, 13.0f)
                lineTo(4.0f, 13.0f)
                curveTo(3.4477f, 13.0f, 3.0f, 12.5523f, 3.0f, 12.0f)
                curveTo(3.0f, 11.4478f, 3.4477f, 11.0f, 4.0f, 11.0f)
                lineTo(17.6068f, 11.0f)
                lineTo(11.6848f, 4.6984f)
                curveTo(11.3066f, 4.2959f, 11.3263f, 3.663f, 11.7287f, 3.2848f)
                curveTo(12.1312f, 2.9066f, 12.764f, 2.9263f, 13.1422f, 3.3287f)
                lineTo(20.3385f, 10.9863f)
                curveTo(20.881f, 11.5637f, 20.881f, 12.4634f, 20.3385f, 13.0408f)
                lineTo(13.1423f, 20.6984f)
                curveTo(12.764f, 21.1008f, 12.1312f, 21.1205f, 11.7287f, 20.7423f)
                close()
            }
        }.build().also {
            _arrowRight = it
        }
    }

private var _arrowRight: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ArrowRightIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.ArrowRight,
            contentDescription = null,
    )
}