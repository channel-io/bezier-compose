package io.channel.bezier.compose.color_v2

class SemanticTokens(functionalTokens: FunctionalTokens) {
    val success: BezierColor = SemanticToken(functionalTokens.bgTxtBlue)
    val failure: BezierColor = SemanticToken(functionalTokens.bgTxtRed)
}

private class SemanticToken(bezierColor: BezierColor) : BezierColor by bezierColor
