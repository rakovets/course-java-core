package com.rakovets.course.java.core.practice.concurrent_utilities.calculator;

import java.util.*;

public class ImprovedParallelCalculator {
    public static Map<Integer[], Long> getArraysAndArraysElementSum(List<Integer[]> arraysList) {
        Map<Integer[], Long> map = new HashMap<>();
        long sum = 0;
        for (Integer[] integers : arraysList) {
            for (int element : integers) {
                sum += element;
            }
            map.put(integers, sum);
            sum = 0;
        }
        return map;
    }
}
