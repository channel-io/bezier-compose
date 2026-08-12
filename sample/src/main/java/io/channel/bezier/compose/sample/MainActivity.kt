package io.channel.bezier.compose.sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.ui.NavDisplay
import io.channel.bezier.BezierTheme
import io.channel.bezier.compose.sample.playground.AvatarGroupPlaygroundKey
import io.channel.bezier.compose.sample.playground.AvatarGroupPlaygroundScreen
import io.channel.bezier.compose.sample.playground.AvatarPlaygroundKey
import io.channel.bezier.compose.sample.playground.AvatarPlaygroundScreen
import io.channel.bezier.compose.sample.playground.BadgePlaygroundKey
import io.channel.bezier.compose.sample.playground.BadgePlaygroundScreen
import io.channel.bezier.compose.sample.playground.BannerPlaygroundKey
import io.channel.bezier.compose.sample.playground.BannerPlaygroundScreen
import io.channel.bezier.compose.sample.playground.BaseItemPlaygroundKey
import io.channel.bezier.compose.sample.playground.BaseItemPlaygroundScreen
import io.channel.bezier.compose.sample.playground.ButtonPlaygroundKey
import io.channel.bezier.compose.sample.playground.ButtonPlaygroundScreen
import io.channel.bezier.compose.sample.playground.CardPlaygroundKey
import io.channel.bezier.compose.sample.playground.CardPlaygroundScreen
import io.channel.bezier.compose.sample.playground.CheckboxPlaygroundKey
import io.channel.bezier.compose.sample.playground.CheckboxPlaygroundScreen
import io.channel.bezier.compose.sample.playground.TextAreaPlaygroundKey
import io.channel.bezier.compose.sample.playground.TextAreaPlaygroundScreen
import io.channel.bezier.compose.sample.playground.TextInputPlaygroundKey
import io.channel.bezier.compose.sample.playground.TextInputPlaygroundScreen
import io.channel.bezier.compose.sample.playground.ComponentListKey
import io.channel.bezier.compose.sample.playground.ComponentListScreen
import io.channel.bezier.compose.sample.playground.DividerPlaygroundKey
import io.channel.bezier.compose.sample.playground.DividerPlaygroundScreen
import io.channel.bezier.compose.sample.playground.FloatingBannerPlaygroundKey
import io.channel.bezier.compose.sample.playground.FloatingBannerPlaygroundScreen
import io.channel.bezier.compose.sample.playground.IconButtonPlaygroundKey
import io.channel.bezier.compose.sample.playground.IconButtonPlaygroundScreen
import io.channel.bezier.compose.sample.playground.ItemsPlaygroundKey
import io.channel.bezier.compose.sample.playground.ItemsPlaygroundScreen
import io.channel.bezier.compose.sample.playground.ConfirmModalPlaygroundKey
import io.channel.bezier.compose.sample.playground.ConfirmModalPlaygroundScreen
import io.channel.bezier.compose.sample.playground.ModalPlaygroundKey
import io.channel.bezier.compose.sample.playground.ModalPlaygroundScreen
import io.channel.bezier.compose.sample.playground.ProgressBarPlaygroundKey
import io.channel.bezier.compose.sample.playground.ProgressBarPlaygroundScreen
import io.channel.bezier.compose.sample.playground.SectionPlaygroundKey
import io.channel.bezier.compose.sample.playground.SectionPlaygroundScreen
import io.channel.bezier.compose.sample.playground.SpinnerPlaygroundKey
import io.channel.bezier.compose.sample.playground.SpinnerPlaygroundScreen
import io.channel.bezier.compose.sample.playground.StatusPlaygroundKey
import io.channel.bezier.compose.sample.playground.StatusPlaygroundScreen
import io.channel.bezier.compose.sample.playground.SwitchPlaygroundKey
import io.channel.bezier.compose.sample.playground.SwitchPlaygroundScreen
import io.channel.bezier.compose.sample.playground.TagPlaygroundKey
import io.channel.bezier.compose.sample.playground.TagPlaygroundScreen
import io.channel.bezier.compose.sample.playground.ToastPlaygroundKey
import io.channel.bezier.compose.sample.playground.ToastPlaygroundScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            PlaygroundApp()
        }
    }
}

