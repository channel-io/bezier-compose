package io.channel.bezier.color

import androidx.compose.ui.graphics.Color

interface BezierSemanticColorV3 {
    val borderAbsoluteWhite: Color
    val borderDetach: Color
    val borderDetachHigh: Color
    val borderDetachHigher: Color
    val borderDetachHighest: Color
    val borderDetachLow: Color
    val borderNeutral: Color
    val borderNeutralHeavier: Color
    val borderNeutralHeavy: Color
    val dimAbsoluteBlack: Color
    val dimAbsoluteBlackHeavy: Color
    val dimAbsoluteWhite: Color
    val dimAbsoluteWhiteHeavy: Color
    val elevationBase: Color
    val elevationBase_inner: Color
    val elevationLarge: Color
    val elevationMedium: Color
    val elevationSmall: Color
    val elevationXlarge: Color
    val fillAbsoluteBlack: Color
    val fillAbsoluteBlackLight: Color
    val fillAbsoluteBlackTransparent: Color
    val fillAbsoluteWhite: Color
    val fillAbsoluteWhiteLight: Color
    val fillAbsoluteWhiteTransparent: Color
    val fillAccentBlue: Color
    val fillAccentBlueHeavier: Color
    val fillAccentBlueHeavy: Color
    val fillAccentBlueTransparent: Color
    val fillAccentCobalt: Color
    val fillAccentCobaltHeavier: Color
    val fillAccentCobaltHeavy: Color
    val fillAccentCobaltTransparent: Color
    val fillAccentGreen: Color
    val fillAccentGreenHeavier: Color
    val fillAccentGreenHeavy: Color
    val fillAccentGreenTransparent: Color
    val fillAccentNavy: Color
    val fillAccentNavyHeavier: Color
    val fillAccentNavyHeavy: Color
    val fillAccentNavyTransparent: Color
    val fillAccentOlive: Color
    val fillAccentOliveHeavier: Color
    val fillAccentOliveHeavy: Color
    val fillAccentOliveTransparent: Color
    val fillAccentOrange: Color
    val fillAccentOrangeHeavier: Color
    val fillAccentOrangeHeavy: Color
    val fillAccentOrangeTransparent: Color
    val fillAccentPink: Color
    val fillAccentPinkHeavier: Color
    val fillAccentPinkHeavy: Color
    val fillAccentPinkTransparent: Color
    val fillAccentPurple: Color
    val fillAccentPurpleHeavier: Color
    val fillAccentPurpleHeavy: Color
    val fillAccentPurpleTransparent: Color
    val fillAccentRed: Color
    val fillAccentRedHeavier: Color
    val fillAccentRedHeavy: Color
    val fillAccentRedTransparent: Color
    val fillAccentTeal: Color
    val fillAccentTealHeavier: Color
    val fillAccentTealHeavy: Color
    val fillAccentTealTransparent: Color
    val fillAccentYellow: Color
    val fillAccentYellowHeavier: Color
    val fillAccentYellowHeavy: Color
    val fillAccentYellowTransparent: Color
    val fillAction: Color
    val fillActionLight: Color
    val fillActionLighter: Color
    val fillActionTransparent: Color
    val fillBright: Color
    val fillCritical: Color
    val fillCriticalLight: Color
    val fillCriticalLighter: Color
    val fillCriticalTransparent: Color
    val fillGrey: Color
    val fillGreyHeavier: Color
    val fillGreyHeavy: Color
    val fillHighlight: Color
    val fillHighlightLight: Color
    val fillHighlightLighter: Color
    val fillHighlightTransparent: Color
    val fillNeutralHeavier: Color
    val fillNeutralHeaviest: Color
    val fillNeutralHeavy: Color
    val fillNeutralLight: Color
    val fillNeutralLighter: Color
    val fillNeutralLightest: Color
    val fillNeutralTransparent: Color
    val fillSuccess: Color
    val fillSuccessLight: Color
    val fillSuccessLighter: Color
    val fillSuccessTransparent: Color
    val fillWarning: Color
    val fillWarningLight: Color
    val fillWarningLighter: Color
    val fillWarningTransparent: Color
    val gradientAccentGreen: Color
    val gradientAccentGreen_light: Color
    val iconAbsoluteBlack: Color
    val iconAbsoluteWhite: Color
    val iconAccentBlue: Color
    val iconAccentCobalt: Color
    val iconAccentGreen: Color
    val iconAccentNavy: Color
    val iconAccentOlive: Color
    val iconAccentOrange: Color
    val iconAccentPink: Color
    val iconAccentPurple: Color
    val iconAccentRed: Color
    val iconAccentTeal: Color
    val iconAccentYellow: Color
    val iconAction: Color
    val iconCritical: Color
    val iconHighlight: Color
    val iconInverseHeavier: Color
    val iconNeutral: Color
    val iconNeutralHeavier: Color
    val iconNeutralHeavy: Color
    val iconSuccess: Color
    val iconWarning: Color
    val stateAction: Color
    val stateActionLight: Color
    val stateDefault: Color
    val stateWarning: Color
    val stateWarningLight: Color
    val surface: Color
    val surfaceGlass: Color
    val surfaceGlassHigh: Color
    val surfaceGlassHigher: Color
    val surfaceGlassHighest: Color
    val surfaceHigh: Color
    val surfaceHigher: Color
    val surfaceHighest: Color
    val surfaceLow: Color
    val textAbsoluteBlack: Color
    val textAbsoluteWhite: Color
    val textAccentBlue: Color
    val textAccentCobalt: Color
    val textAccentGreen: Color
    val textAccentNavy: Color
    val textAccentOlive: Color
    val textAccentOrange: Color
    val textAccentPink: Color
    val textAccentPurple: Color
    val textAccentRed: Color
    val textAccentTeal: Color
    val textAccentYellow: Color
    val textAction: Color
    val textCritical: Color
    val textHighlight: Color
    val textInverse: Color
    val textNeutral: Color
    val textNeutralHeaviest: Color
    val textNeutralLight: Color
    val textNeutralLighter: Color
    val textSuccess: Color
    val textWarning: Color
}

