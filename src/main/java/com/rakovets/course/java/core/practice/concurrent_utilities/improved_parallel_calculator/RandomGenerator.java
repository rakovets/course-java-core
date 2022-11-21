package com.rakovets.course.java.core.practice.concurrent_utilities.improved_parallel_calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGenerator {
    Random random = new Random();

    public List<int[]> getListRandomLengthArraysConsistingOfRandomIntNumbers(
            int amountArrays, int minLengthArray, int maxLengthArray, int minNumberInArray, int maxNumberInArray) {
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < amountArrays; i++) {
            list.add(random.ints(
                    random.ints(1, minLengthArray, maxLengthArray + 1).sum(),
                    minNumberInArray, maxNumberInArray + 1).toArray());
        }
        return list;
    }
}
