package io.channel.bezier.compose.color_v2

internal class SemanticTokens(functionalTokens: FunctionalTokens) {
    val primaryBgNormal: BezierColor = SemanticToken(functionalTokens.bgBlueNormal)
    val primaryBgLight: BezierColor = SemanticToken(functionalTokens.bgBlueLight)
    val primaryBgLighter: BezierColor = SemanticToken(functionalTokens.bgBlueLighter)
    val primaryBgLightest: BezierColor = SemanticToken(functionalTokens.bgBlueLightest)
    val primaryBgDark: BezierColor = SemanticToken(functionalTokens.bgBlueDark)
    val primaryFgNormal: BezierColor = SemanticToken(functionalTokens.fgBlueNormal)
    val primaryFgLight: BezierColor = SemanticToken(functionalTokens.fgBlueLight)
    val primaryFgDark: BezierColor = SemanticToken(functionalTokens.fgBlueDark)
    val criticalBgDark: BezierColor = SemanticToken(functionalTokens.bgRedDark)
    val criticalBgNormal: BezierColor = SemanticToken(functionalTokens.bgRedNormal)
    val criticalBgLight: BezierColor = SemanticToken(functionalTokens.bgRedLight)
    val criticalBgLighter: BezierColor = SemanticToken(functionalTokens.bgRedLighter)
    val criticalBgLightest: BezierColor = SemanticToken(functionalTokens.bgRedLightest)
    val criticalFgNormal: BezierColor = SemanticToken(functionalTokens.fgRedNormal)
    val criticalFgLight: BezierColor = SemanticToken(functionalTokens.fgRedLight)
    val criticalFgDark: BezierColor = SemanticToken(functionalTokens.fgRedDark)
    val warningBgDark: BezierColor = SemanticToken(functionalTokens.bgOrangeDark)
    val warningBgNormal: BezierColor = SemanticToken(functionalTokens.bgOrangeNormal)
    val warningBgLight: BezierColor = SemanticToken(functionalTokens.bgOrangeLight)
    val warningBgLighter: BezierColor = SemanticToken(functionalTokens.bgOrangeLighter)
    val warningBgLightest: BezierColor = SemanticToken(functionalTokens.bgOrangeLightest)
    val warningFgNormal: BezierColor = SemanticToken(functionalTokens.fgOrangeNormal)
    val warningFgLight: BezierColor = SemanticToken(functionalTokens.fgOrangeLight)
    val warningFgDark: BezierColor = SemanticToken(functionalTokens.fgOrangeDark)
    val accentBgDark: BezierColor = SemanticToken(functionalTokens.bgCobaltDark)
    val accentBgNormal: BezierColor = SemanticToken(functionalTokens.bgCobaltNormal)
    val accentBgLight: BezierColor = SemanticToken(functionalTokens.bgCobaltLight)
    val accentBgLighter: BezierColor = SemanticToken(functionalTokens.bgCobaltLighter)
    val accentBgLightest: BezierColor = SemanticToken(functionalTokens.bgCobaltLightest)
    val accentFgNormal: BezierColor = SemanticToken(functionalTokens.fgCobaltNormal)
    val accentFgLight: BezierColor = SemanticToken(functionalTokens.fgCobaltLight)
    val accentFgDark: BezierColor = SemanticToken(functionalTokens.fgCobaltDark)
    val successBgDark: BezierColor = SemanticToken(functionalTokens.bgGreenDark)
    val successBgNormal: BezierColor = SemanticToken(functionalTokens.bgGreenNormal)
    val successBgLight: BezierColor = SemanticToken(functionalTokens.bgGreenLight)
    val successBgLighter: BezierColor = SemanticToken(functionalTokens.bgGreenLighter)
    val successBgLightest: BezierColor = SemanticToken(functionalTokens.bgGreenLightest)
    val successFgNormal: BezierColor = SemanticToken(functionalTokens.fgGreenNormal)
    val successFgLight: BezierColor = SemanticToken(functionalTokens.fgGreenLight)
    val successFgDark: BezierColor = SemanticToken(functionalTokens.fgGreenDark)
}

private class SemanticToken(bezierColor: BezierColor) : BezierColor by bezierColor