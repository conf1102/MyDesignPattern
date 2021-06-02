package com.strategy;

public class Sorter {
    public void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            switchPosition(arr, i, minIndex);
        }
    }

    public void switchPosition(int[] arr, int pos1, int pos2) {
        int pos1Value = arr[pos1];
        int pos2Value = arr[pos2];
        arr[pos1] = pos2Value;
        arr[pos2] = pos1Value;
    }
}
