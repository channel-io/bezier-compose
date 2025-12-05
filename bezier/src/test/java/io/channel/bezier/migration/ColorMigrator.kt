package io.channel.bezier.migration

import org.junit.Test
import java.io.File
import java.nio.file.Files

class ColorMigrator {

    /**
     * Key: Old Color Name (kebab-case from CSV)
     * Value: New Color Name (kebab-case from CSV, first item only)
     */
    private val rawMapping = mapOf(
        "txt-black-darker" to "text-neutral-light",
        "bgtxt-navy-normal" to "text-accent-navy",
        "bgtxt-purple-normal" to "text-accent-purple",
        "bgtxt-pink-normal" to "text-accent-pink",
        "txt-black-dark" to "text-neutral-lighter",
        "txt-black-darkest" to "text-neutral",
        "bgtxt-yellow-normal" to "text-accent-yellow",
        "bgtxt-teal-normal" to "text-accent-teal",
        "bdr-black-light" to "border-neutral",
        "bg-grey-lighter" to "fill-neutral-lighter",
        "bg-grey-lightest" to "fill-neutral-lightest",
        "bg-black-lighter" to "fill-neutral-light",
        "bg-black-dark" to "fill-neutral-heavy",
        "bgtxt-blue-normal" to "text-accent-blue",
        "bg-black-darker" to "fill-neutral-heavier",
        "bgtxt-blue-lightest" to "fill-accent-blue-lightest",
        "bgtxt-green-lightest" to "fill-accent-green-lightest",
        "bgtxt-cobalt-normal" to "text-accent-cobalt",
        "bgtxt-cobalt-lighter" to "fill-accent-cobalt-lighter",
        "bgtxt-cobalt-lightest" to "fill-accent-cobalt-lightest",
        "bgtxt-orange-normal" to "text-accent-orange",
        "bgtxt-orange-lighter" to "fill-accent-orange-lighter",
        "bgtxt-red-normal" to "text-accent-red",
        "bgtxt-orange-lightest" to "fill-accent-orange-lightest",
        "bgtxt-red-lighter" to "fill-accent-red-lighter",
        "bgtxt-red-lightest" to "fill-accent-red-lightest",
        "bgtxt-absolute-white-dark" to "text-absolute-white",
        "bg-white-normal" to "surface",
        "bg-black-lightest" to "surface-low",
        "bg-white-low" to "surface-high",
        "bg-white-high" to "surface-highest",
        "bg-lounge" to "surface-glass",
        "bg-navi" to "surface-glass-higher",
        "bg-header-float" to "surface-glass-high",
        "bg-gnb" to "surface-glass-highest",
        "bgtxt-green-normal" to "text-accent-green",
        "bgtxt-olive-normal" to "text-accent-olive",
        "bdr-black-dark" to "border-neutral",
        "bdr-black-lightest" to "border-neutral",
        "bdr-grey-light" to "border-neutral",
        "bdr-white" to "border-detach-high",
        "bg-black-darkest" to "fill-neutral-heavier",
        "bg-black-light" to "fill-neutral-light",
        "bg-grey-dark" to "icon-neutral",
        "bg-grey-darkest" to "fill-neutral-heaviest",
        "bg-header" to "surface-higher",
        "bg-white-dim-dark" to "dim-absolute-white-heavy",
        "bg-white-dim-light" to "dim-absolute-white",
        "bgtxt-absolute-black-dark" to "icon-absolute-black-heaviest",
        "bgtxt-absolute-black-light" to "fill-absolute-black-light",
        "bgtxt-absolute-black-lighter" to "dim-absolute-black",
        "bgtxt-absolute-black-lightest" to "dim-absolute-black",
        "bgtxt-absolute-black-normal" to "text-absolute-black",
        "bgtxt-absolute-white-light" to "icon-neutral",
        "bgtxt-absolute-white-lighter" to "fill-neutral-lighter",
        "bgtxt-absolute-white-lightest" to "border-neutral",
        "bgtxt-absolute-white-normal" to "fill-absolute-white",
        "bgtxt-blue-light" to "border-action-light",
        "bgtxt-blue-lighter" to "fill-accent-blue-lighter",
        "bgtxt-green-lighter" to "fill-accent-green-lighter",
        "bgtxt-navy-lighter" to "fill-accent-navy-lighter",
        "bgtxt-navy-lightest" to "fill-accent-navy-lightest",
        "bgtxt-olive-lighter" to "fill-accent-olive-lighter",
        "bgtxt-olive-lightest" to "fill-accent-olive-lightest",
        "bgtxt-orange-light" to "border-warning-light",
        "bgtxt-pink-lighter" to "fill-accent-pink-lighter",
        "bgtxt-pink-lightest" to "fill-accent-pink-lightest",
        "bgtxt-purple-lighter" to "fill-accent-purple-lighter",
        "bgtxt-purple-lightest" to "fill-accent-purple-lightest",
        "bgtxt-teal-lighter" to "fill-accent-teal-lighter",
        "bgtxt-teal-lightest" to "fill-accent-teal-lightest",
        "bgtxt-yellow-lighter" to "fill-accent-yellow-lighter",
        "bgtxt-yellow-lightest" to "fill-accent-yellow-lightest",
        "shdw-base" to "shadow-base",
        "shdw-base-inner" to "shadow-base-inner",
        "shdw-large" to "shadow-large",
        "shdw-medium" to "shadow-medium",
        "shdw-small" to "shadow-small",
        "shdw-xlarge" to "shadow-xlarge",
        "txt-black-pure" to "text-neutral-heaviest",
        "txt-white-normal" to "text-absolute-white",
        "bg-grey-dim-lightest" to "surface-low",
        "bg-grey-light" to "fill-neutral-light"
    )

