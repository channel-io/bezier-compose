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

val BezierIcon.Untag: ImageVector
    get() {
        return _untag ?: ImageVector.Builder(
                name = "Untag",
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
                moveTo(10.0482f, 19.6064f)
                lineTo(13.6202f, 16.0344f)
                lineTo(15.0342f, 17.4484f)
                lineTo(11.1082f, 21.3744f)
                curveTo(10.8252f, 21.6574f, 10.4482f, 21.8134f, 10.0482f, 21.8134f)
                lineTo(10.0472f, 21.8134f)
                curveTo(9.6462f, 21.8134f, 9.2702f, 21.6574f, 8.9872f, 21.3744f)
                lineTo(2.6262f, 15.0124f)
                curveTo(2.0412f, 14.4274f, 2.0412f, 13.4764f, 2.6262f, 12.8914f)
                lineTo(6.5519f, 8.9661f)
                lineTo(7.9662f, 10.3804f)
                lineTo(4.3942f, 13.9524f)
                lineTo(10.0482f, 19.6064f)
                close()
                moveTo(10.3804f, 7.9662f)
                lineTo(14.3462f, 4.0004f)
                lineTo(20.0002f, 4.0004f)
                lineTo(20.0002f, 9.6544f)
                lineTo(16.0344f, 13.6202f)
                lineTo(10.3804f, 7.9662f)
                close()
                moveTo(17.4484f, 15.0342f)
                lineTo(22.0002f, 10.4824f)
                lineTo(22.0002f, 2.0004f)
                lineTo(13.5182f, 2.0004f)
                lineTo(8.9662f, 6.552f)
                lineTo(4.9142f, 2.5f)
                curveTo(4.5237f, 2.1095f, 3.8905f, 2.1095f, 3.5f, 2.5f)
                curveTo(3.1095f, 2.8905f, 3.1095f, 3.5237f, 3.5f, 3.9142f)
                lineTo(20.0858f, 20.5f)
                curveTo(20.4763f, 20.8905f, 21.1095f, 20.8905f, 21.5f, 20.5f)
                curveTo(21.8905f, 20.1095f, 21.8905f, 19.4763f, 21.5f, 19.0858f)
                lineTo(17.4484f, 15.0342f)
                close()
                moveTo(18.6149f, 7.0294f)
                curveTo(18.6149f, 7.8584f, 17.9439f, 8.5294f, 17.1149f, 8.5294f)
                curveTo(16.2869f, 8.5294f, 15.6149f, 7.8584f, 15.6149f, 7.0294f)
                curveTo(15.6149f, 6.2004f, 16.2869f, 5.5294f, 17.1149f, 5.5294f)
                curveTo(17.9439f, 5.5294f, 18.6149f, 6.2004f, 18.6149f, 7.0294f)
                close()
            }
        }.build().also {
            _untag = it
        }
    }

private var _untag: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun UntagIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Untag,
            contentDescription = null,
    )
}