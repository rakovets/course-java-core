package com.rakovets.course.java.core.practice.concurrent.utilities.improved_parallel_calculator.service;

import com.rakovets.course.java.core.practice.concurrent.utilities.improved_parallel_calculator.model.ListOfArrays;

public class ExecutionTimeService {

    public long getExecutionTime(int numberOfThreads) {
        long startTime = System.nanoTime();
        ImprovedParallelCalculatorService.arraysAndSum(ListOfArrays.listOfArrays, numberOfThreads);
        return System.nanoTime() - startTime;
    }
}
