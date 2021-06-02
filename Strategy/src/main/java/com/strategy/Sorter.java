package com.strategy;

public class Sorter {
    public void sort(Comparable[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j].compareTo(arr[minIndex]) == -1){
                    minIndex = j;
                }
            }
            switchPosition(arr, i, minIndex);
        }
    }

    public void switchPosition(Comparable[] arr, int pos1, int pos2) {
        Comparable temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
}
