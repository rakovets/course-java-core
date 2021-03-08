package com.rakovets.course.java.core.practice.concurrent.utilities.improved_parallel_calculator.view;

import com.rakovets.course.java.core.practice.concurrent.utilities.improved_parallel_calculator.service.ExecutionTimeService;

public class ExecutionTimeView {
    private static final ExecutionTimeService executionTimeService;

    static {

        executionTimeService = new ExecutionTimeService();

    }

    public void executionTimeView() {
        System.out.println("Calculation of sum in 1 thread took: " +
                executionTimeService.getExecutionTime(1) + " nanoseconds");
        System.out.println("Calculation of sum in 2 threads took: " +
                executionTimeService.getExecutionTime(2) + " nanoseconds");
        System.out.println("Calculation of sum in 5 threads took: " +
                executionTimeService.getExecutionTime(5) + " nanoseconds");
        System.out.println("Calculation of sum in 10 threads took: " +
                executionTimeService.getExecutionTime(10) + " nanoseconds");
    }
}
