package io.channel.bezier.compose.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.sample.playground.ButtonPlaygroundKey
import io.channel.bezier.compose.sample.playground.ButtonPlaygroundScreen
import io.channel.bezier.compose.sample.playground.ComponentListKey
import io.channel.bezier.compose.sample.playground.ComponentListScreen
import io.channel.bezier.compose.sample.playground.IconButtonPlaygroundKey
import io.channel.bezier.compose.sample.playground.IconButtonPlaygroundScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlaygroundApp()
        }
    }
}

@Composable
private fun PlaygroundApp() {
    BezierTheme {
        val backStack = remember { mutableStateListOf<Any>(ComponentListKey) }
        NavDisplay(
                modifier = Modifier.statusBarsPadding(),
                backStack = backStack,
                onBack = { backStack.removeLastOrNull() },
                entryProvider = entryProvider {
                    entry<ComponentListKey> {
                        ComponentListScreen(
                                onSelectButton = { backStack.add(ButtonPlaygroundKey) },
                                onSelectIconButton = { backStack.add(IconButtonPlaygroundKey) },
                        )
                    }
                    entry<ButtonPlaygroundKey> {
                        ButtonPlaygroundScreen(onBack = { backStack.removeLastOrNull() })
                    }
                    entry<IconButtonPlaygroundKey> {
                        IconButtonPlaygroundScreen(onBack = { backStack.removeLastOrNull() })
                    }
                },
        )
    }
}
