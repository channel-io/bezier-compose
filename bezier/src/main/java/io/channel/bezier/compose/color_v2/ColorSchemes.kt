package io.channel.bezier.compose.color_v2

class ColorSchemes(
    functionalTokens: FunctionalTokens,
    semanticTokens: SemanticTokens,
) {
    val blue200: BezierColor = GlobalTokens.Blue200
    val blue400: BezierColor = GlobalTokens.Blue400
    val red200: BezierColor = GlobalTokens.Red200
    val red400: BezierColor = GlobalTokens.Red400

    val bgTxtBlue: BezierColor = functionalTokens.bgTxtBlue
    val bgTxtRed: BezierColor = functionalTokens.bgTxtRed

    val success: BezierColor = semanticTokens.success
    val failure: BezierColor = semanticTokens.failure
}
