package io.channel.bezier.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.LocalContentColor
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.channel.bezier.BezierIcon
import io.channel.bezier.BezierTheme
import io.channel.bezier.icon.ChevronSmallRight
import io.channel.bezier.icon.ListNumber
import io.channel.bezier.icon.String

@Composable
fun KeyValueItem(
    key: String,
    value: String,
    modifier: Modifier = Modifier,
    icon: ImageVector? = null,
    blockContent: Boolean = false,
    leftContentBuilder: KeyValueItemLeftContentBuilder.() -> Unit = {},
    rightIconBuilder: KeyValueItemIconBuilder.() -> Unit = {},
    bottomContent: @Composable (() -> Unit)? = null,
) {
    KeyValueItem(
            modifier = modifier,
            key = key,
            icon = icon,
            blockContent = blockContent,
            leftContentBuilder = leftContentBuilder,
            rightIconBuilder = rightIconBuilder,
            bottomContent = bottomContent,
            valueContent = {
                Text(
                        text = value,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                        fontSize = 15.sp,
                        color = BezierTheme.colors.txtBlackDarkest,
                )
            }
    )
}


@Composable
fun KeyValueItem(
    key: String,
    valueContent: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    icon: ImageVector? = null,
    blockContent: Boolean = false,
    leftContentBuilder: KeyValueItemLeftContentBuilder.() -> Unit = {},
    rightIconBuilder: KeyValueItemIconBuilder.() -> Unit = {},
    bottomContent: @Composable (() -> Unit)? = null,
) {
    Column(
            modifier = modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp, horizontal = 6.dp),
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Row(
                    modifier = Modifier.sizeIn(minHeight = 24.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                if (icon != null) {
                    Icon(
                            modifier = Modifier.size(20.dp),
                            imageVector = icon,
                            contentDescription = null,
                            tint = BezierTheme.colors.txtBlackDark,
                    )
                }

                Text(
                        modifier = Modifier.sizeIn(maxWidth = 152.dp),
                        text = key,
                        color = BezierTheme.colors.txtBlackDark,
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis,
                )

                val leftContentInfoList = remember(leftContentBuilder) {
                    KeyValueItemLeftContentBuilderImpl()
                            .apply(leftContentBuilder)
                            .contentInfoList
                }
                leftContentInfoList.forEach { it.content() }
            }
            Spacer(modifier = Modifier.width(8.dp))

            if (blockContent) {
                Box(
                        modifier = Modifier
                                .weight(1f)
                                .height(6.dp)
                                .padding(end = 4.dp)
                                .background(
                                        color = BezierTheme.colors.bgGreyLight,
                                        shape = RoundedCornerShape(2.dp),
                                ),
                )
            } else {
                Box(modifier = Modifier.weight(1f)) {
                    valueContent()
                }
                Spacer(modifier = Modifier.width(8.dp))

                Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(6.dp),
                ) {
                    val iconInfoList = remember(rightIconBuilder) {
                        KeyValueItemIconBuilderImpl()
                                .apply(rightIconBuilder)
                                .iconInfoList
                    }
                    iconInfoList.forEach {
                        Icon(
                                modifier = Modifier.size(it.size.dp),
                                imageVector = it.icon,
                                contentDescription = null,
                                tint = it.tint(),
                        )
                    }
                }
            }
        }

        if (bottomContent != null && !blockContent) {
            Spacer(modifier = Modifier.height(4.dp))

            bottomContent()
        }
    }
}

interface KeyValueItemLeftContentBuilder {
    fun content(content: @Composable () -> Unit)
}

private class KeyValueItemLeftContentBuilderImpl : KeyValueItemLeftContentBuilder {
    val contentInfoList = mutableListOf<LeftContentInfo>()
    override fun content(content: @Composable () -> Unit) {
        contentInfoList += LeftContentInfo(content)
    }
}

private class LeftContentInfo(val content: @Composable () -> Unit)

