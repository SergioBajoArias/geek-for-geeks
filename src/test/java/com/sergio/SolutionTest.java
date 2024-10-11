package com.sergio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    BSTChecker bstChecker = new BSTChecker();

    @Test
    void isBST() {
        Node tree = bstChecker.buildTree("1 2 3 N N 4 6 N 5 N N 7 N");
        assertEquals(false, bstChecker.isBST(tree));
    }
}