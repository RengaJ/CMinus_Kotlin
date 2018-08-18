package com.miterfish.cminus.token

enum class TokenType {
    BOOKKEEPING_END_OF_FILE,   // End of File   Indicator
    BOOKKEEPING_ERROR,         // Scanner Error Indicator
    // Reserved Word Enumeration Values
    RESERVED_ELSE,             // else   keyword
    RESERVED_IF,               // if     keyword
    RESERVED_RETURN,           // return keyword
    RESERVED_VOID,             // void   keyword
    RESERVED_WHILE,            // while  keyword
    // Special Symbol Enumeration Values
    SPECIAL_ASSIGN,            // =
    SPECIAL_COMMA,             // ,
    SPECIAL_DIVIDE,            // /
    SPECIAL_EQUAL,             // ==
    SPECIAL_GREATER_THAN,      // >
    SPECIAL_GTE,               // >=
    SPECIAL_LEFT_BRACE,        // {
    SPECIAL_LEFT_BRACKET,      // [
    SPECIAL_LEFT_PAREN,        // (
    SPECIAL_LESS_THAN,         // <
    SPECIAL_LTE,               // <=
    SPECIAL_MINUS,             // -
    SPECIAL_NOT_EQUAL,         // !=
    SPECIAL_PLUS,              // +
    SPECIAL_RIGHT_BRACE,       // }
    SPECIAL_RIGHT_BRACKET,     // ]
    SPECIAL_RIGHT_PAREN,       // )
    SPECIAL_SEMICOLON,         // ;
    SPECIAL_TIMES,             // *
    // Variable Enumeration Values
    VARIABLE_IDENTIFIER,       // identifier
    VARIABLE_NUMBER            // numeric value
}