internal class LightColor : BezierSemanticColorV3 {
    override val borderAbsoluteWhite = BezierGlobalColor.White100
    override val borderDetach = BezierGlobalColor.White100
    override val borderDetachHigh = BezierGlobalColor.White100
    override val borderDetachHigher = BezierGlobalColor.White100
    override val borderDetachHighest = BezierGlobalColor.White100
    override val borderDetachLow = BezierGlobalColor.Grey50
    override val borderNeutral = BezierGlobalColor.Black8
    override val borderNeutralHeavier = BezierGlobalColor.Black40
    override val borderNeutralHeavy = BezierGlobalColor.Black15
    override val dimAbsoluteBlack = BezierGlobalColor.Black40
    override val dimAbsoluteBlackHeavy = BezierGlobalColor.Black60
    override val dimAbsoluteWhite = BezierGlobalColor.White40
    override val dimAbsoluteWhiteHeavy = BezierGlobalColor.White60
    override val elevationBase = BezierGlobalColor.Black5
    override val elevationBase_inner = BezierGlobalColor.White12
    override val elevationLarge = BezierGlobalColor.Black22
    override val elevationMedium = BezierGlobalColor.Black15
    override val elevationSmall = BezierGlobalColor.Black8
    override val elevationXlarge = BezierGlobalColor.Black30
    override val fillAbsoluteBlack = BezierGlobalColor.Black100
    override val fillAbsoluteBlackLight = BezierGlobalColor.Black20
    override val fillAbsoluteBlackTransparent = BezierGlobalColor.Black0
    override val fillAbsoluteWhite = BezierGlobalColor.White100
    override val fillAbsoluteWhiteLight = BezierGlobalColor.White20
    override val fillAbsoluteWhiteTransparent = BezierGlobalColor.White0
    override val fillAccentBlue = BezierGlobalColor.Blue400_10
    override val fillAccentBlueHeavier = BezierGlobalColor.Blue400
    override val fillAccentBlueHeavy = BezierGlobalColor.Blue400_20
    override val fillAccentBlueTransparent = BezierGlobalColor.Blue400_0
    override val fillAccentCobalt = BezierGlobalColor.Cobalt400_10
    override val fillAccentCobaltHeavier = BezierGlobalColor.Cobalt400
    override val fillAccentCobaltHeavy = BezierGlobalColor.Cobalt400_20
    override val fillAccentCobaltTransparent = BezierGlobalColor.Cobalt400_0
    override val fillAccentGreen = BezierGlobalColor.Green400_10
    override val fillAccentGreenHeavier = BezierGlobalColor.Green400
    override val fillAccentGreenHeavy = BezierGlobalColor.Green400_20
    override val fillAccentGreenTransparent = BezierGlobalColor.Green400_0
    override val fillAccentNavy = BezierGlobalColor.Navy400_10
    override val fillAccentNavyHeavier = BezierGlobalColor.Navy400
    override val fillAccentNavyHeavy = BezierGlobalColor.Navy400_20
    override val fillAccentNavyTransparent = BezierGlobalColor.Navy400_0
    override val fillAccentOlive = BezierGlobalColor.Olive400_10
    override val fillAccentOliveHeavier = BezierGlobalColor.Olive400
    override val fillAccentOliveHeavy = BezierGlobalColor.Olive400_20
    override val fillAccentOliveTransparent = BezierGlobalColor.Olive400_0
    override val fillAccentOrange = BezierGlobalColor.Orange400_10
    override val fillAccentOrangeHeavier = BezierGlobalColor.Orange400
    override val fillAccentOrangeHeavy = BezierGlobalColor.Orange400_20
    override val fillAccentOrangeTransparent = BezierGlobalColor.Orange400_0
    override val fillAccentPink = BezierGlobalColor.Pink400_10
    override val fillAccentPinkHeavier = BezierGlobalColor.Pink400
    override val fillAccentPinkHeavy = BezierGlobalColor.Pink400_20
    override val fillAccentPinkTransparent = BezierGlobalColor.Pink400_0
    override val fillAccentPurple = BezierGlobalColor.Purple400_10
    override val fillAccentPurpleHeavier = BezierGlobalColor.Purple400
    override val fillAccentPurpleHeavy = BezierGlobalColor.Purple400_20
    override val fillAccentPurpleTransparent = BezierGlobalColor.Purple400_0
    override val fillAccentRed = BezierGlobalColor.Red400_10
    override val fillAccentRedHeavier = BezierGlobalColor.Red400
    override val fillAccentRedHeavy = BezierGlobalColor.Red400_20
    override val fillAccentRedTransparent = BezierGlobalColor.Red400_0
    override val fillAccentTeal = BezierGlobalColor.Teal400_10
    override val fillAccentTealHeavier = BezierGlobalColor.Teal400
    override val fillAccentTealHeavy = BezierGlobalColor.Teal400_20
    override val fillAccentTealTransparent = BezierGlobalColor.Teal400_0
    override val fillAccentYellow = BezierGlobalColor.Yellow400_10
    override val fillAccentYellowHeavier = BezierGlobalColor.Yellow400
    override val fillAccentYellowHeavy = BezierGlobalColor.Yellow400_20
    override val fillAccentYellowTransparent = BezierGlobalColor.Yellow400_0
    override val fillAction = BezierGlobalColor.Blue400
    override val fillActionLight = BezierGlobalColor.Blue400_20
    override val fillActionLighter = BezierGlobalColor.Blue400_10
    override val fillActionTransparent = BezierGlobalColor.Blue400_0
    override val fillBright = BezierGlobalColor.Grey25
    override val fillCritical = BezierGlobalColor.Red400
    override val fillCriticalLight = BezierGlobalColor.Red400_20
    override val fillCriticalLighter = BezierGlobalColor.Red400_10
    override val fillCriticalTransparent = BezierGlobalColor.Red400_0
    override val fillGrey = BezierGlobalColor.Grey50
    override val fillGreyHeavier = BezierGlobalColor.Grey200
    override val fillGreyHeavy = BezierGlobalColor.Grey100
    override val fillHighlight = BezierGlobalColor.Cobalt400
    override val fillHighlightLight = BezierGlobalColor.Cobalt400_20
    override val fillHighlightLighter = BezierGlobalColor.Cobalt400_10
    override val fillHighlightTransparent = BezierGlobalColor.Cobalt400_0
    override val fillNeutralHeavier = BezierGlobalColor.Black40
    override val fillNeutralHeaviest = BezierGlobalColor.Black85
    override val fillNeutralHeavy = BezierGlobalColor.Black15
    override val fillNeutralLight = BezierGlobalColor.Black5
    override val fillNeutralLighter = BezierGlobalColor.Black3
    override val fillNeutralLightest = BezierGlobalColor.Black1
    override val fillNeutralTransparent = BezierGlobalColor.Black0
    override val fillSuccess = BezierGlobalColor.Green400
    override val fillSuccessLight = BezierGlobalColor.Green400_20
    override val fillSuccessLighter = BezierGlobalColor.Green400_10
    override val fillSuccessTransparent = BezierGlobalColor.Green400_0
    override val fillWarning = BezierGlobalColor.Orange400
    override val fillWarningLight = BezierGlobalColor.Orange400_20
    override val fillWarningLighter = BezierGlobalColor.Orange400_10
    override val fillWarningTransparent = BezierGlobalColor.Orange400_0
    override val gradientAccentGreen = BezierGlobalColor.Green400
    override val gradientAccentGreen_light = BezierGlobalColor.Green300
    override val iconAbsoluteBlack = BezierGlobalColor.Black100
    override val iconAbsoluteWhite = BezierGlobalColor.White100
    override val iconAccentBlue = BezierGlobalColor.Blue400
    override val iconAccentCobalt = BezierGlobalColor.Cobalt400
    override val iconAccentGreen = BezierGlobalColor.Green400
    override val iconAccentNavy = BezierGlobalColor.Navy400
    override val iconAccentOlive = BezierGlobalColor.Olive400
    override val iconAccentOrange = BezierGlobalColor.Orange400
    override val iconAccentPink = BezierGlobalColor.Pink400
    override val iconAccentPurple = BezierGlobalColor.Purple400
    override val iconAccentRed = BezierGlobalColor.Red400
    override val iconAccentTeal = BezierGlobalColor.Teal400
    override val iconAccentYellow = BezierGlobalColor.Yellow400
    override val iconAction = BezierGlobalColor.Blue400
    override val iconCritical = BezierGlobalColor.Red400
    override val iconHighlight = BezierGlobalColor.Cobalt400
    override val iconInverseHeavier = BezierGlobalColor.White80
    override val iconNeutral = BezierGlobalColor.Black40
    override val iconNeutralHeavier = BezierGlobalColor.Black85
    override val iconNeutralHeavy = BezierGlobalColor.Black60
    override val iconSuccess = BezierGlobalColor.Green400
    override val iconWarning = BezierGlobalColor.Orange400
    override val stateAction = BezierGlobalColor.Blue400
    override val stateActionLight = BezierGlobalColor.Blue400_30
    override val stateDefault = BezierGlobalColor.Black15
    override val stateWarning = BezierGlobalColor.Orange400
    override val stateWarningLight = BezierGlobalColor.Orange400_30
    override val surface = BezierGlobalColor.White100
    override val surfaceGlass = BezierGlobalColor.White90
    override val surfaceGlassHigh = BezierGlobalColor.White90
    override val surfaceGlassHigher = BezierGlobalColor.Grey100_90
    override val surfaceGlassHighest = BezierGlobalColor.Grey200_90
    override val surfaceHigh = BezierGlobalColor.White100
    override val surfaceHigher = BezierGlobalColor.White100
    override val surfaceHighest = BezierGlobalColor.White100
    override val surfaceLow = BezierGlobalColor.Grey50
    override val textAbsoluteBlack = BezierGlobalColor.Black100
    override val textAbsoluteWhite = BezierGlobalColor.White100
    override val textAccentBlue = BezierGlobalColor.Blue400
    override val textAccentCobalt = BezierGlobalColor.Cobalt400
    override val textAccentGreen = BezierGlobalColor.Green400
    override val textAccentNavy = BezierGlobalColor.Navy400
    override val textAccentOlive = BezierGlobalColor.Olive400
    override val textAccentOrange = BezierGlobalColor.Orange400
    override val textAccentPink = BezierGlobalColor.Pink400
    override val textAccentPurple = BezierGlobalColor.Purple400
    override val textAccentRed = BezierGlobalColor.Red400
    override val textAccentTeal = BezierGlobalColor.Teal400
    override val textAccentYellow = BezierGlobalColor.Yellow400
    override val textAction = BezierGlobalColor.Blue400
    override val textCritical = BezierGlobalColor.Red400
    override val textHighlight = BezierGlobalColor.Cobalt400
    override val textInverse = BezierGlobalColor.White80
    override val textNeutral = BezierGlobalColor.Black85
    override val textNeutralHeaviest = BezierGlobalColor.Black100
    override val textNeutralLight = BezierGlobalColor.Black60
    override val textNeutralLighter = BezierGlobalColor.Black40
    override val textSuccess = BezierGlobalColor.Green400
    override val textWarning = BezierGlobalColor.Orange400
}

