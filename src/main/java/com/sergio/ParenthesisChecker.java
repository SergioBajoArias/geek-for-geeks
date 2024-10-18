package com.sergio;

import java.util.Stack;

/**
 * <a href="https://www.geeksforgeeks.org/problems/parenthesis-checker2744/1">Link to problem</a>
 */
public class ParenthesisChecker {
    static final char OPEN_PARENTHESIS = '(';
    static final char CLOSE_PARENTHESIS = ')';
    static final char OPEN_BRACKET = '{';
    static final char CLOSE_BRACKET = '}';
    static final char OPEN_SQUARE_BRACKET = '[';
    static final char CLOSE_SQUARE_BRACKET = ']';

    static boolean isPar(String x) {
        Stack<Character> expectedClosingCharacters = new Stack<>();
        for (char c : x.toCharArray()) {
            if (c == OPEN_PARENTHESIS) {
                expectedClosingCharacters.push(CLOSE_PARENTHESIS);
            } else if (c == OPEN_BRACKET) {
                expectedClosingCharacters.push(CLOSE_BRACKET);
            } else if (c == OPEN_SQUARE_BRACKET) {
                expectedClosingCharacters.push(CLOSE_SQUARE_BRACKET);
            } else if (expectedClosingCharacters.isEmpty()) {
                return false;
            } else {
                char expectedClosingCharacter = expectedClosingCharacters.pop();
                if (c != expectedClosingCharacter) {
                    return false;
                }
            }
        }
        return expectedClosingCharacters.isEmpty();
    }
}
