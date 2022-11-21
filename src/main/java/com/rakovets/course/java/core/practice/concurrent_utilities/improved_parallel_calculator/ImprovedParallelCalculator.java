package com.rakovets.course.java.core.practice.concurrent_utilities.improved_parallel_calculator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImprovedParallelCalculator {
    public Map<String, Integer> getMapArraysAndSumArrays(List<int[]> list) {
        Map<String  , Integer> map = new HashMap<>();
        for (int[] array : list) {
            map.put(Arrays.toString(array), Arrays.stream(array).sum());
        }
        return map;
    }
}
