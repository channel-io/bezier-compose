package io.channel.bezier.compose.sample.playground

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.holix.android.bottomsheetdialog.compose.BottomSheetDialog
import io.channel.bezier.BezierIcons
import io.channel.bezier.BezierTheme
import io.channel.bezier.icon.ArrowLeft
import io.channel.bezier.v3.component.Button
import io.channel.bezier.v3.component.ButtonSemantic
import io.channel.bezier.v3.component.ButtonVariant
import io.channel.bezier.v3.component.IconButton
import io.channel.bezier.v3.component.IconButtonSize
import io.channel.bezier.v3.component.IconButtonVariant

@Composable
fun HolixBottomSheetPlaygroundScreen(onBack: () -> Unit) {
    var show by remember { mutableStateOf(false) }

    Scaffold(
            topBar = {
                TopAppBar(
                        title = { Text("Holix BottomSheet (중첩)") },
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
                        .background(BezierTheme.colorsV3.surfaceLow)
                        .padding(24.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp),
        ) {
            Text("'바텀시트 하나 더 열기'를 누르면 Holix BottomSheetDialog가 계속 겹쳐서 쌓입니다.")
            Button(
                    text = "바텀시트 열기",
                    onClick = { show = true },
            )
        }
    }

    if (show) {
        HolixNestedBottomSheet(depth = 1, onDismiss = { show = false })
    }
}

@Composable
private fun HolixNestedBottomSheet(
        depth: Int,
        onDismiss: () -> Unit,
) {
    var showChild by remember { mutableStateOf(false) }

    BottomSheetDialog(onDismissRequest = onDismiss) {
        Surface {
            Column(
                    modifier = Modifier
                            .fillMaxWidth()
                            .padding(24.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                Text("Holix BottomSheet · depth $depth")
                Button(
                        text = "바텀시트 하나 더 열기",
                        onClick = { showChild = true },
                        modifier = Modifier.fillMaxWidth(),
                )
                Button(
                        text = "닫기",
                        onClick = onDismiss,
                        modifier = Modifier.fillMaxWidth(),
                        variant = ButtonVariant.Outlined,
                        semantic = ButtonSemantic.Secondary,
                )
            }
        }
    }

    if (showChild) {
        HolixNestedBottomSheet(depth = depth + 1, onDismiss = { showChild = false })
    }
}
