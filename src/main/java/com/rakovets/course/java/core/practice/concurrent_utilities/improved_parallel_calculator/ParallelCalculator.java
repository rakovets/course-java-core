package com.rakovets.course.java.core.practice.concurrent_utilities.improved_parallel_calculator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParallelCalculator {
    private static final Logger logger = Logger.getLogger(ParallelCalculator.class.getCanonicalName());

    public Map<String, Integer> getListArraysAndSumOfArraysDigit(List<int[]> listOfArray) {
        Map<String, Integer> map = new HashMap<>();
        for (int[] arr : listOfArray) {
            map.put(Arrays.toString(arr), Arrays.stream(arr).sum());
        }
        return map;
    }

    public void getMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            logger.log(Level.INFO, entry.getKey() + " " + entry.getValue());
        }
    }
}