    // For XML and R class: snake_case
    private val snakeCaseMapping by lazy {
        rawMapping.mapKeys { kebabToSnake(it.key) }
            .mapValues { kebabToSnake(it.value) }
    }

    // For BezierTheme: lowerCamelCase
    private val camelCaseMapping by lazy {
        rawMapping.mapKeys { kebabToCamel(it.key) }
            .mapValues { kebabToCamel(it.value) }
    }

    fun migrateFile(filePath: String) {
        File(filePath).walk().forEach { file ->
            if (file.isFile) {
                if (!file.exists()) {
                    println("File not found: $filePath")
                    return
                }

                val originalContent = file.readText()
                var newContent = originalContent

                // 1-1. XML 패턴 변환 (@color/blabla)
                newContent = replaceXmlPattern(newContent)

                // 1-2. R class 패턴 변환 (R.color.blabla)
                newContent = replaceRClassPattern(newContent)

                // 1-3. BezierTheme 패턴 변환 (BezierTheme.colors.blabla)
                newContent = replaceBezierThemePattern(newContent)

                // 변경사항이 있다면 파일에 씁니다.
                if (originalContent != newContent) {
                    file.writeText(newContent)
                    println("Migrated: $filePath")
                } else {
                    println("No changes in: $filePath")
                }
            }
        }
    }

    private fun replaceXmlPattern(content: String): String {
        // Regex: @color/([a-zA-Z0-9_]+)
        val regex = Regex("@color/([a-zA-Z0-9_]+)")
        
        return regex.replace(content) { matchResult ->
            val oldColorName = matchResult.groupValues[1]
            val newColorName = snakeCaseMapping[oldColorName]
            
            if (newColorName != null) {
                "@color/$newColorName"
            } else {
                matchResult.value
            }
        }
    }

    private fun replaceRClassPattern(content: String): String {
        // Regex: R.color.([a-zA-Z0-9_]+)
        val regex = Regex("R\\.color\\.([a-zA-Z0-9_]+)")
        
        return regex.replace(content) { matchResult ->
            val oldColorName = matchResult.groupValues[1]
            val newColorName = snakeCaseMapping[oldColorName]
            
            if (newColorName != null) {
                "R.color.$newColorName"
            } else {
                matchResult.value
            }
        }
    }

    private fun replaceBezierThemePattern(content: String): String {
        // Regex: BezierTheme.colors.([a-zA-Z0-9_]+)
        val regex = Regex("BezierTheme\\.colors\\.([a-zA-Z0-9_]+)")
        
        return regex.replace(content) { matchResult ->
            val oldColorName = matchResult.groupValues[1]
            val newColorName = camelCaseMapping[oldColorName]
            
            if (newColorName != null) {
                "BezierTheme.colorsV3.$newColorName"
            } else {
                matchResult.value
            }
        }
    }

    // Helper: kebab-case to snake_case (e.g. "txt-black-dark" -> "txt_black_dark")
    private fun kebabToSnake(s: String): String {
        return s.replace("-", "_")
    }

    // Helper: kebab-case to lowerCamelCase (e.g. "txt-black-dark" -> "txtBlackDark")
    private fun kebabToCamel(s: String): String {
        val parts = s.split("-")
        return parts.mapIndexed { index, part ->
            if (index == 0) part.lowercase()
            else part.replaceFirstChar { it.uppercase() }
        }.joinToString("")
    }

    @Test
    fun testTest() {
        migrateFile("/Users/philip/Documents/GitHub/bezier-compose/bezier/src/main/java")
    }
}
