package com.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {3, 4, 1, 5, 2, 8, 9};
//        Cat[] cats = new Cat[]{new Cat(3, 3), new Cat(5, 5), new Cat(1, 1)};
        Dog[] dogs = new Dog[]{new Dog(3),new Dog(5),new Dog(1)};
        Sorter sorter = new Sorter();
        sorter.sort(dogs);
        System.out.println(Arrays.toString(dogs));

    }
}
