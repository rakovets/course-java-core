package com.rakovets.course.java.core.practice.concurrent_utilities.parallel_calculator;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayCalculator {

    public static Map<Integer[], Integer> oneThreadCalculation(List<Integer[]> listOfArrays) {
        Map<Integer[], Integer> sumOfNumbersInArray = new HashMap<>();
        listOfArrays
                .forEach(e -> {
                    int sumOfNumbers = 0;
                    for (Integer element : e) {
                        sumOfNumbers += element;
                    }
                    sumOfNumbersInArray.put(e,sumOfNumbers);
                });
        return sumOfNumbersInArray;
    }

    public static Map<Integer[], Integer> oneThreadCalculation(List<Integer[]> listOfArrays, int numberOfThreads) {
        Map<Integer[], Integer> sumOfNumbersInArray = new HashMap<>();
        listOfArrays
                .forEach(e -> {
                    int sumOfNumbers = 0;
                    for (Integer element : e) {
                        sumOfNumbers += element;
                    }
                    sumOfNumbersInArray.put(e,sumOfNumbers);
                });
        return sumOfNumbersInArray;
    }



}
