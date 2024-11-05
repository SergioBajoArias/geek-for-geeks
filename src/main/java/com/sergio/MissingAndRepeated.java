package com.sergio;

import java.util.ArrayList;

public class MissingAndRepeated {
    ArrayList<Integer> findTwoElement(int[] arr) {
        int repeated = 0;
        long expectedSum = (long) (arr.length + 1) * arr.length / 2;
        long currentSum = 0;

        int[] aux = new int[arr.length];
        for (int number : arr) {
            if (aux[number - 1] != 0) {
                repeated = number;
            } else {
                aux[number - 1] = number;
                currentSum += number;
            }
        }

        int missing = (int) (expectedSum - currentSum);
        ArrayList<Integer> results = new ArrayList<>();
        results.add(repeated);
        results.add(missing);
        return results;
    }
}
