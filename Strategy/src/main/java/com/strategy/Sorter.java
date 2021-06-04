package com.strategy;

import java.util.Comparator;

public class Sorter<T> {
    public void sort(T[] arr, Comparator<T> comparator) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(comparator.compare(arr[j],arr[minIndex]) == -1){
                    minIndex = j;
                }
            }
            switchPosition(arr, i, minIndex);
        }
    }

    public void switchPosition(T[] arr, int pos1, int pos2) {
        T temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
}
