package io.channel.bezier.interaction

import androidx.compose.ui.semantics.SemanticsPropertyKey
import androidx.compose.ui.semantics.SemanticsPropertyReceiver

object BezierComponentInteraction {

    @Volatile
    var onComponentClick: ((component: String, version: String?, label: String?) -> Unit)? = null

    internal fun notify(component: String, version: String?, label: String?) {
        runCatching { onComponentClick?.invoke(component, version, label) }
    }
}

val InteractionComponentKey = SemanticsPropertyKey<String>(
        name = "InteractionComponent",
        mergePolicy = { parent, child -> parent ?: child },
)

var SemanticsPropertyReceiver.interactionComponent by InteractionComponentKey