@Composable
private fun PlaygroundApp() {
    BezierTheme(isDark = isSystemInDarkTheme()) {
        Box(
                modifier = Modifier
                        .fillMaxSize()
                        .background(BezierTheme.colorsV3.surface),
        ) {
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
                                    onSelectBadge = { backStack.add(BadgePlaygroundKey) },
                                    onSelectTag = { backStack.add(TagPlaygroundKey) },
                                    onSelectAvatar = { backStack.add(AvatarPlaygroundKey) },
                                    onSelectAvatarGroup = { backStack.add(AvatarGroupPlaygroundKey) },
                                    onSelectSpinner = { backStack.add(SpinnerPlaygroundKey) },
                                    onSelectProgressBar = { backStack.add(ProgressBarPlaygroundKey) },
                                    onSelectStatus = { backStack.add(StatusPlaygroundKey) },
                                    onSelectSwitch = { backStack.add(SwitchPlaygroundKey) },
                                    onSelectDivider = { backStack.add(DividerPlaygroundKey) },
                                    onSelectToast = { backStack.add(ToastPlaygroundKey) },
                                    onSelectCard = { backStack.add(CardPlaygroundKey) },
                                    onSelectSection = { backStack.add(SectionPlaygroundKey) },
                                    onSelectTextInput = { backStack.add(TextInputPlaygroundKey) },
                                    onSelectBanner = { backStack.add(BannerPlaygroundKey) },
                                    onSelectBaseItem = { backStack.add(BaseItemPlaygroundKey) },
                                    onSelectCheckbox = { backStack.add(CheckboxPlaygroundKey) },
                                    onSelectFloatingBanner = { backStack.add(FloatingBannerPlaygroundKey) },
                                    onSelectItems = { backStack.add(ItemsPlaygroundKey) },
                                    onSelectTextArea = { backStack.add(TextAreaPlaygroundKey) },
                                    onSelectModal = { backStack.add(ModalPlaygroundKey) },
                                    onSelectConfirmModal = { backStack.add(ConfirmModalPlaygroundKey) },
                            )
                        }
                        entry<ButtonPlaygroundKey> {
                            ButtonPlaygroundScreen(onBack = { backStack.removeLastOrNull() })
                        }
                        entry<IconButtonPlaygroundKey> {
                            IconButtonPlaygroundScreen(onBack = { backStack.removeLastOrNull() })
                        }
                        entry<BadgePlaygroundKey> {
                            BadgePlaygroundScreen(onBack = { backStack.removeLastOrNull() })
                        }
                        entry<TagPlaygroundKey> {
                            TagPlaygroundScreen(onBack = { backStack.removeLastOrNull() })
                        }
                        entry<AvatarPlaygroundKey> {
                            AvatarPlaygroundScreen(onBack = { backStack.removeLastOrNull() })
                        }
                        entry<AvatarGroupPlaygroundKey> {
                            AvatarGroupPlaygroundScreen(onBack = { backStack.removeLastOrNull() })
                        }
                        entry<SpinnerPlaygroundKey> {
                            SpinnerPlaygroundScreen(onBack = { backStack.removeLastOrNull() })
                        }
                        entry<ProgressBarPlaygroundKey> {
                            ProgressBarPlaygroundScreen(onBack = { backStack.removeLastOrNull() })
                        }
                        entry<StatusPlaygroundKey> {
                            StatusPlaygroundScreen(onBack = { backStack.removeLastOrNull() })
                        }
                        entry<SwitchPlaygroundKey> {
                            SwitchPlaygroundScreen(onBack = { backStack.removeLastOrNull() })
                        }
                        entry<DividerPlaygroundKey> {
                            DividerPlaygroundScreen(onBack = { backStack.removeLastOrNull() })
                        }
                        entry<ToastPlaygroundKey> {
                            ToastPlaygroundScreen(onBack = { backStack.removeLastOrNull() })
                        }
                        entry<CardPlaygroundKey> {
                            CardPlaygroundScreen(onBack = { backStack.removeLastOrNull() })
                        }
                        entry<SectionPlaygroundKey> {
                            SectionPlaygroundScreen(onBack = { backStack.removeLastOrNull() })
                        }
                        entry<TextInputPlaygroundKey> {
                            TextInputPlaygroundScreen(onBack = { backStack.removeLastOrNull() })
                        }
                        entry<BannerPlaygroundKey> {
                            BannerPlaygroundScreen(onBack = { backStack.removeLastOrNull() })
                        }
                        entry<BaseItemPlaygroundKey> {
                            BaseItemPlaygroundScreen(onBack = { backStack.removeLastOrNull() })
                        }
                        entry<CheckboxPlaygroundKey> {
                            CheckboxPlaygroundScreen(onBack = { backStack.removeLastOrNull() })
                        }
                        entry<FloatingBannerPlaygroundKey> {
                            FloatingBannerPlaygroundScreen(onBack = { backStack.removeLastOrNull() })
                        }
                        entry<ItemsPlaygroundKey> {
                            ItemsPlaygroundScreen(onBack = { backStack.removeLastOrNull() })
                        }
                        entry<TextAreaPlaygroundKey> {
                            TextAreaPlaygroundScreen(onBack = { backStack.removeLastOrNull() })
                        }
                        entry<ModalPlaygroundKey> {
                            ModalPlaygroundScreen(onBack = { backStack.removeLastOrNull() })
                        }
                        entry<ConfirmModalPlaygroundKey> {
                            ConfirmModalPlaygroundScreen(onBack = { backStack.removeLastOrNull() })
                        }
                    },
            )
        }
    }
}
