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

val BezierIcon.Contract: ImageVector
    get() {
        return io.channel.bezier.icon._contract ?: ImageVector.Builder(
                name = "Contract",
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
                moveTo(19.9393f, 4.0571f)
                curveTo(19.5488f, 3.6666f, 18.9157f, 3.6666f, 18.5251f, 4.0571f)
                lineTo(14.7929f, 7.7894f)
                lineTo(14.1851f, 7.1816f)
                curveTo(13.4997f, 6.4962f, 13.157f, 6.1535f, 12.8628f, 6.1303f)
                curveTo(12.6075f, 6.1102f, 12.358f, 6.2136f, 12.1917f, 6.4083f)
                curveTo(12.0f, 6.6327f, 12.0f, 7.1174f, 12.0f, 8.0866f)
                lineTo(12.0f, 10.3965f)
                curveTo(12.0f, 10.9565f, 12.0f, 11.2365f, 12.109f, 11.4505f)
                curveTo(12.2049f, 11.6386f, 12.3578f, 11.7916f, 12.546f, 11.8875f)
                curveTo(12.7599f, 11.9965f, 13.0399f, 11.9965f, 13.6f, 11.9965f)
                lineTo(15.9098f, 11.9965f)
                curveTo(16.8791f, 11.9965f, 17.3638f, 11.9965f, 17.5882f, 11.8048f)
                curveTo(17.7829f, 11.6385f, 17.8863f, 11.389f, 17.8662f, 11.1337f)
                curveTo(17.843f, 10.8395f, 17.5003f, 10.4968f, 16.8149f, 9.8114f)
                lineTo(16.8149f, 9.8114f)
                lineTo(16.8149f, 9.8114f)
                lineTo(16.2071f, 9.2036f)
                lineTo(19.9393f, 5.4713f)
                curveTo(20.3299f, 5.0808f, 20.3299f, 4.4476f, 19.9393f, 4.0571f)
                close()
                moveTo(11.9965f, 15.9098f)
                curveTo(11.9965f, 16.8791f, 11.9965f, 17.3638f, 11.8048f, 17.5882f)
                curveTo(11.6385f, 17.7829f, 11.389f, 17.8863f, 11.1337f, 17.8662f)
                curveTo(10.8395f, 17.843f, 10.4968f, 17.5003f, 9.8114f, 16.8149f)
                lineTo(9.2036f, 16.2071f)
                lineTo(5.4713f, 19.9393f)
                curveTo(5.0808f, 20.3299f, 4.4476f, 20.3299f, 4.0571f, 19.9393f)
                curveTo(3.6666f, 19.5488f, 3.6666f, 18.9156f, 4.0571f, 18.5251f)
                lineTo(7.7893f, 14.7929f)
                lineTo(7.1816f, 14.1851f)
                curveTo(6.4962f, 13.4997f, 6.1535f, 13.157f, 6.1303f, 12.8628f)
                curveTo(6.1102f, 12.6075f, 6.2135f, 12.358f, 6.4083f, 12.1917f)
                curveTo(6.6327f, 12.0f, 7.1173f, 12.0f, 8.0866f, 12.0f)
                lineTo(10.3965f, 12.0f)
                curveTo(10.9565f, 12.0f, 11.2365f, 12.0f, 11.4504f, 12.109f)
                curveTo(11.6386f, 12.2049f, 11.7916f, 12.3579f, 11.8875f, 12.546f)
                curveTo(11.9965f, 12.7599f, 11.9965f, 13.0399f, 11.9965f, 13.6f)
                lineTo(11.9965f, 15.9098f)
                close()
            }
        }.build().also {
            io.channel.bezier.icon._contract = it
        }
    }

private var _contract: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ContractIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.Contract,
            contentDescription = null,
    )
}