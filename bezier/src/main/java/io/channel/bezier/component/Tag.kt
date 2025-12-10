package io.channel.bezier.component

import android.content.Context
import android.util.AttributeSet
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.AbstractComposeView
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.res.use
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.R
import io.channel.bezier.extension.orElse

typealias TagSize = Tag.Size
typealias TagColor = Tag.Color

class Tag @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0,
) : AbstractComposeView(context, attrs, defStyleAttr) {

    var size by mutableStateOf(Size.L)
    var color by mutableStateOf(Color.Normal)
    var text by mutableStateOf("")

    var onRemoveListener: (() -> Unit)? = null

    init {
        context.theme.obtainStyledAttributes(
                attrs,
                R.styleable.Tag,
                0,
                0,
        ).use { typedArray ->
            color = Color.fromId(typedArray.getInt(R.styleable.Tag_tag_color, color.id))
            size = Size.fromId(typedArray.getInt(R.styleable.Tag_tag_size, size.id))
            text = typedArray.getString(R.styleable.Tag_tag_text).orEmpty()
        }
    }

    @Composable
    override fun Content() {
        Tag(
                text = text,
                size = size,
                color = color,
                onRemove = onRemoveListener,
        )
    }

    enum class Size(
            val id: Int,
            val layoutRadius: Dp,
            val padding: PaddingValues,
            val textSize: TextUnit,
    ) {
        XS(0, 4.dp, PaddingValues(horizontal = 3.dp, vertical = 1.dp), 12.sp),
        S(1, 6.dp, PaddingValues(horizontal = 3.dp, vertical = 2.dp), 14.sp),
        M(2, 6.dp, PaddingValues(horizontal = 4.dp, vertical = 2.dp), 15.sp),
        L(3, 6.dp, PaddingValues(horizontal = 6.dp, vertical = 3.dp), 16.sp);

        companion object {
            fun fromId(id: Int): Size {
                return values().find { it.id == id }.orElse { L }
            }
        }
    }

    enum class Color(
            val id: Int,
            val colorNameKey: String,
    ) {
        Normal(0, "tag.color.default"),
        Red(1, "tag.color.red"),
        Orange(2, "tag.color.orange"),
        Yellow(3, "tag.color.yellow"),
        Olive(4, "tag.color.olive"),
        Green(5, "tag.color.green"),
        Cobalt(6, "tag.color.cobalt"),
        Purple(7, "tag.color.purple"),
        Pink(8, "tag.color.pink"),
        Navy(9, "tag.color.navy");

        fun asFieldValue(): String? {
            return when (this) {
                TagColor.Normal -> null
                TagColor.Red -> "red"
                TagColor.Orange -> "orange"
                TagColor.Yellow -> "yellow"
                TagColor.Olive -> "olive"
                TagColor.Green -> "green"
                TagColor.Cobalt -> "cobalt"
                TagColor.Purple -> "purple"
                TagColor.Pink -> "pink"
                TagColor.Navy -> "navy"
            }
        }

        @Composable
        fun getColor(): androidx.compose.ui.graphics.Color {
            return when (this) {
                TagColor.Normal -> BezierTheme.colorsV3.fillNeutralLight
                TagColor.Red -> BezierTheme.colorsV3.fillAccentRedHeavy
                TagColor.Orange -> BezierTheme.colorsV3.fillAccentOrangeHeavy
                TagColor.Yellow -> BezierTheme.colorsV3.fillAccentYellowHeavy
                TagColor.Olive -> BezierTheme.colorsV3.fillAccentOliveHeavy
                TagColor.Green -> BezierTheme.colorsV3.fillAccentGreenHeavy
                TagColor.Cobalt -> BezierTheme.colorsV3.fillAccentCobaltHeavy
                TagColor.Purple -> BezierTheme.colorsV3.fillAccentPurpleHeavy
                TagColor.Pink -> BezierTheme.colorsV3.fillAccentPinkHeavy
                TagColor.Navy -> BezierTheme.colorsV3.fillAccentNavyHeavy
            }
        }

        companion object {
            fun fromId(id: Int): Color {
                return values().find { it.id == id }.orElse(Normal)
            }
        }
    }
}

@Composable
fun Tag(
        modifier: Modifier = Modifier,
        text: String,
        size: TagSize = TagSize.L,
        color: TagColor = TagColor.Normal,
        onRemove: (() -> Unit)? = null,
) {
    Row(
            modifier = modifier
                    .wrapContentSize()
                    .background(
                            color = color.getColor(),
                            shape = RoundedCornerShape(size.layoutRadius),
                    )
                    .padding(size.padding),
            verticalAlignment = Alignment.CenterVertically,
    ) {
        Text(
                text = text,
                modifier = Modifier
                        .padding(horizontal = 2.dp)
                        .weight(1f, false),
                fontSize = size.textSize,
                color = colorResource(id = R.color.text_neutral),
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
        )

        if (onRemove != null) {
            Icon(
                    modifier = Modifier
                            .size(16.dp)
                            .clickable(
                                    interactionSource = remember { MutableInteractionSource() },
                                    indication = null,
                                    onClick = onRemove,
                            ),
                    painter = painterResource(id = R.drawable.icon_cancel),
                    contentDescription = null,
                    tint = colorResource(id = R.color.text_neutral_light),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun TagColorVariantWithCloseButtonPreview() {
    LazyVerticalGrid(columns = GridCells.Fixed(3)) {
        items(TagColor.values()) { color ->
            Tag(
                    modifier = Modifier
                            .padding(8.dp),
                    text = "Tag",
                    size = TagSize.L,
                    color = color,
                    onRemove = { },
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun TagColorVariantPreview() {
    LazyVerticalGrid(columns = GridCells.Fixed(3)) {
        items(TagColor.values()) { color ->
            Tag(
                    modifier = Modifier.padding(8.dp),
                    text = "Tag",
                    size = TagSize.L,
                    color = color,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun TagSizeVariantWithCloseButtonPreview() {
    LazyVerticalGrid(columns = GridCells.Fixed(3)) {
        items(TagSize.values()) { size ->
            Tag(
                    modifier = Modifier.padding(8.dp),
                    text = "Tag",
                    size = size,
                    color = TagColor.Pink,
                    onRemove = { },
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun TagSizeVariantPreview() {
    LazyVerticalGrid(columns = GridCells.Fixed(3)) {
        items(TagSize.values()) { size ->
            Tag(
                    modifier = Modifier.padding(8.dp),
                    text = "Tag",
                    size = size,
                    color = TagColor.Pink,
            )
        }
    }
}
