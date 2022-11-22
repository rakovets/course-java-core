package com.rakovets.course.java.core.practice.concurrent_utilities.improved_parallel_calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ArrayListCreator {
    public List<int[]> createRandomIntArrayList (int minValueInArray, int maxValueInArray, int minSizeOfArray, int maxSizeOfArray, int numberOfArrayInList) throws NegativeArraySizeException {
        List<int[]> intArrayList = new ArrayList<>();
        IntStream.rangeClosed(1, numberOfArrayInList)
                .forEach(x -> {
                    int sizeOfArray = (int) (Math.random() * maxSizeOfArray + minSizeOfArray);
                    int[] intArray = new int[sizeOfArray];
                    for (int i = 0; i < sizeOfArray; i ++) {
                        intArray[i] = (int) (Math.random() * maxValueInArray + minValueInArray);
                    }
                    intArrayList.add(intArray);
                });
        return intArrayList;
    }
}
