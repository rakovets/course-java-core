package com.rakovets.course.java.core.practice.concurrent.utilities;

import java.util.*;

public class ImprovedCalculatorDemo {
    public static void main(String[] args) {
        List<int[]> list = new ArrayList<>();

        for (int x = 0; x < 10; x++) {
            list.add(new Random().ints(new Random().nextInt(1000000), 1, 301).toArray());
        }
        ImprovedParallelCalculator.fewThreads(list, 1);
        ImprovedParallelCalculator.fewThreads(list, 2);
        ImprovedParallelCalculator.fewThreads(list, 5);
        ImprovedParallelCalculator.fewThreads(list, 10);
    }
}
