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

val BezierIcons.Recipe: BezierIcon
    get() = object : BezierIcon {
        override val imageVector: ImageVector
            get() = _recipe ?: ImageVector.Builder(
                    name = "Recipe",
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
                    moveTo(17.0f, 15.0f)
                    lineTo(7.0f, 15.0f)
                    lineTo(7.0f, 17.0f)
                    lineTo(17.0f, 17.0f)
                    close()
                }

                path(
                        fill = SolidColor(Color(0xFF313234)),
                        strokeLineWidth = 1f,
                        strokeAlpha = 1.0f,
                        pathFillType = PathFillType.EvenOdd,
                ) {
                    moveTo(4.5f, 2.0f)
                    curveTo(3.673f, 2.0f, 3.0f, 2.673f, 3.0f, 3.5f)
                    lineTo(3.0f, 20.5f)
                    curveTo(3.0f, 21.326999999999998f, 3.673f, 22.0f, 4.5f, 22.0f)
                    lineTo(19.5f, 22.0f)
                    curveTo(20.326999999999998f, 22.0f, 21.0f, 21.326999999999998f, 21.0f, 20.5f)
                    lineTo(21.0f, 3.5f)
                    curveTo(21.0f, 2.673f, 20.326999999999998f, 2.0f, 19.5f, 2.0f)
                    close()
                    moveTo(19.0f, 20.0f)
                    lineTo(5.0f, 20.0f)
                    lineTo(5.0f, 4.0f)
                    lineTo(7.0f, 4.0f)
                    lineTo(7.0f, 12.0f)
                    lineTo(10.0f, 9.817f)
                    lineTo(13.0f, 12.0f)
                    lineTo(13.0f, 4.0f)
                    lineTo(19.0f, 4.0f)
                    close()
                }
            }.build().also {
                _recipe = it
            }
    }


private var _recipe: ImageVector? = null

@Preview(showBackground = true)
@Composable
private fun RecipeIconPreview() {
    Icon(
            modifier = Modifier.size(128.dp),
            imageVector = BezierIcons.Recipe.imageVector,
            contentDescription = null,
    )
}
