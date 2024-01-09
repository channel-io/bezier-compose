@file:Suppress("ObjectPropertyName", "UnusedReceiverParameter")

// Auto-generated by script/generate_compose_bezier_icon.py

package io.channel.bezier.compose.icon

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import io.channel.bezier.compose.BezierIcon

val BezierIcon.ChainReaction: ImageVector
    get() {
        return _chainReaction ?: ImageVector.Builder(
                name = "ChainReaction",
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
                moveTo(12.0f, 8.0f)
                curveTo(13.1107f, 8.0f, 14.0805f, 7.3964f, 14.5991f, 6.4993f)
                curveTo(16.9197f, 7.4291f, 18.6292f, 9.5663f, 18.9476f, 12.1331f)
                curveTo(19.0156f, 12.6812f, 19.515f, 13.0704f, 20.0631f, 13.0024f)
                curveTo(20.6112f, 12.9344f, 21.0004f, 12.435f, 20.9324f, 11.8869f)
                curveTo(20.5055f, 8.4457f, 18.137f, 5.605f, 14.9582f, 4.498f)
                curveTo(14.7193f, 3.0801f, 13.4858f, 2.0f, 12.0f, 2.0f)
                curveTo(10.3431f, 2.0f, 9.0f, 3.3431f, 9.0f, 5.0f)
                curveTo(9.0f, 6.6568f, 10.3431f, 8.0f, 12.0f, 8.0f)
                close()
                moveTo(16.4016f, 18.5004f)
                curveTo(16.1462f, 18.0591f, 16.0f, 17.5466f, 16.0f, 17.0f)
                curveTo(16.0f, 15.3431f, 17.3431f, 14.0f, 19.0f, 14.0f)
                curveTo(20.6569f, 14.0f, 22.0f, 15.3431f, 22.0f, 17.0f)
                curveTo(22.0f, 18.6569f, 20.6569f, 20.0f, 19.0f, 20.0f)
                curveTo(18.6323f, 20.0f, 18.28f, 19.9338f, 17.9545f, 19.8128f)
                curveTo(15.4078f, 22.0097f, 11.7669f, 22.641f, 8.5709f, 21.2912f)
                curveTo(8.0622f, 21.0763f, 7.8239f, 20.4897f, 8.0388f, 19.9809f)
                curveTo(8.2537f, 19.4721f, 8.8403f, 19.2339f, 9.3491f, 19.4488f)
                curveTo(11.7338f, 20.456f, 14.4372f, 20.0437f, 16.4016f, 18.5004f)
                close()
                moveTo(8.0f, 17.0f)
                curveTo(8.0f, 18.6569f, 6.6568f, 20.0f, 5.0f, 20.0f)
                curveTo(3.3431f, 20.0f, 2.0f, 18.6569f, 2.0f, 17.0f)
                curveTo(2.0f, 16.0706f, 2.4226f, 15.2399f, 3.0862f, 14.6897f)
                curveTo(2.453f, 11.382f, 3.7257f, 7.9138f, 6.4976f, 5.8218f)
                curveTo(6.9384f, 5.4891f, 7.5655f, 5.5768f, 7.8982f, 6.0176f)
                curveTo(8.2309f, 6.4584f, 8.1432f, 7.0855f, 7.7024f, 7.4182f)
                curveTo(5.6357f, 8.9779f, 4.6408f, 11.5236f, 4.9985f, 14.0f)
                lineTo(5.0f, 14.0f)
                curveTo(6.6568f, 14.0f, 8.0f, 15.3431f, 8.0f, 17.0f)
                close()
            }
        }.build().also {
            _chainReaction = it
        }
    }

private var _chainReaction: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChainReactionIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.ChainReaction,
            contentDescription = null,
    )
}
