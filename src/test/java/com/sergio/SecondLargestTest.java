package com.sergio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SecondLargestTest {

    private final SecondLargest secondLargest = new SecondLargest();

    @Test
    void getSecondLargest() {
        assertEquals(2, secondLargest.getSecondLargest(new int[] {1,2,3}));
        assertEquals(-1, secondLargest.getSecondLargest(new int[] {}));
        assertEquals(34, secondLargest.getSecondLargest(new int[] {12, 35, 1, 10, 34, 1}));
        assertEquals(-1, secondLargest.getSecondLargest(new int[] {10,10}));
        assertEquals(5, secondLargest.getSecondLargest(new int[] {10,5,10}));
    }
}