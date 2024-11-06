package com.sergio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NthFibonacciTest {

    private final NthFibonacci nthFibonacci = new NthFibonacci();

    @Test
    void nthFibonacci() {
        Assertions.assertEquals(0, nthFibonacci.nthFibonacci(0) );
        Assertions.assertEquals(1, nthFibonacci.nthFibonacci(1) );
        Assertions.assertEquals(5, nthFibonacci.nthFibonacci(5) );
        Assertions.assertEquals(832040, nthFibonacci.nthFibonacci(30) );
        Assertions.assertEquals(1134903170, nthFibonacci.nthFibonacci(45) );
    }
}