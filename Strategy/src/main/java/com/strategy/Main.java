package com.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 5, 2, 8, 9};
        Sorter sorter = new Sorter();
        sorter.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
