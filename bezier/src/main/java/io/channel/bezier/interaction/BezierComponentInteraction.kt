package io.channel.bezier.interaction

import androidx.compose.ui.semantics.SemanticsPropertyKey
import androidx.compose.ui.semantics.SemanticsPropertyReceiver

object BezierComponentInteraction {

    @Volatile
    var onComponentClick: ((component: String, label: String?) -> Unit)? = null

    internal fun notify(component: String, label: String?) {
        onComponentClick?.invoke(component, label)
    }
}

val BezierComponentKey = SemanticsPropertyKey<String>(
        name = "BezierComponent",
        mergePolicy = { parent, child -> parent ?: child },
)

var SemanticsPropertyReceiver.bezierComponent by BezierComponentKey
