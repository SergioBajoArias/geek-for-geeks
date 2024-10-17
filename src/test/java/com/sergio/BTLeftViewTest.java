package com.sergio;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class BTLeftViewTest {

    BTLeftView btLeftView = new BTLeftView();

    @Test
    void isBST() {
        assertEquals(List.of(1, 2, 4, 8), btLeftView.leftView(btLeftView.buildTree("1 2 3 4 5 6 7 N 8")));
    }
}