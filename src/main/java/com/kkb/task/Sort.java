package com.kkb.task;

public class Sort {
    public void sort(int[] arr){
        int length = arr.length;
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = 1; j < length -1 -i; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
