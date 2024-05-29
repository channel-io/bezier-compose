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

val BezierIcon.ChatQuestionFilled: ImageVector
    get() {
        return _chatQuestionFilled ?: ImageVector.Builder(
                name = "ChatQuestionFilled",
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
                moveTo(20.8223f, 16.683f)
                curveTo(20.5763f, 17.144f, 20.5573f, 17.694f, 20.7233f, 18.19f)
                lineTo(21.3613f, 20.105f)
                curveTo(21.6223f, 20.886f, 20.8793f, 21.63f, 20.0973f, 21.37f)
                curveTo(19.6395f, 21.2172f, 19.1583f, 21.0569f, 18.7279f, 20.9135f)
                curveTo(18.5302f, 20.8476f, 18.3433f, 20.7853f, 18.1743f, 20.729f)
                curveTo(17.6813f, 20.565f, 17.1373f, 20.584f, 16.6783f, 20.829f)
                curveTo(14.7293f, 21.868f, 12.4033f, 22.29f, 9.9473f, 21.796f)
                curveTo(5.9463f, 20.991f, 2.7823f, 17.703f, 2.1293f, 13.675f)
                curveTo(1.0233f, 6.848f, 6.8373f, 1.033f, 13.6643f, 2.137f)
                curveTo(17.6933f, 2.789f, 20.9823f, 5.954f, 21.7873f, 9.954f)
                curveTo(22.2813f, 12.409f, 21.8613f, 14.734f, 20.8223f, 16.683f)
                close()
                moveTo(12.8307f, 14.541f)
                lineTo(10.9299f, 14.541f)
                lineTo(10.9299f, 13.8327f)
                curveTo(10.9299f, 12.6772f, 11.5552f, 11.5937f, 12.6016f, 10.9334f)
                curveTo(13.469f, 10.3871f, 13.9392f, 9.994f, 13.9392f, 9.4858f)
                curveTo(13.9392f, 8.4723f, 12.9388f, 7.925f, 11.9984f, 7.925f)
                curveTo(10.9639f, 7.925f, 10.0575f, 8.6544f, 10.0575f, 9.4858f)
                lineTo(8.1566f, 9.4858f)
                curveTo(8.1566f, 7.6099f, 9.9154f, 6.0242f, 11.9984f, 6.0242f)
                curveTo(14.1523f, 6.0242f, 15.8401f, 7.5449f, 15.8401f, 9.4858f)
                curveTo(15.8401f, 11.1395f, 14.4475f, 12.0179f, 13.6151f, 12.5411f)
                curveTo(13.379f, 12.6902f, 12.8307f, 13.1144f, 12.8307f, 13.8327f)
                lineTo(12.8307f, 14.541f)
                close()
                moveTo(13.1849f, 16.9288f)
                curveTo(13.1849f, 17.6161f, 12.6286f, 18.1723f, 11.9413f, 18.1723f)
                curveTo(11.255f, 18.1723f, 10.6978f, 17.6161f, 10.6978f, 16.9288f)
                curveTo(10.6978f, 16.2415f, 11.255f, 15.6852f, 11.9413f, 15.6852f)
                curveTo(12.6286f, 15.6852f, 13.1849f, 16.2415f, 13.1849f, 16.9288f)
                close()
            }
        }.build().also {
            _chatQuestionFilled = it
        }
    }

private var _chatQuestionFilled: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun ChatQuestionFilledIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcon.ChatQuestionFilled,
            contentDescription = null,
    )
}