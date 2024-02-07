package io.channel.bezier.compose.usecase

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.channel.bezier.compose.BezierTheme
import io.channel.bezier.compose.component.Tag
import io.channel.bezier.compose.component.TagColor
import io.channel.bezier.compose.component.TagSize
import kotlin.math.min

private const val SINGLE_LINE_MAXIMUM_TAG_COUNT = 3

@Composable
fun TagContainer(
    tagContainerElements: List<TagContainerElement>,
    modifier: Modifier = Modifier,
    tagSize: TagSize = TagSize.L,
    singleLine: Boolean = true,
) {
    val resolvedElements = remember(tagContainerElements, singleLine) {
        resolveTagContainerElements(tagContainerElements, singleLine)
    }

    if (singleLine) {
        SingleLineTagContainer(
                tagContainerElements = resolvedElements,
                modifier = modifier,
                tagSize = tagSize,
        )
    } else {
        MultiLineTagContainer(
                tagContainerElements = resolvedElements,
                modifier = modifier,
                tagSize = tagSize,
        )
    }
}

private fun resolveTagContainerElements(
    elements: List<TagContainerElement>,
    singleLine: Boolean,
): List<TagContainerElement> {
    val orderedElements = if (singleLine) {
        elements.reversed()
    } else {
        elements
    }

    return when {
        !singleLine || orderedElements.size == 1 -> orderedElements

        else -> orderedElements.map { element ->
            if (element.name.contains("/")) {
                return@map element.copy(name = "/${element.name.split("/").last()}")
            }

            element
        }
    }
}

@Composable
private fun SingleLineTagContainer(
    tagContainerElements: List<TagContainerElement>,
    modifier: Modifier = Modifier,
    tagSize: TagSize = TagSize.L,
) {
    Row(
            modifier = modifier,
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalAlignment = Alignment.CenterVertically,
    ) {
        tagContainerElements
                .subList(0, min(SINGLE_LINE_MAXIMUM_TAG_COUNT, tagContainerElements.size))
                .forEach { element ->
                    Tag(
                            modifier = Modifier.weight(1f, false),
                            text = element.name,
                            color = element.color,
                            size = tagSize,
                    )
                }

        if (tagContainerElements.size > SINGLE_LINE_MAXIMUM_TAG_COUNT) {
            Text(
                    text = "+${tagContainerElements.size - SINGLE_LINE_MAXIMUM_TAG_COUNT}",
                    fontSize = 13.sp,
                    color = BezierTheme.colors.txtBlackDarker,
                    maxLines = 1,
            )
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
private fun MultiLineTagContainer(
    tagContainerElements: List<TagContainerElement>,
    modifier: Modifier = Modifier,
    tagSize: TagSize = TagSize.L,
) {
    FlowRow(
            modifier = modifier,
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalArrangement = Arrangement.spacedBy(4.dp),
    ) {
        tagContainerElements.forEach { element ->
            Tag(
                    text = element.name,
                    color = element.color,
                    size = tagSize,
            )
        }
    }
}

data class TagContainerElement(
        val name: String,
        val color: TagColor = TagColor.Normal,
)

@Preview(showBackground = true)
@Composable
private fun TagContainerSingleLinePreview() {
    Column {
        TagContainer(
                modifier = Modifier.fillMaxWidth(),
                tagContainerElements = listOf(
                        TagContainerElement("태그/태그2/태그3", TagColor.Green),
                ),
        )

        Spacer(modifier = Modifier.size(16.dp))

        TagContainer(
                modifier = Modifier.fillMaxWidth(),
                tagContainerElements = listOf(
                        TagContainerElement("태그/태그2", TagColor.Green),
                        TagContainerElement("긴태그긴태그긴태그긴태그긴태그긴태그", TagColor.Navy),
                ),
        )

        Spacer(modifier = Modifier.size(16.dp))

        TagContainer(
                modifier = Modifier.fillMaxWidth(),
                tagContainerElements = listOf(
                        TagContainerElement("태그", TagColor.Green),
                        TagContainerElement("태그2", TagColor.Normal),
                        TagContainerElement("태그3", TagColor.Cobalt),
                        TagContainerElement("태그4", TagColor.Olive),
                        TagContainerElement("긴태그긴태그긴태그긴태그긴태그긴태그", TagColor.Navy),
                ),
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun TagContainerMultiLinePreview() {
    Column {
        TagContainer(
                modifier = Modifier.fillMaxWidth(),
                tagContainerElements = listOf(
                        TagContainerElement("태그/xorm/태그2", TagColor.Green),
                ),
                singleLine = false,
        )

        Spacer(modifier = Modifier.size(16.dp))

        TagContainer(
                modifier = Modifier.fillMaxWidth(),
                tagContainerElements = listOf(
                        TagContainerElement("태그", TagColor.Green),
                        TagContainerElement("긴태그긴태그긴태그", TagColor.Normal),
                        TagContainerElement("긴태그태그3", TagColor.Cobalt),
                        TagContainerElement("태그/xorm/태그2", TagColor.Cobalt),
                        TagContainerElement("태그4", TagColor.Olive),
                        TagContainerElement("태그5", TagColor.Navy),
                        TagContainerElement("태그31", TagColor.Navy),
                        TagContainerElement("태그12", TagColor.Navy),
                        TagContainerElement("태그/xorm/긴태그긴태그긴태그긴태그", TagColor.Navy),
                        TagContainerElement("태그1232/x2324orm/긴태그긴태그긴태그긴태그", TagColor.Navy),
                ),
                singleLine = false,
        )
    }
}
