package com.rakovets.course.java.core.practice.concurrent_utilities;

import java.util.ArrayList;
import java.util.List;

public class CalculatorThread implements Runnable {
    ImprovedParallelCalculator calculator = new ImprovedParallelCalculator();
    List<int[]> list = new ArrayList<>();

    @Override
    public void run() {
        list.add(calculator.createListOfArray());
    }
}
