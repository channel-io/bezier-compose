package io.channel.bezier.compose.sample.playground

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.icon.ArrowLeft
import io.channel.bezier.icon.Plus
import io.channel.bezier.v3.component.ActionItem
import io.channel.bezier.v3.component.IconButton
import io.channel.bezier.v3.component.IconButtonSize
import io.channel.bezier.v3.component.IconButtonVariant
import io.channel.bezier.v3.component.MultiSelectItem
import io.channel.bezier.v3.component.NavigationItem
import io.channel.bezier.v3.component.OutlinkItem
import io.channel.bezier.v3.component.SelectItem

private enum class ItemVariant {
    Navigation,
    Select,
    MultiSelect,
    Outlink,
    Action,
}

@Composable
fun ItemsPlaygroundScreen(onBack: () -> Unit) {
    var variant by remember { mutableStateOf(ItemVariant.Navigation) }
    var hasValue by remember { mutableStateOf(true) }

    Scaffold(
            topBar = {
                TopAppBar(
                        title = { Text("Items") },
                        navigationIcon = {
                            IconButton(
                                    icon = BezierIcons.ArrowLeft,
                                    onClick = onBack,
                                    size = IconButtonSize.Medium,
                                    variant = IconButtonVariant.Ghost,
                                    contentDescription = "Back",
                            )
                        },
                )
            },
    ) { padding ->
        Column(
                modifier = Modifier
                        .padding(padding)
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState()),
        ) {
            val icon = BezierIcons.Plus
            val label = "Center content"
            val value = if (hasValue) "Value" else null

            Box(
                    modifier = Modifier
                            .fillMaxWidth()
                            .background(BezierTheme.colorsV3.surfaceLow)
                            .padding(32.dp),
            ) {
                when (variant) {
                    ItemVariant.Navigation -> NavigationItem(
                            modifier = Modifier.fillMaxWidth(),
                            leadingIcon = icon,
                            label = label,
                    )

                    ItemVariant.Select -> SelectItem(
                            modifier = Modifier.fillMaxWidth(),
                            leadingIcon = icon,
                            label = label,
                            value = value,
                    )

                    ItemVariant.MultiSelect -> MultiSelectItem(
                            modifier = Modifier.fillMaxWidth(),
                            leadingIcon = icon,
                            label = label,
                            value = value,
                    )

                    ItemVariant.Outlink -> OutlinkItem(
                            modifier = Modifier.fillMaxWidth(),
                            leadingIcon = icon,
                            label = label,
                    )

                    ItemVariant.Action -> ActionItem(
                            modifier = Modifier.fillMaxWidth(),
                            leadingIcon = icon,
                            label = label,
                    )
                }
            }

            Divider()

            EnumControl("variant", ItemVariant.values(), variant) { variant = it }
            BooleanControl("value (Select / MultiSelect)", hasValue) { hasValue = it }
        }
    }
}
