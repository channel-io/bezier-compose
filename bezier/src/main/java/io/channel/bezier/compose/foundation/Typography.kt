package io.channel.bezier.compose.foundation

import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.sp
import io.channel.bezier.compose.R

private val PretendardFamily = FontFamily(
    Font(R.font.pretendard_regular, FontWeight.Normal),
    Font(R.font.pretendard_semibold, FontWeight.SemiBold),
    Font(R.font.pretendard_bold, FontWeight.Bold),
)

private val DefaultTextStyle = TextStyle(
    fontFamily = PretendardFamily,
    platformStyle = PlatformTextStyle(
        includeFontPadding = false
    ),
    lineHeightStyle = LineHeightStyle(
        alignment = LineHeightStyle.Alignment.Center,
        trim = LineHeightStyle.Trim.None
    )
)

enum class BezierTypography {
    Regular11,
    Regular12,
    Regular13,
    Regular14,
    Regular15,
    Regular16,
    Regular17,
    Regular18,
    Regular24,
    SemiBold11,
    SemiBold12,
    SemiBold13,
    SemiBold14,
    SemiBold15,
    SemiBold16,
    SemiBold17,
    SemiBold18,
    Bold17,
    Bold18,
    Bold24,
    Bold30,
}

internal fun BezierTypography.asTextStyle(): TextStyle {
    return when (this) {
        BezierTypography.Regular11 -> DefaultTextStyle.copy(
            fontSize = 11.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight.Normal,
            letterSpacing = (0.2).sp,
        )

        BezierTypography.Regular12 -> DefaultTextStyle.copy(
            fontSize = 12.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight.Normal,
            letterSpacing = (0.2).sp,
        )

        BezierTypography.Regular13 -> DefaultTextStyle.copy(
            fontSize = 13.sp,
            lineHeight = 18.sp,
            fontWeight = FontWeight.Normal,
            letterSpacing = (0.2).sp,
        )

        BezierTypography.Regular14 -> DefaultTextStyle.copy(
            fontSize = 14.sp,
            lineHeight = 18.sp,
            fontWeight = FontWeight.Normal,
            letterSpacing = (0.2).sp,
        )

        BezierTypography.Regular15 -> DefaultTextStyle.copy(
            fontSize = 15.sp,
            lineHeight = 22.sp,
            fontWeight = FontWeight.Normal,
            letterSpacing = (0.2).sp,
        )

        BezierTypography.Regular16 -> DefaultTextStyle.copy(
            fontSize = 16.sp,
            lineHeight = 24.sp,
            fontWeight = FontWeight.Normal,
            letterSpacing = (0.2).sp,
        )

        BezierTypography.Regular17 -> DefaultTextStyle.copy(
            fontSize = 17.sp,
            lineHeight = 22.sp,
            fontWeight = FontWeight.Normal,
            letterSpacing = 0.sp,
        )

        BezierTypography.Regular18 -> DefaultTextStyle.copy(
            fontSize = 18.sp,
            lineHeight = 24.sp,
            fontWeight = FontWeight.Normal,
            letterSpacing = 0.sp,
        )

        BezierTypography.Regular24 -> DefaultTextStyle.copy(
            fontSize = 24.sp,
            lineHeight = 32.sp,
            fontWeight = FontWeight.Normal,
            letterSpacing = 0.sp,
        )

        BezierTypography.SemiBold11 -> DefaultTextStyle.copy(
            fontSize = 11.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight.SemiBold,
            letterSpacing = (0.2).sp,
        )

        BezierTypography.SemiBold12 -> DefaultTextStyle.copy(
            fontSize = 12.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight.SemiBold,
            letterSpacing = (0.2).sp,
        )

        BezierTypography.SemiBold13 -> DefaultTextStyle.copy(
            fontSize = 13.sp,
            lineHeight = 18.sp,
            fontWeight = FontWeight.SemiBold,
            letterSpacing = (0.2).sp,
        )

        BezierTypography.SemiBold14 -> DefaultTextStyle.copy(
            fontSize = 14.sp,
            lineHeight = 18.sp,
            fontWeight = FontWeight.SemiBold,
            letterSpacing = (0.2).sp,
        )

        BezierTypography.SemiBold15 -> DefaultTextStyle.copy(
            fontSize = 15.sp,
            lineHeight = 22.sp,
            fontWeight = FontWeight.SemiBold,
            letterSpacing = (0.2).sp,
        )

        BezierTypography.SemiBold16 -> DefaultTextStyle.copy(
            fontSize = 16.sp,
            lineHeight = 24.sp,
            fontWeight = FontWeight.SemiBold,
            letterSpacing = (0.2).sp,
        )

        BezierTypography.SemiBold17 -> DefaultTextStyle.copy(
            fontSize = 17.sp,
            lineHeight = 22.sp,
            fontWeight = FontWeight.SemiBold,
            letterSpacing = 0.sp,
        )

        BezierTypography.SemiBold18 -> DefaultTextStyle.copy(
            fontSize = 18.sp,
            lineHeight = 24.sp,
            fontWeight = FontWeight.SemiBold,
            letterSpacing = 0.sp,
        )

        BezierTypography.Bold17 -> DefaultTextStyle.copy(
            fontSize = 17.sp,
            lineHeight = 22.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 0.sp,
        )

        BezierTypography.Bold18 -> DefaultTextStyle.copy(
            fontSize = 18.sp,
            lineHeight = 24.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 0.sp,
        )

        BezierTypography.Bold24 -> DefaultTextStyle.copy(
            fontSize = 24.sp,
            lineHeight = 32.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 0.sp,
        )

        BezierTypography.Bold30 -> DefaultTextStyle.copy(
            fontSize = 30.sp,
            lineHeight = 36.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 0.sp,
        )
    }
}
