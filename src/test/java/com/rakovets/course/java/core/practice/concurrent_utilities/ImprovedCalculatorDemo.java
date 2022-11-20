package com.rakovets.course.java.core.practice.concurrent_utilities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Logger;

public class ImprovedCalculatorDemo {
    public static final Logger logger = Logger.getLogger(ImprovedCalculatorDemo.class.getName());

    public static void main(String[] args) {
        ImprovedParallelCalculator calculator = new ImprovedParallelCalculator();
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int[] array = new int[new Random().nextInt(1000000)];
            for (int x = 0; x < array.length; x++) {
                array[x] = new Random().nextInt(300);
            }
            list.add(array);
        }
        logger.info("result" + calculator.getArrayAndSum(list));

        long start1 = System.currentTimeMillis();
        logger.info("result solution with 1 Thread " + calculator.test(list,1));
        long finish1 = System.currentTimeMillis();
        logger.info(String.valueOf(finish1 - start1));

        long start2 = System.currentTimeMillis();
        logger.info("result solution with 2 Thread " + calculator.test(list,2));
        long finish2 = System.currentTimeMillis();
        logger.info(String.valueOf(finish2 - start2));

        long start5 = System.currentTimeMillis();
        logger.info("result solution with 5 Thread " + calculator.test(list,5));
        long finish5 = System.currentTimeMillis();
        logger.info(String.valueOf(finish5 - start5));

        long start10 = System.currentTimeMillis();
        logger.info("result solution with 1 Thread " + calculator.test(list,10));
        long finish10 = System.currentTimeMillis();
        logger.info(String.valueOf(finish10 - start10));
    }
}
