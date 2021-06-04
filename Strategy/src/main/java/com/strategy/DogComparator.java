package com.strategy;

import java.util.Comparator;

public class DogComparator implements Comparator<Dog> {

    @Override
    public int compare(Dog dog1, Dog dog2) {
        if (dog1.food > dog2.food) {
            return 1;
        } else if (dog1.food < dog2.food) {
            return -1;
        } else {
            return 0;
        }
    }
}
