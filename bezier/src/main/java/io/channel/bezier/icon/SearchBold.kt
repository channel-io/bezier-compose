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

val BezierIcons.SearchBold: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _searchBold ?: ImageVector.Builder(
                    name = "SearchBold",
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
                    moveTo(18.0f, 10.0f)
                    arcTo(8.0f, 8.0f, 359.9886726039236f, isMoreThanHalf = true, isPositiveArc = false, 14.497f, 16.618000000000002f)
                    lineTo(18.939f, 21.061f)
                    arcTo(1.5f, 1.5f, 134.99999892742673f, isMoreThanHalf = false, isPositiveArc = false, 21.061f, 18.939f)
                    lineTo(16.618000000000002f, 14.497f)
                    arcTo(7.96f, 7.96f, 34.271324879754054f, isMoreThanHalf = false, isPositiveArc = false, 18.0f, 10.0f)
                    moveTo(15.0f, 10.0f)
                    arcTo(5.0f, 5.0f, 0.0f, isMoreThanHalf = true, isPositiveArc = true, 5.0f, 10.0f)
                    arcTo(5.0f, 5.0f, 180.0f, isMoreThanHalf = false, isPositiveArc = true, 15.0f, 10.0f)
                }
            }.build().also {
                _searchBold = it
            }
    }


private var _searchBold: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun SearchBoldIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.SearchBold.imageVector,
            contentDescription = null,
    )
}
