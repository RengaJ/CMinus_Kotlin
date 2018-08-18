package com.miterfish.cminus.scanner

import com.miterfish.cminus.token.Token
import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.util.*

class Scanner {

    private val fileContents = ArrayList<String?>()
    private var lineNumber   : Int = 0
    private var index        : Int = 0

    private val EOF_CHAR     : Char = '\\'

    fun scanForTokens(file : File?) : ArrayDeque<Token> {
        if (file == null) {
            throw IllegalArgumentException("Invalid file provided - null File object")
        }
        val tokenList = ArrayDeque<Token>()

        readFile(file)

        return tokenList
    }

    private fun readFile(file : File) {
        BufferedReader(FileReader(file)).apply {
            fileContents.clear()

            var line: String? = this.readLine()

            while (line != null) {
                fileContents.add(String.format("%s ", line))
                line = this.readLine()
            }
        }

        fileContents.add(null)
        lineNumber = 0
        index      = 0
    }

    private fun getCharacter() : Char {
        return fileContents[lineNumber]?.let {
            it[index]
        } ?: EOF_CHAR
    }

    private fun consumeCharacter() {
        fileContents[lineNumber]?.let {
            if ((++index) == it.length) {
                index = 0
                ++lineNumber
            }
        }
    }

    private fun processSimpleToken(character : Char) {
        when (character) {
            '+'  -> { }
            '-'  -> { }
            '*'  -> { }
            '/'  -> { }
            '('  -> { }
            ')'  -> { }
            '['  -> { }
            ']'  -> { }
            '{'  -> { }
            '}'  -> { }
            '.'  -> { }
            ';'  -> { }
            else -> { }
        }
    }
}