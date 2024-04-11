package io.channel.bezier.compose.color_v2

internal data class FunctionalTokens(
    val bgTxtBlue: BezierColor,
    val bgTxtRed: BezierColor,
)

internal fun lightFunctionalTokens() = FunctionalTokens(
    bgTxtBlue = FunctionalToken(GlobalTokens.Blue200),
    bgTxtRed = FunctionalToken(GlobalTokens.Red200),
)

internal fun darkFunctionalTokens() = FunctionalTokens(
    bgTxtBlue = FunctionalToken(GlobalTokens.Blue400),
    bgTxtRed = FunctionalToken(GlobalTokens.Red400),
)

private class FunctionalToken(bezierColor: BezierColor) : BezierColor by bezierColor
