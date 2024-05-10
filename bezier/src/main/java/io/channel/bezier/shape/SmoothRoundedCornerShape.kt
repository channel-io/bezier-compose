package io.channel.bezier.shape

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import kotlin.math.abs
import kotlin.math.ceil
import kotlin.math.cos
import kotlin.math.max
import kotlin.math.min
import kotlin.math.pow
import kotlin.math.sign
import kotlin.math.sin
import kotlin.math.sqrt

private val Sqrt2 = sqrt(2f)
private const val Iterations = 360
private const val PiFloat = Math.PI.toFloat()

/**
 * @param radius 부드럽게 할 모서리의 반지름입니다. 기반이 되는 Superellipse의 정의에서는 반지름을 파라미터로 받지 않기
 *         때문에 정확한 값은 아니지만 경험적으로 합리적인 수준으로 계산하고 있으므로 디자인 상의 반지름 값을 그대로 넣어주세요.
 */
@Suppress("FunctionName")
@Stable
fun SmoothRoundedCornerShape(
        radius: Dp,
        smoothBottomLeft: Boolean = true,
        smoothBottomRight: Boolean = true,
        smoothTopLeft: Boolean = true,
        smoothTopRight: Boolean = true,
): Shape {
    fun shouldSmooth(direction: SuperellipseDirection): Boolean = when (direction) {
        SuperellipseDirection.BottomLeft -> smoothBottomLeft
        SuperellipseDirection.BottomRight -> smoothBottomRight
        SuperellipseDirection.TopLeft -> smoothTopLeft
        SuperellipseDirection.TopRight -> smoothTopRight
    }

    return Superellipse(
            m = { direction, size, density ->
                if (shouldSmooth(direction)) {
                    size.width / min(max(size.width / 2, size.height / 2), with(density) { radius.toPx() })
                } else {
                    0f
                }
            },
            n = { direction, size, density ->
                if (shouldSmooth(direction)) {
                    size.height / min(max(size.width / 2, size.height / 2), with(density) { radius.toPx() })
                } else {
                    0f
                }
            },
    )
}

/**
 * [SmoothRoundedCornerShape]의 각 방향의 반지름을 별도로 설정할 수 있습니다. 이때 주어지는 반지름 값은
 * 정확하지는 않지만 경험적으로 합리적인 수준으로 계산되기 때문에 디자인상의 값을 넣어주세요.
 */
@Suppress("FunctionName")
@Stable
fun SmoothRoundedCornerShape(
        bottomLeftRadius: Dp = 8.dp,
        bottomRightRadius: Dp = 8.dp,
        topLeftRadius: Dp = 8.dp,
        topRightRadius: Dp = 8.dp,
): Shape {
    fun getRadius(direction: SuperellipseDirection, density: Density): Float = with(density) {
        ceil(when (direction) {
            SuperellipseDirection.BottomLeft -> bottomLeftRadius
            SuperellipseDirection.BottomRight -> bottomRightRadius
            SuperellipseDirection.TopLeft -> topLeftRadius
            SuperellipseDirection.TopRight -> topRightRadius
        }.toPx())
    }

    return Superellipse(
            m = { direction, size, density ->
                val radius = getRadius(direction, density)
                if (radius > 0) {
                    ceil(size.width / min(max(size.width / 2, size.height / 2), radius))
                } else {
                    0f
                }
            },
            n = { direction, size, density ->
                val radius = getRadius(direction, density)
                if (radius > 0) {
                    ceil(size.height / min(max(size.width / 2, size.height / 2), radius))
                } else {
                    0f
                }
            },
    )
}

@Suppress("FunctionName")
@Stable
fun SmoothRoundedCornerShape(
        percent: Int,
        smoothBottomLeft: Boolean = true,
        smoothBottomRight: Boolean = true,
        smoothTopLeft: Boolean = true,
        smoothTopRight: Boolean = true,
): Shape {
    fun shouldSmooth(direction: SuperellipseDirection): Boolean = when (direction) {
        SuperellipseDirection.BottomLeft -> smoothBottomLeft
        SuperellipseDirection.BottomRight -> smoothBottomRight
        SuperellipseDirection.TopLeft -> smoothTopLeft
        SuperellipseDirection.TopRight -> smoothTopRight
    }

    return Superellipse(
            m = { direction, size, _ ->
                if (shouldSmooth(direction)) {
                    size.width / (max(size.width, size.height) * percent / 100)
                } else {
                    0f
                }
            },
            n = { direction, size, _ ->
                if (shouldSmooth(direction)) {
                    size.height / (max(size.width, size.height) * percent / 100)
                } else {
                    0f
                }
            }
    )
}

