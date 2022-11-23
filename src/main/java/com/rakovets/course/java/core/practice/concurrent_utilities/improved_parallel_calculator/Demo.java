package com.rakovets.course.java.core.practice.concurrent_utilities.improved_parallel_calculator;

import java.time.Duration;
import java.time.Instant;
import java.util.*;
import java.util.concurrent.Phaser;
import java.util.logging.Logger;

/**
 * MAX_SIZE_OF_ARRAY = 10 is the best option to show that both LinkedHashMaps are equal.
 * But with such size of array no any sense to use several threads
 * The bigger array, the higher effect of usage of several threads.
 * MAX_SIZE_OF_ARRAY = 1_000_000 show the advantages of several threads
 * We also have significant effect when NUMBER_OF_ARRAY_IN_LIST high, for example 1_000_000
 * NUMBER_OF_THREADS = 2 gives the best speed, in 2 times faster, then by 1 thread
 * NUMBER_OF_THREADS = 5 gives the middle speed
 * NUMBER_OF_THREADS = 10 gives the worst speed, sometimes even slower than 1 thread
 */

public class Demo {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Demo.class.getName());
        final int MIN_VALUE_IN_ARRAY = 1;
        final int MAX_VALUE_IN_ARRAY = 300;
        final int MIN_SIZE_OF_ARRAY = 1;
        final int MAX_SIZE_OF_ARRAY = 10;
        final int NUMBER_OF_ARRAY_IN_LIST = 10;
        final int NUMBER_OF_THREADS = 2;

        Phaser phaser = new Phaser(1);
        ArrayListCreator creator = new ArrayListCreator();
        List<int[]> intArrayList = new ArrayList<>();
        try {
            intArrayList = creator.createRandomIntArrayList(MIN_VALUE_IN_ARRAY, MAX_VALUE_IN_ARRAY, MIN_SIZE_OF_ARRAY, MAX_SIZE_OF_ARRAY, NUMBER_OF_ARRAY_IN_LIST
            );
        } catch (NegativeArraySizeException e) {
            e.getMessage();
        }
        ArrayListImprovedCalculator calculator = new ArrayListImprovedCalculator(phaser);
        Map<int[], Integer> mapOfIntArraysAndTheirsSum = new LinkedHashMap<>();
        Instant start1 = Instant.now();
        try {
            mapOfIntArraysAndTheirsSum = calculator.getMapOfIntArrayAndTheirsSum(intArrayList);
        } catch (NullPointerException e) {
            e.getMessage();
        }
        Instant end1 = Instant.now();
        mapOfIntArraysAndTheirsSum.entrySet().stream()
                .forEach(x -> System.out.println(x.getValue() + " " + Arrays.toString(x.getKey())));
        System.out.println();
        Map<int[], Integer> mapMadeByThreads = new LinkedHashMap<>();
        Instant start2 = Instant.now();
        try {
            mapMadeByThreads = calculator.getMapOfIntArrayAndTheirsSumMadeByThreads(intArrayList, NUMBER_OF_THREADS);
        } catch (NullPointerException e) {
            e.getMessage();
        }
        Instant end2 = Instant.now();
        phaser.arriveAndAwaitAdvance();
        phaser.arriveAndDeregister();
        mapMadeByThreads.entrySet().stream()
                .forEach(x -> System.out.println(x.getValue() + " " + Arrays.toString(x.getKey())));
        logger.info("Работа одного потока закончилась через " + Duration.between(start1, end1));
        logger.info("Работа " + NUMBER_OF_THREADS + " потоков закончилась через " + Duration.between(start2, end2));
    }
}
