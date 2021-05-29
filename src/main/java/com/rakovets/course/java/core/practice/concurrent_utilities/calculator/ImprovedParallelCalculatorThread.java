package com.rakovets.course.java.core.practice.concurrent_utilities.calculator;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class ImprovedParallelCalculatorThread implements Callable<Map<Integer[], Long>> {
    private final List<Integer[]> list;

    public ImprovedParallelCalculatorThread(List<Integer[]> arraysList) {
        this.list = arraysList;
    }

    @Override
    public Map<Integer[], Long> call() {
        System.out.println(LocalDateTime.now() + " " + Thread.currentThread().getName() + " Start");
        System.out.println(LocalDateTime.now() + " " + Thread.currentThread().getName() + " End");
        return ImprovedParallelCalculator.getArraysAndArraysElementSum(this.list);
    }
}
