package com.sergio;

/**
 * <a href="https://www.geeksforgeeks.org/problems/second-largest3735/1">Link to problem</a>
 */
public class SecondLargest {

    private static final int NOT_FOUND = -1;

    public int getSecondLargest(int[] numbers) {
        if(numbers.length == 0){
            return NOT_FOUND;
        }
        int largest = numbers[0];
        int secondLargest = numbers[0];
        for (int number : numbers){
            if(number > largest){
                secondLargest = largest;
                largest = number;
            } else if(number < largest && (number > secondLargest || secondLargest == largest)){
                secondLargest =number;
            }
        }
        if(secondLargest == largest){
            return NOT_FOUND;
        } else {
            return secondLargest;
        }
    }
}
