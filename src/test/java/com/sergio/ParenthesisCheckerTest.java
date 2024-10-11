package com.sergio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParenthesisCheckerTest {

    @Test
    void isPar() {
        assertEquals(true, ParenthesisChecker.isPar("()"));
        assertEquals(false, ParenthesisChecker.isPar("()("));
        assertEquals(true, ParenthesisChecker.isPar("{([])}"));
        assertEquals(false, ParenthesisChecker.isPar("([]"));
        assertEquals(false, ParenthesisChecker.isPar("([)]"));
        assertEquals(false, ParenthesisChecker.isPar(")]"));
    }
}