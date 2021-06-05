package com.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        int[] arr = {3, 4, 1, 5, 2, 8, 9};
        Cat[] cats = new Cat[]{new Cat(3, 1), new Cat(5, 5), new Cat(1, 3)};
//        Dog[] dogs = new Dog[]{new Dog(3),new Dog(5),new Dog(1)};
        Sorter<Cat> sorter = new Sorter<>();
        sorter.sort(cats,((c1, c2) -> {
            if (c1.height > c2.height) {
                return 1;
            } else if (c1.height < c2.height) {
                return -1;
            } else {
                return 0;
            }
        }));
        System.out.println(Arrays.toString(cats));

    }
}
