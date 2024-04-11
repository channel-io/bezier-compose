package io.channel.bezier.compose.color_v2

import androidx.compose.ui.graphics.Color

internal object GlobalTokens {
    internal val Blue200: BezierColor = GlobalToken(Color(0xFF2323AA))
    internal val Blue400: BezierColor = GlobalToken(Color(0xFF232388))
    internal val Red200: BezierColor = GlobalToken(Color(0xFFFF23AA))
    internal val Red400: BezierColor = GlobalToken(Color(0xFFFF2388))
}

private class GlobalToken(override val color: Color) : BezierColor
