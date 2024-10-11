package com.sergio;

/**
 * <a href="https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1">Link to problem</a>
 */
public class Sort012 {
    public void sort012(int[] numbers) {
        int[] copy = new int[numbers.length];
        int zeroCounter = 0;
        int oneCounter = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 0){
                zeroCounter++;
            } else if(numbers[i] == 1){
                oneCounter++;
            }
            copy[i] = numbers[i];
        }

        int zeroIndex = 0;
        int oneIndex = zeroIndex + zeroCounter;
        int twoIndex = oneIndex + oneCounter;
        for(int number : copy) {
            if(number == 0){
                numbers[zeroIndex++] = 0;
            } else if(number == 1){
                numbers[oneIndex++] = 1;
            } else if(number == 2){
                numbers[twoIndex++] = 2;
            }
        }
    }
}
