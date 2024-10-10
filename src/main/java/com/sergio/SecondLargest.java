package com.sergio;

public class SecondLargest {

    public int getSecondLargest(int[] arr) {
        if(arr.length == 0){
            return -1;
        }
        int largest = arr[0];
        int secondLargest = arr[0];
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] < largest && (arr[i] > secondLargest || secondLargest == largest)){
                secondLargest = arr[i];
            }
        }
        if(secondLargest == largest){
            return -1;
        } else {
            return secondLargest;
        }
    }
}
