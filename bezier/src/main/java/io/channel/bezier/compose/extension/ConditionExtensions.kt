package io.channel.bezier.compose.extension

internal fun <E> Boolean?.ifTrue(trueValue: E, elseValue: E): E {
    return if (this == true) trueValue else elseValue
}

internal fun <E> E?.orElse(elseValue: E): E {
    return this ?: elseValue
}

internal inline fun <E> E?.orElse(action: () -> E): E {
    if (this == null) {
        return action.invoke()
    }
    return this
}