// https://www.notion.so/channelio/Smooth-Corners-6a65f2f2ae334482979dfa1d01d34eef (SmoothCornerLayout 참고 자료)
private class Superellipse(
    val m: (SuperellipseDirection, Size, Density) -> Float,
    val n: (SuperellipseDirection, Size, Density) -> Float,
) : Shape {
    override fun createOutline(size: Size, layoutDirection: LayoutDirection, density: Density): Outline {
        var radian = 0f
        val step = PiFloat * 2 / Iterations

        val path = Path()

        val initial = getOffsetByRadian(radian, size, density)
        path.moveTo(initial.x, initial.y)

        for (i in 0 until Iterations) {
            radian += step

            val offset = getOffsetByRadian(radian, size, density)
            path.lineTo(offset.x, offset.y)
        }

        path.close()
        return Outline.Generic(path)
    }

    private fun getOffsetByRadian(radian: Float, size: Size, density: Density): Offset {
        val c = cos(radian)
        val s = sin(radian)

        val radiusX = size.width / 2
        val radiusY = size.height / 2

        val direction = when (radian % (PiFloat * 2)) {
            in 0f..PiFloat * 0.5f -> SuperellipseDirection.BottomRight
            in PiFloat * 0.5f..PiFloat -> SuperellipseDirection.BottomLeft
            in PiFloat..PiFloat * 1.5f -> SuperellipseDirection.TopLeft
            in PiFloat * 1.5f..PiFloat * 2f -> SuperellipseDirection.TopRight
            else -> SuperellipseDirection.TopLeft // should not reach here
        }

        val m = m(direction, size, density)
        val n = n(direction, size, density)

        return if (m > 0 && n > 0) {
            // Superellipse 그릴 수 있음
            val x = abs(c).pow(2 / m) * sign(c) * radiusX + radiusX
            val y = abs(s).pow(2 / n) * sign(s) * radiusY + radiusY

            Offset(x, y)
        } else {
            // Superellipse 그릴 수 없는 조건에서는 각진 모서리를 그림
            Offset(
                    x = (c * Sqrt2).coerceIn(-1f, 1f) * radiusX + radiusX,
                    y = (s * Sqrt2).coerceIn(-1f, 1f) * radiusY + radiusY,
            )
        }
    }
}

private enum class SuperellipseDirection {
    BottomRight, BottomLeft, TopRight, TopLeft;
}

@Preview
@Composable
private fun SmoothCornerPreview1() {
    SquareSmoothCornerPreviewHelper(shape = SmoothRoundedCornerShape(radius = 16.dp))
}

@Preview
@Composable
private fun SmoothCornerPreview2() {
    SquareSmoothCornerPreviewHelper(shape = SmoothRoundedCornerShape(radius = 16.dp, smoothTopLeft = false))
}

@Preview
@Composable
private fun SmoothCornerPreview3() {
    SquareSmoothCornerPreviewHelper(shape = SmoothRoundedCornerShape(radius = 16.dp, smoothTopLeft = false, smoothTopRight = false, smoothBottomRight = false, smoothBottomLeft = false))
}

@Preview
@Composable
private fun SmoothCornerPreview4() {
    SquareSmoothCornerPreviewHelper(shape = SmoothRoundedCornerShape(radius = 16.dp))
}

@Preview
@Composable
private fun SmoothCornerPreview5() {
    RectangleSmoothCornerPreviewHelper(shape = SmoothRoundedCornerShape(radius = 16.dp, smoothBottomRight = false, smoothBottomLeft = false))
}

@Preview
@Composable
private fun SmoothCornerPreview6() {
    RectangleSmoothCornerPreviewHelper(shape = SmoothRoundedCornerShape(radius = 16.dp))
}

@Preview
@Composable
private fun SmoothCornerPreview7() {
    RectangleSmoothCornerPreviewHelper(shape = SmoothRoundedCornerShape(bottomLeftRadius = 16.dp, bottomRightRadius = 16.dp))
}

@Preview
@Composable
private fun SmoothCornerPreview8() {
    RectangleSmoothCornerPreviewHelper(shape = SmoothRoundedCornerShape(bottomLeftRadius = 16.dp, bottomRightRadius = 16.dp, topLeftRadius = 1.dp, topRightRadius = 1.dp))
}

@Composable
private fun SquareSmoothCornerPreviewHelper(shape: Shape) {
    Box(
            modifier = Modifier
                    .size(36.dp)
                    .clip(shape)
                    .background(Color.Yellow)
    )
}

@Composable
private fun RectangleSmoothCornerPreviewHelper(shape: Shape) {
    Box(
            modifier = Modifier
                    .size(width = 36.dp, height = 100.dp)
                    .clip(shape)
                    .background(Color.Yellow)
    )
}
