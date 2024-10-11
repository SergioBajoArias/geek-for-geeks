package com.sergio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Sort012Test {

    private final Sort012 sort012 = new Sort012();

    @Test
    void sort012() {
        verify(new int[]{0, 0, 1, 2, 2}, new int[]{0, 2, 1, 2, 0});
        verify(new int[]{0, 0, 1}, new int[]{0, 1, 0});
    }

    private void verify(int [] expectedNumbers, int[] numbers) {
        sort012.sort012(numbers);
        assertArrayEquals(expectedNumbers, numbers);
    }
}