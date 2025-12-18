package io.channel.bezier.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.R

@Composable
fun SectionGroup(
        modifier: Modifier = Modifier,
        type: SectionGroupType = SectionGroupType.Solid,
        header: (@Composable () -> Unit)? = null,
        footer: (@Composable SectionGroupFooterScope.() -> Unit)? = null,
        content: @Composable ColumnScope.() -> Unit,
) {
    when (type) {
        SectionGroupType.Solid -> SolidSectionGroup(
                modifier = modifier,
                header = header,
                footer = footer,
                content = content,
        )

        SectionGroupType.Card -> CardSectionGroup(
                modifier = modifier,
                header = header,
                footer = footer,
                content = content,
        )
    }
}

@Composable
private fun SolidSectionGroup(
        header: (@Composable () -> Unit)?,
        footer: (@Composable SectionGroupFooterScope.() -> Unit)?,
        content: @Composable ColumnScope.() -> Unit,
        modifier: Modifier = Modifier,
) {
    Column(
            modifier = modifier,
    ) {
        if (header != null) {
            Box {
                header()
            }
        }

        SectionGroupDivider()

        Column {
            content()
        }

        SectionGroupDivider()

        if (footer != null) {
            Box(
                    modifier = Modifier
                            .padding(horizontal = 10.dp),
            ) {
                SectionGroupFooterScopeInstance.footer()
            }
        }
    }
}

@Composable
private fun CardSectionGroup(
        header: (@Composable () -> Unit)?,
        footer: (@Composable SectionGroupFooterScope.() -> Unit)?,
        content: @Composable ColumnScope.() -> Unit,
        modifier: Modifier = Modifier,
) {
    Column(
            modifier = modifier
                    .shadow(3.dp, RoundedCornerShape(16.dp))
                    .background(BezierTheme.colorsV3.surfaceHigh, RoundedCornerShape(16.dp))
                    .padding(10.dp),
    ) {
        if (header != null) {
            header()
        }

        content()

        if (footer != null) {
            SectionGroupDivider(modifier = Modifier.padding(horizontal = 6.dp))

            SectionGroupFooterScopeInstance.footer()
        }
    }
}

interface SectionGroupFooterScope

private object SectionGroupFooterScopeInstance : SectionGroupFooterScope

@Suppress("unused") // `Description`은 SectionGroup의 footer에서만 사용할 수 있다고 표시하기 위함
@Composable
fun SectionGroupFooterScope.Description(
        description: String,
        modifier: Modifier = Modifier,
) {
    Text(
            modifier = modifier.padding(top = 8.dp, start = 6.dp, end = 6.dp),
            text = description,
            color = BezierTheme.colorsV3.textNeutralLighter,
            fontSize = 14.sp,
    )
}

@Suppress("unused") // `Error`은 SectionGroup의 footer에서만 사용할 수 있다고 표시하기 위함
@Composable
fun SectionGroupFooterScope.Error(
        message: String,
        modifier: Modifier = Modifier,
) {
    Text(
            modifier = modifier.padding(top = 8.dp, start = 6.dp, end = 6.dp),
            text = message,
            color = BezierTheme.colorsV3.textAccentOrange,
            fontSize = 14.sp,
    )
}

@Composable
private fun SectionGroupDivider(modifier: Modifier = Modifier) {
    Box(
            modifier = modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(BezierTheme.colorsV3.borderNeutral),
    )
}

enum class SectionGroupType {
    Card, Solid;
}

@Preview(showBackground = true)
@Composable
private fun CardSectionGroupPreview() {
    SectionGroup(
            modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
            type = SectionGroupType.Card,
            header = { SectionLabel("이게 뭐지") },
            footer = { Description("온라인 사업을 운영하는 대부분의 리더십과 마케터들은 고객 관리의 소중함을 놓치는 경우가 많아요. 초기에 소셜 커머스, 온라인 편집숍 등 판매 채널에 입점하는데 ...") },
    ) {
        Row(
                modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 6.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                    modifier = Modifier.padding(2.dp),
                    painter = painterResource(id = R.drawable.icon_person),
                    contentDescription = null,
                    tint = BezierTheme.colorsV3.iconNeutral,
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                    text = "닝겐",
                    color = BezierTheme.colorsV3.textNeutral,
                    fontSize = 16.sp,
            )
        }

        Row(
                modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 6.dp, vertical = 8.dp),
                verticalAlignment = Alignment.CenterVertically,
        ) {
            Icon(
                    modifier = Modifier.padding(2.dp),
                    painter = painterResource(id = R.drawable.icon_lock),
                    contentDescription = null,
                    tint = BezierTheme.colorsV3.iconNeutral,
            )
            Spacer(modifier = Modifier.width(12.dp))
            Text(
                    text = "나의 마음을 언!록!",
                    color = BezierTheme.colorsV3.textNeutral,
                    fontSize = 16.sp,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun SolidSectionGroupPreview() {
    SectionGroup(
            modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
            type = SectionGroupType.Solid,
            header = { SectionLabel(text = "닝겐 관리") },
            footer = { Description("닝겐은 영어로 ningen") },
    ) {
        Row(
                modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 6.dp, vertical = 13.dp),
                verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                    text = "닝겐1",
                    color = BezierTheme.colorsV3.textNeutral,
                    fontSize = 16.sp,
            )
        }

        Row(
                modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 6.dp, vertical = 13.dp),
                verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                    text = "닝겐2",
                    color = BezierTheme.colorsV3.textNeutral,
                    fontSize = 16.sp,
            )
        }
    }
}
