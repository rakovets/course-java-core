package com.rakovets.course.java.core.practice.concurrent.utilities;

import com.rakovets.course.java.core.practice.concurrent.utilities.improved_parallel_calculator.ImprovedParallelCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ImprovedParallelCalculatorDemo {
    public static void main(String[] args) {
        List<int[]> data = new ArrayList<>();

        for (int x = 0; x < 10; x++) {
            data.add(new Random().ints(new Random().nextInt(1000000), 1, 301).toArray());
        }
        ImprovedParallelCalculator.calculateInThreads(data, 1);
        ImprovedParallelCalculator.calculateInThreads(data, 2);
        ImprovedParallelCalculator.calculateInThreads(data, 5);
        ImprovedParallelCalculator.calculateInThreads(data, 10);
    }
}
