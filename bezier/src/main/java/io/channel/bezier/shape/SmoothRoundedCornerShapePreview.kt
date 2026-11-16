package io.channel.bezier.shape

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

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
    SquareSmoothCornerPreviewHelper(
            shape = SmoothRoundedCornerShape(
                    radius = 16.dp,
                    smoothTopLeft = false,
                    smoothTopRight = false,
                    smoothBottomRight = false,
                    smoothBottomLeft = false,
            ),
    )
}

@Preview
@Composable
private fun SmoothCornerPreview4() {
    SquareSmoothCornerPreviewHelper(shape = SmoothRoundedCornerShape(radius = 16.dp))
}

@Preview
@Composable
private fun SmoothCornerPreview5() {
    RectangleSmoothCornerPreviewHelper(
            shape = SmoothRoundedCornerShape(
                    radius = 16.dp,
                    smoothBottomRight = false,
                    smoothBottomLeft = false,
            ),
    )
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
    RectangleSmoothCornerPreviewHelper(
            shape = SmoothRoundedCornerShape(
                    bottomLeftRadius = 16.dp,
                    bottomRightRadius = 16.dp,
                    topLeftRadius = 1.dp,
                    topRightRadius = 1.dp,
            ),
    )
}

@Composable
private fun SquareSmoothCornerPreviewHelper(shape: Shape) {
    Box(
            modifier = Modifier
                    .size(36.dp)
                    .clip(shape)
                    .background(Color.Yellow),
    )
}

@Composable
private fun RectangleSmoothCornerPreviewHelper(shape: Shape) {
    Box(
            modifier = Modifier
                    .size(width = 36.dp, height = 100.dp)
                    .clip(shape)
                    .background(Color.Yellow),
    )
}
