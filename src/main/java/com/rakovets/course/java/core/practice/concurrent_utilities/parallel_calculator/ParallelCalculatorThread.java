package com.rakovets.course.java.core.practice.concurrent_utilities.parallel_calculator;

import com.rakovets.course.java.core.practice.concurrent_utilities.producer_consumer.Producer;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

public class ParallelCalculatorThread implements Runnable{
    private final Logger logger = Logger.getLogger(ParallelCalculatorThread.class.getName());
    private final ParallelCalculator calculator;
    private final Map<Integer[], Integer> finalList;
    private final ReentrantLock locker = new ReentrantLock();
    private final Queue<Integer[]> arrays;
    private final int threadNumbers;

    public ParallelCalculatorThread (ParallelCalculator calculator, Map<Integer[], Integer> finalList, Queue<Integer[]> arrays, int threadNumbers) {
        this.calculator = calculator;
        this.finalList = finalList;
        this.arrays = arrays;
        this.threadNumbers = threadNumbers;
    }

    public void run() {
        logger.info(Thread.currentThread().getName() + " is working");
        calculator.multiThreadCalculation(arrays, threadNumbers);
    }

    public Map<Integer[], Integer> getFinalList() {
        return finalList;
    }
}