interface KeyValueItemIconBuilder {
    fun icon(
            icon: ImageVector,
            size: Int = 20,
            tint: @Composable () -> Color = { LocalContentColor.current.copy(alpha = LocalContentAlpha.current) },
    )

    fun navigationIcon()
}

private class KeyValueItemIconBuilderImpl : KeyValueItemIconBuilder {
    val iconInfoList = mutableListOf<IconInfo>()

    override fun icon(icon: ImageVector, size: Int, tint: @Composable () -> Color) {
        iconInfoList += IconInfo(icon, size, tint)
    }

    override fun navigationIcon() {
        iconInfoList += IconInfo(
                icon = BezierIcon.ChevronSmallRight,
                size = 24,
                tint = { BezierTheme.colors.txtBlackDark },
        )
    }
}

private class IconInfo(
        val icon: ImageVector,
        val size: Int,
        val tint: @Composable () -> Color,
)

@Composable
@Preview(showBackground = true)
private fun KeyValueItemPreview() {
    KeyValueItem(
            icon = BezierIcon.ListNumber,
            key = "아이폰사용자",
            leftContentBuilder = {
                content { Text(text = "아이폰이 진리") }
                content { Text(text = "인정!", color = Color.Red) }
            },
            rightIconBuilder = {
                icon(BezierIcon.String, size = 16, tint = { Color.Red })
                navigationIcon()
            },
            valueContent = {
                Text(text = "Hello world 긴 텍스트 Hello world 긴 텍스트 Hello world 긴 텍스트 Hello world 긴 텍스트 Hello world 긴 텍스트")
            }
    )
}

@Composable
@Preview(showBackground = true)
private fun KeyValueItemPreview_Block() {
    KeyValueItem(
            icon = BezierIcon.ListNumber,
            key = "아이폰사용자",
            blockContent = true,
            leftContentBuilder = {
                content { Text(text = "아이폰이 진리") }
                content { Text(text = "인정!", color = Color.Red) }
            },
            rightIconBuilder = { navigationIcon() },
            valueContent = { Text("Value") },
    )
}

@Composable
@Preview(showBackground = true)
private fun KeyValueItemPreview_BottomContent() {
    KeyValueItem(
            key = "아이폰사용자",
            leftContentBuilder = {
                content { Text(text = "아이폰이 진리") }
                content { Text(text = "인정!", color = Color.Red) }
            },
            rightIconBuilder = { navigationIcon() },
            valueContent = { Text("Value") },
            bottomContent = {
                Column {
                    Text(text = "아이폰 사랑해")
                    Text(text = "아이폰 사랑해222")
                }
            }
    )
}

@Composable
@Preview(showBackground = true)
private fun KeyValueItemPreview_SimpleValue() {
    KeyValueItem(
            key = "아이폰사용자",
            value = "Value",
            leftContentBuilder = {
                content { Text(text = "아이폰이 진리") }
                content { Text(text = "인정!", color = Color.Red) }
            },
            rightIconBuilder = { navigationIcon() },
            bottomContent = {
                Column {
                    Text(text = "아이폰 사랑해")
                    Text(text = "아이폰 사랑해222")
                }
            }
    )
}

@Composable
@Preview(showBackground = true)
private fun KeyValueItemPreview_SimpleValueLongText() {
    KeyValueItem(
            key = "아이폰사용자",
            value = "긴 텍스트긴 텍스트 긴 텍스트 긴 텍스트 긴 텍스트 ㅍ 긴 텍스트 긴 텍스트 긴 텍스트 긴 텍스트 긴 텍스트 긴 텍스트",
            leftContentBuilder = {
                content { Text(text = "아이폰이 진리") }
                content { Text(text = "인정!", color = Color.Red) }
            },
            rightIconBuilder = { navigationIcon() },
            bottomContent = {
                Column {
                    Text(text = "아이폰 사랑해")
                    Text(text = "아이폰 사랑해222")
                }
            }
    )
}


