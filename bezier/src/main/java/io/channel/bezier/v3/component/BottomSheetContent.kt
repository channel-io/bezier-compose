package io.channel.bezier.v3.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme
import io.channel.bezier.component.BezierText
import io.channel.bezier.typography.BezierTypo

@Composable
fun BottomSheetContent(
        modifier: Modifier = Modifier,
        title: String? = null,
        description: String? = null,
        showGrabber: Boolean = false,
        content: @Composable () -> Unit,
) {
    Column(modifier = modifier.fillMaxWidth()) {
        if (showGrabber) {
            BottomSheetContentGrabber()
        }

        if (title != null) {
            BottomSheetContentHeader(
                    title = title,
                    description = description,
            )
        }

        Column(
                modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                                top = ContentTopPadding,
                                start = ContentHorizontalPadding,
                                end = ContentHorizontalPadding,
                        ),
        ) {
            content()
        }
    }
}

@Composable
private fun BottomSheetContentGrabber() {
    Column(
            modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = GrabberTopPadding),
            horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Box(
                modifier = Modifier
                        .size(width = GrabberWidth, height = GrabberHeight)
                        .clip(RoundedCornerShape(GrabberCornerRadius))
                        .background(BezierTheme.colorsV3.fillNeutralHeavy),
        )
    }
}

@Composable
private fun BottomSheetContentHeader(
        title: String,
        description: String?,
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Column(
                modifier = Modifier
                        .fillMaxWidth()
                        .padding(
                                top = HeaderTopPadding,
                                bottom = HeaderBottomPadding,
                                start = HeaderHorizontalPadding,
                                end = HeaderHorizontalPadding,
                        ),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(HeaderItemSpacing),
        ) {
            BezierText(
                    text = title,
                    typo = BezierTypo.HeadingSmall,
                    modifier = Modifier.fillMaxWidth(),
                    color = BezierTheme.colorsV3.textNeutral,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = TitleMaxLines,
            )

            if (description != null) {
                BezierText(
                        text = description,
                        typo = BezierTypo.CaptionMedium,
                        modifier = Modifier.fillMaxWidth(),
                        color = BezierTheme.colorsV3.textNeutralLighter,
                        textAlign = TextAlign.Center,
                )
            }
        }

        Divider(
                sideIndent = false,
                parallelIndent = false,
        )
    }
}

private val GrabberTopPadding: Dp = 5.dp
private val GrabberWidth: Dp = 36.dp
private val GrabberHeight: Dp = 5.dp
private val GrabberCornerRadius: Dp = 100.dp
private val HeaderTopPadding: Dp = 18.dp
private val HeaderBottomPadding: Dp = 16.dp
private val HeaderHorizontalPadding: Dp = 24.dp
private val HeaderItemSpacing: Dp = 4.dp
private val ContentTopPadding: Dp = 12.dp
private val ContentHorizontalPadding: Dp = 10.dp
private const val TitleMaxLines: Int = 2

@Composable
private fun BottomSheetContentPreviewContent() {
    BezierTheme {
        Column(
                modifier = Modifier
                        .background(BezierTheme.colorsV3.surfaceLow)
                        .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(24.dp),
        ) {
            BottomSheetContentPreviewSurface {
                BottomSheetContent(
                        title = "Title",
                        description = "Description",
                        showGrabber = true,
                ) {
                    BottomSheetContentPreviewBody()
                }
            }

            BottomSheetContentPreviewSurface {
                BottomSheetContent(title = "Title") {
                    BottomSheetContentPreviewBody()
                }
            }

            BottomSheetContentPreviewSurface {
                BottomSheetContent(showGrabber = true) {
                    BottomSheetContentPreviewBody()
                }
            }
        }
    }
}

@Composable
private fun BottomSheetContentPreviewSurface(content: @Composable () -> Unit) {
    Box(
            modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp))
                    .background(BezierTheme.colorsV3.surface),
    ) {
        content()
    }
}

@Composable
private fun BottomSheetContentPreviewBody() {
    Box(
            modifier = Modifier
                    .fillMaxWidth()
                    .height(96.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(BezierTheme.colorsV3.surfaceLow),
    ) {
        BezierText(
                text = "content",
                typo = BezierTypo.TextMedium,
                modifier = Modifier.padding(16.dp),
                color = BezierTheme.colorsV3.textNeutral,
        )
    }
}

@Preview(showBackground = true, widthDp = 360)
@Composable
private fun BottomSheetContentPreview() = BottomSheetContentPreviewContent()

@Preview(showBackground = true, widthDp = 360, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun BottomSheetContentDarkPreview() = BottomSheetContentPreviewContent()
