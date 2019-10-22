package com.gitlab.kordlib.kordx.commands.kord

import com.gitlab.kordlib.kordx.commands.command.Command
import info.debatty.java.stringsimilarity.Levenshtein

interface CommandSuggester {
    suspend fun suggest(command: String, commands: Map<String, Command<*>>): Command<*>?

    companion object : CommandSuggester {
        private val levenshtein = Levenshtein()

        override suspend fun suggest(command: String, commands: Map<String, Command<*>>): Command<*>? {
            return commands.values.toList().minBy { levenshtein.distance(command, it.name) }
        }
    }
}
