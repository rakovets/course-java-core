package com.rakovets.course.java.core.practice.concurrent_utilities.parallel_calculator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class Calculator {
    public static final Logger logger = Logger.getLogger(Calculator.class.getName());

    public List<PairSumArray> getListOfSumsAndArrays(List<int[]> arrays) {
        List<PairSumArray> pairs = new ArrayList<>();
        logger.info("Calculating in one thread started. Time: " + LocalDateTime.now());
        for (int[] ints : arrays) {
            pairs.add(new PairSumArray(Arrays.stream(ints).sum(), ints));
        }
        logger.info("Calculating in one thread ended. Time: " + LocalDateTime.now());
        return pairs;
    }
}