internal class DarkColor : BezierSemanticColorV3 {
    override val borderAbsoluteWhite = BezierGlobalColor.White100
    override val borderDetach = BezierGlobalColor.Grey900
    override val borderDetachHigh = BezierGlobalColor.Grey850
    override val borderDetachHigher = BezierGlobalColor.Grey800
    override val borderDetachHighest = BezierGlobalColor.Grey750
    override val borderDetachLow = BezierGlobalColor.Grey950
    override val borderNeutral = BezierGlobalColor.White12
    override val borderNeutralHeavier = BezierGlobalColor.White40
    override val borderNeutralHeavy = BezierGlobalColor.White20
    override val dimAbsoluteBlack = BezierGlobalColor.Black40
    override val dimAbsoluteBlackHeavy = BezierGlobalColor.Black60
    override val dimAbsoluteWhite = BezierGlobalColor.White40
    override val dimAbsoluteWhiteHeavy = BezierGlobalColor.White80
    override val elevationBase = BezierGlobalColor.Black5
    override val elevationBase_inner = BezierGlobalColor.White12
    override val elevationLarge = BezierGlobalColor.Black22
    override val elevationMedium = BezierGlobalColor.Black15
    override val elevationSmall = BezierGlobalColor.Black8
    override val elevationXlarge = BezierGlobalColor.Black30
    override val fillAbsoluteBlack = BezierGlobalColor.Black100
    override val fillAbsoluteBlackLight = BezierGlobalColor.Black20
    override val fillAbsoluteBlackTransparent = BezierGlobalColor.Black0
    override val fillAbsoluteWhite = BezierGlobalColor.White100
    override val fillAbsoluteWhiteLight = BezierGlobalColor.White20
    override val fillAbsoluteWhiteTransparent = BezierGlobalColor.White0
    override val fillAccentBlue = BezierGlobalColor.Blue300_18
    override val fillAccentBlueHeavier = BezierGlobalColor.Blue300
    override val fillAccentBlueHeavy = BezierGlobalColor.Blue300_30
    override val fillAccentBlueTransparent = BezierGlobalColor.Blue300_0
    override val fillAccentCobalt = BezierGlobalColor.Cobalt300_18
    override val fillAccentCobaltHeavier = BezierGlobalColor.Cobalt300
    override val fillAccentCobaltHeavy = BezierGlobalColor.Cobalt300_30
    override val fillAccentCobaltTransparent = BezierGlobalColor.Cobalt300_0
    override val fillAccentGreen = BezierGlobalColor.Green300_18
    override val fillAccentGreenHeavier = BezierGlobalColor.Green300
    override val fillAccentGreenHeavy = BezierGlobalColor.Green300_30
    override val fillAccentGreenTransparent = BezierGlobalColor.Green300_0
    override val fillAccentNavy = BezierGlobalColor.Navy300_18
    override val fillAccentNavyHeavier = BezierGlobalColor.Navy300
    override val fillAccentNavyHeavy = BezierGlobalColor.Navy300_30
    override val fillAccentNavyTransparent = BezierGlobalColor.Navy300_0
    override val fillAccentOlive = BezierGlobalColor.Olive300_18
    override val fillAccentOliveHeavier = BezierGlobalColor.Olive300
    override val fillAccentOliveHeavy = BezierGlobalColor.Olive300_30
    override val fillAccentOliveTransparent = BezierGlobalColor.Olive300_0
    override val fillAccentOrange = BezierGlobalColor.Orange300_18
    override val fillAccentOrangeHeavier = BezierGlobalColor.Orange300
    override val fillAccentOrangeHeavy = BezierGlobalColor.Orange300_30
    override val fillAccentOrangeTransparent = BezierGlobalColor.Orange300_0
    override val fillAccentPink = BezierGlobalColor.Pink300_18
    override val fillAccentPinkHeavier = BezierGlobalColor.Pink300
    override val fillAccentPinkHeavy = BezierGlobalColor.Pink300_30
    override val fillAccentPinkTransparent = BezierGlobalColor.Pink300_0
    override val fillAccentPurple = BezierGlobalColor.Purple300_18
    override val fillAccentPurpleHeavier = BezierGlobalColor.Purple300
    override val fillAccentPurpleHeavy = BezierGlobalColor.Purple300_30
    override val fillAccentPurpleTransparent = BezierGlobalColor.Purple300_0
    override val fillAccentRed = BezierGlobalColor.Red300_18
    override val fillAccentRedHeavier = BezierGlobalColor.Red300
    override val fillAccentRedHeavy = BezierGlobalColor.Red300_30
    override val fillAccentRedTransparent = BezierGlobalColor.Red300_0
    override val fillAccentTeal = BezierGlobalColor.Teal300_18
    override val fillAccentTealHeavier = BezierGlobalColor.Teal300
    override val fillAccentTealHeavy = BezierGlobalColor.Teal300_30
    override val fillAccentTealTransparent = BezierGlobalColor.Teal300_0
    override val fillAccentYellow = BezierGlobalColor.Yellow300_18
    override val fillAccentYellowHeavier = BezierGlobalColor.Yellow300
    override val fillAccentYellowHeavy = BezierGlobalColor.Yellow300_30
    override val fillAccentYellowTransparent = BezierGlobalColor.Yellow300_0
    override val fillAction = BezierGlobalColor.Blue300
    override val fillActionLight = BezierGlobalColor.Blue300_30
    override val fillActionLighter = BezierGlobalColor.Blue300_18
    override val fillActionTransparent = BezierGlobalColor.Blue300_0
    override val fillBright = BezierGlobalColor.Grey650
    override val fillCritical = BezierGlobalColor.Red300
    override val fillCriticalLight = BezierGlobalColor.Red300_30
    override val fillCriticalLighter = BezierGlobalColor.Red300_18
    override val fillCriticalTransparent = BezierGlobalColor.Red300_0
    override val fillGrey = BezierGlobalColor.Grey850
    override val fillGreyHeavier = BezierGlobalColor.Grey750
    override val fillGreyHeavy = BezierGlobalColor.Grey800
    override val fillHighlight = BezierGlobalColor.Cobalt300
    override val fillHighlightLight = BezierGlobalColor.Cobalt300_30
    override val fillHighlightLighter = BezierGlobalColor.Cobalt300_18
    override val fillHighlightTransparent = BezierGlobalColor.Cobalt300_0
    override val fillNeutralHeavier = BezierGlobalColor.White40
    override val fillNeutralHeaviest = BezierGlobalColor.White90
    override val fillNeutralHeavy = BezierGlobalColor.White20
    override val fillNeutralLight = BezierGlobalColor.White8
    override val fillNeutralLighter = BezierGlobalColor.White5
    override val fillNeutralLightest = BezierGlobalColor.White3
    override val fillNeutralTransparent = BezierGlobalColor.White0
    override val fillSuccess = BezierGlobalColor.Green300
    override val fillSuccessLight = BezierGlobalColor.Green300_30
    override val fillSuccessLighter = BezierGlobalColor.Green300_18
    override val fillSuccessTransparent = BezierGlobalColor.Green300_0
    override val fillWarning = BezierGlobalColor.Orange300
    override val fillWarningLight = BezierGlobalColor.Orange300_30
    override val fillWarningLighter = BezierGlobalColor.Orange300_18
    override val fillWarningTransparent = BezierGlobalColor.Orange300_0
    override val gradientAccentGreen = BezierGlobalColor.Green400
    override val gradientAccentGreen_light = BezierGlobalColor.Green300
    override val iconAbsoluteBlack = BezierGlobalColor.Black100
    override val iconAbsoluteWhite = BezierGlobalColor.White100
    override val iconAccentBlue = BezierGlobalColor.Blue300
    override val iconAccentCobalt = BezierGlobalColor.Cobalt300
    override val iconAccentGreen = BezierGlobalColor.Green300
    override val iconAccentNavy = BezierGlobalColor.Navy300
    override val iconAccentOlive = BezierGlobalColor.Olive300
    override val iconAccentOrange = BezierGlobalColor.Orange300
    override val iconAccentPink = BezierGlobalColor.Pink300
    override val iconAccentPurple = BezierGlobalColor.Purple300
    override val iconAccentRed = BezierGlobalColor.Red300
    override val iconAccentTeal = BezierGlobalColor.Teal300
    override val iconAccentYellow = BezierGlobalColor.Yellow300
    override val iconAction = BezierGlobalColor.Blue300
    override val iconCritical = BezierGlobalColor.Red300
    override val iconHighlight = BezierGlobalColor.Cobalt300
    override val iconInverseHeavier = BezierGlobalColor.Black85
    override val iconNeutral = BezierGlobalColor.White40
    override val iconNeutralHeavier = BezierGlobalColor.White80
    override val iconNeutralHeavy = BezierGlobalColor.White60
    override val iconSuccess = BezierGlobalColor.Green300
    override val iconWarning = BezierGlobalColor.Orange300
    override val stateAction = BezierGlobalColor.Blue300
    override val stateActionLight = BezierGlobalColor.Blue300_45
    override val stateDefault = BezierGlobalColor.White20
    override val stateWarning = BezierGlobalColor.Orange300
    override val stateWarningLight = BezierGlobalColor.Orange300
    override val surface = BezierGlobalColor.Grey900
    override val surfaceGlass = BezierGlobalColor.Grey800_90
    override val surfaceGlassHigh = BezierGlobalColor.Grey850_90
    override val surfaceGlassHigher = BezierGlobalColor.Grey800_90
    override val surfaceGlassHighest = BezierGlobalColor.Grey750_90
    override val surfaceHigh = BezierGlobalColor.Grey850
    override val surfaceHigher = BezierGlobalColor.Grey800
    override val surfaceHighest = BezierGlobalColor.Grey750
    override val surfaceLow = BezierGlobalColor.Grey950
    override val textAbsoluteBlack = BezierGlobalColor.Black100
    override val textAbsoluteWhite = BezierGlobalColor.White100
    override val textAccentBlue = BezierGlobalColor.Blue300
    override val textAccentCobalt = BezierGlobalColor.Cobalt300
    override val textAccentGreen = BezierGlobalColor.Green300
    override val textAccentNavy = BezierGlobalColor.Navy300
    override val textAccentOlive = BezierGlobalColor.Olive300
    override val textAccentOrange = BezierGlobalColor.Orange300
    override val textAccentPink = BezierGlobalColor.Pink300
    override val textAccentPurple = BezierGlobalColor.Purple300
    override val textAccentRed = BezierGlobalColor.Red300
    override val textAccentTeal = BezierGlobalColor.Teal300
    override val textAccentYellow = BezierGlobalColor.Yellow300
    override val textAction = BezierGlobalColor.Blue300
    override val textCritical = BezierGlobalColor.Red300
    override val textHighlight = BezierGlobalColor.Cobalt300
    override val textInverse = BezierGlobalColor.Black85
    override val textNeutral = BezierGlobalColor.White80
    override val textNeutralHeaviest = BezierGlobalColor.White100
    override val textNeutralLight = BezierGlobalColor.White60
    override val textNeutralLighter = BezierGlobalColor.White40
    override val textSuccess = BezierGlobalColor.Green300
    override val textWarning = BezierGlobalColor.Orange300
}
