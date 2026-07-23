package io.channel.bezier.v3.component

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.channel.bezier.BezierTheme
import io.channel.bezier.color.BezierSemanticColorV3
import io.channel.bezier.component.BezierText
import io.channel.bezier.typography.BezierTypo

enum class FormFieldLabelPosition {
    Top,
    Left,
}

@Composable
internal fun FormField(
        labelPosition: FormFieldLabelPosition = FormFieldLabelPosition.Top,
        label: String? = null,
        description: String? = null,
        required: Boolean = false,
        errorText: String? = null,
        customContent: (@Composable () -> Unit)? = null,
        modifier: Modifier = Modifier,
        control: @Composable () -> Unit,
) {
    val colors = BezierTheme.colorsV3

    Column(
            modifier = modifier.padding(bottom = FormFieldBottomPadding),
            verticalArrangement = Arrangement.spacedBy(FormFieldGap),
    ) {
        when (labelPosition) {
            FormFieldLabelPosition.Top -> {
                Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = Arrangement.spacedBy(FormFieldContentGap),
                ) {
                    if (label != null) {
                        FormFieldLabelArea(
                                label = label,
                                description = description,
                                required = required,
                                colors = colors,
                                modifier = Modifier.fillMaxWidth(),
                        )
                    }
                    Box(modifier = Modifier.fillMaxWidth()) {
                        control()
                    }
                }
            }

            FormFieldLabelPosition.Left -> {
                Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.Top,
                ) {
                    if (label != null) {
                        FormFieldLabelArea(
                                label = label,
                                description = description,
                                required = required,
                                colors = colors,
                                modifier = Modifier.weight(1f),
                        )
                    }
                    Box(
                            modifier = Modifier.widthIn(
                                    min = FormFieldInlineControlMinWidth,
                                    max = FormFieldInlineControlMaxWidth,
                            ),
                            contentAlignment = Alignment.TopEnd,
                    ) {
                        control()
                    }
                }
            }
        }

        if (customContent != null) {
            Box(modifier = Modifier.fillMaxWidth()) {
                customContent()
            }
        }

        if (errorText != null) {
            FormFieldErrorMessage(
                    text = errorText,
                    modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = FormFieldErrorMessageStartPadding),
            )
        }
    }
}

@Composable
private fun FormFieldLabelArea(
        label: String,
        description: String?,
        required: Boolean,
        colors: BezierSemanticColorV3,
        modifier: Modifier = Modifier,
) {
    Column(
            modifier = modifier.padding(start = FormFieldLabelAreaStartPadding),
            verticalArrangement = Arrangement.spacedBy(FormFieldLabelAreaGap),
    ) {
        Row(horizontalArrangement = Arrangement.spacedBy(FormFieldLabelRowGap)) {
            BezierText(
                    text = label,
                    typo = BezierTypo.LabelLarge,
                    color = colors.textNeutral,
            )
            if (required) {
                BezierText(
                        text = "*",
                        typo = BezierTypo.LabelLarge,
                        color = colors.textAccentOrange,
                )
            }
        }
        if (description != null) {
            BezierText(
                    text = description,
                    typo = BezierTypo.TextXSmall,
                    color = colors.textNeutralLighter,
            )
        }
    }
}

private val FormFieldBottomPadding: Dp = 24.dp
private val FormFieldGap: Dp = 6.dp
private val FormFieldContentGap: Dp = 8.dp
private val FormFieldLabelAreaStartPadding: Dp = 2.dp
private val FormFieldLabelAreaGap: Dp = 2.dp
private val FormFieldLabelRowGap: Dp = 2.dp
private val FormFieldInlineControlMinWidth: Dp = 120.dp
private val FormFieldInlineControlMaxWidth: Dp = 200.dp
private val FormFieldErrorMessageStartPadding: Dp = 2.dp

@Composable
private fun FormFieldPreviewStackedControl() {
    Box(
            modifier = Modifier
                    .fillMaxWidth()
                    .height(36.dp)
                    .border(
                            width = 1.dp,
                            color = BezierTheme.colorsV3.borderNeutral,
                            shape = RoundedCornerShape(8.dp),
                    ),
    )
}

@Composable
private fun FormFieldPreviewInlineControl() {
    Box(
            modifier = Modifier
                    .width(80.dp)
                    .height(36.dp)
                    .border(
                            width = 1.dp,
                            color = BezierTheme.colorsV3.borderNeutral,
                            shape = RoundedCornerShape(8.dp),
                    ),
    )
}

@Composable
private fun FormFieldPreviewCustomContent() {
    Box(
            modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .background(
                            color = BezierTheme.colorsV3.fillNeutralLighter,
                            shape = RoundedCornerShape(8.dp),
                    ),
    )
}

@Composable
private fun FormFieldPreviewContent() {
    BezierTheme {
        Column(
                modifier = Modifier
                        .background(BezierTheme.colorsV3.surface)
                        .padding(24.dp)
                        .width(320.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
        ) {
            FormField(
                    label = "Label",
                    description = "Description text",
                    required = true,
            ) {
                FormFieldPreviewStackedControl()
            }
            FormField(
                    label = "Label",
                    description = "Description text",
                    errorText = "Error message",
            ) {
                FormFieldPreviewStackedControl()
            }
            FormField(label = "Label") {
                FormFieldPreviewStackedControl()
            }
            FormField(
                    labelPosition = FormFieldLabelPosition.Left,
                    label = "Label",
                    description = "Description text",
            ) {
                FormFieldPreviewInlineControl()
            }
            FormField(
                    label = "Label",
                    description = "Description text",
                    customContent = { FormFieldPreviewCustomContent() },
            ) {
                FormFieldPreviewStackedControl()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun FormFieldPreview() = FormFieldPreviewContent()

@Preview(showBackground = true, uiMode = UI_MODE_NIGHT_YES)
@Composable
private fun FormFieldDarkPreview() = FormFieldPreviewContent()
