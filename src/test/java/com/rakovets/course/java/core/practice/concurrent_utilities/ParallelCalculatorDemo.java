package com.rakovets.course.java.core.practice.concurrent_utilities;

import com.rakovets.course.java.core.practice.concurrent_utilities.parallel_calculator.ParallelCalculator;
import com.rakovets.course.java.core.practice.concurrent_utilities.parallel_calculator.ParallelCalculatorThread;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.logging.Logger;

public class ParallelCalculatorDemo {
    public static final Logger logger = Logger.getLogger(ParallelCalculatorDemo.class.getName());
    public static void main(String[] args) {
        Queue<Integer[]> inputArray = new LinkedList<>();
        int numberOfThreads = 2;
        for (int i = 0; i < 10; i++) {
            Integer[] array = new Integer[1000000];
            for (int x = 0; x < array.length; x++) {
                array[x] = new Random().nextInt(300);
            }
            inputArray.add(array);
        }
        Map<Integer[], Integer> finalList = null;
        ParallelCalculator calculator = new ParallelCalculator(finalList);
       logger.info(LocalDateTime.now() + " threads start working");
        for(int i = 0; i < numberOfThreads; i++) {
            Thread thread = new Thread(new ParallelCalculatorThread(calculator, finalList, inputArray, numberOfThreads));
            thread.setName("Thread "+ i);
            thread.start();
        }
        logger.info(LocalDateTime.now() + " threads stop working");
        logger.info(finalList.toString());
    }
}
