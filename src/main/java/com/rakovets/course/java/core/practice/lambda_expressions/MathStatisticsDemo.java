package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.Collection;

public class MathStatisticsDemo {
    public static void main(String[] args) {
        MathStatistics m = new MathStatistics();
        System.out.println(m.generateRandomNumbers(3, 0, 15));

        Collection<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(4);
        arr.add(0);
        arr.add(0);

        System.out.println(m.countMatches(arr, 10));

    }
}
