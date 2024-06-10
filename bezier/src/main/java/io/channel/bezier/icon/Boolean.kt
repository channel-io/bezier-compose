@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierIcons

val BezierIcons.Boolean: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _boolean ?: ImageVector.Builder(
                    name = "Boolean",
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
                    moveTo(12.4642f, 4.46412f)
                    curveTo(13.4402f, 3.48812f, 14.7202f, 3.00012f, 16.0002f, 3.00012f)
                    curveTo(17.2792f, 3.00012f, 18.5592f, 3.48812f, 19.5352f, 4.46412f)
                    curveTo(21.4882f, 6.41712f, 21.4882f, 9.58312f, 19.5352f, 11.5361f)
                    curveTo(18.5592f, 12.5121f, 17.2792f, 13.0001f, 16.0002f, 13.0001f)
                    curveTo(14.7202f, 13.0001f, 13.4402f, 12.5121f, 12.4642f, 11.5361f)
                    curveTo(10.5122f, 9.58312f, 10.5122f, 6.41712f, 12.4642f, 4.46412f)
                    close()
                    moveTo(18.1212f, 5.87812f)
                    curveTo(17.5552f, 5.31212f, 16.8012f, 5.00012f, 16.0002f, 5.00012f)
                    curveTo(15.1992f, 5.00012f, 14.4452f, 5.31212f, 13.8782f, 5.87812f)
                    curveTo(13.3122f, 6.44512f, 13.0002f, 7.19912f, 13.0002f, 8.00012f)
                    curveTo(13.0002f, 8.80112f, 13.3122f, 9.55512f, 13.8782f, 10.1211f)
                    curveTo(14.4452f, 10.6881f, 15.1992f, 11.0001f, 16.0002f, 11.0001f)
                    curveTo(16.8012f, 11.0001f, 17.5552f, 10.6881f, 18.1212f, 10.1211f)
                    curveTo(18.6882f, 9.55512f, 19.0002f, 8.80112f, 19.0002f, 8.00012f)
                    curveTo(19.0002f, 7.19912f, 18.6882f, 6.44512f, 18.1212f, 5.87812f)
                    close()
                    moveTo(11.5355f, 19.5358f)
                    curveTo(9.58251f, 21.4888f, 6.41751f, 21.4888f, 4.46451f, 19.5358f)
                    curveTo(2.51151f, 17.5828f, 2.51151f, 14.4167f, 4.46451f, 12.4648f)
                    curveTo(6.41751f, 10.5118f, 9.58251f, 10.5118f, 11.5355f, 12.4648f)
                    curveTo(13.4875f, 14.4167f, 13.4875f, 17.5828f, 11.5355f, 19.5358f)
                    close()
                }
            }.build().also {
                _boolean = it
            }
    }


private var _boolean: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun BooleanIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Boolean.imageVector,
            contentDescription = null,
    )
}
