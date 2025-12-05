package io.channel.bezier.component

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.TabRow
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.channel.bezier.BezierTheme
import kotlinx.coroutines.launch
import kotlin.math.abs

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Tab(
        items: List<String>,
        pagerState: PagerState,
        modifier: Modifier = Modifier,
) {
    val coroutineScope = rememberCoroutineScope()

    Column(
            modifier = modifier,
    ) {
        TabRow(
                modifier = Modifier
                        .fillMaxWidth()
                        .height(47.dp)
                        .background(BezierTheme.colorsV3.surface)
                        .padding(horizontal = 12.dp),
                selectedTabIndex = pagerState.currentPage,
                backgroundColor = BezierTheme.colorsV3.surface,
                indicator = { tabPositions ->
                    TabRowDefaults.Indicator(
                            modifier = Modifier.tabIndicatorOffset(tabPositions[pagerState.currentPage]),
                            height = 2.dp,
                            color = BezierTheme.colorsV3.fillNeutralHeaviest,
                    )
                },
                divider = {},
                tabs = {
                    items.mapIndexed { index, item ->
                        Box(
                                modifier = Modifier
                                        .clickable {
                                            coroutineScope.launch {
                                                if (abs(pagerState.currentPage - index) == 1) {
                                                    pagerState.animateScrollToPage(index)
                                                } else {
                                                    pagerState.scrollToPage(index)
                                                }
                                            }
                                        },
                                contentAlignment = Alignment.Center,
                        ) {
                            Text(
                                    modifier = Modifier.fillMaxWidth(),
                                    text = item,
                                    fontSize = 15.sp,
                                    textAlign = TextAlign.Center,
                                    color = if (pagerState.currentPage == index) {
                                        BezierTheme.colorsV3.textNeutral
                                    } else {
                                        BezierTheme.colorsV3.textNeutralLighter
                                    },
                                    fontWeight = FontWeight.Bold,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis,
                            )
                        }
                    }
                },
        )

        Box(
                modifier = Modifier
                        .fillMaxWidth()
                        .height(1.dp)
                        .background(BezierTheme.colorsV3.borderNeutral),
        )
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Preview(showBackground = true)
@Composable
private fun TabPreview() {
    val items = listOf(
            "상담",
            "고객 정보",
            "대화 목록",
    )

    val pagerState = rememberPagerState(
            pageCount = { items.size },
    )

    Column {
        Tab(
                items = items,
                pagerState = pagerState,
        )

        HorizontalPager(
                state = pagerState,
                pageContent = { page ->
                    Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center,
                    ) {
                        Text(text = items[page])
                    }
                },
        )
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Preview(showBackground = true)
@Composable
private fun TabToManyItemPreview() {
    val items = listOf(
            "상담",
            "고객 정보",
            "대화 목록",
            "대화 목록",
            "대화 목록",
    )

    val pagerState = rememberPagerState(
            pageCount = { items.size },
    )

    Column {
        Tab(
                items = items,
                pagerState = pagerState,
        )

        HorizontalPager(
                state = pagerState,
                pageContent = { page ->
                    Box(
                            modifier = Modifier.fillMaxSize(),
                            contentAlignment = Alignment.Center,
                    ) {
                        Text(text = items[page])
                    }
                },
        )
    }
}
