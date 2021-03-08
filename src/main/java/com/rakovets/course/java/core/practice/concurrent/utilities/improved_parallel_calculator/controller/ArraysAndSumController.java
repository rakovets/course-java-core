package com.rakovets.course.java.core.practice.concurrent.utilities.improved_parallel_calculator.controller;

import com.rakovets.course.java.core.practice.concurrent.utilities.improved_parallel_calculator.service.ImprovedParallelCalculatorService;
import com.rakovets.course.java.core.practice.concurrent.utilities.improved_parallel_calculator.model.ListOfArrays;
import com.rakovets.course.java.core.practice.concurrent.utilities.improved_parallel_calculator.view.ArraysAndSumView;

public class ArraysAndSumController {
    public static int numberOfThreads;
    private static final ListOfArrays listOfArrays;

    static {

        numberOfThreads = 2;
        listOfArrays = new ListOfArrays();

    }

    public void start() {
        ArraysAndSumView arraysAndSumView = new ArraysAndSumView();
        arraysAndSumView.arraysAndSumView(
                ImprovedParallelCalculatorService.arraysAndSum(listOfArrays.getList(), numberOfThreads));
    }
}
