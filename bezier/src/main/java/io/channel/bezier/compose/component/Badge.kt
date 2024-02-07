package io.channel.bezier.compose.component

import android.content.Context
import android.util.AttributeSet
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.AbstractComposeView
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.res.use
import io.channel.bezier.compose.R

typealias BadgeSize = Badge.Size
typealias BadgeColor = Badge.Color

class Badge @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0,
) : AbstractComposeView(context, attrs, defStyleAttr) {

    var text by mutableStateOf("")
    var size by mutableStateOf(Size.XS)
    var color by mutableStateOf(Color.Normal)
    var iconId by mutableStateOf(0)

    init {
        context.theme.obtainStyledAttributes(
                attrs,
                R.styleable.Badge,
                0,
                0,
        ).use { typedArray ->
            size = Size.fromId(typedArray.getInt(R.styleable.Badge_bdg_size, size.id))
            color = Color.fromId(typedArray.getInt(R.styleable.Badge_bdg_color, color.id))
            text = typedArray.getString(R.styleable.Badge_bdg_text).orEmpty()
            iconId = typedArray.getResourceId(R.styleable.Badge_bdg_icon, 0)
        }
    }

    @Composable
    override fun Content() {
        Badge(
                text = text,
                painter = if (iconId == 0) {
                    null
                } else {
                    painterResource(id = iconId)
                },
                color = color,
                size = size,
        )
    }

    enum class Size(
            val id: Int,
            val padding: PaddingValues,
            val textSize: TextUnit,
            val radius: Dp,
    ) {
        XS(0, PaddingValues(horizontal = 3.dp, vertical = 1.dp), 12.sp, 4.dp),
        S(1, PaddingValues(horizontal = 3.dp, vertical = 2.dp), 14.sp, 6.dp),
        M(2, PaddingValues(horizontal = 4.dp, vertical = 2.dp), 15.sp, 6.dp),
        L(3, PaddingValues(horizontal = 6.dp, vertical = 3.dp), 16.sp, 6.dp);

        companion object {
            fun fromId(id: Int): Size {
                return entries.firstOrNull { it.id == id } ?: XS
            }
        }
    }

    enum class Color(val id: Int, val backgroundColor: Int, val iconColor: Int, val textColor: Int) {
        Normal(0, R.color.bg_black_lighter, R.color.txt_black_darker, R.color.txt_black_darkest),
        Blue(1, R.color.bgtxt_blue_lighter, R.color.bgtxt_blue_normal, R.color.bgtxt_blue_normal),
        Cobalt(2, R.color.bgtxt_cobalt_lighter, R.color.bgtxt_cobalt_normal, R.color.bgtxt_cobalt_normal),
        Green(3, R.color.bgtxt_green_lighter, R.color.bgtxt_green_normal, R.color.bgtxt_green_normal),
        Orange(4, R.color.bgtxt_orange_lighter, R.color.bgtxt_orange_normal, R.color.bgtxt_orange_normal),
        Red(5, R.color.bgtxt_red_lighter, R.color.bgtxt_red_normal, R.color.bgtxt_red_normal),
        Purple(6, R.color.bgtxt_purple_lighter, R.color.bgtxt_purple_normal, R.color.bgtxt_purple_normal),
        MonochromeDark(7, R.color.bg_black_darker, R.color.bgtxt_absolute_white_dark, R.color.bgtxt_absolute_white_dark),
        MonochromeLight(8, R.color.bg_black_lighter, R.color.txt_black_dark, R.color.txt_black_dark);

        companion object {
            fun fromId(id: Int): Color {
                return entries.find { it.id == id } ?: Normal
            }
        }
    }
}

@Composable
fun Badge(
    modifier: Modifier = Modifier,
    text: String? = null,
    painter: Painter? = null,
    color: BadgeColor = Badge.Color.Normal,
    size: BadgeSize = Badge.Size.XS,
) {
    Row(
            modifier = modifier
                    .wrapContentSize()
                    .background(
                            color = colorResource(id = color.backgroundColor),
                            shape = RoundedCornerShape(size.radius),
                    )
                    .padding(size.padding),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(2.dp),
    ) {
        if (painter != null) {
            Icon(
                    modifier = Modifier.size(16.dp),
                    painter = painter,
                    contentDescription = null,
                    tint = colorResource(id = color.iconColor),
            )
        }

        if (!text.isNullOrBlank()) {
            Text(
                    text = text,
                    fontSize = size.textSize,
                    color = colorResource(id = color.textColor),
                    maxLines = 1,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun BadgePreview() {
    LazyVerticalGrid(columns = GridCells.Fixed(2)) {
        items(BadgeColor.values()) {
            Badge(
                    modifier = Modifier.padding(horizontal = 4.dp, vertical = 4.dp),
                    painter = painterResource(id = R.drawable.icon_person),
                    text = it.name,
                    color = it,
                    size = Badge.Size.L,
            )
        }

        item {
            Badge(
                    modifier = Modifier.padding(horizontal = 4.dp, vertical = 4.dp),
                    painter = painterResource(id = R.drawable.icon_person),
                    text = null,
                    color = Badge.Color.Blue,
                    size = Badge.Size.L,
            )
        }

        item {
            Badge(
                    modifier = Modifier.padding(horizontal = 4.dp, vertical = 4.dp),
                    text = "text",
                    color = Badge.Color.Blue,
                    size = Badge.Size.L,
            )
        }
    }
}
