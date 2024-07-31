package io.channel.bezier.compose.component.checkbox.properties

enum class BezierCheckboxStatus {
    False,
    True,
    Indeterminate;

    internal fun switch(): BezierCheckboxStatus {
        return when (this) {
            False -> True
            True -> False
            Indeterminate -> True
        }
    }
}
