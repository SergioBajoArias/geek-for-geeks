package com.sergio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MissingAndRepeatedTest {
    MissingAndRepeated missingAndRepeated = new MissingAndRepeated();

    @Test
    void findTwoElement() {
        Assertions.assertEquals(Arrays.asList(2,1), missingAndRepeated.findTwoElement(new int[] {2,2}));
        Assertions.assertEquals(Arrays.asList(3,2), missingAndRepeated.findTwoElement(new int[] {1,3,3}));
        Assertions.assertEquals(Arrays.asList(1,5), missingAndRepeated.findTwoElement(new int[] {4, 3, 6, 2, 1, 1}));
    }
}
